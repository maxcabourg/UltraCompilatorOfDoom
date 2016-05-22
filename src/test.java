import java.util.ArrayList;


public class test {

	public static void main(String[] args) {
		// Global variables
		ArrayList<Pair<String, Type>> globals = new ArrayList<>();
		globals.add(new Pair<String, Type>("n", new Int()));

		// Def the functions 
		ArrayList<PPDef> defs = new ArrayList<>();

		// Function f
		ArrayList<Pair<String, Type>> vars = new ArrayList<>();
		vars.add(new Pair<String, Type>("n", new Int()));
		ArrayList<Pair<String, Type>> locals = new ArrayList<>();
		locals.add(new Pair<String, Type>("i", new Int()));
		Type ret = new Int();
		//F code
		// if
		PPExpr ifCondition = new PPEq(new PPVar("n"), new PPCte(0));
		// then
		PPInst thenSeq = new PPAssign("f", new PPCte(0));
		// else
		PPInst other0 = new PPAssign("f", new PPCte(1));
		PPInst other1 = new PPAssign("i", new PPCte(1));
		PPInst while0 = new PPAssign("f", new PPMul(new PPVar("f"), new PPVar("i")));
		PPInst while1 = new PPAssign("i", new PPAdd(new PPVar("i"), new PPCte(1)));
		PPInst whileSeq = new PPSeq(while0, while1);
		PPExpr whileCondition = new PPLeq(new PPVar("i"), new PPVar("n"));
		PPInst other2 = new PPWhile(whileCondition, whileSeq);
		PPInst otherSeq = new PPSeq(other1, other2);
		otherSeq = new PPSeq(other0, otherSeq);
		// code
		PPInst functionCode = new PPCond(ifCondition, thenSeq, otherSeq);

		// Add function to defs
		defs.add(new PPFun("f", vars, locals, functionCode, ret));
		// read call
		PPFunCall read = new PPFunCall(new Read(), new ArrayList<PPExpr>());
		PPInst affect = new PPAssign("n", read);
		// f call
		ArrayList<PPExpr> callArgs0 = new ArrayList<>();
		callArgs0.add(new PPVar("n"));
		ArrayList<PPExpr> callArgs1 = new ArrayList<>();
		callArgs1.add(new PPFunCall(new User("f"), callArgs0));
		// write call
		PPInst write = new PPProcCall(new Write(), callArgs1);
		PPInst mainCode = new PPSeq(affect, write);

		PPProg program = new PPProg(globals, defs, mainCode);
		System.out.println(program);
		UPPProg programUPP = program.toUPP();
		System.out.println(programUPP);
	}

}
