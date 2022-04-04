using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Text;
using TestCompiler.Steps;
using static TestGrammarParser;
    string? input = "";
    Compiler compiler;
    StringBuilder text = new StringBuilder();
    Console.ForegroundColor = ConsoleColor.Yellow;
    string[] arguments = Environment.GetCommandLineArgs();
    Console.WriteLine("GetCommandLineArgs: {0}", string.Join(", ", arguments));
    string readText;
    if (arguments.Length > 1)
    {
        string path = string.Format("./{0}", arguments[1]);
        readText = File.ReadAllText(path);
        text.AppendLine(readText);
        compiler = new(text);
        compiler.Compile();
    }

readText = File.ReadAllText("../../../Emotional.Damage");
Console.WriteLine(readText);
text.AppendLine(readText);
compiler = new(text);
compiler.Compile();
Process p = new();
    lock (Console.Out)
    {
        p = new Process();
        p.StartInfo.FileName = "cmd.exe";
        p.StartInfo.WorkingDirectory = @"../../../../Target/";
        p.StartInfo.Arguments = "/C dotnet run";
        p.Start();
    }
    p.Dispose();


