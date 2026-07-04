grammar Expr;

root : expr EOF ;

expr : EOF ;

// Comandos
NMAP : 'nmap' ;
SS : 'ss' ;
SUDO : 'sudo' ;
TCPDUMP : 'tcpdump' ;
CURL : 'curl' ;
DIG : 'dig' ;
JOURNALCTL : 'journalctl' ;
GREP : 'grep' ;
UFW : 'ufw' ;

// Palabras clave
DENY : 'deny' ;
FROM : 'from' ;
TODAY : 'today' ;
MX : 'MX' ;

// Flags largos
SINCE : '--since' ;

// Flags cortos
FLAG_SV : '-sV' ;
FLAG_SN : '-sn' ;
FLAG_TULN : '-tuln' ;
FLAG_I_MIN : '-i' ;
FLAG_C : '-c' ;
FLAG_I_MAY : '-I' ;

// Literales
NUM : [0-9]+ ;
CADENA : '"' ~["\r\n]* '"' ;

// IP y CIDR
CIDR : [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ '/' [0-9]+ ;
IP : [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ ;

// Rutas
RUTA : '/' [a-zA-Z0-9._\-/]+ ;

// Identificadores
ID : [a-zA-Z_][a-zA-Z0-9._\-]* ;

// Operadores y puntuacion
DIAGONAL : '/' ;

// Espacios
WS : [ \t\r\n]+ -> skip ;