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
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return x;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncReturnBexpr()
        {
            var root = Parse(new StringBuilder("bool kage() {int z = 6; float x = 6.9; bool test = z > x; return test;}"));
            scope.Insert(SymbolType.Bool, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
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
            var root = Parse(new StringBuilder("float kage() {int z = 6; float x = 6.9; return x;} int kage2 = 5; float kage3 = kage(kage2);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
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
            var root = Parse(new StringBuilder("float kage(int x, float y, string elite) {int z = 6; float q = 6.9; return x;} float kage2 = 6.9; int kage3 = 75; bool kage4 = true; float kage5 = kage(kage2, kage4, kage3);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Float), new("elite", SymbolType.String)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "q");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage2");
            scope.Insert(SymbolType.Int, "kage3");
            scope.Insert(SymbolType.Bool, "kage4");
            scope.Insert(SymbolType.Float, "kage5");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncCallRightParameters()
        {
            var root = Parse(new StringBuilder("float kage(int x, float y, bool elite) {int z = 6; float q = 6.9; return x;} int kage2 = 69; float kage3 = 75.5; bool kage4 = true; float kage5 = kage(kage2, kage3, kage4);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("x", SymbolType.Int), new("y", SymbolType.Float), new("elite", SymbolType.Bool) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "q");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage3");
            scope.Insert(SymbolType.Bool, "kage4");
            scope.Insert(SymbolType.Float, "kage5");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncIntParameterFloat()
        {
            var root = Parse(new StringBuilder("float kage(float q) {int z = 6; float x = 6.9; return x;} int kage2 = 69; float kage3 = kage(kage2);"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage2");
            scope.Insert(SymbolType.Float, "kage3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncNestedFunc()
        {
            var root = Parse(new StringBuilder("float kage(float q) {int z = 6; float x = 6.9; float kage2(float l) {int w = 420; float k = 0.69 + l; return k;} return x;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.Insert(SymbolType.Float, "kage2", parameters: new List<Symbol>() { new("l", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "w");
            scope.Insert(SymbolType.Float, "k");
            scope.ExitScope();
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        //Why do we expect errors here?
        [TestMethod]
        public void FuncSameParameters()
        {
            var root = Parse(new StringBuilder("float kage(float q) {int z = 6; float x = 6.9; return x;} float kage2(float q) {int w = 420; float k = 0.69 + q; return k;}"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage2", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "w");
            scope.Insert(SymbolType.Float, "k");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncReturnOutside()
        {
            var root = Parse(new StringBuilder("float kage(float q) {int z = 6; float x = 6.9;} return x;"));
            scope.Insert(SymbolType.Float, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncSameName()
        {
            var root = Parse(new StringBuilder("void kage(float q) {int z = 6; float x = 6.9;}"));
            scope.Insert(SymbolType.Void, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

    }
}
