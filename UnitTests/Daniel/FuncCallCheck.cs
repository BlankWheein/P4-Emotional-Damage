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
    public class FuncCallCheck :UnitTestInitializer 
    {
        [TestMethod]
        public void BoolCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} bool k = true; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void BoolCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} bool k = true; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} int k = 5; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} int k = 5; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} float k = 5.9; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} float k = 5.8; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} float k = 5.7; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} float k = 5.7; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} float k = 5.7; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} float k = 5.6; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} float k = 5.7; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} float k = 5.7; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} int[3] k; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntArrCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} int[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() { int[3] lol; return lol;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} int[4][4] k; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void IntMatCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} int[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} float[4][4] k; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatMatCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} float[4][4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallVoid()
        {
            var root = Parse(new StringBuilder("void kage() {} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallInt()
        {
            var root = Parse(new StringBuilder("int kage() {int z = 6; return z;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallFloat()
        {
            var root = Parse(new StringBuilder("float kage() {float z = 6.9; return z;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallIntArr()
        {
            var root = Parse(new StringBuilder("int[3] kage() {int[3] lol; return lol;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallBool()
        {
            var root = Parse(new StringBuilder("bool kage() {bool l = false; return l;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallIntMat()
        {
            var root = Parse(new StringBuilder("int[4][4] kage() {int[4][4] l; return l;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallFloatMat()
        {
            var root = Parse(new StringBuilder("float[4][4] kage() {float[4][4] l; return l;} float[4] k; k = kage();"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void FloatArrCallFloatArr()
        {
            var root = Parse(new StringBuilder("float[4] kage() {float[4] l; return l;} float[4] k; k = kage();"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
    }
}
