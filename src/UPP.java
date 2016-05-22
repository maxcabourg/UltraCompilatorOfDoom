// UPP.java

import java.util.*;

/**************************************/
/* Arithmetic and boolean expressions */
/**************************************/

abstract class UPPExpr {
    
}//UPPExpr

class UPPCte extends UPPExpr {

    int val;

    UPPCte (int val) {
        this.val = val;
    }//UPPCte
    
    public String toString(){
        return "UPPCte : val = "+val;
    }

}//UPPCte

class UPPTrue extends UPPExpr {}//UPPTrue

class UPPFalse extends UPPExpr {}//UPPFalse

class UPPVar extends UPPExpr {

    String name;

    UPPVar (String name) {
        this.name = name;
    }//UPPVar
    
    public String toString(){
        return "UPPVar : name = "+name;
    }

}//UPPVar

class UPPGVar extends UPPExpr {

    String name;

    UPPGVar (String name) {
        this.name = name;
    }//UPPGVar
    
    public String toString(){
        return "UPPGVar : name = "+name;
    }

}//UPPGVar

abstract class UPPUnOp extends UPPExpr {

    UPPExpr e;

}//UPPUnOp


class UPPNot extends UPPUnOp {

    UPPNot (UPPExpr e) {
        this.e = e;
    }//UPPNot
    
    public String toString(){
        return "UPPNot declared";
    }

}//UPPNot

abstract class UPPBinOp extends UPPExpr {

    UPPExpr e1, e2;

}//UPPBinOp

class UPPAdd extends UPPBinOp {

    UPPAdd (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPAdd
    
    public String toString(){
        return "UPPAdd declared";
    }

}//UPPAd

class UPPSub extends UPPBinOp {

    UPPSub (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPSub
    
    public String toString(){
        return "UPPSub declared";
    }

}//UPPSub

class UPPMul extends UPPBinOp {

    UPPMul (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPMul
    
    public String toString(){
        return "UPPMul declared";
    }

}//UPPMul

class UPPDiv extends UPPBinOp {

    UPPDiv (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPDiv
    
    public String toString(){
        return "UPPDiv declared";
    }

}//UPPDiv

class UPPAnd extends UPPBinOp {

    UPPAnd (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPAnd
    
    public String toString(){
        return "UPPAnd declared";
    }

}//UPPAnd

class UPPOr extends UPPBinOp {

    UPPOr (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPOr
    
    public String toString(){
        return "UPPOr declared";
    }

}//UPPOr

class UPPLe extends UPPBinOp {

    UPPLe (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPLe
    
    public String toString(){
        return "UPPLe declared";
    }

}//UPPLe

class UPPLeq extends UPPBinOp {

    UPPLeq (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPLeq
    
    public String toString(){
        return "UPPLeq declared";
    }

}//UPPLeq

class UPPEq extends UPPBinOp {

    UPPEq (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPEq
    
    public String toString(){
        return "UPPEq declared";
    }

}//UPPEq

class UPPNeq extends UPPBinOp {

    UPPNeq (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPNeq
    
    public String toString(){
        return "UPPNeq declared";
    }

}//UPPNeq

class UPPGeq extends UPPBinOp {

    UPPGeq (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPGeq
    
    public String toString(){
        return "UPPGeq declared";
    }

}//UPPGeq

class UPPGe extends UPPBinOp {

    UPPGe (UPPExpr e1, UPPExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//UPPGe
    
    public String toString(){
        return "UPPGe declared";
    }

}//UPPGe

abstract class Callee {
    
    public String toString(){
        return "Callee declared";
    }
}

//Callee

class Read extends Callee {
    
    public String toString(){
        return "Call Read function";
    }
}//Read

class Write extends Callee {
    
    public String toString(){
        return "Call Write function";
    }
}//Write

class User extends Callee {

    String name;

    User (String name) {
        this.name = name;
    }//User
    
    public String toString(){
        return "User : name ->"+name;
    }

}//User

class Alloc extends Callee {
    
    public String toString(){
        return "Alloc function called";
    }
}//Alloc

class UPPFunCall extends UPPExpr {

    Callee callee;
    ArrayList<UPPExpr> args;

    UPPFunCall (Callee callee, ArrayList<UPPExpr> args) {
        this.callee = callee;
        this.args = args;
             
    }//FunCall
    
