using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
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
        public ScopeVisitorV2 ScopeVisitorV2 { get; }
        internal List<string> SplitOnOperators(string text)  => text.Split(new string[] { "**", "*", "/", "+", "-", "sqrt", "\\\\", "%" }, StringSplitOptions.RemoveEmptyEntries).ToList();

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
    }
}
