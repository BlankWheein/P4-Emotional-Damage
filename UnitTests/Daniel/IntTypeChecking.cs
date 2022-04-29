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
    public class IntTypeChecking : UnitTestInitializer
    {
        [TestMethod]
        public void Ting()
        {
            var root = Parse(new StringBuilder("int kage = 2; if (kage == 2)  { float kage = 3.0;}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Allocate("If");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void Intsqrt()
        {
            var root = Parse(new StringBuilder("int kage = sqrt (5);"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntDivide()
        {
            var root = Parse(new StringBuilder("int kage = 5 / 4;"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntRowLenCol()
        {
            var root = Parse(new StringBuilder("int kage = 5; int kage3 = kage.row; kage3 = kage.col; kage3 = kage.len;"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntAssignFloatID()
        {
            var root = Parse(new StringBuilder("int kage = kage2; float kage2 = 6.9;"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntIDToID()
        {
            var root = Parse(new StringBuilder("int kage = kage;"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntID()
        {
            var root = Parse(new StringBuilder("int kage = 123; int kage2 = kage;"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArr()
        {
            var root = Parse(new StringBuilder("int kage = 1234; int kage2 = kage[3];"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMat()
        {
            var root = Parse(new StringBuilder("int kage = 1234; int kage2 = kage[3][3];"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntPlusFloat()
        {
            var root = Parse(new StringBuilder("int kage = 5.5 + 0.5;"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntPlusFloatID()
        {
            var root = Parse(new StringBuilder("int kage = 5 + kage2;"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntFuncReturn()
        {
            var root = Parse(new StringBuilder("int kage = 5; int kage2 = 10; int kagew(int x, int y) {int z = x + y; return z;} int ice = kagew(kage, kage2);"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Int, "kagew", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Int) }, isfunc: true);
            scope.Insert(SymbolType.Int, "ice");
            Assert.AreEqual(scope.ToString(), root.ToString());
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntAssignString()
        {
            var root = Parse(new StringBuilder("string kage2 = \"You deserve a treat!\"; int kage = kage2;"));
            scope.Insert(SymbolType.String, "kage2");
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

    }
}
