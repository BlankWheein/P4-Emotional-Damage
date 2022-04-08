

/*using Compiler;
using System.Diagnostics;
using System.Text;
StringBuilder text = new();
string readText = File.ReadAllText("../../../Emotional.Damage");
Console.WriteLine(readText);
text.AppendLine(readText);
Wrapper wrapper = new(text);
wrapper.Compile();
Process p = new();
lock (Console.Out)
{
    p = new Process();
    p.StartInfo.FileName = "cmd.exe";
    p.StartInfo.WorkingDirectory = @"../../../../Target/";
    p.StartInfo.Arguments = "/C dotnet run";
    p.Start();
}
p.Dispose();*/

using Compiler.SymbolTableFolder;

RootSymbolTable root = new();
root.Insert(SymbolType.Int,"hj",false);
root.Insert(SymbolType.Int,"hj",false);
root.Allocate();
root.Insert(SymbolType.Int,"hej",false);
root.Insert(SymbolType.Int,"j",false);
root.Insert(SymbolType.Int,"j2",false);

Console.WriteLine();
