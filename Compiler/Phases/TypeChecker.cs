﻿using Compiler.Phases.Exceptions;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static EmotionalDamageParser;

namespace Compiler.Phases
{
    public class TypeChecker
    {
        public TypeChecker(ScopeVisitorV2 scopeVisitorV2)
        {
            ScopeVisitorV2 = scopeVisitorV2;
        }

        public RootSymbolTable Scope { get => ScopeVisitorV2.Scope; }
        public ScopeVisitorV2 ScopeVisitorV2 { get; }
        internal List<string> SplitOnOperatorsExpr(string text) => text.Split(new string[] { "**", "*", "/", "+", "-", "sqrt", "%" }, StringSplitOptions.RemoveEmptyEntries).ToList();
        internal List<string> SplitOnOperatorsBexpr(string text) => text.Split(new string[] { ">=", "<=", ">", "<", "==", "!=" }, StringSplitOptions.RemoveEmptyEntries).ToList();
        private Symbol? GetFunctionReturnType(string expr) => Scope.LookUpSilent(expr.Split('(')[0]);
        private List<string> GetFunctionParameters(string expr) => expr.Split('(')[1].Replace(")", "").Split(",").ToList();
        public bool CheckNumAssignStmtContext(NumAssignStmtContext ctx) => ExprHelper(ctx.expr().GetText(), Scope.LookUp(ctx.IDENTIFIER().GetText()));



        public bool CheckBexpr(IfstmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            if (bexpr == "true" || bexpr == "false") return true;
            return IsValidBexpr(bexpr);
        }
        public bool CheckBexpr(ElifstmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            if (bexpr == "true" || bexpr == "false") return true;
            return IsValidBexpr(bexpr);
        }

        internal bool CheckNumDcl(NumDclContext context)
        {
            SymbolType type;
            string numtype = context.numtype().GetText();
            try
            {
                type = (SymbolType)Enum.Parse(typeof(SymbolType), numtype[0].ToString().ToUpper() + numtype[1..^0]);
                return ExprHelper(context.expr().GetText(), new Symbol("Constant", type));
            }
            catch (Exception ex)
            {
                Scope.AddDiagnostic(new($"{numtype} could not be parsed to a type"));
                return false;
            }
        }
        public bool IsValidBexpr(string bexpr)
        {
            var _out = SplitOnOperatorsBexpr(bexpr);
            if (_out.Count != 2) { return false; }
            string RightAsString = _out[1];
            Symbol? left = Scope.LookUp(_out[0]);
            Symbol? right;
            if (RightAsString == "true" || RightAsString == "false")
                right = new("Constant", SymbolType.Bool);
            else if (int.TryParse(RightAsString, out _))
                right = new("Constant", SymbolType.Int);
            else
                right = Scope.LookUp(RightAsString);

            bool iscomp;
            if (right != null && left != null)
            {
                iscomp = left.Type.IsCompatible(right.Type);
                if (iscomp == false)
                    Scope.AddDiagnostic(new($"{left.Id} is not of same type as {right.Id}"));
            }
            else
                iscomp = false;
            if (iscomp == false)
                return false;
            if (left?.Type.IsBool() == true)
            {
                if (!bexpr.Contains("==") && !bexpr.Contains("!="))
                {
                    Scope.AddDiagnostic(new("Bool check needs to contain '==' OR '!='"));
                    iscomp = false;
                }
            }
            return iscomp;
        }
        internal bool CheckBoolDcl(EmotionalDamageParser.BoolDeclarationContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            if (bexpr == "true" || bexpr == "false") return true;
            bool isValid = IsValidBexpr(bexpr);
            return isValid;
        }
        internal void CheckForReturns(StmtsContext stmts, Symbol rettype)
        {
            switch (rettype?.Type.IsVoid())
            {
                case true when stmts?.stmt() != null && stmts?.stmt()?.LastOrDefault() is ReturnStmtContext ret:
                    Scope.AddDiagnostic(new($"Last Statement in void function {rettype.Id} was return"));
                    break;
                case true when stmts?.stmt() != null && stmts?.stmt()?.LastOrDefault() is not ReturnStmtContext ret:
                    break;

                case false when stmts?.stmt() != null && stmts?.stmt()?.LastOrDefault() is ReturnStmtContext ret:
                    break;
                case false when stmts?.stmt() != null && !(stmts?.stmt()?.LastOrDefault() is ReturnStmtContext ret):
                    Scope.AddDiagnostic(new($"Last Statement in function {rettype.Id} was not return"));
                    break;
                default:
                    throw new Exception();
            }
        }
        internal int CountReturnStmts(StmtsContext stmts)
        {
            int count = 0;
            foreach (var stmt in stmts.stmt())
                if (stmt != null && stmt is ReturnStmtContext)
                    count++;
            return count;
        }

