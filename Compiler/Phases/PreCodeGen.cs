using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.Phases
{
    internal class PreCodeGen : EmotionalDamageBaseVisitor<object>
    {
        private string _path = @"../../../../Compiler/Emotional.Damage";
        private FileStream _fs;
        private IEnumerable<string> lines;
        public List<string> Exprs = new();
        public string child = "IEnumerable<Value> children{";

        public PreCodeGen() {
            if (!File.Exists(_path)) {
                throw new Exception($"File {_path} does not exist or can't be reached.");
            }
            lines = File.ReadLines(_path);
            Wrapper._codeGenerator.Stmts;
        }
        public override object VisitGradientExpr([NotNull] EmotionalDamageParser.GradientExprContext context)
        {
            Exprs.Add(RetrunValueObj(context.expr()[0].GetText()));
            Console.WriteLine(context.expr()[0].GetText());
            return false;
        }
        
        public string RetrunValueObj(string expr) {
            lines = File.ReadLines(_path);
            int i = 0;
            foreach (var l1 in lines)
            {
                if ((l1.Contains($"{expr}=") || l1.Contains($"{expr}=")))
                {
                Console.WriteLine(++i);
                    string children = l1.Split("=")[1].Trim(';');
                    string id = l1.Split("=")[0].Replace("float", "");
                    if (children.Any(c => char.IsLetter(c)))
                    {
                        var childrenArr = children.Split('*', '+', '/', '-');
                        foreach (string c in childrenArr)
                        {
                            if (c.Any(x => char.IsLetter(x)))
                            {
                                child += $"{RetrunValueObj(c)}";
                            }
                        }
                        child = child.Remove(child.Length - 1);
                        child += "}";
                    }
                    else
                    {
                        if (child != "IEnumerable<Value> children{")
                        {
                            expr = $"Value {id} = new Value({children}, {child}, \'{id}\');";
                        }
                        else {
                            expr = $"Value {id} = new Value({children}, null, \"" + $"{id}".Trim()+"\");";
                        }
                    }

                }
            }
            return expr;
        }
    }
}
