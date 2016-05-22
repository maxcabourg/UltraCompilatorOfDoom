// PP.java

import java.util.*;

/*********/
/* Types */
/*********/

abstract class Type {}//Type

class Int extends Type {}//Int

class Bool extends Type {}//Bool

class Array extends Type {

	Type elements;

	Array (Type elements) {
		this.elements = elements;
	}//Array

}//Array

/**************************************/
/* Arithmetic and boolean expressions */
/**************************************/

abstract class PPExpr {

	abstract UPPExpr toUPP(ArrayList<String> locals);

}//PPExpr

class PPCte extends PPExpr {

	int val;

	PPCte (int val) {
		this.val = val;
	}//PPCte

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPCte(val);
	}
	
	public String toString(){
		return new String("PPConstante: "+val);
	}

}//PPCte

class PPTrue extends PPExpr {

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPTrue();
	}
	
	public String toString(){
		return new String("PPTrue");
	}
}//PPTrue

class PPFalse extends PPExpr {

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPFalse();
	}
	
	public String toString(){
		return new String("PPFalse");
	}
}//PPFalse

class PPVar extends PPExpr {

	String name;

	PPVar (String name) {
		this.name = name;
	}//PPVar

	UPPExpr toUPP(ArrayList<String> locals){
		if(locals.contains(name))
			return new UPPVar(name);
		else
			return new UPPGVar(name);	
	}
	
	public String toString(){
		return new String("PPVariable: "+name );
	}

}//PPVar

abstract class PPUnOp extends PPExpr {

	PPExpr e;

}//PPUnOp

class PPInv extends PPUnOp {

	PPInv (PPExpr e) {
		this.e = e;
	}//PPInv

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPSub(new UPPCte(0),e.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPInver: ("+e.toString()+" )");
	}

}//PPInv

class PPNot extends PPUnOp {

	PPNot (PPExpr e) {
		this.e = e;
	}//PPNot

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPNot(e.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPNot: ("+e.toString()+" )");
	}

}//PPNot

abstract class PPBinOp extends PPExpr {

	PPExpr e1, e2;

}//PPBinOp

class PPAdd extends PPBinOp {

	PPAdd (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPAdd

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPAdd(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPAdd: ("+e1.toString()+" + "+e2.toString()+" )");
	}

}//PPAd

class PPSub extends PPBinOp {

	PPSub (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPSub

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPSub(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPSub: ("+e1.toString()+" - "+e2.toString()+" )");
	}

}//PPSub

class PPMul extends PPBinOp {

	PPMul (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;

	}//PPMul

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPMul(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPMul: ("+e1.toString()+" * "+e2.toString()+" )");
	}

}//PPMul

class PPDiv extends PPBinOp {

	PPDiv (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPDiv

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPDiv(e1.toUPP(locals),e2.toUPP(locals));
	}

	public String toString(){
		return new String("PPDiv: ("+e1.toString()+" / "+e2.toString()+" )");
	}
}//PPDiv

class PPAnd extends PPBinOp {

	PPAnd (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPAnd

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPAnd(e1.toUPP(locals),e2.toUPP(locals));
	}
	public String toString(){
		return new String("PPAnd: ("+e1.toString()+" && "+e2.toString()+" )");
	}

}//PPAnd

class PPOr extends PPBinOp {

	PPOr (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPOr

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPOr(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPOr: ("+e1.toString()+" || "+e2.toString()+" )");
	}

}//PPOr

class PPLe extends PPBinOp {

	PPLe (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPLe

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPLe(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPLe: ("+e1.toString()+" < "+e2.toString()+" )");
	}

}//PPLe

class PPLeq extends PPBinOp {

	PPLeq (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPLeq

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPLeq(e1.toUPP(locals),e2.toUPP(locals));
	}

	public String toString(){
		return new String("PPLeq: ("+e1.toString()+" <= "+e2.toString()+" )");
	}
}//PPLeq

class PPEq extends PPBinOp {

	PPEq (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPEq

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPEq(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPEq: ("+e1.toString()+" := "+e2.toString()+" )");
	}

}//PPEq

class PPNeq extends PPBinOp {

	PPNeq (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPNeq

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPNeq(e1.toUPP(locals),e2.toUPP(locals));
	}

	public String toString(){
		return new String("PPNeq: ("+e1.toString()+" != "+e2.toString()+" )");
	}
}//PPNeq

class PPGeq extends PPBinOp {

	PPGeq (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPGeq

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPGeq(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPGeq: ("+e1.toString()+" >= "+e2.toString()+" )");
	}

}//PPGeq

class PPGe extends PPBinOp {

	PPGe (PPExpr e1, PPExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}//PPGe

