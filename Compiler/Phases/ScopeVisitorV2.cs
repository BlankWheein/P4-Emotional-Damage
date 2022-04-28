using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;

namespace Compiler.Phases
{
    public class ScopeVisitorV2 : EmotionalDamageBaseVisitor<object>
    {
        public List<Exception> Diagnostics { get; set; }
        public RootSymbolTable Scope { get; set; }
        public TypeChecker TypeChecker { get; set; }
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
                        Scope.Insert(sym);
                        Scope.Allocate("Func");
                        foreach (var s in symbols)
                            Scope.Insert(s);
                        VisitChildren(context);
                        Scope.ExitScope();
                    }

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
            string id = context.IDENTIFIER().GetText();
            Scope.LookUp(id);
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
            TypeChecker.CheckMatrixTranspose(context);
            return base.VisitTransposeMatrixStmt(context);
        }
        #endregion


        public override object VisitFuncCall([NotNull] EmotionalDamageParser.FuncCallContext context)
        {
            return base.VisitFuncCall(context);
        }
    }
}