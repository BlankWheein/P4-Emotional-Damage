using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    internal sealed class SymbolTable : IDisposable
    {
        private readonly bool _testing;
        public SymbolTable(SymbolTable? parent, RootSymbolTable roottable, bool Testing=false)
        {
            Parent = parent;
            _testing = Testing;
            Root = parent?.Root;
            Diagnostics = roottable.Diagnostics;
            ReservedSymbols = roottable.ReservedSymbols;
        }
        public List<Symbol> ReservedSymbols { get; }
        public List<Symbol> Symbols { get; set; } = new();
        public SymbolTable? Parent { get; set; }
        public List<SymbolTable> Children { get; set; } = new();
        public RootSymbolTable? Root { get; set; }
        public List<Exception> Diagnostics { get; set; }

        /// <summary>
        /// Look for a symbol
        /// </summary>
        /// <param name="id"></param>
        /// <returns>Symbol if found, else null</returns>
        public Symbol? LookUp(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            if (symbol == null)
                Diagnostics.Add(new Exception(id));
            return symbol;
        }

        public Symbol? LookUpExsting(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            if (symbol != null)
                Diagnostics.Add(new Exception(id + "already exsits"));
            return symbol;
        }
        /// <summary>
        /// To lookup <paramref name="id"/> in a symbol table. If it cannot be found it will look in the parent table.
        /// </summary>
        /// <param name="id"></param>
        /// <returns>Symbol if found, else null</returns>
        private Symbol? LookUpHelper(string id)
        {
            Symbol? symbol = Symbols.FirstOrDefault(o => id == o.Id);
            if (symbol == null)
                return Parent?.LookUpHelper(id);
            return symbol;
        }

        /// <summary>
        /// Inserts a symbol in a symbol table based on symbol attributes
        /// </summary>
        /// <param name="type"></param>
        /// <param name="id"></param>
        /// <param name="is_initialized"></param>
        public void Insert(SymbolType type, string id, bool is_initialized, int row, int col)
        {
            Symbol symbol = new(id, type, is_initialized, row, col);
            Insert(symbol);
        }
   
        /// <summary>
        /// Inserts a symbol in a symbol table
        /// </summary>
        /// <param name="symbol"></param>
        public void Insert(Symbol symbol)
        {
            if (ReservedSymbols.All(o=>o.Id!=symbol.Id) && LookUpHelper(symbol.Id) == null)
                Symbols.Add(symbol);
            else 
                Diagnostics.Add(new Exception(symbol?.ToString()));
        }

        /// <summary>
        /// Set a symbol with id <paramref name="id"/> to initialized
        /// </summary>
        /// <param name="id"></param>
        public void SetInitialized(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            if (symbol != null)
                symbol.IsInitialized = true;
            else
                Diagnostics.Add(new Exception(id));
        }

        public void Dispose()
        {
            Symbols.Clear();

        }
    }
}
