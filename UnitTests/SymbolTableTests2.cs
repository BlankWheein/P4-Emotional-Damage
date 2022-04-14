using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
namespace UnitTests
{
    public partial class SymbolTableTests
    {

        [TestMethod]
        public void Insert_Symbol_ID_Is_Reserved_Keyword_Expected_Diagnostics_Count_Is_1()
        {
            var Root = new RootSymbolTable();
            Symbol symbol = new("TestingReservedKeyword");
            Root.Insert(symbol);

            Assert.IsTrue(Root.Diagnostics.Count == 1);
            Assert.IsTrue(Root.Symbols.Count == 0);
        }
        [TestMethod]
        public void Insert_Symbol_ID_Is_In_SymbolTable_Expected_Diagnostics_Count_Is_1()
        {
            var Root = new RootSymbolTable();
            Symbol symbol = new("a");
            Symbol symbol2 = new("a");
            Root.Insert(symbol);
            Root.Insert(symbol2);

            Assert.IsTrue(Root.Symbols.Count == 1);
            Assert.IsTrue(Root.Diagnostics.Count == 1);
        }
    }
}