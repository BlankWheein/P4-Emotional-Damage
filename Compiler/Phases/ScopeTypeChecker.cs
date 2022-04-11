using static EmotionalDamageParser;
namespace Compiler
{
    public class ScopeTypeChecker : EmotionalDamageBaseVisitor<object>
    {
        public ScopeTypeChecker(){

        }
        private bool EvaluateNumexpr(NumexprContext context){
            return int.TryParse(context.val().GetText(), out int _) 
                || float.TryParse(context.val().GetText(), out float _);
        }
        public void EvalutateNumexpr(NumexprContext context, string target)
        {
            if (_evaluateNumexpr(context, target) == false)
            {
                base.Scope.AddDiagnostic(new Exception($"Could not parse Type '{target}' onexpr '{context.GetText()}' on line ", context));
            }
        }
        private bool _evaluateNumexpr(NumexprContext context, string? target)
        {
            bool def = true;
            if (context.val() != null)
            {
                if (context.val().num() != null)
                def &= target switch
                {
                    "int" => int.TryParse(context.val().GetText(), out int _),
                    "float" => EvaluateNumexpr(context),
                    _ => false,
                };
                else
                {
                    def &= target == base.Scope?.Lookup(context?.val()?.id()?.GetText()?.Trim('"'))?.Type;
                }
                return def;
            } else
            {
                foreach(var e in context.numexpr())
                    def &= _evaluateNumexpr(e, target);
            }
            return def;

        }
    }
}