	UPPExpr toUPP(ArrayList<String> locals){
		return new UPPGe(e1.toUPP(locals),e2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPGe: ("+e1.toString()+" > "+e2.toString()+" )");
	}

}//PPGe

abstract class Callee {}//Callee

class Read extends Callee {}//Read

class Write extends Callee {}//Write

class User extends Callee {

	String name;

	User (String name) {
		this.name = name;
	}//User
	
	public String toString(){
		return new String("User: "+name);
	}

}//User

class PPFunCall extends PPExpr {

	Callee callee;
	ArrayList<PPExpr> args;

	PPFunCall (Callee callee, ArrayList<PPExpr> args) {
		this.callee = callee;
		this.args = args;
	}//FunCall

	UPPExpr toUPP(ArrayList<String> locals){
		ArrayList<UPPExpr> list = new ArrayList<UPPExpr>();
		for(PPExpr expr: args){
			list.add(expr.toUPP(locals));
		}
		return new UPPFunCall(callee, list);
	}
	
	public String toString(){
		String argsString = new String();
		for(PPExpr ppe:args){
			argsString += ppe.toString();
		}
		return new String("PPFunCall: (Callee -->"+callee.toString()+", args --> "+argsString);
	}

}//FunCall

class PPArrayGet extends PPExpr {

	PPExpr arr, index;

	PPArrayGet (PPExpr arr, PPExpr index) {
		this.arr = arr;
		this.index = index;
	}//PPArrayGet

	UPPExpr toUPP(ArrayList<String> locals){
		UPPExpr mul=new UPPMul(new UPPCte(4),index.toUPP(locals));
		UPPExpr add = new UPPAdd(arr.toUPP(locals),mul);
		return new UPPLoad(add);	
	}
	
	public String toString(){
		return new String("PPArrayGet: (arr"+arr.toString()+", index: "+index.toString()+") ");
	}

}//PPArrayGet

class PPArrayAlloc extends PPExpr {

	Type type;
	PPExpr size;

	PPArrayAlloc (Type type, PPExpr size) {
		this.type = type;
		this.size = size;
	}//PPArrayAlloc

	UPPExpr toUPP(ArrayList<String> locals){
		UPPExpr argTemp = new UPPMul(new UPPCte(4),size.toUPP(locals));
		ArrayList<UPPExpr> args = new ArrayList<UPPExpr>();
		args.add(argTemp);
		return new UPPFunCall(new Alloc(),args);
	}
	
	public String toString(){
		return new String("PPArrayAlloc: (type"+type.toString()+", size: "+size.toString()+") ");
	}

}//PPArrayAlloc

/****************/
/* Instructions */
/****************/

abstract class PPInst {
	abstract UPPInst toUPP(ArrayList<String> locals);
}//PPInst

class PPAssign extends PPInst {

	String name;
	PPExpr val;

	PPAssign (String name, PPExpr val) {
		this.name = name;
		this.val = val;
	}//PPAssign

	UPPInst toUPP(ArrayList<String> locals){
		return new UPPAssign(name,val.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPAssignt: (variable"+name+", valeur: "+val+") ");
	}

}//PPAssign

class PPArraySet extends PPInst {

	PPExpr arr, index, val;

	PPArraySet (PPExpr arr, PPExpr index, PPExpr val) {
		this.arr = arr;
		this.index = index;
		this.val = val;
	}//PPArraySet

	UPPInst toUPP(ArrayList<String> locals){
		UPPMul offset = new UPPMul(new UPPCte(4),index.toUPP(locals));
		UPPAdd add = new UPPAdd(arr.toUPP(locals),offset);
		return new UPPStore(add,val.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPArraySet: (arr: "+arr.toString()+", index: "+index.toString()+", val: "+val+") ");
	}

}//PPArraySet

class PPCond extends PPInst {

	PPExpr cond;
	PPInst i1, i2;

	PPCond (PPExpr cond, PPInst i1, PPInst i2) {
		this.cond = cond;
		this.i1 = i1;
		this.i2 = i2;
	}//PPCond

	UPPInst toUPP(ArrayList<String> locals){
		return new UPPCond(cond.toUPP(locals),i1.toUPP(locals),i2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPCond: (cond"+cond.toString()+", i1: "+i1.toString()+", i2:"+i2.toString()+") ");
	}

}//PPCond

class PPWhile extends PPInst {

	PPExpr cond;
	PPInst i;

	PPWhile (PPExpr cond, PPInst i) {
		this.cond = cond;
		this.i = i;
	}//PPWhile

	UPPInst toUPP(ArrayList<String> locals){
		return new UPPWhile(cond.toUPP(locals),i.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPWhile: (cond: "+cond.toString()+", instruction: "+i.toString()+") ");
	}

}//PPWhile

class PPProcCall extends PPInst {

	Callee callee;
	ArrayList<PPExpr> args;

	PPProcCall (Callee callee, ArrayList<PPExpr> args) {
		this.callee = callee;
		this.args = args;
	}//PPProcCall

