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
    public class MatrixTypeChecking : UnitTestInitializer
    {

        [TestMethod]
        public void MatrixDCLSuccess()
        {
            var root = Parse(new StringBuilder("int[2][4] kage;"));
            scope.Insert(SymbolType.Mint, "kage",2,4);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void MatrixDCLFail()
        {
            var root = Parse(new StringBuilder("int[0][2] kage;"));
            scope.Insert(SymbolType.Mint, "kage", 0, 2);
            Assert.AreNotEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);

        }

        [TestMethod]
        public void MatrixAssignSuccess()
        {
            var root = Parse(new StringBuilder("int[2][2] kage; kage[1][0]=5;kage[1][0]=7; kage[0][0]=5;"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }


        [TestMethod]
        public void MatrixAssignIndexOutOfBounds()
        {
            var root = Parse(new StringBuilder("int[2][2] kage; kage[2][2] = 5; kage[4][2] = 7;"));
            Assert.AreEqual(4, root.Diagnostics.Count);
        }

        [TestMethod]
        public void MatrixAssignIDNotDeclared()
        {
            var root = Parse(new StringBuilder("int[2][2] kage; kage[a][1]=5;"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void MatrixAssignIDNotInt()
        {
            var root = Parse(new StringBuilder("int[2][2] kage;float a=3.1; kage[a][1]=5;"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
}