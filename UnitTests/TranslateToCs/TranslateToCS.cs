using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Compiler.SymbolTableFolder;
using Compiler.Phases;

namespace UnitTests.TranlateToCs
{
    [TestClass]
    public class TranslateToCS
    {
        private CodeGeneratorV2 _codeGen = new CodeGeneratorV2(true);
       
        [TestMethod]
        public void PowerOfValue()
        {
            string res = "x.Pow(4)";
            string input = "x**4";
            _codeGen.PreVisit(new HashSet<string> { "x" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void PowerOfVar() {
            string res = "MathF.Pow(fan, 4)";
            string input = "fan**4";
            _codeGen.PreVisit(new HashSet<string> { "f" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void PowerOfValuePlusVar()
        {
            string res = "MathF.Pow((f+2), 4)";
            string input = "(f+2)**4";
            _codeGen.PreVisit(new HashSet<string> { "f" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void SqrtOfValue()
        {
            string res = "x.Pow(1 / 2)";
            string input = "sqrt(x)";
            _codeGen.PreVisit(new HashSet<string> { "x" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void SqrtOfVar()
        {
            string res = "MathF.Sqrt(xy)";
            string input = "sqrt(xy)";
            _codeGen.PreVisit(new HashSet<string> { "x" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void SqrtOfValuePlusVar()
        {
            string res = "MathF.Sqrt(x + 2)";
            string input = "sqrt(x+2)";
            _codeGen.PreVisit(new HashSet<string> { "x" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void SqrtInSqrt()
        {
            string res = "MathF.Sqrt(x + MathF.Sqrt(2))";
            string input = "sqrt(x+sqrt(2))";
            _codeGen.PreVisit(new HashSet<string> { "x" });
            input = _codeGen.CheckExpr(input);
            Assert.AreEqual(res, input);
        }

    }
}
