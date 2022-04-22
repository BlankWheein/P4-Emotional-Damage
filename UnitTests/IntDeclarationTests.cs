using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
using System.Text;
using static EmotionalDamageParser;
using Antlr4.Runtime;
using Compiler.Phases;

namespace ScopeTests
{
    [TestClass]
    public class IntDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void IntDeclation()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2;"));
            scope.Insert(new Symbol("kage", SymbolType.Int));
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void IntDeclationWrongId()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2;"));
            scope.Insert(new Symbol("kage2", SymbolType.Int));
            Assert.AreNotEqual(scope, rootscope);
        }
        [TestMethod]
        public void IntDeclationWrongType()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2;"));
            scope.Insert(new Symbol("kage", SymbolType.Float));
            Assert.AreNotEqual(scope, rootscope);
        }
        [TestMethod]
        public void IntDeclationWrongSource()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage;"));
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void IntDeclationAlreadyDefined()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2; int kage = 2"));
            scope.Insert(SymbolType.Int, "kage");
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void MultipleIntDeclation()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2; int kage2 = 2"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "kage2");
            Assert.AreEqual(scope, rootscope);
        }
    }
}   