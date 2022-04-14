using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;
using static EmotionalDamageParser;

namespace Compiler.Phases
{
    class TypeChecker : EmotionalDamageBaseVisitor<object>
    {
        //typecasting
        //typechecking, correct type, and compatible operations
        public ScopeVisitor Parent { get; }

        public TypeChecker(ScopeVisitor parent)
        {
            Parent = parent;
        }


        /// <summary>
        /// check if dimensions are positive integers, and values are integers
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitIntarrdcl([NotNull] IntarrdclContext context)
        {
            bool isValid = true;

            if (context.val(0).num != null)
            {
                isValid &= int.TryParse(context.val(0).GetText(), out int x) && x > 0;
            }
            else if (context.val(0).id != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val(0).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }

            if (context.val(1).num != null)
            {
                isValid &= int.TryParse(context.val(1).GetText(), out int _);
            }
            else if (context.val(1).id != null)
            {
                isValid &= (Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.Int
                || Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt);

            }

            return isValid;
        }

        /// <summary>
        ///  check if dimensions are positive integers, and values are floats
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitFloatarrdcl([NotNull] FloatarrdclContext context)
        {
            bool isValid = true;

            if (context.val(0).num != null)
            {
                isValid &= int.TryParse(context.val(0).GetText(), out int x) && x > 0;
            }
            else if (context.val(0).id != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val(0).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }

            if (context.val(1).num != null)
            {
                isValid &= float.TryParse(context.val(1).GetText(), out float _);
            }
            else if (context.val(1).id != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.Float;

            }
            return isValid;
        }

        /// <summary>
        /// Check if dimensions are positive integers
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitArrupdate([NotNull] ArrupdateContext context)
        {
            bool isValid = true;

            if (context.val().num != null)
            {
                isValid &= int.TryParse(context.val().GetText(), out int x) && x > 0;
            }
            else if (context.val().id != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }
            return isValid;
        }

        /// <summary>
        /// Check if matrix dimensions are positive integers
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitIntmatrixdcl([NotNull] IntmatrixdclContext context)
        {
            bool isValid = true;
            context.val().ToList().ForEach(v =>
            {
                if (v.num != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v.id().GetText().Trim('"'))?.Type==SymbolType.PositiveInt;
                    
                }

            });
            return isValid;

        }
        public override object VisitFloatmatrixdcl([NotNull] FloatmatrixdclContext context)
        {
            bool isValid = true;
            context.val().ToList().ForEach(v =>
            {
                if (v.num != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v.id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;

                }

            });
            return isValid;

        }
        public override object VisitMatrixupdate([NotNull] MatrixupdateContext context)
        {
            bool isValid = true;
            context.val().ToList().ForEach(v =>
            {
                if (v.num != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v?.id()?.GetText()?.Trim('"'))?.Type == SymbolType.PositiveInt;
                }
            });
            return isValid;
        }




        public bool EvaluateNumExprHelper(NumexprContext context, SymbolType type)
        {
            bool isDef = true;
            if (context.val() != null)
            {
                if (context.val().num() != null)
                {
                    isDef &= type switch //check if number is int or float. If not, isDef will be false
                    {
                        SymbolType.Int => int.TryParse(context.val().GetText(), out int _),
                        SymbolType.PositiveInt => int.TryParse(context.val().GetText(), out int _),
                        SymbolType.Float => float.TryParse(context.val().GetText(), out float _),
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
                    isDef &= EvaluateNumExprHelper(e, type);
            }
            return isDef;
        }
    }
}
