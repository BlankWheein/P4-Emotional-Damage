grammar MLgramma;

prog : stmts main EOF;
stmts : (stmt stmts)?;
block: '{'stmts'}';
stmt : (( function_call | assignment | return_ | matrix_assignment | print)';') | function | dummy | selective | iterative ;
function_call: ID'('(ID(','ID)*)?')'
            | rettype? ID '=' ID'('(ID(','ID)*)?')'
            ;
assignment: valtype? ID '=' expr
            | 'string' ID '=' String;
function: 'fun' rettype ('auto')? ID'('(rettype ID (','rettype ID)*)?')'block;
selective: 'if''('bexpr')'block
    ('elif''('bexpr')'block)*
    ('else'block)? 
    ;
iterative: 'for''('assignment';'bexpr';'exprs')'block;

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
bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'?expr
      | '!''('bexpr')'
      ;
main: 'main'block;
print: 'Print' (expr | String) NEWLINE?;
dummy: 'dummy';
val: ID
    | ('+' | '-'?) num;
valtype: 'int'
        | 'float'
        | 'double';

return_: 'return' ID;


matrix_assignment: (valtype'['Inum','Inum']')? ID
                    | ID'['Inum',' Inum']' '=' expr
                    | ID martix_pre_stuff 
                    | ID '=' martix_math
                    ;
martix_math: 
             ID '/' ID
            |ID '+' ID
            |ID '-' ID
            |ID '*' expr
            |ID '.' ID
            ;
martix_pre_stuff:
             '.T'
            |'.random'
            |'.one'
            |'.zero'
            ;
rettype: valtype('['','*']')? | 'string' | 'void';

num: Inum|Fnum|Dnum ;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
String: '"' .*? '"';
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE          : [' '\t\r\n]+ -> skip ;
NEWLINE             : ('\r'?'\n')+ ;

