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
            scope.Insert(SymbolType.Void, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncCall()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return x;} kage();"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
         [TestMethod]
        public void FuncCallWrongParameter()
        {
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return x;} int kage2; kage(kage2);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        public void FuncCallRightParameter()
        {
            var root = Parse(new StringBuilder("float kage(int x) {float z = 6.9 + x; return z;} int kage2 = 5; kage(kage2);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Float, "z");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncCallWrongParameters()
        {
            var root = Parse(new StringBuilder("float kage(int x, float y, string elite) {int z = 6; float x = 6.9; return x;} float kage2 = 6.9; int kage3 = 75; bool kage4 = true; int kage(kage2, kage3, kage4);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Float), new("elite", SymbolType.String)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage2");
            scope.Insert(SymbolType.Int, "kage3");
            scope.Insert(SymbolType.Bool, "kage4");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncCallRightParameters()
        {
            var root = Parse(new StringBuilder("float kage(int x, float y, string elite) {int z = 6; float x = 6.9; return x;} int kage2 = 6.9; float kage3 = 75; string kage4 = \"Din mor\"; int kage(kage2, kage3, kage4);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Float), new("elite", SymbolType.String) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage3");
            scope.Insert(SymbolType.String, "kage4");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
    }
}
