using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;
using System.Text;
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
        }
        #region Indent
        public string Indent = "";
        public void Increment()
        {
            Indent += "    ";
        }
        public void Decrement()
        {
            Indent = Indent[0..^4];
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
            string text = $"Value {context.id().GetText()}({context.parameters().GetText()}) {{ }}";
            AddStmt(text);
            return false;
        }
    }
}