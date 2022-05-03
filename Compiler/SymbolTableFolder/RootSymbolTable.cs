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
        public List<Symbol> ReservedContains { get; } = new() { new("sqrt") };
        public List<Symbol> ReservedSymbols { get; } = new() { new("true"), new("false") };
        public RootSymbolTable(bool Testing=false)
        {
            Root = new SymbolTable(null, this, _testing, type: "Global");
            Current = Root;
            _testing = Testing;
        }

        public List<Exception> Diagnostics { get; set; } = new();
        public List<Exception> Warnings { get; set; } = new();
        /// <summary>
        /// Creating a new symbol table and entering its scope
        /// </summary>
        public void Allocate(string Type = "NotDefined")
        {
            SymbolTable symbolTable = new(Current, this, _testing, type: Type);
            Current.Children.Add(symbolTable);
            Current = symbolTable;
        }
        internal void NextScope()
        {
            int CurrentIndex = Current.CurrentScope ?? throw new NullReferenceException();
            Current = Current.Children[CurrentIndex];
        }
        public void ExitScopeCodeGen()
        {
            Current.CurrentScope = Current.CurrentScope + 1;
            Current = Current?.Parent;
            
        }
        /// <summary>
        /// Exit the current scope
        /// </summary>
        public void ExitScope()
        {
            Current = Current?.Parent;
        }
        // Decorator stuff
        public void Insert(Symbol s) => Current?.Insert(s);
        public void Insert(SymbolType type, string id, int row = 0, int col = 0, bool? isfunc = false, List<Symbol>? parameters = null) => Current?.Insert(type, id, row, col, isfunc, parameters);
        public Symbol? LookUp(string id) => Current?.LookUp(id);
        public Symbol? LookUpSilent(string id) => Current?.LookUpSilent(id);
        public Symbol? LookUpExsting(string id) => Current?.LookUpExsting(id);

        internal void AddDiagnostic(Exception exception)
        {
            Diagnostics.Add(exception);
        }
        internal void AddWarning(Exception exception)
        {
            Warnings.Add(exception);
        }
        internal void AddWarning(string exception)
        {
            Warnings.Add(new Exception(exception));
        }
        public override bool Equals(object? obj)
        {
            return Root.ToString().Equals((obj as RootSymbolTable)?.Root.ToString());
        }
        public override string ToString()
        {
            return Root.ToString();
        }

        
    }
}
