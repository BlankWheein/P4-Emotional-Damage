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

        public Compiler(StringBuilder source)
        {
            __source = source;
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
                BasicVisitor visitor = new BasicVisitor();
                CodeGenerator codeGenerator = new(null);

                visitor.Visit(progContext);
                Console.ForegroundColor = ConsoleColor.Red;
                foreach (var s in visitor.Diagnostics)
                {
                    Console.WriteLine(s);
                }
                visitor.Dispose();
                Console.ForegroundColor = ConsoleColor.White;
                Console.WriteLine("Printing Scope Tree:");
                Console.ForegroundColor = ConsoleColor.Green;
                visitor.Print();
                Console.ResetColor();
                Console.WriteLine();
                Console.ForegroundColor = ConsoleColor.White;


                codeGenerator.Scope = visitor.Scope;
                codeGenerator.Visit(progContext);
                Console.ForegroundColor = ConsoleColor.Red;
                codeGenerator.Dispose();
            }
        }

    }
}