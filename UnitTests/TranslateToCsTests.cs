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
            string res = "MathF.Pow(x, 132)";
            string input = _codeGen.CheckExpr("x**132");
            Assert.AreEqual(input, res);
        }

        [TestMethod]
        public void PowTest2() {
            string res = "x**132";
            string input = _codeGen.CheckExpr("x**132");
            Assert.AreNotEqual(input, res);
        }

        [TestMethod]
        public void NestedExprTest1()
        {
            string res = "x + 34 *(MathF.Sqrt(MathF.Pow(x, 4)))";
            string input = _codeGen.CheckExpr("x + 34 *(sqrt(x**4))");
            Assert.AreEqual(res, input);
        }
        [TestMethod]
        public void NestedExprTest2()
        {
            string res = "x / 34 +(sqrt(x**4/3))";
            string input = _codeGen.CheckExpr("x / 34 +(sqrt(x**4/3))");
            Assert.AreNotEqual(res, input);
        }
        [TestMethod]
        public void RowsTest1()
        {
            string res = "x.Rows";
            string input = _codeGen.CheckExpr("x.row");
            Assert.AreEqual(input, res);
        }
        [TestMethod]
        public void RowsTest2()
        {
            string res = "x.row";
            string input = _codeGen.CheckExpr("x.row");
            Assert.AreNotEqual(input, res);
        }
        [TestMethod]
        public void ColTest1()
        {
            string res = "x.Columns";
            string input = _codeGen.CheckExpr("x.col");
            Assert.AreEqual(input, res);
        }
        [TestMethod]
        public void ColTest2()
        {
            string res = "x.col";
            string input = _codeGen.CheckExpr("x.col");
            Assert.AreNotEqual(input, res);
        }
        [TestMethod]
        public void LenTest1()
        {
            string res = "x.Length";
            string input = _codeGen.CheckExpr("x.len");
            Assert.AreEqual(input, res);
        }
        [TestMethod]
        public void LenTest2()
        {
            string res = "x.len";
            string input = _codeGen.CheckExpr("x.len");
            Assert.AreEqual(input, res);
        }
    }
}
