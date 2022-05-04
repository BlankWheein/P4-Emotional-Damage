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
            Assert.AreEqual(0, _typeChecker.Diagnostics.Count);
            Assert.AreEqual(0, __parser.NumberOfSyntaxErrors);
            _codeGen.Scope = _typeChecker.Scope;
            _codeGen.Visit(__context);
        }
        [TestMethod]
        public void VisitPrintStmt() {
            Parse("int x = 0;print(x);");
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
            string exprt = "float kage(){int x = 0;return x;}";
            Parse("float kage(){int x = 0;return x;}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitNumAssignStmt()
        {
            string exprt = "float x = 0;x = 4.0f;";
            Parse("float x=0;x = 4.0;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitBoolAssignStmt()
        {
            string exprt = "bool x = true;x = false;";
            Parse("bool x = true;x = false;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixAssignStmt()
        {
            string exprt = "Matrix x = new(3,3);x.Values[2][2] = new Value(6, CalculateGradient: false);";
            Parse("float[3][3] x; x[2][2] = 6;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitArrayAssignStmt()
        {
            string exprt = "int[] x = new int[4];x[2] = 6;";
            Parse("int[4] x;x[2] = 6;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitFunStmt() {
            string exprt = "float g = 2;int f = 3;float xy (int y, float x) {return x;}xy(f, g);";
            Parse("float g = 2; int f = 3; float xy(int y, float x){return x;}xy(f, g);");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitUnaryPlus()
        {
            string exprt = "int x = 0;x++;";
            Parse("int x = 0;x++;");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitUnaryMinus()
        {
            string exprt = "int x = 0;x--;";
            Parse("int x = 0;x--;");
            
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
            string exprt = "Matrix y = new(2,2);Matrix x = new(2,2);x = y.Transpose()";
            Parse("float[2][2] y; float[2][2]x;x = T(y);");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt1()
        {
            _codeGen.Scope = _typeChecker.Scope;
            string exprt = "int i = 0;if(i<10){Console.WriteLine(\"Doing Stuff\");}";
            Parse("int i =0;if(i<10){println(\"Doing Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt2()
        {
            _codeGen.Scope = new(true);
            string exprt = "int i = 0;if(i<10){Console.WriteLine(\"Doing Stuff\");}else{Console.WriteLine(\"Doing Other Stuff\");}";
            Parse("int i = 0;if(i<10){println(\"Doing Stuff\");} else {println(\"Doing Other Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt3()
        {
            string exprt = "int i = 0;if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==9){Console.WriteLine(\"Doing Other Stuff\");}";
            Parse("int i = 0;if(i<10){println(\"Doing Stuff\");} elif (i == 9){println(\"Doing Other Stuff\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitSelectiveStmt4()
        {
            string exprt = "int i = 0;if(i<10){Console.WriteLine(\"Doing Stuff\");}else if(i==9){Console.WriteLine(\"Doing Other Stuff\");}else{Console.WriteLine(\"something else\");}";
            Parse("int i = 0;if(i<10){println(\"Doing Stuff\");} elif (i == 9){println(\"Doing Other Stuff\");} else {println(\"something else\");}");
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
    }
}
