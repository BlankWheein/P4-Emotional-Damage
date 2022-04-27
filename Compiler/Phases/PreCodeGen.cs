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
        private string _path = @"../Emotional.Damage";
        private FileStream _fs;
        private List<string> _lines = new();
        public PreCodeGen() {
            if (!File.Exists(_path)) {
                throw new Exception($"File {_path} does not exist or can't be reached.");
            }
        }

        public List<string> checkGradien() {
            IEnumerable<string> lines = File.ReadLines(_path);
            foreach (var line in lines) {
                if (line.Contains("////")) {
                    _lines.Add(line.Split("////")[0]);
                    _lines.Add(line.Split("////")[1]);
                }
            }
            return _lines;
        }
    }
}
