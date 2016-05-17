// ExprArithAST.g4

grammar ExprArithAST;



//Productions
expr : additionExpr;

// Addition and subtraction have the lowest precedence.
additionExpr : multiplyExpr(PLUS multiplyExpr |MINUS multiplyExpr)* ;

// Multiplication and division have a higher precedence.
multiplyExpr : atomExpr(MUL atomExpr | DIV atomExpr)* ;

logicalExpr : comparingExpr(AND comparingExpr |OR comparingExpr)*;

//On veut comparer au moins 2 expression atomiques donc pas de * a la fin
comparingExpr returns [Bool value] :
  e1 = atomExpr {$value = e1.value;}
  (LT e2 = atomExpr {$value = new LesserThan($value, $e2.value);}
  |GT e2 = atomExpr {$value = new GreaterThan($value, $e2.value);}
  |LQ e2 = atomExpr {$value = new LesserThanOrEqual($value, $e2.value);}
  |GQ e2 = atomExpr {$value = new GreaterThanOrEqual($value, $e2.value);}
  |EQ e2 = atomExpr {$value = new Equal($value, $e2.value);}
  |NQ e2 = atomExpr {$value = new Different($value, $e2.value);})*;

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExpr'. As you can see, an 'atomExpr' has the highest
   precedence. */
   //Peut être aussi un booléen
atomExpr : number | r_boolean | P1 additionExpr P2 | MINUS atomExpr | NOT comparingExpr ;


fragment DIGIT : ('0'..'9');
number : DIGIT+;
fragment LETTER : ('a'..'z');
r_boolean : (TRUE | FALSE);
array : CROCHETOUVRANT (r_boolean | number) CROCHETFERMANT;
variable : LETTER+;

//Declaration des différentes instructions
varDeclaration : VAR (variable) DEUXPOINTS TYPE;
varAffectation : variable AFFECT (number | r_boolean);
ifStatement : IF comparingExpr THEN (expr)+ ELSE (expr)+; //j'aimerais que le else n'apparaisse qu'une fois mais je ne sais pas comment faire
whileStatement : WHILE comparingExpr DO (expr)+ ; //Considérons que l'on doive faire au moins un truc après le while(d'ou le +)

//Symbols
LT : '<';
LQ : '<=';
EQ : '=';
NQ : '!=';
GQ : '>=';
GT : '>';
NOT : 'not' |'!';
TRUE : 'true';
FALSE : 'false';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
OR :'or';
AND : 'and';
P1 : '(';
P2 : ')';
WHILE : 'while';
DO :'do';
IF : 'if';
THEN : 'then';
ELSE : 'else';
VAR : 'var';
TYPE : ('number' | 'boolean' |'new' 'array' 'of');
AFFECT : ':=';
DEUXPOINTS : ':';
CROCHETOUVRANT : '[';
CROCHETFERMANT : ']';
// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;
