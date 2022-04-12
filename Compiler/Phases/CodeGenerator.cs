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
        public override object VisitIntdcl([NotNull] IntdclContext context)
        {
            string ting = context.numexpr() == null ? $"int {context.id().GetText()};" : $"int {context.id().GetText()} = {context.numexpr().GetText()};";
            AddStmt(ting);
            return false;
        }
        public override object VisitGradfunc([NotNull] GradfuncContext context)
        {
            string text = $"IEnumerable<Value> {context.id().GetText()}({context.parameters().GetText().Replace(":", " ")})";
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
                    res = res.Replace(p.ToString(), $"_{p}");
                }
            });
            AddStmt("Value _res = " + res + ";");
            AddStmt("_res.backward();");
            AddStmt("yield return _res;");
            context.numexpr().GetText().ToList().ForEach(p =>
            {
                if (char.IsLetter(p))
                    AddStmt($"yield return _{p};");
            });
            Decrement();
            AddStmt("}");

            return false;
        }

        public override object VisitGraddcl([NotNull] GraddclContext context)
        {
            var id = context.gradfunccall().id();

            string s = $"Value {context.id().GetText()} = {id.First().GetText()}(";

            if (id.Length == 1)
                s += $");";
            else if (id.Length == 2)
                s += $"{id.Last()});";
            else
            {
                for(int i = 1; i < id.Length-1; i++)
                {
                    s += $"{id[i]}, ";
                }
                s = s[0..^2];
                s += $");";
            }

            AddStmt(s);

            return false;
        }
    }
}