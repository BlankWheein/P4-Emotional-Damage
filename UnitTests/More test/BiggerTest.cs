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
    public class BiggerTest : UnitTestInitializer
    {
        [TestMethod]
        public void LinearSearch()
        {
            var root = Parse(new StringBuilder("bool linearSearch(int[6] arr, int key){ int z = arr.len; bool k = false; for(int i = 0;i < z; i++){ int kage = arr[i]; if(kage == key){ k = true; } } return k; } int[6] a1; int key = 50; bool result = true; result = linearSearch(a1, key); print($\"{key} is found at index: {result}\");"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void Transpose()
        {
            var root = Parse(new StringBuilder("int main() { int[10][10] a; int[10][10] transpose; int r = 5; int c = 5; println(\"Enter rows and columns: \"); println(\"Enter matrix elements: \"); for (int i = 0; i < r; i++){ for (int j = 0; j < c; j++) { a[i][j] = a[i][j] + 4; } } for (int i = 0; i < r; i++){ for (int j = 0; j < c; j++) { transpose[j][i] = a[i][j]; } } println(\"Transpose of the matrix:\"); for (int i = 0; i < c; i++){ for (int j = 0; j < r; j++) { int kage = transpose[i][j]; print($\"{kage}\"); r = r -1; if (j == r){ println(\"\");} } } // kagee \n int olo = 0; return olo; }"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void ValueAndFloatValue()
        {
            var root = Parse(new StringBuilder("float a = 4.0; float c = 5; float h = a + c * 20; float b = a + 4; h = h + b; float ac = a\\\\c;"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void BigAutoGradTest()
        {
            var root = Parse(new StringBuilder("float a = -4.0; float b = 2.0; float c = a + b; float d = a * b + b **3; c = c + c + 1; c = c + 1 + c + (-a); float k1 = (b + a); k1.relu; float k2 = (b - a); k2.relu; d = d + d * 2 + k1; d = d + 3 * d + k2; float e = c - d; float f = e **2; float g = f / 2.0; g = g + 10.0 / f; println($\"{g}\"); float x = g \\\\ a; float x2 = g \\\\ b; println(x); println(x2);"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void ValueAndFloatValueButItHasToFail()
        {
            var root = Parse(new StringBuilder("float a = 4.0; float h = a + c * 20; float b = a + 4; h = h + b; float ac = ac\\\\c;"));
            Assert.AreEqual(3, root.Diagnostics.Count);
        }
    }
}
