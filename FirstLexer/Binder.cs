using Compiler.CodeAnalysis.Syntax;

namespace Compiler.CodeAnalysis.Binding
{
    internal sealed class Binder
    {
        private readonly List<string> _diagnostics = new();
        public IEnumerable<string> Diagnostics => _diagnostics;
        public BoundExpression BindExpression(Syntax.ExpressionSyntax syntax)
        {
            switch (syntax.Kind)
            {
                case SyntaxKind.LiteralExpression:
                    return BindLiteralExpression((LiteralExpressionSyntax)syntax);
                case SyntaxKind.UnaryExpression:
                    return BindUnaryExpression((UnaryExpressionSyntax)syntax);
                case SyntaxKind.BinaryExpression:
                    return BindBinaryExpression((BinaryExpressionSyntax)syntax);
                default:
                    throw new InvalidOperationException($"unexpected syntax {syntax.Kind}");

            }
        }
        private BoundExpression BindLiteralExpression(LiteralExpressionSyntax syntax)
        {
            var value = syntax.LiteralToken.Value as int? ?? 0;
            return new BoundLiteralExpression(value);
        }
        private BoundExpression BindUnaryExpression(UnaryExpressionSyntax syntax)
        {
            var boundOperand = BindExpression(syntax.Operand);
            var boundOperatorKind = BindUnaryOperatorKind(syntax.OperatorToken.Kind, boundOperand.Type);
            if (boundOperatorKind == null)
            {
                _diagnostics.Add($"Unary Operator '{syntax.OperatorToken.Text}' is not defined for Type {boundOperand.Type}");
                return boundOperand;
            }
            return new BoundUnaryExpression(boundOperatorKind.Value, boundOperand);
        }

        private BoundExpression BindBinaryExpression(BinaryExpressionSyntax syntax)
        {
            var boundLeft = BindExpression(syntax.Left);
            var boundRight = BindExpression(syntax.Right);
            var boundOperandKind = BindBinaryOperatorKind(syntax.OperatorToken.Kind, boundLeft.Type, boundRight.Type);

            if (boundOperandKind == null)
            {
                _diagnostics.Add($"Unary Operator '{syntax.OperatorToken.Text}' is not defined for Type {boundLeft.Type} and {boundRight.Type}.");
                return boundLeft;
            }

            return new BoundBinaryExpression(boundLeft, boundOperandKind.Value, boundRight);
        }
        private BoundUnaryOperatorKind? BindUnaryOperatorKind(SyntaxKind kind, Type operandType)
        {
            if (operandType != typeof(int))
                return null;
            switch (kind)
            {
                case SyntaxKind.PlusToken:
                    return BoundUnaryOperatorKind.identity;
                case SyntaxKind.MinusToken:
                    return BoundUnaryOperatorKind.Negation;
                default:
                    throw new Exception($"unexpected unary operator {kind}");
            }
        }

        private BoundBinaryOperatorKind? BindBinaryOperatorKind(SyntaxKind kind, Type leftType, Type rightType)
        {
            if (leftType != typeof(int) || rightType != typeof(int))
                return null;
            switch (kind)
            {
                case SyntaxKind.PlusToken:
                    return BoundBinaryOperatorKind.Addition;
                case SyntaxKind.MinusToken:
                    return BoundBinaryOperatorKind.Subtraction;
                case SyntaxKind.StarToken:
                    return BoundBinaryOperatorKind.Multiplication;
                case SyntaxKind.SlashToken:
                    return BoundBinaryOperatorKind.Division;

                default:
                    throw new Exception($"unexpected binary operator {kind}");
            }
        }
    }
}
