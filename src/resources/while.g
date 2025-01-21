grammar while;

// Enable AST generation
options {
    output=AST;
}

// Fragments for reusable character sets
fragment Maj : 'A'..'Z';
fragment Min : 'a'..'z';
fragment Dec : '0'..'9';

// Tokens for variables and symbols
Variable : Maj (Maj | Min | Dec)* ('!' | '?')? ;
Symbol   : Min (Maj | Min | Dec)* ('!' | '?')? ;

// Ignore whitespace
WS : [ \t\r\n]+ -> skip ;

// Main rule: A program consists of one or more functions
program : function+ EOF ;

// Define a function structure
function : 'function' Symbol ':' definition -> ^('function' Symbol definition) ;

// Function body structure
definition : 'read' input '%' commands '%' 'write' output -> ^('definition' input commands output) ;

// Input variables
input : (Variable (',' Variable)*)? -> ^('input' Variable*) ;

// Output variables
output : Variable (',' Variable)* -> ^('output' Variable*) ;

// Variable declarations
vars : Variable (',' Variable)* -> ^('vars' Variable*) ;

// List of expressions
exprs : expression (',' expression)* -> ^('exprs' expression+) ;

// List of commands
commands : command (';' command)* -> ^('commands' command+) ;

// Single command
command
   : 'foreach' Variable 'in' expression 'do' commands 'od' -> ^('foreach' Variable expression commands)
   | 'for' expression 'do' commands 'od' -> ^('for' expression commands)
   | 'while' expression 'do' commands 'od' -> ^('while' expression commands)
   | 'if' expression 'then' commands ('else' commands)? 'fi' -> ^('if' expression commands ('else' commands)?)
   | 'nop' -> 'nop'
   | vars ':=' exprs -> ^('assign' vars exprs)
   ;

// Base expressions
exprBase
   : '(' Symbol lExpr? ')' -> ^(Symbol lExpr?)
   | '(' 'hd' exprBase ')' -> ^('hd' exprBase)
   | '(' 'tl' exprBase ')' -> ^('tl' exprBase)
   | '(' 'cons' lExpr? ')' -> ^('cons' lExpr?)
   | '(' 'list' lExpr? ')' -> ^('list' lExpr?)
   | 'nil' -> 'nil'
   | Variable -> Variable
   | Symbol -> Symbol
   ;

// Expression with optional comparison
expression : exprBase ('=?' exprBase)? -> ^('expression' exprBase ('=?' exprBase)?) ;

// List of base expressions
lExpr : exprBase+ -> ^('lExpr' exprBase+) ;
