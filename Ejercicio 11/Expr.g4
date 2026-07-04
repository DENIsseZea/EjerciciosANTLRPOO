grammar Expr;

root: expr EOF ;    

expr: EOF ;

//Ejercicio 11 Palabras reservadas
PUBLIC : 'public' ;
CLASS : 'class' ;
STATIC : 'static' ;
VOID : 'void' ;
INT : 'int' ;

// Tipo / clase común de Java
STRING : 'String' ;

// Literales
NUM : [0-9]+ ;
CADENA : '"' ~["\r\n]* '"' ;

// Identificadores
ID : [a-zA-Z_][a-zA-Z0-9_]* ;

// Operadores
IGUAL : '=' ;
MAS : '+' ;

// Puntuación
PUNTO : '.' ;
PUNTO_COMA : ';' ;
PAR_IZQ : '(' ;
PAR_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
COR_IZQ : '[' ;
COR_DER : ']' ;

// Comentarios y espacios en blanco
WS : [ \t\r\n]+ -> skip ;