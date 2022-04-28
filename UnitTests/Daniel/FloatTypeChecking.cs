using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Compiler.SymbolTableFolder;

namespace UnitTests.Daniel
{
    [TestClass]
    public class FloatTypeChecking : UnitTestInitializer
    {
        [TestMethod]
        public void Floatsqrt()
        {
            var root = Parse(new StringBuilder("float kage = sqrt (5) ;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatAssignFloat()
        {
            var root = Parse(new StringBuilder("float kage = 5;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatDivide()
        {
            var root = Parse(new StringBuilder("float kage = 5 / 5;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatGradient()
        {
            var root = Parse(new StringBuilder("float kage = 5 \\\\ 4;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatGradientFloat()
        {
            var root = Parse(new StringBuilder("float kage = 5 \\\\ 4.7;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatRowLenCol()
        {
            var root = Parse(new StringBuilder("float kage = 5; float kage3 = kage.row; kage3 = kage.col; kage3 = kage.len"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatAssignFloatID()
        {
            var root = Parse(new StringBuilder("int kage2 = 6; float kage = kage2;"));
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatIDToID()
        {
            var root = Parse(new StringBuilder("float kage = kage;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatID()
        {
            var root = Parse(new StringBuilder("float kage = 123.43; float kage2 = kage;"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArr()
        {
            var root = Parse(new StringBuilder("float kage = 1234.234; float kage2 = kage[3];"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMat()
        {
            var root = Parse(new StringBuilder("float kage = 1234.23; float kage2 = kage[3][3];"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FLoatPlusFloat()
        {
            var root = Parse(new StringBuilder("float kage = 5 + 0;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatPlusIntID()
        {
            var root = Parse(new StringBuilder("int kage2 = 123; float kage = 5.08 + kage2;"));
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatPlusIntIDPlusFloat()
        {
            var root = Parse(new StringBuilder("int kage2 = 123; float kage = 5.08 + kage2; float kage3 = kage + 5;"));
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatFuncReturn()
        {
            var root = Parse(new StringBuilder("float kage = 5; float kage2 = 10; float kagew(float x, float y) {float z = x + y; return z;} float kage4 = kagew(kage, kage2);"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            scope.Insert(SymbolType.Float, "kagew", parameters: new List<Symbol>() { new("x", SymbolType.Float), new("y", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Float, "z");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage4");
            Assert.AreEqual(scope.ToString(), root.ToString());
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatAssignString()
        {
            var root = Parse(new StringBuilder("string kage2 = \"You deserve a treat!\"; float kage = kage2;"));
            scope.Insert(SymbolType.String, "kage2");
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
}
