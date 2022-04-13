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



        //public bool EvaluatePositiveMatrixDimensionsHelper(MatrixassignContext context)
        //{
        //    IntmatrixdclContext dclContext = context.intmatrixdcl();
        //    IntmatrixdclContext dclContext = context.floatmatrixdcl();
        //    IntmatrixdclContext dclContext = context.intmatrixdcl();
        //    bool isValid=false;
        //    if (dclContext != null)
        //    {
        //        foreach(ValContext v in dclContext.val())
        //        {

        //            if (v.num != null)
        //            {
        //                if (v.num().Fnum != null)
        //                {
        //                    isValid = int.TryParse(v.num().Fnum().GetText(), out int x) && x > 0;
        //                }
        //                else if(v.num().Inum != null)
        //                {
        //                    isValid = int.TryParse(v.num().Inum().GetText(), out int x) && x > 0; 
        //                }

        //            }
        //            if (v.id != null)
        //            {

        //            }
        //        }
        //    }

        //}
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
                    isValid = Parent?.Scope?.LookUp(v?.id()?.GetText()?.Trim('"'))?.Type==SymbolType.PositiveInt;
                    
                }

            });
            return isValid;

        }
        public override object VisitFloatmatrixdcl([NotNull] FloatmatrixdclContext context)
        {
            return false;

        }
        public override object VisitMatrixupdate([NotNull] MatrixupdateContext context)
        {
            return false;
        }








        public bool EvaluateNumExprHelper(NumexprContext context, SymbolType type)
        {
            bool isDef = true;
            if (context.val() != null)
            {
                /* if (context.val().num() != null)
                 {
                     isDef &= type switch //check if number is int or float. If not, isDef will be false
                     {
                         SymbolType.Int => int.TryParse(context.val().GetText(), out int _),
                         SymbolType.Float=> float.TryParse(context.val().GetText(), out float _),
                         _ => false,
                     };

                 }
                 else*/
                isDef &= type == Parent?.Scope?.LookUp(context?.val()?.id()?.GetText()?.Trim('"'))?.Type;

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
