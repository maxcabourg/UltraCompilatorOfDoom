// ExprArithAST.g4

grammar ExprArithAST;

//Productions
expr : additionExpr;

// Addition and subtraction have the lowest precedence.
additionExpr : multiplyExpr('+' multiplyExpr | '-' multiplyExpr)* ;

// Multiplication and division have a higher precedence.
multiplyExpr : atomExpr('*' atomExpr | '/' atomExpr)* ;

logicalExpr : comparingExpr('and' comparingExpr | 'or' comparingExpr)*;

//On veut comparer au moins 2 expression atomiques donc pas de * a la fin
comparingExpr : atomExpr ('<' atomExpr | '<=' atomExpr |'=' atomExpr | '!=' atomExpr | '>' atomExpr | '>=' atomExpr)

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExpr'. As you can see, an 'atomExpr' has the highest
   precedence. */
   //Peut être aussi un booléen
atomExpr : number | boolean | '(' additionExpr ')' | '-' atomExpr | 'not' comparingExpr ;


T : (number | boolean | array);
const : (number | boolean);
variable : [a-z]+;
boolean : ('true' | 'false');
// A number is an integer value
number : ('0'..'9')+ ;

// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;
