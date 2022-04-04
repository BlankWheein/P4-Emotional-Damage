grammar MLting;

prog: stmts EOF;
stmts: stmt stmts?;
block: '{'stmts'}';
stmt: ((matrixassign | numassign | boolassign | arrassign | unaryoperator | print | println | funccall | gradfunccall | returnstmt)';') | ( iterative | selective | func | gradfunc);
print: 'print' '(' (STRING_CONSTANT | bexpr) ')';
println: 'println' '(' (STRING_CONSTANT | bexpr) ')';
returnstmt: 'return' val;

func: 'func' rettype id'('parameters?')' block;
gradfunc: 'autograd' func;
rettype: numtypes | 'string' | 'void' | numtypes'['num']' | numtypes'['num','num']';
parameters: parameter (','parameters)?;
parameter: (numtypes | 'string'| matrixparameter | arrparameter) id;
matrixparameter: numtypes'['(val)','(val)']';
arrparameter: numtypes'['(val)']';

intdcl: 'int' id '=' numexpr;
doubledcl: 'double' id '=' numexpr;
floatdcl: 'float' id '=' numexpr;

intarrdcl: 'int''['val']' id ('=' val)?;
doublearrdcl: 'double''['val']' id ('=' val)?;
floatarrdcl: 'float''['val']' id ('=' val)?;
arrupdate: (id '=' (numexpr | arrexpr)) | id'['val']' '=' numexpr;
arrassign: intarrdcl | floatarrdcl | doublearrdcl | arrupdate;

matrixassign: intmatrixdcl | floatmatrixdcl | doublematrixdcl | matrixupdate;
intmatrixdcl: 'int''['val','val']' id ('=' matrixarrexpr)?;
doublematrixdcl: 'double''['val','val']' id ('=' matrixarrexpr)?;
floatmatrixdcl: 'float''['val','val']' id ('=' matrixarrexpr)?;
matrixupdate: (id '=' (numexpr | matrixarrexpr))
            | id'['val','val']' '=' numexpr
            | id'['val',' '*' ']' '=' numexpr
            | id'[' '*' ','val']' '=' numexpr
            ;
matrixarrexpr: id '.' id
      | id '*' val
      | id ('+' | '-') val
      | matrixtranspose'('id')'
      | matrixinverse'('id')'
      | 'toMatrix''('id')'
      | val
      ;
arrexpr: 'toArray''('id')';
matrixtranspose: 'T';
matrixinverse: '~';

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

random: 'rand''('val','val')';
numexpr: '('numexpr')'
    | sqrt numexpr
    | numexpr (mod | power) numexpr
    | numexpr ('*' | '/') numexpr
    | numexpr ('+' | '-') numexpr
    | random
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
      | id'['val','val']'
      | id'.row'
      | id'.col'
      | id'.len'
      | funccall
      | gradfunccall
      ;
funccall: id'('(id (','id)*)?')';
gradfunccall: id'('(id (','id)*)?')''.backwards';
id: ID;
num: Inum | Fnum | Dnum;
numtypes: 'int' | 'float' | 'double';

STRING_CONSTANT: '"' ( ESC | ~('"' | '\\') )* '"';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]+;
Dnum: [0-9]+('.')[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \n\t\r]+ -> channel(HIDDEN);