// $ANTLR 3.5.1 C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g 2025-01-22 03:04:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileCompilerParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Dec", "Maj", "Min", "N_Affectation", 
		"N_Call", "N_Command", "N_Commands", "N_Cons", "N_Definition", "N_Else", 
		"N_Expr_base", "N_Expression", "N_Exprs", "N_For", "N_Foreach", "N_Function", 
		"N_Hd", "N_If", "N_Input", "N_List", "N_Nil", "N_Nope", "N_Output", "N_Program", 
		"N_Symbol", "N_Tl", "N_Variable", "N_Vars", "N_While", "Symbol", "Variable", 
		"WS", "'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons '", 
		"'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", 
		"'hd '", "'if'", "'in'", "'list '", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl '", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int Dec=4;
	public static final int Maj=5;
	public static final int Min=6;
	public static final int N_Affectation=7;
	public static final int N_Call=8;
	public static final int N_Command=9;
	public static final int N_Commands=10;
	public static final int N_Cons=11;
	public static final int N_Definition=12;
	public static final int N_Else=13;
	public static final int N_Expr_base=14;
	public static final int N_Expression=15;
	public static final int N_Exprs=16;
	public static final int N_For=17;
	public static final int N_Foreach=18;
	public static final int N_Function=19;
	public static final int N_Hd=20;
	public static final int N_If=21;
	public static final int N_Input=22;
	public static final int N_List=23;
	public static final int N_Nil=24;
	public static final int N_Nope=25;
	public static final int N_Output=26;
	public static final int N_Program=27;
	public static final int N_Symbol=28;
	public static final int N_Tl=29;
	public static final int N_Variable=30;
	public static final int N_Vars=31;
	public static final int N_While=32;
	public static final int Symbol=33;
	public static final int Variable=34;
	public static final int WS=35;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "lexpr", "inputSub", "expression", "exprs", "definition", 
		"function", "command", "vars", "output", "exprBase", "input", "commands", 
		"program"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public WhileCompilerParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public WhileCompilerParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public WhileCompilerParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return WhileCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:1: program : ( WS )* ( function ( WS )* )+ -> ^( N_Program ( function )+ ) ;
	public final WhileCompilerParser.program_return program() throws RecognitionException {
		WhileCompilerParser.program_return retval = new WhileCompilerParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS1=null;
		Token WS3=null;
		ParserRuleReturnScope function2 =null;

		Object WS1_tree=null;
		Object WS3_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:8: ( ( WS )* ( function ( WS )* )+ -> ^( N_Program ( function )+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:10: ( WS )* ( function ( WS )* )+
			{
			dbg.location(50,10);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:10: ( WS )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:10: WS
					{
					dbg.location(50,10);
					WS1=(Token)match(input,WS,FOLLOW_WS_in_program310);  
					stream_WS.add(WS1);

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(50,14);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:14: ( function ( WS )* )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==51) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:15: function ( WS )*
					{
					dbg.location(50,15);
					pushFollow(FOLLOW_function_in_program314);
					function2=function();
					state._fsp--;

					stream_function.add(function2.getTree());dbg.location(50,24);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:24: ( WS )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==WS) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:24: WS
							{
							dbg.location(50,24);
							WS3=(Token)match(input,WS,FOLLOW_WS_in_program316);  
							stream_WS.add(WS3);

							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 50:30: -> ^( N_Program ( function )+ )
			{
				dbg.location(50,33);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:33: ^( N_Program ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(50,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Program, "N_Program"), root_1);
				dbg.location(50,45);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					dbg.location(50,45);
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 54);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:1: function : 'function' WS Symbol ( WS )? ':' WS definition -> ^( N_Function Symbol definition ) ;
	public final WhileCompilerParser.function_return function() throws RecognitionException {
		WhileCompilerParser.function_return retval = new WhileCompilerParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal4=null;
		Token WS5=null;
		Token Symbol6=null;
		Token WS7=null;
		Token char_literal8=null;
		Token WS9=null;
		ParserRuleReturnScope definition10 =null;

		Object string_literal4_tree=null;
		Object WS5_tree=null;
		Object Symbol6_tree=null;
		Object WS7_tree=null;
		Object char_literal8_tree=null;
		Object WS9_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:9: ( 'function' WS Symbol ( WS )? ':' WS definition -> ^( N_Function Symbol definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:10: 'function' WS Symbol ( WS )? ':' WS definition
			{
			dbg.location(51,10);
			string_literal4=(Token)match(input,51,FOLLOW_51_in_function333);  
			stream_51.add(string_literal4);
			dbg.location(51,21);
			WS5=(Token)match(input,WS,FOLLOW_WS_in_function335);  
			stream_WS.add(WS5);
			dbg.location(51,24);
			Symbol6=(Token)match(input,Symbol,FOLLOW_Symbol_in_function337);  
			stream_Symbol.add(Symbol6);
			dbg.location(51,31);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:31: ( WS )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:31: WS
					{
					dbg.location(51,31);
					WS7=(Token)match(input,WS,FOLLOW_WS_in_function339);  
					stream_WS.add(WS7);

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(51,35);
			char_literal8=(Token)match(input,40,FOLLOW_40_in_function342);  
			stream_40.add(char_literal8);
			dbg.location(51,39);
			WS9=(Token)match(input,WS,FOLLOW_WS_in_function344);  
			stream_WS.add(WS9);
			dbg.location(51,42);
			pushFollow(FOLLOW_definition_in_function346);
			definition10=definition();
			state._fsp--;

			stream_definition.add(definition10.getTree());
			// AST REWRITE
			// elements: definition, Symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:52: -> ^( N_Function Symbol definition )
			{
				dbg.location(51,55);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:51:55: ^( N_Function Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(51,57);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Function, "N_Function"), root_1);
				dbg.location(51,68);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(51,75);
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 85);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:1: definition : 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) ) ;
	public final WhileCompilerParser.definition_return definition() throws RecognitionException {
		WhileCompilerParser.definition_return retval = new WhileCompilerParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal11=null;
		Token WS12=null;
		Token WS14=null;
		Token char_literal15=null;
		Token WS16=null;
		Token WS18=null;
		Token char_literal19=null;
		Token WS20=null;
		Token string_literal21=null;
		ParserRuleReturnScope input13 =null;
		ParserRuleReturnScope commands17 =null;
		ParserRuleReturnScope output22 =null;

		Object string_literal11_tree=null;
		Object WS12_tree=null;
		Object WS14_tree=null;
		Object char_literal15_tree=null;
		Object WS16_tree=null;
		Object WS18_tree=null;
		Object char_literal19_tree=null;
		Object WS20_tree=null;
		Object string_literal21_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:11: ( 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:12: 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output
			{
			dbg.location(52,12);
			string_literal11=(Token)match(input,60,FOLLOW_60_in_definition360);  
			stream_60.add(string_literal11);
			dbg.location(52,19);
			WS12=(Token)match(input,WS,FOLLOW_WS_in_definition362);  
			stream_WS.add(WS12);
			dbg.location(52,22);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:22: ( input WS )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= Variable && LA5_0 <= WS)) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:23: input WS
					{
					dbg.location(52,23);
					pushFollow(FOLLOW_input_in_definition365);
					input13=input();
					state._fsp--;

					stream_input.add(input13.getTree());dbg.location(52,29);
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition367);  
					stream_WS.add(WS14);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(52,34);
			char_literal15=(Token)match(input,36,FOLLOW_36_in_definition371);  
			stream_36.add(char_literal15);
			dbg.location(52,38);
			WS16=(Token)match(input,WS,FOLLOW_WS_in_definition373);  
			stream_WS.add(WS16);
			dbg.location(52,41);
			pushFollow(FOLLOW_commands_in_definition375);
			commands17=commands();
			state._fsp--;

			stream_commands.add(commands17.getTree());dbg.location(52,50);
			WS18=(Token)match(input,WS,FOLLOW_WS_in_definition377);  
			stream_WS.add(WS18);
			dbg.location(52,53);
			char_literal19=(Token)match(input,36,FOLLOW_36_in_definition379);  
			stream_36.add(char_literal19);
			dbg.location(52,57);
			WS20=(Token)match(input,WS,FOLLOW_WS_in_definition381);  
			stream_WS.add(WS20);
			dbg.location(52,60);
			string_literal21=(Token)match(input,64,FOLLOW_64_in_definition383);  
			stream_64.add(string_literal21);
			dbg.location(52,68);
			pushFollow(FOLLOW_output_in_definition385);
			output22=output();
			state._fsp--;

			stream_output.add(output22.getTree());
			// AST REWRITE
			// elements: input, output, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:75: -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) )
			{
				dbg.location(52,78);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:78: ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(52,80);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Definition, "N_Definition"), root_1);
				dbg.location(52,93);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:93: ( input )?
				if ( stream_input.hasNext() ) {
					dbg.location(52,93);
					adaptor.addChild(root_1, stream_input.nextTree());
				}
				stream_input.reset();
				dbg.location(52,100);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:100: ^( N_Commands commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(52,102);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
				dbg.location(52,113);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(52,123);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:123: ^( N_Output output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(52,125);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Output, "N_Output"), root_2);
				dbg.location(52,134);
				adaptor.addChild(root_2, stream_output.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 141);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:1: inputSub : ( ( ( WS )? Variable ( WS )? ',' inputSub ) -> Variable inputSub | ( WS )? Variable -> Variable );
	public final WhileCompilerParser.inputSub_return inputSub() throws RecognitionException {
		WhileCompilerParser.inputSub_return retval = new WhileCompilerParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS23=null;
		Token Variable24=null;
		Token WS25=null;
		Token char_literal26=null;
		Token WS28=null;
		Token Variable29=null;
		ParserRuleReturnScope inputSub27 =null;

		Object WS23_tree=null;
		Object Variable24_tree=null;
		Object WS25_tree=null;
		Object char_literal26_tree=null;
		Object WS28_tree=null;
		Object Variable29_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:9: ( ( ( WS )? Variable ( WS )? ',' inputSub ) -> Variable inputSub | ( WS )? Variable -> Variable )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==WS) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==Variable) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==WS) ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3==39) ) {
							alt9=1;
						}
						else if ( (LA9_3==36) ) {
							alt9=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA9_2==39) ) {
						alt9=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA9_0==Variable) ) {
				int LA9_2 = input.LA(2);
				if ( (LA9_2==WS) ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3==39) ) {
						alt9=1;
					}
					else if ( (LA9_3==36) ) {
						alt9=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA9_2==39) ) {
					alt9=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:11: ( ( WS )? Variable ( WS )? ',' inputSub )
					{
					dbg.location(55,11);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:11: ( ( WS )? Variable ( WS )? ',' inputSub )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:12: ( WS )? Variable ( WS )? ',' inputSub
					{
					dbg.location(55,12);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:12: ( WS )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==WS) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:12: WS
							{
							dbg.location(55,12);
							WS23=(Token)match(input,WS,FOLLOW_WS_in_inputSub415);  
							stream_WS.add(WS23);

							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(55,16);
					Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub418);  
					stream_Variable.add(Variable24);
					dbg.location(55,25);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:25: ( WS )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==WS) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:25: WS
							{
							dbg.location(55,25);
							WS25=(Token)match(input,WS,FOLLOW_WS_in_inputSub420);  
							stream_WS.add(WS25);

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(55,29);
					char_literal26=(Token)match(input,39,FOLLOW_39_in_inputSub423);  
					stream_39.add(char_literal26);
					dbg.location(55,33);
					pushFollow(FOLLOW_inputSub_in_inputSub425);
					inputSub27=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub27.getTree());
					}

					// AST REWRITE
					// elements: Variable, inputSub
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:43: -> Variable inputSub
					{
						dbg.location(55,46);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(55,55);
						adaptor.addChild(root_0, stream_inputSub.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:66: ( WS )? Variable
					{
					dbg.location(55,66);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:66: ( WS )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( (LA8_0==WS) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:66: WS
							{
							dbg.location(55,66);
							WS28=(Token)match(input,WS,FOLLOW_WS_in_inputSub436);  
							stream_WS.add(WS28);

							}
							break;

					}
					} finally {dbg.exitSubRule(8);}
					dbg.location(55,70);
					Variable29=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub439);  
					stream_Variable.add(Variable29);

					// AST REWRITE
					// elements: Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:79: -> Variable
					{
						dbg.location(55,82);
						adaptor.addChild(root_0, stream_Variable.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 89);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inputSub"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:1: input : ( inputSub )? -> ^( N_Input ( inputSub )? ) ;
	public final WhileCompilerParser.input_return input() throws RecognitionException {
		WhileCompilerParser.input_return retval = new WhileCompilerParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub30 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:6: ( ( inputSub )? -> ^( N_Input ( inputSub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:8: ( inputSub )?
			{
			dbg.location(56,8);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:8: ( inputSub )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==WS) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==Variable) ) {
					alt10=1;
				}
			}
			else if ( (LA10_0==Variable) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:8: inputSub
					{
					dbg.location(56,8);
					pushFollow(FOLLOW_inputSub_in_input449);
					inputSub30=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub30.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			// AST REWRITE
			// elements: inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:18: -> ^( N_Input ( inputSub )? )
			{
				dbg.location(56,21);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:21: ^( N_Input ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(56,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Input, "N_Input"), root_1);
				dbg.location(56,31);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:56:31: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(56,31);
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:1: output : ( ( ( WS )? Variable ( WS )? ',' output ) -> Variable output | ( WS )? Variable -> Variable );
	public final WhileCompilerParser.output_return output() throws RecognitionException {
		WhileCompilerParser.output_return retval = new WhileCompilerParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS31=null;
		Token Variable32=null;
		Token WS33=null;
		Token char_literal34=null;
		Token WS36=null;
		Token Variable37=null;
		ParserRuleReturnScope output35 =null;

		Object WS31_tree=null;
		Object Variable32_tree=null;
		Object WS33_tree=null;
		Object char_literal34_tree=null;
		Object WS36_tree=null;
		Object Variable37_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:7: ( ( ( WS )? Variable ( WS )? ',' output ) -> Variable output | ( WS )? Variable -> Variable )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==WS) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==Variable) ) {
					switch ( input.LA(3) ) {
					case WS:
						{
						int LA14_3 = input.LA(4);
						if ( (LA14_3==39) ) {
							alt14=1;
						}
						else if ( (LA14_3==EOF||LA14_3==WS||LA14_3==51) ) {
							alt14=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 14, 3, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 39:
						{
						alt14=1;
						}
						break;
					case EOF:
					case 51:
						{
						alt14=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA14_0==Variable) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA14_3 = input.LA(3);
					if ( (LA14_3==39) ) {
						alt14=1;
					}
					else if ( (LA14_3==EOF||LA14_3==WS||LA14_3==51) ) {
						alt14=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 39:
					{
					alt14=1;
					}
					break;
				case EOF:
				case 51:
					{
					alt14=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:9: ( ( WS )? Variable ( WS )? ',' output )
					{
					dbg.location(58,9);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:9: ( ( WS )? Variable ( WS )? ',' output )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:10: ( WS )? Variable ( WS )? ',' output
					{
					dbg.location(58,10);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:10: ( WS )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==WS) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:10: WS
							{
							dbg.location(58,10);
							WS31=(Token)match(input,WS,FOLLOW_WS_in_output467);  
							stream_WS.add(WS31);

							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(58,14);
					Variable32=(Token)match(input,Variable,FOLLOW_Variable_in_output470);  
					stream_Variable.add(Variable32);
					dbg.location(58,23);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:23: ( WS )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==WS) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:23: WS
							{
							dbg.location(58,23);
							WS33=(Token)match(input,WS,FOLLOW_WS_in_output472);  
							stream_WS.add(WS33);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(58,27);
					char_literal34=(Token)match(input,39,FOLLOW_39_in_output475);  
					stream_39.add(char_literal34);
					dbg.location(58,31);
					pushFollow(FOLLOW_output_in_output477);
					output35=output();
					state._fsp--;

					stream_output.add(output35.getTree());
					}

					// AST REWRITE
					// elements: Variable, output
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:39: -> Variable output
					{
						dbg.location(58,42);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(58,51);
						adaptor.addChild(root_0, stream_output.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:60: ( WS )? Variable
					{
					dbg.location(58,60);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:60: ( WS )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==WS) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:58:60: WS
							{
							dbg.location(58,60);
							WS36=(Token)match(input,WS,FOLLOW_WS_in_output488);  
							stream_WS.add(WS36);

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(58,64);
					Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_output491);  
					stream_Variable.add(Variable37);

					// AST REWRITE
					// elements: Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:73: -> Variable
					{
						dbg.location(58,76);
						adaptor.addChild(root_0, stream_Variable.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 83);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:1: commands : ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )? -> ( command )+ ;
	public final WhileCompilerParser.commands_return commands() throws RecognitionException {
		WhileCompilerParser.commands_return retval = new WhileCompilerParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS38=null;
		Token WS40=null;
		Token char_literal41=null;
		Token WS42=null;
		Token char_literal44=null;
		ParserRuleReturnScope command39 =null;
		ParserRuleReturnScope command43 =null;

		Object WS38_tree=null;
		Object WS40_tree=null;
		Object char_literal41_tree=null;
		Object WS42_tree=null;
		Object char_literal44_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:9: ( ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )? -> ( command )+ )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:10: ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )?
			{
			dbg.location(60,10);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:10: ( WS )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:10: WS
					{
					dbg.location(60,10);
					WS38=(Token)match(input,WS,FOLLOW_WS_in_commands502);  
					stream_WS.add(WS38);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(60,14);
			pushFollow(FOLLOW_command_in_commands505);
			command39=command();
			state._fsp--;

			stream_command.add(command39.getTree());dbg.location(60,22);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:22: ( ( WS )? ';' ( WS )? command )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==42) ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1==WS) ) {
						int LA18_3 = input.LA(3);
						if ( (LA18_3==Variable||(LA18_3 >= 49 && LA18_3 <= 50)||LA18_3==53||LA18_3==58||LA18_3==63) ) {
							alt18=1;
						}

					}
					else if ( (LA18_1==Variable||(LA18_1 >= 49 && LA18_1 <= 50)||LA18_1==53||LA18_1==58||LA18_1==63) ) {
						alt18=1;
					}

				}
				else if ( (LA18_0==WS) ) {
					int LA18_2 = input.LA(2);
					if ( (LA18_2==42) ) {
						alt18=1;
					}

				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:23: ( WS )? ';' ( WS )? command
					{
					dbg.location(60,23);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:23: ( WS )?
					int alt16=2;
					try { dbg.enterSubRule(16);
					try { dbg.enterDecision(16, decisionCanBacktrack[16]);

					int LA16_0 = input.LA(1);
					if ( (LA16_0==WS) ) {
						alt16=1;
					}
					} finally {dbg.exitDecision(16);}

					switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:23: WS
							{
							dbg.location(60,23);
							WS40=(Token)match(input,WS,FOLLOW_WS_in_commands508);  
							stream_WS.add(WS40);

							}
							break;

					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(60,27);
					char_literal41=(Token)match(input,42,FOLLOW_42_in_commands511);  
					stream_42.add(char_literal41);
					dbg.location(60,31);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:31: ( WS )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==WS) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:31: WS
							{
							dbg.location(60,31);
							WS42=(Token)match(input,WS,FOLLOW_WS_in_commands513);  
							stream_WS.add(WS42);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(60,35);
					pushFollow(FOLLOW_command_in_commands516);
					command43=command();
					state._fsp--;

					stream_command.add(command43.getTree());
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(60,45);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:45: ( ';' )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==42) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:60:46: ';'
					{
					dbg.location(60,46);
					char_literal44=(Token)match(input,42,FOLLOW_42_in_commands521);  
					stream_42.add(char_literal44);

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:52: -> ( command )+
			{
				dbg.location(60,55);
				if ( !(stream_command.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_command.hasNext() ) {
					dbg.location(60,55);
					adaptor.addChild(root_0, stream_command.nextTree());
				}
				stream_command.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 62);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:62:1: command : ( 'nop' -> N_Nope | ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) ) | ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' ) -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? ) | ( 'while' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_While expression ^( N_Commands commands ) ) | ( 'for' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_For expression ^( N_Commands commands ) ) | ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_Foreach Variable expression ^( N_Commands commands ) ) );
	public final WhileCompilerParser.command_return command() throws RecognitionException {
		WhileCompilerParser.command_return retval = new WhileCompilerParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		Token WS47=null;
		Token string_literal48=null;
		Token WS49=null;
		Token string_literal51=null;
		Token WS52=null;
		Token WS54=null;
		Token string_literal55=null;
		Token WS56=null;
		Token WS58=null;
		Token WS59=null;
		Token string_literal60=null;
		Token WS61=null;
		Token WS63=null;
		Token string_literal64=null;
		Token string_literal65=null;
		Token WS66=null;
		Token WS68=null;
		Token string_literal69=null;
		Token WS70=null;
		Token WS72=null;
		Token string_literal73=null;
		Token string_literal74=null;
		Token WS75=null;
		Token WS77=null;
		Token string_literal78=null;
		Token WS79=null;
		Token WS81=null;
		Token string_literal82=null;
		Token string_literal83=null;
		Token WS84=null;
		Token Variable85=null;
		Token WS86=null;
		Token string_literal87=null;
		Token WS88=null;
		Token WS90=null;
		Token string_literal91=null;
		Token WS92=null;
		Token WS94=null;
		Token string_literal95=null;
		ParserRuleReturnScope vars46 =null;
		ParserRuleReturnScope exprs50 =null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope commands57 =null;
		ParserRuleReturnScope commands62 =null;
		ParserRuleReturnScope expression67 =null;
		ParserRuleReturnScope commands71 =null;
		ParserRuleReturnScope expression76 =null;
		ParserRuleReturnScope commands80 =null;
		ParserRuleReturnScope expression89 =null;
		ParserRuleReturnScope commands93 =null;

		Object string_literal45_tree=null;
		Object WS47_tree=null;
		Object string_literal48_tree=null;
		Object WS49_tree=null;
		Object string_literal51_tree=null;
		Object WS52_tree=null;
		Object WS54_tree=null;
		Object string_literal55_tree=null;
		Object WS56_tree=null;
		Object WS58_tree=null;
		Object WS59_tree=null;
		Object string_literal60_tree=null;
		Object WS61_tree=null;
		Object WS63_tree=null;
		Object string_literal64_tree=null;
		Object string_literal65_tree=null;
		Object WS66_tree=null;
		Object WS68_tree=null;
		Object string_literal69_tree=null;
		Object WS70_tree=null;
		Object WS72_tree=null;
		Object string_literal73_tree=null;
		Object string_literal74_tree=null;
		Object WS75_tree=null;
		Object WS77_tree=null;
		Object string_literal78_tree=null;
		Object WS79_tree=null;
		Object WS81_tree=null;
		Object string_literal82_tree=null;
		Object string_literal83_tree=null;
		Object WS84_tree=null;
		Object Variable85_tree=null;
		Object WS86_tree=null;
		Object string_literal87_tree=null;
		Object WS88_tree=null;
		Object WS90_tree=null;
		Object string_literal91_tree=null;
		Object WS92_tree=null;
		Object WS94_tree=null;
		Object string_literal95_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:62:8: ( 'nop' -> N_Nope | ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) ) | ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' ) -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? ) | ( 'while' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_While expression ^( N_Commands commands ) ) | ( 'for' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_For expression ^( N_Commands commands ) ) | ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_Foreach Variable expression ^( N_Commands commands ) ) )
			int alt24=6;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case 58:
				{
				alt24=1;
				}
				break;
			case Variable:
				{
				alt24=2;
				}
				break;
			case 53:
				{
				alt24=3;
				}
				break;
			case 63:
				{
				alt24=4;
				}
				break;
			case 49:
				{
				alt24=5;
				}
				break;
			case 50:
				{
				alt24=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:62:9: 'nop'
					{
					dbg.location(62,9);
					string_literal45=(Token)match(input,58,FOLLOW_58_in_command534);  
					stream_58.add(string_literal45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:15: -> N_Nope
					{
						dbg.location(62,18);
						adaptor.addChild(root_0, (Object)adaptor.create(N_Nope, "N_Nope"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:4: ( vars ( WS )? ':=' ( WS )? exprs )
					{
					dbg.location(63,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:4: ( vars ( WS )? ':=' ( WS )? exprs )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:5: vars ( WS )? ':=' ( WS )? exprs
					{
					dbg.location(63,5);
					pushFollow(FOLLOW_vars_in_command544);
					vars46=vars();
					state._fsp--;

					stream_vars.add(vars46.getTree());dbg.location(63,10);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:10: ( WS )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==WS) ) {
						alt20=1;
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:10: WS
							{
							dbg.location(63,10);
							WS47=(Token)match(input,WS,FOLLOW_WS_in_command546);  
							stream_WS.add(WS47);

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(63,14);
					string_literal48=(Token)match(input,41,FOLLOW_41_in_command549);  
					stream_41.add(string_literal48);
					dbg.location(63,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:19: ( WS )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==WS) ) {
						alt21=1;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:19: WS
							{
							dbg.location(63,19);
							WS49=(Token)match(input,WS,FOLLOW_WS_in_command551);  
							stream_WS.add(WS49);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(63,23);
					pushFollow(FOLLOW_exprs_in_command554);
					exprs50=exprs();
					state._fsp--;

					stream_exprs.add(exprs50.getTree());
					}

					// AST REWRITE
					// elements: vars, exprs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 63:30: -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) )
					{
						dbg.location(63,33);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:33: ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(63,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Affectation, "N_Affectation"), root_1);
						dbg.location(63,49);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:49: ^( N_Vars vars )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(63,51);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Vars, "N_Vars"), root_2);
						dbg.location(63,58);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,64);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:64: ^( N_Exprs exprs )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(63,66);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Exprs, "N_Exprs"), root_2);
						dbg.location(63,74);
						adaptor.addChild(root_2, stream_exprs.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:4: ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' )
					{
					dbg.location(64,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:4: ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:5: 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi'
					{
					dbg.location(64,5);
					string_literal51=(Token)match(input,53,FOLLOW_53_in_command579);  
					stream_53.add(string_literal51);
					dbg.location(64,10);
					WS52=(Token)match(input,WS,FOLLOW_WS_in_command581);  
					stream_WS.add(WS52);
					dbg.location(64,13);
					pushFollow(FOLLOW_expression_in_command583);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());dbg.location(64,24);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_command585);  
					stream_WS.add(WS54);
					dbg.location(64,27);
					string_literal55=(Token)match(input,61,FOLLOW_61_in_command587);  
					stream_61.add(string_literal55);
					dbg.location(64,34);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_command589);  
					stream_WS.add(WS56);
					dbg.location(64,37);
					pushFollow(FOLLOW_commands_in_command591);
					commands57=commands();
					state._fsp--;

					stream_commands.add(commands57.getTree());dbg.location(64,46);
					WS58=(Token)match(input,WS,FOLLOW_WS_in_command593);  
					stream_WS.add(WS58);
					dbg.location(64,48);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:48: ( ( WS )? 'else' WS commands WS )?
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS||LA23_0==47) ) {
						alt23=1;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:49: ( WS )? 'else' WS commands WS
							{
							dbg.location(64,49);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:49: ( WS )?
							int alt22=2;
							try { dbg.enterSubRule(22);
							try { dbg.enterDecision(22, decisionCanBacktrack[22]);

							int LA22_0 = input.LA(1);
							if ( (LA22_0==WS) ) {
								alt22=1;
							}
							} finally {dbg.exitDecision(22);}

							switch (alt22) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:49: WS
									{
									dbg.location(64,49);
									WS59=(Token)match(input,WS,FOLLOW_WS_in_command595);  
									stream_WS.add(WS59);

									}
									break;

							}
							} finally {dbg.exitSubRule(22);}
							dbg.location(64,53);
							string_literal60=(Token)match(input,47,FOLLOW_47_in_command598);  
							stream_47.add(string_literal60);
							dbg.location(64,59);
							WS61=(Token)match(input,WS,FOLLOW_WS_in_command599);  
							stream_WS.add(WS61);
							dbg.location(64,62);
							pushFollow(FOLLOW_commands_in_command601);
							commands62=commands();
							state._fsp--;

							stream_commands.add(commands62.getTree());dbg.location(64,71);
							WS63=(Token)match(input,WS,FOLLOW_WS_in_command603);  
							stream_WS.add(WS63);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(64,76);
					string_literal64=(Token)match(input,48,FOLLOW_48_in_command607);  
					stream_48.add(string_literal64);

					}

					// AST REWRITE
					// elements: expression, commands, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:82: -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? )
					{
						dbg.location(64,85);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:85: ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(64,87);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_If, "N_If"), root_1);
						dbg.location(64,92);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(64,103);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:103: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(64,105);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(64,116);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(64,126);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:126: ( ^( N_Else commands ) )?
						if ( stream_commands.hasNext() ) {
							dbg.location(64,126);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:126: ^( N_Else commands )
							{
							Object root_2 = (Object)adaptor.nil();
							dbg.location(64,128);
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Else, "N_Else"), root_2);
							dbg.location(64,135);
							adaptor.addChild(root_2, stream_commands.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_commands.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:65:4: ( 'while' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(65,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:65:4: ( 'while' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:65:5: 'while' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(65,5);
					string_literal65=(Token)match(input,63,FOLLOW_63_in_command635);  
					stream_63.add(string_literal65);
					dbg.location(65,13);
					WS66=(Token)match(input,WS,FOLLOW_WS_in_command637);  
					stream_WS.add(WS66);
					dbg.location(65,16);
					pushFollow(FOLLOW_expression_in_command639);
					expression67=expression();
					state._fsp--;

					stream_expression.add(expression67.getTree());dbg.location(65,27);
					WS68=(Token)match(input,WS,FOLLOW_WS_in_command641);  
					stream_WS.add(WS68);
					dbg.location(65,30);
					string_literal69=(Token)match(input,46,FOLLOW_46_in_command643);  
					stream_46.add(string_literal69);
					dbg.location(65,35);
					WS70=(Token)match(input,WS,FOLLOW_WS_in_command645);  
					stream_WS.add(WS70);
					dbg.location(65,38);
					pushFollow(FOLLOW_commands_in_command647);
					commands71=commands();
					state._fsp--;

					stream_commands.add(commands71.getTree());dbg.location(65,47);
					WS72=(Token)match(input,WS,FOLLOW_WS_in_command649);  
					stream_WS.add(WS72);
					dbg.location(65,50);
					string_literal73=(Token)match(input,59,FOLLOW_59_in_command651);  
					stream_59.add(string_literal73);

					}

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:56: -> ^( N_While expression ^( N_Commands commands ) )
					{
						dbg.location(65,59);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:65:59: ^( N_While expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(65,61);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_While, "N_While"), root_1);
						dbg.location(65,69);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(65,80);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:65:80: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(65,82);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(65,93);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:4: ( 'for' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(66,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:4: ( 'for' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:5: 'for' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(66,5);
					string_literal74=(Token)match(input,49,FOLLOW_49_in_command672);  
					stream_49.add(string_literal74);
					dbg.location(66,11);
					WS75=(Token)match(input,WS,FOLLOW_WS_in_command674);  
					stream_WS.add(WS75);
					dbg.location(66,14);
					pushFollow(FOLLOW_expression_in_command676);
					expression76=expression();
					state._fsp--;

					stream_expression.add(expression76.getTree());dbg.location(66,25);
					WS77=(Token)match(input,WS,FOLLOW_WS_in_command678);  
					stream_WS.add(WS77);
					dbg.location(66,28);
					string_literal78=(Token)match(input,46,FOLLOW_46_in_command680);  
					stream_46.add(string_literal78);
					dbg.location(66,33);
					WS79=(Token)match(input,WS,FOLLOW_WS_in_command682);  
					stream_WS.add(WS79);
					dbg.location(66,36);
					pushFollow(FOLLOW_commands_in_command684);
					commands80=commands();
					state._fsp--;

					stream_commands.add(commands80.getTree());dbg.location(66,45);
					WS81=(Token)match(input,WS,FOLLOW_WS_in_command686);  
					stream_WS.add(WS81);
					dbg.location(66,48);
					string_literal82=(Token)match(input,59,FOLLOW_59_in_command688);  
					stream_59.add(string_literal82);

					}

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:54: -> ^( N_For expression ^( N_Commands commands ) )
					{
						dbg.location(66,57);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:57: ^( N_For expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(66,59);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_For, "N_For"), root_1);
						dbg.location(66,65);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(66,76);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:76: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(66,78);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(66,89);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:4: ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(67,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:4: ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:5: 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(67,5);
					string_literal83=(Token)match(input,50,FOLLOW_50_in_command709);  
					stream_50.add(string_literal83);
					dbg.location(67,15);
					WS84=(Token)match(input,WS,FOLLOW_WS_in_command711);  
					stream_WS.add(WS84);
					dbg.location(67,18);
					Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_command713);  
					stream_Variable.add(Variable85);
					dbg.location(67,27);
					WS86=(Token)match(input,WS,FOLLOW_WS_in_command715);  
					stream_WS.add(WS86);
					dbg.location(67,30);
					string_literal87=(Token)match(input,54,FOLLOW_54_in_command717);  
					stream_54.add(string_literal87);
					dbg.location(67,35);
					WS88=(Token)match(input,WS,FOLLOW_WS_in_command719);  
					stream_WS.add(WS88);
					dbg.location(67,38);
					pushFollow(FOLLOW_expression_in_command721);
					expression89=expression();
					state._fsp--;

					stream_expression.add(expression89.getTree());dbg.location(67,49);
					WS90=(Token)match(input,WS,FOLLOW_WS_in_command723);  
					stream_WS.add(WS90);
					dbg.location(67,52);
					string_literal91=(Token)match(input,46,FOLLOW_46_in_command725);  
					stream_46.add(string_literal91);
					dbg.location(67,57);
					WS92=(Token)match(input,WS,FOLLOW_WS_in_command727);  
					stream_WS.add(WS92);
					dbg.location(67,60);
					pushFollow(FOLLOW_commands_in_command729);
					commands93=commands();
					state._fsp--;

					stream_commands.add(commands93.getTree());dbg.location(67,69);
					WS94=(Token)match(input,WS,FOLLOW_WS_in_command731);  
					stream_WS.add(WS94);
					dbg.location(67,72);
					string_literal95=(Token)match(input,59,FOLLOW_59_in_command733);  
					stream_59.add(string_literal95);

					}

					// AST REWRITE
					// elements: expression, commands, Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:78: -> ^( N_Foreach Variable expression ^( N_Commands commands ) )
					{
						dbg.location(67,81);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:81: ^( N_Foreach Variable expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(67,83);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Foreach, "N_Foreach"), root_1);
						dbg.location(67,93);
						adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(67,102);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(67,113);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:113: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(67,115);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(67,126);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 135);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:1: vars : ( ( Variable ( WS )? ',' ( WS )? vars ) -> Variable vars | Variable -> Variable );
	public final WhileCompilerParser.vars_return vars() throws RecognitionException {
		WhileCompilerParser.vars_return retval = new WhileCompilerParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable96=null;
		Token WS97=null;
		Token char_literal98=null;
		Token WS99=null;
		Token Variable101=null;
		ParserRuleReturnScope vars100 =null;

		Object Variable96_tree=null;
		Object WS97_tree=null;
		Object char_literal98_tree=null;
		Object WS99_tree=null;
		Object Variable101_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:6: ( ( Variable ( WS )? ',' ( WS )? vars ) -> Variable vars | Variable -> Variable )
			int alt27=2;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==Variable) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA27_2 = input.LA(3);
					if ( (LA27_2==39) ) {
						alt27=1;
					}
					else if ( (LA27_2==41) ) {
						alt27=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 39:
					{
					alt27=1;
					}
					break;
				case 41:
					{
					alt27=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:7: ( Variable ( WS )? ',' ( WS )? vars )
					{
					dbg.location(69,7);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:7: ( Variable ( WS )? ',' ( WS )? vars )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:8: Variable ( WS )? ',' ( WS )? vars
					{
					dbg.location(69,8);
					Variable96=(Token)match(input,Variable,FOLLOW_Variable_in_vars758);  
					stream_Variable.add(Variable96);
					dbg.location(69,17);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:17: ( WS )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==WS) ) {
						alt25=1;
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:17: WS
							{
							dbg.location(69,17);
							WS97=(Token)match(input,WS,FOLLOW_WS_in_vars760);  
							stream_WS.add(WS97);

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(69,21);
					char_literal98=(Token)match(input,39,FOLLOW_39_in_vars763);  
					stream_39.add(char_literal98);
					dbg.location(69,25);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:25: ( WS )?
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==WS) ) {
						alt26=1;
					}
					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:25: WS
							{
							dbg.location(69,25);
							WS99=(Token)match(input,WS,FOLLOW_WS_in_vars765);  
							stream_WS.add(WS99);

							}
							break;

					}
					} finally {dbg.exitSubRule(26);}
					dbg.location(69,29);
					pushFollow(FOLLOW_vars_in_vars768);
					vars100=vars();
					state._fsp--;

					stream_vars.add(vars100.getTree());
					}

					// AST REWRITE
					// elements: vars, Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:35: -> Variable vars
					{
						dbg.location(69,38);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(69,47);
						adaptor.addChild(root_0, stream_vars.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:54: Variable
					{
					dbg.location(69,54);
					Variable101=(Token)match(input,Variable,FOLLOW_Variable_in_vars779);  
					stream_Variable.add(Variable101);

					// AST REWRITE
					// elements: Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:63: -> Variable
					{
						dbg.location(69,66);
						adaptor.addChild(root_0, stream_Variable.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 73);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:1: exprs : expression ( ( WS )? ',' ( WS )? expression )* -> ( expression )+ ;
	public final WhileCompilerParser.exprs_return exprs() throws RecognitionException {
		WhileCompilerParser.exprs_return retval = new WhileCompilerParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS103=null;
		Token char_literal104=null;
		Token WS105=null;
		ParserRuleReturnScope expression102 =null;
		ParserRuleReturnScope expression106 =null;

		Object WS103_tree=null;
		Object char_literal104_tree=null;
		Object WS105_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:6: ( expression ( ( WS )? ',' ( WS )? expression )* -> ( expression )+ )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:7: expression ( ( WS )? ',' ( WS )? expression )*
			{
			dbg.location(71,7);
			pushFollow(FOLLOW_expression_in_exprs789);
			expression102=expression();
			state._fsp--;

			stream_expression.add(expression102.getTree());dbg.location(71,18);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:18: ( ( WS )? ',' ( WS )? expression )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==39) ) {
						alt30=1;
					}

				}
				else if ( (LA30_0==39) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:19: ( WS )? ',' ( WS )? expression
					{
					dbg.location(71,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:19: ( WS )?
					int alt28=2;
					try { dbg.enterSubRule(28);
					try { dbg.enterDecision(28, decisionCanBacktrack[28]);

					int LA28_0 = input.LA(1);
					if ( (LA28_0==WS) ) {
						alt28=1;
					}
					} finally {dbg.exitDecision(28);}

					switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:19: WS
							{
							dbg.location(71,19);
							WS103=(Token)match(input,WS,FOLLOW_WS_in_exprs792);  
							stream_WS.add(WS103);

							}
							break;

					}
					} finally {dbg.exitSubRule(28);}
					dbg.location(71,23);
					char_literal104=(Token)match(input,39,FOLLOW_39_in_exprs795);  
					stream_39.add(char_literal104);
					dbg.location(71,27);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:27: ( WS )?
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==WS) ) {
						alt29=1;
					}
					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:27: WS
							{
							dbg.location(71,27);
							WS105=(Token)match(input,WS,FOLLOW_WS_in_exprs797);  
							stream_WS.add(WS105);

							}
							break;

					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(71,31);
					pushFollow(FOLLOW_expression_in_exprs800);
					expression106=expression();
					state._fsp--;

					stream_expression.add(expression106.getTree());
					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:44: -> ( expression )+
			{
				dbg.location(71,47);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					dbg.location(71,47);
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 57);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprs"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:1: expression : exprBase ( '=?' exprBase )? -> ^( N_Expression exprBase ( exprBase )? ) ;
	public final WhileCompilerParser.expression_return expression() throws RecognitionException {
		WhileCompilerParser.expression_return retval = new WhileCompilerParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal108=null;
		ParserRuleReturnScope exprBase107 =null;
		ParserRuleReturnScope exprBase109 =null;

		Object string_literal108_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:12: ( exprBase ( '=?' exprBase )? -> ^( N_Expression exprBase ( exprBase )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:14: exprBase ( '=?' exprBase )?
			{
			dbg.location(73,14);
			pushFollow(FOLLOW_exprBase_in_expression815);
			exprBase107=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase107.getTree());dbg.location(73,23);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:23: ( '=?' exprBase )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==43) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:24: '=?' exprBase
					{
					dbg.location(73,24);
					string_literal108=(Token)match(input,43,FOLLOW_43_in_expression818);  
					stream_43.add(string_literal108);
					dbg.location(73,29);
					pushFollow(FOLLOW_exprBase_in_expression820);
					exprBase109=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase109.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(31);}

			// AST REWRITE
			// elements: exprBase, exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:40: -> ^( N_Expression exprBase ( exprBase )? )
			{
				dbg.location(73,43);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:43: ^( N_Expression exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(73,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Expression, "N_Expression"), root_1);
				dbg.location(73,58);
				adaptor.addChild(root_1, stream_exprBase.nextTree());dbg.location(73,67);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:73:67: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
					dbg.location(73,67);
					adaptor.addChild(root_1, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:74:1: exprBase : ( 'nil' -> N_Nil | Variable -> ^( N_Variable Variable ) | Symbol -> ^( N_Symbol Symbol ) | '(' ( WS )? Symbol WS lexpr ')' -> ^( N_Call Symbol lexpr ) | '(' ( WS )? Symbol ')' -> ^( N_Call Symbol ) | '(' ( WS )? 'hd ' exprBase ( WS )? ')' -> ^( N_Hd exprBase ) | '(' ( WS )? 'tl ' exprBase ( WS )? ')' -> ^( N_Tl exprBase ) | '(' ( WS )? 'cons' ( WS )? ')' -> ^( N_Cons ) | '(' ( WS )? 'cons ' ( WS )? lexpr ')' -> ^( N_Cons lexpr ) | '(' ( WS )? 'list' ( WS )? ')' -> ^( N_List ) | '(' ( WS )? 'list ' ( WS )? lexpr ')' -> ^( N_List lexpr ) );
	public final WhileCompilerParser.exprBase_return exprBase() throws RecognitionException {
		WhileCompilerParser.exprBase_return retval = new WhileCompilerParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal110=null;
		Token Variable111=null;
		Token Symbol112=null;
		Token char_literal113=null;
		Token WS114=null;
		Token Symbol115=null;
		Token WS116=null;
		Token char_literal118=null;
		Token char_literal119=null;
		Token WS120=null;
		Token Symbol121=null;
		Token char_literal122=null;
		Token char_literal123=null;
		Token WS124=null;
		Token string_literal125=null;
		Token WS127=null;
		Token char_literal128=null;
		Token char_literal129=null;
		Token WS130=null;
		Token string_literal131=null;
		Token WS133=null;
		Token char_literal134=null;
		Token char_literal135=null;
		Token WS136=null;
		Token string_literal137=null;
		Token WS138=null;
		Token char_literal139=null;
		Token char_literal140=null;
		Token WS141=null;
		Token string_literal142=null;
		Token WS143=null;
		Token char_literal145=null;
		Token char_literal146=null;
		Token WS147=null;
		Token string_literal148=null;
		Token WS149=null;
		Token char_literal150=null;
		Token char_literal151=null;
		Token WS152=null;
		Token string_literal153=null;
		Token WS154=null;
		Token char_literal156=null;
		ParserRuleReturnScope lexpr117 =null;
		ParserRuleReturnScope exprBase126 =null;
		ParserRuleReturnScope exprBase132 =null;
		ParserRuleReturnScope lexpr144 =null;
		ParserRuleReturnScope lexpr155 =null;

		Object string_literal110_tree=null;
		Object Variable111_tree=null;
		Object Symbol112_tree=null;
		Object char_literal113_tree=null;
		Object WS114_tree=null;
		Object Symbol115_tree=null;
		Object WS116_tree=null;
		Object char_literal118_tree=null;
		Object char_literal119_tree=null;
		Object WS120_tree=null;
		Object Symbol121_tree=null;
		Object char_literal122_tree=null;
		Object char_literal123_tree=null;
		Object WS124_tree=null;
		Object string_literal125_tree=null;
		Object WS127_tree=null;
		Object char_literal128_tree=null;
		Object char_literal129_tree=null;
		Object WS130_tree=null;
		Object string_literal131_tree=null;
		Object WS133_tree=null;
		Object char_literal134_tree=null;
		Object char_literal135_tree=null;
		Object WS136_tree=null;
		Object string_literal137_tree=null;
		Object WS138_tree=null;
		Object char_literal139_tree=null;
		Object char_literal140_tree=null;
		Object WS141_tree=null;
		Object string_literal142_tree=null;
		Object WS143_tree=null;
		Object char_literal145_tree=null;
		Object char_literal146_tree=null;
		Object WS147_tree=null;
		Object string_literal148_tree=null;
		Object WS149_tree=null;
		Object char_literal150_tree=null;
		Object char_literal151_tree=null;
		Object WS152_tree=null;
		Object string_literal153_tree=null;
		Object WS154_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:74:9: ( 'nil' -> N_Nil | Variable -> ^( N_Variable Variable ) | Symbol -> ^( N_Symbol Symbol ) | '(' ( WS )? Symbol WS lexpr ')' -> ^( N_Call Symbol lexpr ) | '(' ( WS )? Symbol ')' -> ^( N_Call Symbol ) | '(' ( WS )? 'hd ' exprBase ( WS )? ')' -> ^( N_Hd exprBase ) | '(' ( WS )? 'tl ' exprBase ( WS )? ')' -> ^( N_Tl exprBase ) | '(' ( WS )? 'cons' ( WS )? ')' -> ^( N_Cons ) | '(' ( WS )? 'cons ' ( WS )? lexpr ')' -> ^( N_Cons lexpr ) | '(' ( WS )? 'list' ( WS )? ')' -> ^( N_List ) | '(' ( WS )? 'list ' ( WS )? lexpr ')' -> ^( N_List lexpr ) )
			int alt46=11;
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt46=1;
				}
				break;
			case Variable:
				{
				alt46=2;
				}
				break;
			case Symbol:
				{
				alt46=3;
				}
				break;
			case 37:
				{
				switch ( input.LA(2) ) {
				case WS:
					{
					switch ( input.LA(3) ) {
					case Symbol:
						{
						int LA46_6 = input.LA(4);
						if ( (LA46_6==WS) ) {
							alt46=4;
						}
						else if ( (LA46_6==38) ) {
							alt46=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 46, 6, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 52:
						{
						alt46=6;
						}
						break;
					case 62:
						{
						alt46=7;
						}
						break;
					case 45:
						{
						alt46=8;
						}
						break;
					case 44:
						{
						alt46=9;
						}
						break;
					case 56:
						{
						alt46=10;
						}
						break;
					case 55:
						{
						alt46=11;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 5, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Symbol:
					{
					int LA46_6 = input.LA(3);
					if ( (LA46_6==WS) ) {
						alt46=4;
					}
					else if ( (LA46_6==38) ) {
						alt46=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 6, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 52:
					{
					alt46=6;
					}
					break;
				case 62:
					{
					alt46=7;
					}
					break;
				case 45:
					{
					alt46=8;
					}
					break;
				case 44:
					{
					alt46=9;
					}
					break;
				case 56:
					{
					alt46=10;
					}
					break;
				case 55:
					{
					alt46=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:74:10: 'nil'
					{
					dbg.location(74,10);
					string_literal110=(Token)match(input,57,FOLLOW_57_in_exprBase838);  
					stream_57.add(string_literal110);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:16: -> N_Nil
					{
						dbg.location(74,19);
						adaptor.addChild(root_0, (Object)adaptor.create(N_Nil, "N_Nil"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:5: Variable
					{
					dbg.location(75,5);
					Variable111=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase848);  
					stream_Variable.add(Variable111);

					// AST REWRITE
					// elements: Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:14: -> ^( N_Variable Variable )
					{
						dbg.location(75,17);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:17: ^( N_Variable Variable )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(75,19);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Variable, "N_Variable"), root_1);
						dbg.location(75,30);
						adaptor.addChild(root_1, stream_Variable.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:76:5: Symbol
					{
					dbg.location(76,5);
					Symbol112=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase862);  
					stream_Symbol.add(Symbol112);

					// AST REWRITE
					// elements: Symbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:12: -> ^( N_Symbol Symbol )
					{
						dbg.location(76,15);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:76:15: ^( N_Symbol Symbol )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(76,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Symbol, "N_Symbol"), root_1);
						dbg.location(76,26);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:77:4: '(' ( WS )? Symbol WS lexpr ')'
					{
					dbg.location(77,4);
					char_literal113=(Token)match(input,37,FOLLOW_37_in_exprBase875);  
					stream_37.add(char_literal113);
					dbg.location(77,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:77:8: ( WS )?
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:77:8: WS
							{
							dbg.location(77,8);
							WS114=(Token)match(input,WS,FOLLOW_WS_in_exprBase877);  
							stream_WS.add(WS114);

							}
							break;

					}
					} finally {dbg.exitSubRule(32);}
					dbg.location(77,12);
					Symbol115=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase880);  
					stream_Symbol.add(Symbol115);
					dbg.location(77,19);
					WS116=(Token)match(input,WS,FOLLOW_WS_in_exprBase882);  
					stream_WS.add(WS116);
					dbg.location(77,22);
					pushFollow(FOLLOW_lexpr_in_exprBase884);
					lexpr117=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr117.getTree());dbg.location(77,27);
					char_literal118=(Token)match(input,38,FOLLOW_38_in_exprBase885);  
					stream_38.add(char_literal118);

					// AST REWRITE
					// elements: Symbol, lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:31: -> ^( N_Call Symbol lexpr )
					{
						dbg.location(77,34);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:77:34: ^( N_Call Symbol lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(77,36);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Call, "N_Call"), root_1);
						dbg.location(77,43);
						adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(77,50);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:78:4: '(' ( WS )? Symbol ')'
					{
					dbg.location(78,4);
					char_literal119=(Token)match(input,37,FOLLOW_37_in_exprBase900);  
					stream_37.add(char_literal119);
					dbg.location(78,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:78:8: ( WS )?
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					int LA33_0 = input.LA(1);
					if ( (LA33_0==WS) ) {
						alt33=1;
					}
					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:78:8: WS
							{
							dbg.location(78,8);
							WS120=(Token)match(input,WS,FOLLOW_WS_in_exprBase902);  
							stream_WS.add(WS120);

							}
							break;

					}
					} finally {dbg.exitSubRule(33);}
					dbg.location(78,12);
					Symbol121=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase905);  
					stream_Symbol.add(Symbol121);
					dbg.location(78,18);
					char_literal122=(Token)match(input,38,FOLLOW_38_in_exprBase906);  
					stream_38.add(char_literal122);

					// AST REWRITE
					// elements: Symbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:22: -> ^( N_Call Symbol )
					{
						dbg.location(78,25);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:78:25: ^( N_Call Symbol )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(78,27);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Call, "N_Call"), root_1);
						dbg.location(78,34);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:4: '(' ( WS )? 'hd ' exprBase ( WS )? ')'
					{
					dbg.location(79,4);
					char_literal123=(Token)match(input,37,FOLLOW_37_in_exprBase919);  
					stream_37.add(char_literal123);
					dbg.location(79,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:8: ( WS )?
					int alt34=2;
					try { dbg.enterSubRule(34);
					try { dbg.enterDecision(34, decisionCanBacktrack[34]);

					int LA34_0 = input.LA(1);
					if ( (LA34_0==WS) ) {
						alt34=1;
					}
					} finally {dbg.exitDecision(34);}

					switch (alt34) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:8: WS
							{
							dbg.location(79,8);
							WS124=(Token)match(input,WS,FOLLOW_WS_in_exprBase921);  
							stream_WS.add(WS124);

							}
							break;

					}
					} finally {dbg.exitSubRule(34);}
					dbg.location(79,12);
					string_literal125=(Token)match(input,52,FOLLOW_52_in_exprBase924);  
					stream_52.add(string_literal125);
					dbg.location(79,17);
					pushFollow(FOLLOW_exprBase_in_exprBase925);
					exprBase126=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase126.getTree());dbg.location(79,26);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:26: ( WS )?
					int alt35=2;
					try { dbg.enterSubRule(35);
					try { dbg.enterDecision(35, decisionCanBacktrack[35]);

					int LA35_0 = input.LA(1);
					if ( (LA35_0==WS) ) {
						alt35=1;
					}
					} finally {dbg.exitDecision(35);}

					switch (alt35) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:26: WS
							{
							dbg.location(79,26);
							WS127=(Token)match(input,WS,FOLLOW_WS_in_exprBase927);  
							stream_WS.add(WS127);

							}
							break;

					}
					} finally {dbg.exitSubRule(35);}
					dbg.location(79,30);
					char_literal128=(Token)match(input,38,FOLLOW_38_in_exprBase930);  
					stream_38.add(char_literal128);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:34: -> ^( N_Hd exprBase )
					{
						dbg.location(79,37);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:37: ^( N_Hd exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(79,39);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Hd, "N_Hd"), root_1);
						dbg.location(79,44);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:4: '(' ( WS )? 'tl ' exprBase ( WS )? ')'
					{
					dbg.location(80,4);
					char_literal129=(Token)match(input,37,FOLLOW_37_in_exprBase943);  
					stream_37.add(char_literal129);
					dbg.location(80,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:8: ( WS )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:8: WS
							{
							dbg.location(80,8);
							WS130=(Token)match(input,WS,FOLLOW_WS_in_exprBase945);  
							stream_WS.add(WS130);

							}
							break;

					}
					} finally {dbg.exitSubRule(36);}
					dbg.location(80,12);
					string_literal131=(Token)match(input,62,FOLLOW_62_in_exprBase948);  
					stream_62.add(string_literal131);
					dbg.location(80,17);
					pushFollow(FOLLOW_exprBase_in_exprBase949);
					exprBase132=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase132.getTree());dbg.location(80,26);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:26: ( WS )?
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:26: WS
							{
							dbg.location(80,26);
							WS133=(Token)match(input,WS,FOLLOW_WS_in_exprBase951);  
							stream_WS.add(WS133);

							}
							break;

					}
					} finally {dbg.exitSubRule(37);}
					dbg.location(80,29);
					char_literal134=(Token)match(input,38,FOLLOW_38_in_exprBase953);  
					stream_38.add(char_literal134);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 80:33: -> ^( N_Tl exprBase )
					{
						dbg.location(80,36);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:80:36: ^( N_Tl exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(80,38);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Tl, "N_Tl"), root_1);
						dbg.location(80,43);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:4: '(' ( WS )? 'cons' ( WS )? ')'
					{
					dbg.location(81,4);
					char_literal135=(Token)match(input,37,FOLLOW_37_in_exprBase966);  
					stream_37.add(char_literal135);
					dbg.location(81,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:8: ( WS )?
					int alt38=2;
					try { dbg.enterSubRule(38);
					try { dbg.enterDecision(38, decisionCanBacktrack[38]);

					int LA38_0 = input.LA(1);
					if ( (LA38_0==WS) ) {
						alt38=1;
					}
					} finally {dbg.exitDecision(38);}

					switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:8: WS
							{
							dbg.location(81,8);
							WS136=(Token)match(input,WS,FOLLOW_WS_in_exprBase968);  
							stream_WS.add(WS136);

							}
							break;

					}
					} finally {dbg.exitSubRule(38);}
					dbg.location(81,12);
					string_literal137=(Token)match(input,45,FOLLOW_45_in_exprBase971);  
					stream_45.add(string_literal137);
					dbg.location(81,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:19: ( WS )?
					int alt39=2;
					try { dbg.enterSubRule(39);
					try { dbg.enterDecision(39, decisionCanBacktrack[39]);

					int LA39_0 = input.LA(1);
					if ( (LA39_0==WS) ) {
						alt39=1;
					}
					} finally {dbg.exitDecision(39);}

					switch (alt39) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:19: WS
							{
							dbg.location(81,19);
							WS138=(Token)match(input,WS,FOLLOW_WS_in_exprBase973);  
							stream_WS.add(WS138);

							}
							break;

					}
					} finally {dbg.exitSubRule(39);}
					dbg.location(81,23);
					char_literal139=(Token)match(input,38,FOLLOW_38_in_exprBase976);  
					stream_38.add(char_literal139);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:27: -> ^( N_Cons )
					{
						dbg.location(81,30);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:30: ^( N_Cons )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(81,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Cons, "N_Cons"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:4: '(' ( WS )? 'cons ' ( WS )? lexpr ')'
					{
					dbg.location(82,4);
					char_literal140=(Token)match(input,37,FOLLOW_37_in_exprBase987);  
					stream_37.add(char_literal140);
					dbg.location(82,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:8: ( WS )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==WS) ) {
						alt40=1;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:8: WS
							{
							dbg.location(82,8);
							WS141=(Token)match(input,WS,FOLLOW_WS_in_exprBase989);  
							stream_WS.add(WS141);

							}
							break;

					}
					} finally {dbg.exitSubRule(40);}
					dbg.location(82,12);
					string_literal142=(Token)match(input,44,FOLLOW_44_in_exprBase992);  
					stream_44.add(string_literal142);
					dbg.location(82,20);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:20: ( WS )?
					int alt41=2;
					try { dbg.enterSubRule(41);
					try { dbg.enterDecision(41, decisionCanBacktrack[41]);

					int LA41_0 = input.LA(1);
					if ( (LA41_0==WS) ) {
						alt41=1;
					}
					} finally {dbg.exitDecision(41);}

					switch (alt41) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:20: WS
							{
							dbg.location(82,20);
							WS143=(Token)match(input,WS,FOLLOW_WS_in_exprBase994);  
							stream_WS.add(WS143);

							}
							break;

					}
					} finally {dbg.exitSubRule(41);}
					dbg.location(82,24);
					pushFollow(FOLLOW_lexpr_in_exprBase997);
					lexpr144=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr144.getTree());dbg.location(82,29);
					char_literal145=(Token)match(input,38,FOLLOW_38_in_exprBase998);  
					stream_38.add(char_literal145);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:33: -> ^( N_Cons lexpr )
					{
						dbg.location(82,36);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:36: ^( N_Cons lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(82,38);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Cons, "N_Cons"), root_1);
						dbg.location(82,45);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:4: '(' ( WS )? 'list' ( WS )? ')'
					{
					dbg.location(83,4);
					char_literal146=(Token)match(input,37,FOLLOW_37_in_exprBase1011);  
					stream_37.add(char_literal146);
					dbg.location(83,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:8: ( WS )?
					int alt42=2;
					try { dbg.enterSubRule(42);
					try { dbg.enterDecision(42, decisionCanBacktrack[42]);

					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						alt42=1;
					}
					} finally {dbg.exitDecision(42);}

					switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:8: WS
							{
							dbg.location(83,8);
							WS147=(Token)match(input,WS,FOLLOW_WS_in_exprBase1013);  
							stream_WS.add(WS147);

							}
							break;

					}
					} finally {dbg.exitSubRule(42);}
					dbg.location(83,12);
					string_literal148=(Token)match(input,56,FOLLOW_56_in_exprBase1016);  
					stream_56.add(string_literal148);
					dbg.location(83,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:19: ( WS )?
					int alt43=2;
					try { dbg.enterSubRule(43);
					try { dbg.enterDecision(43, decisionCanBacktrack[43]);

					int LA43_0 = input.LA(1);
					if ( (LA43_0==WS) ) {
						alt43=1;
					}
					} finally {dbg.exitDecision(43);}

					switch (alt43) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:19: WS
							{
							dbg.location(83,19);
							WS149=(Token)match(input,WS,FOLLOW_WS_in_exprBase1018);  
							stream_WS.add(WS149);

							}
							break;

					}
					} finally {dbg.exitSubRule(43);}
					dbg.location(83,23);
					char_literal150=(Token)match(input,38,FOLLOW_38_in_exprBase1021);  
					stream_38.add(char_literal150);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:27: -> ^( N_List )
					{
						dbg.location(83,30);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:30: ^( N_List )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(83,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_List, "N_List"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:4: '(' ( WS )? 'list ' ( WS )? lexpr ')'
					{
					dbg.location(84,4);
					char_literal151=(Token)match(input,37,FOLLOW_37_in_exprBase1032);  
					stream_37.add(char_literal151);
					dbg.location(84,8);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:8: ( WS )?
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					int LA44_0 = input.LA(1);
					if ( (LA44_0==WS) ) {
						alt44=1;
					}
					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:8: WS
							{
							dbg.location(84,8);
							WS152=(Token)match(input,WS,FOLLOW_WS_in_exprBase1034);  
							stream_WS.add(WS152);

							}
							break;

					}
					} finally {dbg.exitSubRule(44);}
					dbg.location(84,12);
					string_literal153=(Token)match(input,55,FOLLOW_55_in_exprBase1037);  
					stream_55.add(string_literal153);
					dbg.location(84,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:19: ( WS )?
					int alt45=2;
					try { dbg.enterSubRule(45);
					try { dbg.enterDecision(45, decisionCanBacktrack[45]);

					int LA45_0 = input.LA(1);
					if ( (LA45_0==WS) ) {
						alt45=1;
					}
					} finally {dbg.exitDecision(45);}

					switch (alt45) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:19: WS
							{
							dbg.location(84,19);
							WS154=(Token)match(input,WS,FOLLOW_WS_in_exprBase1038);  
							stream_WS.add(WS154);

							}
							break;

					}
					} finally {dbg.exitSubRule(45);}
					dbg.location(84,23);
					pushFollow(FOLLOW_lexpr_in_exprBase1041);
					lexpr155=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr155.getTree());dbg.location(84,28);
					char_literal156=(Token)match(input,38,FOLLOW_38_in_exprBase1042);  
					stream_38.add(char_literal156);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:32: -> ^( N_List lexpr )
					{
						dbg.location(84,35);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:35: ^( N_List lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(84,37);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_List, "N_List"), root_1);
						dbg.location(84,44);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 49);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprBase"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:2: lexpr : ( exprBase ( WS )? )* -> ( exprBase )* ;
	public final WhileCompilerParser.lexpr_return lexpr() throws RecognitionException {
		WhileCompilerParser.lexpr_return retval = new WhileCompilerParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS158=null;
		ParserRuleReturnScope exprBase157 =null;

		Object WS158_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 1);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:8: ( ( exprBase ( WS )? )* -> ( exprBase )* )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:10: ( exprBase ( WS )? )*
			{
			dbg.location(86,10);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:10: ( exprBase ( WS )? )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( ((LA48_0 >= Symbol && LA48_0 <= Variable)||LA48_0==37||LA48_0==57) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:11: exprBase ( WS )?
					{
					dbg.location(86,11);
					pushFollow(FOLLOW_exprBase_in_lexpr1062);
					exprBase157=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase157.getTree());dbg.location(86,20);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:20: ( WS )?
					int alt47=2;
					try { dbg.enterSubRule(47);
					try { dbg.enterDecision(47, decisionCanBacktrack[47]);

					int LA47_0 = input.LA(1);
					if ( (LA47_0==WS) ) {
						alt47=1;
					}
					} finally {dbg.exitDecision(47);}

					switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:20: WS
							{
							dbg.location(86,20);
							WS158=(Token)match(input,WS,FOLLOW_WS_in_lexpr1064);  
							stream_WS.add(WS158);

							}
							break;

					}
					} finally {dbg.exitSubRule(47);}

					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:26: -> ( exprBase )*
			{
				dbg.location(86,29);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:86:29: ( exprBase )*
				while ( stream_exprBase.hasNext() ) {
					dbg.location(86,29);
					adaptor.addChild(root_0, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_WS_in_program310 = new BitSet(new long[]{0x0008000800000000L});
	public static final BitSet FOLLOW_function_in_program314 = new BitSet(new long[]{0x0008000800000002L});
	public static final BitSet FOLLOW_WS_in_program316 = new BitSet(new long[]{0x0008000800000002L});
	public static final BitSet FOLLOW_51_in_function333 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_function335 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Symbol_in_function337 = new BitSet(new long[]{0x0000010800000000L});
	public static final BitSet FOLLOW_WS_in_function339 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_function342 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_function344 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_definition_in_function346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_definition360 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_definition362 = new BitSet(new long[]{0x0000001C00000000L});
	public static final BitSet FOLLOW_input_in_definition365 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_definition367 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_definition371 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_definition373 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_definition375 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_definition377 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_definition379 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_definition381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_definition383 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_output_in_definition385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub415 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Variable_in_inputSub418 = new BitSet(new long[]{0x0000008800000000L});
	public static final BitSet FOLLOW_WS_in_inputSub420 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_inputSub423 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub436 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Variable_in_inputSub439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_output467 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Variable_in_output470 = new BitSet(new long[]{0x0000008800000000L});
	public static final BitSet FOLLOW_WS_in_output472 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_output475 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_output_in_output477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_output488 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Variable_in_output491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_commands502 = new BitSet(new long[]{0x8426000400000000L});
	public static final BitSet FOLLOW_command_in_commands505 = new BitSet(new long[]{0x0000040800000002L});
	public static final BitSet FOLLOW_WS_in_commands508 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_commands511 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_WS_in_commands513 = new BitSet(new long[]{0x8426000400000000L});
	public static final BitSet FOLLOW_command_in_commands516 = new BitSet(new long[]{0x0000040800000002L});
	public static final BitSet FOLLOW_42_in_commands521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_command534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command544 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_WS_in_command546 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command549 = new BitSet(new long[]{0x0200002E00000000L});
	public static final BitSet FOLLOW_WS_in_command551 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_exprs_in_command554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command579 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command581 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_expression_in_command583 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command585 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_command587 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command589 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_command591 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command593 = new BitSet(new long[]{0x0001800800000000L});
	public static final BitSet FOLLOW_WS_in_command595 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command598 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command599 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_command601 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command603 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_command635 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command637 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_expression_in_command639 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command641 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command643 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command645 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_command647 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command649 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_command651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command672 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command674 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_expression_in_command676 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command678 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command680 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command682 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_command684 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command686 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_command688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command709 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command711 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Variable_in_command713 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command715 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command717 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command719 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_expression_in_command721 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command723 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command725 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command727 = new BitSet(new long[]{0x8426000C00000000L});
	public static final BitSet FOLLOW_commands_in_command729 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_command731 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_command733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars758 = new BitSet(new long[]{0x0000008800000000L});
	public static final BitSet FOLLOW_WS_in_vars760 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_vars763 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_WS_in_vars765 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_vars_in_vars768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs789 = new BitSet(new long[]{0x0000008800000002L});
	public static final BitSet FOLLOW_WS_in_exprs792 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprs795 = new BitSet(new long[]{0x0200002E00000000L});
	public static final BitSet FOLLOW_WS_in_exprs797 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_expression_in_exprs800 = new BitSet(new long[]{0x0000008800000002L});
	public static final BitSet FOLLOW_exprBase_in_expression815 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_expression818 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_exprBase_in_expression820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_exprBase838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase875 = new BitSet(new long[]{0x0000000A00000000L});
	public static final BitSet FOLLOW_WS_in_exprBase877 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase880 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase882 = new BitSet(new long[]{0x0200006600000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase884 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase900 = new BitSet(new long[]{0x0000000A00000000L});
	public static final BitSet FOLLOW_WS_in_exprBase902 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase905 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase919 = new BitSet(new long[]{0x0010000800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase921 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_exprBase924 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase925 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase927 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase943 = new BitSet(new long[]{0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase945 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_exprBase948 = new BitSet(new long[]{0x0200002600000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase949 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase951 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase966 = new BitSet(new long[]{0x0000200800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase968 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exprBase971 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase973 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase987 = new BitSet(new long[]{0x0000100800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase989 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_exprBase992 = new BitSet(new long[]{0x0200006E00000000L});
	public static final BitSet FOLLOW_WS_in_exprBase994 = new BitSet(new long[]{0x0200006600000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase997 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase1011 = new BitSet(new long[]{0x0100000800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase1013 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_exprBase1016 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase1018 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprBase1032 = new BitSet(new long[]{0x0080000800000000L});
	public static final BitSet FOLLOW_WS_in_exprBase1034 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_exprBase1037 = new BitSet(new long[]{0x0200006E00000000L});
	public static final BitSet FOLLOW_WS_in_exprBase1038 = new BitSet(new long[]{0x0200006600000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase1041 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lexpr1062 = new BitSet(new long[]{0x0200002E00000002L});
	public static final BitSet FOLLOW_WS_in_lexpr1064 = new BitSet(new long[]{0x0200002600000002L});
}
