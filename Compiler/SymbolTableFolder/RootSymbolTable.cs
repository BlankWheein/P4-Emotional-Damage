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
        public SymbolTable Root { get; set; }
        internal SymbolTable Current { get; set; }
        public List<Symbol> Symbols { get => Current.Symbols; }
        public List<Symbol> ReservedSymbols { get; } = new() { new Symbol("hej") };
        public RootSymbolTable(bool Testing=false)
        {
            Root = new SymbolTable(null, this, _testing, type: "Global");
            Current = Root;
            _testing = Testing;
        }

        public List<Exception> Diagnostics { get; set; } = new();
        /// <summary>
        /// Creating a new symbol table and entering its scope
        /// </summary>
        public void Allocate(string Type = "NotDefined")
        {
            SymbolTable symbolTable = new(Current, this, _testing, type: Type);
            Current.Children.Add(symbolTable);
            Current = symbolTable;
        }
        /// <summary>
        /// Exit the current scope
        /// </summary>
        public void ExitScope()
        {
            if (_testing)
                Current.Dispose();
            Current = Current?.Parent;
        }
        // Decorator stuff
        public void Insert(Symbol s) => Current?.Insert(s);
        public void Insert(SymbolType type, string id, bool isInitialized = true, int row = 0, int col = 0) => Current?.Insert(type, id, isInitialized, row, col);
        public Symbol? LookUp(string id) => Current?.LookUp(id);
        public Symbol? LookUpExsting(string id) => Current?.LookUpExsting(id);
        public void SetInitialized(string id) => Current.SetInitialized(id);

        internal void AddDiagnostic(Exception exception)
        {
            Diagnostics.Add(exception);
        }
        public override bool Equals(object? obj)
        {
            return Root.Equals((obj as RootSymbolTable)?.Root);
        }
        public override string ToString()
        {
            return Root.ToString();
        }
    }
}
