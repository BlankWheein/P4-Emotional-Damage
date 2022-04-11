using static EmotionalDamageParser;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Compiler
{
    public class ScopeVisitor : EmotionalDamageBaseVisitor<object>
    {
        public List<Exception> Diagnostics {get; set; }
        private RootSymbolTable _scope = new();
        public RootSymbolTable Scope {get => _scope; set
            {
                if (value != null)
                    _scope = value;
            }
        }
        public ScopeVisitor(){
            this.Scope = new RootSymbolTable();
            Diagnostics = Scope.Diagnostics;
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
                VisitSelective(context.selective());
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
               
              VisitParameters(context.parameters());  
            }
            VisitBlock(context.block());
            return false;
        }
        public override object VisitGradfunc(GradfuncContext context)
        {
            VisitRettype(context.rettype());
            VisitId(context.id());
            if(context.parameters() != null){
                VisitParameters(context.parameters());
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
                        VisitVal(p);
                    }
                }
            }
            return false;
        }
        public override object VisitParameters(ParametersContext context){
            
            if (context.parameters() != null){
                    VisitParameters(context.parameters());
            }
            else if (context.parameter() != null){
                VisitParameter(context.parameter());
            }
            return false;
        }
        public override object VisitParameter(ParameterContext context){
            if(context.numtypes() != null){
                VisitNumtypes(context.numtypes());
            }
            else if(context.matrixparameter() != null){
                VisitMatrixparameter(context.matrixparameter());
            }
            else if(context.arrparameter() != null){
                VisitArrparameter(context.arrparameter());
            }
            VisitId(context.id());
            return false;
        }
        public override object VisitMatrixparameter(MatrixparameterContext context)
        {
            VisitNumtypes(context.numtypes());
            foreach(var v in context.val())
            {
                VisitVal(v);
            }
            return false;
        }
        public override object VisitArrparameter(ArrparameterContext context)
        {
            VisitNumtypes(context.numtypes());
            VisitVal(context.val());
            return false;
        }
        public override object VisitIntdcl(IntdclContext context)
        {
            VisitId(context.id());
            if (context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            return false;
        }
        public override object VisitFloatdcl(FloatdclContext context)
        {
            VisitId(context.id());
            if (context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            return false;
        }
        public override object VisitIntarrdcl(IntarrdclContext context)
        {
            VisitId(context.id());
            if(context.val() != null){
                foreach (var v in context.val())
                {
                    VisitVal(v);
                }
            }
            return false;
        }
        public override object VisitFloatarrdcl(FloatarrdclContext context){
            VisitId(context.id());
            if(context.val() != null){
                foreach (var v in context.val())
                {
                    VisitVal(v);
                }
            }
            return false;
        }
        public override object VisitArrupdate(ArrupdateContext context){
            VisitId(context.id());
            if(context.val() != null){
                VisitVal(context.val());
            }
            if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            else if(context.arrexpr() != null){
                VisitArrexpr(context.arrexpr());
            }
            return false;
        }
        public override object VisitArrassign(ArrassignContext context)
        {
            if (context.intarrdcl() != null){
                VisitIntarrdcl(context.intarrdcl());
            }
            else if(context.floatarrdcl() != null){
                VisitFloatarrdcl(context.floatarrdcl());
            }
            else if(context.arrupdate() != null){
                VisitArrupdate(context.arrupdate());
            }
            return false;
        }
        public override object VisitMatrixassign(MatrixassignContext context){
            if (context.intmatrixdcl() != null){
                VisitIntmatrixdcl(context.intmatrixdcl());
            }
            else if(context.floatmatrixdcl() != null){
                VisitFloatmatrixdcl(context.floatmatrixdcl());
            }
            else if(context.matrixupdate() != null){
                VisitMatrixupdate(context.matrixupdate());
            }
            return false;
        }
        public override object VisitIntmatrixdcl(IntmatrixdclContext context){
            foreach(var v in context.val()){
                VisitVal(v);
            }
            VisitId(context.id());
            if(context.matrixarrexpr() != null){
                VisitMatrixarrexpr(context.matrixarrexpr());
            }
            else if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            return false;
        }
        public override object VisitFloatmatrixdcl(FloatmatrixdclContext context){
            foreach(var v in context.val()){
                VisitVal(v);
            }
            VisitId(context.id());
            if(context.matrixarrexpr() != null){
                VisitMatrixarrexpr(context.matrixarrexpr());
            }
            else if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            return false;
        }
        public override object VisitMatrixupdate(MatrixupdateContext context){
            VisitId(context.id());
            if(context.val() != null){
                foreach(var v in context.val()){
                    VisitVal(v);
                }
            }
            if(context.numexpr() != null){
                VisitNumexpr(context.numexpr());
            }
            else if(context.matrixarrexpr() != null){
                VisitMatrixarrexpr(context.matrixarrexpr());
            }
            return false;
        }
        public override object VisitMatrixarrexpr(MatrixarrexprContext context){
            if(context.id() != null){
                foreach (var i in context.id())
                {
                    VisitId(i);
                }
            }
            if(context.val() != null){
                VisitVal(context.val());
            }
            else if(context.matrixtranspose() != null){
                VisitMatrixtranspose(context.matrixtranspose());
            }
            else if(context.matrixinverse() != null){
                VisitMatrixinverse(context.matrixinverse());
            }
            return false;
            
        }
        public override object VisitArrexpr(ArrexprContext context)
        {
            VisitId(context.id());
            return false;
        }
        public override object VisitNumassign(NumassignContext context)
        {
            if (context.intdcl() != null){
                VisitIntdcl(context.intdcl());
            }
            else if (context.floatdcl() != null){
                VisitFloatdcl(context.floatdcl());
            }
            else if (context.numupdate() != null){
                VisitNumupdate(context.numupdate());
            }
            return false;
        }
        public override object VisitNumupdate(NumupdateContext context){ 
            VisitId(context.id());
            VisitNumexpr(context.numexpr());    
            return false; 
        }
        public override object VisitBoolassign(BoolassignContext context){
            if (context.booldcl() != null){
                VisitBooldcl(context.booldcl());
            }
            else if (context.boolupdate() != null){
                VisitBoolupdate(context.boolupdate());
            }
            return false;
        }
        public override object VisitBoolupdate(BoolupdateContext context)
        {
            VisitId(context.id());
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else if(context.boolval() != null){
                VisitBoolval(context.boolval());
            }
            return false;
        }
        public override object VisitBooldcl(BooldclContext context)
        {
            VisitId(context.id());
            if(context.bexpr() != null){
                VisitBexpr(context.bexpr());
            }
            else if(context.boolval() != null){
                VisitBoolval(context.boolval());
            }
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
        public override object VisitIfstmt(IfstmtContext context){
            VisitBexpr(context.bexpr());
            VisitBlock(context.block());
            return false;
        }
        public override object VisitElifstmt(ElifstmtContext context){
            VisitBexpr(context.bexpr());
            VisitBlock(context.block());
            return false;
        }
        public override object VisitElsestmt(ElsestmtContext context)
        {
            VisitBlock(context.block());
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