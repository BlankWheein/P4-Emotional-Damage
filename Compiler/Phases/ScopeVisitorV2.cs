using Antlr4.Runtime.Misc;
using Compiler.Phases.Exceptions;
using Compiler.SymbolTableFolder;

namespace Compiler.Phases
{
    public class ScopeVisitorV2 : EmotionalDamageBaseVisitor<object>
    {
        public List<Exception> Diagnostics { get; set; }
        public List<Exception> Warnings { get; set; }
        public RootSymbolTable Scope { get; set; }
        public TypeChecker TypeChecker { get; set; }
        private Symbol? CurrentFunction = null;
        private int CurrentFunctionReturnCount = 0;
        public ScopeVisitorV2()
        {
            this.Scope = new RootSymbolTable();
            Diagnostics = Scope.Diagnostics;
            Warnings = Scope.Warnings;
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
                Scope.AddDiagnostic(new ("Cant use Return in global scope"));
            return base.VisitProg(context);
        }
        public override object VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context)
        {
            if (context.STRING_CONSTANT() != null && context.GetText().Replace(context?.STRING_CONSTANT()?.ToString(), "").Contains("$"))
            {
                var _out = context.STRING_CONSTANT().ToString().Replace("\"", "").Split("}", StringSplitOptions.RemoveEmptyEntries);
                foreach (var item in _out)
                {
                    Scope.LookUp(item.Split("{")[1].Split("(")[0].Split("[")[0]);
                }
            }
            return base.VisitPrintStmt(context);
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
            Symbol? identifier = Scope.LookUp(context.IDENTIFIER(0).GetText());
            if (identifier == null) { }
            else if (context.IDENTIFIER().ToList().Count - 1 != identifier?.Parameters.Count)
                Scope.AddDiagnostic(new($"Missing parameters on {identifier?.Id}"));
            else if (context.IDENTIFIER().ToList().Count > 1)
                for (int i = 1; i < context.IDENTIFIER().ToList().Count; i++)
                {
                    Symbol? sym = Scope.LookUp(context.IDENTIFIER(i).GetText());
                    if (sym == null) continue;
                    if (!(identifier?.Parameters[i-1].SameReturn(sym) == true))
                        Scope.AddDiagnostic(new($"Expected input '{identifier?.Parameters[i - 1].Type}[{identifier?.Parameters[i - 1].Row}][{identifier?.Parameters[i - 1].Col}]... Actual {sym.Type}[{sym.Row}][{sym.Col}]'"));
                }
            
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
                    Scope.AddDiagnostic(new TypeCheckerException($"Multiple return stmts in function {id}", context));
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
            Symbol? sym2 = Scope.LookUp(id2);
            if (sym1?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new TypeCheckerException($"{id1} was not a matrix", context));
            if (sym2?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new TypeCheckerException($"{id2} was not a matrix", context));
            if (sym1?.Type.IsMatrix() != true || sym2?.Type.IsMatrix() != true)
                return false;
            if (sym == null || sym1 == null || sym2 == null) return false;
            if (sym1 == null || sym2 == null) { return false; }
            if (sym1.Col != sym2.Row)
                Scope.AddDiagnostic(new TypeCheckerException($"{id1}'s Rows is not Equal to {id2}'s Columns", context));
            if (sym.Row != sym1.Row || sym.Col != sym2.Col)
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} does not have the dimensions [{sym1.Row}][{sym2.Col}]", context));
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
        public override object VisitStmts([NotNull] EmotionalDamageParser.StmtsContext context)
        {
            base.VisitChildren(context);
            foreach (var item in Scope.Current.Symbols.Where(p => p.IsUsed == false))
                Scope.AddWarning(new TypeCheckerException($"{item.Id} is declared but never used", context));
            return false;
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
                Scope.AddDiagnostic(new TypeCheckerException($"{id} does not have return type of {CurrentFunction.Type}", context));
            return base.VisitReturnStmt(context);
        }
        public override object VisitReluStmt([NotNull] EmotionalDamageParser.ReluStmtContext context)
        {
            string identifier = context.IDENTIFIER(0).GetText();
            var sym = Scope.LookUpSilent(identifier);
            foreach (var s in context.IDENTIFIER())
            {
                var sym2 = Scope.LookUp(s.GetText());
                if (sym2?.Type != null && sym2?.Type != SymbolType.Int && sym != sym2)
                    Scope.AddDiagnostic(new TypeCheckerException($"{sym2?.Id} was not of type int", context));
            }
            int? count = (context?.IDENTIFIER().Length ?? 0) + (context?.Inum().Length ?? 0);
            if (sym == null) { return false; }
            else if (count == 1 && (sym.Type & (SymbolType.Int | SymbolType.Float)) == 0)
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} was not of type Int or Float", context));
            else if (count == 2 && (sym.Type & (SymbolType.Aint | SymbolType.Afloat)) == 0)
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} was not of type Aint or Afloat", context));
            else if (count == 3 && (sym.Type & (SymbolType.Aint | SymbolType.Afloat)) == 0)
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} was not of type Aint or Afloat", context));
            if (context.Inum().Length == 2)
            {
                if (int.Parse(context.Inum(0).GetText()) >= sym.Row)
                    Scope.AddDiagnostic(new TypeCheckerException($"Index {context.Inum(0).GetText()} was out of row bounds", context));
                if (int.Parse(context.Inum(1).GetText()) >= sym.Col)
                    Scope.AddDiagnostic(new TypeCheckerException($"Index {context.Inum(0).GetText()} was out of col bounds", context));
            }
            return base.VisitReluStmt(context);
        }
        #endregion
        #region Assigns
        public override object VisitRandIdentifierStmt([NotNull] EmotionalDamageParser.RandIdentifierStmtContext context)
        {
            Symbol? id = Scope.LookUp(context.IDENTIFIER(0).GetText());
            if (id != null && (id.Type.IsBool() || id.Type.IsString()))
                Scope.AddDiagnostic(new TypeCheckerException($"{id.Id} can not be of type bool or string", context));
            Symbol? min = Scope.LookUp(context.IDENTIFIER(1).GetText());
            Symbol? max = Scope.LookUp(context.IDENTIFIER(2).GetText());
            if (id == null || min == null || max == null) return false;
            if ((min.Type & (SymbolType.Int | SymbolType.Float)) == 0)
                Scope.AddDiagnostic(new TypeCheckerException($"{min.Id} was not of type int or float", context));
            if ((max.Type & (SymbolType.Int | SymbolType.Float)) == 0)
                Scope.AddDiagnostic(new TypeCheckerException($"{max.Id} was not of type int or float", context));
            if (min.SameReturn(max) == false)
                Scope.AddDiagnostic(new TypeCheckerException($"{min.Id} and {max.Id} was not of same type", context));
            return false;
        }
        public override object VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context)
        {
            bool res = TypeChecker.CheckNumAssignStmtContext(context);
            string id = context.IDENTIFIER().GetText();
            var sym = Scope.LookUpSilent(id);

            if (sym == null)
                Scope.AddDiagnostic(new TypeCheckerException($"{id} was not defined", context));
            else
            {
                sym.IsUsed = false;
                //checking if matrix dimensions are compatible
               if(sym.Type.IsMatrix())
                {
                    string[] ids = context.expr().GetText().Split(new Char[] { '+', '-','*'});
                    Symbol[] syms = new Symbol[ids.Length];
                    bool IsAdded = false;
                    for(int i = 0; i < ids.Length; i++)
                    {
                        syms[i] = Scope.LookUpSilent(ids[i]);
                        if (syms[i] != null && syms[i].Type.IsMatrix() && IsAdded == false)
                        {
                            if ((sym.Col != syms[i].Col || sym.Row != syms[i].Row) && res == true)
                            {
                                Scope.AddDiagnostic(new TypeCheckerException($"{sym.Id}'s dimensions do not match the expression!", context));
                                IsAdded = true;
                            }
                        }
                    }
                   
                  
                }
            }
            return base.VisitNumAssignStmt(context);
        }
        public override object VisitDivideExpr([NotNull] EmotionalDamageParser.DivideExprContext context)
        {
            string id1 = ConvertLastVarToId(context.expr().First().GetText().Split("/")[^1]);
            string temp = context.expr().Last().GetText();
            string id2 = "";
            foreach (var p in temp)
                if (char.IsLetterOrDigit(p))
                    id2 += p;
                else
                    break;
            Symbol? sym1 = ConvertValueToSymbol(id1);
            Symbol? sym2 = ConvertValueToSymbol(id2);
            if (id2.Replace("0", "") == "" || id2.Replace("0", "") == ".")
                Scope.AddDiagnostic(new($"cant divide with 0 on '{id1} / {id2}'"));
            if (sym1 == null || sym2 == null) return false;
            if (sym1.Type.IsMatrix() || sym1.Type.IsArray() || sym2.Type.IsMatrix() || sym2.Type.IsArray())
                Scope.AddDiagnostic(new($"Could not divide {id1} with {id2}"));
            return base.VisitDivideExpr(context);
        }
        public override object VisitMinusExpr([NotNull] EmotionalDamageParser.MinusExprContext context)
        {
            string id1 = ConvertLastVarToId(context.expr().First().GetText().Split("-")[^1]);
            string temp = context.expr().Last().GetText();
            string id2 = "";
            foreach (var p in temp)
                if (char.IsLetterOrDigit(p))
                    id2 += p;
                else
                    break;
            Symbol? sym1 = ConvertValueToSymbol(id1);
            Symbol? sym2 = ConvertValueToSymbol(id2);
            if (sym1 == null || sym2 == null) return false;
            if (sym1.Type.IsMatrix() || sym2.Type.IsMatrix())
                if (!(sym1.Type.IsMatrix() && sym2.Type.IsMatrix()))
                    Scope.AddDiagnostic(new($"'{id1} - {id2}' was not of same type"));
                else if (sym1.Row != sym2.Row || sym1.Col != sym2.Col)
                    Scope.AddDiagnostic(new TypeCheckerException($"Matrices {sym1.Id} and {sym2.Id} do not have the same dimensions!", context));

            if (sym1.Type.IsArray() || sym2.Type.IsArray())
                if (!(sym1.Type.IsArray() && sym2.Type.IsArray()))
                    Scope.AddDiagnostic(new($"'{id1} - {id2}' was not of same type"));
            return base.VisitMinusExpr(context);
        }
        public string ConvertLastVarToId(string text)
        {
            string id = "";
            foreach (var p in text.Reverse())
                if (char.IsLetterOrDigit(p))
                    id += p;
                else
                    break;
            string final = "";
            foreach (var p in id.Reverse())
                final += p;
            return final;
        }
        public override object VisitPlusExpr([NotNull] EmotionalDamageParser.PlusExprContext context)
        {
            string text = context.expr().First().GetText();
            string id1 = ConvertLastVarToId(context.expr().First().GetText().Split("+")[^1]);
            string temp = context.expr().Last().GetText();
            string id2 = "";
            foreach (var p in temp)
                if (char.IsLetterOrDigit(p))
                    id2 += p;
                else
                    break;
            Symbol? sym1 = ConvertValueToSymbol(id1);
            Symbol? sym2 = ConvertValueToSymbol(id2);
            if (sym1 == null || sym2 == null) return false;
            if (sym1.Type.IsMatrix() || sym2.Type.IsMatrix())
            {
                if (!(sym1.Type.IsMatrix() && sym2.Type.IsMatrix()))
                {
                    Scope.AddDiagnostic(new($"'{id1} + {id2}' was not of same type"));
                }
                else if (sym1.Row != sym2.Row || sym1.Col != sym2.Col)
                {
                    Scope.AddDiagnostic(new TypeCheckerException($"Matrices {sym1.Id} and {sym2.Id} do not have the same dimensions!", context));
                }
            }
            if (sym1.Type.IsArray() || sym2.Type.IsArray())
                if (!(sym1.Type.IsArray() && sym2.Type.IsArray()))
                    Scope.AddDiagnostic(new($"'{id1} + {id2}' was not of same type")); 
            return base.VisitPlusExpr(context);
        }
        public override object VisitTimesExpr([NotNull] EmotionalDamageParser.TimesExprContext context)
        {
            string id1 = ConvertLastVarToId(context.expr().First().GetText().Split("*")[^1]);
            string temp = context.expr().Last().GetText();
            string id2 = "";
            foreach (var p in temp)
                if (char.IsLetterOrDigit(p))
                    id2 += p;
                else
                    break;
            Symbol? sym1 = ConvertValueToSymbol(id1);
            Symbol? sym2 = ConvertValueToSymbol(id2);
            if (sym1 == null || sym2 == null) return false;
            if ((sym1.Type.IsMatrix() || sym1.Type.IsArray()) && (sym2.Type.IsMatrix() || sym2.Type.IsArray()))
                    Scope.AddDiagnostic(new($"could not multiply {id1} with {id2}"));
            return base.VisitTimesExpr(context);
        }
        private Symbol? ConvertValueToSymbol(string val)
        {
            Symbol? sym = Scope.LookUpSilent(val);
            if (int.TryParse(val, out _))
                return new Symbol("Constant", SymbolType.Int);
            else if (float.TryParse(val, out _))
                return new Symbol("Constant", SymbolType.Float);
            else if (sym != null)
                return sym;
            else
            {
                return null;
            }
            throw new Exception();
        }
        public override object VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context)
        {
            TypeChecker.CheckBoolAssignStmtContext(context);
            string id = context.IDENTIFIER().GetText();
            if (Scope.LookUp(id) == null)
                Scope.AddDiagnostic(new TypeCheckerException($"{id} was not defined",context));
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
            Symbol? sym = Scope.LookUp(context.IDENTIFIER().GetText());
            if (sym != null)
                if (sym.Type.IsMatrixArray() || sym.Type.IsBool() || sym.Type.IsString())
                    Scope.AddDiagnostic(new TypeCheckerException($"{sym?.Id} was not of type int or float", context));
            return base.VisitUnaryMinus(context);
        }
        public override object VisitSqrtExpr([NotNull] EmotionalDamageParser.SqrtExprContext context)
        {
            string expr = context.expr().GetText();
            expr = expr.Replace("(", "").Replace(")", "");
            var _out = TypeChecker.SplitOnOperatorsExpr(expr);
            foreach (var o in _out)
            {
                Symbol? sym = Scope.LookUpSilent(o.Split("[")[0]);
                if (sym == null) continue;
                if (sym.Type.IsMatrixArray())
                    Scope.AddDiagnostic(new TypeCheckerException($" cant get Square root of '{sym.Id}'", context));
            }
            return base.VisitSqrtExpr(context);
        }
        public override object VisitPowExpr([NotNull] EmotionalDamageParser.PowExprContext context)
        {
            string id1 = ConvertLastVarToId(context.expr().First().GetText().Split("**")[^1]);
            string temp = context.expr().Last().GetText();
            string id2 = "";
            foreach (var p in temp)
                if (char.IsLetterOrDigit(p))
                    id2 += p;
                else
                    break;
            Symbol? sym1 = ConvertValueToSymbol(id1);
            Symbol? sym2 = ConvertValueToSymbol(id2);
            if (sym1 == null || sym2 == null) return false;
            if (sym1.Type.IsMatrix() || sym1.Type.IsArray() || sym2.Type.IsMatrix() || sym2.Type.IsArray())
                Scope.AddDiagnostic(new($"Could not power {id1} with {id2}"));
            return base.VisitPowExpr(context);
        }
        public override object VisitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context)
        {
            Symbol? sym = Scope.LookUp(context.IDENTIFIER().GetText());
            if (sym != null)
                if (sym.Type.IsMatrixArray() || sym.Type.IsBool() || sym.Type.IsString())
                    Scope.AddDiagnostic(new TypeCheckerException($"{sym?.Id} was not of type int or float", context));
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
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} was not of type Matrix", context));
            if (sym1?.Type.IsMatrix() != true)
                Scope.AddDiagnostic(new TypeCheckerException($"{id1} was not of type Matrix", context));
            if (sym?.Type.IsMatrix() != true || sym1?.Type.IsMatrix() != true)
                return false;
            if (sym?.Row != sym1?.Col || sym?.Col != sym1?.Row)
                Scope.AddDiagnostic(new TypeCheckerException($"{identifier} does not have the dimension [{sym1?.Col}][{sym1?.Row}]", context));
            return false;
        }
        #endregion
        public override object VisitGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context)
        {
            string identifier = context.IDENTIFIER(0).GetText();
            string id1 = context.IDENTIFIER(1).GetText();
            string id2 = context.IDENTIFIER(2).GetText();
            Symbol? symbol = Scope.LookUpExsting(identifier);
            Symbol? sym1 = Scope.LookUp(id1);
            Symbol? sym2 = Scope.LookUp(id2);
            if (symbol != null) return false;
            if (sym1 == null || sym2 == null) return false;
            if (sym1.Type.IsMatrix() || sym1.Type.IsArray())
                Scope.AddDiagnostic(new TypeCheckerException($"{id1} was of type Matrix/Array", context));
            if (sym2.Type.IsMatrix() || sym2.Type.IsArray())
                Scope.AddDiagnostic(new TypeCheckerException($"{id2} was of type Matrix/Array", context));
            if (sym1.Type.IsBool() || sym1.Type.IsString())
                Scope.AddDiagnostic(new TypeCheckerException($"{id1} was of type Bool/String", context));
            if (sym2.Type.IsBool() || sym2.Type.IsString())
                Scope.AddDiagnostic(new TypeCheckerException($"{id2} was of type Bool/String", context));
            if (sym1.Type.IsVoid() || sym2.Type.IsVoid())
                Scope.AddDiagnostic(new TypeCheckerException($"{id1} OR {id2} was of type void... How did this happen", context));
            return false;
        }
    }
}