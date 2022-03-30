using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestCompiler;

namespace TestProject1
{
    [TestClass]
    public class UnitTest1
    {
        private TestGrammarParser Setup(string text)
        {
            AntlrInputStream inputStream = new(text.ToString());
            TestGrammarLexer speakLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(speakLexer);
            TestGrammarParser speakParser = new(commonTokenStream);
            return speakParser;
        }
        [TestMethod]
        public void TestChat()
        {
            TestGrammarParser parser = Setup("int kage = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new SymbolTable();
            scope.Insert("int", "kage", "2");
            Assert.IsTrue(scope.Equals(visitor.Scope));
        }
        [TestMethod]
        public void TestChat2()
        {
            TestGrammarParser parser = Setup("int kage2 = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new SymbolTable();
            scope.Insert("int", "kage", "2");
            Assert.IsFalse(scope.Equals(visitor.Scope));
        }
    }
}
