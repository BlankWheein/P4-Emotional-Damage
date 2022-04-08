using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    class RootSymbolTable : SymbolTable
    {
        public RootSymbolTable()
        {
            Root = null;
            Parent = null;
            
        }
    }
}