        public List<string> GetExprVariableNoFunc(string _text)
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
       
        private bool ExprParser(string expr, SymbolType type)
        {
            bool res = true;
            res &= IsVariablesDeclared(expr, type);
            res &= CanParseValues(expr, type);
            res &= CanParseFunction(expr, type);
            res &= DoesVariableReturnCompatibleType(expr, type);
            res &= CanUseRowColLen(expr, type);
            return res;
        }

        public bool CanUseRowColLen(string expr, SymbolType type)
        {
            bool res = true;
            var _out = SplitOnOperatorsExpr(expr);
            foreach (var item in _out)
            {
                if (item.Contains(".row"))
                {
                    Symbol? sym = Scope.LookUpSilent(item.Split(".")[0]);
                    if (sym != null && !sym.Type.IsMatrix())
                    {
                        Scope.AddDiagnostic(new("cant use .row on non Matrix"));
                        res = false;
                    }
                }
                else if (item.Contains(".col"))
                {
                    Symbol? sym = Scope.LookUpSilent(item.Split(".")[0]);
                    if (sym != null && !sym.Type.IsMatrix())
                    {
                        Scope.AddDiagnostic(new("cant use .col on non Matrix"));
                        res = false;
                    }
                }
                else if (item.Contains(".len"))
                {
                    Symbol? sym = Scope.LookUpSilent(item.Split(".")[0]);
                    if (sym != null && !sym.Type.IsArray())
                    {
                        Scope.AddDiagnostic(new("cant use .len on non Array"));
                        res = false;
                    }
                }
            }
            return res;
        }

        public bool CanParseMultiDimensionalVariables(string expr, Symbol type)
        {
            bool res = true;
            var _out = SplitOnOperatorsExpr(expr);
            foreach (var item in _out)
            {
                Symbol? sym = Scope.LookUpSilent(item.Split("[")[0]);
                if (sym == null) continue;
                int count = item.Split("[").Length;
                if (count == 2 && sym.Type.IsArray())
                    if (int.TryParse(item.Split("[")[1].ToString().Replace("]", ""), out int x))
                        if (x >= sym.Row)
                            Scope.AddDiagnostic(new($"Index '{x}' was out of bounds '{sym.Id}'"));
                if (count == 3 && sym.Type.IsMatrix()) {
                    if (int.TryParse(item.Split("[")[1].ToString().Split("]")[0], out int x))
                    {
                        if (x >= sym.Row)
                            Scope.AddDiagnostic(new($"Index '{x}' was out of row bounds '{sym.Id}'"));
                    }
                    if (int.TryParse(item.Split("[")[2].ToString().Replace("]", ""), out int y))
                    {
                    if (y >= sym.Col)
                        Scope.AddDiagnostic(new($"Index '{y}' was out of col bounds '{sym.Id}'"));
                }
                }

                if (count == 2 && !sym.Type.IsArray())
                {
                    Scope.AddDiagnostic(new($"{sym.Id} was of type {sym.Type} and not of type A{type?.Type.ToString().ToLower()}"));
                    res = false;
                }
                else if (count == 3 && !sym.Type.IsMatrix())
                {
                    Scope.AddDiagnostic(new($"{sym.Id} was of type {sym.Type} and not of type M{type?.Type.ToString().ToLower()}"));
                    res = false;
                }
            }
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
                if (ParametersAsString.Count > 0 && ParametersAsString[0] != "" && ParametersAsString.Count != function?.Parameters?.Count)
                {
                    res = false;
                    Scope.AddDiagnostic(new CouldNotParseIntException($"Missing input parameters on func {_func}"));
                }
                if (function?.Parameters.Count > 0)
                for (int i = 0; i < function.Parameters.Count; i++)
                {
                    var fp = function.Parameters[i];
                    var fc = Scope.LookUpSilent(ParametersAsString[i]);
                    if (fc != null &&( !fc.Type.IsCompatible(fp.Type) || !(fp.Row == fc.Row && fp.Col == fc.Col)))
                    {
                        res = false;
                        Scope.AddDiagnostic(new CouldNotParseIntException($"Input parameter {fc} Does not have type {fp.Type}"));
                    }
                }
            }
            return res;
        }

