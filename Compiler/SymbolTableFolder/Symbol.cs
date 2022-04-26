using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class Symbol
    {
        public Symbol(string id, SymbolType type=SymbolType.Reserved, int row = 0, int col = 0, bool? isfunc = null, List<Symbol>? parameters = null)
        {
            IsParameter = false;
            Type = type;
            Id = id;
            Row = row;
            Col = col;
            if (parameters == null)
                parameters = new();
            else
                IsFunc = true;
            if (isfunc != null)
                IsFunc = (bool)isfunc;
            Parameters = parameters;
            Parameters.ForEach(p =>
            {
                p.IsParameter = true;
            });
        }

        public SymbolType Type { get; set; }
        public string Id { get; set; }
        public int Row { get; }
        public int Col { get; }
        public bool IsParameter { get; set; }
        public bool IsFunc { get; }
        public List<Symbol> Parameters { get; }

        public override string ToString()
        {
            string parameters = "";
            Parameters.ForEach(p =>
            {
                parameters += p.ToString();
            });
            string text = $"{Type} {Id} {Row}:{Col} // {IsParameter}^{IsFunc} {parameters}";
            return text;
            if (Row == 0)
                return $"{Type} {Id}";
            else if (Row != 0 && Col == 0)
                return $"{Type} {Id}[{Row}]";
            else
                return $"{Type} {Id}[{Row}][{Col}]";
        }
        public override bool Equals(object? obj)
        {
            bool res = true;
            Symbol? table = obj as Symbol;
            if (table == null) return false;
            try
            {
            for (int i = 0; i < Parameters.Count; i++) 
                res &= Parameters[i].Equals(table.Parameters[i]);
            for (int i = 0; i < table.Parameters.Count; i++)
                res &= Parameters[i].Equals(table.Parameters[i]);
            }
            catch { return false; }
            res &= IsFunc == table.IsFunc;
            res &= table.ToString() == ToString();
            return res;
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
    }
}
