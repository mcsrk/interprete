// Generated from C:/Users/jhon_/IdeaProjects/interprete/grammar\MyLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMMENT=9, 
		LINE_COMMENT=10, WS=11, VAR=12, PIZQ=13, PDER=14, ROP=15, SMCOLON=16, 
		MULOP=17, SUMOP=18, DOUBLE=19, ID=20;
	public static final int
		RULE_commands = 0, RULE_command = 1, RULE_conditional = 2, RULE_repeat = 3, 
		RULE_printexpr = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"commands", "command", "conditional", "repeat", "printexpr", "expr"
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

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyLanguageParser.EOF, 0); }
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__7:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				command();
				setState(13);
				commands();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(EOF);
				}
				break;
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CommandContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public PrintexprContext printexpr() {
			return getRuleContext(PrintexprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyLanguageParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				conditional();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				repeat();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				printexpr();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(VAR);
				setState(23);
				match(ID);
				setState(24);
				match(T__0);
				setState(25);
				expr(0);
				setState(26);
				match(SMCOLON);
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ROP() { return getToken(MyLanguageParser.ROP, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			expr(0);
			setState(32);
			match(ROP);
			setState(33);
			expr(0);
			setState(34);
			match(T__2);
			setState(35);
			commands();
			setState(36);
			match(T__3);
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

	public static class RepeatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__4);
			setState(39);
			expr(0);
			setState(40);
			match(T__5);
			setState(41);
			commands();
			setState(42);
			match(T__6);
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

	public static class PrintexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public PrintexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPrintexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintexprContext printexpr() throws RecognitionException {
		PrintexprContext _localctx = new PrintexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__7);
			setState(45);
			expr(0);
			setState(46);
			match(SMCOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(MyLanguageParser.DOUBLE, 0); }
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode MULOP() { return getToken(MyLanguageParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(MyLanguageParser.SUMOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				setState(49);
				match(DOUBLE);
				}
				break;
			case PIZQ:
				{
				setState(50);
				match(PIZQ);
				setState(51);
				expr(0);
				setState(52);
				match(PDER);
				}
				break;
			case ID:
				{
				setState(54);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(58);
						match(MULOP);
						setState(59);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(61);
						match(SUMOP);
						setState(62);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014E\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u00058\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005@\b"+
		"\u0005\n\u0005\f\u0005C\t\u0005\u0001\u0005\u0000\u0001\n\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0000G\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000"+
		"\u0006&\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n7\u0001\u0000"+
		"\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e\u0003\u0000\u0000\u0000"+
		"\u000e\u0012\u0001\u0000\u0000\u0000\u000f\u0012\u0005\u0000\u0000\u0001"+
		"\u0010\u0012\u0001\u0000\u0000\u0000\u0011\f\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u001d\u0003\u0004\u0002\u0000\u0014"+
		"\u001d\u0003\u0006\u0003\u0000\u0015\u001d\u0003\b\u0004\u0000\u0016\u0017"+
		"\u0005\f\u0000\u0000\u0017\u0018\u0005\u0014\u0000\u0000\u0018\u0019\u0005"+
		"\u0001\u0000\u0000\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b\u0005\u0010"+
		"\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0013\u0001\u0000"+
		"\u0000\u0000\u001c\u0014\u0001\u0000\u0000\u0000\u001c\u0015\u0001\u0000"+
		"\u0000\u0000\u001c\u0016\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0003\n\u0005"+
		"\u0000 !\u0005\u000f\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0005\u0003"+
		"\u0000\u0000#$\u0003\u0000\u0000\u0000$%\u0005\u0004\u0000\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0005\u0000\u0000\'(\u0003\n\u0005\u0000"+
		"()\u0005\u0006\u0000\u0000)*\u0003\u0000\u0000\u0000*+\u0005\u0007\u0000"+
		"\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000-.\u0003\n"+
		"\u0005\u0000./\u0005\u0010\u0000\u0000/\t\u0001\u0000\u0000\u000001\u0006"+
		"\u0005\uffff\uffff\u000018\u0005\u0013\u0000\u000023\u0005\r\u0000\u0000"+
		"34\u0003\n\u0005\u000045\u0005\u000e\u0000\u000058\u0001\u0000\u0000\u0000"+
		"68\u0005\u0014\u0000\u000070\u0001\u0000\u0000\u000072\u0001\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u00008A\u0001\u0000\u0000\u00009:\n\u0005\u0000"+
		"\u0000:;\u0005\u0011\u0000\u0000;@\u0003\n\u0005\u0006<=\n\u0004\u0000"+
		"\u0000=>\u0005\u0012\u0000\u0000>@\u0003\n\u0005\u0005?9\u0001\u0000\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000\u0005\u0011\u001c7?A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}