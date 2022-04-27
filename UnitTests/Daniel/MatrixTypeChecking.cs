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
    class MatrixTypeChecking : UnitTestInitializer
    {

        [TestMethod]
        public void MatrixDCLSuccess()
        {
            var root = Parse(new StringBuilder("float kage = sqrt 5 ;"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }

        [TestMethod]
        public void MatrixDCLFail()
        {

        }

        [TestMethod]
        public void MatrixAssignSuccess()
        {
        }


        [TestMethod]
        public void MatrixAssignIndexOutOfBounds()
        {
        }

        [TestMethod]
        public void MatrixAssignIDNotDeclared()
        {
        }

        [TestMethod]
        public void MatrixAssignIDNotInt()
        {
        }
    }
}