using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public class SymbolTable
    {
        public SymbolTable(SymbolTable? parent, RootSymbolTable roottable)
        {
            Parent = parent;
            Root = parent?.Root;
            Diagnostics = roottable?.Diagnostics;
        }

        public SymbolTable()
        {

        }
        
        public List<Symbol> ReservedKeywords { get; set; } = new() { new Symbol("hej")};
        public List<Symbol> Symbols { get; set; } = new();
        public SymbolTable? Parent { get; set; }
        public List<SymbolTable> Children { get; set; } = new();
        public RootSymbolTable? Root { get; set; }
        public List<Exception> Diagnostics { get; set; }   //for errors and warnings

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

        public void Insert(Symbol symbol)
        {
            InsertHelper(symbol);
        }
        /// <summary>
        /// Inserts a symbol in a symbol table
        /// </summary>
        /// <param name="symbol"></param>
        private void InsertHelper(Symbol symbol)
        {
            if (ReservedKeywords.All(o=>o.Id!=symbol.Id) && LookUpHelper(symbol.Id) == null)
                Symbols.Add(symbol);
            else 
                Diagnostics.Add(new Exception(symbol?.ToString()));
        }

        /// <summary>
        /// Inserts a symbol in a symbol table based on symbol attributes
        /// </summary>
        /// <param name="type"></param>
        /// <param name="id"></param>
        /// <param name="is_initialized"></param>
        public void Insert(SymbolType type, string id, bool is_initialized)
        {
            Symbol symbol = new(id, type, is_initialized);
            InsertHelper(symbol);
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
    }
}
