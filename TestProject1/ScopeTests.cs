using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestCompiler;

namespace TestProject1
{
    [TestClass]
    public class ScopeTests
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
        public void IntDeclaration()
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
        public void IntDeclaration2()
        {
            TestGrammarParser parser = Setup("int kage2 = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsFalse(result);
        }
        [TestMethod]
        public void DoubleIntDeclaration()
        {
            TestGrammarParser parser = Setup("int kage = 2; int kage2 = 3;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Insert("int", "kage2", "3");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatementOuterScope()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {kage = 2;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatementOuterScopeFail()
        {
            TestGrammarParser parser = Setup("if(1) {kage = 2;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsFalse(result);
        }
        [TestMethod]
        public void IfStatementInnerScope()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatement1ElifStatement()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;} elif(1) {int kage = 3;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[1].Insert("int", "kage", "3");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatement1ElifStatementElseStatement()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;} elif(1) {int kage = 3;}else{}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[1].Insert("int", "kage", "3");
            scope.Allocate();
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatement1ElifStatementElseStatementFail()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;} elif(1) {int kage = 3;}else{kage = 2;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[1].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[2].Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsFalse(result);
        }
        [TestMethod]
        public void IfStatementMElifStatement()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;} elif(1) {int kage = 3;}elif(1) {int kage = 3;}elif(1) {int kage = 3;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[1].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[2].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[3].Insert("int", "kage", "3");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void IfStatementMElifStatementElse()
        {
            TestGrammarParser parser = Setup("int kage = 2; if(1) {int kage = 2;} elif(1) {int kage = 3;}elif(1) {int kage = 3;}elif(1) {int kage = 3;}else{int kage = 2}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            scope.Allocate();
            scope.Children[1].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[2].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[3].Insert("int", "kage", "3");
            scope.Allocate();
            scope.Children[4].Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void ForLoopScopes()
        {
            TestGrammarParser parser = Setup("for(int i = 0; i < 10; i++){int kage = 2;}");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "i", "0");
            scope.Allocate();
            scope.Children[0].Insert("int", "kage", "2");
            bool result = scope.Equals(visitor.Scope); 
            Assert.IsTrue(result);
        }


        [TestMethod]
        public void Stmts()
        {
            TestGrammarParser parser = Setup("int kage = 2; kage = 3; int test = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Insert("int", "test", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void StmtsFail()
        {
            TestGrammarParser parser = Setup("int kage = 2; kage = 3; int test = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Insert("int", "kage", "2");
            scope.Insert("int", "kage", "3");
            scope.Insert("int", "test", "2");
            bool result = scope.Equals(visitor.Scope);
            Assert.IsFalse(result);
        }
        [TestMethod]
        public void Print()
        {
            TestGrammarParser parser = Setup("print 1 == 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            bool result = scope.Equals(visitor.Scope);
            Assert.IsTrue(result);
        }
        [TestMethod]
        public void PrintFail()
        {
            TestGrammarParser parser = Setup("print 1 == 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            SymbolTable scope = new();
            scope.Allocate();
            bool result = scope.Equals(visitor.Scope);
            Assert.IsFalse(result);
        }
    }
}
