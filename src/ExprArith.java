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
    
    Boolean b;
    
    Inv(Boolean b){
        this.b = b;
    }
    
    int eval(){
        return (b ? 1 : 0); //Ternary operator if b is true return 1 else 0
    }
}

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

class GreaterThan extends BinOp {
    
    GreaterThan(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() > e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class GreaterThanOrEqual extends BinOp {
    
    GreaterThanOrEqual(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() >= e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class Equal extends BinOp {
    
    Equal(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() == e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class Different extends BinOp {
    
    Different(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() != e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class LessOrEqual extends BinOp {
    
    LessOrEqual(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() <= e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}

class LessThan extends BinOp {
    
    LessThan(ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    int eval () {
        return (e1.eval() < e2.eval() ? 1 : 0); //returns 1 if true false otherwise
    }
}
