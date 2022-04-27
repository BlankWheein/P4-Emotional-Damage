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
    public class FuncChecking : UnitTestInitializer 
    {
        [TestMethod]
        public void FuncDcl()
        {
            var root = Parse(new StringBuilder("void kage() {float z = 6.9;}"));
            scope.Insert(SymbolType.Void, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Float, "z");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncWIthRightReturn()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Float, "z");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncWrongReturn()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return z;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void FuncWithoutReturn()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FucnWithTwoReturns()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return x; return z;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncReturnExpr()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return z + x;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncReturnBexpr()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return z > x;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncReturnInOtherScope()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; if(x > z) {return x;}}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.Allocate("If");
            scope.ExitScope();
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncVoidReturn()
        {
            var root = Parse(new StringBuilder("void kage() {int z = 6; float x = 6.9; return x;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
}
