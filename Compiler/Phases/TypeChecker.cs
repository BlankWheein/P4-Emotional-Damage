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
            //throw new NotImplementedException();
            return true;
        }

        
    }
}
