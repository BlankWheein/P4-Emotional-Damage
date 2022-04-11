using static EmotionalDamageParser;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
//int x = 23;
//bool b = false;
//int y = x + 1 * (x/2);

namespace Compiler
{
    public class ScopeVisitor : EmotionalDamageBaseVisitor<object>
    {
        public SymbolTable Scope { get; set; }
        public ScopeVisitor(SymbolTable scope){
            this.Scope = scope;
        }
        public override object VisitStmts([NotNull] StmtsContext context)
        {
            if (context.stmts() != null){
                foreach (var s in context.stmts()){
    
                    VisitStmts(s);
                }
                return false;
            }
            VisitStmt(context.stmt());
            return false;
        }
        public override object VisitBlock([NotNull] BlockContext context)
        {
            if(context.stmts() != null){
                VisitStmts(context.stmts());
            }
            return false;
        }
        public override object VisitStmt([NotNull] StmtContext context){
            if(context.matrixassign() != null){
                VisitMatrixassign(context.matrixassign());
            }
            else if(context.numassign() != null){
                VisitNumassign(context.numassign());
            }
            else if(context.boolassign() != null){
                VisitBoolassign(context.boolassign());
            }
            else if(context.arrassign() != null){ 
                VisitArrassign(context.arrassign());
            }
            else if(context.unaryoperator() != null){
                VisitUnaryoperator(context.unaryoperator());
            }
            else if(context.print() != null){
                VisitPrint(context.print());
            }
            else if(context.println() != null){
                VisitPrintln(context.println());
            }
            else if(context.funccall()!=null){
                VisitFunccall(context.funccall());
            }
            else if(context.gradfunccall() != null){
                VisitGradfunccall(context.gradfunccall());
            }
            else if(context.returnstmt() != null){
                VisitReturnstmt(context.returnstmt());
            }
            else if(context.iterative()!=null){
                Scope.Root.Allocate();
                VisitIterative(context.iterative());
                Scope.Root.ExitScope();
            }
            else if(context.selective() != null){
                Scope.Root.Allocate();
                VisitSelective(context.selective());
                Scope.Root.ExitScope();
            }
            else if(context.func() != null){
                Scope.Root.Allocate();
                VisitFunc(context.func());
                Scope.Root.ExitScope();
            }
            else if(context.gradfunc() != null){
                Scope.Root.Allocate();
                VisitGradfunc(context.gradfunc());
                Scope.Root.ExitScope();
            }
            return false;
        }
        public override object VisitPrint([NotNull] PrintContext context)
        {
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else{
                context.STRING_CONSTANT();
            }
            return false;
        }
        public override object VisitPrintln([NotNull] PrintlnContext context)
        {
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else{
                context.STRING_CONSTANT();
            }
            return false;
        }
        public override object VisitReturnstmt([NotNull] ReturnstmtContext context)
        {
            if(context.val() != null){
                VisitVal(context.val());
            }
            return false;
        }
        public override object VisitFunc([NotNull] FuncContext context)
        {
            VisitRettype(context.rettype());
            VisitId(context.id());
            if(context.parameters() != null){
                foreach(var p in context.parameters()){
                    VisitParameter(context.parameters());
                }
            }
            VisitBlock(context.block());
            return false;
        }
        public override object VisitGradfunc([NotNull] GradfuncContext context)
        {
            VisitRettype(context.rettype());
            VisitId(context.id());
            if(context.parameters() != null){
                foreach(var p in context.parameters()){
                    VisitParameter(context.parameters());
                }
            }
            VisitBlock(context.block());
            return false;
        }
        public override object VisitRettype([NotNull] RettypeContext context)
        {
            if (context.numtypes() != null){
                VisitNumtypes(context.numtypes());
                if(context.val() != null){
                    foreach(var p in context.val()){
                        VisitVal(context.val());
                    }
                }
            }
            return false;
        }
        public override object VisitNumexpr([NotNull] NumexprContext context)
        {
            if (context.numexpr() != null){
                foreach(var n in context.numexpr()){
                    VisitNumexpr(n);
                }
                return false;
            }
            VisitVal(context.val());
            return false;
        }

    }
}