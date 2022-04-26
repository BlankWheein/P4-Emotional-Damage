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

        public string CheckExpr(string input)
        {
            if (input.Contains("sqrt("))
                input = input.Replace("sqrt(", "MathF.Sqrt(");
            if (input.Contains(".row"))
                input = input.Replace(".row", ".Rows");
            if (input.Contains(".len"))
                input = input.Replace(".len", ".Length");
            
            if (input.Contains("**"))
            {
                for (int i = 0; i < input.Length; i++)
                {
                    char c = input[i];

                    if (c.Equals('*') && input[i+1].Equals('*'))
                    {
                        List<string> items1 = new();
                        List<string> items2 = new();

                        var _expr1 = input.Split("**")[0];
                        var _expr2 = input.Split("**")[1];

                        string symbols = "%*+/-=";

                        bool left_par = false, right_par = false;

                        if (_expr1.Last().Equals(')'))
                        {
                            left_par = true;
                        }
                        if (_expr2.First().Equals('('))
                        {
                            right_par = true;
                        }

                        int prev_index = _expr1.Length-1;

                        for (int j = _expr1.Length-1; j >= 0; j--)
                        {
                            char ch = _expr1[j];
                            if (j == 0) items1.Add(_expr1.Substring(0, prev_index));
                            else if (char.IsLetterOrDigit(ch) || ch.Equals('_')) continue;
                            else if (symbols.Contains(ch))
                            {
                                items1.Add(_expr1.Substring(j+1, prev_index - j));
                                prev_index = j;
                            }
                            //if (!left_par && items1.Count > 0) break;
                            //else if (ch.Equals('(')) break;
                        }

                        prev_index = 0;

                        for (int j = 0; j <= _expr2.Length-1; j++)
                        {
                            char ch = _expr2[j];
                            if (j == _expr2.Length-1)
                                items2.Add(_expr2.Substring(prev_index, _expr2.Length - prev_index));
                            if (char.IsLetterOrDigit(ch) || ch.Equals('_')) continue;
                            else if (symbols.Contains(ch))
                            {
                                items2.Add(_expr2.Substring(prev_index, j - prev_index));
                                prev_index = j+1;
                            }
                        }

                        string left = "";
                        string right = "";

                        foreach(var item in items1)
                            left += $"{item}, ";
                        left = left[..^2];
                        string s = $"MathF.Pow({left}, {right})";
                        Console.WriteLine();

                    }
                }
            }
            return input;

            /*
                        for(int i = 0; i < input.Length - 1; i++)
                        {
                            char c = input[i];
                            char next_c = input[i + 1];
                            char prev_c = i > 0 ? input[i - 1] : '0';
                            string[] _expr;
                            string symbols = "%*+/-";

                            if (c.Equals('*') && next_c.Equals('*'))
                            {
                                _expr = input.Split("**");
                                var _expr1 = _expr[0];
                                var _expr2 = _expr[1];
                                return $"MathF.Pow({CheckExpr(_expr1)}, {CheckExpr(_expr2)})";
                            }
                            else if (symbols.Contains(c))
                            {
                                _expr = input.Split(c);
                                var _expr1 = _expr[0];
                                var _expr2 = _expr[1];
                                return $"{CheckExpr(_expr1)} {c} {CheckExpr(_expr2)}";
                            }
                            else if (c.Equals('.') && (Char.IsLetterOrDigit(prev_c) || prev_c.Equals('_')))
                            {
                                string id = input.Split('.').First();
                                switch (next_c)
                                {
                                    case 'r': return $"{id}.Rows";
                                    case 'c': return $"{id}.Columns";
                                    case 'l': return $"{id}.Length";
                                }
                            }
                            else if (c.Equals('\\') && input.Substring(i, 4).Equals("\\\\\\\\"))
                            {
                                _expr = input.Split("\\\\\\\\");
                                var _expr1 = CheckExpr(_expr[0]);
                                var _expr2 = CheckExpr(_expr[1]);
                                return input; // indtil videre
                            }
                        }
                    */
        }
        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            var returntype = context.returntype().GetText();
            var id = context.IDENTIFIER().First().GetText();
            var stmts = context.stmts();
            string parameters = "";

            for (int i = 0; i < context.types().Length; i++)
                parameters += $"{context.types()[i].GetText()} {context.IDENTIFIER()[i+1].GetText()}, ";

            if (parameters != "") parameters = parameters[0..^2];

            AddStmt($"{returntype} {id} ({parameters}) {{");
            Increment();
            VisitStmts(stmts);
            Decrement();
            AddStmt("}");
            return false;
        }
        public override object VisitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context)
        {
            var inum = context.Inum();
            var id = context.IDENTIFIER().GetText();
            var numtype = context.numtype().GetText();
            AddStmt($"Matrix {id} = new({inum[0].GetText()},{inum[1].GetText()});");
            return false;
        }
        public override object VisitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context)
        {
            var text = context.GetText().Split(' ');

            var type = text[0].Split('[')[0];
            var arr_size = text[0].Split('[')[1];
            var id = context.IDENTIFIER().GetText();

            arr_size = arr_size.Substring(0, arr_size.IndexOf("]")); // removes every char after "]", including the character

            AddStmt($"{type}[] {id} = new {type}[{arr_size}];");
            return false;
        }
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
            var numtype = context.numtype().GetText();
            var id = context.IDENTIFIER().GetText();
            var expr = CheckExpr(context.expr().GetText());
            if(numtype == "float")
            {
                bool active = false;
                for (int i = 0; i < expr.Length; i++)
                {
                    char c = expr[i];
                    if (char.IsDigit(c)) continue;
                    if (c.Equals('.')) active = true;
                    if (char.IsLetter(c)) active = false;
                    if (active && char.IsSymbol(c)) {
                        active = false;
                        expr = expr.Insert(i, "f");
                    }
                }
            }

            AddStmt($"{numtype} {id} = {expr};");
            return false;
        }
        public override object VisitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var string_constant = context.STRING_CONSTANT().GetText();

            AddStmt($"string {id} = {string_constant};");
            return false;
        }
        public override object VisitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var val = context.bexpr().GetText();
            AddStmt($"bool {id} = {val};");
            return false;
        }
        public override object VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context)
        {
            var printPart = context?.expr()?.GetText() == null ? context?.STRING_CONSTANT()?.GetText() : CheckExpr(context?.expr()?.GetText());
            AddStmt($"Console.WriteLine({printPart});");
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
            var expr = CheckExpr(context.expr().GetText());
            AddStmt($"{id} = {expr};");
            return false;
        }
        public override object VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var boolstr = context.bexpr().GetText();
            AddStmt($"{id} = {boolstr};");
            return false;
        }
        public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {
            var id = context.IDENTIFIER()[0].GetText();
            var pos1 = context.Inum()[0].GetText() == null ? context.IDENTIFIER()[1].GetText() : context.Inum()[0].GetText();
            var pos2 = context.Inum()[1].GetText() == null ? context.IDENTIFIER()[2].GetText() : context.Inum()[1].GetText();
            var expr = CheckExpr(context.expr().GetText());
            AddStmt($"{id}.Values[{pos1}][{pos2}] = new Value({expr});");

            return false;
        }
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            var id = context.IDENTIFIER()[0].GetText();
            var pos1 = context.Inum().GetText() == null ? context.IDENTIFIER()[1].GetText() : context.Inum().GetText();
            var expr = CheckExpr(context.expr().GetText());
            AddStmt($"{id}[{pos1}] = {expr};");
            return false;
        }
        public override object VisitFuncStmt([NotNull] EmotionalDamageParser.FuncStmtContext context)
        {
            var ids = context.IDENTIFIER();
            string str = $"{ids[0].GetText()}(";

            for (var i = 1; i < ids.Length; i++)
                str += $"{ids[i]}, ";

            if (ids.Length > 1) str = str[..^2];

            str += ");";
            AddStmt(str);
            return false;
        }
        public override object VisitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context)
        {
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{id}++;");
            return false;
        }
        public override object VisitUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context)
        {
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{id}--;");
            return false;
        }
        public override object VisitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context)
        {
            var arg = context?.bexpr()?.GetText() == null ? context?.IDENTIFIER()?.GetText() : context?.bexpr()?.GetText();
            AddStmt($"while({arg})" + "{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
        }
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
            var id1 = context.IDENTIFIER()[0].GetText();
            var expr = CheckExpr(context.expr().GetText());
            var bexpr = context.bexpr().GetText();
            var text = context.GetText().Split(';');
            var unaryoperator = text[2];
            string result = unaryoperator.Contains("++") == true ? "++" : "--";
            AddStmt($"for (int {id1} = {expr}; {bexpr}; {id1}{result})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
        }
        public override object VisitTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context){
            var id = context.IDENTIFIER().GetText();
            AddStmt($"{id} = {id}.Transpose()");
            return false;
        }
        public override object VisitSelective([NotNull] EmotionalDamageParser.SelectiveContext context)
        {
            if(context.ifstmt() != null){
                VisitIfstmt(context.ifstmt());
            }
            if (context.elifstmt() != null){
                foreach (var i in context.elifstmt()){
                    VisitElifstmt(i);
                }
            }
            if(context.elsestmt() != null){
                VisitElsestmt(context.elsestmt());
            }
            return false;
        }
        public override object VisitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context)
        {
            string bexprstring = context.bexpr().GetText();
            AddStmt($"if({bexprstring})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
        }
        public override object VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context)
        {
            string bexprstring = context.bexpr().GetText();
            AddStmt($"else if({bexprstring})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
            
        }
        public override object VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context)
        {
            
            AddStmt("else{");
            VisitStmts(context.stmts());
            AddStmt("}");
            return false;
        }

    }
}
