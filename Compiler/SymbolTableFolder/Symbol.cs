using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class Symbol
    {
        public Symbol(string id, SymbolType type=SymbolType.Reserved, bool isInitialized=false)
        {
            Type = type;
            Id = id;
            IsInitialized = isInitialized;
            
        }

        public SymbolType Type { get; set; }
        public string Id { get; set; }
        public bool IsInitialized { get; set; }


    }
    public enum SymbolType
    {
        Int,
        Float,
        Reserved,
        Void,
        String,
        Bool
    }
}
