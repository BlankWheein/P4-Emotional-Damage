namespace Compiler.CodeAnalysis.Syntax
{
    internal static class SyntaxFacts
    {
        public static int GetBinaryOperatorPrecedence(this SyntaxKind kind)
        {
            switch (kind)
            {
                case SyntaxKind.SlashToken:
                case SyntaxKind.StarToken:
                    return 2;

                case SyntaxKind.PlusToken:
                case SyntaxKind.MinusToken:
                    return 1;

                default:
                    return 0;
            }
        }
        public static int GetUnaryOperatorPrecedence(this SyntaxKind kind)
        {
            switch (kind)
            {
                case SyntaxKind.MinusToken:
                case SyntaxKind.PlusToken:
                    return 3;

                default:
                    return 0;
            }
        }
    }
}