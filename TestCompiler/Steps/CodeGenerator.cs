using Antlr4.Runtime;
using static TestGrammarParser;
using System.IO;
using System.Text;
using System;
using System.Linq;
using System.Diagnostics;
using Antlr4.Runtime.Tree;
using TestCompiler.Exceptions;
using System.Collections.Generic;

namespace TestCompiler.Steps
{

        public class CodeGenerator : TestGrammarBaseVisitor<object>, IDisposable, ICompilerStep
        {

        private string _path = @"../../../CompiledFiles/test.cs";
        private FileStream _fs;
        public SymbolTable? Scope { get; set; }

        public IEnumerable<Exception> Diagnostics => Scope.Diagnostics;
        #region Indent
        public string Indent = "";


        public void Increment()
            {
                Indent += "    ";
            }
        public void Decrement()
        {
            Indent = Indent.Substring(0, Indent.Length - 4);
        }
        #endregion
        #region Print
        public void Parse(PrintContext context, TextstringContext text)
            {
                AddText($"Console.WriteLine({text.GetText()});");
            }
            public void Parse(PrintContext context, BexprContext bexpr)
            {
                AddText($"Console.WriteLine({bexpr.GetText()});");
            }
        #endregion
        #region Assignment
        public void Parse(AssignmentContext context, ValtypeContext type)
        {
            AddText($"{type.GetText()} {context.id().GetText()} = {context.expr().GetText()};");
        }
        public void Parse(AssignmentContext context)
        {
            AddText($"{context.id().GetText()} = {context.expr().GetText()};");
        }
        #endregion
        #region Selective
        public void Parse(SelectiveContext context, IfstatementContext stmt)
        {
            AddText($"if ({context.bexpr()[0].GetText()}) ", newline:false);
            AddText("{", indent:false);
            Increment();
        }
        public void Parse(SelectiveContext context, ElifstatementContext stmt, BexprContext bexpr)
        {
            AddText($"else if ({bexpr.GetText()}) ", newline: false);
            AddText("{", indent:false);
            Increment();
        }

        public void Parse(SelectiveContext context, ElsestatementContext stmt)
        {
            AddText("else {");
            Increment();
        }

        #endregion
        #region Custom
        public void Parse(string custom)
        {
            if (custom == "end")
            {
                Decrement();
                AddText("}");
            }
            if (custom == "semicolon")
            {
                AddText(";", indent:false);
            }
        }
        #endregion
        #region Iterative
        public void Parse(IterativeContext context)
        {
            AddText($"for ({context.forassignment().valtype().GetText()} {context.forassignment().id().GetText()} = {context.forassignment().expr().GetText()}; {context.bexpr().GetText()}; {context.expr().GetText()}) ", newline: false);
            AddText("{", indent: false);
            Increment();
        }
        #endregion
        #region Constructor
        public CodeGenerator(SymbolTable? Scope)
        {
            if (File.Exists(_path))
                File.Delete(_path);
            _fs = File.Create(_path);
            AddText("using System;");
            AddText("namespace Test {");
            Increment();
            AddText("internal static partial class Program {");
            Increment();
            AddText("public static void Main() {");
            Increment();
            this.Scope = Scope;
        }
        #endregion
        private void AddText(string value, bool newline=true, bool indent=true)
        {
            string res = "";
            if (indent)
                res += Indent;
            res += value;
            if (newline)
                res += "\n";
            byte[] info = new UTF8Encoding(true).GetBytes(res);
            _fs.Write(info, 0, info.Length);
        }
        public void Dispose()
        {
            Decrement();
            AddText("}");
            Decrement();
            AddText("}");
            Decrement();
            AddText("}");
            _fs.Close();
            Process p = new Process();
            p.StartInfo.FileName = "cmd.exe";
            p.StartInfo.WorkingDirectory = @"../../../CompiledFiles/";
            p.StartInfo.Arguments = "/C csc test.cs";
            p.Start();
        }

        public override object VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }

