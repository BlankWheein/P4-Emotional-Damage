grammar MLgramma;

prog : prototypes stmts EOF;

prototypes: (function_prototype prototypes)?; 
function_prototype: 'prototype' rettype ('autograd')? ID'('(rettype(','rettype)*)?')'';';

stmts : (stmt stmts)?;
stmt : (( function_call | return_ | assignment | print | one_word_statements)';') | function | selective | iterative | main ;

main: 'main'block;
block: '{'stmts'}';

parameters: bexpr | matrix_setters | String | getters;
function: 'fun' rettype ('autograd')? ID'('(rettype ID (','rettype ID)*)?')'block;
function_call: ID'('(parameters(','parameters)*)?')'
            | rettype? ID '=' ID'('(parameters(','parameters)*)?')'
            ;
return_: 'return' expr;

one_word_statements: 'continue' | 'break';

print: 'print' '('?parameters(',' parameters)*')'?;

assignment: valtype? ID '=' bexpr(','ID '=' bexpr)*
            | 'string' ID '=' String(','ID '=' String)*
            | valtype'['Inum','Inum']' ID
            | ID'['Inum',' Inum']' '=' bexpr
            | rettype'['Inum']' ID ('=' array_constructs)?
            ;

getters:  ID'['expr']'
    | ID'['expr','expr']'
    ;

iterative: 'for''('assignment';'bexpr';'exprs')'block
    | 'while''('bexpr')'block
    ;
selective: 'if''('bexpr')'block
    ('elif''('bexpr')'block)*
    ('else'block)? 
    ;

exprs: expr(','exprs)?;
expr : '(' expr ')'
    | ID matrix_setters 
    | 'sqrt' expr
    | expr ('%' | '**') expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | expr'++'
    | expr'--'
    | ID '.' ID
    | ID'.T'
    | getters
    | val
    ;

bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'expr
      | '!''('bexpr')'
      | expr
      | String
      ;

matrix_setters:
             '.random'
            |'.one'
            |'.zero'
            ;

rettype: valtype('['','*']')? | 'string';
array_constructs: '['Inum(','Inum)*']'
                | '['Fnum(','Fnum)*']'
                | '['Dnum(','Dnum)*']'
                | '['String(','String)*']';
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
WHITESPACE : [' '\t\r\n]+ -> skip ;
COMMENT: '#//#' ~[\r\n]* -> skip;