        public bool DoesVariableReturnCompatibleType(string expr, SymbolType type)
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

        internal bool CheckBoolAssignStmtContext(BoolAssignStmtContext ctx)
        {
            string bexpr = ctx.bexpr().GetText();
            bool isValid;
            if (Scope.LookUpSilent(ctx.IDENTIFIER().GetText())?.Type.IsBool() == false)
            {
                Scope.AddDiagnostic(new TypeCheckerException($"{ctx.IDENTIFIER().GetText()} was not of type bool", ctx));
                return false;
            }
            if (bexpr == "true" || bexpr == "false") return true;
            isValid = IsValidBexpr(bexpr);
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
                    case SymbolType.Int when value != "." && !int.TryParse(value, out _):
                        res = false;
                        Scope.AddDiagnostic(new($"{value} Could not be parsed to int"));
                        break;
                    case SymbolType.Float when ( value != "." &&  !(float.TryParse(value, out _) || int.TryParse(value, out _))):
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

        public bool IsVariablesDeclared(string expr, SymbolType type)
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

        private bool ExprHelper(string expr, Symbol? sym = null)
        {
            bool res = true;
            if (sym == null) { return false; }
            res &= AreFuncsCompatible(expr, sym);
            res &= CanParseMultiDimensionalVariables(expr, sym);
            if (res == false) return false;
            return res && sym?.Type switch
            {
                SymbolType.Int => ExprParser(expr, SymbolType.Int),
                SymbolType.Aint => ExprParser(expr, SymbolType.Int),
                SymbolType.Mint => ExprParser(expr, SymbolType.Int),
                SymbolType.Float => ExprParser(expr, SymbolType.Float),
                SymbolType.Afloat => ExprParser(expr, SymbolType.Float),
                SymbolType.Mfloat => ExprParser(expr, SymbolType.Float),
                SymbolType.Bool => ExprParser(expr, SymbolType.Bool),
                SymbolType.String => ExprParser(expr, SymbolType.String),
                null => throw new NullReferenceException(),
                _ => throw new Exception(),
            };
        }

        private bool AreFuncsCompatible(string expr, Symbol? sym)
        {
            bool res = true;
            var _out = SplitOnOperatorsExpr(expr).Where(p => p.Contains("(")).ToList();
            foreach(var func in _out)
            {
                var ting = GetFunctionReturnType(func);
                if (ting != null && !ting.SameReturn(sym))
                {
                    Scope.AddDiagnostic(new($"{func} does not return type {sym?.Type}"));
                    res = false;
                }
            }
            return res;
        }

        
        internal bool CheckMatrixDcl(MatrixDeclarationContext context)
        {
            bool isValid = true;

            foreach (var inum in context.Inum())
            {
                if (int.TryParse(inum.GetText(), out int x))
                {
                    if (x < 1)
                    {
                        isValid = false;
                        Scope.AddDiagnostic(new TypeCheckerException($"Matrices can't have {x} elements!", context));
                    }
                }
                else
                {
                    isValid = false;
                    Scope.AddDiagnostic(new TypeCheckerException($"{inum.GetText()} is not an integer!", context));
                }
            }
            return isValid;
        }
        internal bool CheckArrayDcl(ArrayDeclarationContext context)
        {
            bool isValid = true;
            var number = context.Inum().GetText();

            if (int.TryParse(number, out int x))
            {
                if (x < 1)
                {
                    isValid = false;
                    Scope.AddDiagnostic(new TypeCheckerException($"Arrays can't have {x} elements!", context));
                }
            }
            else
            {
                isValid = false;
                Scope.AddDiagnostic(new TypeCheckerException($"{x} is not an integer!", context));
            }

            return isValid;
        }

        internal bool CheckArrayAssign(ArrayElementAssignStmtContext context)
        {
            bool res = true;
            Symbol? id = Scope.LookUp(context.IDENTIFIER()[0].GetText());
            Symbol? index = context.IDENTIFIER().Length == 2 ? Scope.LookUp(context.IDENTIFIER()[1].GetText()) : new Symbol("Constant", SymbolType.Int);
            if (id == null || index == null)
                res = false;
            if (index != null && index?.Type.IsInt() != true)
            {
                res = false;
                Scope.AddDiagnostic(new TypeCheckerException($"Index was not of type Int", context));
            }
            if (index?.Id == "Constant" && int.TryParse(context.Inum().GetText(), out int x))
            {
                if (x < 0)
                {
                    res = false;
                    Scope.AddDiagnostic(new TypeCheckerException("index cant be negative", context));
                }
                else if (x >= id?.Row)
                {
                    res = false;
                    Scope.AddDiagnostic(new TypeCheckerException($"{id.Id}[{id.Row}] does not have the dimension {x}", context));
                }
            }
            if (id != null && !id.Type.IsArray())
            {
                Scope.AddDiagnostic(new TypeCheckerException($"{id.Id} was not an array", context));
                return false;
            }
            if (context.expr() != null)
                res &= ExprHelper(context.expr().GetText(), id);
            else
                if (!id.Type.IsString())
            {
                res = false;
                Scope.AddDiagnostic(new TypeCheckerException($"Array {id.Id} was not of type string", context));
            }

            return res;
        }

        internal bool CheckMatrixAssign(MatrixElementAssignStmtContext context)
        {
            bool res = true;
            Symbol? id = Scope.LookUp(context.IDENTIFIER()[0].GetText()) ;
            if (id == null) return false;
            if (context.Inum().Length == 2)
            foreach (var s in context.Inum())
            {
                if (int.TryParse(s.GetText(), out int x) && x < 0)
                {
                    res = false;
                    Scope.AddDiagnostic(new TypeCheckerException("index cant be negative", context));
                }
            }
            if (context.IDENTIFIER().Length > 1)
            {
                for (int i = 1; i < context.IDENTIFIER().Length; i++)
                {
                    if (Scope.LookUpSilent(context.IDENTIFIER()[i].GetText())?.Type.IsInt() != true)
                    {
                        Scope.AddDiagnostic(new TypeCheckerException($"Index {Scope.LookUpSilent(context.IDENTIFIER()[i].GetText())?.Id} was not of type int", context));
                        res = false;
                    }
                }
            }
            if (context.Inum().Length == 2)
            {
                int row = int.Parse(context.Inum().First().GetText());
                int col = int.Parse(context.Inum().Last().GetText());
                if (row >= id.Row)
                {
                    Scope.AddDiagnostic(new TypeCheckerException($"{id.Id}[{id.Row}][{id.Col}] does not have the dimension [{row}][{col}]", context));
                    res = false;
                }
                if (col >= id.Col)
                {
                    Scope.AddDiagnostic(new TypeCheckerException($"{id.Id}[{id.Row}][{id.Col}] does not have the dimension [{row}][{col}]", context));
                    res = false;
                }
            }
            
            if (!id.Type.IsMatrix())
            {
                Scope.AddDiagnostic(new TypeCheckerException($"{id.Id} was not a matrix", context));
                return false;
            }
            if (context.expr() != null)
                res &= ExprHelper(context.expr().GetText(), id);
            else if (!id.Type.IsString())
                {
                    res = false;
                    Scope.AddDiagnostic(new TypeCheckerException($"Array {id.Id} was not of type string", context));
                }

            return res;
        }
    }
}
