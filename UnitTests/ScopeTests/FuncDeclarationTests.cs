using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Collections.Generic;
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
            scope.Insert(SymbolType.Int, "kage", parameters: new List<Symbol> () { });
            scope.Allocate("Func");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith1Parameter()
        {
            var root = Parse(new StringBuilder("int kage(int x) {}"));
            scope.Insert(SymbolType.Int, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int) });
            scope.Allocate("Func");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith2Parameter()
        {
            var root = Parse(new StringBuilder("int kage(int x, int y) {}"));
            scope.Insert(SymbolType.Int, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Int) });
            scope.Allocate("Func");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void FuncDeclareWith2ParameterFail()
        {
            var root = Parse(new StringBuilder("int kage(int x, int y) {}"));
            scope.Insert(SymbolType.Int, "kage", parameters: new List<Symbol>() { new("y", SymbolType.Int) });
            scope.Allocate("Func");
            Assert.AreNotEqual(scope, root);
        }
    }
}