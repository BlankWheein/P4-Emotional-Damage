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
    public class BoolTypeChecking : UnitTestInitializer
    {
        [TestMethod]
        public void BoolDcl()
        {
            var root = Parse(new StringBuilder("bool b = true; bool b2 = false; bool b3 = b == b2;"));
            scope.Insert(SymbolType.Bool, "b");
            scope.Insert(SymbolType.Bool, "b2");
            scope.Insert(SymbolType.Bool, "b3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void BoolDcl2()
        {
            var root = Parse(new StringBuilder("bool b = true; bool b3 = b != b;"));
            scope.Insert(SymbolType.Bool, "b");
            scope.Insert(SymbolType.Bool, "b3");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void BoolDclFail()
        {
            var root = Parse(new StringBuilder("bool b = true; bool b2 = false; bool b3 = b > b2; bool b4 = b >= b3;"));
            scope.Insert(SymbolType.Bool, "b");
            scope.Insert(SymbolType.Bool, "b2");
            scope.Insert(SymbolType.Bool, "b3");
            scope.Insert(SymbolType.Bool, "b4");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }
        [TestMethod]
        public void BoolDclFail2()
        {
            var root = Parse(new StringBuilder("bool b = true; bool b2 = false; bool b3 = b < b2; bool b4 = b <= b2;"));
            scope.Insert(SymbolType.Bool, "b");
            scope.Insert(SymbolType.Bool, "b2");
            scope.Insert(SymbolType.Bool, "b3");
            scope.Insert(SymbolType.Bool, "b4");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(2, root.Diagnostics.Count);
        }

        [TestMethod]
        public void UseBoolAsInt()
        {
            var root = Parse(new StringBuilder("bool k = true; int ting = k;"));
            scope.Insert(SymbolType.Bool, "k");
            scope.Insert(SymbolType.Int, "ting");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void UseBoolAsFloat()
        {
            var root = Parse(new StringBuilder("bool k = true; float ting = k;"));
            scope.Insert(SymbolType.Bool, "k");
            scope.Insert(SymbolType.Float, "ting");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
        [TestMethod]
        public void IfStatementTests()
        {
            var root = Parse(new StringBuilder("bool k = true;if (k == true) {}"));
            scope.Insert(SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void IfStatementTests2()
        {
            var root = Parse(new StringBuilder("bool k = true;if (k == false) {}"));
            scope.Insert(SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void IfStatementTests3()
        {
            var root = Parse(new StringBuilder("bool k = true;if (k == k) {}"));
            scope.Insert(SymbolType.Bool, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
    }
    }
