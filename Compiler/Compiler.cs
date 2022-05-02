using Antlr4.Runtime;
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
        //private ScopeVisitorV2 _scopeTypeChecker;
        private PreCodeGen _preCodeGen;
        private CodeGeneratorV2 _codeGenerator;
        private ScopeVisitorV2 _scopeTypeChecker;
        public Wrapper(StringBuilder __source)
        {
            this.__source = __source;
            __stream = new(__source.ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            __context = __parser.prog();

            //_scopeTypeChecker = new();
            _preCodeGen = new PreCodeGen();
            _codeGenerator = new();
            _scopeTypeChecker = new();
        }
        public bool Compile()
        {
            if (__parser.NumberOfSyntaxErrors > 0) return false;
            _scopeTypeChecker.Visit(__context);
            Console.ForegroundColor = ConsoleColor.Red;
            foreach (var s in _scopeTypeChecker.Diagnostics)
                Console.WriteLine(s);
            Console.ForegroundColor = ConsoleColor.Yellow;
            foreach (var s in _scopeTypeChecker.Warnings)
                Console.WriteLine(s);

            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Printing Scope Tree:");
            Console.ForegroundColor = ConsoleColor.Green;
            _scopeTypeChecker.Print();
            Console.ResetColor();
            if (_scopeTypeChecker.Diagnostics.Count > 0) return false;
            _preCodeGen.Visit(__context);
            _preCodeGen.lookingforGrads = true;
            _preCodeGen.Visit(__context);
            _codeGenerator.PreVisit(_preCodeGen.Exprs);
            _codeGenerator.Visit(__context);
            _codeGenerator.Compile();
            return true;
        }

    }
}

    