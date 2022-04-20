grammar EmotionalDamage;

prog: stmts EOF;
stmts: (dcl | stmt)*;
numtype: 'int' | 'float';
print: 'print' | 'println';
types: 'int'('['Inum']')?('['Inum']')? | 'float'('['Inum']')?('['Inum']')? | 'bool' | 'string';
returntype: types | 'void';
dcl :
      returntype IDENTIFIER '(' ((types IDENTIFIER) (',' types IDENTIFIER)* )? ')' '{'stmts'}' #FuncDcl
    | numtype'['Inum']''['Inum']' IDENTIFIER';' #MatrixDeclaration
    | ( numtype | 'string' )'['Inum']' IDENTIFIER';' #ArrayDeclaration
    | numtype IDENTIFIER '=' expr';' #NumDcl
    | 'string' IDENTIFIER '=' STRING_CONSTANT';' #StringDcl
    | 'bool' IDENTIFIER '=' bexpr';' #BoolDeclaration
    ;

stmt: 
      print '(' (STRING_CONSTANT | expr) ')'';' #printStmt
    | 'return' IDENTIFIER #ReturnStmt
    | IDENTIFIER '=' expr';' #NumAssignStmt
    | IDENTIFIER '=' bexpr';' #BoolAssignStmt
    | IDENTIFIER '['(IDENTIFIER | Inum)']''['(IDENTIFIER | Inum)']' '=' expr';' #MatrixElementAssignStmt
    | IDENTIFIER '['(IDENTIFIER | Inum)']' '=' expr';' #ArrayElementAssignStmt
    | IDENTIFIER'++'';' #UnaryPlus
    | IDENTIFIER'--'';' #UnaryMinus
    | 'T''('IDENTIFIER')'';' #TransposeMatrixStmt
    | 'while' '('bexpr')' '{' stmts '}' #WhileStmt
    | 'for' '(''int' IDENTIFIER '=' expr';' bexpr';' (IDENTIFIER'++' | IDENTIFIER'--') ')' '{' stmts '}' #ForStmt
    | IDENTIFIER'('(IDENTIFIER(',' IDENTIFIER)*)?')' #FuncCall
    | ifstmt elifstmt* elsestmt? #Selective
    ;

ifstmt: 'if' '('bexpr')' '{' stmts '}';
elifstmt: 'elif' '('bexpr')' '{' stmts '}';
elsestmt: 'else' '{' stmts '}';

expr: '('expr')' #ParenExpr
    | 'sqrt' expr #SqrtExpr
    | expr '**' expr #PowExpr
    | expr '%' expr #ModExpr
    | expr '*' expr #TimesExpr
    | expr '/' expr #DivideExpr
    | expr '+' expr #PlusExpr
    | expr '-' expr #MinusExpr
    | expr '\\\\' expr #GradientExpr
    | IDENTIFIER('['(IDENTIFIER | Inum)']')?('['(IDENTIFIER | Inum)']')? #NumArrMatrixValue
    | IDENTIFIER'.row' #Rowid
    | IDENTIFIER'.col' #Colid
    | IDENTIFIER'.len' #Lengthid
    | '-'expr #NegVal
    | Inum #IntVal
    | Fnum #FloatVal
    ;

bexpr :
        bexpr '>' bexpr #Greater
      | bexpr '<' bexpr #Smaller
      | bexpr '>=' bexpr #GreaterEquals
      | bexpr '<=' bexpr #SmallerEquals
      | bexpr '==' bexpr #Equals
      | bexpr '!=' bexpr #NotEquals
      | ('true' | 'false') #BoolValue
      | expr #BoolExpr
      ;

    
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]+;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
STRING_CONSTANT: '"' ( ESC | ~('"' | '\\') )* '"';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
WS: [ \n\t\r]+ -> channel(HIDDEN);