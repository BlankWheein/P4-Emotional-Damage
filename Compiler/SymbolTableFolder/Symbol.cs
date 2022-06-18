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
        public bool IsValue { get; set; } = false;
        public bool IsParameter { get; set; }
        public bool IsFunc { get; }
        public bool IsUsed { get; set; } = false;
        public List<Symbol> Parameters { get; }

        public override string ToString()
        {
            string parameters = "";
            Parameters.ForEach(p =>
            {
                parameters += p.ToString();
            });
            string text = $"{Type} {Id} {Row}:{Col}?{IsValue} // {IsParameter}^{IsFunc} {parameters}";
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

        internal bool SameReturn(Symbol? sym)
        {
            return Type == sym?.Type && Col == sym.Col && Row == sym.Row;
        }
    }
    public static class SymbolTypeExtensions
    {
        public static bool IsInt(this SymbolType type)
        {
            return (type & (SymbolType.Int | SymbolType.Mint | SymbolType.Aint)) != 0;
        }
        public static bool IsFloat(this SymbolType type)
        {
            return (type & (SymbolType.Float | SymbolType.Mfloat | SymbolType.Afloat)) != 0;
        }
        public static bool IsBool(this SymbolType type)
        {
            return (type & (SymbolType.Bool)) != 0;
        }
        public static bool IsVoid(this SymbolType type)
        {
            return (type & (SymbolType.Void)) != 0;
        }
        public static bool IsString(this SymbolType type)
        {
            return (type & (SymbolType.String)) != 0;
        }
        public static bool IsArray(this SymbolType type)
        {
            return (type & (SymbolType.Aint | SymbolType.Afloat)) != 0;
        }
        public static bool IsMatrix(this SymbolType type)
        {
            return (type & (SymbolType.Mint | SymbolType.Mfloat)) != 0;
        }
        public static bool IsMatrixArray(this SymbolType type)
        {
            return IsMatrix(type) || IsArray(type);
        }

        public static bool IsCompatible(this SymbolType functionout, SymbolType variabletype)
        {
            if (variabletype.IsInt())
            {
                if (functionout.IsInt() || functionout.IsFloat())
                    return true;
                return false;
            }
            else if (variabletype.IsFloat())
            {
                if (functionout.IsInt() || functionout.IsFloat())
                    return true;
                return false;
            }
            if (variabletype.IsBool())
            {
                if (functionout.IsBool())
                    return true;
                return false;
            }
            if (variabletype.IsString())
            {
                if (functionout.IsString())
                    return true;
                return false;
            }
            if (variabletype == SymbolType.NotDefined || functionout == SymbolType.NotDefined)
            {
                return false;
            }
            throw new Exception();
            return false;
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
        NotDefined = 1 << 10,
    }
}
