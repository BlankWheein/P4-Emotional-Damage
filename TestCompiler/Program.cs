﻿using Antlr4.Runtime;
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

                while ((input = Console.ReadLine()) != "")
                {
                    text.AppendLine(input);
                }
                if (text.Length == 0)
                {
                    string testLine = "int kage = 2;if (1==1){int kage2 = 2;int akwd = 2; print kage;}if (1==1){int dkawp = 2;int kdwa = 3; print kdwa; if (1==1){if (2==2){int kage3 = 3;print kage3;}}} print \"done\"";
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