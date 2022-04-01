using System;
using System.Collections.Generic;
using System.Linq;

namespace TestCompiler.Steps
{
    public class SymbolTable
    {
        private readonly List<string> __defaults = new() { "if", "for", "print", "int", "float", "double", "dummy", "EOF" };

        private SymbolTable? _parent = null;
        private SymbolTable? _current;
        public SymbolTable? Parent { get => _parent; set { _parent = value; } }
        public SymbolTable? Current { get => _current; set { _current = value; } }

        public override string ToString()
        {
            string res = "";
            foreach (Symbol s in Symbols.FindAll(p => __defaults.All(o => o != p.Name)))
            {
                res += $"'{s.Type}' '{s.Name}''{s.Value}'";
                if (Symbols.FindAll(p => __defaults.All(o => o != p.Name)).Last() != s)
                {
                    res += " // ";
                }
            }
            if (res == "")
            {
                System.Console.ForegroundColor = System.ConsoleColor.Red;
                res = "Scope not used";
            }
            return res;
        }
        public List<SymbolTable> Children = new();
        public List<Symbol> Symbols = new();
        public IEnumerable<Symbol> NonDefaultSymbols
        {
            get
            {
                foreach (Symbol symbol in Symbols.FindAll(p => __defaults.All(o => o != p.Name)))
                    yield return symbol;
            }
        }
        private List<Exception> _diagnostics = new();
        public List<Exception> Diagnostics => GetDiagnostics();
        public SymbolTable? ExitScope()
        {
            return Parent;
        }

        private List<Exception> GetDiagnostics()
        {
            List<Exception> diag = new();
            foreach (Exception item in _diagnostics)
                diag.Add(item);
            foreach (SymbolTable t in Children)
                foreach (var item in t.Diagnostics)
                    diag.Add(item);
            return diag;
        }
        public int AddDiagnostic(Exception Diag)
        {
            _diagnostics.Add(Diag);
            return 0;
        }

        public SymbolTable(SymbolTable symbolTable) : this()
        {
            Parent = symbolTable;
        }
        public SymbolTable()
        {
            _current = this;
            foreach (string symbol in __defaults)
                Insert("keyword", symbol);
        }

        public SymbolTable Allocate()
        {
            var res = new SymbolTable(this);
            Children.Add(res);
            return res;
        }
        public void Free()
        {
            Symbols.Clear();
            foreach (string symbol in __defaults)
                Insert("keyword", symbol);
        }
        public int Insert(string type, string name, string? value = null)
        {
            Symbol symbol = new Symbol() { Name = name, Type = type, Value = value, Id = Symbols.Count };
            return Insert(symbol);
        }
        public int Insert(Symbol s)
        {
            if (Symbols.Any(p => p.Name == s.Name))
                _diagnostics.Add(new Exception($"Symbol was already defined '{s.Name}'"));
            Symbols.Add(s);
            return s.Id;
        }

        public void SetAttribute(string? Name, string? Value)
        {
            if (Name == null)
                _diagnostics.Add(new Exception($"Name was null '{Name}'"));
            if (Value == null)
                _diagnostics.Add(new Exception($"Value was null '{Value}'"));

            Symbol? symbol = null;
            SymbolTable? target = this;
            while (target != null)
            {
                symbol = target?.Symbols?.FirstOrDefault(p => p.Name == Name);
                if (symbol == null)
                {
                    target = Parent;
                }
                else
                {
                    symbol.Value = Value;
                    break;
                }
            }
            if (symbol == null)
                _diagnostics.Add(new Exception($"Symbol was not found '{Name}'"));
        }

        public Symbol? GetSymbol(string Name)
        {
            return null;
        }

        public Symbol? Lookup(string Name)
        {
            if (Name == null)
            {
                _diagnostics.Add(new Exception($"Name was null '{Name}'"));
                return null;
            }
            Symbol? symbol = null;
            SymbolTable? target = this;
            while (target != null)
            {
                symbol = target?.Symbols?.FirstOrDefault(p => p.Name == Name);
                if (symbol == null)
                    target = target?.Parent;
                else
                    break;
            }
            return symbol;
        }
        public override bool Equals(object? obj)
        {
            bool def = true;
            SymbolTable? table = obj as SymbolTable;
            if (table == null)
                return false;

            def &= CheckList(table);
            try
            {
                for (int i = 0; i < table.Children.Count; i++)
                    def &= table.Children[i].Equals(Children[i]);
                for (int i = 0; i < Children.Count; i++)
                    def &= Children[i].Equals(table.Children[i]);
            }
            catch (System.Exception ex)
            {
                return false;
            }
            return def;
        }
        private bool CheckList(SymbolTable table)
        {
            if (table.NonDefaultSymbols.ToList().Count == NonDefaultSymbols.ToList().Count && NonDefaultSymbols.ToList().Count > 0)
                return NonDefaultSymbols.All(o => table.NonDefaultSymbols.Any(p => o.Equals(p)))
                    && table.NonDefaultSymbols.All(o => NonDefaultSymbols.Any(p => o.Equals(p)));
            else if (table.NonDefaultSymbols.ToList().Count == NonDefaultSymbols.ToList().Count)
                return true;
            return false;
        }
    }
}