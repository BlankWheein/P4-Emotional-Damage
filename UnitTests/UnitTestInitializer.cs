using Antlr4.Runtime;
using Compiler.Phases;
using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Text;
using static EmotionalDamageParser;

namespace ScopeTests
{
    [TestClass]
    public class UnitTestInitializer
    {
        internal RootSymbolTable? scope;
        private ProgContext? __context;
        private EmotionalDamageLexer? __lexer;
        private EmotionalDamageParser? __parser;
        private AntlrInputStream? __stream;
        private CommonTokenStream? __lexerStream;
        private ScopeVisitorV2? _scopeTypeChecker;
        public RootSymbolTable Parse(StringBuilder __source)
        {
            __stream = new(__source.ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            __context = __parser.prog();
            _scopeTypeChecker = new();
            _scopeTypeChecker.Visit(__context);
            return _scopeTypeChecker.Scope;

        }

        [TestInitialize]
        public void Setup()
        {
            scope = new();
        }

        [TestCleanup]
        public void CleanUp()
        {

        }
    }
}