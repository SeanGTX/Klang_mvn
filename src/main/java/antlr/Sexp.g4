grammar Sexp;
var : 'let' '(' Type Name Value ')';

Name : [A-Za-z]+ ~[int string];
Value : [0-9];

Type : Integer || String || Array;

String : 'string' '"' [A-Za-z0-9]+ '"';
Integer : ('int' | 'integer') [0-9];

Array : 'array' 'of' Type;
WS : [ \t\r\n]+ -> skip ;
// let(int a)