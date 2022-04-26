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
        internal List<string> SplitOnOperatorsExpr(string text) => text.Replace("(", "").Replace(")", "").Split(new string[] { "**", "*", "/", "+", "-", "sqrt", "\\\\", "%" }, StringSplitOptions.RemoveEmptyEntries).ToList();
        internal List<string> SplitOnOperatorsBexpr(string text) => text.Replace("(", "").Replace(")", "").Split(new string[] { ">=", "<=", ">", "<" , "==", "!=" }, StringSplitOptions.RemoveEmptyEntries).ToList();

        internal bool CheckNumDcl(EmotionalDamageParser.NumDclContext context)
        {
            SymbolType type;
            string numtype = context.numtype().GetText();
            try
            {
                type = (SymbolType)Enum.Parse(typeof(SymbolType), numtype[0].ToString().ToUpper() + numtype[1..^0]);
                return ExprHelper(context.expr().GetText(), type);
            } catch {
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
            bool left = ExprHelper(text[0], SymbolType.Float);
            bool right = ExprHelper(text[1], SymbolType.Float);
            if (left && !right || !left && right)
                isValid = false;
            
            return isValid;
        }
        private bool ExprHelper(string expr, SymbolType? type = null)
        {
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
                var pp = p.Split("[");
                p = pp[0];
                if (pp.Length == 3 && (Scope?.LookUp(p).Type & (SymbolType.Mint | SymbolType.Mfloat)) == 0)
                {
                    res = false;
                    Scope?.AddDiagnostic(new($"{p} was not of type Matrix"));
                        
                } else if (pp.Length == 2 && (Scope?.LookUp(p).Type & (SymbolType.Aint | SymbolType.Afloat)) == 0)
                {
                    res = false;
                    Scope?.AddDiagnostic(new($"{p} was not of type Array"));
                } else if (pp.Length == 0)
                    throw new Exception("What");
                else if (IsVariable.IsMatch(p))
                {
                    Symbol symbol;
                    if (p == "true" || p == "false")
                        symbol = new("NotSet", SymbolType.Int);
                    else
                        symbol = Scope.LookUp(p);
                    if (type == SymbolType.Int && (symbol?.Type & (SymbolType.Int | SymbolType.Bool | SymbolType.Mfloat | SymbolType.Mint)) == 0)
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int"));
                    }
                    else if (type == SymbolType.Float && (symbol?.Type & (SymbolType.Float | SymbolType.Int | SymbolType.Bool | SymbolType.Mint | SymbolType.Mfloat)) == 0)
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
                    else if (type == SymbolType.Float &&(!float.TryParse(p, out _) && !int.TryParse(p, out _)))
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
    }
}
