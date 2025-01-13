// Generated from while.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class whileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, Variable=28, Symbol=29, WS=30;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_definition = 2, RULE_input = 3, 
		RULE_output = 4, RULE_vars = 5, RULE_exprs = 6, RULE_commands = 7, RULE_command = 8, 
		RULE_exprBase = 9, RULE_expression = 10, RULE_lExpr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "definition", "input", "output", "vars", "exprs", 
			"commands", "command", "exprBase", "expression", "lExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", 
			"'foreach'", "'in'", "'do'", "'od'", "'for'", "'while'", "'if'", "'then'", 
			"'else'", "'fi'", "'nop'", "':='", "'('", "')'", "'hd'", "'tl'", "'cons'", 
			"'list'", "'nil'", "'=?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Variable", "Symbol", "WS"
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
	public String getGrammarFileName() { return "while.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public whileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(whileParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				function();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(29);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(whileParser.Symbol, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(Symbol);
			setState(33);
			match(T__1);
			setState(34);
			definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			input();
			setState(38);
			match(T__3);
			setState(39);
			commands();
			setState(40);
			match(T__3);
			setState(41);
			match(T__4);
			setState(42);
			output();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> Variable() { return getTokens(whileParser.Variable); }
		public TerminalNode Variable(int i) {
			return getToken(whileParser.Variable, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Variable) {
				{
				setState(44);
				match(Variable);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(45);
					match(T__5);
					setState(46);
					match(Variable);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public List<TerminalNode> Variable() { return getTokens(whileParser.Variable); }
		public TerminalNode Variable(int i) {
			return getToken(whileParser.Variable, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Variable);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(55);
				match(T__5);
				setState(56);
				match(Variable);
				}
				}
				setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> Variable() { return getTokens(whileParser.Variable); }
		public TerminalNode Variable(int i) {
			return getToken(whileParser.Variable, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Variable);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(63);
				match(T__5);
				setState(64);
				match(Variable);
				}
				}
				setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			expression();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(71);
				match(T__5);
				setState(72);
				expression();
				}
				}
				setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			command();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(79);
				match(T__6);
				setState(80);
				command();
				}
				}
				setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(whileParser.Variable, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__7);
				setState(87);
				match(Variable);
				setState(88);
				match(T__8);
				setState(89);
				expression();
				setState(90);
				match(T__9);
				setState(91);
				commands();
				setState(92);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__11);
				setState(95);
				expression();
				setState(96);
				match(T__9);
				setState(97);
				commands();
				setState(98);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__12);
				setState(101);
				expression();
				setState(102);
				match(T__9);
				setState(103);
				commands();
				setState(104);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(T__13);
				setState(107);
				expression();
				setState(108);
				match(T__14);
				setState(109);
				commands();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(110);
					match(T__15);
					setState(111);
					commands();
					}
				}

				setState(114);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(T__17);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				vars();
				setState(118);
				match(T__18);
				setState(119);
				exprs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprBaseContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(whileParser.Symbol, 0); }
		public LExprContext lExpr() {
			return getRuleContext(LExprContext.class,0);
		}
		public ExprBaseContext exprBase() {
			return getRuleContext(ExprBaseContext.class,0);
		}
		public TerminalNode Variable() { return getToken(whileParser.Variable, 0); }
		public ExprBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterExprBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitExprBase(this);
		}
	}

	public final ExprBaseContext exprBase() throws RecognitionException {
		ExprBaseContext _localctx = new ExprBaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprBase);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__19);
				setState(124);
				match(Symbol);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 873463808L) != 0)) {
					{
					setState(125);
					lExpr();
					}
				}

				setState(128);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__19);
				setState(130);
				match(T__21);
				setState(131);
				exprBase();
				setState(132);
				match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__19);
				setState(135);
				match(T__22);
				setState(136);
				exprBase();
				setState(137);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(T__19);
				setState(140);
				match(T__23);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 873463808L) != 0)) {
					{
					setState(141);
					lExpr();
					}
				}

				setState(144);
				match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__19);
				setState(146);
				match(T__24);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 873463808L) != 0)) {
					{
					setState(147);
					lExpr();
					}
				}

				setState(150);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(T__25);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(Variable);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				match(Symbol);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExprBaseContext> exprBase() {
			return getRuleContexts(ExprBaseContext.class);
		}
		public ExprBaseContext exprBase(int i) {
			return getRuleContext(ExprBaseContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			exprBase();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(157);
				match(T__26);
				setState(158);
				exprBase();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LExprContext extends ParserRuleContext {
		public List<ExprBaseContext> exprBase() {
			return getRuleContexts(ExprBaseContext.class);
		}
		public ExprBaseContext exprBase(int i) {
			return getRuleContext(ExprBaseContext.class,i);
		}
		public LExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).enterLExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof whileListener ) ((whileListener)listener).exitLExpr(this);
		}
	}

	public final LExprContext lExpr() throws RecognitionException {
		LExprContext _localctx = new LExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				exprBase();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 873463808L) != 0) );
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
		"\u0004\u0001\u001e\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00030\b\u0003\n\u0003\f\u00033\t\u0003\u0003\u00035\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005"+
		"E\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006J\b\u0006\n\u0006"+
		"\f\u0006M\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007R\b\u0007"+
		"\n\u0007\f\u0007U\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bq\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u007f"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008f\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009b\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\u000b\u0004"+
		"\u000b\u00a3\b\u000b\u000b\u000b\f\u000b\u00a4\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000"+
		"\u00b3\u0000\u0019\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000"+
		"\u0000\u0004$\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b"+
		"6\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\fF\u0001\u0000\u0000"+
		"\u0000\u000eN\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012"+
		"\u009a\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016"+
		"\u00a2\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e"+
		"\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005"+
		"\u001d\u0000\u0000!\"\u0005\u0002\u0000\u0000\"#\u0003\u0004\u0002\u0000"+
		"#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0003\u0006"+
		"\u0003\u0000&\'\u0005\u0004\u0000\u0000\'(\u0003\u000e\u0007\u0000()\u0005"+
		"\u0004\u0000\u0000)*\u0005\u0005\u0000\u0000*+\u0003\b\u0004\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,1\u0005\u001c\u0000\u0000-.\u0005\u0006\u0000"+
		"\u0000.0\u0005\u001c\u0000\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u00004,\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u00006;\u0005\u001c"+
		"\u0000\u000078\u0005\u0006\u0000\u00008:\u0005\u001c\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>C\u0005\u001c\u0000\u0000?@\u0005\u0006\u0000\u0000@B\u0005\u001c"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u000b\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FK\u0003\u0014\n\u0000GH\u0005\u0006\u0000"+
		"\u0000HJ\u0003\u0014\n\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\r\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NS\u0003\u0010\b\u0000OP\u0005\u0007"+
		"\u0000\u0000PR\u0003\u0010\b\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u000f"+
		"\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\b\u0000\u0000"+
		"WX\u0005\u001c\u0000\u0000XY\u0005\t\u0000\u0000YZ\u0003\u0014\n\u0000"+
		"Z[\u0005\n\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u000b\u0000"+
		"\u0000]z\u0001\u0000\u0000\u0000^_\u0005\f\u0000\u0000_`\u0003\u0014\n"+
		"\u0000`a\u0005\n\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0005\u000b\u0000"+
		"\u0000cz\u0001\u0000\u0000\u0000de\u0005\r\u0000\u0000ef\u0003\u0014\n"+
		"\u0000fg\u0005\n\u0000\u0000gh\u0003\u000e\u0007\u0000hi\u0005\u000b\u0000"+
		"\u0000iz\u0001\u0000\u0000\u0000jk\u0005\u000e\u0000\u0000kl\u0003\u0014"+
		"\n\u0000lm\u0005\u000f\u0000\u0000mp\u0003\u000e\u0007\u0000no\u0005\u0010"+
		"\u0000\u0000oq\u0003\u000e\u0007\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0011\u0000\u0000"+
		"sz\u0001\u0000\u0000\u0000tz\u0005\u0012\u0000\u0000uv\u0003\n\u0005\u0000"+
		"vw\u0005\u0013\u0000\u0000wx\u0003\f\u0006\u0000xz\u0001\u0000\u0000\u0000"+
		"yV\u0001\u0000\u0000\u0000y^\u0001\u0000\u0000\u0000yd\u0001\u0000\u0000"+
		"\u0000yj\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001\u0000"+
		"\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0005\u0014\u0000\u0000"+
		"|~\u0005\u001d\u0000\u0000}\u007f\u0003\u0016\u000b\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u009b\u0005\u0015\u0000\u0000\u0081\u0082\u0005\u0014\u0000"+
		"\u0000\u0082\u0083\u0005\u0016\u0000\u0000\u0083\u0084\u0003\u0012\t\u0000"+
		"\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u009b\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000"+
		"\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a"+
		"\u009b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0014\u0000\u0000\u008c"+
		"\u008e\u0005\u0018\u0000\u0000\u008d\u008f\u0003\u0016\u000b\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u009b\u0005\u0015\u0000\u0000\u0091"+
		"\u0092\u0005\u0014\u0000\u0000\u0092\u0094\u0005\u0019\u0000\u0000\u0093"+
		"\u0095\u0003\u0016\u000b\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u009b\u0005\u0015\u0000\u0000\u0097\u009b\u0005\u001a\u0000\u0000\u0098"+
		"\u009b\u0005\u001c\u0000\u0000\u0099\u009b\u0005\u001d\u0000\u0000\u009a"+
		"{\u0001\u0000\u0000\u0000\u009a\u0081\u0001\u0000\u0000\u0000\u009a\u0086"+
		"\u0001\u0000\u0000\u0000\u009a\u008b\u0001\u0000\u0000\u0000\u009a\u0091"+
		"\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0013"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0003\u0012\t\u0000\u009d\u009e\u0005"+
		"\u001b\u0000\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0015\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0003\u0012\t\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0017\u0001\u0000\u0000"+
		"\u0000\u000f\u001b14;CKSpy~\u008e\u0094\u009a\u009f\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}