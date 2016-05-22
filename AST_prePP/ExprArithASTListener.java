package AST_prePP;
// Generated from ExprArithAST.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprArithASTParser}.
 */
public interface ExprArithASTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprArithASTParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprArithASTParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(ExprArithASTParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#additionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(ExprArithASTParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(ExprArithASTParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(ExprArithASTParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(ExprArithASTParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(ExprArithASTParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#comparingExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparingExpr(ExprArithASTParser.ComparingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#comparingExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparingExpr(ExprArithASTParser.ComparingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprArithASTParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprArithASTParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprArithASTParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprArithASTParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#r_boolean}.
	 * @param ctx the parse tree
	 */
	void enterR_boolean(ExprArithASTParser.R_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#r_boolean}.
	 * @param ctx the parse tree
	 */
	void exitR_boolean(ExprArithASTParser.R_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ExprArithASTParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ExprArithASTParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprArithASTParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprArithASTParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ExprArithASTParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ExprArithASTParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#varAffectation}.
	 * @param ctx the parse tree
	 */
	void enterVarAffectation(ExprArithASTParser.VarAffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#varAffectation}.
	 * @param ctx the parse tree
	 */
	void exitVarAffectation(ExprArithASTParser.VarAffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprArithASTParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprArithASTParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprArithASTParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprArithASTParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ExprArithASTParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ExprArithASTParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprArithASTParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ExprArithASTParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprArithASTParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ExprArithASTParser.InstructionContext ctx);
}