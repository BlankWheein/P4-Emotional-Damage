using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;


namespace UnitTests.ScopeTests
{
    [TestClass]
    public class ArrayDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void ArrayDcl()
        {
            var root = Parse(new StringBuilder("int[2] m;"));
            scope.Insert(SymbolType.Aint, "m", row: 2);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }

        [TestMethod]
        public void ArrayDcl2()
        {
            var root = Parse(new StringBuilder("float[4] m;"));
            scope.Insert(SymbolType.Afloat, "m", row: 4);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void ArrayDcl2Fail()
        {
            var root = Parse(new StringBuilder("int[4] m;"));
            scope.Insert(SymbolType.Aint, "m", row: 2);
            Assert.AreNotEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void ArrayAssign()
        {
            var root = Parse(new StringBuilder("int[4] m; for (int i = 0; i < m.len; i++) { m[i] = i*2; }"));
            scope.Insert(SymbolType.Aint, "m", row: 4);
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatArrayInInt()
        {
            var root = Parse(new StringBuilder("float[2] m; int k = m[1];"));
            scope.Insert(SymbolType.Afloat, "m", row: 2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntArrayInInt()
        {
            var root = Parse(new StringBuilder("int[2] m; int k = m[1];"));
            scope.Insert(SymbolType.Aint, "m", row: 2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatArrayInFloat()
        {
            var root = Parse(new StringBuilder("float[2] m; float k = m[1];"));
            scope.Insert(SymbolType.Afloat, "m", row: 2);
            scope.Insert(SymbolType.Float, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntArrayInFloat()
        {
            var root = Parse(new StringBuilder("int[2] m; float k = m[1];"));
            scope.Insert(SymbolType.Aint, "m", row: 2);
            scope.Insert(SymbolType.Float, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseMatrixAsArray()
        {
            var root = Parse(new StringBuilder("int[2][2] m; int k = m[1];"));
            scope.Insert(SymbolType.Mint, "m", row: 2, col:2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntAsArray()
        {
            var root = Parse(new StringBuilder("int m = 0; int k = m[1];"));
            scope.Insert(SymbolType.Int, "m");
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatAsArray()
        {
            var root = Parse(new StringBuilder("float m = 0.0; int k = m[1];"));
            scope.Insert(SymbolType.Float, "m");
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
}