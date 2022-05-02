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
    public class VisitTanslateTest
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
        public void VisitNum() {
            DclContext __context;
            __context = pars("float x = 4.0;").dcl();
            string exprt = "float x = 4.0f;";
            
            Assert.AreEqual(exprt, _codeGen.testString);
        }
    }
}
