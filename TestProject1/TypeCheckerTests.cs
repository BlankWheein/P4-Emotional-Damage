using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestCompiler;
using TestCompiler.Exceptions;

namespace TestProject1
{
    [TestClass]
    public class TypeCheckerTests
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
        public void IntAssignment()
        {
            TestGrammarParser parser = Setup("int kage = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(0, visitor.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void IntAssignment2()
        {
            TestGrammarParser parser = Setup("int kage = 2.;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(1, visitor.Scope.Diagnostics.Count);
            Assert.IsTrue(visitor.Scope.Diagnostics[0] is IntDeclarationException);
        }
        [TestMethod]
        public void FloatAssignment()
        {
            TestGrammarParser parser = Setup("float kage = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(0, visitor.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void FloatAssignment2()
        {
            TestGrammarParser parser = Setup("float kage = dwa;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(2, visitor.Scope.Diagnostics.Count);
            Assert.IsTrue(visitor.Scope.Diagnostics[0] is IdNotFoundException);
            Assert.IsTrue(visitor.Scope.Diagnostics[1] is FloatDeclarationException);
        }
        [TestMethod]
        public void DoubleAssignment()
        {
            TestGrammarParser parser = Setup("double kage = 2;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(0, visitor.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void DoubleAssignment2()
        {
            TestGrammarParser parser = Setup("double kage = dwa;");
            TestGrammarParser.ProgContext progContext = parser.prog();
            BasicVisitor visitor = new();
            visitor.Visit(progContext);
            Assert.AreEqual(2, visitor.Scope.Diagnostics.Count);
            Assert.IsTrue(visitor.Scope.Diagnostics[0] is IdNotFoundException);
            Assert.IsTrue(visitor.Scope.Diagnostics[1] is DoubleDeclarationException);
        }
    }
}
