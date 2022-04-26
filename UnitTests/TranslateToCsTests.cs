using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.Phases;
using System.Text;

namespace ScopeTests
{
    [TestClass]
    public class TranslateToCsTests : UnitTestInitializer
    {
        private CodeGeneratorV2 _codeGen = new CodeGeneratorV2(true);

        [TestMethod]
        public void sqrtTest1() {
            string res = "MathF.Sqrt(x + 4 * MathF.Sqrt(45))";
            string input = _codeGen.CheckExpr("sqrt(x + 4 * sqrt(45))");
            Assert.AreEqual(res, input);
        }

        [TestMethod]
        public void sqrtTest2()
        {
            string res = "sqrt(x + 4 * sqrt(45))";
            string input = _codeGen.CheckExpr("sqrt(x + 4 * sqrt(45))");
            Assert.AreNotEqual(res, input);
        }
        [TestMethod]
        public void PowTest1() {
            string res = "MathF.Pow(x,132);";
            string input = _codeGen.CheckExpr("x**132;");
            Assert.AreEqual(input, res);
        }
    }
}
