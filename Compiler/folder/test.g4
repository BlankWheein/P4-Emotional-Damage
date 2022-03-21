grammar test;

prog : stmts EOF;
stmts : (stmt stmts)?;
stmt : (assignment | print)';' ;
expr : '(' expr ')'
    | 'sqrt' expr
    | expr ('%' | '**') expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | val
    ;
    
bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'?expr
      | '!''('bexpr')'
      ;
assignment: valtype ID '=' expr;
print: 'Print' (expr | String) NEWLINE?;

val: ID
    | ('+' | '-'?) num;

valtype: 'int'
        | 'float'
        | 'double';

num: Inum|Fnum|Dnum ;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
String: '"' .*? '"';
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE          : [' '\t\r\n]+ -> skip ;
NEWLINE             : ('\r'?'\n')+ ;