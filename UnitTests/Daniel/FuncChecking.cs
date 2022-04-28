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
            var source = new StringBuilder(  "float kage(int x, float y, string elite) {int z = 6; float q = 6.9; return x;}");
            source.Append(                  "float kage2 = 6.9; int kage3 = 75; bool kage4 = true;");
            source.Append(                  "float kage5 = kage(kage2, kage4, kage3);");
            var root = Parse(source);
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
            Assert.AreEqual(3, root.Diagnostics.Count);
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
            Assert.AreEqual(9, root.Diagnostics.Count);
        }
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
            Assert.AreEqual(0, root.Diagnostics.Count);
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
            var root = Parse(new StringBuilder("void kage(float q) {int z = 6; float x = 6.9;} int kage = 5;"));
            scope.Insert(SymbolType.Void, "kage", parameters: new List<Symbol>() { new("q", SymbolType.Float) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Int, "z");
            scope.Insert(SymbolType.Float, "x");
            scope.ExitScope();
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncArrSucces()
        {
            var root = Parse(new StringBuilder("int[3] kage(int[2] a, int[3] a2) {int[3] ice = a[1] + a2[2]; return ice;} int[2] arr; int[3] lol; final[3] = kage(arr, lol);"));
            scope.Insert(SymbolType.Aint, "kage", row: 3, parameters: new List<Symbol>() { new("a", SymbolType.Aint, row: 2), new("a2", SymbolType.Aint, row: 3) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Aint, "ice", row: 3);
            scope.ExitScope();
            scope.Insert(SymbolType.Aint, "arr", row: 2);
            scope.Insert(SymbolType.Aint, "lol", row: 3);
            scope.Insert(SymbolType.Aint, "final", row: 3);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncArrFails()
        {
            var root = Parse(new StringBuilder("int[3] kage(int[2] a, int[3] a2) {int[2] ice = a[1] + a2[2]; return ice;} int[2] arr; int[3] lol; final[1] = kage(arr, lol);"));
            scope.Insert(SymbolType.Aint, "kage", row: 3, parameters: new List<Symbol>() { new("a", SymbolType.Aint, row: 2), new("a2", SymbolType.Aint, row: 3) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Aint, "ice", row: 2);
            scope.ExitScope();
            scope.Insert(SymbolType.Aint, "arr", row: 2);
            scope.Insert(SymbolType.Aint, "lol", row: 3);
            scope.Insert(SymbolType.Aint, "final", row: 1);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncWrongArrDim()
        {
            var root = Parse(new StringBuilder("int[2] kage(int[2] a) {int[2] ice = a[1]; return ice;} int[1] arr; final[2] = kage(arr);"));
            scope.Insert(SymbolType.Aint, "kage", row: 2, parameters: new List<Symbol>() { new("a", SymbolType.Aint, row: 2)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Aint, "ice", row: 2);
            scope.ExitScope();
            scope.Insert(SymbolType.Aint, "arr", row: 1);
            scope.Insert(SymbolType.Aint, "final", row: 2);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncWrongArrDim2()
        {
            var root = Parse(new StringBuilder("int[2] kage(int[2] a) {int[2] ice = a[1]; return ice;} int[5] arr; final[2] = kage(arr);"));
            scope.Insert(SymbolType.Aint, "kage", row: 2, parameters: new List<Symbol>() { new("a", SymbolType.Aint, row: 2) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Aint, "ice", row: 2);
            scope.ExitScope();
            scope.Insert(SymbolType.Aint, "arr", row: 5);
            scope.Insert(SymbolType.Aint, "final", row: 2);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncMatSucces()
        {
            var root = Parse(new StringBuilder("int[3][3] kage(int[2][2] m, int[3][3] m2) {int[3][3] ice = m[1][1] + m2[2][2]; return ice;} int[2][2] mat; int[3][3] lol; final[3][3] = kage(mat, lol);"));
            scope.Insert(SymbolType.Mint, "kage", row: 3, col: 3, parameters: new List<Symbol>() { new("m", SymbolType.Aint, row: 2, col: 2), new("m2", SymbolType.Aint, row: 3, col: 3) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Mint, "ice", row: 3, col: 3);
            scope.ExitScope();
            scope.Insert(SymbolType.Mint, "mat", row: 2, col: 2);
            scope.Insert(SymbolType.Mint, "lol", row: 3, col: 3);
            scope.Insert(SymbolType.Mint, "final", row: 3, col: 3);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncMatFails()
        {
            var root = Parse(new StringBuilder("int[3][1] kage(int[1][2] m, int[9][3] m2) {int[3][3] ice = m[1][1] + m2[2][2]; return ice;} int[2][2] mat; int[3][3] lol; final[3][5] = kage(mat, lol);"));
            scope.Insert(SymbolType.Mint, "kage", row: 3, col: 3, parameters: new List<Symbol>() { new("m", SymbolType.Aint, row: 1, col: 2), new("m2", SymbolType.Aint, row: 9, col: 3) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Mint, "ice", row: 3, col: 3);
            scope.ExitScope();
            scope.Insert(SymbolType.Mint, "mat", row: 2, col: 2);
            scope.Insert(SymbolType.Mint, "lol", row: 3, col: 3);
            scope.Insert(SymbolType.Mint, "final", row: 3, col: 5);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncMatDim()
        {
            var root = Parse(new StringBuilder("int[3][3] kage(int[3][3] m) {int[3][3] ice = m[1][1]; return ice;} int[2][2] mat; final[3][3] = kage(mat);"));
            scope.Insert(SymbolType.Mint, "kage", row: 3, col: 3, parameters: new List<Symbol>() { new("m", SymbolType.Aint, row: 3, col: 3)}, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Mint, "ice", row: 3, col: 3);
            scope.ExitScope();
            scope.Insert(SymbolType.Mint, "mat", row: 2, col: 2);
            scope.Insert(SymbolType.Mint, "final", row: 3, col: 3);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FuncMatDim2()
        {
            var root = Parse(new StringBuilder("int[3][3] kage(int[3][3] m) {int[3][3] ice = m[1][1]; return ice;} int[5][7] mat; final[3][3] = kage(mat);"));
            scope.Insert(SymbolType.Mint, "kage", row: 3, col: 3, parameters: new List<Symbol>() { new("m", SymbolType.Aint, row: 3, col: 3) }, isfunc: true);
            scope.Allocate("Func");
            scope.Insert(SymbolType.Mint, "ice", row: 3, col: 3);
            scope.ExitScope();
            scope.Insert(SymbolType.Mint, "mat", row: 5, col: 7);
            scope.Insert(SymbolType.Mint, "final", row: 3, col: 3);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(3, root.Diagnostics.Count);
        }
    }
}
