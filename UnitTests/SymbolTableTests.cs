using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
namespace UnitTests
{
    [TestClass]
    public partial class SymbolTableTests
    {
        [TestMethod]
        public void TestMethod1()
        {
            var scope = new RootSymbolTable();
            scope.Current.Insert(0, "kage", false);

            Assert.AreEqual(1, scope.Current.Symbols.Count);
            Assert.AreEqual("kage", scope.Current.Symbols[0].ID);
        }
        [TestMethod]
        public void TestMethod2()
        {
            var scope = new RootSymbolTable();
            scope.Allocate();
            scope.Current.Insert(0, "kage", false);
            scope.ExitScope();
            var kage = scope.LookUp("kage");
            Assert.AreEqual(null, kage);
        }
    }
}