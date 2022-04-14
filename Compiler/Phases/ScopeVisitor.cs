using static EmotionalDamageParser;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;

namespace Compiler
{
    public class ScopeVisitor : EmotionalDamageBaseVisitor<object>, IDisposable
    {
        public List<Exception> Diagnostics {get; set; }
        public RootSymbolTable Scope {get; set; }
        public ScopeVisitor(){
            this.Scope = new RootSymbolTable();
            Diagnostics = Scope.Diagnostics;
        }
        
        public override object VisitFunc(FuncContext context)
        {
            var id = context.id().GetText();
            SymbolType s = context.rettype().GetText() switch
            {
                "void" => SymbolType.Void,
                "string" => SymbolType.String,
                "int" => SymbolType.Int,
                "float" => SymbolType.Float,
                _ => SymbolType.NotDefined,
            };
            if (s == SymbolType.NotDefined) Scope.Diagnostics.Add(new Exception("Symbol was not defined"));
            if(Scope.LookUpExsting(id) == null){
                Scope.Insert(s, id, true);
            }
            Scope.Allocate();
            VisitRettype(context.rettype());
            if(context.parameters() != null){
               
              VisitParameters(context.parameters());  
            }
            VisitBlock(context.block());
            Scope.ExitScope();
            return false;
        }
        public override object VisitGradfunc(GradfuncContext context)
        {
            var id = context.id().GetText();
            var s = SymbolType.Reserved;
            Scope.Allocate();
            if (context.parameters() != null)
                VisitParameters(context.parameters());
            VisitNumexpr(context.numexpr());
            Scope.ExitScope();
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(s, id, true);
            return false;
        }

        public override object VisitIntdcl(IntdclContext context)
        {
            var id = context.id().GetText();
            var s = SymbolType.Int;
            bool isInitialized = false;
            if (context.numexpr() != null){
                VisitNumexpr(context.numexpr());
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null){
                Scope.Insert(s, id, isInitialized);
            }
            return false;
        }
        public override object VisitFloatdcl(FloatdclContext context)
        {
            var id = context.id().GetText();
            var s = SymbolType.Float;
            bool isInitialized = false;
            if (context.numexpr() != null){
                VisitNumexpr(context.numexpr());
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(s, id, isInitialized);
            return false;
        }
        public override object VisitIntarrdcl(IntarrdclContext context)
        {
            var id = context.id().GetText();
            var s = SymbolType.Int;
            bool isInitialized = false;
            if (context.val() != null){
                foreach (var v in context.val())
                    VisitVal(v);
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(s, id, isInitialized);
            return false;
        }
        public override object VisitFloatarrdcl(FloatarrdclContext context){
            var id = context.id().GetText();
            var s = SymbolType.Float;
            bool isInitialized = false;
            if (context.val() != null){
                foreach (var v in context.val())
                    VisitVal(v);
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(s, id, isInitialized);
            return false;
        }
        
        public override object VisitIntmatrixdcl(IntmatrixdclContext context){
            var id = context.id().GetText();
            var s = SymbolType.Int;
            bool isInitialized = false;
            foreach(var v in context.val()){
                VisitVal(v);
            }
            if(context.matrixarrexpr() != null){
                VisitMatrixarrexpr(context.matrixarrexpr());
                isInitialized = true;
            }
            else if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
                isInitialized = true;
            }
            if(Scope.LookUpExsting(id) == null){
                Scope.Insert(s, id, isInitialized);
            }
            return false;
        }
        public override object VisitFloatmatrixdcl(FloatmatrixdclContext context){
            var id = context.id().GetText();
            var f = SymbolType.Float;
            bool isInitialized = false;
            foreach(var v in context.val()){
                VisitVal(v);
            }
            if(context.matrixarrexpr() != null){
                VisitMatrixarrexpr(context.matrixarrexpr());
                isInitialized = true;
            }
            else if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(f, id, isInitialized);
            return false;
        }

        
        public override object VisitBooldcl(BooldclContext context)
        {
            var id = context.id().GetText();
            var s = SymbolType.Bool;
            bool isInitialized = false;
            if (context.bexpr() != null){
                VisitBexpr(context.bexpr());
                isInitialized = true;
            }
            else if(context.boolval() != null){
                VisitBoolval(context.boolval());
                isInitialized = true;
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(s, id, isInitialized);
            return false;
        }
        public override object VisitSelective(SelectiveContext context){
            Scope.Allocate();
            VisitIfstmt(context.ifstmt());
            Scope.ExitScope();
            if(context.elifstmt() != null){
                foreach(var e in context.elifstmt()){
                    Scope.Allocate();
                    VisitElifstmt(e);
                    Scope.ExitScope();
                }
            }
            else if(context.elsestmt() != null){
                Scope.Allocate();
                VisitElsestmt(context.elsestmt());
                Scope.ExitScope();
            }
            return false;
        }
        
        public override object VisitForstmt(ForstmtContext context)
        {
            Scope.Allocate();
            if(context.intdcl() != null){
                VisitIntdcl(context.intdcl());
            }
            VisitBexpr(context.bexpr());
            VisitUnaryoperator(context.unaryoperator());
            VisitBlock(context.block());
            Scope.ExitScope();
            return false;
        }
        public override object VisitWhilestmt(WhilestmtContext context)
        {
            Scope.Allocate();
            VisitBexpr(context.bexpr());
            VisitBlock(context.block());
            Scope.ExitScope();
            return false;
        }

        public override object VisitNumupdate(NumupdateContext context)
        {
            if(Scope.LookUp(context.id().GetText()) == null){
                return false;
            }
            return base.VisitNumupdate(context);
        }
        public override object VisitVal(ValContext context){ 
            if(context.id() != null){
                if(Scope.LookUp(context.id().GetText()) == null){
                    return false;
                }
            }
            return base.VisitVal(context);
        }
        // calling a gradfunction inters VisitFunccall, 
        //instead of VisitGradfunccall, 
        //this can be a problem if we want to optimize
        public override object VisitFunccall(FunccallContext context)
        {
            foreach(var i in context.id()){
                if(Scope.LookUp(i.GetText()) == null){ 
                    return false;
                }
            }
            return base.VisitFunccall(context);
        }

        public override object VisitGradfunccall(GradfunccallContext context)
        {
            if (Scope.LookUp(context.id().GetText()) == null)
            {
                return false;
            }
            return base.VisitGradfunccall(context);
        }
        public void Dispose()
        {
            /* clears the symbols or variables decarled 
            within the scope, Something like this*/
            Scope.Dispose(); 
            /*so we an example would be that a function x takes a parameter y,
            and with in x a variable g is defined. When this method is called
            the local name variable g is removed form the symbol table.*/
        }
    }
}