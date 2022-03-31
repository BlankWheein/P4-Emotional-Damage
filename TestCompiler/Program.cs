using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;
using TestCompiler.Steps;
using static TestGrammarParser;
namespace TestCompiler
{

    internal static partial class Program
{
    public static void Main()
    {
        while (true)
        {
            try
            {
                string? input = "";
                StringBuilder text = new StringBuilder();
                Console.WriteLine("> Input source code: ");

                // to type the EOF character and end the input: use CTRL+D, then press <enter>
                while ((input = Console.ReadLine()) != "")
                {
                    text.AppendLine(input);
                }
                if (text.Length == 0)
                {
                    string testLine = "int kage = 2;if (1==1){int kage2 = 2;int akwd = 2; print kage;}if (1==1){int dkawp = 2;int kdwa = 3; print kdwa; if (1==1){if (2==2){int kage3 = 3;print kage3;}}} print \"done\"";
                    //string testLine = "int kage = 2;if (1){int kage = 2;int akwd = 2;} elif(1) {kage = 2; int test = 4;}elif(1) {kage = 6; int test2 = 4;} else {int kage = 2;}";
                    //string testLine = "int kage = 2;if (1){int kage = 2;int akwd = 2;} elif(1) {kage = 2; int test = 4;}elif(1) {kage = 6; int test2 = 4;}";
                    //string testLine = "int kage = 3;if (1){kage = 4; int test = 3;}";
                    Console.WriteLine(testLine);
                    Console.WriteLine();
                    text.AppendLine(testLine);
                }
                Compiler compiler = new(text);
                compiler.Compile();

                
            
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
            
        }
    }
}
}