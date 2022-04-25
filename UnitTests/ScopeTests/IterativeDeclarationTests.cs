using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;


namespace UnitTests.ScopeTests
{
    [TestClass]
    public class IterativeDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void WhileDclNoBody()
        {
            var root = Parse(new StringBuilder("while (1 == 2) {}"));
            scope.Allocate("While");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void WhileDclBody()
        {
            var root = Parse(new StringBuilder("while (1 == 2) {int kage = 2;}"));
            scope.Allocate("While");
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void WhileDclNoBody2()
        {
            var root = Parse(new StringBuilder("int kage = 2;while (kage == 2) {int kage2 = 2;}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Allocate("While");
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
        }

        [TestMethod]
        public void ForDcl()
        {
            var root = Parse(new StringBuilder("for (int i = 0; i < 10; i++) {}"));
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            Assert.AreEqual(scope, root);
        }

        [TestMethod]
        public void ForDcl2()
        {
            var root = Parse(new StringBuilder("for (int i = 0; i < 10; i--) {}"));
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void ForDclBody()
        {
            var root = Parse(new StringBuilder("for (int i = 0; i < 10; i--) {print(i);float kage = 2;}"));
            scope.Allocate("For");
            scope.Insert(SymbolType.Int, "i");
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
        }

    }

}