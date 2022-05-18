// Generated from C:/Users/jhon_/IdeaProjects/interprete/grammar\MyLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMMENT=9, 
		LINE_COMMENT=10, WS=11, VAR=12, PIZQ=13, PDER=14, ROP=15, SMCOLON=16, 
		MULOP=17, SUMOP=18, DOUBLE=19, ID=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "COMMENT", 
			"LINE_COMMENT", "WS", "VAR", "PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", 
			"SUMOP", "DOUBLE", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'if'", "'then'", "'endif'", "'repeat'", "'times'", "'endrepeat'", 
			"'print'", null, null, null, "'var'", "'('", "')'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
			"WS", "VAR", "PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", "SUMOP", "DOUBLE", 
			"ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\\\b\b"+
		"\n\b\f\b_\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\tj\b\t\n\t\f\tm\t\t\u0001\t\u0001\t\u0001\n\u0004"+
		"\nr\b\n\u000b\n\f\ns\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u008a\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0093"+
		"\b\u0012\u000b\u0012\f\u0012\u0094\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u009a\b\u0012\u000b\u0012\f\u0012\u009b\u0003\u0012\u009e"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00a2\b\u0013\n\u0013\f\u0013"+
		"\u00a5\t\u0013\u0001]\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\b\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r"+
		"  \u0002\u0000**//\u0002\u0000++--\u0001\u000009\u0001\u0000..\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u00b1\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u0005/"+
		"\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t:\u0001\u0000"+
		"\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000"+
		"\u000fQ\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013e"+
		"\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017w\u0001\u0000"+
		"\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b}\u0001\u0000\u0000\u0000"+
		"\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000\u0000\u0000"+
		"!\u008d\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0092"+
		"\u0001\u0000\u0000\u0000\'\u009f\u0001\u0000\u0000\u0000)*\u0005a\u0000"+
		"\u0000*+\u0005s\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005i\u0000"+
		"\u0000-.\u0005f\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005t\u0000"+
		"\u000001\u0005h\u0000\u000012\u0005e\u0000\u000023\u0005n\u0000\u0000"+
		"3\u0006\u0001\u0000\u0000\u000045\u0005e\u0000\u000056\u0005n\u0000\u0000"+
		"67\u0005d\u0000\u000078\u0005i\u0000\u000089\u0005f\u0000\u00009\b\u0001"+
		"\u0000\u0000\u0000:;\u0005r\u0000\u0000;<\u0005e\u0000\u0000<=\u0005p"+
		"\u0000\u0000=>\u0005e\u0000\u0000>?\u0005a\u0000\u0000?@\u0005t\u0000"+
		"\u0000@\n\u0001\u0000\u0000\u0000AB\u0005t\u0000\u0000BC\u0005i\u0000"+
		"\u0000CD\u0005m\u0000\u0000DE\u0005e\u0000\u0000EF\u0005s\u0000\u0000"+
		"F\f\u0001\u0000\u0000\u0000GH\u0005e\u0000\u0000HI\u0005n\u0000\u0000"+
		"IJ\u0005d\u0000\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000LM\u0005"+
		"p\u0000\u0000MN\u0005e\u0000\u0000NO\u0005a\u0000\u0000OP\u0005t\u0000"+
		"\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005p\u0000\u0000RS\u0005r\u0000"+
		"\u0000ST\u0005i\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000\u0000"+
		"V\u0010\u0001\u0000\u0000\u0000WX\u0005/\u0000\u0000XY\u0005*\u0000\u0000"+
		"Y]\u0001\u0000\u0000\u0000Z\\\t\u0000\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005"+
		"*\u0000\u0000ab\u0005/\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0006\b"+
		"\u0000\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005/\u0000\u0000fg\u0005"+
		"/\u0000\u0000gk\u0001\u0000\u0000\u0000hj\b\u0000\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000no\u0006\t\u0000\u0000o\u0014\u0001\u0000\u0000\u0000pr\u0007\u0001"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0006\n\u0000\u0000v\u0016\u0001\u0000\u0000\u0000wx\u0005v\u0000\u0000"+
		"xy\u0005a\u0000\u0000yz\u0005r\u0000\u0000z\u0018\u0001\u0000\u0000\u0000"+
		"{|\u0005(\u0000\u0000|\u001a\u0001\u0000\u0000\u0000}~\u0005)\u0000\u0000"+
		"~\u001c\u0001\u0000\u0000\u0000\u007f\u008a\u0005<\u0000\u0000\u0080\u0081"+
		"\u0005<\u0000\u0000\u0081\u008a\u0005=\u0000\u0000\u0082\u0083\u0005>"+
		"\u0000\u0000\u0083\u008a\u0005=\u0000\u0000\u0084\u008a\u0005>\u0000\u0000"+
		"\u0085\u0086\u0005=\u0000\u0000\u0086\u008a\u0005=\u0000\u0000\u0087\u0088"+
		"\u0005!\u0000\u0000\u0088\u008a\u0005=\u0000\u0000\u0089\u007f\u0001\u0000"+
		"\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000"+
		"\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u001e\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005;\u0000\u0000\u008c \u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0007\u0002\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0007\u0003\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0007\u0004\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u009d\u0001\u0000\u0000\u0000\u0096\u009e"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0005\u0000\u0000\u0098\u009a"+
		"\u0007\u0004\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0096"+
		"\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009e&\u0001"+
		"\u0000\u0000\u0000\u009f\u00a3\u0007\u0006\u0000\u0000\u00a0\u00a2\u0007"+
		"\u0007\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4(\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\t\u0000]ks\u0089\u0094\u009b\u009d\u00a3\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}