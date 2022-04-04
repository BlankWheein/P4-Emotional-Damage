grammar MLTest;

prog: stmts EOF;
stmts: (stmt stmts)?;
block: '{'stmts'}';

stmt: ((numassign | boolassign | matrixassign | arrassign | print | funccall | gradfunccall | unaryoperator)';') | (func | gradfunc | selective | iterative);

boolassign: ;
matrixassign:;
arrassign:;
print:;
funccall:;
gradfunccall:;
func:;
gradfunc:;
selective:;
whilestmt:;

numassign: intdcl | doubledcl | floatdcl
        | id '=' numexpr
        ;

intdcl: 'int' id '=' numexpr;
doubledcl: 'double' id '=' numexpr;
floatdcl: 'float' id '=' numexpr;


numexpr: '('numexpr')'
    | sqrt numexpr
    | numexpr (mod | power) numexpr
    | numexpr ('*' | '/') numexpr
    | numexpr ('+' | '-') numexpr
    | val
    ;
bexpr :
        bexpr ('>' | '<')'='? bexpr
      | bexpr ('!' | '=')'=' bexpr
      | '!'?'('bexpr')'
      | numexpr

      ;
sqrt: 'sqrt';
power: '**';
mod: '%';

unaryoperator: (id'++' | id'--');

iterative: forstmt | whilestmt;


forstmt: 'for''('intdcl';'bexpr';'unaryoperator')'block;




val: id | '-'?num;
id: ID;
num: Inum | Fnum | Dnum;
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE : [\t\r\n]+ -> skip ;