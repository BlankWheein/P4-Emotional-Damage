using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static EmotionalDamageParser;

namespace Compiler.Phases
{
    public class CodeGeneratorV2 : EmotionalDamageBaseVisitor<object>
    {
        private string _path = @"../../../../Target/Program.cs";
        private FileStream _fs;
        bool isTesting = false;
        public RootSymbolTable Scope { get; set; }
        private int _level = 0;
        private HashSet<string> Values = new() { };
        private char[] BoolSpilts = new[] { '>', '<', '=', ' ', '!' };
        public string testString="";
        public CodeGeneratorV2(bool IsTesting)
        {
            isTesting = IsTesting;
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
            if (isTesting)
            {
                this.testString += v;
            }
            else if (!isTesting) {
                this.testString = "[NOT TESTING]";
                Stmts.Add(() => AddText(v, newline, indent));
            }
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
            
                if (File.Exists(_path))
                    File.Delete(_path);
                _fs = File.Create(_path);
            

            AddText("using AutoGrad;");
            AddText("Random rnd = new();");
            
            foreach (var stmt in Stmts)
                stmt();
            _fs.Close();
        }
        public string checkForVals(string val) {

            if (Values.Any(v => val.Split(' ', '(', '+', '-', '/', '*').Contains(v)))
            {
                val = val.Replace(Values.First(v => val.Split(' ', '(', '+', '-', '/', '*').Contains(v)), Values.First(v => val.Split(' ', '(', '+', '-', '/', '*').Contains(v)) + ".data");
            }
            return val;
        }
        public void PreVisit(HashSet<string> values)
        {
            Values = values;
        }
        public string CheckExpr(string input)
        {
            if (input.Contains("sqrt(")) { 
                input = input.Replace("sqrt(", "MathF.Sqrt(");
                var word = input.Split("MathF.Sqrt(", StringSplitOptions.RemoveEmptyEntries);
                foreach (var val in word)
                {
                    
                    if (Values.Contains(val.Split(')').First()) && !val.Any(c => char.IsDigit(c)))
                    {
                        input = input.Replace($"MathF.Sqrt({val.Split(')').First()})", $"{val.Split(')').First()}.Pow(1/2)");
                    }
                    
                }
            }


            if (input.Contains(".row"))
                input = input.Replace(".row", ".Rows");
            if (input.Contains(".len"))
                input = input.Replace(".len", ".Length");
            if (input.Contains(".col"))
                input = input.Replace(".col", ".Columns");

            while (input.Contains("**"))
            {
                // takes one pow at a time
                int ix = input.IndexOf("**");
                string left = input[..ix];
                string right = input[(ix + 2)..];
                
                int x = GetIndexParenthesis(')', '(', left, reverse: true);
                left = (x == -1) ? GetSingleExpr(left, true) : left.Substring(x + 1, left.Length - x - 2);

                int y = GetIndexParenthesis('(', ')', right, reverse: false);
                right = (y == -1) ? GetSingleExpr(right, false) : right[1..y];

                string temp_left = (x == -1) ? left : $"({left})";
                string temp_right = (y == -1) ? right : $"({right})";

                if (x == -1 && Values.Contains(left))
                    input = input.Replace($"{temp_left}**{temp_right}", $"{left}.Pow({right})");
                else
                    input = input.Replace($"{temp_left}**{temp_right}", $"MathF.Pow({left}, {right})");
            }

            string symbols = "%*+/-";
            foreach(var symbol in symbols)
                input = input.Replace(symbol.ToString(), $" {symbol} ");

            return input;
        }

        int GetIndexParenthesis(char firstPar, char targetPar, string str, bool reverse)
        {
            if (reverse) str = Reverse(str);
            if (!str.First().Equals(firstPar)) return -1;

            int index = 0, pairs = 0;

            for (int i = 0; i < str.Length; i++)
            {
                char _c = str[i];
                if (_c.Equals(firstPar)) // pair of parenthesis is found
                    pairs++;
                else if (_c.Equals(targetPar))
                {
                    if (pairs == 1) // if only one pair is active
                    {
                        index = i;
                        break;
                    }
                    pairs--;
                }
            }
            if (reverse) index = str.Length - index - 1;
            return index;
        }

        string GetSingleExpr(string str, bool reverse)
        {
            if (reverse) str = Reverse(str);
            for (int i = 0; i < str.Length; i++)
            {
                string _symbols = "%*+/-()";
                char c = str[i];
                if (_symbols.Contains(c) ||c.Equals(' '))
                {
                    str = str.Substring(0, i);
                    break;
                }
            }
            if (reverse) str = Reverse(str);
            return str;
        }

        string Reverse(string s)
        {
            char[] charArray = s.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }

        #region Dcl
        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            var returntype = context.returntype().GetText();
            var id = context.IDENTIFIER().First().GetText();
            var stmts = context.stmts();
            string parameters = "";
            int numofSqr = 0;
            for (int i = 0; i < context.types().Length; i++) {
                if (context.types()[i].GetText().Contains("["))
                {
                    foreach (var c in context.types()[i].GetText()) {
                        if (c == '[') { 
                            numofSqr++;
                        }
                    }
                }
                if (numofSqr == 2)
                {
                    parameters += $"Matrix {context.IDENTIFIER()[i + 1].GetText()}, ";
                }
                else { 
                    parameters += $"{context.types()[i].GetText()} {context.IDENTIFIER()[i+1].GetText()}, ";
                }
            
            }

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
            var expr_str = context.GetText().Replace(";", "").Split('=').Last();

