using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class IterativeAssignmentUndefined : ParserExceptions
    {
        public IterativeAssignmentUndefined(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
