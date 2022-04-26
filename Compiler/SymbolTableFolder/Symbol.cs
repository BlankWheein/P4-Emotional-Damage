using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class Symbol
    {
        public Symbol(string id, SymbolType type=SymbolType.Reserved, bool isInitialized=false, int row = 0, int col = 0, bool isparameter = false)
        {
            Type = type;
            Id = id;
            IsInitialized = isInitialized;
            Row = row;
            Col = col;
            Isparameter = isparameter;
        }

        public SymbolType Type { get; set; }
        public string Id { get; set; }
        public bool IsInitialized { get; set; }
        public int Row { get; }
        public int Col { get; }
        public bool Isparameter { get; }

        public override string ToString()
        {
            if (Row == 0)
                return $"{Type} {Id}";
            else if (Row != 0 && Col == 0)
                return $"{Type} {Id}[{Row}]";
            else
                return $"{Type} {Id}[{Row}][{Col}]";
        }
        public override bool Equals(object? obj)
        {
            Symbol? table = obj as Symbol;
            if (table == null) return false;
            return table.ToString() == ToString();
        }
    }
    public enum SymbolType
    {
        Int = 1 << 0,
        Float = 1 << 1,
        Reserved = 1 << 2,
        Void = 1 << 3,
        String = 1 << 4,
        Mint = 1 << 5,
        Mfloat = 1 << 6,
        Aint = 1 << 7,
        Afloat = 1 << 8,
        Bool = 1 << 9,
        Func = 1 << 10,
    }
}
