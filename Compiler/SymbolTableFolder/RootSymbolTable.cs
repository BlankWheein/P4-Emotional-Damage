using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class RootSymbolTable
    {
        private readonly bool _testing;
        private SymbolTable Root { get; set; }
        private SymbolTable Current { get; set; }
        public List<Symbol> Symbols { get => Current.Symbols; }
        public List<Symbol> ReservedSymbols { get; } = new() { new Symbol("hej") };
        public RootSymbolTable(bool Testing=false)
        {
            Root = new SymbolTable(null, this, _testing);
            Current = Root;
            _testing = Testing;
        }

        public List<Exception> Diagnostics { get; set; } = new();
        /// <summary>
        /// Creating a new symbol table and entering its scope
        /// </summary>
        public void Allocate()
        {
            SymbolTable symbolTable = new(Current, this, _testing);
            Current.Children.Add(symbolTable);
            Current = symbolTable;
        }
        /// <summary>
        /// Exit the current scope
        /// </summary>
        public void ExitScope()
        {
            if (!_testing)
                Current.Dispose();
            Current = Current?.Parent;
        }
        // Decorator stuff
        public void Insert(Symbol s) => Current?.Insert(s);
        public void Insert(SymbolType type, string id, bool isInitialized) => Current?.Insert(type, id, isInitialized); 
        public Symbol? LookUp(string id) => Current?.LookUp(id);
        public void SetInitialized(string id) => Current.SetInitialized(id);
        
    }
}
