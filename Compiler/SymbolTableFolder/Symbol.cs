using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    class Symbol
    {
        public SymbolType Type { get; set; }
        public string ID { get; set; }
        public bool IsInitialized { get; set; }


    }
    public enum SymbolType
    {
        Int,
        Float
    }
}
