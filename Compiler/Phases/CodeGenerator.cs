using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;
using System.Text;
using System.Linq;
using static EmotionalDamageParser;

namespace Compiler.Phases
{
    public class CodeGenerator : EmotionalDamageBaseVisitor<object>
    {
        private string _path = @"../../../../Target/Program.cs";
        private FileStream _fs;

        public CodeGenerator()
        {
            if (File.Exists(_path))
                File.Delete(_path);
            _fs = File.Create(_path);
            AddStmt("using AutoGrad;\n");
        }
        #region Indent
        public string Indent = "";
        public void Increment()
        {
            Stmts.Add(() => Indent += "    ");
        }
        public void Decrement()
        {
            Stmts.Add(() => Indent = Indent[0..^4]);
        }
        #endregion

        public void Compile()
        {
            foreach (var stmt in Stmts)
                stmt();
            _fs.Close();
        }
        public void AddText(string value, bool newline = true, bool indent = true)
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
        public List<Action> Stmts { get; set; } = new();
        private void AddStmt(string v, bool newline = true, bool indent = true)
        {
            Stmts.Add(() => AddText(v, newline, indent));
        }
        public override object VisitIfstmt([NotNull] IfstmtContext context)
        {
            AddStmt($"if ({context.bexpr().GetText()}) {{");
            Increment();
            VisitBlock(context.block());
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitElifstmt([NotNull] ElifstmtContext context)
        {
            AddStmt($"else if ({context.bexpr().GetText()}) {{");
            Increment();
            VisitBlock(context.block());
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitElsestmt([NotNull] ElsestmtContext context)
        {
            AddStmt($"else {{");
            Increment();
            VisitBlock(context.block());
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitPrintln([NotNull] PrintlnContext context)
        {
            string text = "Console.WriteLine(";
            if (context.STRING_CONSTANT() != null)
            {
                text += "$";
                text += context.STRING_CONSTANT().GetText();
            }
            else
                text += context.bexpr().GetText();
            text += ");";
            AddStmt(text);

            return base.VisitPrintln(context);
        }
        public override object VisitPrint([NotNull] PrintContext context)
        {
            string text = "Console.Write(";
            if (context.STRING_CONSTANT() != null)
            {
                text += "$";
                text += context.STRING_CONSTANT().GetText();
            }
            else
                text += context.bexpr().GetText();
            text += ");";
            AddStmt(text);
            return base.VisitPrint(context);
        }
        public override object VisitIntdcl([NotNull] IntdclContext context)
        {
            string ting = context.numexpr() == null ? $"int {context.id().GetText()};" : $"int {context.id().GetText()} = {context.numexpr().GetText()};";
            AddStmt(ting);
            return false;
        }
        public override object VisitForstmt([NotNull] ForstmtContext context)
        {
            string text = "for (";
            if (context.intdcl() != null)
                text += $"int {context.intdcl().id().GetText()} = {context.intdcl().numexpr().GetText()}";
            text += ";";
            text += context.bexpr().GetText() + ";";
            text += context.unaryoperator().GetText() + ")";
            AddStmt(text + "{");
            Increment();
            VisitBlock(context.block());
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitWhilestmt([NotNull] WhilestmtContext context)
        {

            AddStmt($"while ({context.bexpr().GetText()}) {{");
            Increment();
            VisitBlock(context.block());
            Decrement();
            AddStmt("}");
            return base.VisitWhilestmt(context);
        }
        public override object VisitFloatdcl([NotNull] FloatdclContext context)
        {
            string expr = context.numexpr().GetText();
            char prev = 'x';
            for (int i = 0; i < expr.Length; i++)
            {
                char c = expr[i];
                if (i == expr.Length - 1 && char.IsDigit(c))
                    expr += "f";
                if (char.IsDigit(c) || char.IsLetter(c))
                {
                    prev = c;
                    continue;
                };
                if (char.IsSymbol(c) || char.IsDigit(prev))
                    expr = expr.Replace($"{prev}{c}", $"{prev}f {c} ");
            }
            string ting = context.numexpr() == null ? $"float {context.id().GetText()};" : $"float {context.id().GetText()} = {expr};";
            AddStmt(ting);
            return false;
        }
        public override object VisitFunc([NotNull] FuncContext context)
        {
            BlockContext block = context.block();
            string text = $"{context.rettype().GetText()} {context.id().GetText()} ( {context.parameters().GetText().Replace(":", " ")}) {{";
            AddStmt(text);
            Increment();
            VisitBlock(block);
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitReturnstmt([NotNull] ReturnstmtContext context)
        {
            AddStmt($"return {context.numexpr().GetText()};");
            return false;
        }
        public override object VisitGradfunc([NotNull] GradfuncContext context)
        {
            string text = $"Value[] {context.id().GetText()}({context.parameters().GetText().Replace(":", " ")})";
            int count = 0;
            AddStmt(text, newline: false);
            AddStmt(" {", indent: false);
            Increment();
            string res = context.numexpr().GetText();
            context.numexpr().GetText().ToList().ForEach(p =>
            {
                if (char.IsLetter(p))
                    AddStmt($"Value _{p} = new({p});");
            });
            context.numexpr().GetText().ToList().ForEach(p =>
            {
                if (char.IsLetter(p))
                {
                    res = res.Replace(p.ToString(), $" _{p} ");
                    count++;
                }
                else if (!char.IsDigit(p))
                    res = res.Replace(p.ToString(), $" {p} ");
            });
            res = res.Replace("  ", " ");
            AddStmt("Value _res = " + res + ";");
            AddStmt("_res.backward();");
            string ValContainer = $"return new Value[{count+1}] {{ ";
            ValContainer += "_res, ";
            context.numexpr().GetText().ToList().ForEach(p =>
            {
                if (char.IsLetter(p))
                    ValContainer += $"_{p}, ";
            });
            ValContainer = ValContainer[0..^2];
            ValContainer += " };";
            AddStmt(ValContainer);
            Decrement();
            AddStmt("}");

            return false;
        }

        public override object VisitGraddcl([NotNull] GraddclContext context)
        {
            var val = context.gradfunccall().val();
            string s = $"var {context.id().GetText()} = {context.gradfunccall().id().GetText()}(";
            for(int i = 0; i < val.Length; i++)
                s += $"{val[i].GetText()}, ";
            if (val.Length > 0)
            s = s[0..^2];
            s += ");";
            AddStmt(s);
            return false;
        }
    }
}