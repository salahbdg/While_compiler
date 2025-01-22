// $ANTLR 3.5.1 C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g 2025-01-22 01:55:29

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Dec", "EQUALS", "Maj", "Min", 
		"N_Affectation", "N_Call", "N_Command", "N_Commands", "N_Cons", "N_Definition", 
		"N_Else", "N_Expr_base", "N_Expression", "N_Exprs", "N_For", "N_Foreach", 
		"N_Function", "N_Hd", "N_If", "N_Input", "N_List", "N_Nil", "N_Nope", 
		"N_Output", "N_Program", "N_Symbol", "N_Tl", "N_Variable", "N_Vars", "N_While", 
		"Symbol", "Variable", "WS", "' = '", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'cons '", "'cons'", "'do'", "'else'", "'fi'", "'for'", 
		"'foreach'", "'function'", "'hd '", "'if'", "'in'", "'list '", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl '", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__65=65;
	public static final int Dec=4;
	public static final int EQUALS=5;
	public static final int Maj=6;
	public static final int Min=7;
	public static final int N_Affectation=8;
	public static final int N_Call=9;
	public static final int N_Command=10;
	public static final int N_Commands=11;
	public static final int N_Cons=12;
	public static final int N_Definition=13;
	public static final int N_Else=14;
	public static final int N_Expr_base=15;
	public static final int N_Expression=16;
	public static final int N_Exprs=17;
	public static final int N_For=18;
	public static final int N_Foreach=19;
	public static final int N_Function=20;
	public static final int N_Hd=21;
	public static final int N_If=22;
	public static final int N_Input=23;
	public static final int N_List=24;
	public static final int N_Nil=25;
	public static final int N_Nope=26;
	public static final int N_Output=27;
	public static final int N_Program=28;
	public static final int N_Symbol=29;
	public static final int N_Tl=30;
	public static final int N_Variable=31;
	public static final int N_Vars=32;
	public static final int N_While=33;
	public static final int Symbol=34;
	public static final int Variable=35;
	public static final int WS=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "function", "inputsub", "exprs", "vars", "input", "definition", 
		"exprbase", "program", "lexpr", "command", "expression", "output", "commands"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
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
					WS1=(Token)match(input,WS,FOLLOW_WS_in_program320);  
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
				if ( (LA3_0==52) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:50:15: function ( WS )*
					{
					dbg.location(50,15);
					pushFollow(FOLLOW_function_in_program324);
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
							WS3=(Token)match(input,WS,FOLLOW_WS_in_program326);  
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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:1: function : 'function' WS Symbol ( WS )? ':' WS definition -> ^( N_Function ^( Symbol definition ) ) ;
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
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:9: ( 'function' WS Symbol ( WS )? ':' WS definition -> ^( N_Function ^( Symbol definition ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:11: 'function' WS Symbol ( WS )? ':' WS definition
			{
			dbg.location(52,11);
			string_literal4=(Token)match(input,52,FOLLOW_52_in_function345);  
			stream_52.add(string_literal4);
			dbg.location(52,22);
			WS5=(Token)match(input,WS,FOLLOW_WS_in_function347);  
			stream_WS.add(WS5);
			dbg.location(52,25);
			Symbol6=(Token)match(input,Symbol,FOLLOW_Symbol_in_function349);  
			stream_Symbol.add(Symbol6);
			dbg.location(52,32);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:32: ( WS )?
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:32: WS
					{
					dbg.location(52,32);
					WS7=(Token)match(input,WS,FOLLOW_WS_in_function351);  
					stream_WS.add(WS7);

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(52,36);
			char_literal8=(Token)match(input,42,FOLLOW_42_in_function354);  
			stream_42.add(char_literal8);
			dbg.location(52,40);
			WS9=(Token)match(input,WS,FOLLOW_WS_in_function356);  
			stream_WS.add(WS9);
			dbg.location(52,43);
			pushFollow(FOLLOW_definition_in_function358);
			definition10=definition();
			state._fsp--;

			stream_definition.add(definition10.getTree());
			// AST REWRITE
			// elements: Symbol, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:53: -> ^( N_Function ^( Symbol definition ) )
			{
				dbg.location(52,56);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:56: ^( N_Function ^( Symbol definition ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(52,58);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Function, "N_Function"), root_1);
				dbg.location(52,69);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:52:69: ^( Symbol definition )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(52,71);
				root_2 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_2);
				dbg.location(52,78);
				adaptor.addChild(root_2, stream_definition.nextTree());
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
		dbg.location(52, 89);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:54:1: definition : 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) ) ;
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
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:54:11: ( 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:2: 'read' WS ( input WS )? '%' WS commands WS '%' WS 'write' output
			{
			dbg.location(55,2);
			string_literal11=(Token)match(input,61,FOLLOW_61_in_definition377);  
			stream_61.add(string_literal11);
			dbg.location(55,9);
			WS12=(Token)match(input,WS,FOLLOW_WS_in_definition379);  
			stream_WS.add(WS12);
			dbg.location(55,12);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:12: ( input WS )?
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:13: input WS
					{
					dbg.location(55,13);
					pushFollow(FOLLOW_input_in_definition382);
					input13=input();
					state._fsp--;

					stream_input.add(input13.getTree());dbg.location(55,19);
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition384);  
					stream_WS.add(WS14);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(55,24);
			char_literal15=(Token)match(input,38,FOLLOW_38_in_definition388);  
			stream_38.add(char_literal15);
			dbg.location(55,28);
			WS16=(Token)match(input,WS,FOLLOW_WS_in_definition390);  
			stream_WS.add(WS16);
			dbg.location(55,31);
			pushFollow(FOLLOW_commands_in_definition392);
			commands17=commands();
			state._fsp--;

			stream_commands.add(commands17.getTree());dbg.location(55,40);
			WS18=(Token)match(input,WS,FOLLOW_WS_in_definition394);  
			stream_WS.add(WS18);
			dbg.location(55,43);
			char_literal19=(Token)match(input,38,FOLLOW_38_in_definition396);  
			stream_38.add(char_literal19);
			dbg.location(55,47);
			WS20=(Token)match(input,WS,FOLLOW_WS_in_definition398);  
			stream_WS.add(WS20);
			dbg.location(55,50);
			string_literal21=(Token)match(input,65,FOLLOW_65_in_definition400);  
			stream_65.add(string_literal21);
			dbg.location(55,58);
			pushFollow(FOLLOW_output_in_definition402);
			output22=output();
			state._fsp--;

			stream_output.add(output22.getTree());
			// AST REWRITE
			// elements: commands, input, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:65: -> ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) )
			{
				dbg.location(55,68);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:68: ^( N_Definition ( input )? ^( N_Commands commands ) ^( N_Output output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(55,70);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Definition, "N_Definition"), root_1);
				dbg.location(55,83);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:83: ( input )?
				if ( stream_input.hasNext() ) {
					dbg.location(55,83);
					adaptor.addChild(root_1, stream_input.nextTree());
				}
				stream_input.reset();
				dbg.location(55,90);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:90: ^( N_Commands commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(55,92);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
				dbg.location(55,103);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(55,113);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:55:113: ^( N_Output output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(55,115);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Output, "N_Output"), root_2);
				dbg.location(55,124);
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
		dbg.location(55, 131);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:1: input : ( inputsub )? -> ^( N_Input ( inputsub )? ) ;
	public final WhileCompilerParser.input_return input() throws RecognitionException {
		WhileCompilerParser.input_return retval = new WhileCompilerParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputsub23 =null;

		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:6: ( ( inputsub )? -> ^( N_Input ( inputsub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:8: ( inputsub )?
			{
			dbg.location(57,8);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:8: ( inputsub )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==Variable) ) {
					alt6=1;
				}
			}
			else if ( (LA6_0==Variable) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:8: inputsub
					{
					dbg.location(57,8);
					pushFollow(FOLLOW_inputsub_in_input431);
					inputsub23=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub23.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			// AST REWRITE
			// elements: inputsub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:18: -> ^( N_Input ( inputsub )? )
			{
				dbg.location(57,21);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:21: ^( N_Input ( inputsub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(57,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Input, "N_Input"), root_1);
				dbg.location(57,31);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:57:31: ( inputsub )?
				if ( stream_inputsub.hasNext() ) {
					dbg.location(57,31);
					adaptor.addChild(root_1, stream_inputsub.nextTree());
				}
				stream_inputsub.reset();

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
		dbg.location(57, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class inputsub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputsub"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:1: inputsub : ( ( ( WS )? Variable ( WS )? ',' inputsub ) -> Variable inputsub | ( WS )? Variable -> Variable );
	public final WhileCompilerParser.inputsub_return inputsub() throws RecognitionException {
		WhileCompilerParser.inputsub_return retval = new WhileCompilerParser.inputsub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS24=null;
		Token Variable25=null;
		Token WS26=null;
		Token char_literal27=null;
		Token WS29=null;
		Token Variable30=null;
		ParserRuleReturnScope inputsub28 =null;

		Object WS24_tree=null;
		Object Variable25_tree=null;
		Object WS26_tree=null;
		Object char_literal27_tree=null;
		Object WS29_tree=null;
		Object Variable30_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try { dbg.enterRule(getGrammarFileName(), "inputsub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:9: ( ( ( WS )? Variable ( WS )? ',' inputsub ) -> Variable inputsub | ( WS )? Variable -> Variable )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==WS) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==Variable) ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2==WS) ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3==41) ) {
							alt10=1;
						}
						else if ( (LA10_3==38) ) {
							alt10=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA10_2==41) ) {
						alt10=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
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
							new NoViableAltException("", 10, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA10_0==Variable) ) {
				int LA10_2 = input.LA(2);
				if ( (LA10_2==WS) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==41) ) {
						alt10=1;
					}
					else if ( (LA10_3==38) ) {
						alt10=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA10_2==41) ) {
					alt10=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:11: ( ( WS )? Variable ( WS )? ',' inputsub )
					{
					dbg.location(59,11);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:11: ( ( WS )? Variable ( WS )? ',' inputsub )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:12: ( WS )? Variable ( WS )? ',' inputsub
					{
					dbg.location(59,12);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:12: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:12: WS
							{
							dbg.location(59,12);
							WS24=(Token)match(input,WS,FOLLOW_WS_in_inputsub449);  
							stream_WS.add(WS24);

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(59,16);
					Variable25=(Token)match(input,Variable,FOLLOW_Variable_in_inputsub452);  
					stream_Variable.add(Variable25);
					dbg.location(59,25);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:25: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:25: WS
							{
							dbg.location(59,25);
							WS26=(Token)match(input,WS,FOLLOW_WS_in_inputsub454);  
							stream_WS.add(WS26);

							}
							break;

					}
					} finally {dbg.exitSubRule(8);}
					dbg.location(59,29);
					char_literal27=(Token)match(input,41,FOLLOW_41_in_inputsub457);  
					stream_41.add(char_literal27);
					dbg.location(59,33);
					pushFollow(FOLLOW_inputsub_in_inputsub459);
					inputsub28=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub28.getTree());
					}

					// AST REWRITE
					// elements: Variable, inputsub
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 59:43: -> Variable inputsub
					{
						dbg.location(59,46);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(59,55);
						adaptor.addChild(root_0, stream_inputsub.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:66: ( WS )? Variable
					{
					dbg.location(59,66);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:66: ( WS )?
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==WS) ) {
						alt9=1;
					}
					} finally {dbg.exitDecision(9);}

					switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:59:66: WS
							{
							dbg.location(59,66);
							WS29=(Token)match(input,WS,FOLLOW_WS_in_inputsub470);  
							stream_WS.add(WS29);

							}
							break;

					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(59,70);
					Variable30=(Token)match(input,Variable,FOLLOW_Variable_in_inputsub473);  
					stream_Variable.add(Variable30);

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
					// 59:79: -> Variable
					{
						dbg.location(59,82);
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
		dbg.location(59, 89);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputsub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inputsub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:1: output : ( ( ( WS )? Variable ( WS )? ',' output ) -> Variable output | ( WS )? Variable -> Variable );
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
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:7: ( ( ( WS )? Variable ( WS )? ',' output ) -> Variable output | ( WS )? Variable -> Variable )
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
						if ( (LA14_3==41) ) {
							alt14=1;
						}
						else if ( (LA14_3==EOF||LA14_3==WS||LA14_3==52) ) {
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
					case 41:
						{
						alt14=1;
						}
						break;
					case EOF:
					case 52:
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
					if ( (LA14_3==41) ) {
						alt14=1;
					}
					else if ( (LA14_3==EOF||LA14_3==WS||LA14_3==52) ) {
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
				case 41:
					{
					alt14=1;
					}
					break;
				case EOF:
				case 52:
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:9: ( ( WS )? Variable ( WS )? ',' output )
					{
					dbg.location(61,9);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:9: ( ( WS )? Variable ( WS )? ',' output )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:10: ( WS )? Variable ( WS )? ',' output
					{
					dbg.location(61,10);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:10: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:10: WS
							{
							dbg.location(61,10);
							WS31=(Token)match(input,WS,FOLLOW_WS_in_output485);  
							stream_WS.add(WS31);

							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(61,14);
					Variable32=(Token)match(input,Variable,FOLLOW_Variable_in_output488);  
					stream_Variable.add(Variable32);
					dbg.location(61,23);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:23: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:23: WS
							{
							dbg.location(61,23);
							WS33=(Token)match(input,WS,FOLLOW_WS_in_output490);  
							stream_WS.add(WS33);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(61,27);
					char_literal34=(Token)match(input,41,FOLLOW_41_in_output493);  
					stream_41.add(char_literal34);
					dbg.location(61,31);
					pushFollow(FOLLOW_output_in_output495);
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
					// 61:39: -> Variable output
					{
						dbg.location(61,42);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(61,51);
						adaptor.addChild(root_0, stream_output.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:60: ( WS )? Variable
					{
					dbg.location(61,60);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:60: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:61:60: WS
							{
							dbg.location(61,60);
							WS36=(Token)match(input,WS,FOLLOW_WS_in_output506);  
							stream_WS.add(WS36);

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(61,64);
					Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_output509);  
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
					// 61:73: -> Variable
					{
						dbg.location(61,76);
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
		dbg.location(61, 83);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:1: commands : ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )? -> ( command )+ ;
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:63:9: ( ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )? -> ( command )+ )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:5: ( WS )? command ( ( WS )? ';' ( WS )? command )* ( ';' )?
			{
			dbg.location(64,5);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:5: ( WS )?
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:5: WS
					{
					dbg.location(64,5);
					WS38=(Token)match(input,WS,FOLLOW_WS_in_commands526);  
					stream_WS.add(WS38);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(64,9);
			pushFollow(FOLLOW_command_in_commands529);
			command39=command();
			state._fsp--;

			stream_command.add(command39.getTree());dbg.location(64,17);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:17: ( ( WS )? ';' ( WS )? command )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==44) ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1==WS) ) {
						int LA18_3 = input.LA(3);
						if ( (LA18_3==Variable||(LA18_3 >= 50 && LA18_3 <= 51)||LA18_3==54||LA18_3==59||LA18_3==64) ) {
							alt18=1;
						}

					}
					else if ( (LA18_1==Variable||(LA18_1 >= 50 && LA18_1 <= 51)||LA18_1==54||LA18_1==59||LA18_1==64) ) {
						alt18=1;
					}

				}
				else if ( (LA18_0==WS) ) {
					int LA18_2 = input.LA(2);
					if ( (LA18_2==44) ) {
						alt18=1;
					}

				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:18: ( WS )? ';' ( WS )? command
					{
					dbg.location(64,18);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:18: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:18: WS
							{
							dbg.location(64,18);
							WS40=(Token)match(input,WS,FOLLOW_WS_in_commands532);  
							stream_WS.add(WS40);

							}
							break;

					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(64,22);
					char_literal41=(Token)match(input,44,FOLLOW_44_in_commands535);  
					stream_44.add(char_literal41);
					dbg.location(64,26);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:26: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:26: WS
							{
							dbg.location(64,26);
							WS42=(Token)match(input,WS,FOLLOW_WS_in_commands537);  
							stream_WS.add(WS42);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(64,30);
					pushFollow(FOLLOW_command_in_commands540);
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
			dbg.location(64,40);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:40: ( ';' )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==44) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:64:41: ';'
					{
					dbg.location(64,41);
					char_literal44=(Token)match(input,44,FOLLOW_44_in_commands545);  
					stream_44.add(char_literal44);

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
			// 64:47: -> ( command )+
			{
				dbg.location(64,50);
				if ( !(stream_command.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_command.hasNext() ) {
					dbg.location(64,50);
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
		dbg.location(64, 57);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:1: command : ( ( 'nop' ) -> N_Nope | ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) ) | ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' ) -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? ) | ( 'while' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_While expression ^( N_Commands commands ) ) | ( 'for' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_For expression ^( N_Commands commands ) ) | ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_Foreach Variable expression ^( N_Commands commands ) ) );
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:66:8: ( ( 'nop' ) -> N_Nope | ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) ) | ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' ) -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? ) | ( 'while' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_While expression ^( N_Commands commands ) ) | ( 'for' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_For expression ^( N_Commands commands ) ) | ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' ) -> ^( N_Foreach Variable expression ^( N_Commands commands ) ) )
			int alt24=6;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case 59:
				{
				alt24=1;
				}
				break;
			case Variable:
				{
				alt24=2;
				}
				break;
			case 54:
				{
				alt24=3;
				}
				break;
			case 64:
				{
				alt24=4;
				}
				break;
			case 50:
				{
				alt24=5;
				}
				break;
			case 51:
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:4: ( 'nop' )
					{
					dbg.location(67,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:4: ( 'nop' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:67:5: 'nop'
					{
					dbg.location(67,5);
					string_literal45=(Token)match(input,59,FOLLOW_59_in_command563);  
					stream_59.add(string_literal45);

					}

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
					// 67:12: -> N_Nope
					{
						dbg.location(67,15);
						adaptor.addChild(root_0, (Object)adaptor.create(N_Nope, "N_Nope"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:4: ( vars ( WS )? ':=' ( WS )? exprs )
					{
					dbg.location(68,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:4: ( vars ( WS )? ':=' ( WS )? exprs )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:5: vars ( WS )? ':=' ( WS )? exprs
					{
					dbg.location(68,5);
					pushFollow(FOLLOW_vars_in_command574);
					vars46=vars();
					state._fsp--;

					stream_vars.add(vars46.getTree());dbg.location(68,10);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:10: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:10: WS
							{
							dbg.location(68,10);
							WS47=(Token)match(input,WS,FOLLOW_WS_in_command576);  
							stream_WS.add(WS47);

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(68,14);
					string_literal48=(Token)match(input,43,FOLLOW_43_in_command579);  
					stream_43.add(string_literal48);
					dbg.location(68,19);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:19: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:19: WS
							{
							dbg.location(68,19);
							WS49=(Token)match(input,WS,FOLLOW_WS_in_command581);  
							stream_WS.add(WS49);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(68,23);
					pushFollow(FOLLOW_exprs_in_command584);
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
					// 68:30: -> ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) )
					{
						dbg.location(68,33);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:33: ^( N_Affectation ^( N_Vars vars ) ^( N_Exprs exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(68,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Affectation, "N_Affectation"), root_1);
						dbg.location(68,49);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:49: ^( N_Vars vars )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(68,51);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Vars, "N_Vars"), root_2);
						dbg.location(68,58);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(68,64);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:68:64: ^( N_Exprs exprs )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(68,66);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Exprs, "N_Exprs"), root_2);
						dbg.location(68,74);
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:4: ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' )
					{
					dbg.location(69,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:4: ( 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:5: 'if' WS expression WS 'then' WS commands WS ( ( WS )? 'else' WS commands WS )? 'fi'
					{
					dbg.location(69,5);
					string_literal51=(Token)match(input,54,FOLLOW_54_in_command609);  
					stream_54.add(string_literal51);
					dbg.location(69,10);
					WS52=(Token)match(input,WS,FOLLOW_WS_in_command611);  
					stream_WS.add(WS52);
					dbg.location(69,13);
					pushFollow(FOLLOW_expression_in_command613);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());dbg.location(69,24);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_command615);  
					stream_WS.add(WS54);
					dbg.location(69,27);
					string_literal55=(Token)match(input,62,FOLLOW_62_in_command617);  
					stream_62.add(string_literal55);
					dbg.location(69,34);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_command619);  
					stream_WS.add(WS56);
					dbg.location(69,37);
					pushFollow(FOLLOW_commands_in_command621);
					commands57=commands();
					state._fsp--;

					stream_commands.add(commands57.getTree());dbg.location(69,46);
					WS58=(Token)match(input,WS,FOLLOW_WS_in_command623);  
					stream_WS.add(WS58);
					dbg.location(69,48);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:48: ( ( WS )? 'else' WS commands WS )?
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS||LA23_0==48) ) {
						alt23=1;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:49: ( WS )? 'else' WS commands WS
							{
							dbg.location(69,49);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:49: ( WS )?
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

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:49: WS
									{
									dbg.location(69,49);
									WS59=(Token)match(input,WS,FOLLOW_WS_in_command625);  
									stream_WS.add(WS59);

									}
									break;

							}
							} finally {dbg.exitSubRule(22);}
							dbg.location(69,53);
							string_literal60=(Token)match(input,48,FOLLOW_48_in_command628);  
							stream_48.add(string_literal60);
							dbg.location(69,59);
							WS61=(Token)match(input,WS,FOLLOW_WS_in_command629);  
							stream_WS.add(WS61);
							dbg.location(69,62);
							pushFollow(FOLLOW_commands_in_command631);
							commands62=commands();
							state._fsp--;

							stream_commands.add(commands62.getTree());dbg.location(69,71);
							WS63=(Token)match(input,WS,FOLLOW_WS_in_command633);  
							stream_WS.add(WS63);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(69,76);
					string_literal64=(Token)match(input,49,FOLLOW_49_in_command637);  
					stream_49.add(string_literal64);

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
					// 69:82: -> ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? )
					{
						dbg.location(69,85);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:85: ^( N_If expression ^( N_Commands commands ) ( ^( N_Else commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(69,87);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_If, "N_If"), root_1);
						dbg.location(69,92);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(69,103);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:103: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(69,105);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(69,116);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(69,126);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:126: ( ^( N_Else commands ) )?
						if ( stream_commands.hasNext() ) {
							dbg.location(69,126);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:69:126: ^( N_Else commands )
							{
							Object root_2 = (Object)adaptor.nil();
							dbg.location(69,128);
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Else, "N_Else"), root_2);
							dbg.location(69,135);
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:70:4: ( 'while' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(70,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:70:4: ( 'while' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:70:5: 'while' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(70,5);
					string_literal65=(Token)match(input,64,FOLLOW_64_in_command665);  
					stream_64.add(string_literal65);
					dbg.location(70,13);
					WS66=(Token)match(input,WS,FOLLOW_WS_in_command667);  
					stream_WS.add(WS66);
					dbg.location(70,16);
					pushFollow(FOLLOW_expression_in_command669);
					expression67=expression();
					state._fsp--;

					stream_expression.add(expression67.getTree());dbg.location(70,27);
					WS68=(Token)match(input,WS,FOLLOW_WS_in_command671);  
					stream_WS.add(WS68);
					dbg.location(70,30);
					string_literal69=(Token)match(input,47,FOLLOW_47_in_command673);  
					stream_47.add(string_literal69);
					dbg.location(70,35);
					WS70=(Token)match(input,WS,FOLLOW_WS_in_command675);  
					stream_WS.add(WS70);
					dbg.location(70,38);
					pushFollow(FOLLOW_commands_in_command677);
					commands71=commands();
					state._fsp--;

					stream_commands.add(commands71.getTree());dbg.location(70,47);
					WS72=(Token)match(input,WS,FOLLOW_WS_in_command679);  
					stream_WS.add(WS72);
					dbg.location(70,50);
					string_literal73=(Token)match(input,60,FOLLOW_60_in_command681);  
					stream_60.add(string_literal73);

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
					// 70:56: -> ^( N_While expression ^( N_Commands commands ) )
					{
						dbg.location(70,59);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:70:59: ^( N_While expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(70,61);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_While, "N_While"), root_1);
						dbg.location(70,69);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(70,80);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:70:80: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(70,82);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(70,93);
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:4: ( 'for' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(71,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:4: ( 'for' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:5: 'for' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(71,5);
					string_literal74=(Token)match(input,50,FOLLOW_50_in_command702);  
					stream_50.add(string_literal74);
					dbg.location(71,11);
					WS75=(Token)match(input,WS,FOLLOW_WS_in_command704);  
					stream_WS.add(WS75);
					dbg.location(71,14);
					pushFollow(FOLLOW_expression_in_command706);
					expression76=expression();
					state._fsp--;

					stream_expression.add(expression76.getTree());dbg.location(71,25);
					WS77=(Token)match(input,WS,FOLLOW_WS_in_command708);  
					stream_WS.add(WS77);
					dbg.location(71,28);
					string_literal78=(Token)match(input,47,FOLLOW_47_in_command710);  
					stream_47.add(string_literal78);
					dbg.location(71,33);
					WS79=(Token)match(input,WS,FOLLOW_WS_in_command712);  
					stream_WS.add(WS79);
					dbg.location(71,36);
					pushFollow(FOLLOW_commands_in_command714);
					commands80=commands();
					state._fsp--;

					stream_commands.add(commands80.getTree());dbg.location(71,45);
					WS81=(Token)match(input,WS,FOLLOW_WS_in_command716);  
					stream_WS.add(WS81);
					dbg.location(71,48);
					string_literal82=(Token)match(input,60,FOLLOW_60_in_command718);  
					stream_60.add(string_literal82);

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
					// 71:54: -> ^( N_For expression ^( N_Commands commands ) )
					{
						dbg.location(71,57);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:57: ^( N_For expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(71,59);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_For, "N_For"), root_1);
						dbg.location(71,65);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(71,76);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:71:76: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(71,78);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(71,89);
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:72:4: ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' )
					{
					dbg.location(72,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:72:4: ( 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:72:5: 'foreach' WS Variable WS 'in' WS expression WS 'do' WS commands WS 'od'
					{
					dbg.location(72,5);
					string_literal83=(Token)match(input,51,FOLLOW_51_in_command739);  
					stream_51.add(string_literal83);
					dbg.location(72,15);
					WS84=(Token)match(input,WS,FOLLOW_WS_in_command741);  
					stream_WS.add(WS84);
					dbg.location(72,18);
					Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_command743);  
					stream_Variable.add(Variable85);
					dbg.location(72,27);
					WS86=(Token)match(input,WS,FOLLOW_WS_in_command745);  
					stream_WS.add(WS86);
					dbg.location(72,30);
					string_literal87=(Token)match(input,55,FOLLOW_55_in_command747);  
					stream_55.add(string_literal87);
					dbg.location(72,35);
					WS88=(Token)match(input,WS,FOLLOW_WS_in_command749);  
					stream_WS.add(WS88);
					dbg.location(72,38);
					pushFollow(FOLLOW_expression_in_command751);
					expression89=expression();
					state._fsp--;

					stream_expression.add(expression89.getTree());dbg.location(72,49);
					WS90=(Token)match(input,WS,FOLLOW_WS_in_command753);  
					stream_WS.add(WS90);
					dbg.location(72,52);
					string_literal91=(Token)match(input,47,FOLLOW_47_in_command755);  
					stream_47.add(string_literal91);
					dbg.location(72,57);
					WS92=(Token)match(input,WS,FOLLOW_WS_in_command757);  
					stream_WS.add(WS92);
					dbg.location(72,60);
					pushFollow(FOLLOW_commands_in_command759);
					commands93=commands();
					state._fsp--;

					stream_commands.add(commands93.getTree());dbg.location(72,69);
					WS94=(Token)match(input,WS,FOLLOW_WS_in_command761);  
					stream_WS.add(WS94);
					dbg.location(72,72);
					string_literal95=(Token)match(input,60,FOLLOW_60_in_command763);  
					stream_60.add(string_literal95);

					}

					// AST REWRITE
					// elements: Variable, expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 72:78: -> ^( N_Foreach Variable expression ^( N_Commands commands ) )
					{
						dbg.location(72,81);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:72:81: ^( N_Foreach Variable expression ^( N_Commands commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(72,83);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Foreach, "N_Foreach"), root_1);
						dbg.location(72,93);
						adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(72,102);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(72,113);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:72:113: ^( N_Commands commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(72,115);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Commands, "N_Commands"), root_2);
						dbg.location(72,126);
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
		dbg.location(72, 135);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:74:1: vars : ( ( Variable ( WS )? ',' ( WS )? vars ) -> Variable vars | Variable -> Variable );
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
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:74:7: ( ( Variable ( WS )? ',' ( WS )? vars ) -> Variable vars | Variable -> Variable )
			int alt27=2;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==Variable) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA27_2 = input.LA(3);
					if ( (LA27_2==41) ) {
						alt27=1;
					}
					else if ( (LA27_2==43) ) {
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
				case 41:
					{
					alt27=1;
					}
					break;
				case 43:
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:4: ( Variable ( WS )? ',' ( WS )? vars )
					{
					dbg.location(75,4);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:4: ( Variable ( WS )? ',' ( WS )? vars )
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:5: Variable ( WS )? ',' ( WS )? vars
					{
					dbg.location(75,5);
					Variable96=(Token)match(input,Variable,FOLLOW_Variable_in_vars795);  
					stream_Variable.add(Variable96);
					dbg.location(75,14);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:14: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:14: WS
							{
							dbg.location(75,14);
							WS97=(Token)match(input,WS,FOLLOW_WS_in_vars797);  
							stream_WS.add(WS97);

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(75,18);
					char_literal98=(Token)match(input,41,FOLLOW_41_in_vars800);  
					stream_41.add(char_literal98);
					dbg.location(75,22);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:22: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:75:22: WS
							{
							dbg.location(75,22);
							WS99=(Token)match(input,WS,FOLLOW_WS_in_vars802);  
							stream_WS.add(WS99);

							}
							break;

					}
					} finally {dbg.exitSubRule(26);}
					dbg.location(75,26);
					pushFollow(FOLLOW_vars_in_vars805);
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
					// 75:32: -> Variable vars
					{
						dbg.location(75,35);
						adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(75,44);
						adaptor.addChild(root_0, stream_vars.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:76:4: Variable
					{
					dbg.location(76,4);
					Variable101=(Token)match(input,Variable,FOLLOW_Variable_in_vars817);  
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
					// 76:13: -> Variable
					{
						dbg.location(76,16);
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
		dbg.location(76, 23);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:1: exprs : expression ( ( WS )? ',' ( WS )? expression )* -> ( expression )+ ;
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
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:8: ( expression ( ( WS )? ',' ( WS )? expression )* -> ( expression )+ )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:10: expression ( ( WS )? ',' ( WS )? expression )*
			{
			dbg.location(79,10);
			pushFollow(FOLLOW_expression_in_exprs832);
			expression102=expression();
			state._fsp--;

			stream_expression.add(expression102.getTree());dbg.location(79,21);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:21: ( ( WS )? ',' ( WS )? expression )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==41) ) {
						alt30=1;
					}

				}
				else if ( (LA30_0==41) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:22: ( WS )? ',' ( WS )? expression
					{
					dbg.location(79,22);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:22: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:22: WS
							{
							dbg.location(79,22);
							WS103=(Token)match(input,WS,FOLLOW_WS_in_exprs835);  
							stream_WS.add(WS103);

							}
							break;

					}
					} finally {dbg.exitSubRule(28);}
					dbg.location(79,26);
					char_literal104=(Token)match(input,41,FOLLOW_41_in_exprs838);  
					stream_41.add(char_literal104);
					dbg.location(79,30);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:30: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:79:30: WS
							{
							dbg.location(79,30);
							WS105=(Token)match(input,WS,FOLLOW_WS_in_exprs840);  
							stream_WS.add(WS105);

							}
							break;

					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(79,34);
					pushFollow(FOLLOW_expression_in_exprs843);
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
			// 79:47: -> ( expression )+
			{
				dbg.location(79,50);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					dbg.location(79,50);
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
		dbg.location(79, 60);

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
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:81:1: expression : e1= exprbase ( ' = ' e2= exprbase -> ^( N_Expression ^( EQUALS $e1 $e2) ) | -> ^( N_Expression $e1) ) ;
	public final WhileCompilerParser.expression_return expression() throws RecognitionException {
		WhileCompilerParser.expression_return retval = new WhileCompilerParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal107=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object string_literal107_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:2: (e1= exprbase ( ' = ' e2= exprbase -> ^( N_Expression ^( EQUALS $e1 $e2) ) | -> ^( N_Expression $e1) ) )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:5: e1= exprbase ( ' = ' e2= exprbase -> ^( N_Expression ^( EQUALS $e1 $e2) ) | -> ^( N_Expression $e1) )
			{
			dbg.location(82,7);
			pushFollow(FOLLOW_exprbase_in_expression864);
			e1=exprbase();
			state._fsp--;

			stream_exprbase.add(e1.getTree());dbg.location(82,16);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:82:16: ( ' = ' e2= exprbase -> ^( N_Expression ^( EQUALS $e1 $e2) ) | -> ^( N_Expression $e1) )
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==37) ) {
				alt31=1;
			}
			else if ( (LA31_0==WS||LA31_0==41||LA31_0==44) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:3: ' = ' e2= exprbase
					{
					dbg.location(83,3);
					string_literal107=(Token)match(input,37,FOLLOW_37_in_expression869);  
					stream_37.add(string_literal107);
					dbg.location(83,10);
					pushFollow(FOLLOW_exprbase_in_expression872);
					e2=exprbase();
					state._fsp--;

					stream_exprbase.add(e2.getTree());
					// AST REWRITE
					// elements: e2, e1
					// token labels: 
					// rule labels: e1, e2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:20: -> ^( N_Expression ^( EQUALS $e1 $e2) )
					{
						dbg.location(83,23);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:23: ^( N_Expression ^( EQUALS $e1 $e2) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(83,25);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Expression, "N_Expression"), root_1);
						dbg.location(83,38);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:83:38: ^( EQUALS $e1 $e2)
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(83,40);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQUALS, "EQUALS"), root_2);
						dbg.location(83,48);
						adaptor.addChild(root_2, stream_e1.nextTree());dbg.location(83,52);
						adaptor.addChild(root_2, stream_e2.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:5: 
					{
					// AST REWRITE
					// elements: e1
					// token labels: 
					// rule labels: e1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:5: -> ^( N_Expression $e1)
					{
						dbg.location(84,8);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:84:8: ^( N_Expression $e1)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(84,10);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Expression, "N_Expression"), root_1);
						dbg.location(84,24);
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}

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
		dbg.location(85, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class exprbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:87:1: exprbase : ( '(' ( WS )? ( Symbol WS lexpr ')' -> ^( N_Call ^( Symbol lexpr ) ) | Symbol ')' -> ^( N_Call Symbol ) | 'hd ' exprbase ( WS )? ')' -> ^( N_Hd exprbase ) | 'tl ' exprbase ( WS )? ')' -> ^( N_Tl exprbase ) | 'cons' ( WS )? ')' -> ^( N_Cons ) | 'cons ' lexpr ')' -> ^( N_Cons lexpr ) | 'list' ( WS )? ')' -> ^( N_List ) | 'list ' lexpr ')' -> ^( N_List lexpr ) ) | 'nil' -> N_Nil | Variable -> ^( N_Variable Variable ) | Symbol -> ^( N_Symbol Symbol ) );
	public final WhileCompilerParser.exprbase_return exprbase() throws RecognitionException {
		WhileCompilerParser.exprbase_return retval = new WhileCompilerParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal108=null;
		Token WS109=null;
		Token Symbol110=null;
		Token WS111=null;
		Token char_literal113=null;
		Token Symbol114=null;
		Token char_literal115=null;
		Token string_literal116=null;
		Token WS118=null;
		Token char_literal119=null;
		Token string_literal120=null;
		Token WS122=null;
		Token char_literal123=null;
		Token string_literal124=null;
		Token WS125=null;
		Token char_literal126=null;
		Token string_literal127=null;
		Token char_literal129=null;
		Token string_literal130=null;
		Token WS131=null;
		Token char_literal132=null;
		Token string_literal133=null;
		Token char_literal135=null;
		Token string_literal136=null;
		Token Variable137=null;
		Token Symbol138=null;
		ParserRuleReturnScope lexpr112 =null;
		ParserRuleReturnScope exprbase117 =null;
		ParserRuleReturnScope exprbase121 =null;
		ParserRuleReturnScope lexpr128 =null;
		ParserRuleReturnScope lexpr134 =null;

		Object char_literal108_tree=null;
		Object WS109_tree=null;
		Object Symbol110_tree=null;
		Object WS111_tree=null;
		Object char_literal113_tree=null;
		Object Symbol114_tree=null;
		Object char_literal115_tree=null;
		Object string_literal116_tree=null;
		Object WS118_tree=null;
		Object char_literal119_tree=null;
		Object string_literal120_tree=null;
		Object WS122_tree=null;
		Object char_literal123_tree=null;
		Object string_literal124_tree=null;
		Object WS125_tree=null;
		Object char_literal126_tree=null;
		Object string_literal127_tree=null;
		Object char_literal129_tree=null;
		Object string_literal130_tree=null;
		Object WS131_tree=null;
		Object char_literal132_tree=null;
		Object string_literal133_tree=null;
		Object char_literal135_tree=null;
		Object string_literal136_tree=null;
		Object Variable137_tree=null;
		Object Symbol138_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:88:2: ( '(' ( WS )? ( Symbol WS lexpr ')' -> ^( N_Call ^( Symbol lexpr ) ) | Symbol ')' -> ^( N_Call Symbol ) | 'hd ' exprbase ( WS )? ')' -> ^( N_Hd exprbase ) | 'tl ' exprbase ( WS )? ')' -> ^( N_Tl exprbase ) | 'cons' ( WS )? ')' -> ^( N_Cons ) | 'cons ' lexpr ')' -> ^( N_Cons lexpr ) | 'list' ( WS )? ')' -> ^( N_List ) | 'list ' lexpr ')' -> ^( N_List lexpr ) ) | 'nil' -> N_Nil | Variable -> ^( N_Variable Variable ) | Symbol -> ^( N_Symbol Symbol ) )
			int alt38=4;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case 39:
				{
				alt38=1;
				}
				break;
			case 58:
				{
				alt38=2;
				}
				break;
			case Variable:
				{
				alt38=3;
				}
				break;
			case Symbol:
				{
				alt38=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:88:5: '(' ( WS )? ( Symbol WS lexpr ')' -> ^( N_Call ^( Symbol lexpr ) ) | Symbol ')' -> ^( N_Call Symbol ) | 'hd ' exprbase ( WS )? ')' -> ^( N_Hd exprbase ) | 'tl ' exprbase ( WS )? ')' -> ^( N_Tl exprbase ) | 'cons' ( WS )? ')' -> ^( N_Cons ) | 'cons ' lexpr ')' -> ^( N_Cons lexpr ) | 'list' ( WS )? ')' -> ^( N_List ) | 'list ' lexpr ')' -> ^( N_List lexpr ) )
					{
					dbg.location(88,5);
					char_literal108=(Token)match(input,39,FOLLOW_39_in_exprbase915);  
					stream_39.add(char_literal108);
					dbg.location(88,9);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:88:9: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:88:9: WS
							{
							dbg.location(88,9);
							WS109=(Token)match(input,WS,FOLLOW_WS_in_exprbase917);  
							stream_WS.add(WS109);

							}
							break;

					}
					} finally {dbg.exitSubRule(32);}
					dbg.location(88,13);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:88:13: ( Symbol WS lexpr ')' -> ^( N_Call ^( Symbol lexpr ) ) | Symbol ')' -> ^( N_Call Symbol ) | 'hd ' exprbase ( WS )? ')' -> ^( N_Hd exprbase ) | 'tl ' exprbase ( WS )? ')' -> ^( N_Tl exprbase ) | 'cons' ( WS )? ')' -> ^( N_Cons ) | 'cons ' lexpr ')' -> ^( N_Cons lexpr ) | 'list' ( WS )? ')' -> ^( N_List ) | 'list ' lexpr ')' -> ^( N_List lexpr ) )
					int alt37=8;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					switch ( input.LA(1) ) {
					case Symbol:
						{
						int LA37_1 = input.LA(2);
						if ( (LA37_1==WS) ) {
							alt37=1;
						}
						else if ( (LA37_1==40) ) {
							alt37=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 37, 1, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 53:
						{
						alt37=3;
						}
						break;
					case 63:
						{
						alt37=4;
						}
						break;
					case 46:
						{
						alt37=5;
						}
						break;
					case 45:
						{
						alt37=6;
						}
						break;
					case 57:
						{
						alt37=7;
						}
						break;
					case 56:
						{
						alt37=8;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:89:5: Symbol WS lexpr ')'
							{
							dbg.location(89,5);
							Symbol110=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprbase926);  
							stream_Symbol.add(Symbol110);
							dbg.location(89,12);
							WS111=(Token)match(input,WS,FOLLOW_WS_in_exprbase928);  
							stream_WS.add(WS111);
							dbg.location(89,15);
							pushFollow(FOLLOW_lexpr_in_exprbase930);
							lexpr112=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr112.getTree());dbg.location(89,20);
							char_literal113=(Token)match(input,40,FOLLOW_40_in_exprbase931);  
							stream_40.add(char_literal113);

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
							// 89:24: -> ^( N_Call ^( Symbol lexpr ) )
							{
								dbg.location(89,27);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:89:27: ^( N_Call ^( Symbol lexpr ) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(89,29);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Call, "N_Call"), root_1);
								dbg.location(89,36);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:89:36: ^( Symbol lexpr )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(89,38);
								root_2 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_2);
								dbg.location(89,45);
								adaptor.addChild(root_2, stream_lexpr.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:90:5: Symbol ')'
							{
							dbg.location(90,5);
							Symbol114=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprbase949);  
							stream_Symbol.add(Symbol114);
							dbg.location(90,11);
							char_literal115=(Token)match(input,40,FOLLOW_40_in_exprbase950);  
							stream_40.add(char_literal115);

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
							// 90:15: -> ^( N_Call Symbol )
							{
								dbg.location(90,18);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:90:18: ^( N_Call Symbol )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(90,20);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Call, "N_Call"), root_1);
								dbg.location(90,27);
								adaptor.addChild(root_1, stream_Symbol.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:91:4: 'hd ' exprbase ( WS )? ')'
							{
							dbg.location(91,4);
							string_literal116=(Token)match(input,53,FOLLOW_53_in_exprbase963);  
							stream_53.add(string_literal116);
							dbg.location(91,9);
							pushFollow(FOLLOW_exprbase_in_exprbase964);
							exprbase117=exprbase();
							state._fsp--;

							stream_exprbase.add(exprbase117.getTree());dbg.location(91,18);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:91:18: ( WS )?
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

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:91:18: WS
									{
									dbg.location(91,18);
									WS118=(Token)match(input,WS,FOLLOW_WS_in_exprbase966);  
									stream_WS.add(WS118);

									}
									break;

							}
							} finally {dbg.exitSubRule(33);}
							dbg.location(91,21);
							char_literal119=(Token)match(input,40,FOLLOW_40_in_exprbase968);  
							stream_40.add(char_literal119);

							// AST REWRITE
							// elements: exprbase
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 91:25: -> ^( N_Hd exprbase )
							{
								dbg.location(91,28);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:91:28: ^( N_Hd exprbase )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(91,30);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Hd, "N_Hd"), root_1);
								dbg.location(91,35);
								adaptor.addChild(root_1, stream_exprbase.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:92:4: 'tl ' exprbase ( WS )? ')'
							{
							dbg.location(92,4);
							string_literal120=(Token)match(input,63,FOLLOW_63_in_exprbase981);  
							stream_63.add(string_literal120);
							dbg.location(92,9);
							pushFollow(FOLLOW_exprbase_in_exprbase982);
							exprbase121=exprbase();
							state._fsp--;

							stream_exprbase.add(exprbase121.getTree());dbg.location(92,18);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:92:18: ( WS )?
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

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:92:18: WS
									{
									dbg.location(92,18);
									WS122=(Token)match(input,WS,FOLLOW_WS_in_exprbase984);  
									stream_WS.add(WS122);

									}
									break;

							}
							} finally {dbg.exitSubRule(34);}
							dbg.location(92,21);
							char_literal123=(Token)match(input,40,FOLLOW_40_in_exprbase986);  
							stream_40.add(char_literal123);

							// AST REWRITE
							// elements: exprbase
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 92:25: -> ^( N_Tl exprbase )
							{
								dbg.location(92,28);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:92:28: ^( N_Tl exprbase )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(92,30);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Tl, "N_Tl"), root_1);
								dbg.location(92,35);
								adaptor.addChild(root_1, stream_exprbase.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:93:4: 'cons' ( WS )? ')'
							{
							dbg.location(93,4);
							string_literal124=(Token)match(input,46,FOLLOW_46_in_exprbase999);  
							stream_46.add(string_literal124);
							dbg.location(93,11);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:93:11: ( WS )?
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

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:93:11: WS
									{
									dbg.location(93,11);
									WS125=(Token)match(input,WS,FOLLOW_WS_in_exprbase1001);  
									stream_WS.add(WS125);

									}
									break;

							}
							} finally {dbg.exitSubRule(35);}
							dbg.location(93,15);
							char_literal126=(Token)match(input,40,FOLLOW_40_in_exprbase1004);  
							stream_40.add(char_literal126);

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
							// 93:19: -> ^( N_Cons )
							{
								dbg.location(93,22);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:93:22: ^( N_Cons )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(93,24);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Cons, "N_Cons"), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 6 :
							dbg.enterAlt(6);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:94:4: 'cons ' lexpr ')'
							{
							dbg.location(94,4);
							string_literal127=(Token)match(input,45,FOLLOW_45_in_exprbase1015);  
							stream_45.add(string_literal127);
							dbg.location(94,11);
							pushFollow(FOLLOW_lexpr_in_exprbase1016);
							lexpr128=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr128.getTree());dbg.location(94,16);
							char_literal129=(Token)match(input,40,FOLLOW_40_in_exprbase1017);  
							stream_40.add(char_literal129);

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
							// 94:20: -> ^( N_Cons lexpr )
							{
								dbg.location(94,23);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:94:23: ^( N_Cons lexpr )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(94,25);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Cons, "N_Cons"), root_1);
								dbg.location(94,32);
								adaptor.addChild(root_1, stream_lexpr.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 7 :
							dbg.enterAlt(7);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:95:4: 'list' ( WS )? ')'
							{
							dbg.location(95,4);
							string_literal130=(Token)match(input,57,FOLLOW_57_in_exprbase1030);  
							stream_57.add(string_literal130);
							dbg.location(95,11);
							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:95:11: ( WS )?
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

									// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:95:11: WS
									{
									dbg.location(95,11);
									WS131=(Token)match(input,WS,FOLLOW_WS_in_exprbase1032);  
									stream_WS.add(WS131);

									}
									break;

							}
							} finally {dbg.exitSubRule(36);}
							dbg.location(95,15);
							char_literal132=(Token)match(input,40,FOLLOW_40_in_exprbase1035);  
							stream_40.add(char_literal132);

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
							// 95:19: -> ^( N_List )
							{
								dbg.location(95,22);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:95:22: ^( N_List )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(95,24);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_List, "N_List"), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 8 :
							dbg.enterAlt(8);

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:96:4: 'list ' lexpr ')'
							{
							dbg.location(96,4);
							string_literal133=(Token)match(input,56,FOLLOW_56_in_exprbase1046);  
							stream_56.add(string_literal133);
							dbg.location(96,11);
							pushFollow(FOLLOW_lexpr_in_exprbase1047);
							lexpr134=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr134.getTree());dbg.location(96,16);
							char_literal135=(Token)match(input,40,FOLLOW_40_in_exprbase1048);  
							stream_40.add(char_literal135);

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
							// 96:20: -> ^( N_List lexpr )
							{
								dbg.location(96,23);
								// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:96:23: ^( N_List lexpr )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(96,25);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_List, "N_List"), root_1);
								dbg.location(96,32);
								adaptor.addChild(root_1, stream_lexpr.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(37);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:98:4: 'nil'
					{
					dbg.location(98,4);
					string_literal136=(Token)match(input,58,FOLLOW_58_in_exprbase1065);  
					stream_58.add(string_literal136);

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
					// 98:10: -> N_Nil
					{
						dbg.location(98,13);
						adaptor.addChild(root_0, (Object)adaptor.create(N_Nil, "N_Nil"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:99:5: Variable
					{
					dbg.location(99,5);
					Variable137=(Token)match(input,Variable,FOLLOW_Variable_in_exprbase1075);  
					stream_Variable.add(Variable137);

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
					// 99:14: -> ^( N_Variable Variable )
					{
						dbg.location(99,17);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:99:17: ^( N_Variable Variable )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(99,19);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Variable, "N_Variable"), root_1);
						dbg.location(99,30);
						adaptor.addChild(root_1, stream_Variable.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:100:5: Symbol
					{
					dbg.location(100,5);
					Symbol138=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprbase1089);  
					stream_Symbol.add(Symbol138);

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
					// 100:12: -> ^( N_Symbol Symbol )
					{
						dbg.location(100,15);
						// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:100:15: ^( N_Symbol Symbol )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(100,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(N_Symbol, "N_Symbol"), root_1);
						dbg.location(100,26);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
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
		dbg.location(100, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprbase"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:102:2: lexpr : ( ( WS )? ( exprbase ( WS )? )* ) -> ( exprbase )* ;
	public final WhileCompilerParser.lexpr_return lexpr() throws RecognitionException {
		WhileCompilerParser.lexpr_return retval = new WhileCompilerParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS139=null;
		Token WS141=null;
		ParserRuleReturnScope exprbase140 =null;

		Object WS139_tree=null;
		Object WS141_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 1);

		try {
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:5: ( ( ( WS )? ( exprbase ( WS )? )* ) -> ( exprbase )* )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:7: ( ( WS )? ( exprbase ( WS )? )* )
			{
			dbg.location(103,7);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:7: ( ( WS )? ( exprbase ( WS )? )* )
			dbg.enterAlt(1);

			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:8: ( WS )? ( exprbase ( WS )? )*
			{
			dbg.location(103,8);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:8: ( WS )?
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

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:8: WS
					{
					dbg.location(103,8);
					WS139=(Token)match(input,WS,FOLLOW_WS_in_lexpr1112);  
					stream_WS.add(WS139);

					}
					break;

			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(103,12);
			// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:12: ( exprbase ( WS )? )*
			try { dbg.enterSubRule(41);

			loop41:
			while (true) {
				int alt41=2;
				try { dbg.enterDecision(41, decisionCanBacktrack[41]);

				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= Symbol && LA41_0 <= Variable)||LA41_0==39||LA41_0==58) ) {
					alt41=1;
				}

				} finally {dbg.exitDecision(41);}

				switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:13: exprbase ( WS )?
					{
					dbg.location(103,13);
					pushFollow(FOLLOW_exprbase_in_lexpr1116);
					exprbase140=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase140.getTree());dbg.location(103,22);
					// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:22: ( WS )?
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

							// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:22: WS
							{
							dbg.location(103,22);
							WS141=(Token)match(input,WS,FOLLOW_WS_in_lexpr1118);  
							stream_WS.add(WS141);

							}
							break;

					}
					} finally {dbg.exitSubRule(40);}

					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}

			}

			// AST REWRITE
			// elements: exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:29: -> ( exprbase )*
			{
				dbg.location(103,32);
				// C:\\Users\\EyaSammari\\Documents\\TP_ESIR2\\TLC\\Projet TLC final V\\WhileCompiler.g:103:32: ( exprbase )*
				while ( stream_exprbase.hasNext() ) {
					dbg.location(103,32);
					adaptor.addChild(root_0, stream_exprbase.nextTree());
				}
				stream_exprbase.reset();

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
		dbg.location(103, 40);

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



	public static final BitSet FOLLOW_WS_in_program320 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_function_in_program324 = new BitSet(new long[]{0x0010001000000002L});
	public static final BitSet FOLLOW_WS_in_program326 = new BitSet(new long[]{0x0010001000000002L});
	public static final BitSet FOLLOW_52_in_function345 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_function347 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Symbol_in_function349 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_function351 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_function354 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_function356 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_definition_in_function358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_definition377 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition379 = new BitSet(new long[]{0x0000005800000000L});
	public static final BitSet FOLLOW_input_in_definition382 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition384 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition388 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition390 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_definition392 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition394 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition396 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_definition400 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_output_in_definition402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_inputsub449 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_inputsub452 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_inputsub454 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_inputsub457 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_inputsub470 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_inputsub473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_output485 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_output488 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_output490 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_output493 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_output_in_output495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_output506 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_output509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_commands526 = new BitSet(new long[]{0x084C000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_command_in_commands529 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_commands532 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_commands535 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_WS_in_commands537 = new BitSet(new long[]{0x084C000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_command_in_commands540 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_44_in_commands545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command574 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_WS_in_command576 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command579 = new BitSet(new long[]{0x0400009C00000000L});
	public static final BitSet FOLLOW_WS_in_command581 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_exprs_in_command584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_command609 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command611 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_expression_in_command613 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command615 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command617 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command619 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command621 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command623 = new BitSet(new long[]{0x0003001000000000L});
	public static final BitSet FOLLOW_WS_in_command625 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command628 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command629 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command631 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command633 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_command637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_command665 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command667 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_expression_in_command669 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command671 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command673 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command675 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command677 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command679 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command702 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command704 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_expression_in_command706 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command708 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command710 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command712 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command714 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command716 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_command739 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command741 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_command743 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command745 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command747 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command749 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_expression_in_command751 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command753 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command755 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command757 = new BitSet(new long[]{0x084C001800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command759 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_command761 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars795 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_vars797 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_vars800 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_WS_in_vars802 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_vars_in_vars805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs832 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_WS_in_exprs835 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprs838 = new BitSet(new long[]{0x0400009C00000000L});
	public static final BitSet FOLLOW_WS_in_exprs840 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_expression_in_exprs843 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression864 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_expression869 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_exprbase_in_expression872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprbase915 = new BitSet(new long[]{0x8320601400000000L});
	public static final BitSet FOLLOW_WS_in_exprbase917 = new BitSet(new long[]{0x8320600400000000L});
	public static final BitSet FOLLOW_Symbol_in_exprbase926 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_exprbase928 = new BitSet(new long[]{0x0400019C00000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase930 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprbase949 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_exprbase963 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase964 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_exprbase966 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_exprbase981 = new BitSet(new long[]{0x0400008C00000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase982 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_exprbase984 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_exprbase999 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_exprbase1001 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_exprbase1015 = new BitSet(new long[]{0x0400019C00000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase1016 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_exprbase1030 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_exprbase1032 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_exprbase1046 = new BitSet(new long[]{0x0400019C00000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase1047 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_exprbase1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprbase1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprbase1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_lexpr1112 = new BitSet(new long[]{0x0400008C00000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1116 = new BitSet(new long[]{0x0400009C00000002L});
	public static final BitSet FOLLOW_WS_in_lexpr1118 = new BitSet(new long[]{0x0400008C00000002L});
}