    public String toString(){
            return "UPPFunCall with callee : "+callee+" and arguments : "+args;
        }

}//FunCall

class UPPLoad extends UPPExpr {

    UPPExpr addr;

    UPPLoad (UPPExpr addr) {
        this.addr = addr;
    }//UPPLoad
    
    public String toString(){
        return "UPPLoad called";
    }

}//UPPLoad

/****************/
/* Instructions */
/****************/

abstract class UPPInst {}//UPPInst

class UPPAssign extends UPPInst {

    String name;
    UPPExpr val;

    UPPAssign (String name, UPPExpr val) {
        this.name = name;
        this.val = val;
    }//UPPAssign
    
    public String toString(){
        return "UPPAssign with name : "+name+" and val : "+val;
    }

}//UPPAssign

class UPPStore extends UPPInst {

    UPPExpr addr, val;

    UPPStore (UPPExpr addr, UPPExpr val) {
        this.addr = addr;
        this.val = val;
    }//UPPStore
    
    public String toString(){
        return "UPPStore with addr : "+addr+" and val : "+val;
    }

}//UPPStore

class UPPCond extends UPPInst {

    UPPExpr cond;
    UPPInst i1, i2;

    UPPCond (UPPExpr cond, UPPInst i1, UPPInst i2) {
        this.cond = cond;
        this.i1 = i1;
        this.i2 = i2;
    }//UPPCond
    
    public String toString(){
        return "UPPCond with condition : "+cond+" then instruction : "+i1+" else instruction : "+i2;
    }

}//UPPCond

class UPPWhile extends UPPInst {

    UPPExpr cond;
    UPPInst i;

    UPPWhile (UPPExpr cond, UPPInst i) {
        this.cond = cond;
        this.i = i;
    }//UPPWhile
    
    public String toString(){
        return "UPPWhile with condition : "+cond+" and while instruction : "+i;
    }

}//UPPWhile

class UPPProcCall extends UPPInst {

    Callee callee;
    ArrayList<UPPExpr> args;

    UPPProcCall (Callee callee, ArrayList<UPPExpr> args) {
        this.callee = callee;
        this.args = args;
    }//UPPProcCall
    
    public String toString(){
        return "UPPProcCall with callee : "+callee+" and arguments : "+args;
    }

}//UPPProcCall
    
class UPPSkip extends UPPInst {
    
    public String toString(){
        return "UPPSkip";
    }
}//UPPSkip

class UPPSeq extends UPPInst {

    UPPInst i1, i2;

    UPPSeq (UPPInst i1, UPPInst i2) {
        this.i1 = i1;
        this.i2 = i2;
    }//UPPSeq
    
    public String toString(){
        return "UPPSeq i1 : "+i1+", i2 : "+i2;
    }

}//UPPSeq

/***************************************/
/* Definitions of functions/procedures */
/***************************************/

class Pair<L,R> {

    final L left;
    final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }//Pair

    static <L,R> Pair<L,R> of(L left, R right){
        return new Pair<L,R>(left, right);
    }//of

}//Pair

abstract class UPPDef {

    String name;
    ArrayList<String> args, locals;
    UPPInst code;

}//UPPDef

class UPPFun extends UPPDef {

    UPPFun (String name, ArrayList<String> args, ArrayList<String> locals,
            UPPInst code) {
        this.name = name;
        this.args = args;
        this.locals = locals;
        this.code = code;
    }//UPPFun
    
    public String toString(){
        return "UPPFun, name : "+name+" args : "+args+" locals : "+locals+" code : "+code;
    }

}//UPPFun

class UPPProc extends UPPDef {

    UPPProc (String name, ArrayList<String> args, ArrayList<String> locals,
             UPPInst code) {
        this.name = name;
        this.args = args;
        this.locals = locals;
        this.code = code;
    }//UPPProc
    
    public String toString(){
        return "UPPProc, name : "+name+" args : "+args+" locals : "+locals+" code : "+code;
    }

}//UPPProc

/************/
/* Programs */
/************/

class UPPProg {

    ArrayList<String> globals;
    ArrayList<UPPDef> defs;
    UPPInst code;

    UPPProg (ArrayList<String> globals, ArrayList<UPPDef> defs, UPPInst code) {
        this.globals = globals;
        this.defs = defs;
        this.code = code;
    }//UPPProg
    
    public String toString(){
        return "UPPProg with globals : "+globals+", definitions : "+defs+" code : "+code;
    }

}//UPPProg
