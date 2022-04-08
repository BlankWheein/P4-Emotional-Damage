using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    class SymbolTable
    {
        public SymbolTable(RootSymbolTable root, SymbolTable? parent)
        {
            Parent = parent;
            Root = root;
        }

        public List<Symbol> Symbols { get; set; } = new();
        public SymbolTable? Parent { get; }
        public List<SymbolTable> Children { get; set; } = new();
        public RootSymbolTable Root { get; }
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
            Symbol? symbol = Symbols.FirstOrDefault(o => id == o.ID);
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
            if (LookUpHelper(symbol.ID) == null)
                Symbols.Add(symbol);
            else 
                Diagnostics.Add(new Exception(symbol.ToString()));
        }

        /// <summary>
        /// Inserts a symbol in a symbol table based on symbol attributes
        /// </summary>
        /// <param name="type"></param>
        /// <param name="id"></param>
        /// <param name="is_initialized"></param>
        public void Insert(SymbolType type, string id, bool is_initialized)
        {
            Symbol symbol = new() { ID = id, Type = type, IsInitialized = is_initialized };
            InsertHelper(symbol);

        }
   
        public void SetInitialized(string id)
        {
            Symbol? symbol = LookUp(id);
            if(symbol!=null)
                symbol.IsInitialized = true;

        }

    }
}
