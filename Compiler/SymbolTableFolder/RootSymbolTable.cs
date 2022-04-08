using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.SymbolTableFolder
{
    class RootSymbolTable : SymbolTable
    {
        public RootSymbolTable()
        {
            Root = null;
            Parent = null;
            Current = this;
        }

        public SymbolTable Current { get; set; }


        /// <summary>
        /// Creating a new symbol table and entering its scope
        /// </summary>
        public void Allocate()
        {
            SymbolTable symbolTable = new();
            Current.Children.Add(symbolTable);
            Current = symbolTable;
        }

        /// <summary>
        /// Exit the current scope
        /// </summary>
        public void ExitScope()
        {
            Current = Current?.Parent;
        }
    }
}
