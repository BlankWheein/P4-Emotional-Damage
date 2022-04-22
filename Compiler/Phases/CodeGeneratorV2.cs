using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.Phases
{
    internal class CodeGeneratorV2 : EmotionalDamageBaseVisitor<object>
    {
        private string _path = @"../../../../Target/Program.cs";
        private FileStream _fs;

        public CodeGeneratorV2()
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
        public List<Action> Stmts { get; set; } = new();
        private void AddStmt(string v, bool newline = true, bool indent = true)
        {
            Stmts.Add(() => AddText(v, newline, indent));
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
        public void Compile()
        {
            foreach (var stmt in Stmts)
                stmt();
            _fs.Close();
        }

        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            var returntype = context.returntype().GetText();
            var id = context.IDENTIFIER().First().GetText();
            var stmts = context.stmts().GetText();
            string parameters = "";
            
            for (int i = 0; i < context.types().Length; i++)
                parameters += $"{context.types()[i].GetText()} {context.IDENTIFIER()[i].GetText()}, ";

            if(parameters != "") parameters = parameters[0..^2];

            AddStmt($"{returntype} {id}({parameters}) {{ {stmts} }};");
            return false;
        }
        public override object VisitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context)
        {
            var inum = context.Inum();
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{context.numtype().GetText()}[{inum[0].GetText()}][{inum[1].GetText()}] {id};");
            return false;
        }
        public override object VisitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context)
        {
            var text = context.GetText().Split(' ');

            var type = text[0].Split('[')[0];
            var arr_size = text[0].Split('[')[1].Trim(']');
            var id = context.IDENTIFIER().GetText();

            AddStmt($"{type}[] {id} = new {type}[{arr_size}];");
            return false;
        }
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
            var numtype = context.numtype().GetText();
            var id = context.IDENTIFIER().GetText();
            var expr = context.expr().GetText();

            AddStmt($"{numtype} {id} = {expr}");
            return false;
        }
        public override object VisitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var string_constant = context.STRING_CONSTANT().GetText();

            AddStmt($"string {id} = {string_constant}");
            return false;
        }
        public override object VisitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var bexpr = context.bexpr().GetText();

            AddStmt($"bool {id} = {bexpr}");
            return false;
        }
        public override object VisitPrintStmt([NotNull]EmotionalDamageParser.PrintStmtContext context)
        {
            var printPart = context.expr() == null ? context.STRING_CONSTANT().GetText() : context.expr().GetText();
            AddStmt($"Console.WriteLine({printPart}); \n");
            return false;
        }
        public override object VisitReturnStmt([NotNull] EmotionalDamageParser.ReturnStmtContext context)
        {
            var id = context.IDENTIFIER().GetText();
            AddStmt($"return {id};");
            return false;
        }
        public override object VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var exprstring = context.expr().GetText();
            AddStmt($"{id} = {exprstring};");
            return false;
        }
        public override object VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var boolstr = context.bexpr().GetText();
            AddStmt($"{id} = {boolstr};");
            return false;
        }
        //public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        //{
        //    var id = context.IDENTIFIER()[0].GetText();
        //    var pos1 = context.Inum()[0].GetText() == null ? context.IDENTIFIER()[1].GetText() : context.Inum()[0].GetText();
        //    var pos2 = context.Inum()[1].GetText() == null ? context.IDENTIFIER()[2].GetText() : context.Inum()[1].GetText();
        //    var exprstring = context.expr().GetText();

        //    return false;
        //}
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            var id = context.IDENTIFIER()[0].GetText();
            var pos1 = context.Inum().GetText() == null ? context.IDENTIFIER()[1].GetText() : context.Inum().GetText();
            var exprstring = context.expr().GetText();
            AddStmt($"{id}{pos1} = {exprstring};");
            return false;
        }
        public override object VisitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context)
        {
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{id}++");
            return false;
        }
        public override object VisitUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context)
        {
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{id}--");
            return false;
        }
        public override object VisitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context)
        {
            var bexpr = context.bexpr().GetText();
            AddStmt($"while{bexpr}"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
        }
    }   
}
