using Microsoft.VisualStudio.TestTools.UnitTesting;
using ScopeTests;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Compiler.SymbolTableFolder;

namespace UnitTests.Daniel
{
    [TestClass]
    public class DanielsBaby : UnitTestInitializer
    {
        [TestMethod]
        public void Ting()
        {
            var root = Parse(new StringBuilder("int kage = 2; if (kage == 2)  { float kage = 3.0;}"));
            scope.Insert(SymbolType.Int, "kage");
            scope.Allocate("If");
            Assert.AreEqual(scope, root);
            Assert.AreEqual(1, root.Diagnostics.Count);
        }
    }
}
