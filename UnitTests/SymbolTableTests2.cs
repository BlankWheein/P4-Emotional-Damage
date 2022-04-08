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
            Symbol symbol = new("hej");
            Root.Current.Insert(symbol);

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


        [TestMethod]
        public void Allocate_3_SymbolTables_Expected_Equal_Count()
        {
            var Root = new RootSymbolTable();
            Symbol symbol = new("a");
            Root.Allocate();

            SymbolTable table1 = Root.Current;
            Root.Allocate();
            SymbolTable table2 = Root.Current;
            table2.Insert(symbol);

            Assert.AreEqual(table2.Symbols.Count, Root.Children[0].Children[0].Symbols.Count);
        }
    }
}