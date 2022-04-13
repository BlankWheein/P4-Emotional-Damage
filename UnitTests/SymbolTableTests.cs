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
            scope.Insert(0, "kage", false);

            Assert.AreEqual(1, scope.Symbols.Count);
            Assert.AreEqual("kage", scope.Symbols[0].Id);
        }
        [TestMethod]
        public void Insert_Symbol_Exit_Scope_Expected_Symbol_Not_Found()
        {
            var scope = new RootSymbolTable();
            scope.Allocate();
            scope.Insert(0, "kage", false);
            scope.ExitScope();
            var kage = scope.LookUp("kage");
            Assert.AreEqual(null, kage);
        }

        [TestMethod]
        public void LookUp_Symbol_Is_In_Any_Table_Expected_Equal_True()
        {
            var scope = new RootSymbolTable();
            scope.Insert(0, "test", false);
            scope.Allocate();
            Symbol? actual = scope.LookUp("test");

            Assert.AreEqual(actual?.Id, "test");
        }


        [TestMethod]
        public void LookUp_Symbol_Is_not_In_Any_Table_Expected_Equal_True()
        {
            var scope = new RootSymbolTable();
            scope.Insert(0, "test", false);
            scope.Allocate();
            Symbol? actual = scope.LookUp("test2");

            Assert.AreEqual(actual, null);
        }
    }
}   