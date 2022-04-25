using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class BoolAssignTests : UnitTestInitializer
    {
        [TestMethod]
        public void BoolDclValues()
        {
            var root = Parse(new System.Text.StringBuilder("bool k = true"));
            var root2 = Parse(new System.Text.StringBuilder("bool k = false"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(scope, root2);
            Assert.AreEqual(0, root.Diagnostics.Count);
            Assert.AreEqual(0, root2.Diagnostics.Count);
        }
        [TestMethod]
        public void BoolDclBexpr()
        {
            var root = Parse(new System.Text.StringBuilder("bool k = 2 * 3 == 6"));
            var root2 = Parse(new System.Text.StringBuilder("bool k = 2 + 2 * 2 / 2 % 2 > 2"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(scope, root2);
            Assert.AreEqual(0, root.Diagnostics.Count);
            Assert.AreEqual(0, root2.Diagnostics.Count);
        }
        [TestMethod]
        public void BoolDclBexprFail()
        {
            var root = Parse(new System.Text.StringBuilder("bool kage = true; bool k = kage == true;"));
            var root2 = Parse(new System.Text.StringBuilder("bool kage = true; bool k = 2 + 2 * 2 / 2 % 2 > 2;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Bool, "kage");
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(scope, root2);
            Assert.AreEqual(0, root.Diagnostics.Count);
            Assert.AreEqual(0, root2.Diagnostics.Count);
        }
    }
}