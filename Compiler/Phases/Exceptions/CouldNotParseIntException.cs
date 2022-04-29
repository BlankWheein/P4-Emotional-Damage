using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.Phases.Exceptions
{
    public class CouldNotParseIntException : Exception
    {
        public CouldNotParseIntException(string? message) : base(message)
        {
        }
    }
}
