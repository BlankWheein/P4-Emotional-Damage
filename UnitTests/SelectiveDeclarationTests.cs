using Compiler.SymbolTableFolder;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Text;

namespace ScopeTests
{
    [TestClass]
    public class SelectiveDeclarationTests : UnitTestInitializer
    {
        [TestMethod]
        public void IfDcl()
        {
            var root = Parse(new StringBuilder("if (1 == 2) {}"));
            scope.Allocate("If");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElifDcl()
        {
            var root = Parse(new StringBuilder("if (1 == 2) {} elif (1 == 2) {}"));
            scope.Allocate("If");
            scope.ExitScope();
            scope.Allocate("Elif");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElifElseDcl()
        {
            var root = Parse(new StringBuilder("if (1 == 2) {} elif (1 == 2) {} else {}"));
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
            var root = Parse(new StringBuilder("if (1 == 2) {} else {}"));
            scope.Allocate("If");
            scope.ExitScope();
            scope.Allocate("Else");
            Assert.AreEqual(scope, root);
        }
        [TestMethod]
        public void IfElseWithBodyDcl()
        {
            var root = Parse(new StringBuilder("if (1 == 2) {int kage = 2;} else {float kage = 2.0;}"));
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
            var root = Parse(new StringBuilder("if (1 == 2) {int kage = 2;} else {float kage = 2.0;}"));
            scope.Allocate("If");
            scope.Insert(SymbolType.Int, "kage");
            scope.ExitScope();
            scope.Insert(SymbolType.Float, "kage");
            scope.Allocate("Else");
            Assert.AreNotEqual(scope, root);
        }
    }
}
