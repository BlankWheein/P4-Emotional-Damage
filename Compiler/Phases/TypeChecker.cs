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


            return isValid;
        }
        private bool ExprHelper(string expr, SymbolType type)
        {
            var _out = SplitOnOperatorsExpr(expr);
            bool res = true;
            _out.ForEach(p =>
            {
                if (IsVariable.IsMatch(p))
                {
                    var symbol = Scope.LookUp(p);
                    if (type == SymbolType.Int && symbol.Type != SymbolType.Int)
                    {
                        res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int"));
                    }
                    else if (type == SymbolType.Float && symbol.Type != SymbolType.Float && symbol.Type != SymbolType.Int)
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
            return ExprHelper(ctx.expr().GetText(), Scope.LookUp(ctx.IDENTIFIER().GetText()).Type);
        }
    }
}
