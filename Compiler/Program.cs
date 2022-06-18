using Compiler;
using System.Diagnostics;
using System.Text;
using Compiler.Phases;

StringBuilder text = new();
string readText = File.ReadAllText("../../../Emotional.Damage");
Console.WriteLine(readText);
text.AppendLine(readText);
Wrapper wrapper = new(text);
if (wrapper.Compile())
{
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
}
