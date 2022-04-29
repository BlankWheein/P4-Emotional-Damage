using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System.Text;

namespace UnitTests.ScopeTests
{
    [TestClass]
    public class SelectiveDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void IfDcl()
        {
            var root = Parse(new StringBuilder("int kage = 2; if (kage == kage) {}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Allocate("If");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElifDcl()
        {
            var root = Parse(new StringBuilder("int kage = 2; int test = 3;if (kage == test) {} elif (kage == test) {}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Insert(SymbolType.Int, "test");
            scope.Allocate("If");
            scope.ExitScope();
            scope.Allocate("Elif");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElifElseDcl()
        {
            var root = Parse(new StringBuilder("int kage = 2; if (kage == kage) {} elif (kage == kage) {} else {}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Allocate("If");
            scope.ExitScope();
            scope.Allocate("Elif");
            scope.ExitScope();
            scope.Allocate("Else");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElseDcl()
        {
            var root = Parse(new StringBuilder("float kage = 2.0; if (kage == kage) {} else {}"));
            scope.Insert(SymbolType.Float, "kage");
            scope.Allocate("If");
            scope.ExitScope();
            scope.Allocate("Else");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElseWithBodyDcl()
        {
            var root = Parse(new StringBuilder("float kagew = 2.0; int kage2w = 2; if (kagew == kage2w) {int kage = 2;} else {float kage = 2.0;}"));
            scope.Insert(SymbolType.Float, "kagew");
            scope.Insert(SymbolType.Int, "kage2w");
            scope.Allocate("If");
            scope.Insert(SymbolType.Int, "kage");
            scope.ExitScope();
            scope.Allocate("Else");
            scope.Insert(SymbolType.Float, "kage");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElseWithBodyDcl2()
        {
            var root = Parse(new StringBuilder("int kagew = 2; if (kagew == kagew) {int kage = 2;} else {float kage = 2.0;}"));
            scope.Insert(SymbolType.Int, "kagew");
            scope.Allocate("If");
            scope.Insert(SymbolType.Int, "kage");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage");
            scope.Allocate("Else");
            Assert.AreNotEqual(scope, root);
        }
    }
}
