using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class NumAssignTests : UnitTestInitializer
    {
        [TestMethod]
        public void TestIntAssign()
        {
            var root = Parse(new System.Text.StringBuilder("int k = 2; k = 2 * 6 + 7;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void TestIntAssignFail()
        {
            var root = Parse(new System.Text.StringBuilder("int k = 2; k = 2 * 6 + 2.12;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

    }
}