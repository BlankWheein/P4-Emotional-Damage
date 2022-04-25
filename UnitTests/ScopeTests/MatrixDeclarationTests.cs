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
            var root = Parse(new StringBuilder("int[4][2] m; for (int i = 0; i < m.row; i++) {for (int j = 0; j < m.col; j++) { m[i][j] = i*j; }}"));
            scope.Insert(SymbolType.Mint, "m", row: 4, col: 2);
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "j");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, scope.Diagnostics.Count);
        }
    }
}