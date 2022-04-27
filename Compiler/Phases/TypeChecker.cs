using Compiler.Phases.Exceptions;
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
        internal List<string> SplitOnOperatorsBexpr(string text) => text.Split(new string[] { ">=", "<=", ">", "<", "==", "!=" }, StringSplitOptions.RemoveEmptyEntries).ToList();

        public bool CheckBexpr(EmotionalDamageParser.IfstmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            bool isValid = true;
            if (bexpr == "true" || bexpr == "false") return isValid;
            var text = SplitOnOperatorsBexpr(bexpr);

            if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
                return true;
            else if ((Scope.LookUpSilent(text[0])?.Type != SymbolType.Bool && (text[0] == "true" || text[0] == "false")) && Scope.LookUpSilent(text[1])?.Type == SymbolType.Bool)
            {
                Scope.AddDiagnostic(new($"Cant use non-bool and bool"));
                return false;
            }
            else if (Scope.LookUpSilent(text[0])?.Type == SymbolType.Bool && Scope.LookUpSilent(text[1])?.Type != SymbolType.Bool && (text[0] == "true" || text[0] == "false"))
            {
                Scope.AddDiagnostic(new($"Cant use bool and non-bool"));
                return false;
            }

            bool left = ExprHelper(text[0], SymbolType.Bool);
            bool right = ExprHelper(text[1], SymbolType.Bool);
            
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }
        public bool CheckBexpr(EmotionalDamageParser.ElifstmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
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

            bool left = ExprHelper(text[0], SymbolType.Bool);
            bool right = ExprHelper(text[1], SymbolType.Bool);

            
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }



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

        internal bool CheckBoolDcl(EmotionalDamageParser.BoolDeclarationContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            if (bexpr == "true" || bexpr == "false") return true;
            var text = SplitOnOperatorsBexpr(bexpr);
            bool isValid = true;
            bool left = ExprHelper(text[0], SymbolType.Bool);
            bool right = ExprHelper(text[1], SymbolType.Bool);
            bool iscomp = GetExprType(text[0]).IsCompatible(GetExprType(text[1])) == false;
            if (iscomp)
            {
                Scope.AddDiagnostic(new($"Left and right hand side of {bexpr} is not compatible"));
                isValid = false;
            }
            

            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }
        List<string> GetExprVariableNoFunc(string _text)
        {
            List<string> _items = new();
            foreach (var _outvar in SplitOnOperatorsExpr(_text))
            {
                var text = "";
                List<string> items = new();
                foreach (var item in _outvar)
                {
                    if (char.IsLetter(item) || (text.Length > 0 && char.IsDigit(item)))
                        text += item;
                    else
                        if (text != "")
                    {
                        items.Add(text);
                        text = "";
                    }
                }
                if (text != "")
                {
                    items.Add(text);
                }
                if (items.Count == 1)
                    _items.Add(items[0]);
            }
            return _items;
        }
        private SymbolType GetExprType(string text)
        {

            var symbols = GetExprVariableNoFunc(text);
            var values = GetValuesFromExpr(text);
            if (symbols.Count == 0 && values.Count == 0)
            {
                Symbol? sym = Scope.LookUpSilent(text);
                if (sym != null)
                    return sym.Type;
                return SymbolType.NotDefined;
            }
            bool res = true;
            foreach(var s in symbols)
            {
                Symbol? sym = Scope.LookUpSilent(s);
                if (sym != null)
                    res &= SymbolType.Int.IsCompatible(sym.Type) == true;
            }
            Console.WriteLine();
            return SymbolType.Int;
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
       
        private bool ExprParser(string expr, SymbolType type)
        {
            bool res = true;
            res &= IsVariablesDeclared(expr, type);
            res &= CanParseValues(expr, type);
            res &= CanParseFunction(expr, type);
            res &= DoesVariableReturnCompatibleType(expr, type);
            //res &= CanParseArrayValues(expr, type);
            //res &= CanParseMatrixValues(expr, type);
            return res;
        }
        private bool CanParseFunction(string expr, SymbolType type)
        {
            var _out = SplitOnOperatorsExpr(expr).ToList();
            bool res = true;

            foreach (var _func in _out.Where(f => f.Contains('(')))
            {
                Symbol? function = GetFunctionReturnType(_func);
                if (function?.IsFunc != true)
                    continue;
                List<string> ParametersAsString = GetFunctionParameters(_func);
                if (!function.Type.IsCompatible(type))
                {
                    res = false;
                    Scope.AddDiagnostic(new CouldNotParseIntException($"{_func} does not return {type}"));
                }
                if (ParametersAsString.Count != function?.Parameters?.Count)
                {
                    res = false;
                    Scope.AddDiagnostic(new CouldNotParseIntException($"Missing input parameters on func {_func}"));
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

        private bool DoesVariableReturnCompatibleType(string expr, SymbolType type)
        {
            bool res = true;
            List<Symbol?> symbols = new();
            List<string> symbolsasstring = GetExprVariableNoFunc(expr);
            foreach (var s in symbolsasstring)
                symbols.Add(Scope?.LookUpSilent(s));

            foreach (var item in symbols)
            {
                if (item?.Type.IsCompatible(type) == false && type != SymbolType.Bool)
                {
                    res = false;
                    Scope.AddDiagnostic(new($"{item?.Type}: {item?.Id} is not compatible with {type}"));
                }
            }
            return res;
        }

        internal bool CheckBoolAssignStmtContext(EmotionalDamageParser.BoolAssignStmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            bool isValid = true;
            if (Scope.LookUpSilent(ctx.IDENTIFIER().GetText())?.Type.IsBool() == false)
            {
                Scope.AddDiagnostic(new($"{ctx.IDENTIFIER().GetText()} was not of type bool"));
                return false;
            }
            if (bexpr == "true" || bexpr == "false") return true;
            var text = SplitOnOperatorsBexpr(bexpr);
            if ((text[0] == "true" || text[0] == "false") && !(text[1] == "true" || text[1] == "false" || Scope.LookUpSilent(text[1])?.Type.IsBool() == true))
            {
                Scope.AddDiagnostic(new($"Bool/Int Mismatch"));
                return false;
            }
            if ((text[1] == "true" || text[1] == "false") && !(text[0] == "true" || text[0] == "false" || Scope.LookUpSilent(text[0])?.Type.IsBool() == true))
            {
                Scope.AddDiagnostic(new($"Int/Bool Mismatch"));
                return false;
            }
            bool left = ExprHelper(text[0], SymbolType.Bool);
            bool right = ExprHelper(text[1], SymbolType.Bool);
            
            if (left && !right || !left && right)
                isValid = false;

            return isValid;
        }
        List<string> GetValuesFromExpr(string expr)
        {
            List<string> items = new();
            var text = "";
            foreach (var item in expr)
            {
                if (char.IsDigit(item) || item == '.')
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
            return items;
        }
        private bool CanParseValues(string expr, SymbolType type)
        {
            bool res = true;
            var items = GetValuesFromExpr(expr);
            foreach (var value in items)
                switch (type)
                {
                    case SymbolType.Int when !int.TryParse(value, out _):
                        res = false;
                        Scope.AddDiagnostic(new($"{value} Could not be parsed to int"));
                        break;
                    case SymbolType.Float when (!(float.TryParse(value, out _) || int.TryParse(value, out _))):
                        res = false;
                        Scope.AddDiagnostic(new($"{value} Could not be parsed to float"));
                        break;
                    case SymbolType.Bool when (!(bool.TryParse(value, out _) || float.TryParse(value, out _) || int.TryParse(value, out _))):
                        res = false;
                        Scope.AddDiagnostic(new($"{value} Could not be parsed to bool"));
                        break;
                    case SymbolType.String:
                        break;
                }
            return res;
        }

        private bool IsVariablesDeclared(string expr, SymbolType type)
        {
            bool res = true;
            var items = GetExprVariableNoFunc(expr);
            foreach (var dcl in items)
                if (Scope.LookUpSilent(dcl) == null && dcl != "true" && dcl != "false" && dcl != "sqrt")
                {
                    Scope.AddDiagnostic(new($"{dcl} was not defined3"));
                    res &= false;
                }
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
