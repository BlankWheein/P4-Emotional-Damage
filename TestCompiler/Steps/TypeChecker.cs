using static TestGrammarParser;

namespace TestCompiler.Steps
{
    public class TypeChecker
    {
        public BasicVisitor Parent { get; }

        public TypeChecker(BasicVisitor Parent)
        {
            this.Parent = Parent;
        }
        private bool EvaluateExprFloatDouble(ExprContext context)
        {
            return double.TryParse(context.val().GetText(), out double _) 
                || int.TryParse(context.val().GetText(), out int _) 
                || float.TryParse(context.val().GetText(), out float _);
        }
        private string GetExprText(ExprContext ctx, string res = "")
        {
            ExprContext[] expr = ctx.expr();
            ValContext val = ctx.val();
            if (expr.Length != 0)
            {
                foreach (var s in ctx.expr())
                {
                    res += GetExprText(s, res);
                }
            } else
            {
                res += ctx.val().GetText();
            }
            return res;
        }
        public void EvalutateExpr(ExprContext context, string target)
        {
            if (_evaluateExpr(context, target) == false)
            {
                Parent.Scope.AddDiagnostic(new System.Exception($"Could not parse Type '{target}' onexpr '{GetExprText(context)}'"));
            }
        }
        private bool _evaluateExpr(ExprContext context, string? target)
        {
            bool def = true;
            if (context.val() != null)
            {
                if (context.val().num() != null)
                def &= target switch
                {
                    "int" => int.TryParse(context.val().GetText(), out int _),
                    "double" => EvaluateExprFloatDouble(context),
                    "float" => EvaluateExprFloatDouble(context),
                    _ => false,
                };
                else
                {
                    def &= target == Parent?.Scope?.Lookup(context?.val()?.id()?.GetText()?.Trim('"'))?.Type;
                }
                return def;
            } else
            {
                foreach(var e in context.expr())
                    def &= _evaluateExpr(e, target);
            }
            return def;

        }
    }
}