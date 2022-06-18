using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class NumAssignTests : UnitTestInitializer
    {
        [TestMethod]
        public void TestIntAssign()
        {
            var root = Parse(new System.Text.StringBuilder("int k = 2; k = 2 * 6 + 7;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }
        [TestMethod]
        public void TestIntAssignFail()
        {
            var root = Parse(new System.Text.StringBuilder("int k = 2; k = 2 * 6 + 2.12;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "k");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }


        [TestMethod]
        public void TestIntDclFail()
        {
            var root = Parse(new System.Text.StringBuilder("float a = 2.14; int b = 3.7/a;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Float, "a");
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "b");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }

        [TestMethod]
        public void TestFloatDclSuccess()
        {
            var root = Parse(new System.Text.StringBuilder("int a = 77; float b=3/a;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "a");
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Float, "b");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(0, root.Diagnostics.Count);
        }


        [TestMethod]
        public void TestFloatDclArrayOperation()
        {
            var root = Parse(new System.Text.StringBuilder("int[2] a; float b=3/a;"));
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Aint, "a");
            scope.Insert(Compiler.SymbolTableFolder.SymbolType.Float, "b");
            Assert.AreNotEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
    }