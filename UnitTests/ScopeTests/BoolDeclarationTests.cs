using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class BoolDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void BoolDcltrue()
        {
            var rootscope = Parse(new StringBuilder("bool kage = true;"));
            scope.Insert(SymbolType.Bool, "kage");
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void BoolDclfalse()
        {
            var rootscope = Parse(new StringBuilder("bool kage = false;"));
            scope.Insert(SymbolType.Bool, "kage");
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void BoolDclduplicate()
        {
            var rootscope = Parse(new StringBuilder("bool kage = false; bool kage = true;"));
            scope.Insert(SymbolType.Bool, "kage");
            Assert.AreEqual(scope, rootscope);
        }
    }
}