package AST_prePP;
// Generated from ExprArithAST.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprArithASTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LT=2, LQ=3, EQ=4, NQ=5, GQ=6, GT=7, NOT=8, TRUE=9, FALSE=10, PLUS=11, 
		MINUS=12, MUL=13, DIV=14, OR=15, AND=16, P1=17, P2=18, WHILE=19, DO=20, 
		IF=21, THEN=22, ELSE=23, VAR=24, TYPE=25, AFFECT=26, DEUXPOINTS=27, CROCHETOUVRANT=28, 
		CROCHETFERMANT=29, PLEFT=30, PRIGHT=31, READ=32, WRITE=33, WS=34, DIGIT=35, 
		LETTER=36;
	public static final int
		RULE_expr = 0, RULE_additionExpr = 1, RULE_multiplyExpr = 2, RULE_logicExpr = 3, 
		RULE_comparingExpr = 4, RULE_atomExpr = 5, RULE_number = 6, RULE_r_boolean = 7, 
		RULE_array = 8, RULE_variable = 9, RULE_varDeclaration = 10, RULE_varAffectation = 11, 
		RULE_ifStatement = 12, RULE_whileStatement = 13, RULE_functionDeclaration = 14, 
		RULE_instruction = 15;
	public static final String[] ruleNames = {
		"expr", "additionExpr", "multiplyExpr", "logicExpr", "comparingExpr", 
		"atomExpr", "number", "r_boolean", "array", "variable", "varDeclaration", 
		"varAffectation", "ifStatement", "whileStatement", "functionDeclaration", 
		"instruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'f'", "'<'", "'<='", "'='", "'!='", "'>='", "'>'", null, "'true'", 
		"'false'", "'+'", "'-'", "'*'", "'/'", "'or'", "'and'", null, null, "'while'", 
		"'do'", "'if'", "'then'", "'else'", "'var'", null, "':='", "':'", "'['", 
		"']'", null, null, "'read'", "'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LT", "LQ", "EQ", "NQ", "GQ", "GT", "NOT", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MUL", "DIV", "OR", "AND", "P1", "P2", "WHILE", "DO", 
		"IF", "THEN", "ELSE", "VAR", "TYPE", "AFFECT", "DEUXPOINTS", "CROCHETOUVRANT", 
		"CROCHETFERMANT", "PLEFT", "PRIGHT", "READ", "WRITE", "WS", "DIGIT", "LETTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExprArithAST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprArithASTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public AdditionExprContext additionExpr() {
			return getRuleContext(AdditionExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			additionExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionExprContext extends ParserRuleContext {
		public ExprArith value;
		public MultiplyExprContext e1;
		public MultiplyExprContext e2;
		public List<MultiplyExprContext> multiplyExpr() {
			return getRuleContexts(MultiplyExprContext.class);
		}
		public MultiplyExprContext multiplyExpr(int i) {
			return getRuleContext(MultiplyExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExprArithASTParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExprArithASTParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExprArithASTParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExprArithASTParser.MINUS, i);
		}
		public AdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((AdditionExprContext)_localctx).e1 = multiplyExpr();
			((AdditionExprContext)_localctx).value =  ((AdditionExprContext)_localctx).e1.value;
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(44);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(36);
						match(PLUS);
						setState(37);
						((AdditionExprContext)_localctx).e2 = multiplyExpr();
						((AdditionExprContext)_localctx).value =  new Add(_localctx.value, ((AdditionExprContext)_localctx).e2.value);
						}
						break;
					case MINUS:
						{
						setState(40);
						match(MINUS);
						setState(41);
						((AdditionExprContext)_localctx).e2 = multiplyExpr();
						((AdditionExprContext)_localctx).value =  new Sub(_localctx.value, ((AdditionExprContext)_localctx).e2.value);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyExprContext extends ParserRuleContext {
		public ExprArith value;
		public AtomExprContext e1;
		public AtomExprContext e2;
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ExprArithASTParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ExprArithASTParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExprArithASTParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExprArithASTParser.DIV, i);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((MultiplyExprContext)_localctx).e1 = atomExpr();
			((MultiplyExprContext)_localctx).value =  ((MultiplyExprContext)_localctx).e1.value;
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				setState(59);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(51);
					match(MUL);
					setState(52);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Mul(_localctx.value, ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				case DIV:
					{
					setState(55);
					match(DIV);
					setState(56);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Div(_localctx.value, ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExprContext extends ParserRuleContext {
		public Bool value;
		public AtomExprContext e1;
		public AtomExprContext e2;
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprArithASTParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprArithASTParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprArithASTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprArithASTParser.OR, i);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitLogicExpr(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logicExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((LogicExprContext)_localctx).e1 = atomExpr();
			((LogicExprContext)_localctx).value =  e1.value;
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				setState(74);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(66);
					match(AND);
					setState(67);
					((LogicExprContext)_localctx).e2 = atomExpr();
					((LogicExprContext)_localctx).value =  new And(_localctx.value, ((LogicExprContext)_localctx).e2.value);
					}
					break;
				case OR:
					{
					setState(70);
					match(OR);
					setState(71);
					((LogicExprContext)_localctx).e2 = atomExpr();
					((LogicExprContext)_localctx).value =  new Or(_localctx.value, ((LogicExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparingExprContext extends ParserRuleContext {
		public Bool value;
		public AtomExprContext e1;
		public AtomExprContext e2;
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ExprArithASTParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ExprArithASTParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ExprArithASTParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ExprArithASTParser.GT, i);
		}
		public List<TerminalNode> LQ() { return getTokens(ExprArithASTParser.LQ); }
		public TerminalNode LQ(int i) {
			return getToken(ExprArithASTParser.LQ, i);
		}
		public List<TerminalNode> GQ() { return getTokens(ExprArithASTParser.GQ); }
		public TerminalNode GQ(int i) {
			return getToken(ExprArithASTParser.GQ, i);
		}
		public List<TerminalNode> EQ() { return getTokens(ExprArithASTParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ExprArithASTParser.EQ, i);
		}
		public List<TerminalNode> NQ() { return getTokens(ExprArithASTParser.NQ); }
		public TerminalNode NQ(int i) {
			return getToken(ExprArithASTParser.NQ, i);
		}
		public ComparingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterComparingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitComparingExpr(this);
		}
	}

	public final ComparingExprContext comparingExpr() throws RecognitionException {
		ComparingExprContext _localctx = new ComparingExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparingExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((ComparingExprContext)_localctx).e1 = atomExpr();
			((ComparingExprContext)_localctx).value =  e1.value;
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LQ) | (1L << EQ) | (1L << NQ) | (1L << GQ) | (1L << GT))) != 0)) {
				{
				setState(105);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(81);
					match(LT);
					setState(82);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new LesserThan(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				case GT:
					{
					setState(85);
					match(GT);
					setState(86);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new GreaterThan(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				case LQ:
					{
					setState(89);
					match(LQ);
					setState(90);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new LesserThanOrEqual(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				case GQ:
					{
					setState(93);
					match(GQ);
					setState(94);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new GreaterThanOrEqual(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				case EQ:
					{
					setState(97);
					match(EQ);
					setState(98);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new Equal(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				case NQ:
					{
					setState(101);
					match(NQ);
					setState(102);
					((ComparingExprContext)_localctx).e2 = atomExpr();
					((ComparingExprContext)_localctx).value =  new Different(_localctx.value, ((ComparingExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomExprContext extends ParserRuleContext {
		public ExprArith value;
		public NumberContext c;
		public AdditionExprContext e1;
		public AtomExprContext e2;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode PLEFT() { return getToken(ExprArithASTParser.PLEFT, 0); }
		public TerminalNode PRIGHT() { return getToken(ExprArithASTParser.PRIGHT, 0); }
		public AdditionExprContext additionExpr() {
			return getRuleContext(AdditionExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ExprArithASTParser.MINUS, 0); }
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atomExpr);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((AtomExprContext)_localctx).c = number();
				((AtomExprContext)_localctx).value =  new Cte(Integer.parseInt((((AtomExprContext)_localctx).c!=null?_input.getText(((AtomExprContext)_localctx).c.start,((AtomExprContext)_localctx).c.stop):null)));
				}
				break;
			case PLEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(PLEFT);
				setState(114);
				((AtomExprContext)_localctx).e1 = additionExpr();
				setState(115);
				match(PRIGHT);
				((AtomExprContext)_localctx).value =  ((AtomExprContext)_localctx).e1.value;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(MINUS);
				setState(119);
				((AtomExprContext)_localctx).e2 = atomExpr();
				((AtomExprContext)_localctx).value =  new Inv(((AtomExprContext)_localctx).e2.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ExprArithASTParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ExprArithASTParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_booleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ExprArithASTParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprArithASTParser.FALSE, 0); }
		public R_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterR_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitR_boolean(this);
		}
	}

	public final R_booleanContext r_boolean() throws RecognitionException {
		R_booleanContext _localctx = new R_booleanContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode CROCHETOUVRANT() { return getToken(ExprArithASTParser.CROCHETOUVRANT, 0); }
		public TerminalNode CROCHETFERMANT() { return getToken(ExprArithASTParser.CROCHETFERMANT, 0); }
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CROCHETOUVRANT);
			setState(134);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(132);
				r_boolean();
				}
				break;
			case DIGIT:
				{
				setState(133);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			match(CROCHETFERMANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ExprArithASTParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ExprArithASTParser.LETTER, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				match(LETTER);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprArithASTParser.VAR, 0); }
		public TerminalNode DEUXPOINTS() { return getToken(ExprArithASTParser.DEUXPOINTS, 0); }
		public TerminalNode TYPE() { return getToken(ExprArithASTParser.TYPE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(VAR);
			{
			setState(144);
			variable();
			}
			setState(145);
			match(DEUXPOINTS);
			setState(146);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAffectationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(ExprArithASTParser.AFFECT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
		}
		public VarAffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAffectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterVarAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitVarAffectation(this);
		}
	}

	public final VarAffectationContext varAffectation() throws RecognitionException {
		VarAffectationContext _localctx = new VarAffectationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAffectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			variable();
			setState(149);
			match(AFFECT);
			setState(152);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(150);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(151);
				r_boolean();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprArithASTParser.IF, 0); }
		public ComparingExprContext comparingExpr() {
			return getRuleContext(ComparingExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ExprArithASTParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ExprArithASTParser.ELSE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IF);
			setState(155);
			comparingExpr();
			setState(156);
			match(THEN);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				instruction();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << VAR) | (1L << LETTER))) != 0) );
			setState(162);
			match(ELSE);
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(163);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprArithASTParser.WHILE, 0); }
		public ComparingExprContext comparingExpr() {
			return getRuleContext(ComparingExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(ExprArithASTParser.DO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			comparingExpr();
			setState(170);
			match(DO);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				expr();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLEFT) | (1L << DIGIT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode PLEFT() { return getToken(ExprArithASTParser.PLEFT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> DEUXPOINTS() { return getTokens(ExprArithASTParser.DEUXPOINTS); }
		public TerminalNode DEUXPOINTS(int i) {
			return getToken(ExprArithASTParser.DEUXPOINTS, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(ExprArithASTParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ExprArithASTParser.TYPE, i);
		}
		public TerminalNode PRIGHT() { return getToken(ExprArithASTParser.PRIGHT, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__0);
			setState(177);
			match(PLEFT);
			setState(178);
			variable();
			setState(179);
			match(DEUXPOINTS);
			setState(180);
			match(TYPE);
			setState(181);
			match(PRIGHT);
			setState(182);
			match(DEUXPOINTS);
			setState(183);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAffectationContext varAffectation() {
			return getRuleContext(VarAffectationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprArithASTListener ) ((ExprArithASTListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(185);
				varDeclaration();
				}
				break;
			case LETTER:
				{
				setState(186);
				varAffectation();
				}
				break;
			case IF:
				{
				setState(187);
				ifStatement();
				}
				break;
			case WHILE:
				{
				setState(188);
				whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\6\b\u0080\n\b\r\b\16\b\u0081\3\t\3\t\3"+
		"\n\3\n\3\n\5\n\u0089\n\n\3\n\3\n\3\13\6\13\u008e\n\13\r\13\16\13\u008f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\16\3\16"+
		"\6\16\u00a1\n\16\r\16\16\16\u00a2\3\16\3\16\6\16\u00a7\n\16\r\16\16\16"+
		"\u00a8\3\17\3\17\3\17\3\17\6\17\u00af\n\17\r\17\16\17\u00b0\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c0\n\21"+
		"\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\13\f\u00c9"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6\63\3\2\2\2\bB\3\2\2\2\nQ\3\2\2\2\f|\3\2\2\2"+
		"\16\177\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u008d\3\2\2\2\26"+
		"\u0091\3\2\2\2\30\u0096\3\2\2\2\32\u009c\3\2\2\2\34\u00aa\3\2\2\2\36\u00b2"+
		"\3\2\2\2 \u00bf\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$%\5\6\4\2%\60\b\3\1\2&\'"+
		"\7\r\2\2\'(\5\6\4\2()\b\3\1\2)/\3\2\2\2*+\7\16\2\2+,\5\6\4\2,-\b\3\1\2"+
		"-/\3\2\2\2.&\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\5\3\2\2\2\62\60\3\2\2\2\63\64\5\f\7\2\64?\b\4\1\2\65\66\7\17\2\2\66\67"+
		"\5\f\7\2\678\b\4\1\28>\3\2\2\29:\7\20\2\2:;\5\f\7\2;<\b\4\1\2<>\3\2\2"+
		"\2=\65\3\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3"+
		"\2\2\2BC\5\f\7\2CN\b\5\1\2DE\7\22\2\2EF\5\f\7\2FG\b\5\1\2GM\3\2\2\2HI"+
		"\7\21\2\2IJ\5\f\7\2JK\b\5\1\2KM\3\2\2\2LD\3\2\2\2LH\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QR\5\f\7\2Rm\b\6\1\2ST\7\4\2"+
		"\2TU\5\f\7\2UV\b\6\1\2Vl\3\2\2\2WX\7\t\2\2XY\5\f\7\2YZ\b\6\1\2Zl\3\2\2"+
		"\2[\\\7\5\2\2\\]\5\f\7\2]^\b\6\1\2^l\3\2\2\2_`\7\b\2\2`a\5\f\7\2ab\b\6"+
		"\1\2bl\3\2\2\2cd\7\6\2\2de\5\f\7\2ef\b\6\1\2fl\3\2\2\2gh\7\7\2\2hi\5\f"+
		"\7\2ij\b\6\1\2jl\3\2\2\2kS\3\2\2\2kW\3\2\2\2k[\3\2\2\2k_\3\2\2\2kc\3\2"+
		"\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2\2pq\5"+
		"\16\b\2qr\b\7\1\2r}\3\2\2\2st\7 \2\2tu\5\4\3\2uv\7!\2\2vw\b\7\1\2w}\3"+
		"\2\2\2xy\7\16\2\2yz\5\f\7\2z{\b\7\1\2{}\3\2\2\2|p\3\2\2\2|s\3\2\2\2|x"+
		"\3\2\2\2}\r\3\2\2\2~\u0080\7%\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084\t\2\2\2"+
		"\u0084\21\3\2\2\2\u0085\u0088\7\36\2\2\u0086\u0089\5\20\t\2\u0087\u0089"+
		"\5\16\b\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\7\37\2\2\u008b\23\3\2\2\2\u008c\u008e\7&\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\25\3\2\2\2\u0091\u0092\7\32\2\2\u0092\u0093\5\24\13\2\u0093\u0094\7\35"+
		"\2\2\u0094\u0095\7\33\2\2\u0095\27\3\2\2\2\u0096\u0097\5\24\13\2\u0097"+
		"\u009a\7\34\2\2\u0098\u009b\5\16\b\2\u0099\u009b\5\20\t\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\31\3\2\2\2\u009c\u009d\7\27\2\2\u009d"+
		"\u009e\5\n\6\2\u009e\u00a0\7\30\2\2\u009f\u00a1\5 \21\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\7\31\2\2\u00a5\u00a7\5 \21\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ae\7\26"+
		"\2\2\u00ad\u00af\5\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\3\2"+
		"\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7\35\2\2\u00b6"+
		"\u00b7\7\33\2\2\u00b7\u00b8\7!\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\7"+
		"\33\2\2\u00ba\37\3\2\2\2\u00bb\u00c0\5\26\f\2\u00bc\u00c0\5\30\r\2\u00bd"+
		"\u00c0\5\32\16\2\u00be\u00c0\5\34\17\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0!\3\2\2\2\23.\60"+
		"=?LNkm|\u0081\u0088\u008f\u009a\u00a2\u00a8\u00b0\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}