            var expr = CheckExpr(expr_str);
            if (expr.Contains('.') && numtype != "int")
            {
                int fff = expr.Length;
                for (int i = 0; i < fff; i++)
                {
                    char c = expr[i];
                    char cNext = expr[i];
                    if (i < fff-1)
                        cNext = expr[i + 1];
                    if (c == '.' && char.IsDigit(cNext))
                        expr +="f";
                }
            }
            if (Values.Any(v => v.Contains(id))) {
                if (expr.Any(c => char.IsLetter(c)) && (!expr.Any(c => char.IsDigit(c)) || expr.Contains(".Pow")))
                {
                    AddStmt($"Value {id} = {expr};");
                }
                else
                {
                    AddStmt($"Value {id} = new Value({expr}, null," + $"\"{id}\"".Trim() + ", true);");
                }
            }
            else
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
                if (Values.Any(v => v != id) && Values.Any(v => expr.Split(' ', '(', ')', ';').Contains(v))){
                    expr = expr.Replace(Values.First(v => expr.Split(' ', '(', ')', ';').Contains(v)), Values.First(v => expr.Split(' ', '(', ')', ';').Contains(v))+".data");
                }
                AddStmt($"{numtype} {id} = {expr};");
            }
            
            return false;
        }
        public override object VisitGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context)
        {   
            AddStmt($"{context.IDENTIFIER(1)}.Backward();");
            AddStmt($"{context.numtype().GetText()} {context.IDENTIFIER(0)} = {context.IDENTIFIER(2)}.grad;");
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
        #endregion
        #region stmt
        public override object VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context)
        {
            var text = context.GetText();
            string Stmt = context.GetText().Split("(")[0].TrimEnd().TrimStart() == "print" ? "Console.Write(" : "Console.WriteLine(";
            string dollar = text.Split("(")[1].StartsWith("$") == true ? "$" : "";
            var printPart = context?.expr()?.GetText() == null ? context.STRING_CONSTANT().GetText() : CheckExpr(context.expr().GetText());
            if (dollar == "$")
                printPart = printPart.Replace("}", ".ToStringExtension()}");
            AddStmt($"{Stmt}{dollar}{printPart});");
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
            AddStmt($"{id}.Values[{pos1}][{pos2}] = new Value({expr}, CalculateGradient: false);");

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
            Scope.NextScope();
            var ids = context.IDENTIFIER();
            string str = $"{ids[0].GetText()}(";

            for (var i = 1; i < ids.Length; i++)
                str += $"{ids[i]}, ";

            if (ids.Length > 1) str = str[..^2];

            str += ");";
            AddStmt(str);
            Scope.ExitScopeCodeGen();
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
            Scope.NextScope();
            var arg = context?.bexpr()?.GetText() == null ? context?.IDENTIFIER()?.GetText() : context?.bexpr()?.GetText();
            AddStmt($"while({arg})" + "{");
            VisitStmts(context.stmts());
            AddStmt("}");
            Scope.ExitScopeCodeGen();
            return false;
        }
        
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
            Scope.NextScope();
            var id1 = context.IDENTIFIER()[0].GetText();
            var expr = CheckExpr(context.expr().GetText());
            var bexpr = context.bexpr().GetText();
            var text = context.GetText().Split(';');
            var unaryoperator = text[2];
            string result = unaryoperator.Contains("++") == true ? "++" : "--";
            AddStmt($"for (int {id1} = {expr}; {bexpr}; {id1}{result})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context){
            var id1 = context.IDENTIFIER().First().GetText();
            var id2 = context.IDENTIFIER().Last().GetText();

            AddStmt($"{id1} = {id2}.Transpose()");
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
            Scope.NextScope();
            string bexprstring = context.bexpr().GetText();
            if (Values.Any(v => bexprstring.Split(BoolSpilts).Contains(v)))
            {
                bexprstring = bexprstring.Replace(Values.First(v => bexprstring.Split(BoolSpilts).Contains(v)), Values.First(v => bexprstring.Split(BoolSpilts).Contains(v)) + ".data");
            }
            AddStmt($"if({bexprstring})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context)
        {
            Scope.NextScope();
            string bexprstring = context.bexpr().GetText();
            if (Values.Any(v => bexprstring.Split(BoolSpilts).Contains(v)))
            {
                bexprstring = bexprstring.Replace(Values.First(v => bexprstring.Split(BoolSpilts).Contains(v)), Values.First(v => bexprstring.Split(BoolSpilts).Contains(v)) + ".data");
            }
            AddStmt($"else if({bexprstring})"+"{");
            VisitStmts(context.stmts());
            AddStmt("}");
            Scope.ExitScopeCodeGen();
            return false;
            
        }
        public override object VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context)
        {
            Scope.NextScope();
            AddStmt("else{");
            VisitStmts(context.stmts());
            AddStmt("}");
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitRandIdentifierStmt([NotNull] RandIdentifierStmtContext context)
        {
            var id1 = context.IDENTIFIER(0).GetText();
            var id2 = context.IDENTIFIER(1).GetText();
            var id3 = context.IDENTIFIER(2).GetText();
            AddStmt($"{id1}.Next({id2}, {id3});");
            return false;
        }
        #endregion

    }
}
