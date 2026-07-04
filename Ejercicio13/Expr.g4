grammar Expr;

root: expr EOF;

expr: EOF;

CREATE: 'CREATE';
TABLE: 'TABLE';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';

SERIAL: 'SERIAL';
VARCHAR: 'VARCHAR';
INTEGER: 'INTEGER';
DATE: 'DATE';

NOT: 'NOT';
NULL: 'NULL';
PRIMARY: 'PRIMARY';
KEY: 'KEY';

INNER: 'INNER';
JOIN: 'JOIN';
ON: 'ON';

IGUAL: '=';

PAR_A: '(';
PAR_C: ')';
SEMIC: ';';
COMA: ',';
PUNTO: '.';

STRING: '\'' .*? '\'';
NUM: [0-9]+;

ID: [a-zA-Z][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;