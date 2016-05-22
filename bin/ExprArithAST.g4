// ExprArithAST.g4

grammar ExprArithAST;



//Productions
expr : additionExpr;

// Addition and subtraction have the lowest precedence.
additionExpr returns [ExprArith value] :
  e1 = multiplyExpr {$value = $e1.value;}
  (PLUS e2 = multiplyExpr {$value = new Add($value, $e2.value);}
  |MINUS e2 = multiplyExpr {$value = new Sub($value, $e2.value);})* ;

// Multiplication and division have a higher precedence.
multiplyExpr returns [ExprArith value] :
  e1 = atomExpr {$value = $e1.value;}
  (MUL e2 = atomExpr {$value = new Mul($value, $e2.value);}
  |DIV e2 = atomExpr {$value = new Div($value, $e2.value);})* ;

logicExpr returns [Bool value] :
  e1 = atomExpr {$value = e1.value;}
  (AND e2 = atomExpr {$value = new And($value, $e2.value);}
  |OR e2 = atomExpr {$value = new Or($value, $e2.value);})*;

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
atomExpr returns [ExprArith value] :
  c = number {$value = new Cte(Integer.parseInt($c.text));}
  | PLEFT e1 = additionExpr PRIGHT {$value = $e1.value;}
  | MINUS e2 = atomExpr {$value = new Inv($e2.value);} ;


fragment DIGIT : ('0'..'9');
number : DIGIT+;
fragment LETTER : ('a'..'z');
r_boolean : (TRUE | FALSE);
array : CROCHETOUVRANT (r_boolean | number) CROCHETFERMANT;
variable : LETTER+;

//Declaration des différentes instructions
varDeclaration : VAR (variable) DEUXPOINTS TYPE;
varAffectation : variable AFFECT (number | r_boolean);
ifStatement : IF comparingExpr THEN (instruction)+ ELSE (instruction)+;
whileStatement : WHILE comparingExpr DO (expr)+ ; //Considérons que l'on doive faire au moins un truc après le while(d'ou le +)
functionDeclaration: 'f' PLEFT variable DEUXPOINTS TYPE PRIGHT DEUXPOINTS TYPE;
instruction : (varDeclaration |varAffectation | ifStatement | whileStatement);
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
PLEFT : '(';
PRIGHT : ')';
READ : 'read';
WRITE : 'write';
// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;
