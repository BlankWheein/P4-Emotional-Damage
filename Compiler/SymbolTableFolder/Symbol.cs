using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class Symbol
    {
        public Symbol(string id, SymbolType type=SymbolType.Reserved, bool isInitialized=false, int row = 0, int col = 0)
        {
            Type = type;
            Id = id;
            IsInitialized = isInitialized;
            Row = row;
            Col = col;
        }

        public SymbolType Type { get; set; }
        public string Id { get; set; }
        public bool IsInitialized { get; set; }
        public int Row { get; }
        public int Col { get; }
    }
    public enum SymbolType
    {
        Int,
        Float,
        Reserved,
        Void,
        String,
        Mint,
        Mfloat,
        Bool,
        Func
    }
}
