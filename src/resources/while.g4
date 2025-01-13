grammar while;

// Fragments: Definition of valid characters for variables and symbols
fragment Maj : 'A'..'Z';
fragment Min : 'a'..'z';
fragment Dec : '0'..'9';

// Tokens: Lexical definitions for variables and symbols
Variable : Maj (Maj | Min | Dec)* ('!' | '?')? ;
Symbol   : Min (Maj | Min | Dec)* ('!' | '?')? ;

// Ignore whitespace
WS : [ \t\r\n]+ -> skip ;

// Main rule: A program is a sequence of functions
program : function+ EOF ;

// Function definition
function : 'function' Symbol ':' definition ;

// Structure of a function
definition : 'read' input '%' commands '%' 'write' output ;

// Definition of inputs
input : (Variable (',' Variable)*)? ;

// Definition of outputs
output : Variable (',' Variable)* ;

// Definition of variables
vars : Variable (',' Variable)* ;

// List of expressions
exprs : expression (',' expression)* ;

// List of commands
commands : command (';' command)* ;

// Single command
command
   : 'foreach' Variable 'in' expression 'do' commands 'od'
   | 'for' expression 'do' commands 'od'
   | 'while' expression 'do' commands 'od'
   | 'if' expression 'then' commands ('else' commands)? 'fi'
   | 'nop'
   | vars ':=' exprs
   ;

// Basic expressions
exprBase
   : '(' Symbol lExpr? ')'
   | '(' 'hd' exprBase ')'
   | '(' 'tl' exprBase ')'
   | '(' 'cons' lExpr? ')'
   | '(' 'list' lExpr? ')'
   | 'nil'
   | Variable
   | Symbol
   ;

// Expression with optional comparison
expression : exprBase ('=?' exprBase)? ;

// List of expressions
lExpr : exprBase+ ;
