// Generated from ExprArithAST.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprArithASTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LT=2, LQ=3, EQ=4, NQ=5, GQ=6, GT=7, NOT=8, TRUE=9, FALSE=10, PLUS=11, 
		MINUS=12, MUL=13, DIV=14, OR=15, AND=16, P1=17, P2=18, WHILE=19, DO=20, 
		IF=21, THEN=22, ELSE=23, VAR=24, TYPE=25, AFFECT=26, DEUXPOINTS=27, CROCHETOUVRANT=28, 
		CROCHETFERMANT=29, PLEFT=30, PRIGHT=31, READ=32, WRITE=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DIGIT", "LETTER", "LT", "LQ", "EQ", "NQ", "GQ", "GT", "NOT", 
		"TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "OR", "AND", "P1", "P2", 
		"WHILE", "DO", "IF", "THEN", "ELSE", "VAR", "TYPE", "AFFECT", "DEUXPOINTS", 
		"CROCHETOUVRANT", "CROCHETFERMANT", "PLEFT", "PRIGHT", "READ", "WRITE", 
		"WS"
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
		"CROCHETFERMANT", "PLEFT", "PRIGHT", "READ", "WRITE", "WS"
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


	public ExprArithASTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprArithAST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"e\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00b8\n\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\6%\u00d3\n%\r%\16%\u00d4\3%\3%\2\2&\3\3\5\2\7\2\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$\3"+
		"\2\3\5\2\13\f\17\17\"\"\u00d9\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3"+
		"\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25d\3\2\2\2\27f"+
		"\3\2\2\2\31k\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#y\3"+
		"\2\2\2%|\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084\3\2\2\2-\u008a"+
		"\3\2\2\2/\u008d\3\2\2\2\61\u0090\3\2\2\2\63\u0095\3\2\2\2\65\u009a\3\2"+
		"\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c0"+
		"\3\2\2\2A\u00c2\3\2\2\2C\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00cb\3\2\2\2I"+
		"\u00d2\3\2\2\2KL\7h\2\2L\4\3\2\2\2MN\4\62;\2N\6\3\2\2\2OP\4c|\2P\b\3\2"+
		"\2\2QR\7>\2\2R\n\3\2\2\2ST\7>\2\2TU\7?\2\2U\f\3\2\2\2VW\7?\2\2W\16\3\2"+
		"\2\2XY\7#\2\2YZ\7?\2\2Z\20\3\2\2\2[\\\7@\2\2\\]\7?\2\2]\22\3\2\2\2^_\7"+
		"@\2\2_\24\3\2\2\2`a\7p\2\2ab\7q\2\2be\7v\2\2ce\7#\2\2d`\3\2\2\2dc\3\2"+
		"\2\2e\26\3\2\2\2fg\7v\2\2gh\7t\2\2hi\7w\2\2ij\7g\2\2j\30\3\2\2\2kl\7h"+
		"\2\2lm\7c\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p\32\3\2\2\2qr\7-\2\2r\34\3\2"+
		"\2\2st\7/\2\2t\36\3\2\2\2uv\7,\2\2v \3\2\2\2wx\7\61\2\2x\"\3\2\2\2yz\7"+
		"q\2\2z{\7t\2\2{$\3\2\2\2|}\7c\2\2}~\7p\2\2~\177\7f\2\2\177&\3\2\2\2\u0080"+
		"\u0081\7*\2\2\u0081(\3\2\2\2\u0082\u0083\7+\2\2\u0083*\3\2\2\2\u0084\u0085"+
		"\7y\2\2\u0085\u0086\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7g\2\2\u0089,\3\2\2\2\u008a\u008b\7f\2\2\u008b\u008c\7q\2\2\u008c"+
		".\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f\60\3\2\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2"+
		"\u0094\62\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7"+
		"u\2\2\u0098\u0099\7g\2\2\u0099\64\3\2\2\2\u009a\u009b\7x\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7t\2\2\u009d\66\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7w\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00b8\7t\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00b8"+
		"\7p\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7y\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7t\2"+
		"\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7{\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b8\7h\2\2\u00b7\u009e\3\2\2\2\u00b7\u00a4\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b88\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		":\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd<\3\2\2\2\u00be\u00bf\7]\2\2\u00bf>"+
		"\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3B\3"+
		"\2\2\2\u00c4\u00c5\7+\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7f\2\2\u00caF\3\2\2\2\u00cb\u00cc"+
		"\7y\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0H\3\2\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\b%\2\2\u00d7J\3\2\2\2\6\2d\u00b7\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}