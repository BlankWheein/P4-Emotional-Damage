using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;


namespace UnitTests.ScopeTests
{
    [TestClass]
    public class MatrixDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void MatrixDcl()
        {
            var root = Parse(new StringBuilder("int[2][2] m;"));
            scope.Insert(SymbolType.Mint, "m", row: 2, col: 2);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }

        [TestMethod]
        public void MatrixDcl2()
        {
            var root = Parse(new StringBuilder("int[4][2] m;"));
            scope.Insert(SymbolType.Mint, "m", row: 4, col: 2);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void MatrixDcl2Fail()
        {
            var root = Parse(new StringBuilder("int[4][2] m;"));
            scope.Insert(SymbolType.Mint, "m", row: 2, col: 4);
            Assert.AreNotEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void MatrixAssign()
        {
            var root = Parse(new StringBuilder("int[4][2] m; int k = m.row; int k2 = m.col; for (int i = 0; i < k; i++) {for (int j = 0; j < k2; j++) { m[i][j] = i*j; }}"));
            scope.Insert(SymbolType.Mint, "m", row: 4, col: 2);
            scope.Insert(SymbolType.Int, "k");
            scope.Insert(SymbolType.Int, "k2");
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "j");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatMatrixInInt()
        {
            var root = Parse(new StringBuilder("float[2][2] m; int k = m[1][1];"));
            scope.Insert(SymbolType.Mfloat, "m", row: 2, col: 2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntMatrixInInt()
        {
            var root = Parse(new StringBuilder("int[2][2] m; int k = m[1][1];"));
            scope.Insert(SymbolType.Mint, "m", row: 2, col: 2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatMatrixInFloat()
        {
            var root = Parse(new StringBuilder("float[2][2] m; float k = m[1][1];"));
            scope.Insert(SymbolType.Mfloat, "m", row: 2, col: 2);
            scope.Insert(SymbolType.Float, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntMatrixInFloat()
        {
            var root = Parse(new StringBuilder("int[2][2] m; float k = m[1][1];"));
            scope.Insert(SymbolType.Mint, "m", row: 2, col: 2);
            scope.Insert(SymbolType.Float, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseArrayAsMatrix()
        {
            var root = Parse(new StringBuilder("int[2] m; int k = m[1][1];"));
            scope.Insert(SymbolType.Aint, "m", row: 2);
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseIntAsMatrix()
        {
            var root = Parse(new StringBuilder("int m = 0; int k = m[1][1];"));
            scope.Insert(SymbolType.Int, "m");
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseFloatAsMatrix()
        {
            var root = Parse(new StringBuilder("float m = 0.0; int k = m[1][1];"));
            scope.Insert(SymbolType.Float, "m");
            scope.Insert(SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }
    }
}