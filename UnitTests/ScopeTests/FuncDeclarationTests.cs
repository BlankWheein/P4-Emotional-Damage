using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class FuncDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void FuncDeclare()
        {
            var root = Parse(new StringBuilder("int kage() {}"));
            scope.Insert(SymbolType.Func, "kage");
            scope.Allocate("Func");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith1Parameter()
        {
            var root = Parse(new StringBuilder("int kage(int x) {}"));
            scope.Insert(SymbolType.Func, "kage");
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "x");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith2Parameter()
        {
            var root = Parse(new StringBuilder("int kage(int x, int y) {}"));
            scope.Insert(SymbolType.Func, "kage");
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "x");
            scope.Insert(SymbolType.Int, "y");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith2ParameterFail()
        {
            var root = Parse(new StringBuilder("int kage(int x, int y) {}"));
            scope.Insert(SymbolType.Func, "kage");
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "y");
            Assert.AreNotEqual(scope, root);
        }
    }
}