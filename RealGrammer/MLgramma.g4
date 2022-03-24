grammar MLgramma;

prog : stmts main EOF;
stmts : (stmt stmts)?;
block: '{'stmts'}';
stmt : (( function_call | array_statements | assignment | return_ | matrix_assignment | print)';') | function | selective | iterative ;
function_call: ID'('(parameters(','parameters)*)?')'
            | rettype? ID '=' ID'('(parameters(','parameters)*)?')'
            ;
assignment: valtype? ID '=' expr
            | 'string' ID '=' String;
function: 'fun' rettype ('auto')? ID'('(rettype ID (','rettype ID)*)?')'block;
selective: 'if''('bexpr')'block
    ('elif''('bexpr')'block)*
    ('else'block)? 
    ;
iterative: 'for''('assignment';'bexpr';'exprs')'block;
parameters: bexpr | martix_math | martix_pre_stuff | String;
exprs: expr(','exprs)?;
expr : '(' expr ')'
    | 'sqrt' expr
    | expr ('%' | '**') expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | expr'++'
    | expr'--'
    | ID'['expr']'
    | ID'['expr','expr']'
    | val
    ;
bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'expr
      | '!''('bexpr')'
      | expr
      ;
main: 'main'block;
print: 'print' parameters(',' parameters)* NEWLINE?;
val: ID
    | ('+' | '-'?) num;
valtype: 'int'
        | 'float'
        | 'double';

return_: 'return' ID;


matrix_assignment: valtype'['Inum','Inum']' ID
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
rettype: valtype('['','*']')? | 'string';

array_constructs: '['Inum(','Inum)*']'
                | '['Fnum(','Fnum)*']'
                | '['Dnum(','Dnum)*']'
                | '['String(','String)*']';
array_statements: rettype'['Inum']' ID ('=' array_constructs)?
                | ID'['expr']'
                ;

num: Inum|Fnum|Dnum ;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
String: '"' .*? '"';
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE          : [' '\t\r\n]+ -> skip ;
NEWLINE             : ('\r'?'\n')+ ;