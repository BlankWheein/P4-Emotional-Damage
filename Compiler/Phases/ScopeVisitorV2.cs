using Antlr4.Runtime.Misc;
using Compiler.SymbolTableFolder;

namespace Compiler.Phases
{
    public class ScopeVisitorV2 : EmotionalDamageBaseVisitor<object>
    {
        public List<Exception> Diagnostics { get; set; }
        public RootSymbolTable Scope { get; set; }
        public ScopeVisitorV2() 
        {
            this.Scope = new RootSymbolTable();
            Diagnostics = Scope.Diagnostics;
        }
        #region ControlStructures
        public override object VisitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context)
        {
            Scope.Allocate("If");
            base.VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        public override object VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context)
        {
            Scope.Allocate("Elif");
            base.VisitChildren(context);
            Scope.ExitScope();
            return false;
        }
        public override object VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context)
        {
            Scope.Allocate("Else");
            base.VisitChildren(context);
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
            base.VisitChildren(context);
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
                Scope.LookUpExsting(s.GetText());
            return base.VisitFuncStmt(context);
        }
        #endregion
        #region Declarations
        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            string id = context.IDENTIFIER().First().GetText();
            if (Scope.LookUpExsting(id) == null)
            {
                Scope.Insert(SymbolType.Func, id);
                Scope.Allocate("Func");
                int typecount = context.types().Length;
                if (context.IDENTIFIER().Length > 1)
                for (int i = 1; i < context.IDENTIFIER().Length ; i++)
                {
                    string identifier = context.IDENTIFIER()[i].GetText();
                    string rawtype = context.types()[i - 1].GetText();
                    string type = rawtype[0].ToString().ToUpper() + rawtype[1..^0].ToString();
                    Scope.LookUpExsting(identifier);
                    Scope.Insert((SymbolType) Enum.Parse(typeof(SymbolType), type), identifier);
                }
                VisitChildren(context);
                Scope.ExitScope();
            }
            return false;
        }
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = context.numtype().GetText()[0].ToString().ToUpper() + context.numtype().GetText()[1..^0].ToString();
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id);
            return base.VisitNumDcl(context);
        }
        public override object VisitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string text = context.STRING_CONSTANT().GetText();
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), text), id);
            return base.VisitStringDcl(context);
        }
        public override object VisitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "A" + context.numtype().GetText()[0].ToString().ToUpper() + context.numtype().GetText()[1..^0].ToString();
            if (!int.TryParse(context.Inum().GetText(), out int max_index))
                Scope.AddDiagnostic(new Exception($"{max_index} was not a number"));
            if (max_index < 0)
                Scope.AddDiagnostic(new Exception($"{max_index} was negative"));
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id, row: max_index);
            return base.VisitArrayDeclaration(context);
        }
        public override object VisitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "M" + context.numtype().GetText();
            var inum = context.Inum();
            foreach (var num in inum)
            {
                if (!int.TryParse(num.GetText(), out int max_index))
                    Scope.AddDiagnostic(new Exception($"{max_index} was not a number"));
                if (max_index < 0)
                    Scope.AddDiagnostic(new Exception($"{max_index} was negative"));
            }
            if (Scope.LookUpExsting(id) == null)
                Scope.Insert((SymbolType)Enum.Parse(typeof(SymbolType), type), id, row: int.Parse(inum.First().GetText()), col: int.Parse(inum.Last().GetText()));
            return base.VisitMatrixDeclaration(context);
        }
        public override object VisitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context)
        {
            string id = context.IDENTIFIER().GetText();
            string type = "Bool";
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
            string id = context.IDENTIFIER().GetText();
            if (Scope.LookUpExsting(id) == null)
                Scope.AddDiagnostic(new Exception($"{id} was not defined"));
            return base.VisitNumAssignStmt(context);
        }
        public override object VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context)
        {
            string id = context.IDENTIFIER().GetText();
            if (Scope.LookUpExsting(id) == null)
                Scope.AddDiagnostic(new Exception($"{id} was not defined"));
            return base.VisitBoolAssignStmt(context);
        }
        public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {
            Symbol? m = Scope.LookUp(context.IDENTIFIER().First().GetText());
            if (context.Inum().Length >= 1)
            {
                string? row = context?.Inum()[0]?.GetText();
                if ( row != null && int.Parse(row) >= m?.Row)
                    Scope.AddDiagnostic(new Exception($"{row} was out of index"));
            }
            if (context.Inum().Length == 2)
            {
                string? col = context?.Inum()[1]?.GetText();
                if (col != null && int.Parse(col) >= m?.Col)
                    Scope.AddDiagnostic(new Exception($"{col} was out of index"));
            }
            foreach (var Sid in context.Inum())
                if (int.Parse(Sid.GetText()) < 0)
                    Scope.AddDiagnostic(new Exception($"{Sid.GetText()} was negative"));
            foreach (var Sid in context.IDENTIFIER())
                if (Scope.LookUp(Sid.GetText()) == null)
                    Scope.AddDiagnostic(new Exception($"{Sid.GetText()} was not defined"));
            return base.VisitMatrixElementAssignStmt(context);
        }
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            Symbol? m = Scope.LookUp(context.IDENTIFIER().First().GetText());
            string row = context.Inum().GetText();
            if (int.Parse(row) >= m?.Row)
                Scope.AddDiagnostic(new Exception($"{row} was out of index"));
            if (int.Parse(row) < 0)
                Scope.AddDiagnostic(new Exception($"{row} was negative"));
            foreach (var Sid in context.IDENTIFIER())
                if (Scope.LookUp(Sid.GetText()) == null)
                    Scope.AddDiagnostic(new Exception($"{Sid.GetText()} was not defined"));
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
            Symbol? m = Scope.LookUp(context.IDENTIFIER().GetText());
            if (m?.Type != (SymbolType.Mint | SymbolType.Mfloat))
                Scope.AddDiagnostic(new Exception($"{m?.Id} is not a matrix"));
            return base.VisitTransposeMatrixStmt(context);
        }
        #endregion
    }
}