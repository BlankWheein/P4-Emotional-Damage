grammar MLting;

prog: stmts EOF;
stmts: (stmt stmts)?;
block: '{'stmts'}';
stmt: ((numassign | boolassign | arrassign | unaryoperator | print)';') | ( iterative | selective);
print: 'print''('STRING_CONSTANT | bexpr')';

intdcl: 'int' id '=' numexpr;
doubledcl: 'double' id '=' numexpr;
floatdcl: 'float' id '=' numexpr;

intarrdcl: 'int''['val']' id ('=' val)?;
doublearrdcl: 'double''['val']' id ('=' val)?;
floatarrdcl: 'float''['val']' id ('=' val)?;
arrupdate: id '=' val | id'['val']' '=' numexpr;
arrassign: intarrdcl | floatarrdcl | doublearrdcl | arrupdate;

numassign: intdcl | doubledcl | floatdcl
        | numupdate
        ;
numupdate: id '=' numexpr;

boolassign: booldcl
      | boolupdate
      ;
boolupdate: id '=' (bexpr | boolval);
booldcl: 'bool' id '=' (bexpr | boolval);
boolval: 'true' | 'false';

selective: ifstmt elifstmt* elsestmt?;
ifstmt: 'if''('bexpr')'block;
elifstmt: 'elif''('bexpr')'block;
elsestmt: 'else'block;

iterative: forstmt | whilestmt;
forstmt: 'for''('intdcl';'bexpr';'unaryoperator')'block;
whilestmt: 'while''('bexpr')'block;

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
      | bexpr ('AND' | 'OR') bexpr
      | '!''('bexpr')'
      | '!'?numexpr
      ;

sqrt: 'sqrt';
power: '**';
mod: '%';
unaryoperator: (id'++' | id'--');


val: id 
      | '-'?num
      | id'['val']'
      ;
id: ID;
num: Inum | Fnum | Dnum;


STRING_CONSTANT: '"' ( ESC | ~('"' | '\\') )* '"';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]*;
Dnum: [0-9]+('.')[0-9]*;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \n\t\r]+ -> channel(HIDDEN);