using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestCompiler;
using TestCompiler.Exceptions;
using TestCompiler.Steps;

namespace TestProject1
{
    [TestClass]
    public class TypeCheckerTests
    {
        private Compiler Setup(string text)
        {
            StringBuilder builder = new StringBuilder();
            builder.AppendLine(text);
            return new Compiler(builder);
        }

        [TestMethod]
        public void Hej()
        {
            Compiler compiler = Setup("int kage = 2; float test = kage;");
            compiler.TestVisitor();

            Assert.AreEqual(1, compiler.BasicVisitor.Scope.Diagnostics.Count);
        }
        [TestMethod]
        public void He2j()
        {
            Compiler compiler = Setup("int kage = 2; int test = kage;");
            compiler.TestVisitor();

            Assert.AreEqual(0, compiler.BasicVisitor.Scope.Diagnostics.Count);
        }
    }
}
