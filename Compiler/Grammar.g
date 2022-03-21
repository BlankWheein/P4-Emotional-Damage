grammar Grammar;

/*
 * Parser Rules
 */
Prog : Stmts EOF;


/*  
 * Lexer Rules  
 */
 
WHITESPACE          : (' '|'\t')+ -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;



Stmts : Stmt Stmts;

Stmt : Assignment Math | Print ;

Math : Factor | Expr;

Expr : '+' Val Factor | '-' Val Factor;

Factor: '*' (Val)+ Factor
    | '/' (Val)+ Factor
    | Expr;

Assignment: ValType ID '=' Val;

Val: ID
    | Num
    | '-' Num;

ValType: 'Int'
        | 'Float'
        | 'Double';

Num: Inum|Fnum|Dnum ;
Inum: [1-9][0-9]* ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
Print: 'PrintLine' '(' Val ')' NEWLINE | 'Print' '(' Val ')';
