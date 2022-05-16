using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;

namespace UnitTests
{
    [TestClass]
    public class TypeCheckerUnitTests : UnitTestInitializer
    {
        [TestMethod]
        public void IsVariablesDeclaredTest1()
        {
            string expr = "2 * x";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.IsVariablesDeclared(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(1, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void IsVariablesDeclaredTest5()
        {
            string expr = "2 * x + y / l - d % k";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.IsVariablesDeclared(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(5, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void IsVariablesDeclaredTest0()
        {
            string expr = "2 * 5";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.IsVariablesDeclared(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(0, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void FixMatrixArrayTypeTest0()
        {
            string bexpr = "x >= y";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "x");
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "y");
            TypeChecker.IsValidBexpr(bexpr.Replace(" ", ""));
            Assert.AreEqual(0, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void FixMatrixArrayTypeTest1()
        {
            string bexpr = "y>=x";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "x");
            TypeChecker.IsValidBexpr(bexpr);
            Assert.AreEqual(1, TypeChecker.Scope.Diagnostics.Count);
        }

        [TestMethod]
        public void GetExprVariableNoFuncTest()
        {
            string expr = "x*4+y";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            Assert.AreEqual(2, TypeChecker.GetExprVariableNoFunc(expr).Count);
        }

        [TestMethod]
        public void CanUseRowColLenTest()
        {
            string expr = "x*4+y.row";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Mint, "y");
            TypeChecker.CanUseRowColLen(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(0, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void CanUseRowColLenTest1()
        {
            string expr = "x*4+y.row";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Int, "y");
            TypeChecker.CanUseRowColLen(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(1, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void CanUseRowColLenTest1_()
        {
            string expr = "x*4+y.row";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Aint, "y");
            TypeChecker.CanUseRowColLen(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(1, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void CanUseRowColLenTest1_A()
        {
            string expr = "x*4+y.len";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Aint, "y");
            TypeChecker.CanUseRowColLen(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(0, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void CanParseMultiDimensionalVariablesTest()
        {
            string expr = "x[1][1]";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Mint, "x", row:2, col:2);
            TypeChecker.CanParseMultiDimensionalVariables(expr, new Compiler.SymbolTableFolder.Symbol("x", Compiler.SymbolTableFolder.SymbolType.Int, row:2, col:2));
            Assert.AreEqual(0, TypeChecker.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void CanParseMultiDimensionalVariablesTest2()
        {
            string expr = "x[2][2]";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Mint, "x", row: 2, col: 2);
            TypeChecker.CanParseMultiDimensionalVariables(expr, new Compiler.SymbolTableFolder.Symbol("x", Compiler.SymbolTableFolder.SymbolType.Int, row: 2, col: 2));
            Assert.AreEqual(2, TypeChecker.Scope.Diagnostics.Count);
        }

        [TestMethod]
        public void DoesVariableReturnCompatibleTypeTest()
        {
            string expr = "x[2][2]";
            TypeChecker = new(new Compiler.Phases.ScopeVisitorV2());
            TypeChecker.Scope.Insert(Compiler.SymbolTableFolder.SymbolType.Mint, "x", row: 2, col: 2);
            TypeChecker.DoesVariableReturnCompatibleType(expr, Compiler.SymbolTableFolder.SymbolType.Int);
            Assert.AreEqual(2, TypeChecker.Scope.Diagnostics.Count);
        }


    }
}