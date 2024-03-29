﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    public sealed class SymbolTable : IDisposable
    {
        private readonly bool _testing;
        public SymbolTable(SymbolTable? parent, RootSymbolTable roottable, bool Testing=false, string type = "NotDefined")
        {
            Parent = parent;
            _testing = Testing;
            Root = roottable;
            Diagnostics = roottable.Diagnostics;
            Warnings = roottable.Warnings;
            ReservedSymbols = roottable.ReservedSymbols;
            this.SymbolTableType = type;
        }
        private int? _currentScope = 0;
        public int? CurrentScope { get { if (_currentScope < Children.Count) return _currentScope; return null; } set { _currentScope = value; } }
        public List<Symbol> ReservedSymbols { get; }
        public List<Symbol> Symbols { get; set; } = new();
        public SymbolTable? Parent { get; set; }
        public List<SymbolTable> Children { get; set; } = new();
        public RootSymbolTable? Root { get; set; }
        public List<Exception> Diagnostics { get; set; }
        public List<Exception> Warnings { get; set; }
        internal string SymbolTableType { get; set; } = "NotDefined";

        /// <summary>
        /// Look for a symbol
        /// </summary>
        /// <param name="id"></param>
        /// <returns>Symbol if found, else null</returns>
        public Symbol? LookUp(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            if (symbol == null)
                Diagnostics.Add(new Exception(id + " was not defined2"));
            return symbol;
        }
        public Symbol? LookUpSilent(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            return symbol;
        }

        public Symbol? LookUpExsting(string id)
        {
            Symbol? symbol = LookUpHelper(id);
            if (symbol != null)
                Diagnostics.Add(new Exception(id + " already exsits"));
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
            if (symbol != null)
                symbol.IsUsed = true;
            return symbol;
        }

        /// <summary>
        /// Inserts a symbol in a symbol table based on symbol attributes
        /// </summary>
        /// <param name="type"></param>
        /// <param name="id"></param>
        public void Insert(SymbolType type, string id, int row, int col, bool? isfunc, List<Symbol>? parameters)
        {
            Symbol symbol = new(id, type, row, col, isfunc, parameters);
            Insert(symbol);
        }
   
        /// <summary>
        /// Inserts a symbol in a symbol table
        /// </summary>
        /// <param name="symbol"></param>
        public void Insert(Symbol symbol)
        {
            foreach (var item in Root?.ReservedContains)
            {
                if (symbol.Id.Contains(item.Id))
                {
                    Diagnostics.Add(new($"'{symbol.Id}' contains reserved keyword '{item.Id}'"));
                    return;
                }
            }
            if (ReservedSymbols.All(o=>o.Id!=symbol.Id) && LookUpHelper(symbol.Id) == null)
                Symbols.Add(symbol);
            else 
                Diagnostics.Add(new Exception(symbol?.ToString()));
        }

        public override string ToString()
        {
            string res = SymbolTableType + ": ";
            foreach (Symbol s in Symbols)
            {
                res += s.ToString();
                if (Symbols.Last() != s)
                {
                    res += " // ";
                }
            }
            if (res == SymbolTableType)
            {
                System.Console.ForegroundColor = System.ConsoleColor.Red;
                res = SymbolTableType + ": Scope not used";
            }
            return res;
        }

        public void Dispose()
        {
            //Symbols.Clear();

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
            if (table.Symbols.ToList().Count == Symbols.ToList().Count && Symbols.ToList().Count > 0)
                return Symbols.All(o => table.Symbols.Any(p => o.Equals(p)))
                    && table.Symbols.All(o => Symbols.Any(p => o.Equals(p)));
            else if (table.Symbols.ToList().Count == Symbols.ToList().Count)
                return true;
            return false;
        }
    }
}
