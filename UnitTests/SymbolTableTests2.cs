using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
namespace UnitTests
{
    public partial class SymbolTableTests
    {

        [TestMethod]
        public void TestMehod2()
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