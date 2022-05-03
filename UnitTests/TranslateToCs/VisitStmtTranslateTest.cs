using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Compiler.SymbolTableFolder;
using Compiler.Phases;
using static EmotionalDamageParser;
using Antlr4.Runtime;

namespace UnitTests.TranslateToCs
{
    [TestClass]
    public class VisitStmtTranslateTest
    {
        private EmotionalDamageLexer? __lexer;
        internal EmotionalDamageParser? __parser;
        private AntlrInputStream? __stream;
        private CommonTokenStream? __lexerStream;
        private CodeGeneratorV2 _codeGen = new CodeGeneratorV2(true);
        private StmtContext __context;
        public EmotionalDamageParser pars(string v)
        {
            __stream = new(new StringBuilder(v).ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            return __parser;
        }
        [TestMethod]
        public void VisitPrintStmt() {
            string exprt = "Console.Write(x);";
            __context = pars("print(x);").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitPrintStmt2()
        {
            string exprt = "Console.WriteLine(x);";
            __context = pars("println(x);").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitReturnStmt()
        {
            string exprt = "return x;";
            __context = pars("return x;").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitNumAssignStmt()
        {
            string exprt = "x = 4.0;";
            __context = pars("x = 4.0f;").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitBoolAssignStmt()
        {
            string exprt = "x = false;";
            __context = pars("x = false;").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixAssignStmt()
        {
            string exprt = "x.Values[2][2] = new Value(6, CalculateGradient: false);";
            __context = pars("x[2][2] = 6").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitArrayAssignStmt()
        {
            string exprt = "x[2] = 6;";
            __context = pars("x[2] = 6").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitFunStmt() {
            string exprt = "x(f, g);";
            __context = pars("x(f, g);").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
    }
}
