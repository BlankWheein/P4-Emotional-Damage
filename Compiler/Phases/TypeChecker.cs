﻿using Compiler.Phases.Exceptions;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Compiler.Phases
{
    public class TypeChecker
    {
        public TypeChecker(ScopeVisitorV2 scopeVisitorV2)
        {
            ScopeVisitorV2 = scopeVisitorV2;
        }

        public RootSymbolTable Scope { get => ScopeVisitorV2.Scope; }
        Regex IsVariable = new("[A-Za-z]");
        Regex IsDigit = new("[0-9]");
        public ScopeVisitorV2 ScopeVisitorV2 { get; }
        internal List<string> SplitOnOperatorsExpr(string text) => text.Split(new string[] { "**", "*", "/", "+", "-", "sqrt", "\\\\", "%" }, StringSplitOptions.RemoveEmptyEntries).ToList();

        public bool CheckBexpr(EmotionalDamageParser.IfstmtContext context)
        {
            string bexpr = context.bexpr().GetText();
            bool isValid = true;
            if (bexpr == "true" || bexpr == "false") return isValid;
            var text = SplitOnOperatorsBexpr(bexpr);

            if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
                return true;
            else if (Scope.LookUpSilent(text[0])?.Type != SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
            {
                Scope.AddDiagnostic(new($"Cant use non-bool and bool"));
                return false;
            }
            else if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type != SymbolType.Bool)
            {
                Scope.AddDiagnostic(new($"Cant use bool and non-bool"));
                return false;
            }

            bool left = ExprHelper(text[0], SymbolType.Float);
            bool right = ExprHelper(text[1], SymbolType.Float);
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }
        public bool CheckBexpr(EmotionalDamageParser.ElifstmtContext context)
        {
            string bexpr = context.bexpr().GetText();
            bool isValid = true;
            if (bexpr == "true" || bexpr == "false") return isValid;
            var text = SplitOnOperatorsBexpr(bexpr);
            if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
                return true;
            else if (Scope.LookUpSilent(text[0])?.Type != SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
            {
                Scope.AddDiagnostic(new($"Cant use non-bool and bool"));
                return false;
            }
            else if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type != SymbolType.Bool)
            {
                Scope.AddDiagnostic(new($"Cant use bool and non-bool"));
                return false;
            }

            bool left = ExprHelper(text[0], SymbolType.Float);
            bool right = ExprHelper(text[1], SymbolType.Float);
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }

        internal List<string> SplitOnOperatorsBexpr(string text) => text.Split(new string[] { ">=", "<=", ">", "<", "==", "!=" }, StringSplitOptions.RemoveEmptyEntries).ToList();


        internal bool CheckNumDcl(EmotionalDamageParser.NumDclContext context)
        {
            var text = context.GetText();
            SymbolType type;
            string numtype = context.numtype().GetText();
            try
            {
                type = (SymbolType)Enum.Parse(typeof(SymbolType), numtype[0].ToString().ToUpper() + numtype[1..^0]);
                bool res =  ExprHelper(context.expr().GetText(), type);
                return res;
            }
            catch
            {
                Scope.AddDiagnostic(new($"{numtype} could not be parsed to a type"));
                return false;
            }
        }

        internal bool CheckStringDcl(EmotionalDamageParser.StringDclContext context)
        {
            bool isValid = true;

            return isValid;
        }

        internal bool CheckBoolDcl(EmotionalDamageParser.BoolDeclarationContext context)
        {
            string bexpr = context.bexpr().GetText();
            if (bexpr == "true" || bexpr == "false") return true;
            var text = SplitOnOperatorsBexpr(bexpr);
            bool isValid = true;
            bool left = ExprHelper(text[0], SymbolType.Bool);
            bool right = ExprHelper(text[1], SymbolType.Bool);
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }
        private Symbol? GetFunctionReturnType(string expr)
        {
            string id = expr.Split('(')[0];
            return Scope.LookUpSilent(id);
        }
        private List<string> GetFunctionParameters(string expr)
        {
            return expr.Split('(')[1].Replace(")", "").Split(",").ToList();
        }
       
        private bool CanParseFunction(string expr, SymbolType type)
        {
            var _out = SplitOnOperatorsExpr(expr).ToList();
            bool res = true;

            foreach (var func in _out.Where(f => f.Contains('(')))
            {
                Symbol? function = GetFunctionReturnType(func);
                if (function?.IsFunc != true)
                    continue;
                List<string> ParametersAsString = GetFunctionParameters(func);
                if (!function.Type.IsCompatible(type))
                {
                    res = false;
                    Scope.AddDiagnostic(new CouldNotParseIntException($"{func} does not return {type}"));
                }
                if (ParametersAsString.Count != function?.Parameters?.Count)
                {
                    res = false;
                    Scope.AddDiagnostic(new CouldNotParseIntException($"Missing input parameters on func {func}"));
                }
                if (function?.Parameters.Count > 0)
                for (int i = 0; i < function.Parameters.Count; i++)
                {
                    var functionparameterinput = function.Parameters[i];
                    var functioncallparameterinput = Scope.LookUpSilent(ParametersAsString[i]);
                    if (functioncallparameterinput != null && !functioncallparameterinput.Type.IsCompatible(functionparameterinput.Type))
                    {
                        res = false;
                        Scope.AddDiagnostic(new CouldNotParseIntException($"Input parameter {functioncallparameterinput} Does not have type {functionparameterinput.Type}"));
                    }
                }
            }
            return res;
        }
        private bool ExprParser(string expr, SymbolType type)
        {
            bool res = true;
            res &= IsVariablesDeclared(expr, type);
            res &= CanParseValues(expr, type);
            res &= CanParseFunction(expr, type);
            //res &= CanParseMatrixValues(expr, type);
            //res &= CanParseArrayValues(expr, type);
            return res;
        }

        private bool CanParseValues(string expr, SymbolType type)
        {
            var _out = SplitOnOperatorsExpr(expr).ToList();
            bool res = true;
            List<string> items = new();
            var text = "";
            foreach (var item in expr)
            {
                if (char.IsDigit(item))
                {
                    text += item;
                }
                else
                    if (text != "")
                {
                    items.Add(text);
                    text = "";
                }
            }
            if (text != "")
                items.Add(text);
            foreach (var value in items)
            {
                if (type == SymbolType.Int && !int.TryParse(value, out _))
                {
                    res = false;
                    Scope.AddDiagnostic(new($"{value} Could not be parsed to int"));
                }
                if (type == SymbolType.Float && (!float.TryParse(value, out _) || !int.TryParse(value, out _)))
                {
                    res = false;
                    Scope.AddDiagnostic(new($"{value} Could not be parsed to float"));
                }
            }
            return res;
        }

        private bool IsVariablesDeclared(string expr, SymbolType type)
        {
            var _out = SplitOnOperatorsExpr(expr).ToList();
            bool res = true;
            List<string> items = new();
            var text = "";
            foreach (var item in expr)
            {
                if (char.IsLetter(item))
                {
                    text += item;
                }
                else
                    if (text != "")
                    {
                        items.Add(text);
                        text = "";
                    }
            }
            if (text != "")
                items.Add(text);
            foreach(var dcl in items)
                if (Scope.LookUp(dcl) == null)
                    res = false;
            return res;
        }

        private bool ExprHelper(string expr, SymbolType? type = null)
        {

            return type switch
            {
                SymbolType.Int => ExprParser(expr, SymbolType.Int),
                SymbolType.Float => ExprParser(expr, SymbolType.Float),
                SymbolType.Bool => ExprParser(expr, SymbolType.Bool),
                SymbolType.String => ExprParser(expr, SymbolType.String),
                _ => throw new Exception(),
            };
            
                

            if (type == null)
            {
                Scope.AddDiagnostic(new("Type was null"));
                return false;
            }

            var _out = SplitOnOperatorsExpr(expr);
            bool res = true;
            _out.ForEach(p =>
            {
                p = p.Replace("]", "");
                var MatrixArrCheck = p.Split("[");
                p = MatrixArrCheck[0];
                p = p.Replace(")", "");
                var FuncCheck = p.Split("(", StringSplitOptions.RemoveEmptyEntries);
                string p2 = FuncCheck[0];
                p2 = p2.Replace("(", "");
                if (IsVariable.IsMatch(FuncCheck[0]) && p2 != "true" && p2 != "false")
                {
                    var isfunc = Scope.LookUpSilent(FuncCheck[0]);
                    if (isfunc == null)
                    {
                        Scope.AddDiagnostic(new($"{FuncCheck[0]} was not defined"));
                        res = false;
                        return;
                    }
                    if (isfunc?.IsFunc == true && FuncCheck.Length > 0)
                    {
                        if (type == SymbolType.Int && (isfunc.Type & (SymbolType.Int | SymbolType.Aint | SymbolType.Mint)) == 0)
                        {
                            res = false;
                            Scope?.AddDiagnostic(new($"{p2} does not return int"));
                            return;
                        }
                        if (type == SymbolType.Float && (isfunc.Type & (SymbolType.Int | SymbolType.Aint | SymbolType.Mint | SymbolType.Float | SymbolType.Afloat | SymbolType.Mfloat)) == 0)
                        {
                            res = false;
                            Scope?.AddDiagnostic(new($"{p2} does not return Float or int"));
                            return;
                        }
                    }
                }
                if (MatrixArrCheck.Length == 3 && (Scope?.LookUp(p).Type & (SymbolType.Mint | SymbolType.Mfloat)) == 0)
                {
                    res = false;
                    Scope?.AddDiagnostic(new($"{p} was not of type Matrix"));

                }
                else if (MatrixArrCheck.Length == 2 && (Scope?.LookUp(p).Type & (SymbolType.Aint | SymbolType.Afloat)) == 0)
                {
                    res = false;
                    Scope?.AddDiagnostic(new($"{p} was not of type Array"));
                }
                else if (MatrixArrCheck.Length == 0)
                    throw new Exception("What");

                else if (IsVariable.IsMatch(p) && p != "true" && p != "false")
                {
                    Symbol? symbol;
                    symbol = Scope?.LookUp(p);
                    if ((type & (SymbolType.Int | SymbolType.Float | SymbolType.Afloat | SymbolType.Mfloat | SymbolType.Aint | SymbolType.Mint)) != 0 && symbol?.Type == SymbolType.Bool)
                    {
                        res = false; Scope.AddDiagnostic(new($"{p} was of type bool not number"));
                    }
                    else if (type == SymbolType.Int && (symbol?.Type & (SymbolType.Int | SymbolType.Bool | SymbolType.Mint | SymbolType.Aint)) == 0)
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int"));
                    }
                    else if (type == SymbolType.Float && (symbol?.Type & (SymbolType.Float | SymbolType.Int | SymbolType.Bool | SymbolType.Mint | SymbolType.Mfloat | SymbolType.Aint | SymbolType.Afloat)) == 0)
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int or float"));
                    }
                }
                else if (IsDigit.IsMatch(p))
                {
                    if (type == SymbolType.Int && !int.TryParse(p, out _))
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' could not be converted to an int"));
                    }
                    else if (type == SymbolType.Float && (!float.TryParse(p, out _) && !int.TryParse(p, out _)))
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' could not be converted to an int or float"));
                    }
                }
            });
            return res;
        }
        public bool CheckNumAssignStmtContext(EmotionalDamageParser.NumAssignStmtContext ctx)
        {
            return ExprHelper(ctx.expr().GetText(), Scope.LookUp(ctx.IDENTIFIER().GetText())?.Type);
        }
        public bool CheckMatrixValueGetter(EmotionalDamageParser.NumMatrixValueContext ctx)
        {
            bool res = true;
            string id = ctx.IDENTIFIER().First().GetText();
            var sym = Scope.LookUp(id);
            if (sym?.Type != SymbolType.Mint && sym?.Type != SymbolType.Mfloat)
            {
                Scope.AddDiagnostic(new($"{id} was not of type Matrix"));
                res = false;
            }
            return res;
        }
        public bool CheckArrayValueGetter(EmotionalDamageParser.ArrayDeclarationContext ctx)
        {
            bool res = true;
            string id = ctx.IDENTIFIER().GetText();
            var sym = Scope.LookUp(id);
            if (sym?.Type != SymbolType.Mint && sym?.Type != SymbolType.Mfloat)
            {
                Scope.AddDiagnostic(new($"{id} was not of type Matrix"));
                res = false;
            }
            return res;
        }


        internal bool CheckMatrixDcl(EmotionalDamageParser.MatrixDeclarationContext context)
        {
            bool isValid = true;

            foreach (var inum in context.Inum())
            {
                if (int.TryParse(inum.GetText(), out int x))
                {
                    if (x < 1)
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"Matrices can't have {x} elements!"));
                    }
                }
                else
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"{inum.GetText()} is not an integer!"));
                }
            }
            return isValid;
        }
        internal bool CheckArrayDcl(EmotionalDamageParser.ArrayDeclarationContext context)
        {
            bool isValid = true;
            var number = context.Inum().GetText();

            if (int.TryParse(number, out int x))
            {
                if (x < 1)
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"Arrays can't have {x} elements!"));
                }
            }
            else
            {
                isValid = false;
                Scope.Diagnostics.Add(new($"{x} is not an integer!"));
            }

            return isValid;
        }



        internal bool CheckFuncStmt(EmotionalDamageParser.FuncStmtContext context)
        {
            bool isValid = true;
            var func = Scope.LookUp(context.IDENTIFIER().First().GetText());
            List<Symbol> dclList = func?.Parameters;
            List<SymbolType> callList = new();


            //add symbols to callList if they can be found and are initialized in the scope
            for (int i = 1; i < context.IDENTIFIER().Length; i++)
            {
                Symbol s = Scope.LookUp(context.IDENTIFIER(i).GetText());
                if (s == null)
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"Variable {context.IDENTIFIER(i).GetText()} is not declared!"));

                }
                else { callList.Add(s.Type); }
            }

            //check if types match, and if the number of parameters match the function dcl
            if (dclList.Count == callList.Count)
            {
                for (int i = 0; i < dclList.Count; i++)
                {
                    isValid &= dclList[i].Type == callList[i];
                }
                if (isValid == false)
                {
                    Scope.Diagnostics.Add(new($"Function call parameter types don't match the function declaration!"));
                }
            }
            else if (dclList.Count != context.IDENTIFIER().Length - 1)
            {
                isValid = false;
                Scope.AddDiagnostic(new("Parameter count does not match the function declaration!"));
            }
            return isValid;
        }

        internal bool CheckArrayAssign(EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {

            bool isValid = true;
            Symbol array = Scope.LookUp(context.IDENTIFIER(0).GetText());

            if (context.Inum() != null)
            {
                var number = context.Inum().GetText();
                if (int.TryParse(number, out int x))
                {
                    if (x < 0)
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"Arrays can't have {x} elements!"));
                    }
                    else if (x > array.Row - 1)
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"Array index out of bounds!"));
                    }
                }
                else
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"{x} is not an integer!"));
                }
            }
            else
            {
                Symbol id = Scope.LookUp(context.IDENTIFIER(1).GetText());
                if (id == null)
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"{context.IDENTIFIER(1)} is not declared!"));
                }
                else if (id.Type != SymbolType.Int)
                {
                    isValid = false;
                    Scope.Diagnostics.Add(new($"{id.Id} is not an integer!"));
                }
            }

            // This does not work
            if (context.expr() != null)
            {
                isValid &= ExprHelper(context.expr().GetText(), array.Type);
            }
            return isValid;
        }

        internal bool CheckMatrixAssign(EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {
            bool isValid = true;
            Symbol matrix = Scope.LookUp(context.IDENTIFIER(0).GetText());

            if (context.Inum() != null)
            {
                for (int i = 0; i < context.Inum().Length; i++)
                {
                    var number = context.Inum(i).GetText();
                    if (int.TryParse(number, out int x))
                    {
                        if (x < 0)// denne del er nok ligegyldig for grammar, tillader ikke negative tal
                        {
                            isValid = false;
                            Scope.Diagnostics.Add(new($"Matrix dimenensions can't have {x} elements!"));
                        }
                        else if (x > matrix.Row - 1 || x > matrix.Col - 1)
                        {
                            isValid = false;
                            Scope.Diagnostics.Add(new($"Matrix index out of bounds!"));
                        }
                    }
                    else
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"{x} is not an integer!"));
                    }
                }
            }
            if (context.IDENTIFIER() != null)
            {
                for (int i = 1; i < context.IDENTIFIER().Length; i++)
                {
                    Symbol id = Scope.LookUp(context.IDENTIFIER(i).GetText());
                    if (id == null)
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"{context.IDENTIFIER(i)} is not declared!"));
                    }
                    else if (id?.Type != SymbolType.Int)
                    {
                        isValid = false;
                        Scope.Diagnostics.Add(new($"{id.Id} is not an integer!"));
                    }
                }
            }

            // This does not work
            if (context.expr() != null)
            {
                isValid &= ExprHelper(context.expr().GetText(), matrix.Type);
            }
            return isValid;
        }

        internal bool CheckMatrixTranspose(EmotionalDamageParser.TransposeMatrixStmtContext context)
        {
            bool isValid = true;
            Symbol symbol = Scope.LookUp(context.IDENTIFIER().GetText());
            if (symbol == null)
            {
                isValid = false;
                Scope.Diagnostics.Add(new($"{context.IDENTIFIER().GetText()} is not declared!"));
            }
            else if ((symbol.Type & (SymbolType.Mint | SymbolType.Mfloat)) == 0)//if the type is not matrix, enter the if statement
            {
                isValid = false;
                Scope.Diagnostics.Add(new($"{symbol.Id} is not a matrix!"));
            }
            return isValid;
        }
    }
}
