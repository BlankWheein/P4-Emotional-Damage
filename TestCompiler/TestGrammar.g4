﻿grammar TestGrammar;

prog : stmts EOF;
stmts : (stmt stmts)?;
stmt : ((assignment | print)';') | (selective | iterative) ;
assignment: valtype? id '=' expr;
exprs: expr(','exprs)?;
expr : '(' expr ')'
    | 'sqrt' expr
    | expr ('%' | '**') expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | expr'++'
    | expr'--'
    | val
    ;
textstring: '"' .*? '"';
selective: ifstatement'('bexpr')''{'stmts'}'
    (elifstatement'('bexpr')''{'stmts'}')*
    (elsestatement'{'stmts'}')? 
    ;
ifstatement: 'if';
elifstatement: 'elif';
elsestatement: 'else';
iterative: 'for''('assignment';'bexpr';'exprs')''{'stmts'}';
bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'?expr
      | '!''('bexpr')'
      ;
print: 'print' (textstring | bexpr);
dummy: 'dummy';
val: id
    | ('+' | '-'?) num;

valtype: 'int'
        | 'float'
        | 'double';
id: ID;
num: Inum|Fnum|Dnum ;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE          : [' '\t\r\n]+ -> skip ;
NEWLINE             : ('\r'?'\n')+ ;