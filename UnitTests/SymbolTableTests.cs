using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
namespace UnitTests
{
    [TestClass]
    public partial class SymbolTableTests
    {
        [TestMethod]
        public void Insert_Symbol_Expected_Count_Is_1_AND_ID_Is_Equal()
        {
            var scope = new RootSymbolTable();
            scope.Current.Insert(0, "kage", false);

            Assert.AreEqual(1, scope.Current.Symbols.Count);
            Assert.AreEqual("kage", scope.Current.Symbols[0].ID);
        }
        [TestMethod]
        public void Insert_Symbol_Exit_Scope_Expected_Symbol_Not_Found()
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