using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;

namespace Compiler.Phases
{
    public class ScopeVisitorV2 : EmotionalDamageBaseVisitor<object>
    {
        public List<Exception> Diagnostics { get; set; }
        public RootSymbolTable Scope { get; set; }
        public TypeChecker TypeChecker { get; set; }
        private Symbol? CurrentFunction = null;
        private int CurrentFunctionReturnCount = 0;
        public ScopeVisitorV2()
        {
            this.Scope = new RootSymbolTable();
            Diagnostics = Scope.Diagnostics;
            TypeChecker = new(this);
        }
        #region ControlStructures
        public override object VisitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context)
        {
            Scope.Allocate("If");
            TypeChecker.CheckBexpr(context);
            VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        
        public override object VisitProg([NotNull] EmotionalDamageParser.ProgContext context)
        {
            if (TypeChecker.CountReturnStmts(context.stmts()) > 0)
                Scope.AddDiagnostic(new("Cant use Return in global scope"));
            return base.VisitProg(context);
        }
        public override object VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context)
        {
            Scope.Allocate("Elif");
            TypeChecker.CheckBexpr(context);
            VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        public override object VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context)
        {
            Scope.Allocate("Else");
            VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
            Scope.Allocate("For");
            string id = context.IDENTIFIER().First().GetText();
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(SymbolType.Int, context.IDENTIFIER().First().GetText());
            Scope.LookUp(context.IDENTIFIER().Last().GetText());
            VisitChildren(context);
            Scope.ExitScope();
            return false;
        }

        internal void Print()
        {
            PrintScope(Scope.Root);
        }
        private void PrintScope(SymbolTable table, string indent = " ")
        {
            PrintSymbolTable(table, indent);
            foreach (var s in table.Children)
                PrintScope(s, indent + "   ");
        }
        private void PrintSymbolTable(SymbolTable s, string indent)
        {
            if ((s.Parent != null && s.Parent.Children.Count == 0) || s?.Parent?.Children.Last() == s || s.Parent == null)
            {
                Console.Write(indent + "└──");
            }
            else
            {
                Console.Write(indent + "├──");
            }
            Console.WriteLine(s);
            Console.ForegroundColor = ConsoleColor.Green;
        }


