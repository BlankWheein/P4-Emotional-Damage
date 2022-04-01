using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;
using TestCompiler.Steps;
using static TestGrammarParser;
namespace TestCompiler.Steps
{
    public class Compiler
    {
        private readonly StringBuilder __source;
        public BasicVisitor BasicVisitor;
        public Compiler(StringBuilder source)
        {
            __source = source;
        }
        public void TestVisitor()
        {
            AntlrInputStream inputStream = new(__source.ToString());
            TestGrammarLexer speakLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(speakLexer);
            TestGrammarParser speakParser = new(commonTokenStream);
            ProgContext progContext = speakParser.prog();
            BasicVisitor = new();
            BasicVisitor.Visit(progContext);
        }
        public void Compile()
        {
            AntlrInputStream inputStream = new(__source.ToString());
            TestGrammarLexer speakLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(speakLexer);
            TestGrammarParser speakParser = new(commonTokenStream);
            ProgContext progContext = speakParser.prog();
            lock (Console.Out)
            {
                Console.ForegroundColor = ConsoleColor.White;
                BasicVisitor visitor = new();
                CodeGenerator codeGenerator = new(null);

                visitor.Visit(progContext);
                Console.ForegroundColor = ConsoleColor.Red;
                foreach (var s in visitor.Diagnostics)
                    Console.WriteLine(s);
                Console.ForegroundColor = ConsoleColor.White;
                Console.WriteLine("Printing Scope Tree:");
                Console.ForegroundColor = ConsoleColor.Green;
                visitor.Print();
                visitor.Dispose();
                Console.ResetColor();
                Console.WriteLine();
                Console.ForegroundColor = ConsoleColor.White;

                codeGenerator.Scope = visitor.Scope;
                codeGenerator.Visit(progContext);
                codeGenerator.Dispose();
            }
        }

    }
}