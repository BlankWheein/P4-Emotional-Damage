using Microsoft.VisualStudio.TestTools.UnitTesting;
using Compiler.SymbolTableFolder;
using System.Text;

namespace ScopeTests
{
    [TestClass]
    public class FloatDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void FloatDeclation()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("float kage = 2;"));
            scope.Insert(new Symbol("kage", SymbolType.Float));
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void FloatDeclationWrongId()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("float kage = 2;"));
            scope.Insert(new Symbol("kage2", SymbolType.Float));
            Assert.AreNotEqual(scope, rootscope);
        }
        [TestMethod]
        public void FloatDeclationWrongType()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("int kage = 2;"));
            scope.Insert(new Symbol("kage", SymbolType.Float));
            Assert.AreNotEqual(scope, rootscope);
        }
        [TestMethod]
        public void FloatDeclationWrongSource()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("float kage;"));
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void FloatDeclationAlreadyDefined()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("float kage = 2; float kage = 2"));
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, rootscope);
        }
        [TestMethod]
        public void MultipleFloatDeclation()
        {
            RootSymbolTable rootscope = Parse(new StringBuilder("float kage = 2; float kage2 = 2"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Insert(SymbolType.Float, "kage2");
            Assert.AreEqual(scope, rootscope);
        }
    }
}   