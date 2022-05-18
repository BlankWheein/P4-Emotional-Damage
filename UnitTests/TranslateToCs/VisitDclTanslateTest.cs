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
    public class VisitDclTanslateTest
    {
        private EmotionalDamageLexer? __lexer;
        internal EmotionalDamageParser? __parser;
        private AntlrInputStream? __stream;
        private CommonTokenStream? __lexerStream;
        private CodeGeneratorV2 _codeGen = new CodeGeneratorV2(true);
        public EmotionalDamageParser pars(string v) {
            __stream = new(new StringBuilder(v).ToString());
            __lexer = new(__stream);
            __lexerStream = new(__lexer);
            __parser = new(__lexerStream);
            return __parser;
        }
        [TestMethod]
        public void VisitFunDcl() {
            DclContext __context;
            __context = pars("int testfunc(float x, float[2][4] y){\nprint(x);\n}").dcl();
            string exprt = "int testfunc (float x, Matrix y) {Console.Write(x);}";
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitMatrixDcl()
        {
            DclContext __context;
            __context = pars("float[2][4] y;").dcl();
            string exprt = "Matrix y = new(2,4);";
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitArrayDcl()
        {
            DclContext __context;
            __context = pars("float[2] y;").dcl();
            string exprt = "float[] y = new float[2];";
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitNumDcl() {
            DclContext __context;
            __context = pars("float x = 4.0;").dcl();
            string exprt = "float x = 4.0f;";
            _codeGen.Visit(__context); 
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitGradientDcl()
        {
            
            DclContext __context;
            __context = pars("float v = y\\\\x;").dcl();
            string exprt = "y.Backward();float v = x.grad;";
            _codeGen.PreVisit(new HashSet<string> {"y", "x" });
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitStringDcl()
        {
            DclContext __context;
            __context = pars("string a = \"Test String <<[ks){\";").dcl();
            string exprt = "string a = \"Test String <<[ks){\";";
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }
        [TestMethod]
        public void VisitBoolDcl()
        {
            DclContext __context;
            __context = pars("bool b = true;").dcl();
            string exprt = "bool b = true;";
            _codeGen.Visit(__context);
            Assert.AreEqual(exprt, _codeGen.testString);
        }

    }
}
