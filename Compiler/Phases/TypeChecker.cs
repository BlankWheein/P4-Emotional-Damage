using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;
using static EmotionalDamageParser;

namespace Compiler.Phases
{
    class TypeChecker
    {
        //typecasting
        //typechecking, correct type, and compatible operations
        public ScopeVisitor Parent { get; }

        public TypeChecker(ScopeVisitor parent)
        {
            Parent = parent;
        }


        public bool EvaluateNumExpr(NumexprContext context, SymbolType type)
        {
            bool isDef = true;
            if (context.val() != null)
            {
                if (context.val().num() != null)
                {
                    isDef &= type switch //check if number is int or float. If not, isDef will be false
                    {
                        SymbolType.Int => int.TryParse(context.val().GetText(), out int _),
                        SymbolType.Float=> float.TryParse(context.val().GetText(), out float _),
                        _ => false,
                    };

                }
                else
                {
                    isDef &= type == Parent?.Scope?.LookUp(context?.val()?.id()?.GetText()?.Trim('"'))?.Type;
                }
            }
            else
            {
                foreach (NumexprContext e in context.numexpr())
                    isDef &= EvaluateNumExpr(e, type);
            }
            return isDef;
        }
    }
}