        public override object VisitPrint(PrintContext context)
        {
            TextstringContext opinion;
            opinion = context.textstring();
            if (opinion != null)
                Parse(context, opinion);
            else
            {
                VisitBexpr(context.bexpr());
                Parse(context, context.bexpr());
            }
            return true;
        }

        public override object VisitAssignment(AssignmentContext context)
        {
            ValtypeContext valtype = context.valtype();
            ExprContext expr = context.expr();
            IdContext id = context.id();
            AssignmentLine line = new() { ValType = valtype?.GetText()?.Trim('"'), Expr = expr?.GetText()?.Trim('"'), Id = id?.GetText()?.Trim('"') };
            if (line.ValType == null)
            {
                var _symbol = Scope.Lookup(line?.Id);
                line.ValType = _symbol?.Type;
            }
            if (valtype?.GetText()?.Trim('"') != null)
                    Parse(context, valtype);
            else
                Parse(context);
            return true;
        }

        public override object VisitForassignment(ForassignmentContext context)
        {
            throw new NotImplementedException();
        }

        public override object VisitSelective(SelectiveContext context)
        {
            IfstatementContext ifstatement = context.ifstatement();
            var elifstatement = context.elifstatement();
            ElsestatementContext elsestatement = context.elsestatement();

            if (ifstatement != null)
            {
                VisitBexpr(context.bexpr().First());
                Parse(context, ifstatement);
                VisitStmts(context.stmts().First());
                Parse("end");
            }
            if (elifstatement.Length != 0)
            {
                for (int i = 1; i < elifstatement.Length + 1; i++)
                {
                    VisitBexpr(context.bexpr()[i]);
                    Parse(context, context.elifstatement()[i - 1], context.bexpr()[i]);
                    VisitStmts(context.stmts()[i]);
                    Parse("end");
                }
            }
            if (elsestatement != null)
            {
                Parse(context, elsestatement);
                VisitStmts(context.stmts().Last());
                Parse("end");
            }
            return true;
        }

        public override object VisitStmts(StmtsContext context)
        {
            if (context == null) { return true; }
            VisitStmt(context.stmt());
            VisitStmts(context.stmts());
            return true;
        }

        public override object VisitStmt(StmtContext context)
        {
            if (context == null) { return true; }
            if (context.assignment() != null)
                VisitAssignment(context.assignment());
            else if (context.print() != null)
                VisitPrint(context.print());
            else if (context.selective() != null)
                VisitSelective(context.selective());
            else if (context.iterative() != null)
                VisitIterative(context.iterative());
            return true;
        }

        public override object VisitIterative(IterativeContext context)
        {
            if (context.forassignment() != null)
            {
                //VisitForassignment(context.forassignment());
            }
            VisitBexpr(context.bexpr());
            VisitExpr(context.expr());
            Parse(context);
            VisitStmts(context.stmts());
            Parse("end");
            return true;
        }

        public override object VisitBexpr(BexprContext context)
        {
            if (context.bexpr().Length == 2)
                foreach (var t in context.bexpr())
                    VisitBexpr(t);
            else if (context.bexpr().Length == 1)
                foreach (var t in context.bexpr())
                    VisitBexpr(t);
            else
                VisitExpr(context.expr());

            return false;
        }

        public override object VisitExpr(ExprContext context)
        {
            if (context.expr().Length == 2)
            {
                foreach (var t in context.expr())
                {
                    VisitExpr(t);
                }
            }

            else if (context.expr().Length == 1)
                foreach (var t in context.expr())
                    VisitExpr(t);
            else
                VisitVal(context.val());

            return false;
        }

        public override object VisitVal(ValContext context)
        {
            if (context.num() != null)
            {
                string Value = context.num().GetText().Trim('"');
                if (int.TryParse(Value, out int result)
                || double.TryParse(Value, out double result2)
                || float.TryParse(Value, out float result3))
                    return true;
            }

            if (context.id() != null)
            {
            }
            return false;
        }
    }
}