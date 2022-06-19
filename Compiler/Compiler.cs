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
        private PreCodeGen? _preCodeGen;
        //private CodeGeneratorV2 _codeGenerator;
        private ScopeVisitorV2 _scopeTypeChecker;
        public Wrapper(StringBuilder __source)
        {
            this.__source = __source;
            __stream = new(__source.ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            __context = __parser.prog();
            _scopeTypeChecker = new();
        }
        public bool Compile()
        {
            if (__parser.NumberOfSyntaxErrors > 0) return false;
            _scopeTypeChecker.Visit(__context);
            

            
            _preCodeGen = new PreCodeGen(_scopeTypeChecker.Scope);
            _preCodeGen.Visit(__context);
            Console.ForegroundColor = ConsoleColor.Red;
            foreach (var s in _scopeTypeChecker.Diagnostics)
                Console.WriteLine(s);
            Console.ForegroundColor = ConsoleColor.Yellow;
            foreach (var s in _scopeTypeChecker.Warnings)
                Console.WriteLine(s);
            Console.ForegroundColor = ConsoleColor.Green;
            Console.ResetColor();
            if (_scopeTypeChecker.Diagnostics.Count > 0) return false;
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine("Printing EXPR Tree:");
            _scopeTypeChecker.Scope.GoThroughTreesFromRoot();
            var _codeGenerator = new CodeGenV3(_scopeTypeChecker.Scope, false);
            _codeGenerator.Visit(__context);
            _codeGenerator.fw.Compile();
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Printing Scope Tree:");
            _scopeTypeChecker.Print();
            Console.ForegroundColor = ConsoleColor.White;
            return true;
        }

    }
}

