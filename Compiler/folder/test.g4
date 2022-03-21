grammar test;

prog : stmts EOF;
stmts : (stmt stmts)?;
stmt : (assignment | print)';' ;
expr : '(' expr ')'
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | val
    ;
assignment: valtype ID '=' expr;

val: ID
    | num
    | '-' num;

valtype: 'Int'
        | 'Float'
        | 'Double';

num: Inum|Fnum|Dnum ;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
print: 'PrintLine' '(' val ')' NEWLINE | 'Print' '(' val ')';
WHITESPACE          : [' '\t\r\n]+ -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;