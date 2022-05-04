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
        internal RootSymbolTable? scope;
        private EmotionalDamageLexer? __lexer;
        internal EmotionalDamageParser? __parser;
        private AntlrInputStream? __stream;
        private CommonTokenStream? __lexerStream;
        private CodeGeneratorV2 _codeGen = new CodeGeneratorV2(true);
        private StmtContext __context;
        private TypeChecker _typeChecker = new(new ScopeVisitorV2());
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
        [TestMethod]
        public void VisitUnaryPlus()
        {
            string exprt = "x++;";
            __context = pars("x++;").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitUnaryMinus()
        {
            string exprt = "x--;";
            __context = pars("x--;").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitWhileStmt()
        {
            string exprt = "while(true){Console.WriteLine(\"Doing Stuff\");}";
            __context = pars("while(true){println(\"Doing Stuff\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitForStmt()
        {
            string exprt = "for (int i = 0; i<10; i++){Console.WriteLine(\"Doing Stuff\");}";
            __context = pars("for(int i = 0; i < 10; i++){println(\"Doing Stuff\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixTransposeStmt()
        {
            string exprt = "x = y.Transpose()";
            __context = pars("x = T(y)").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt1()
        {
            _codeGen.Scope = _typeChecker.Scope;
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}";
            __context = pars("if(i<10){println(\"Doing Stuff\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt2()
        {
            _codeGen.Scope = new(true);
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else{Console.WriteLine(\"Doing Other Stuff\");}";
            __context = pars("if(i<10){println(\"Doing Stuff\");} else {println(\"Doing Other Stuff\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt3()
        {
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==u){Console.WriteLine(\"Doing Other Stuff\");}";
            __context = pars("if(i<10){println(\"Doing Stuff\");} elif (i == u){println(\"Doing Other Stuff\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt4()
        {
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==u){Console.WriteLine(\"Doing Other Stuff\");}else{Console.WriteLine(\"something else\");}";
            __context = pars("if(i<10){println(\"Doing Stuff\");} elif (i == u){println(\"Doing Other Stuff\");} else {println(\"something else\");}").stmt();
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
    }
}
