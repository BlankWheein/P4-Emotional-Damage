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
        public List<string> Exprs = new();

        public PreCodeGen() {
            if (!File.Exists(_path)) {
                throw new Exception($"File {_path} does not exist or can't be reached.");
            }
        }
        public void checkGradien() {
            IEnumerable<string> lines = File.ReadLines(_path);
            foreach (var l in lines) {
                if (l.Contains("////")) {
                    Exprs.Add(l.Split("////")[0]);
                    Exprs.Add(l.Split("////")[1]);
                }
            }
        }
    }
}