	UPPInst toUPP(ArrayList<String> locals){
		ArrayList<UPPExpr> list = new ArrayList<UPPExpr>();
    	for(PPExpr expr: args){
    		list.add(expr.toUPP(locals));
    	}
		return new UPPProcCall(callee,list);
	}
	
	public String toString(){
		String argsString = new String();
		for(PPExpr ppe:args){
			argsString += ppe.toString();
		}
		return new String("PPProcCall: (Callee -->"+callee.toString()+", args --> "+argsString);
	}

}//PPProcCall

class PPSkip extends PPInst {
	UPPSkip toUPP(ArrayList<String> locals){
		return new UPPSkip();
	}
	
	public String toString(){
		return new String("PPSkip");
	}
}//PPSkip

class PPSeq extends PPInst {

	PPInst i1, i2;

	PPSeq (PPInst i1, PPInst i2) {
		this.i1 = i1;
		this.i2 = i2;
	}//PPSeq

	UPPInst toUPP(ArrayList<String> locals){
		return new UPPSeq (i1.toUPP(locals),i2.toUPP(locals));
	}
	
	public String toString(){
		return new String("PPSeq: (i1: "+i1.toString()+", i2: "+i2.toString()+") ");
	}

}//PPSeq

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
	
	public String toString(){
		return new String("Pair: (left: "+left.toString()+", right: "+right.toString()+") ");
	}

}//Pair

abstract class PPDef {

	String name;
	ArrayList<Pair<String,Type>> args, locals;
	PPInst code;

	abstract UPPDef toUPP ();

}//PPDef

class PPFun extends PPDef {

	Type ret;

	PPFun (String name, ArrayList<Pair<String,Type>> args,
			ArrayList<Pair<String,Type>> locals, PPInst code, Type ret) {
		this.name = name;
		this.args = args;
		this.locals = locals;
		this.code = code;
		this.ret = ret;
	}//PPFun

	UPPDef toUPP(){
		ArrayList<String> arguments=new ArrayList<String>();
		ArrayList<String> locales=new ArrayList<String>();
		ArrayList<String> all=new ArrayList<String>();
		for(Pair<String,Type> a : args)
			arguments.add(a.left);
		for(Pair<String,Type> e : locals)
			locales.add(e.left);
		return new UPPFun(name,arguments,locales,code.toUPP(locales));
	}//toUPP

	public String toString(){
		return new String("PPFun: (retour: "+ret.toString()+" )");
	}
}//PPFun

class PPProc extends PPDef {

	PPProc (String name, ArrayList<Pair<String,Type>> args,
			ArrayList<Pair<String,Type>> locals, PPInst code) {
		this.name = name;
		this.args = args;
		this.locals = locals;
		this.code = code;
	}//PPProc

	UPPDef toUPP(){
		ArrayList<String> arguments=new ArrayList<String>();
		ArrayList<String> locales=new ArrayList<String>();
		for(Pair<String,Type> a : args)
			arguments.add(a.left);
		for(Pair<String,Type> e : locals)
			locales.add(e.left);
		return new UPPProc(name,arguments,locales,code.toUPP(locales));
	}
	
	public String toString(){
		String argPair = new String();
		for(Pair ppe:args){
			argPair += ppe.toString();
		}
		String arglocals = new String();
		for(Pair ppe:locals){
			arglocals += ppe.toString();
		}
		return new String("PPProc: (name: "+name+", args-->: "+argPair.toString()+", locales -->: "+arglocals.toString()+",code: "+code.toString()+" )");
	}

}//PPProc

/************/
/* Programs */
/************/

class PPProg {

	ArrayList<Pair<String,Type>> globals;
	ArrayList<PPDef> defs;
	PPInst code;

	PPProg (ArrayList<Pair<String,Type>> globals, ArrayList<PPDef> defs,
			PPInst code) {
		this.globals = globals;
		this.defs = defs;
		this.code = code;
	}//PPProg

	UPPProg toUPP(){
		ArrayList<String> globales=new ArrayList<String>();
		ArrayList<UPPDef> uppdefs=new ArrayList<UPPDef>();
		for(Pair<String,Type> e : globals){
			globales.add(e.left);
		}
		for(PPDef d : defs){
			uppdefs.add(d.toUPP());
		}
		UPPInst uppcode = code.toUPP(new ArrayList<String>());
		return new UPPProg(globales,uppdefs,uppcode);   
	}
	
	public String toString(){
		String argGlobal = new String();
		for(Pair ppe:globals){
			argGlobal += ppe.toString();
		}
		String argDefs = new String();
		for(PPDef ppe:defs){
			argDefs += ppe.toString();
		}
		return new String("PPProg: (variable global: "+argGlobal.toString()+", argDef-->: "+argDefs.toString()+", code -->: "+code.toString()+" )");
	}

}//PPProg
