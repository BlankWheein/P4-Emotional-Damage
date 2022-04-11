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
        private RootSymbolTable _scope = new();
        public RootSymbolTable Scope {get => _scope; set
            {
                if (value != null)
                    _scope = value;
            }
        }
        public ScopeVisitor(RootSymbolTable scope){
            this.Scope = scope;
        }
        public override object VisitStmts(StmtsContext context)
        {
            if (context.stmts() != null){
                VisitStmts(context.stmts());
            }
            VisitStmt(context.stmt());
            return false;
        }
        public override object VisitBlock(BlockContext context)
        {
            if(context.stmts() != null){
                VisitStmts(context.stmts());
            }
            return false;
        }
        public override object VisitStmt(StmtContext context){
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
                Scope.Allocate();
                VisitIterative(context.iterative());
                Scope.ExitScope();
            }
            else if(context.selective() != null){
                Scope.Allocate();
                VisitSelective(context.selective());
                Scope.ExitScope();
            }
            else if(context.func() != null){
                Scope.Allocate();
                VisitFunc(context.func());
                Scope.ExitScope();
            }
            else if(context.gradfunc() != null){
                Scope.Allocate();
                VisitGradfunc(context.gradfunc());
                Scope.ExitScope();
            }
            return false;
        }
        public override object VisitPrint(PrintContext context)
        {
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else{
                context.STRING_CONSTANT();
            }
            return false;
        }
        public override object VisitPrintln(PrintlnContext context)
        {
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else{
                context.STRING_CONSTANT();
            }
            return false;
        }
        public override object VisitReturnstmt(ReturnstmtContext context)
        {
            if(context.val() != null){
                VisitVal(context.val());
            }
            return false;
        }
        public override object VisitFunc(FuncContext context)
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
        public override object VisitGradfunc(GradfuncContext context)
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
        public override object VisitRettype(RettypeContext context)
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
        public override object VisitParameters(ParameterContext context){
            
            if (context.parameters() != null){
                foreach(var p in context.parameters()){
                    VisitParameters(p);
                }
            }
            else if (context.parameter() != null){
                VisitParameter(context.parameter());
            }
            return false;
        }
        public override object VisitNumexpr(NumexprContext context)
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