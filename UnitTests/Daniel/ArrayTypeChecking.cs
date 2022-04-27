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
    public class ArrayTypeChecking :UnitTestInitializer
    {
        [TestMethod]
        public void ArrayDCLSuccess()
        {
            var root = Parse(new StringBuilder("int[2] kage; float[5] kage2;"));
            scope.Insert(SymbolType.Aint, "kage", 2);
            scope.Insert(SymbolType.Afloat, "kage2", 5);
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void ArrayDCLFail()
        {
            var root = Parse(new StringBuilder("int[0] kage; float[0] kage2;"));
            scope.Insert(SymbolType.Aint, "kage", 0);
            scope.Insert(SymbolType.Afloat, "kage2", 0);
            Assert.AreNotEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);

        }

        [TestMethod]
        public void ArrayAssignSuccess()
        {
            var root = Parse(new StringBuilder("int[2] kage; kage[0]=5;kage[1]=7;"));
            Assert.AreEqual(0, root.Diagnostics.Count);
        }


        [TestMethod]
        public void ArrayAssignIndexOutOfBounds()
        {
            var root = Parse(new StringBuilder("int[2] kage; kage[2]=5;"));
            Assert.AreEqual(1, root.Diagnostics.Count);

        }

        [TestMethod]
        public void ArrayAssignIDNotDeclared()
        {
            var root = Parse(new StringBuilder("int[2] kage; kage[a]=5;"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void ArrayAssignIDNotInt()
        {
            var root = Parse(new StringBuilder("int[2] kage;float a=1.1; kage[a]=5;"));
            Assert.AreEqual(1, root.Diagnostics.Count);
        }


        [TestMethod]
        public void ArrayAssignMultiErrors()
        {
            var root = Parse(new StringBuilder("int[2] kage; float a=1.1; kage[a]=5; kage[b]=5; kage[9]=5;"));
            Assert.AreEqual(3, root.Diagnostics.Count);
        }
    }
}
