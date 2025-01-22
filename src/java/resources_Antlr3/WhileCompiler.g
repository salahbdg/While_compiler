grammar WhileCompiler;

options {
	output = AST;
}

//noeuds pour l AST
tokens {
    N_Program;
    N_Function;
    N_Definition;
    N_Commands;
    N_Command;
    N_Output;
    N_Input;
    N_Else;
    N_Vars;
    N_Exprs;
    N_Affectation;
    N_If;
    N_While;
    N_For;
    N_Foreach;
    N_Expression;
    N_Expr_base;
    N_Variable;
    N_Symbol;
    N_Cons;
    N_List;
    N_Hd;
    N_Tl;
    N_Call;
    N_Nope;
    N_Nil;
}

// parties reutilisables dans les regles lexicales
fragment Maj :('A'..'Z');
fragment Min :('a'..'z');
fragment Dec :('0'..'9');


//lexemes
Symbol : Min(Maj|Min|Dec)*('!'|'?')?;
Variable : Maj(Maj|Min|Dec)*('!'| '?')?;
WS:(' '|'\t'|'\r'|'\n')+;


//regles syntaxiques
program: WS* (function WS*)+ -> ^(N_Program function+);
function:'function' WS Symbol WS? ':' WS definition-> ^(N_Function Symbol definition);
definition:'read' WS (input WS)? '%' WS commands WS '%' WS 'write' output -> ^(N_Definition input? ^(N_Commands commands) ^(N_Output output));

//entree
inputSub: (WS? Variable WS? ',' inputSub) -> Variable inputSub | WS? Variable -> Variable;
input: inputSub? -> ^(N_Input inputSub?);
//sortie
output: (WS? Variable WS? ',' output) -> Variable output | WS? Variable -> Variable; 

commands:WS? command (WS? ';' WS? command)* (';')? -> command+;

command:'nop' -> N_Nope
	| (vars WS? ':=' WS? exprs) -> ^(N_Affectation ^(N_Vars vars) ^(N_Exprs exprs))
	| ('if' WS expression WS 'then' WS commands WS(WS? 'else'WS commands WS)? 'fi') -> ^(N_If expression ^(N_Commands commands) ^(N_Else commands)?)
	| ('while' WS expression WS 'do' WS commands WS 'od') -> ^(N_While expression ^(N_Commands commands))
	| ('for' WS expression WS 'do' WS commands WS 'od') -> ^(N_For expression ^(N_Commands commands))
	| ('foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od') -> ^(N_Foreach Variable expression ^(N_Commands commands));

vars :(Variable WS? ',' WS? vars) -> Variable vars | Variable -> Variable;

exprs:expression (WS? ',' WS? expression)* -> expression+;
//expression :e1=exprbase(' = 'e2=exprbase -> ^(N_Expression ^(EQUALS $e1 $e2))| -> ^(N_Expression $e1));
expression : exprBase ('=?' exprBase)? -> ^(N_Expression exprBase exprBase?);
exprBase:'nil' -> N_Nil
 	| Variable -> ^(N_Variable Variable)
 	| Symbol -> ^(N_Symbol Symbol)
 	|'(' WS? Symbol WS lexpr')' -> ^(N_Call Symbol lexpr)
 	|'(' WS? Symbol')' -> ^(N_Call Symbol)
 	|'(' WS? 'hd 'exprBase WS? ')' -> ^(N_Hd exprBase)
 	|'(' WS? 'tl 'exprBase WS?')' -> ^(N_Tl exprBase)
 	|'(' WS? 'cons' WS? ')' -> ^(N_Cons)
 	|'(' WS? 'cons ' WS? lexpr')' -> ^(N_Cons lexpr)
 	|'(' WS? 'list' WS? ')' -> ^(N_List)
 	|'(' WS? 'list 'WS? lexpr')' -> ^(N_List lexpr);
 	
 lexpr : (exprBase WS?)* -> exprBase*;
