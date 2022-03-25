namespace Compiler.CodeAnalysis
{
        public sealed class Diagnotics
        {
            public Diagnotics(TextSpan span, string message)
            {
                Span = span;
                Message = message;
            }

            public TextSpan Span { get; }
            public string Message { get; }

            public override string ToString() => Message;
        }
}