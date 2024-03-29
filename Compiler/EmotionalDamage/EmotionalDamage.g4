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
    | numtype '['Inum']' IDENTIFIER';' #ArrayDeclaration
    | numtype IDENTIFIER '=' expr';' #NumDcl
    | 'string' IDENTIFIER '=' STRING_CONSTANT';' #StringDcl
    | 'bool' IDENTIFIER '=' bexpr';' #BoolDeclaration
    | numtype IDENTIFIER '=' IDENTIFIER '\\\\' IDENTIFIER';' #GradientDcl
    ;

stmt: 
      print '(' ('$'?STRING_CONSTANT | expr) ')'';' #printStmt
    | 'return' IDENTIFIER ';' #ReturnStmt
    | IDENTIFIER '=' expr';' #NumAssignStmt
    | IDENTIFIER'.rand''('IDENTIFIER',' IDENTIFIER')'';' #RandIdentifierStmt
    | IDENTIFIER '=' bexpr';' #BoolAssignStmt
    | IDENTIFIER '=' 'T''('IDENTIFIER')'';' #TransposeMatrixStmt
    | IDENTIFIER '=' IDENTIFIER '§' IDENTIFIER';' #DotExprs
    | IDENTIFIER('['(IDENTIFIER | Inum)']')?('['(IDENTIFIER | Inum)']')?'.''relu'';' #ReluStmt
    | IDENTIFIER '['(IDENTIFIER | Inum)']''['(IDENTIFIER | Inum)']' '=' expr';' #MatrixElementAssignStmt
    | IDENTIFIER '['(IDENTIFIER | Inum)']' '=' (expr | STRING_CONSTANT)';' #ArrayElementAssignStmt
    | IDENTIFIER'++'';' #UnaryPlus
    | IDENTIFIER'--'';' #UnaryMinus
    | IDENTIFIER'('(IDENTIFIER(',' IDENTIFIER)*)?')'';' #FuncStmt
    | 'while' '('(bexpr | IDENTIFIER)')' '{' stmts '}' #WhileStmt
    | 'for' '(''int' IDENTIFIER '=' expr';' bexpr';' (IDENTIFIER'++' | IDENTIFIER'--') ')' '{' stmts '}' #ForStmt
    | ifstmt elifstmt* elsestmt? #Selective
    ;

ifstmt: 'if' '('bexpr')' '{' stmts '}';
elifstmt: 'elif' '('bexpr')' '{' stmts '}';
elsestmt: 'else' '{' stmts '}';

expr:
     '('expr')' #ParenExpr
    | IDENTIFIER'('(IDENTIFIER(',' IDENTIFIER)*)?')' #FuncCall
    | 'sqrt' '('expr')' #SqrtExpr
    | expr '**' expr #PowExpr
    | expr '%' expr #ModExpr
    | expr '*' expr #TimesExpr
    | expr '/' expr #DivideExpr
    | expr '+' expr #PlusExpr
    | expr '-' expr #MinusExpr
    | IDENTIFIER #NumValue
    | IDENTIFIER('['(IDENTIFIER | Inum)']') #NumArrValue
    | IDENTIFIER('['(IDENTIFIER | Inum)']')('['(IDENTIFIER | Inum)']') #NumMatrixValue
    | IDENTIFIER'.row' #Rowid
    | IDENTIFIER'.col' #Colid
    | IDENTIFIER'.len' #Lengthid
    | '-'expr #NegVal
    | Inum #IntVal
    | Fnum #FloatVal
    ;

bexpr :
        IDENTIFIER '>' (IDENTIFIER | Inum) #Greater
      | IDENTIFIER '<' (IDENTIFIER | Inum) #Smaller
      | IDENTIFIER '>=' (IDENTIFIER | Inum) #GreaterEquals
      | IDENTIFIER '<=' (IDENTIFIER | Inum) #SmallerEquals
      | IDENTIFIER '==' (IDENTIFIER | Inum | 'true' | 'false') #Equals
      | IDENTIFIER '!=' (IDENTIFIER | Inum | 'true' | 'false') #NotEquals
      | ('true' | 'false') #BoolValue
      ;

    
Inum: [0-9]+ ;
Fnum: [0-9]+('.')[0-9]+;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
STRING_CONSTANT: '"' ( ESC | ~('"' | '\\') )* '"';
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
WS: [ \n\t\r]+ -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> skip;