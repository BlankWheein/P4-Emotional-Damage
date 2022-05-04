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
        private CodeGeneratorV2 _codeGen = new(true);
        private ProgContext __context;
        private ScopeVisitorV2 _typeChecker = new();
        public void Parse(string v)
        {
            __stream = new(new StringBuilder(v).ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            __context = __parser.prog();
            _typeChecker.Visit(__context);
            _codeGen.Scope = _typeChecker.Scope;
            _codeGen.Visit(__context);
        }
        [TestMethod]
        public void VisitPrintStmt() {
            Parse("int x = 0;print(x)");
            string exprt = "int x = 0;Console.Write(x);";
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitPrintStmt2()
        {
            string exprt = "int x = 0;Console.WriteLine(x);";
            Parse("int x =0; println(x);");
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitReturnStmt()
        {
            string exprt = "int x = 0;return x;";
            Parse("int x = 0;return x;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitNumAssignStmt()
        {
            string exprt = "x = 4.0;";
            Parse("x = 4.0f;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitBoolAssignStmt()
        {
            string exprt = "x = false;";
            Parse("x = false;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixAssignStmt()
        {
            string exprt = "x.Values[2][2] = new Value(6, CalculateGradient: false);";
            Parse("x[2][2] = 6");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitArrayAssignStmt()
        {
            string exprt = "x[2] = 6;";
            Parse("x[2] = 6");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitFunStmt() {
            string exprt = "x(f, g);";
            Parse("x(f, g);");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitUnaryPlus()
        {
            string exprt = "x++;";
            Parse("x++;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitUnaryMinus()
        {
            string exprt = "x--;";
            Parse("x--;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitWhileStmt()
        {
            string exprt = "while(true){Console.WriteLine(\"Doing Stuff\");}";
            Parse("while(true){println(\"Doing Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitForStmt()
        {
            string exprt = "for (int i = 0; i<10; i++){Console.WriteLine(\"Doing Stuff\");}";
            Parse("for(int i = 0; i < 10; i++){println(\"Doing Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixTransposeStmt()
        {
            string exprt = "x = y.Transpose()";
            Parse("x = T(y)");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt1()
        {
            _codeGen.Scope = _typeChecker.Scope;
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}";
            Parse("if(i<10){println(\"Doing Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt2()
        {
            _codeGen.Scope = new(true);
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else{Console.WriteLine(\"Doing Other Stuff\");}";
            Parse("if(i<10){println(\"Doing Stuff\");} else {println(\"Doing Other Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt3()
        {
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==u){Console.WriteLine(\"Doing Other Stuff\");}";
            Parse("if(i<10){println(\"Doing Stuff\");} elif (i == u){println(\"Doing Other Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt4()
        {
            string exprt = "if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==u){Console.WriteLine(\"Doing Other Stuff\");}else{Console.WriteLine(\"something else\");}";
            Parse("if(i<10){println(\"Doing Stuff\");} elif (i == u){println(\"Doing Other Stuff\");} else {println(\"something else\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
    }
}
