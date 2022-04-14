﻿using Antlr4.Runtime;
using Compiler.Phases;
using System.Text;
using static EmotionalDamageParser;

namespace Compiler
{
    public class Wrapper
    {
        private readonly StringBuilder __source;
        private readonly ProgContext __context;
        private readonly EmotionalDamageLexer __lexer;
        private readonly EmotionalDamageParser __parser;
        private readonly AntlrInputStream __stream;
        private readonly CommonTokenStream __lexerStream;
        private ScopeVisitor _scopeTypeChecker;
        private TypeChecker _typeChecker;
        private CodeGenerator _codeGenerator;
        public Wrapper(StringBuilder __source)
        {
            this.__source = __source;
            __stream = new(__source.ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            __context = __parser.prog();

            _scopeTypeChecker = new();
            _typeChecker = new(_scopeTypeChecker);
            _codeGenerator = new();
        }
        public void Compile()
        {
            _scopeTypeChecker.Visit(__context);
            /*Console.ForegroundColor = ConsoleColor.Red;
            foreach (var s in _scopeTypeChecker.Diagnostics)
                Console.WriteLine(s);*/

            //Console.ForegroundColor = ConsoleColor.White;
            //Console.WriteLine("Printing Scope Tree:");
            //Console.ForegroundColor = ConsoleColor.Green;
            //_scopeTypeChecker.Print();
            //_scopeTypeChecker.Dispose();
            //Console.ResetColor();

            //_codeGenerator.Scope = _scopeTypeChecker.Scope;
            //_codeGenerator.Visit(__context);
            //_codeGenerator.Dispose();

            _typeChecker.Visit(__context);
            Console.ForegroundColor = ConsoleColor.Yellow;
            foreach (var s in _typeChecker.Diagnostics)
                Console.WriteLine(s);
            Console.ResetColor();
        }

    }
}

    