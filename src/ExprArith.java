// ExprArith.java

abstract class ExprArith {

    abstract int eval ();

}//ExprArith

class Cte extends ExprArith {

    int val;

    Cte (int val) {
        this.val = val;
    }//Cte

    int eval () {
        return val;
    }//eval

}//Cte

class Inv extends ExprArith {

    ExprArith e;

    Inv (ExprArith e) {
        this.e = e; 
    }//Inv

    int eval () {
        return -e.eval();
    }//eval

}//Inv

class Bool extends ExprArith {
    
    Boolean b = false; //Par défaut
    
    Bool(Boolean b){
        this.b = b;
    }
    
    int eval(){
        return (b ? 1 : 0); //Ternary operator if b is true return 1 else 0
    }
}

class ArrayOf extends ExprArith {
    
    ExprArith[] array = null; //Par défaut
    
    ArrayOf(ExprArith[] array){
        this.array = array;
    }
    
    int eval(){ //Ca veut dire quoi évaluer un tableau ?
        return array;
    }
}

/*****************************BINARY OPERATORS***********************************/
abstract class BinOp extends ExprArith {

    ExprArith e1, e2;

}//BinOp

class Add extends BinOp {

    Add (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Add

    int eval () {
        return e1.eval() + e2.eval();
    }//eval

}//Add

class Sub extends BinOp {

    Sub (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Sub

    int eval () {
        return e1.eval() - e2.eval();
    }//eval

}//Sub

class Mul extends BinOp {

    Mul (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Mul

    int eval () {
        return e1.eval() * e2.eval();
    }//eval

}//Mul

class Div extends BinOp {

    Div (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Div

    int eval () {
        return e1.eval() / e2.eval();
    }//eval

}//Div

/********************COMPARATORS******************************************/
class Comparator extends BinOp{
    
}
class GreaterThan extends Comparator {
    
    GreaterThan(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() > e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class GreaterThanOrEqual extends Comparator {
    
    GreaterThanOrEqual(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() >= e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class Equal extends Comparator {
    
    Equal(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() == e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class Different extends Comparator {
    
    Different(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() != e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class LessOrEqual extends Comparator {
    
    LessOrEqual(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() <= e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class LessThan extends Comparator {
    
    LessThan(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() < e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

/*********************CALL TARGETS****************************/
abstract class CallTarget extends ExprArith {
    
}

class Read extends CallTarget{
    
}

class Write extends CallTarget(){
    
}
/*******************EXPRESSION*******************************/
abstract class Instruction extends ExprArith{
    
}

class Affectation extends Instruction{
    
}

class IfThenElse extends Instruction{
    
    Comparator condition;
    ExprArith[] ifInstructions;
    ExprArith[] elseInstructions;
    
    IfThenElse(Comparator condition, ExprArith[] ifInstructions, ExprArith[] elseInstructions){
        this.condition = condition;
        this.ifInstructions = ifInstructions;
        this.elseInstructions = elseInstructions;
    }
}

class WhileDo extends Instruction{
    
    Comparator stopCondition;
    ExprArith[] instructions;
    
    WhileDo(Comparator stopCondition, ExprArith[] instructions){
        this.stopCondition = stopCondition;
        this.instructions = instructions;
    }
    
}