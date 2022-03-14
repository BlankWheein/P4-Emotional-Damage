namespace Compiler.CodeAnalysis.Binding
{
    internal class BoundUnaryExpression : BoundExpression
    {
        public BoundUnaryExpression(BoundUnaryOperatorKind operatorKind, BoundExpression operand)
        {
            Operand = operatorKind;
            Op = operand;
        }
        public override BoundNodeKind Kind => BoundNodeKind.UnaryExpression;
        public override Type Type => Op.Type;
        public BoundUnaryOperatorKind Operand { get; }
        public BoundExpression Op { get; }
    }
}
