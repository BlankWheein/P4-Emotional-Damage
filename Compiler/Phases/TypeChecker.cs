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
        public List<Exception> Diagnostics { get; set; } = new();
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

            //checks if the dimensions are positive ints
            if (context.val(0).num() != null)
            {
                isValid &= int.TryParse(context.val(0).GetText(), out int x) && x > 0;
            }
            else if (context.val(0).id() != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val(0).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }

            //checks if the values are ints
            if (context.val(1).num() != null)
            {
                isValid &= int.TryParse(context.val(1).GetText(), out int _);
            }
            else if (context.val(1).id() != null)
            {
                isValid = isValid &&
                    (Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.Int
                || Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt);

            }
            if (isValid == false)
            {
                Diagnostics.Add(new Exception("Intarrdcl: Dimensions should be positive ints, and values ints"));
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

            //checks if the dimensions are positive ints
            if (context.val(0).num() != null)
            {
                isValid &= int.TryParse(context.val(0).GetText(), out int x) && x > 0;
            }
            else if (context.val(0).id() != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val(0).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }

            //checks if values are floats, or int(that can be typecasted to floats)
            if (context.val(1).num() != null)
            {
                isValid &= float.TryParse(context.val(1).GetText(), out float _);
            }
            else if (context.val(1).id() != null)
            {
                isValid = isValid &&
                    (Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.Int
                || Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt
                || Parent?.Scope?.LookUp(context.val(1).id().GetText().Trim('"'))?.Type == SymbolType.Float);
            }

            if (isValid == false)
            {
                Diagnostics.Add(new Exception("Floatarrdcl: Dimensions should be positive ints, and values floats"));
            }
            return isValid;
        }

        /// <summary>
        /// Check if dimensions are positive integers
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
       /* public override object VisitArrupdate([NotNull] ArrupdateContext context)
        {
            bool isValid = true;

            if (context.val().num() != null)
            {
                isValid &= int.TryParse(context.val().GetText(), out int x) && x > 0;
            }
            else if (context.val().id() != null)
            {
                isValid &= Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
            }

            if (isValid == false)
            {
                Diagnostics.Add(new Exception("Arrupdate: dimensions should be positive ints"));
            }
            return isValid;
        }*/

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
                if (v.num() != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id() != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v.id().GetText().Trim('"'))?.Type==SymbolType.PositiveInt;
                    
                }

            });
            //this is not finished
            if (context.numexpr() != null)
            {
                isValid&=EvaluateNumExprHelper(context.numexpr(), SymbolType.Int);
            }

            if (isValid == false)
            {
                Diagnostics.Add(new Exception("IntMatrixdcl: Dimensions should be positive ints, and values ints or int matrices"));
            }
            return isValid;

        }
        public override object VisitFloatmatrixdcl([NotNull] FloatmatrixdclContext context)
        {
            bool isValid = true;
            context.val().ToList().ForEach(v =>
            {
                if (v.num() != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id() != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v.id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;

                }

            });
            if (context.numexpr() != null)
            {
                isValid &= EvaluateNumExprHelper(context.numexpr(), SymbolType.Float);
            }
            if (isValid == false)
            {
                Diagnostics.Add(new Exception("FloatMatrixdcl: Dimensions should be positive ints, and values floats or float matrices"));
            }
            return isValid;

        }
        /*
        public override object VisitMatrixupdate([NotNull] MatrixupdateContext context)
        {
            bool isValid = true;
            context.val().ToList().ForEach(v =>
            {
                if (v.num() != null)
                {
                    isValid &= int.TryParse(v.GetText(), out int x) && x > 0;
                }
                else if (v.id() != null)
                {
                    isValid &= Parent?.Scope?.LookUp(v.id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt;
                }
            });
            return isValid;
        }
        */



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
                else if (context.val().id() != null)
                {
                    if (type != SymbolType.Float)
                    {
                        isDef &= type == Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type;
                    }
                    else //int values can also be assigned to floats
                    {
                        isDef &= (Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type== SymbolType.Float
                            || Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type == SymbolType.Int
                            || Parent?.Scope?.LookUp(context.val().id().GetText().Trim('"'))?.Type == SymbolType.PositiveInt
                            );
                    }
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
