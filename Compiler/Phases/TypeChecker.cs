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
        internal List<string> SplitOnOperators(string text)  => text.Replace("(", "").Replace(")", "").Split(new string[] { "**", "*", "/", "+", "-", "sqrt", "\\\\", "%" }, StringSplitOptions.RemoveEmptyEntries).ToList();

        internal bool CheckNumDcl(EmotionalDamageParser.NumDclContext context)
        {
            bool isValid = true;
            List<string> numberList = SplitOnOperators(context.expr().GetText());
            if (context.numtype().GetText() == "int")
            {
                foreach (string s in numberList)
                {
                    if (!double.TryParse(s, out _))
                    {
                        Symbol symbol = Scope.LookUp(s);
                        isValid &= symbol?.Type == SymbolType.Int;
                    }
                    else
                    {
                        isValid &= int.TryParse(s, out _);
                    }
                }
            }
            else if (context.numtype().GetText() == "float")
            {
                foreach (string s in numberList)
                {
                    if (!double.TryParse(s, out _))
                    {
                        Symbol symbol = Scope.LookUp(s);
                        isValid &= (symbol?.Type == SymbolType.Float||symbol?.Type==SymbolType.Int);
                    }
                    else
                    {
                        isValid &= float.TryParse(s, out _);
                    }
                }
            }
            return isValid;
        }

        public bool CheckNumAssignStmtContext(EmotionalDamageParser.NumAssignStmtContext ctx)
        {
            string id = ctx.IDENTIFIER().GetText();
            var _out = SplitOnOperators(ctx.expr().GetText());
            bool res = true;
            _out.ForEach(p =>
            {
                if (IsVariable.IsMatch(p))
                {
                    var symbol = Scope.LookUp(p);
                    if (Scope?.LookUp(id).Type == SymbolType.Int && symbol.Type != SymbolType.Int) { res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int")); }
                    else if (Scope?.LookUp(id).Type == SymbolType.Float && symbol.Type != SymbolType.Float && symbol.Type != SymbolType.Int) { res = false; Scope.AddDiagnostic(new($"'{p}' was not of type int or float")); }
                } else if (IsDigit.IsMatch(p))
                {
                    if (Scope?.LookUp(id).Type == SymbolType.Int && !int.TryParse(p, out _)) { res = false; Scope.AddDiagnostic(new($"'{p}' could not be converted to an int")); }
                    else if (Scope?.LookUp(id).Type == SymbolType.Float && (!float.TryParse(p, out _) && !int.TryParse(p, out _) )) { res = false; Scope.AddDiagnostic(new($"'{p}' could not be converted to an int or float")); }
                }
            });
            return res;
        }
    }
}
