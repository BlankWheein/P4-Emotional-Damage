using Antlr4.Runtime;

namespace Compiler.Phases.Exceptions
{
    public class TypeCheckerException : Exception
    {
        public TypeCheckerException(string? message, ParserRuleContext Line, ParserRuleContext Col) : base($"Line: {Line.Start.Line}:{Col.Start.StartIndex}-{Col.Start.StopIndex} - " + message)
        {

        }
        public TypeCheckerException(string? message, ParserRuleContext Line) : base($"Line: {Line.Start.Line} - " + message)
        {

        }
    }
}