        public override object VisitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context)
        {
            Scope.Allocate("While");
            base.VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        public override object VisitFuncStmt([NotNull] EmotionalDamageParser.FuncStmtContext context)
        {
            foreach (var s in context.IDENTIFIER())
                Scope.LookUp(s.GetText());
            return base.VisitFuncStmt(context);
        }
        #endregion
        private string FixMatrixArrayType(string type)
        {
            string rawtype = type.Split("[")[0];
            if (type.Count(p => p == '[') == 1)
                rawtype = "A" + rawtype.ToLower();
            if (type.Count(p => p == '[') == 2)
                rawtype = "M" + rawtype.ToLower();

            return rawtype[0].ToString().ToUpper() + rawtype[1..^0].ToLower(); ;
        }
        #region Declarations
        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            string id = context.IDENTIFIER().First().GetText();
            EmotionalDamageParser.TypesContext? rettype = context.returntype()?.types();
            int row = 0;
            int col = 0;
            if (rettype != null)
            {
                if (rettype.Inum().Length >= 1)
                    int.TryParse(rettype?.Inum(0)?.GetText(), out row);
                if (rettype.Inum().Length >= 2)
                    int.TryParse(rettype?.Inum(1)?.GetText(), out col);
            }
            if (Scope.LookUpExsting(id) == null)
            {
                List<Symbol> symbols = new();
                string type2 = context.returntype().GetText()[0].ToString().ToUpper() + context.returntype().GetText()[1..^0].ToString();
                string rawtype = FixMatrixArrayType(type2);

                if (context.IDENTIFIER().Length > 1)
                    for (int i = 1; i < context.IDENTIFIER().Length; i++)
                    {
                        var type = context.types()[i - 1];
                        string identifier = context.IDENTIFIER()[i].GetText();
                        string rawtype_ = context.types()[i - 1].GetText();
                        Scope.LookUpExsting(identifier);
                        int localrow = 0;
                        int localcol = 0;
                        if (type != null)
                        {
                            if (type.Inum().Length >= 1)
                                int.TryParse(type?.Inum(0)?.GetText(), out localrow);
                            if (type.Inum().Length >= 2)
                                int.TryParse(type?.Inum(1)?.GetText(), out localcol);
                        }
                        symbols.Add(new Symbol(identifier, (SymbolType)Enum.Parse(typeof(SymbolType), FixMatrixArrayType(rawtype_)), row: localrow, col: localcol));
                    }
                        
                Symbol sym = new(id, (SymbolType)Enum.Parse(typeof(SymbolType), rawtype), isfunc: true, parameters: symbols, row: row, col: col);
                var lastFunction = CurrentFunction;
                var lastFunctionReturnCount = CurrentFunctionReturnCount;
                CurrentFunction = sym;
                CurrentFunctionReturnCount = 0;
                TypeChecker.CheckForReturns(context.stmts(), sym);
                Scope.Insert(sym);
                Scope.Allocate("Func");
                foreach (var s in symbols)
                    Scope.Insert(s);
                VisitChildren(context);
                Scope.ExitScope();
                if (CurrentFunctionReturnCount > 1)
                    Scope.AddDiagnostic(new($"Multiple return stmts in function {id}"));
                CurrentFunction = lastFunction;
                CurrentFunctionReturnCount = lastFunctionReturnCount;
            }

            return false;
            }
        public override object VisitDotExprs([NotNull] EmotionalDamageParser.DotExprsContext context)
        {
            string identifier = context.IDENTIFIER().First().GetText();
            string id1 = context.IDENTIFIER()[1].GetText();
            string id2 = context.IDENTIFIER().Last().GetText();
            Symbol? sym = Scope.LookUp(identifier);
            Symbol? sym1 = Scope.LookUp(id1);
            if (!sym1?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new($"{id1} was not a matrix"));
            Symbol? sym2 = Scope.LookUp(id2);
            if (!sym2?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new($"{id2} was not a matrix"));
            if (!sym1?.Type.IsMatrix() != true || !sym2?.Type.IsMatrix() != true)
                return false;
            if (sym == null || sym1 == null || sym2 == null) return false;
            if (sym1 == null || sym2 == null) { return false; }
            if (sym1.Row != sym2.Col)
                Scope.AddDiagnostic(new($"{id1}'s Rows is not Equal to {id2}'s Columns"));
            if (sym.Row != sym1.Row || sym.Col != sym2.Col)
                Scope.AddDiagnostic(new($"{identifier} does not have the dimensions [{sym1.Row}][{sym2.Col}]"));

            return false;
        }
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = context.numtype().GetText()[0].ToString().ToUpper() + context.numtype().GetText()[1..^0].ToString();
            var text = context.GetText();

            TypeChecker.CheckNumDcl(context);
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id);
            return base.VisitNumDcl(context);
        }
        public override object VisitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string text = context.STRING_CONSTANT().GetText();
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert(SymbolType.String, id);
            return base.VisitStringDcl(context);
        }
        public override object VisitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "A" + context.numtype().GetText()[0..^0].ToString();

            if (TypeChecker.CheckArrayDcl(context))
            {
                if (Scope.LookUpExsting(id) == null)
                {
                    int.TryParse(context.Inum().GetText(), out int max_index);
                    Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id, row: max_index);
                }
            }
            return base.VisitArrayDeclaration(context);
        }
        public override object VisitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "M" + context.numtype().GetText();
            var inum = context.Inum();

            if (TypeChecker.CheckMatrixDcl(context)) 
            {
                if (Scope.LookUpExsting(id) == null)
                    Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id, row: int.Parse(inum.First().GetText()), col: int.Parse(inum.Last().GetText()));
            }
            return base.VisitMatrixDeclaration(context);
        }
        public override object VisitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "Bool";
            TypeChecker.CheckBoolDcl(context);
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id);
            return base.VisitBoolDeclaration(context);
        }

        #endregion
        #region Stmt
        public override object VisitReturnStmt([NotNull] EmotionalDamageParser.ReturnStmtContext context)
        {
            CurrentFunctionReturnCount++;
            string id = context.IDENTIFIER().GetText();
            Symbol? sym = Scope.LookUp(id);
            if (CurrentFunction != null && sym != null && !CurrentFunction.Type.IsVoid() && CurrentFunction.SameReturn(sym) == false)
                Scope.AddDiagnostic(new($"{id} does not have return type of {CurrentFunction.Type}"));
            return base.VisitReturnStmt(context);
        }
        #endregion
        #region Assigns
        public override object VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context)
        {
            TypeChecker.CheckNumAssignStmtContext(context);
            string id = context.IDENTIFIER().GetText();
            if (Scope.LookUp(id) == null)
                Scope.AddDiagnostic(new Exception($"{id} was not defined"));
            return base.VisitNumAssignStmt(context);
        }
        public override object VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context)
        {
            TypeChecker.CheckBoolAssignStmtContext(context);
            string id = context.IDENTIFIER().GetText();
            if (Scope.LookUp(id) == null)
                Scope.AddDiagnostic(new Exception($"{id} was not defined"));
            return base.VisitBoolAssignStmt(context);
        }
        public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {
            TypeChecker.CheckMatrixAssign(context);
            return base.VisitMatrixElementAssignStmt(context);
        }
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            TypeChecker.CheckArrayAssign(context);
            return base.VisitArrayElementAssignStmt(context);
        }
        public override object VisitUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context)
        {
            Scope.LookUp(context.IDENTIFIER().GetText());
            return base.VisitUnaryMinus(context);
        }
        public override object VisitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context)
        {
            Scope.LookUp(context.IDENTIFIER().GetText());
            return base.VisitUnaryPlus(context);
        }
        public override object VisitTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context)
        {
            string identifier = context.IDENTIFIER(0).GetText();
            string id1 = context.IDENTIFIER(1).GetText();
            Symbol? sym = Scope.LookUp(identifier);
            Symbol? sym1 = Scope.LookUp(id1);
            if (sym == null || sym1 == null)
                return false;
            if (sym?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new($"{identifier} was not of type Matrix"));
            if (sym1?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new($"{id1} was not of type Matrix"));
            if (sym?.Type.IsMatrix() != true || sym1?.Type.IsMatrix() != true)
                return false;
            if (sym?.Row != sym1?.Col || sym?.Col != sym1?.Row)
                Scope.AddDiagnostic(new($"{identifier} does not have the dimension [{sym1?.Col}][{sym1?.Row}]"));
            return false;
        }
        #endregion


        public override object VisitFuncCall([NotNull] EmotionalDamageParser.FuncCallContext context)
        {
            return base.VisitFuncCall(context);
        }
    }
}