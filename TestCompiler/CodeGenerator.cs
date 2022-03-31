using Antlr4.Runtime;
using static TestGrammarParser;
using System.IO;
using System.Text;
using System;
using System.Linq;
using System.Diagnostics;

namespace TestCompiler.Generator
{

        public class CodeGenerator : IDisposable
        {
        private string _path = @"../../../CompiledFiles/test.cs";
        private FileStream _fs;
        public string Indent = "";
        public void Increment()
            {
                Indent += "    ";
            }
        
        public void Decrement()
        {
            Indent = Indent.Substring(0, Indent.Length - 4);
        }

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

        public void Parse(IterativeContext context)
        {
            AddText($"for ({context.forassignment().valtype().GetText()} {context.forassignment().id().GetText()} = {context.forassignment().expr().GetText()}; {context.bexpr().GetText()}; {context.expr().GetText()}) ", newline:false);
            AddText("{", indent:false);
            Increment();
        }

        public void Parse(SelectiveContext context, ElsestatementContext stmt)
        {
            AddText("else {");
            Increment();
        }

        #endregion


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



        public CodeGenerator()
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
        }
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
    }
}