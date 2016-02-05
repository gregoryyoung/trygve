// Generated from info/fulloo/trygve/parser/Kant.g4 by ANTLR 4.5.1

    package info.fulloo.trygve.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KantParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, STRING=35, INTEGER=36, FLOAT=37, BOOLEAN=38, 
		SWITCH=39, CASE=40, DEFAULT=41, BREAK=42, CONTINUE=43, RETURN=44, REQUIRES=45, 
		NEW=46, CLONE=47, NULL=48, CONST=49, POW=50, BOOLEAN_SUMOP=51, BOOLEAN_MULOP=52, 
		ABELIAN_SUMOP=53, ABELIAN_MULOP=54, MINUS=55, PLUS=56, LT=57, GT=58, LOGICAL_NEGATION=59, 
		ABELIAN_INCREMENT_OP=60, JAVA_ID=61, INLINE_COMMENT=62, C_COMMENT=63, 
		WHITESPACE=64, ASSIGN=65;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_type_declaration_list = 2, RULE_type_declaration = 3, 
		RULE_context_declaration = 4, RULE_class_declaration = 5, RULE_interface_declaration = 6, 
		RULE_implements_list = 7, RULE_type_parameters = 8, RULE_type_list = 9, 
		RULE_type_parameter = 10, RULE_context_body = 11, RULE_context_body_element = 12, 
		RULE_role_decl = 13, RULE_role_vec_modifier = 14, RULE_role_body = 15, 
		RULE_self_methods = 16, RULE_stageprop_decl = 17, RULE_stageprop_body = 18, 
		RULE_class_body = 19, RULE_class_body_element = 20, RULE_interface_body = 21, 
		RULE_method_decl = 22, RULE_method_decl_hook = 23, RULE_method_signature = 24, 
		RULE_expr_and_decl_list = 25, RULE_type_and_expr_and_decl_list = 26, RULE_return_type = 27, 
		RULE_method_name = 28, RULE_access_qualifier = 29, RULE_object_decl = 30, 
		RULE_trivial_object_decl = 31, RULE_compound_type_name = 32, RULE_type_name = 33, 
		RULE_builtin_type_name = 34, RULE_identifier_list = 35, RULE_param_list = 36, 
		RULE_param_decl = 37, RULE_expr = 38, RULE_abelian_expr = 39, RULE_abelian_product = 40, 
		RULE_abelian_unary_op = 41, RULE_abelian_atom = 42, RULE_boolean_expr = 43, 
		RULE_boolean_product = 44, RULE_boolean_unary_op = 45, RULE_boolean_atom = 46, 
		RULE_message = 47, RULE_block = 48, RULE_expr_or_null = 49, RULE_if_expr = 50, 
		RULE_for_expr = 51, RULE_while_expr = 52, RULE_do_while_expr = 53, RULE_switch_expr = 54, 
		RULE_switch_body = 55, RULE_null_expr = 56, RULE_constant = 57, RULE_argument_list = 58;
	public static final String[] ruleNames = {
		"program", "main", "type_declaration_list", "type_declaration", "context_declaration", 
		"class_declaration", "interface_declaration", "implements_list", "type_parameters", 
		"type_list", "type_parameter", "context_body", "context_body_element", 
		"role_decl", "role_vec_modifier", "role_body", "self_methods", "stageprop_decl", 
		"stageprop_body", "class_body", "class_body_element", "interface_body", 
		"method_decl", "method_decl_hook", "method_signature", "expr_and_decl_list", 
		"type_and_expr_and_decl_list", "return_type", "method_name", "access_qualifier", 
		"object_decl", "trivial_object_decl", "compound_type_name", "type_name", 
		"builtin_type_name", "identifier_list", "param_list", "param_decl", "expr", 
		"abelian_expr", "abelian_product", "abelian_unary_op", "abelian_atom", 
		"boolean_expr", "boolean_product", "boolean_unary_op", "boolean_atom", 
		"message", "block", "expr_or_null", "if_expr", "for_expr", "while_expr", 
		"do_while_expr", "switch_expr", "switch_body", "null_expr", "constant", 
		"argument_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'context'", "'{'", "'}'", "'class'", "'extends'", "'interface'", 
		"'implements'", "','", "'role'", "'['", "']'", "';'", "'stageprop'", "'('", 
		"')'", "'public'", "'private'", "'int'", "'double'", "'char'", "'String'", 
		"'.'", "'||'", "'^'", "'!='", "'=='", "'>='", "'<='", "'if'", "'else'", 
		"'for'", "':'", "'while'", "'do'", null, null, null, null, "'switch'", 
		"'case'", "'default'", "'break'", "'continue'", "'return'", "'requires'", 
		"'new'", "'clone'", "'null'", "'const'", "'**'", null, "'&&'", null, null, 
		"'-'", "'+'", "'<'", "'>'", "'!'", null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "STRING", 
		"INTEGER", "FLOAT", "BOOLEAN", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
		"RETURN", "REQUIRES", "NEW", "CLONE", "NULL", "CONST", "POW", "BOOLEAN_SUMOP", 
		"BOOLEAN_MULOP", "ABELIAN_SUMOP", "ABELIAN_MULOP", "MINUS", "PLUS", "LT", 
		"GT", "LOGICAL_NEGATION", "ABELIAN_INCREMENT_OP", "JAVA_ID", "INLINE_COMMENT", 
		"C_COMMENT", "WHITESPACE", "ASSIGN"
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
	public String getGrammarFileName() { return "Kant.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KantParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Type_declaration_listContext type_declaration_list() {
			return getRuleContext(Type_declaration_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				type_declaration_list(0);
				setState(119);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				type_declaration_list(0);
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

	public static class MainContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expr();
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

	public static class Type_declaration_listContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Type_declaration_listContext type_declaration_list() {
			return getRuleContext(Type_declaration_listContext.class,0);
		}
		public Type_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_declaration_list(this);
		}
	}

	public final Type_declaration_listContext type_declaration_list() throws RecognitionException {
		return type_declaration_list(0);
	}

	private Type_declaration_listContext type_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_declaration_listContext _localctx = new Type_declaration_listContext(_ctx, _parentState);
		Type_declaration_listContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_type_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(127);
				type_declaration();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_declaration_list);
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					type_declaration();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Type_declarationContext extends ParserRuleContext {
		public Context_declarationContext context_declaration() {
			return getRuleContext(Context_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_declaration(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_declaration);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				context_declaration();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				class_declaration();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				interface_declaration();
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

	public static class Context_declarationContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Context_bodyContext context_body() {
			return getRuleContext(Context_bodyContext.class,0);
		}
		public Context_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterContext_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitContext_declaration(this);
		}
	}

	public final Context_declarationContext context_declaration() throws RecognitionException {
		Context_declarationContext _localctx = new Context_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_context_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			setState(144);
			match(JAVA_ID);
			setState(145);
			match(T__1);
			setState(146);
			context_body(0);
			setState(147);
			match(T__2);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public List<TerminalNode> JAVA_ID() { return getTokens(KantParser.JAVA_ID); }
		public TerminalNode JAVA_ID(int i) {
			return getToken(KantParser.JAVA_ID, i);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public List<Implements_listContext> implements_list() {
			return getRuleContexts(Implements_listContext.class);
		}
		public Implements_listContext implements_list(int i) {
			return getRuleContext(Implements_listContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_declaration);
		int _la;
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__3);
				setState(150);
				match(JAVA_ID);
				setState(151);
				type_parameters();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(152);
					implements_list(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__1);
				setState(159);
				class_body(0);
				setState(160);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__3);
				setState(163);
				match(JAVA_ID);
				setState(164);
				type_parameters();
				setState(165);
				match(T__4);
				setState(166);
				match(JAVA_ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(167);
					implements_list(0);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__1);
				setState(174);
				class_body(0);
				setState(175);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__3);
				setState(178);
				match(JAVA_ID);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(179);
					implements_list(0);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__1);
				setState(186);
				class_body(0);
				setState(187);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(T__3);
				setState(190);
				match(JAVA_ID);
				setState(191);
				match(T__4);
				setState(192);
				match(JAVA_ID);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(193);
					implements_list(0);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__1);
				setState(200);
				class_body(0);
				setState(201);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(T__3);
				setState(204);
				match(JAVA_ID);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(205);
					implements_list(0);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__4);
				setState(212);
				match(JAVA_ID);
				setState(213);
				match(T__1);
				setState(214);
				class_body(0);
				setState(215);
				match(T__2);
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

	public static class Interface_declarationContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitInterface_declaration(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interface_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__5);
			setState(220);
			match(JAVA_ID);
			setState(221);
			match(T__1);
			setState(222);
			interface_body(0);
			setState(223);
			match(T__2);
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

	public static class Implements_listContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Implements_listContext implements_list() {
			return getRuleContext(Implements_listContext.class,0);
		}
		public Implements_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterImplements_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitImplements_list(this);
		}
	}

	public final Implements_listContext implements_list() throws RecognitionException {
		return implements_list(0);
	}

	private Implements_listContext implements_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Implements_listContext _localctx = new Implements_listContext(_ctx, _parentState);
		Implements_listContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_implements_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			match(T__6);
			setState(227);
			match(JAVA_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Implements_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implements_list);
					setState(229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(230);
					match(T__7);
					setState(231);
					match(JAVA_ID);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Type_parametersContext extends ParserRuleContext {
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public Type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_parameters(this);
		}
	}

	public final Type_parametersContext type_parameters() throws RecognitionException {
		Type_parametersContext _localctx = new Type_parametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LT);
			setState(238);
			type_parameter();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(239);
				match(T__7);
				setState(240);
				type_parameter();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(GT);
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

	public static class Type_listContext extends ParserRuleContext {
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_list(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LT);
			setState(249);
			type_name();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(250);
				match(T__7);
				setState(251);
				type_name();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(GT);
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

	public static class Type_parameterContext extends ParserRuleContext {
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_parameter(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			type_name();
			setState(262);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(260);
				match(T__4);
				setState(261);
				type_name();
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

	public static class Context_bodyContext extends ParserRuleContext {
		public Context_body_elementContext context_body_element() {
			return getRuleContext(Context_body_elementContext.class,0);
		}
		public Context_bodyContext context_body() {
			return getRuleContext(Context_bodyContext.class,0);
		}
		public Context_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterContext_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitContext_body(this);
		}
	}

	public final Context_bodyContext context_body() throws RecognitionException {
		return context_body(0);
	}

	private Context_bodyContext context_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Context_bodyContext _localctx = new Context_bodyContext(_ctx, _parentState);
		Context_bodyContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_context_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(265);
				context_body_element();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Context_bodyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_context_body);
					setState(269);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(270);
					context_body_element();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Context_body_elementContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public Role_declContext role_decl() {
			return getRuleContext(Role_declContext.class,0);
		}
		public Stageprop_declContext stageprop_decl() {
			return getRuleContext(Stageprop_declContext.class,0);
		}
		public Context_declarationContext context_declaration() {
			return getRuleContext(Context_declarationContext.class,0);
		}
		public Context_body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterContext_body_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitContext_body_element(this);
		}
	}

	public final Context_body_elementContext context_body_element() throws RecognitionException {
		Context_body_elementContext _localctx = new Context_body_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_context_body_element);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				method_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				object_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				role_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				stageprop_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				context_declaration();
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

	public static class Role_declContext extends ParserRuleContext {
		public Role_vec_modifierContext role_vec_modifier() {
			return getRuleContext(Role_vec_modifierContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Role_bodyContext role_body() {
			return getRuleContext(Role_bodyContext.class,0);
		}
		public TerminalNode REQUIRES() { return getToken(KantParser.REQUIRES, 0); }
		public Self_methodsContext self_methods() {
			return getRuleContext(Self_methodsContext.class,0);
		}
		public Access_qualifierContext access_qualifier() {
			return getRuleContext(Access_qualifierContext.class,0);
		}
		public Role_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterRole_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitRole_decl(this);
		}
	}

	public final Role_declContext role_decl() throws RecognitionException {
		Role_declContext _localctx = new Role_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_role_decl);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__8);
				setState(284);
				role_vec_modifier();
				setState(285);
				match(JAVA_ID);
				setState(286);
				match(T__1);
				setState(287);
				role_body(0);
				setState(288);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__8);
				setState(291);
				role_vec_modifier();
				setState(292);
				match(JAVA_ID);
				setState(293);
				match(T__1);
				setState(294);
				role_body(0);
				setState(295);
				match(T__2);
				setState(296);
				match(REQUIRES);
				setState(297);
				match(T__1);
				setState(298);
				self_methods(0);
				setState(299);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				access_qualifier();
				setState(302);
				match(T__8);
				setState(303);
				role_vec_modifier();
				setState(304);
				match(JAVA_ID);
				setState(305);
				match(T__1);
				setState(306);
				role_body(0);
				setState(307);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				access_qualifier();
				setState(310);
				match(T__8);
				setState(311);
				role_vec_modifier();
				setState(312);
				match(JAVA_ID);
				setState(313);
				match(T__1);
				setState(314);
				role_body(0);
				setState(315);
				match(T__2);
				setState(316);
				match(REQUIRES);
				setState(317);
				match(T__1);
				setState(318);
				self_methods(0);
				setState(319);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(T__8);
				setState(322);
				role_vec_modifier();
				setState(323);
				match(JAVA_ID);
				setState(324);
				match(T__1);
				setState(325);
				role_body(0);
				setState(326);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(T__8);
				setState(329);
				role_vec_modifier();
				setState(330);
				match(JAVA_ID);
				setState(331);
				match(T__1);
				setState(332);
				role_body(0);
				setState(333);
				match(T__2);
				setState(334);
				match(REQUIRES);
				setState(335);
				match(T__1);
				setState(336);
				self_methods(0);
				setState(337);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				access_qualifier();
				setState(340);
				match(T__8);
				setState(341);
				role_vec_modifier();
				setState(342);
				match(JAVA_ID);
				setState(343);
				match(T__1);
				setState(344);
				role_body(0);
				setState(345);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(347);
				access_qualifier();
				setState(348);
				match(T__8);
				setState(349);
				role_vec_modifier();
				setState(350);
				match(JAVA_ID);
				setState(351);
				match(T__1);
				setState(352);
				role_body(0);
				setState(353);
				match(T__2);
				setState(354);
				match(REQUIRES);
				setState(355);
				match(T__1);
				setState(356);
				self_methods(0);
				setState(357);
				match(T__2);
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

	public static class Role_vec_modifierContext extends ParserRuleContext {
		public Role_vec_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_vec_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterRole_vec_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitRole_vec_modifier(this);
		}
	}

	public final Role_vec_modifierContext role_vec_modifier() throws RecognitionException {
		Role_vec_modifierContext _localctx = new Role_vec_modifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_role_vec_modifier);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__9);
				setState(362);
				match(T__10);
				}
				break;
			case JAVA_ID:
				enterOuterAlt(_localctx, 2);
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

	public static class Role_bodyContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public Role_bodyContext role_body() {
			return getRuleContext(Role_bodyContext.class,0);
		}
		public Role_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterRole_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitRole_body(this);
		}
	}

	public final Role_bodyContext role_body() throws RecognitionException {
		return role_body(0);
	}

	private Role_bodyContext role_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Role_bodyContext _localctx = new Role_bodyContext(_ctx, _parentState);
		Role_bodyContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_role_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(367);
				method_decl();
				}
				break;
			case 2:
				{
				setState(368);
				object_decl();
				}
				break;
			case 3:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Role_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_role_body);
						setState(372);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(373);
						method_decl();
						}
						break;
					case 2:
						{
						_localctx = new Role_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_role_body);
						setState(374);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(375);
						object_decl();
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Self_methodsContext extends ParserRuleContext {
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Self_methodsContext self_methods() {
			return getRuleContext(Self_methodsContext.class,0);
		}
		public Self_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterSelf_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitSelf_methods(this);
		}
	}

	public final Self_methodsContext self_methods() throws RecognitionException {
		return self_methods(0);
	}

	private Self_methodsContext self_methods(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Self_methodsContext _localctx = new Self_methodsContext(_ctx, _parentState);
		Self_methodsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_self_methods, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			method_signature();
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Self_methodsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_self_methods);
						setState(384);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(385);
						match(T__11);
						setState(386);
						method_signature();
						}
						break;
					case 2:
						{
						_localctx = new Self_methodsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_self_methods);
						setState(387);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(388);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Stageprop_declContext extends ParserRuleContext {
		public Role_vec_modifierContext role_vec_modifier() {
			return getRuleContext(Role_vec_modifierContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Stageprop_bodyContext stageprop_body() {
			return getRuleContext(Stageprop_bodyContext.class,0);
		}
		public TerminalNode REQUIRES() { return getToken(KantParser.REQUIRES, 0); }
		public Self_methodsContext self_methods() {
			return getRuleContext(Self_methodsContext.class,0);
		}
		public Access_qualifierContext access_qualifier() {
			return getRuleContext(Access_qualifierContext.class,0);
		}
		public Stageprop_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stageprop_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterStageprop_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitStageprop_decl(this);
		}
	}

	public final Stageprop_declContext stageprop_decl() throws RecognitionException {
		Stageprop_declContext _localctx = new Stageprop_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stageprop_decl);
		try {
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__12);
				setState(395);
				role_vec_modifier();
				setState(396);
				match(JAVA_ID);
				setState(397);
				match(T__1);
				setState(398);
				stageprop_body(0);
				setState(399);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__12);
				setState(402);
				role_vec_modifier();
				setState(403);
				match(JAVA_ID);
				setState(404);
				match(T__1);
				setState(405);
				stageprop_body(0);
				setState(406);
				match(T__2);
				setState(407);
				match(REQUIRES);
				setState(408);
				match(T__1);
				setState(409);
				self_methods(0);
				setState(410);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				access_qualifier();
				setState(413);
				match(T__12);
				setState(414);
				role_vec_modifier();
				setState(415);
				match(JAVA_ID);
				setState(416);
				match(T__1);
				setState(417);
				stageprop_body(0);
				setState(418);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				access_qualifier();
				setState(421);
				match(T__12);
				setState(422);
				role_vec_modifier();
				setState(423);
				match(JAVA_ID);
				setState(424);
				match(T__1);
				setState(425);
				stageprop_body(0);
				setState(426);
				match(T__2);
				setState(427);
				match(REQUIRES);
				setState(428);
				match(T__1);
				setState(429);
				self_methods(0);
				setState(430);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(T__12);
				setState(433);
				role_vec_modifier();
				setState(434);
				match(JAVA_ID);
				setState(435);
				match(T__1);
				setState(436);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				match(T__12);
				setState(439);
				role_vec_modifier();
				setState(440);
				match(JAVA_ID);
				setState(441);
				match(T__1);
				setState(442);
				match(T__2);
				setState(443);
				match(REQUIRES);
				setState(444);
				match(T__1);
				setState(445);
				self_methods(0);
				setState(446);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				access_qualifier();
				setState(449);
				match(T__12);
				setState(450);
				role_vec_modifier();
				setState(451);
				match(JAVA_ID);
				setState(452);
				match(T__1);
				setState(453);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(455);
				access_qualifier();
				setState(456);
				match(T__12);
				setState(457);
				role_vec_modifier();
				setState(458);
				match(JAVA_ID);
				setState(459);
				match(T__1);
				setState(460);
				match(T__2);
				setState(461);
				match(REQUIRES);
				setState(462);
				match(T__1);
				setState(463);
				self_methods(0);
				setState(464);
				match(T__2);
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

	public static class Stageprop_bodyContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public Stageprop_bodyContext stageprop_body() {
			return getRuleContext(Stageprop_bodyContext.class,0);
		}
		public Stageprop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stageprop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterStageprop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitStageprop_body(this);
		}
	}

	public final Stageprop_bodyContext stageprop_body() throws RecognitionException {
		return stageprop_body(0);
	}

	private Stageprop_bodyContext stageprop_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Stageprop_bodyContext _localctx = new Stageprop_bodyContext(_ctx, _parentState);
		Stageprop_bodyContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_stageprop_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(469);
				method_decl();
				}
				break;
			case 2:
				{
				setState(470);
				object_decl();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(477);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Stageprop_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stageprop_body);
						setState(473);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(474);
						method_decl();
						}
						break;
					case 2:
						{
						_localctx = new Stageprop_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stageprop_body);
						setState(475);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(476);
						object_decl();
						}
						break;
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Class_body_elementContext class_body_element() {
			return getRuleContext(Class_body_elementContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		return class_body(0);
	}

	private Class_bodyContext class_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, _parentState);
		Class_bodyContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_class_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(483);
				class_body_element();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Class_bodyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_class_body);
					setState(487);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(488);
					class_body_element();
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Class_body_elementContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public Class_body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterClass_body_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitClass_body_element(this);
		}
	}

	public final Class_body_elementContext class_body_element() throws RecognitionException {
		Class_body_elementContext _localctx = new Class_body_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_class_body_element);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				method_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				object_decl();
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

	public static class Interface_bodyContext extends ParserRuleContext {
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitInterface_body(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		return interface_body(0);
	}

	private Interface_bodyContext interface_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, _parentState);
		Interface_bodyContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_interface_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			method_signature();
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Interface_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_interface_body);
						setState(501);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(502);
						match(T__11);
						setState(503);
						method_signature();
						}
						break;
					case 2:
						{
						_localctx = new Interface_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_interface_body);
						setState(504);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(505);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Method_declContext extends ParserRuleContext {
		public Method_decl_hookContext method_decl_hook() {
			return getRuleContext(Method_decl_hookContext.class,0);
		}
		public Type_and_expr_and_decl_listContext type_and_expr_and_decl_list() {
			return getRuleContext(Type_and_expr_and_decl_listContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			method_decl_hook();
			setState(512);
			match(T__1);
			setState(513);
			type_and_expr_and_decl_list();
			setState(514);
			match(T__2);
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

	public static class Method_decl_hookContext extends ParserRuleContext {
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Method_decl_hookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl_hook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMethod_decl_hook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMethod_decl_hook(this);
		}
	}

	public final Method_decl_hookContext method_decl_hook() throws RecognitionException {
		Method_decl_hookContext _localctx = new Method_decl_hookContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_method_decl_hook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			method_signature();
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

	public static class Method_signatureContext extends ParserRuleContext {
		public Access_qualifierContext access_qualifier() {
			return getRuleContext(Access_qualifierContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<TerminalNode> CONST() { return getTokens(KantParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(KantParser.CONST, i);
		}
		public Method_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMethod_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMethod_signature(this);
		}
	}

	public final Method_signatureContext method_signature() throws RecognitionException {
		Method_signatureContext _localctx = new Method_signatureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_method_signature);
		try {
			int _alt;
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				access_qualifier();
				setState(519);
				return_type();
				setState(520);
				method_name();
				setState(521);
				match(T__13);
				setState(522);
				param_list(0);
				setState(523);
				match(T__14);
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						match(CONST);
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				access_qualifier();
				setState(531);
				return_type();
				setState(532);
				method_name();
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						match(CONST);
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				access_qualifier();
				setState(540);
				method_name();
				setState(541);
				match(T__13);
				setState(542);
				param_list(0);
				setState(543);
				match(T__14);
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(544);
						match(CONST);
						}
						} 
					}
					setState(549);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
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

	public static class Expr_and_decl_listContext extends ParserRuleContext {
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_and_decl_listContext expr_and_decl_list() {
			return getRuleContext(Expr_and_decl_listContext.class,0);
		}
		public Expr_and_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterExpr_and_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitExpr_and_decl_list(this);
		}
	}

	public final Expr_and_decl_listContext expr_and_decl_list() throws RecognitionException {
		return expr_and_decl_list(0);
	}

	private Expr_and_decl_listContext expr_and_decl_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_and_decl_listContext _localctx = new Expr_and_decl_listContext(_ctx, _parentState);
		Expr_and_decl_listContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr_and_decl_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(553);
				object_decl();
				}
				break;
			case 2:
				{
				setState(554);
				expr();
				setState(555);
				match(T__11);
				setState(556);
				object_decl();
				}
				break;
			case 3:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(567);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_and_decl_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_and_decl_list);
						setState(561);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(562);
						object_decl();
						}
						break;
					case 2:
						{
						_localctx = new Expr_and_decl_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_and_decl_list);
						setState(563);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(564);
						expr();
						}
						break;
					case 3:
						{
						_localctx = new Expr_and_decl_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_and_decl_list);
						setState(565);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(566);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Type_and_expr_and_decl_listContext extends ParserRuleContext {
		public Expr_and_decl_listContext expr_and_decl_list() {
			return getRuleContext(Expr_and_decl_listContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Type_and_expr_and_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_and_expr_and_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_and_expr_and_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_and_expr_and_decl_list(this);
		}
	}

	public final Type_and_expr_and_decl_listContext type_and_expr_and_decl_list() throws RecognitionException {
		Type_and_expr_and_decl_listContext _localctx = new Type_and_expr_and_decl_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type_and_expr_and_decl_list);
		try {
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				expr_and_decl_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				expr_and_decl_list(0);
				setState(574);
				type_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				type_declaration();
				setState(577);
				expr_and_decl_list(0);
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

	public static class Return_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_type);
		try {
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public TerminalNode ABELIAN_SUMOP() { return getToken(KantParser.ABELIAN_SUMOP, 0); }
		public TerminalNode ABELIAN_MULOP() { return getToken(KantParser.ABELIAN_MULOP, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABELIAN_SUMOP) | (1L << ABELIAN_MULOP) | (1L << JAVA_ID))) != 0)) ) {
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

	public static class Access_qualifierContext extends ParserRuleContext {
		public Access_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterAccess_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitAccess_qualifier(this);
		}
	}

	public final Access_qualifierContext access_qualifier() throws RecognitionException {
		Access_qualifierContext _localctx = new Access_qualifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_access_qualifier);
		try {
			setState(590);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(T__16);
				}
				break;
			case T__8:
			case T__12:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case ABELIAN_SUMOP:
			case ABELIAN_MULOP:
			case JAVA_ID:
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

	public static class Object_declContext extends ParserRuleContext {
		public Access_qualifierContext access_qualifier() {
			return getRuleContext(Access_qualifierContext.class,0);
		}
		public Compound_type_nameContext compound_type_name() {
			return getRuleContext(Compound_type_nameContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Object_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterObject_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitObject_decl(this);
		}
	}

	public final Object_declContext object_decl() throws RecognitionException {
		Object_declContext _localctx = new Object_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_object_decl);
		try {
			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				access_qualifier();
				setState(593);
				compound_type_name();
				setState(594);
				identifier_list(0);
				setState(595);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				access_qualifier();
				setState(598);
				compound_type_name();
				setState(599);
				identifier_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				compound_type_name();
				setState(602);
				identifier_list(0);
				setState(603);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				compound_type_name();
				setState(606);
				identifier_list(0);
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

	public static class Trivial_object_declContext extends ParserRuleContext {
		public Compound_type_nameContext compound_type_name() {
			return getRuleContext(Compound_type_nameContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Trivial_object_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trivial_object_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterTrivial_object_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitTrivial_object_decl(this);
		}
	}

	public final Trivial_object_declContext trivial_object_decl() throws RecognitionException {
		Trivial_object_declContext _localctx = new Trivial_object_declContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_trivial_object_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			compound_type_name();
			setState(611);
			match(JAVA_ID);
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

	public static class Compound_type_nameContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Compound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterCompound_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitCompound_type_name(this);
		}
	}

	public final Compound_type_nameContext compound_type_name() throws RecognitionException {
		Compound_type_nameContext _localctx = new Compound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compound_type_name);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				type_name();
				setState(614);
				match(T__9);
				setState(615);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				type_name();
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

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Builtin_type_nameContext builtin_type_name() {
			return getRuleContext(Builtin_type_nameContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type_name);
		try {
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(JAVA_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(JAVA_ID);
				setState(622);
				type_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				builtin_type_name();
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

	public static class Builtin_type_nameContext extends ParserRuleContext {
		public Builtin_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBuiltin_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBuiltin_type_name(this);
		}
	}

	public final Builtin_type_nameContext builtin_type_name() throws RecognitionException {
		Builtin_type_nameContext _localctx = new Builtin_type_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_builtin_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public TerminalNode ASSIGN() { return getToken(KantParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		return identifier_list(0);
	}

	private Identifier_listContext identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, _parentState);
		Identifier_listContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(629);
				match(JAVA_ID);
				}
				break;
			case 2:
				{
				setState(630);
				match(JAVA_ID);
				setState(631);
				match(ASSIGN);
				setState(632);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(643);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new Identifier_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier_list);
						setState(635);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(636);
						match(T__7);
						setState(637);
						match(JAVA_ID);
						}
						break;
					case 2:
						{
						_localctx = new Identifier_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifier_list);
						setState(638);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(639);
						match(T__7);
						setState(640);
						match(JAVA_ID);
						setState(641);
						match(ASSIGN);
						setState(642);
						expr();
						}
						break;
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Param_listContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		return param_list(0);
	}

	private Param_listContext param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_listContext _localctx = new Param_listContext(_ctx, _parentState);
		Param_listContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(649);
				param_decl();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_list);
					setState(653);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(654);
					match(T__7);
					setState(655);
					param_decl();
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class Param_declContext extends ParserRuleContext {
		public Compound_type_nameContext compound_type_name() {
			return getRuleContext(Compound_type_nameContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			compound_type_name();
			setState(662);
			match(JAVA_ID);
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
		public Abelian_exprContext abelian_expr() {
			return getRuleContext(Abelian_exprContext.class,0);
		}
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public Do_while_exprContext do_while_expr() {
			return getRuleContext(Do_while_exprContext.class,0);
		}
		public Switch_exprContext switch_expr() {
			return getRuleContext(Switch_exprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(KantParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(KantParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(KantParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr);
		try {
			setState(677);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				abelian_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				boolean_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				if_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				for_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(669);
				while_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(670);
				do_while_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				switch_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(672);
				match(BREAK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(673);
				match(CONTINUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(674);
				match(RETURN);
				setState(675);
				expr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(676);
				match(RETURN);
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

	public static class Abelian_exprContext extends ParserRuleContext {
		public List<Abelian_productContext> abelian_product() {
			return getRuleContexts(Abelian_productContext.class);
		}
		public Abelian_productContext abelian_product(int i) {
			return getRuleContext(Abelian_productContext.class,i);
		}
		public List<TerminalNode> ABELIAN_SUMOP() { return getTokens(KantParser.ABELIAN_SUMOP); }
		public TerminalNode ABELIAN_SUMOP(int i) {
			return getToken(KantParser.ABELIAN_SUMOP, i);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public Abelian_exprContext abelian_expr() {
			return getRuleContext(Abelian_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KantParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Abelian_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abelian_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterAbelian_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitAbelian_expr(this);
		}
	}

	public final Abelian_exprContext abelian_expr() throws RecognitionException {
		return abelian_expr(0);
	}

	private Abelian_exprContext abelian_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Abelian_exprContext _localctx = new Abelian_exprContext(_ctx, _parentState);
		Abelian_exprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_abelian_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case STRING:
			case INTEGER:
			case FLOAT:
			case BOOLEAN:
			case NEW:
			case NULL:
			case ABELIAN_SUMOP:
			case ABELIAN_MULOP:
			case ABELIAN_INCREMENT_OP:
			case JAVA_ID:
				{
				setState(680);
				abelian_product(0);
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(681);
						match(ABELIAN_SUMOP);
						setState(682);
						abelian_product(0);
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
				break;
			case T__28:
				{
				setState(688);
				if_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Abelian_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_abelian_expr);
					setState(691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(692);
					match(ASSIGN);
					setState(693);
					expr();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class Abelian_productContext extends ParserRuleContext {
		public List<Abelian_unary_opContext> abelian_unary_op() {
			return getRuleContexts(Abelian_unary_opContext.class);
		}
		public Abelian_unary_opContext abelian_unary_op(int i) {
			return getRuleContext(Abelian_unary_opContext.class,i);
		}
		public List<TerminalNode> ABELIAN_MULOP() { return getTokens(KantParser.ABELIAN_MULOP); }
		public TerminalNode ABELIAN_MULOP(int i) {
			return getToken(KantParser.ABELIAN_MULOP, i);
		}
		public Abelian_productContext abelian_product() {
			return getRuleContext(Abelian_productContext.class,0);
		}
		public TerminalNode POW() { return getToken(KantParser.POW, 0); }
		public Abelian_atomContext abelian_atom() {
			return getRuleContext(Abelian_atomContext.class,0);
		}
		public Abelian_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abelian_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterAbelian_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitAbelian_product(this);
		}
	}

	public final Abelian_productContext abelian_product() throws RecognitionException {
		return abelian_product(0);
	}

	private Abelian_productContext abelian_product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Abelian_productContext _localctx = new Abelian_productContext(_ctx, _parentState);
		Abelian_productContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_abelian_product, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(700);
			abelian_unary_op();
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(701);
					match(ABELIAN_MULOP);
					setState(702);
					abelian_unary_op();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Abelian_productContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_abelian_product);
					setState(708);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(709);
					match(POW);
					setState(710);
					abelian_atom(0);
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class Abelian_unary_opContext extends ParserRuleContext {
		public TerminalNode ABELIAN_SUMOP() { return getToken(KantParser.ABELIAN_SUMOP, 0); }
		public Abelian_atomContext abelian_atom() {
			return getRuleContext(Abelian_atomContext.class,0);
		}
		public Abelian_unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abelian_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterAbelian_unary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitAbelian_unary_op(this);
		}
	}

	public final Abelian_unary_opContext abelian_unary_op() throws RecognitionException {
		Abelian_unary_opContext _localctx = new Abelian_unary_opContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_abelian_unary_op);
		try {
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(ABELIAN_SUMOP);
				setState(717);
				abelian_atom(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				abelian_atom(0);
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

	public static class Abelian_atomContext extends ParserRuleContext {
		public TerminalNode ABELIAN_INCREMENT_OP() { return getToken(KantParser.ABELIAN_INCREMENT_OP, 0); }
		public Abelian_atomContext abelian_atom() {
			return getRuleContext(Abelian_atomContext.class,0);
		}
		public TerminalNode NEW() { return getToken(KantParser.NEW, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Builtin_type_nameContext builtin_type_name() {
			return getRuleContext(Builtin_type_nameContext.class,0);
		}
		public Null_exprContext null_expr() {
			return getRuleContext(Null_exprContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Abelian_exprContext abelian_expr() {
			return getRuleContext(Abelian_exprContext.class,0);
		}
		public TerminalNode CLONE() { return getToken(KantParser.CLONE, 0); }
		public Abelian_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abelian_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterAbelian_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitAbelian_atom(this);
		}
	}

	public final Abelian_atomContext abelian_atom() throws RecognitionException {
		return abelian_atom(0);
	}

	private Abelian_atomContext abelian_atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Abelian_atomContext _localctx = new Abelian_atomContext(_ctx, _parentState);
		Abelian_atomContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_abelian_atom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(722);
				match(ABELIAN_INCREMENT_OP);
				setState(723);
				abelian_atom(10);
				}
				break;
			case 2:
				{
				setState(724);
				match(NEW);
				setState(725);
				message();
				}
				break;
			case 3:
				{
				setState(726);
				match(NEW);
				setState(727);
				type_name();
				setState(728);
				match(T__9);
				setState(729);
				expr();
				setState(730);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(732);
				match(NEW);
				setState(733);
				match(JAVA_ID);
				setState(734);
				type_list();
				setState(735);
				match(T__13);
				setState(736);
				argument_list(0);
				setState(737);
				match(T__14);
				}
				break;
			case 5:
				{
				setState(739);
				builtin_type_name();
				setState(740);
				match(T__21);
				setState(741);
				message();
				}
				break;
			case 6:
				{
				setState(743);
				null_expr();
				}
				break;
			case 7:
				{
				setState(744);
				message();
				}
				break;
			case 8:
				{
				setState(745);
				match(JAVA_ID);
				}
				break;
			case 9:
				{
				setState(746);
				constant();
				}
				break;
			case 10:
				{
				setState(747);
				match(T__13);
				setState(748);
				abelian_expr(0);
				setState(749);
				match(T__14);
				}
				break;
			case 11:
				{
				setState(751);
				match(ABELIAN_INCREMENT_OP);
				setState(752);
				expr();
				setState(753);
				match(T__9);
				setState(754);
				expr();
				setState(755);
				match(T__10);
				}
				break;
			case 12:
				{
				setState(757);
				match(ABELIAN_INCREMENT_OP);
				setState(758);
				expr();
				setState(759);
				match(T__21);
				setState(760);
				match(JAVA_ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(795);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(764);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(765);
						match(T__21);
						setState(766);
						message();
						}
						break;
					case 2:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(767);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(768);
						match(T__21);
						setState(769);
						match(JAVA_ID);
						}
						break;
					case 3:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(770);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(771);
						match(ABELIAN_INCREMENT_OP);
						}
						break;
					case 4:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(772);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(773);
						match(T__9);
						setState(774);
						expr();
						setState(775);
						match(T__10);
						}
						break;
					case 5:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(777);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(778);
						match(T__9);
						setState(779);
						expr();
						setState(780);
						match(T__10);
						setState(781);
						match(ABELIAN_INCREMENT_OP);
						}
						break;
					case 6:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(783);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(784);
						match(T__21);
						setState(785);
						match(JAVA_ID);
						setState(786);
						match(ABELIAN_INCREMENT_OP);
						}
						break;
					case 7:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(787);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(788);
						match(T__21);
						setState(789);
						match(CLONE);
						}
						break;
					case 8:
						{
						_localctx = new Abelian_atomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_abelian_atom);
						setState(790);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(791);
						match(T__21);
						setState(792);
						match(CLONE);
						setState(793);
						match(T__13);
						setState(794);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class Boolean_exprContext extends ParserRuleContext {
		public Token op;
		public List<Boolean_productContext> boolean_product() {
			return getRuleContexts(Boolean_productContext.class);
		}
		public Boolean_productContext boolean_product(int i) {
			return getRuleContext(Boolean_productContext.class,i);
		}
		public List<TerminalNode> BOOLEAN_SUMOP() { return getTokens(KantParser.BOOLEAN_SUMOP); }
		public TerminalNode BOOLEAN_SUMOP(int i) {
			return getToken(KantParser.BOOLEAN_SUMOP, i);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public List<Abelian_exprContext> abelian_expr() {
			return getRuleContexts(Abelian_exprContext.class);
		}
		public Abelian_exprContext abelian_expr(int i) {
			return getRuleContext(Abelian_exprContext.class,i);
		}
		public TerminalNode GT() { return getToken(KantParser.GT, 0); }
		public TerminalNode LT() { return getToken(KantParser.LT, 0); }
		public List<Boolean_exprContext> boolean_expr() {
			return getRuleContexts(Boolean_exprContext.class);
		}
		public Boolean_exprContext boolean_expr(int i) {
			return getRuleContext(Boolean_exprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(KantParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBoolean_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBoolean_expr(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		return boolean_expr(0);
	}

	private Boolean_exprContext boolean_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, _parentState);
		Boolean_exprContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_boolean_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(801);
				boolean_product();
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(802);
						match(BOOLEAN_SUMOP);
						setState(803);
						boolean_product();
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(809);
				if_expr();
				}
				break;
			case 3:
				{
				setState(810);
				abelian_expr(0);
				setState(811);
				((Boolean_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << LT) | (1L << GT))) != 0)) ) {
					((Boolean_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(812);
				abelian_expr(0);
				}
				break;
			case 4:
				{
				setState(814);
				abelian_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(823);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(817);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(818);
						((Boolean_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << BOOLEAN_MULOP))) != 0)) ) {
							((Boolean_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(819);
						boolean_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(820);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(821);
						match(ASSIGN);
						setState(822);
						expr();
						}
						break;
					}
					} 
				}
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Boolean_productContext extends ParserRuleContext {
		public List<Boolean_unary_opContext> boolean_unary_op() {
			return getRuleContexts(Boolean_unary_opContext.class);
		}
		public Boolean_unary_opContext boolean_unary_op(int i) {
			return getRuleContext(Boolean_unary_opContext.class,i);
		}
		public List<TerminalNode> BOOLEAN_MULOP() { return getTokens(KantParser.BOOLEAN_MULOP); }
		public TerminalNode BOOLEAN_MULOP(int i) {
			return getToken(KantParser.BOOLEAN_MULOP, i);
		}
		public Boolean_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBoolean_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBoolean_product(this);
		}
	}

	public final Boolean_productContext boolean_product() throws RecognitionException {
		Boolean_productContext _localctx = new Boolean_productContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolean_product);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			boolean_unary_op();
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(829);
					match(BOOLEAN_MULOP);
					setState(830);
					boolean_unary_op();
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class Boolean_unary_opContext extends ParserRuleContext {
		public TerminalNode LOGICAL_NEGATION() { return getToken(KantParser.LOGICAL_NEGATION, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Boolean_atomContext boolean_atom() {
			return getRuleContext(Boolean_atomContext.class,0);
		}
		public Boolean_unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBoolean_unary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBoolean_unary_op(this);
		}
	}

	public final Boolean_unary_opContext boolean_unary_op() throws RecognitionException {
		Boolean_unary_opContext _localctx = new Boolean_unary_opContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolean_unary_op);
		try {
			setState(839);
			switch (_input.LA(1)) {
			case LOGICAL_NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				match(LOGICAL_NEGATION);
				setState(837);
				boolean_expr(0);
				}
				break;
			case T__13:
			case STRING:
			case INTEGER:
			case FLOAT:
			case BOOLEAN:
			case NULL:
			case JAVA_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				boolean_atom();
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

	public static class Boolean_atomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Null_exprContext null_expr() {
			return getRuleContext(Null_exprContext.class,0);
		}
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Boolean_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBoolean_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBoolean_atom(this);
		}
	}

	public final Boolean_atomContext boolean_atom() throws RecognitionException {
		Boolean_atomContext _localctx = new Boolean_atomContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_boolean_atom);
		try {
			setState(848);
			switch (_input.LA(1)) {
			case STRING:
			case INTEGER:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				constant();
				}
				break;
			case JAVA_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(JAVA_ID);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				null_expr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(844);
				match(T__13);
				setState(845);
				boolean_expr(0);
				setState(846);
				match(T__14);
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

	public static class MessageContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_message);
		try {
			setState(860);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				method_name();
				setState(851);
				match(T__13);
				setState(852);
				argument_list(0);
				setState(853);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				type_name();
				setState(856);
				match(T__13);
				setState(857);
				argument_list(0);
				setState(858);
				match(T__14);
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

	public static class BlockContext extends ParserRuleContext {
		public Expr_and_decl_listContext expr_and_decl_list() {
			return getRuleContext(Expr_and_decl_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block);
		try {
			setState(868);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				match(T__1);
				setState(863);
				expr_and_decl_list(0);
				setState(864);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(T__1);
				setState(867);
				match(T__2);
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

	public static class Expr_or_nullContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_or_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterExpr_or_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitExpr_or_null(this);
		}
	}

	public final Expr_or_nullContext expr_or_null() throws RecognitionException {
		Expr_or_nullContext _localctx = new Expr_or_nullContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr_or_null);
		try {
			setState(872);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__28:
			case T__30:
			case T__32:
			case T__33:
			case STRING:
			case INTEGER:
			case FLOAT:
			case BOOLEAN:
			case SWITCH:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case NEW:
			case NULL:
			case ABELIAN_SUMOP:
			case ABELIAN_MULOP:
			case LOGICAL_NEGATION:
			case ABELIAN_INCREMENT_OP:
			case JAVA_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				expr();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
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

	public static class If_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_if_expr);
		try {
			setState(888);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(T__28);
				setState(875);
				match(T__13);
				setState(876);
				expr();
				setState(877);
				match(T__14);
				setState(878);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(T__28);
				setState(881);
				match(T__13);
				setState(882);
				expr();
				setState(883);
				match(T__14);
				setState(884);
				expr();
				setState(885);
				match(T__29);
				setState(886);
				expr();
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

	public static class For_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Object_declContext object_decl() {
			return getRuleContext(Object_declContext.class,0);
		}
		public TerminalNode JAVA_ID() { return getToken(KantParser.JAVA_ID, 0); }
		public Trivial_object_declContext trivial_object_decl() {
			return getRuleContext(Trivial_object_declContext.class,0);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitFor_expr(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_for_expr);
		try {
			setState(925);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(T__30);
				setState(891);
				match(T__13);
				setState(892);
				expr();
				setState(893);
				match(T__11);
				setState(894);
				expr();
				setState(895);
				match(T__11);
				setState(896);
				expr();
				setState(897);
				match(T__14);
				setState(898);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(T__30);
				setState(901);
				match(T__13);
				setState(902);
				object_decl();
				setState(903);
				expr();
				setState(904);
				match(T__11);
				setState(905);
				expr();
				setState(906);
				match(T__14);
				setState(907);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				match(T__30);
				setState(910);
				match(T__13);
				setState(911);
				match(JAVA_ID);
				setState(912);
				match(T__31);
				setState(913);
				expr();
				setState(914);
				match(T__14);
				setState(915);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(917);
				match(T__30);
				setState(918);
				match(T__13);
				setState(919);
				trivial_object_decl();
				setState(920);
				match(T__31);
				setState(921);
				expr();
				setState(922);
				match(T__14);
				setState(923);
				expr();
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

	public static class While_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitWhile_expr(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(T__32);
			setState(928);
			match(T__13);
			setState(929);
			expr();
			setState(930);
			match(T__14);
			setState(931);
			expr();
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

	public static class Do_while_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Do_while_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterDo_while_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitDo_while_expr(this);
		}
	}

	public final Do_while_exprContext do_while_expr() throws RecognitionException {
		Do_while_exprContext _localctx = new Do_while_exprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_do_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(T__33);
			setState(934);
			expr();
			setState(935);
			match(T__32);
			setState(936);
			match(T__13);
			setState(937);
			expr();
			setState(938);
			match(T__14);
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

	public static class Switch_exprContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(KantParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Switch_bodyContext> switch_body() {
			return getRuleContexts(Switch_bodyContext.class);
		}
		public Switch_bodyContext switch_body(int i) {
			return getRuleContext(Switch_bodyContext.class,i);
		}
		public Switch_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterSwitch_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitSwitch_expr(this);
		}
	}

	public final Switch_exprContext switch_expr() throws RecognitionException {
		Switch_exprContext _localctx = new Switch_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switch_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(SWITCH);
			setState(941);
			match(T__13);
			setState(942);
			expr();
			setState(943);
			match(T__14);
			setState(944);
			match(T__1);
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(945);
				switch_body();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(951);
			match(T__2);
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public Expr_and_decl_listContext expr_and_decl_list() {
			return getRuleContext(Expr_and_decl_listContext.class,0);
		}
		public TerminalNode CASE() { return getToken(KantParser.CASE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(KantParser.DEFAULT, 0); }
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitSwitch_body(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switch_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			switch (_input.LA(1)) {
			case CASE:
				{
				setState(953);
				match(CASE);
				setState(954);
				constant();
				}
				break;
			case DEFAULT:
				{
				setState(955);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(958);
			match(T__31);
			setState(959);
			expr_and_decl_list(0);
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

	public static class Null_exprContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(KantParser.NULL, 0); }
		public Null_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterNull_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitNull_expr(this);
		}
	}

	public final Null_exprContext null_expr() throws RecognitionException {
		Null_exprContext _localctx = new Null_exprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_null_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(NULL);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KantParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(KantParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(KantParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(KantParser.BOOLEAN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INTEGER) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class Argument_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KantListener ) ((KantListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		return argument_list(0);
	}

	private Argument_listContext argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_listContext _localctx = new Argument_listContext(_ctx, _parentState);
		Argument_listContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(966);
				expr();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Argument_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argument_list);
					setState(970);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(971);
					match(T__7);
					setState(972);
					expr();
					}
					} 
				}
				setState(977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		case 2:
			return type_declaration_list_sempred((Type_declaration_listContext)_localctx, predIndex);
		case 7:
			return implements_list_sempred((Implements_listContext)_localctx, predIndex);
		case 11:
			return context_body_sempred((Context_bodyContext)_localctx, predIndex);
		case 15:
			return role_body_sempred((Role_bodyContext)_localctx, predIndex);
		case 16:
			return self_methods_sempred((Self_methodsContext)_localctx, predIndex);
		case 18:
			return stageprop_body_sempred((Stageprop_bodyContext)_localctx, predIndex);
		case 19:
			return class_body_sempred((Class_bodyContext)_localctx, predIndex);
		case 21:
			return interface_body_sempred((Interface_bodyContext)_localctx, predIndex);
		case 25:
			return expr_and_decl_list_sempred((Expr_and_decl_listContext)_localctx, predIndex);
		case 35:
			return identifier_list_sempred((Identifier_listContext)_localctx, predIndex);
		case 36:
			return param_list_sempred((Param_listContext)_localctx, predIndex);
		case 39:
			return abelian_expr_sempred((Abelian_exprContext)_localctx, predIndex);
		case 40:
			return abelian_product_sempred((Abelian_productContext)_localctx, predIndex);
		case 42:
			return abelian_atom_sempred((Abelian_atomContext)_localctx, predIndex);
		case 43:
			return boolean_expr_sempred((Boolean_exprContext)_localctx, predIndex);
		case 58:
			return argument_list_sempred((Argument_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_declaration_list_sempred(Type_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean implements_list_sempred(Implements_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean context_body_sempred(Context_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean role_body_sempred(Role_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean self_methods_sempred(Self_methodsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stageprop_body_sempred(Stageprop_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean class_body_sempred(Class_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean interface_body_sempred(Interface_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_and_decl_list_sempred(Expr_and_decl_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean identifier_list_sempred(Identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean param_list_sempred(Param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean abelian_expr_sempred(Abelian_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean abelian_product_sempred(Abelian_productContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean abelian_atom_sempred(Abelian_atomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 17);
		case 21:
			return precpred(_ctx, 15);
		case 22:
			return precpred(_ctx, 11);
		case 23:
			return precpred(_ctx, 7);
		case 24:
			return precpred(_ctx, 6);
		case 25:
			return precpred(_ctx, 3);
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolean_expr_sempred(Boolean_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 4);
		case 29:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argument_list_sempred(Argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u03d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\5\2}\n\2\3\3\3\3\3\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4\7\4\u0088"+
		"\n\4\f\4\16\4\u008b\13\4\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00c5\n\7\f\7\16\7\u00c8\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00dc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00eb"+
		"\n\t\f\t\16\t\u00ee\13\t\3\n\3\n\3\n\3\n\7\n\u00f4\n\n\f\n\16\n\u00f7"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ff\n\13\f\13\16\13\u0102\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\5\f\u0109\n\f\3\r\3\r\3\r\5\r\u010e\n\r\3\r"+
		"\3\r\7\r\u0112\n\r\f\r\16\r\u0115\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u011c"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u016a\n\17\3\20\3\20\3\20\5\20"+
		"\u016f\n\20\3\21\3\21\3\21\3\21\5\21\u0175\n\21\3\21\3\21\3\21\3\21\7"+
		"\21\u017b\n\21\f\21\16\21\u017e\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u0188\n\22\f\22\16\22\u018b\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01d5"+
		"\n\23\3\24\3\24\3\24\5\24\u01da\n\24\3\24\3\24\3\24\3\24\7\24\u01e0\n"+
		"\24\f\24\16\24\u01e3\13\24\3\25\3\25\3\25\5\25\u01e8\n\25\3\25\3\25\7"+
		"\25\u01ec\n\25\f\25\16\25\u01ef\13\25\3\26\3\26\5\26\u01f3\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01fd\n\27\f\27\16\27\u0200\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u0210\n\32\f\32\16\32\u0213\13\32\3\32\3\32\3\32\3\32\7\32\u0219"+
		"\n\32\f\32\16\32\u021c\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0224"+
		"\n\32\f\32\16\32\u0227\13\32\5\32\u0229\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0232\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u023a\n"+
		"\33\f\33\16\33\u023d\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0246"+
		"\n\34\3\35\3\35\5\35\u024a\n\35\3\36\3\36\3\37\3\37\3\37\5\37\u0251\n"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0263\n \3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\5\"\u026d\n\"\3#\3#\3#\3#\5#\u0273\n#\3$\3$\3"+
		"%\3%\3%\3%\3%\5%\u027c\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0286\n%\f%\16%\u0289"+
		"\13%\3&\3&\3&\5&\u028e\n&\3&\3&\3&\7&\u0293\n&\f&\16&\u0296\13&\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02a8\n(\3)\3)\3)\3)"+
		"\7)\u02ae\n)\f)\16)\u02b1\13)\3)\5)\u02b4\n)\3)\3)\3)\7)\u02b9\n)\f)\16"+
		")\u02bc\13)\3*\3*\3*\3*\7*\u02c2\n*\f*\16*\u02c5\13*\3*\3*\3*\7*\u02ca"+
		"\n*\f*\16*\u02cd\13*\3+\3+\3+\5+\u02d2\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02fd\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u031e"+
		"\n,\f,\16,\u0321\13,\3-\3-\3-\3-\7-\u0327\n-\f-\16-\u032a\13-\3-\3-\3"+
		"-\3-\3-\3-\5-\u0332\n-\3-\3-\3-\3-\3-\3-\7-\u033a\n-\f-\16-\u033d\13-"+
		"\3.\3.\3.\7.\u0342\n.\f.\16.\u0345\13.\3/\3/\3/\5/\u034a\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0353\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u035f\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0367\n\62\3\63\3\63\5\63\u036b\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u037b\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u03a0\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\78\u03b5\n8\f8\168\u03b8"+
		"\138\38\38\39\39\39\59\u03bf\n9\39\39\39\3:\3:\3;\3;\3<\3<\3<\5<\u03cb"+
		"\n<\3<\3<\3<\7<\u03d0\n<\f<\16<\u03d3\13<\3<\2\22\6\20\30 \"&(,\64HJP"+
		"RVXv=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\7\4\2\678??\3\2\24\27\4\2\33\36;<\4\2"+
		"\31\32\66\66\3\2%(\u0422\2|\3\2\2\2\4~\3\2\2\2\6\u0083\3\2\2\2\b\u008f"+
		"\3\2\2\2\n\u0091\3\2\2\2\f\u00db\3\2\2\2\16\u00dd\3\2\2\2\20\u00e3\3\2"+
		"\2\2\22\u00ef\3\2\2\2\24\u00fa\3\2\2\2\26\u0105\3\2\2\2\30\u010d\3\2\2"+
		"\2\32\u011b\3\2\2\2\34\u0169\3\2\2\2\36\u016e\3\2\2\2 \u0174\3\2\2\2\""+
		"\u017f\3\2\2\2$\u01d4\3\2\2\2&\u01d9\3\2\2\2(\u01e7\3\2\2\2*\u01f2\3\2"+
		"\2\2,\u01f4\3\2\2\2.\u0201\3\2\2\2\60\u0206\3\2\2\2\62\u0228\3\2\2\2\64"+
		"\u0231\3\2\2\2\66\u0245\3\2\2\28\u0249\3\2\2\2:\u024b\3\2\2\2<\u0250\3"+
		"\2\2\2>\u0262\3\2\2\2@\u0264\3\2\2\2B\u026c\3\2\2\2D\u0272\3\2\2\2F\u0274"+
		"\3\2\2\2H\u027b\3\2\2\2J\u028d\3\2\2\2L\u0297\3\2\2\2N\u02a7\3\2\2\2P"+
		"\u02b3\3\2\2\2R\u02bd\3\2\2\2T\u02d1\3\2\2\2V\u02fc\3\2\2\2X\u0331\3\2"+
		"\2\2Z\u033e\3\2\2\2\\\u0349\3\2\2\2^\u0352\3\2\2\2`\u035e\3\2\2\2b\u0366"+
		"\3\2\2\2d\u036a\3\2\2\2f\u037a\3\2\2\2h\u039f\3\2\2\2j\u03a1\3\2\2\2l"+
		"\u03a7\3\2\2\2n\u03ae\3\2\2\2p\u03be\3\2\2\2r\u03c3\3\2\2\2t\u03c5\3\2"+
		"\2\2v\u03ca\3\2\2\2xy\5\6\4\2yz\5\4\3\2z}\3\2\2\2{}\5\6\4\2|x\3\2\2\2"+
		"|{\3\2\2\2}\3\3\2\2\2~\177\5N(\2\177\5\3\2\2\2\u0080\u0081\b\4\1\2\u0081"+
		"\u0084\5\b\5\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\u0089\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0088\5\b\5\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\7\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0090\5\n\6\2\u008d\u0090"+
		"\5\f\7\2\u008e\u0090\5\16\b\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2\u0091\u0092\7\3\2\2\u0092\u0093\7"+
		"?\2\2\u0093\u0094\7\4\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\5\2\2\u0096"+
		"\13\3\2\2\2\u0097\u0098\7\6\2\2\u0098\u0099\7?\2\2\u0099\u009d\5\22\n"+
		"\2\u009a\u009c\5\20\t\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\7\5\2\2\u00a3"+
		"\u00dc\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\5\22"+
		"\n\2\u00a7\u00a8\7\7\2\2\u00a8\u00ac\7?\2\2\u00a9\u00ab\5\20\t\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\4\2\2\u00b0"+
		"\u00b1\5(\25\2\u00b1\u00b2\7\5\2\2\u00b2\u00dc\3\2\2\2\u00b3\u00b4\7\6"+
		"\2\2\u00b4\u00b8\7?\2\2\u00b5\u00b7\5\20\t\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\5(\25\2\u00bd"+
		"\u00be\7\5\2\2\u00be\u00dc\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\7?"+
		"\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c6\7?\2\2\u00c3\u00c5\5\20\t\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\4\2\2\u00ca"+
		"\u00cb\5(\25\2\u00cb\u00cc\7\5\2\2\u00cc\u00dc\3\2\2\2\u00cd\u00ce\7\6"+
		"\2\2\u00ce\u00d2\7?\2\2\u00cf\u00d1\5\20\t\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		"\u00d8\7\4\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\7\5\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u0097\3\2\2\2\u00db\u00a4\3\2\2\2\u00db\u00b3\3\2\2\2\u00db"+
		"\u00bf\3\2\2\2\u00db\u00cd\3\2\2\2\u00dc\r\3\2\2\2\u00dd\u00de\7\b\2\2"+
		"\u00de\u00df\7?\2\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\5,\27\2\u00e1\u00e2"+
		"\7\5\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e5\7\t\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\3\2\2\u00e8\u00e9\7\n"+
		"\2\2\u00e9\u00eb\7?\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\21\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f0\7;\2\2\u00f0\u00f5\5\26\f\2\u00f1\u00f2\7\n\2\2\u00f2\u00f4"+
		"\5\26\f\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\7<\2\2\u00f9\23\3\2\2\2\u00fa\u00fb\7;\2\2\u00fb\u0100\5D#\2\u00fc\u00fd"+
		"\7\n\2\2\u00fd\u00ff\5D#\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0104\7<\2\2\u0104\25\3\2\2\2\u0105\u0108\5D#\2\u0106\u0107"+
		"\7\7\2\2\u0107\u0109\5D#\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\27\3\2\2\2\u010a\u010b\b\r\1\2\u010b\u010e\5\32\16\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010a\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0113\3\2\2\2\u010f"+
		"\u0110\f\5\2\2\u0110\u0112\5\32\16\2\u0111\u010f\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\31\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011c\5.\30\2\u0117\u011c\5> \2\u0118\u011c\5\34"+
		"\17\2\u0119\u011c\5$\23\2\u011a\u011c\5\n\6\2\u011b\u0116\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\33\3\2\2\2\u011d\u011e\7\13\2\2\u011e\u011f\5\36\20\2\u011f"+
		"\u0120\7?\2\2\u0120\u0121\7\4\2\2\u0121\u0122\5 \21\2\u0122\u0123\7\5"+
		"\2\2\u0123\u016a\3\2\2\2\u0124\u0125\7\13\2\2\u0125\u0126\5\36\20\2\u0126"+
		"\u0127\7?\2\2\u0127\u0128\7\4\2\2\u0128\u0129\5 \21\2\u0129\u012a\7\5"+
		"\2\2\u012a\u012b\7/\2\2\u012b\u012c\7\4\2\2\u012c\u012d\5\"\22\2\u012d"+
		"\u012e\7\5\2\2\u012e\u016a\3\2\2\2\u012f\u0130\5<\37\2\u0130\u0131\7\13"+
		"\2\2\u0131\u0132\5\36\20\2\u0132\u0133\7?\2\2\u0133\u0134\7\4\2\2\u0134"+
		"\u0135\5 \21\2\u0135\u0136\7\5\2\2\u0136\u016a\3\2\2\2\u0137\u0138\5<"+
		"\37\2\u0138\u0139\7\13\2\2\u0139\u013a\5\36\20\2\u013a\u013b\7?\2\2\u013b"+
		"\u013c\7\4\2\2\u013c\u013d\5 \21\2\u013d\u013e\7\5\2\2\u013e\u013f\7/"+
		"\2\2\u013f\u0140\7\4\2\2\u0140\u0141\5\"\22\2\u0141\u0142\7\5\2\2\u0142"+
		"\u016a\3\2\2\2\u0143\u0144\7\13\2\2\u0144\u0145\5\36\20\2\u0145\u0146"+
		"\7?\2\2\u0146\u0147\7\4\2\2\u0147\u0148\5 \21\2\u0148\u0149\7\5\2\2\u0149"+
		"\u016a\3\2\2\2\u014a\u014b\7\13\2\2\u014b\u014c\5\36\20\2\u014c\u014d"+
		"\7?\2\2\u014d\u014e\7\4\2\2\u014e\u014f\5 \21\2\u014f\u0150\7\5\2\2\u0150"+
		"\u0151\7/\2\2\u0151\u0152\7\4\2\2\u0152\u0153\5\"\22\2\u0153\u0154\7\5"+
		"\2\2\u0154\u016a\3\2\2\2\u0155\u0156\5<\37\2\u0156\u0157\7\13\2\2\u0157"+
		"\u0158\5\36\20\2\u0158\u0159\7?\2\2\u0159\u015a\7\4\2\2\u015a\u015b\5"+
		" \21\2\u015b\u015c\7\5\2\2\u015c\u016a\3\2\2\2\u015d\u015e\5<\37\2\u015e"+
		"\u015f\7\13\2\2\u015f\u0160\5\36\20\2\u0160\u0161\7?\2\2\u0161\u0162\7"+
		"\4\2\2\u0162\u0163\5 \21\2\u0163\u0164\7\5\2\2\u0164\u0165\7/\2\2\u0165"+
		"\u0166\7\4\2\2\u0166\u0167\5\"\22\2\u0167\u0168\7\5\2\2\u0168\u016a\3"+
		"\2\2\2\u0169\u011d\3\2\2\2\u0169\u0124\3\2\2\2\u0169\u012f\3\2\2\2\u0169"+
		"\u0137\3\2\2\2\u0169\u0143\3\2\2\2\u0169\u014a\3\2\2\2\u0169\u0155\3\2"+
		"\2\2\u0169\u015d\3\2\2\2\u016a\35\3\2\2\2\u016b\u016c\7\f\2\2\u016c\u016f"+
		"\7\r\2\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\37\3\2\2\2\u0170\u0171\b\21\1\2\u0171\u0175\5.\30\2\u0172\u0175\5> \2"+
		"\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u017c\3\2\2\2\u0176\u0177\f\6\2\2\u0177\u017b\5.\30\2\u0178"+
		"\u0179\f\4\2\2\u0179\u017b\5> \2\u017a\u0176\3\2\2\2\u017a\u0178\3\2\2"+
		"\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d!"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\b\22\1\2\u0180\u0181\5\62\32"+
		"\2\u0181\u0189\3\2\2\2\u0182\u0183\f\5\2\2\u0183\u0184\7\16\2\2\u0184"+
		"\u0188\5\62\32\2\u0185\u0186\f\3\2\2\u0186\u0188\7\16\2\2\u0187\u0182"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a#\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\17\2\2"+
		"\u018d\u018e\5\36\20\2\u018e\u018f\7?\2\2\u018f\u0190\7\4\2\2\u0190\u0191"+
		"\5&\24\2\u0191\u0192\7\5\2\2\u0192\u01d5\3\2\2\2\u0193\u0194\7\17\2\2"+
		"\u0194\u0195\5\36\20\2\u0195\u0196\7?\2\2\u0196\u0197\7\4\2\2\u0197\u0198"+
		"\5&\24\2\u0198\u0199\7\5\2\2\u0199\u019a\7/\2\2\u019a\u019b\7\4\2\2\u019b"+
		"\u019c\5\"\22\2\u019c\u019d\7\5\2\2\u019d\u01d5\3\2\2\2\u019e\u019f\5"+
		"<\37\2\u019f\u01a0\7\17\2\2\u01a0\u01a1\5\36\20\2\u01a1\u01a2\7?\2\2\u01a2"+
		"\u01a3\7\4\2\2\u01a3\u01a4\5&\24\2\u01a4\u01a5\7\5\2\2\u01a5\u01d5\3\2"+
		"\2\2\u01a6\u01a7\5<\37\2\u01a7\u01a8\7\17\2\2\u01a8\u01a9\5\36\20\2\u01a9"+
		"\u01aa\7?\2\2\u01aa\u01ab\7\4\2\2\u01ab\u01ac\5&\24\2\u01ac\u01ad\7\5"+
		"\2\2\u01ad\u01ae\7/\2\2\u01ae\u01af\7\4\2\2\u01af\u01b0\5\"\22\2\u01b0"+
		"\u01b1\7\5\2\2\u01b1\u01d5\3\2\2\2\u01b2\u01b3\7\17\2\2\u01b3\u01b4\5"+
		"\36\20\2\u01b4\u01b5\7?\2\2\u01b5\u01b6\7\4\2\2\u01b6\u01b7\7\5\2\2\u01b7"+
		"\u01d5\3\2\2\2\u01b8\u01b9\7\17\2\2\u01b9\u01ba\5\36\20\2\u01ba\u01bb"+
		"\7?\2\2\u01bb\u01bc\7\4\2\2\u01bc\u01bd\7\5\2\2\u01bd\u01be\7/\2\2\u01be"+
		"\u01bf\7\4\2\2\u01bf\u01c0\5\"\22\2\u01c0\u01c1\7\5\2\2\u01c1\u01d5\3"+
		"\2\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7\17\2\2\u01c4\u01c5\5\36\20\2"+
		"\u01c5\u01c6\7?\2\2\u01c6\u01c7\7\4\2\2\u01c7\u01c8\7\5\2\2\u01c8\u01d5"+
		"\3\2\2\2\u01c9\u01ca\5<\37\2\u01ca\u01cb\7\17\2\2\u01cb\u01cc\5\36\20"+
		"\2\u01cc\u01cd\7?\2\2\u01cd\u01ce\7\4\2\2\u01ce\u01cf\7\5\2\2\u01cf\u01d0"+
		"\7/\2\2\u01d0\u01d1\7\4\2\2\u01d1\u01d2\5\"\22\2\u01d2\u01d3\7\5\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u018c\3\2\2\2\u01d4\u0193\3\2\2\2\u01d4\u019e\3\2"+
		"\2\2\u01d4\u01a6\3\2\2\2\u01d4\u01b2\3\2\2\2\u01d4\u01b8\3\2\2\2\u01d4"+
		"\u01c2\3\2\2\2\u01d4\u01c9\3\2\2\2\u01d5%\3\2\2\2\u01d6\u01d7\b\24\1\2"+
		"\u01d7\u01da\5.\30\2\u01d8\u01da\5> \2\u01d9\u01d6\3\2\2\2\u01d9\u01d8"+
		"\3\2\2\2\u01da\u01e1\3\2\2\2\u01db\u01dc\f\5\2\2\u01dc\u01e0\5.\30\2\u01dd"+
		"\u01de\f\3\2\2\u01de\u01e0\5> \2\u01df\u01db\3\2\2\2\u01df\u01dd\3\2\2"+
		"\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\'"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\b\25\1\2\u01e5\u01e8\5*\26\2"+
		"\u01e6\u01e8\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01ed"+
		"\3\2\2\2\u01e9\u01ea\f\5\2\2\u01ea\u01ec\5*\26\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee)\3\2\2\2"+
		"\u01ef\u01ed\3\2\2\2\u01f0\u01f3\5.\30\2\u01f1\u01f3\5> \2\u01f2\u01f0"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3+\3\2\2\2\u01f4\u01f5\b\27\1\2\u01f5"+
		"\u01f6\5\62\32\2\u01f6\u01fe\3\2\2\2\u01f7\u01f8\f\5\2\2\u01f8\u01f9\7"+
		"\16\2\2\u01f9\u01fd\5\62\32\2\u01fa\u01fb\f\3\2\2\u01fb\u01fd\7\16\2\2"+
		"\u01fc\u01f7\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff-\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0202\5\60\31\2\u0202\u0203\7\4\2\2\u0203\u0204\5\66\34\2\u0204\u0205"+
		"\7\5\2\2\u0205/\3\2\2\2\u0206\u0207\5\62\32\2\u0207\61\3\2\2\2\u0208\u0209"+
		"\5<\37\2\u0209\u020a\58\35\2\u020a\u020b\5:\36\2\u020b\u020c\7\20\2\2"+
		"\u020c\u020d\5J&\2\u020d\u0211\7\21\2\2\u020e\u0210\7\63\2\2\u020f\u020e"+
		"\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0229\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\5<\37\2\u0215\u0216\58"+
		"\35\2\u0216\u021a\5:\36\2\u0217\u0219\7\63\2\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0229\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021d\u021e\5<\37\2\u021e\u021f\5:\36\2\u021f"+
		"\u0220\7\20\2\2\u0220\u0221\5J&\2\u0221\u0225\7\21\2\2\u0222\u0224\7\63"+
		"\2\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0208\3\2"+
		"\2\2\u0228\u0214\3\2\2\2\u0228\u021d\3\2\2\2\u0229\63\3\2\2\2\u022a\u022b"+
		"\b\33\1\2\u022b\u0232\5> \2\u022c\u022d\5N(\2\u022d\u022e\7\16\2\2\u022e"+
		"\u022f\5> \2\u022f\u0232\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022a\3\2\2"+
		"\2\u0231\u022c\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u023b\3\2\2\2\u0233\u0234"+
		"\f\6\2\2\u0234\u023a\5> \2\u0235\u0236\f\5\2\2\u0236\u023a\5N(\2\u0237"+
		"\u0238\f\4\2\2\u0238\u023a\7\16\2\2\u0239\u0233\3\2\2\2\u0239\u0235\3"+
		"\2\2\2\u0239\u0237\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\65\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0246\5\64\33"+
		"\2\u023f\u0240\5\64\33\2\u0240\u0241\5\b\5\2\u0241\u0246\3\2\2\2\u0242"+
		"\u0243\5\b\5\2\u0243\u0244\5\64\33\2\u0244\u0246\3\2\2\2\u0245\u023e\3"+
		"\2\2\2\u0245\u023f\3\2\2\2\u0245\u0242\3\2\2\2\u0246\67\3\2\2\2\u0247"+
		"\u024a\5D#\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2"+
		"\2\u024a9\3\2\2\2\u024b\u024c\t\2\2\2\u024c;\3\2\2\2\u024d\u0251\7\22"+
		"\2\2\u024e\u0251\7\23\2\2\u024f\u0251\3\2\2\2\u0250\u024d\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251=\3\2\2\2\u0252\u0253\5<\37\2"+
		"\u0253\u0254\5B\"\2\u0254\u0255\5H%\2\u0255\u0256\7\16\2\2\u0256\u0263"+
		"\3\2\2\2\u0257\u0258\5<\37\2\u0258\u0259\5B\"\2\u0259\u025a\5H%\2\u025a"+
		"\u0263\3\2\2\2\u025b\u025c\5B\"\2\u025c\u025d\5H%\2\u025d\u025e\7\16\2"+
		"\2\u025e\u0263\3\2\2\2\u025f\u0260\5B\"\2\u0260\u0261\5H%\2\u0261\u0263"+
		"\3\2\2\2\u0262\u0252\3\2\2\2\u0262\u0257\3\2\2\2\u0262\u025b\3\2\2\2\u0262"+
		"\u025f\3\2\2\2\u0263?\3\2\2\2\u0264\u0265\5B\"\2\u0265\u0266\7?\2\2\u0266"+
		"A\3\2\2\2\u0267\u0268\5D#\2\u0268\u0269\7\f\2\2\u0269\u026a\7\r\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u026d\5D#\2\u026c\u0267\3\2\2\2\u026c\u026b\3\2\2"+
		"\2\u026dC\3\2\2\2\u026e\u0273\7?\2\2\u026f\u0270\7?\2\2\u0270\u0273\5"+
		"\24\13\2\u0271\u0273\5F$\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273E\3\2\2\2\u0274\u0275\t\3\2\2\u0275G\3\2\2\2\u0276"+
		"\u0277\b%\1\2\u0277\u027c\7?\2\2\u0278\u0279\7?\2\2\u0279\u027a\7C\2\2"+
		"\u027a\u027c\5N(\2\u027b\u0276\3\2\2\2\u027b\u0278\3\2\2\2\u027c\u0287"+
		"\3\2\2\2\u027d\u027e\f\5\2\2\u027e\u027f\7\n\2\2\u027f\u0286\7?\2\2\u0280"+
		"\u0281\f\3\2\2\u0281\u0282\7\n\2\2\u0282\u0283\7?\2\2\u0283\u0284\7C\2"+
		"\2\u0284\u0286\5N(\2\u0285\u027d\3\2\2\2\u0285\u0280\3\2\2\2\u0286\u0289"+
		"\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288I\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u028a\u028b\b&\1\2\u028b\u028e\5L\'\2\u028c\u028e\3\2\2"+
		"\2\u028d\u028a\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u0294\3\2\2\2\u028f\u0290"+
		"\f\4\2\2\u0290\u0291\7\n\2\2\u0291\u0293\5L\'\2\u0292\u028f\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295K\3\2\2\2"+
		"\u0296\u0294\3\2\2\2\u0297\u0298\5B\"\2\u0298\u0299\7?\2\2\u0299M\3\2"+
		"\2\2\u029a\u02a8\5P)\2\u029b\u02a8\5X-\2\u029c\u02a8\5b\62\2\u029d\u02a8"+
		"\5f\64\2\u029e\u02a8\5h\65\2\u029f\u02a8\5j\66\2\u02a0\u02a8\5l\67\2\u02a1"+
		"\u02a8\5n8\2\u02a2\u02a8\7,\2\2\u02a3\u02a8\7-\2\2\u02a4\u02a5\7.\2\2"+
		"\u02a5\u02a8\5N(\2\u02a6\u02a8\7.\2\2\u02a7\u029a\3\2\2\2\u02a7\u029b"+
		"\3\2\2\2\u02a7\u029c\3\2\2\2\u02a7\u029d\3\2\2\2\u02a7\u029e\3\2\2\2\u02a7"+
		"\u029f\3\2\2\2\u02a7\u02a0\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a2\3\2"+
		"\2\2\u02a7\u02a3\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8"+
		"O\3\2\2\2\u02a9\u02aa\b)\1\2\u02aa\u02af\5R*\2\u02ab\u02ac\7\67\2\2\u02ac"+
		"\u02ae\5R*\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2"+
		"\2\u02af\u02b0\3\2\2\2\u02b0\u02b4\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4"+
		"\5f\64\2\u02b3\u02a9\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02ba\3\2\2\2\u02b5"+
		"\u02b6\f\3\2\2\u02b6\u02b7\7C\2\2\u02b7\u02b9\5N(\2\u02b8\u02b5\3\2\2"+
		"\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbQ"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\b*\1\2\u02be\u02c3\5T+\2\u02bf"+
		"\u02c0\78\2\2\u02c0\u02c2\5T+\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2"+
		"\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02cb\3\2\2\2\u02c5\u02c3"+
		"\3\2\2\2\u02c6\u02c7\f\4\2\2\u02c7\u02c8\7\64\2\2\u02c8\u02ca\5V,\2\u02c9"+
		"\u02c6\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02ccS\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02cf\7\67\2\2\u02cf\u02d2"+
		"\5V,\2\u02d0\u02d2\5V,\2\u02d1\u02ce\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"U\3\2\2\2\u02d3\u02d4\b,\1\2\u02d4\u02d5\7>\2\2\u02d5\u02fd\5V,\f\u02d6"+
		"\u02d7\7\60\2\2\u02d7\u02fd\5`\61\2\u02d8\u02d9\7\60\2\2\u02d9\u02da\5"+
		"D#\2\u02da\u02db\7\f\2\2\u02db\u02dc\5N(\2\u02dc\u02dd\7\r\2\2\u02dd\u02fd"+
		"\3\2\2\2\u02de\u02df\7\60\2\2\u02df\u02e0\7?\2\2\u02e0\u02e1\5\24\13\2"+
		"\u02e1\u02e2\7\20\2\2\u02e2\u02e3\5v<\2\u02e3\u02e4\7\21\2\2\u02e4\u02fd"+
		"\3\2\2\2\u02e5\u02e6\5F$\2\u02e6\u02e7\7\30\2\2\u02e7\u02e8\5`\61\2\u02e8"+
		"\u02fd\3\2\2\2\u02e9\u02fd\5r:\2\u02ea\u02fd\5`\61\2\u02eb\u02fd\7?\2"+
		"\2\u02ec\u02fd\5t;\2\u02ed\u02ee\7\20\2\2\u02ee\u02ef\5P)\2\u02ef\u02f0"+
		"\7\21\2\2\u02f0\u02fd\3\2\2\2\u02f1\u02f2\7>\2\2\u02f2\u02f3\5N(\2\u02f3"+
		"\u02f4\7\f\2\2\u02f4\u02f5\5N(\2\u02f5\u02f6\7\r\2\2\u02f6\u02fd\3\2\2"+
		"\2\u02f7\u02f8\7>\2\2\u02f8\u02f9\5N(\2\u02f9\u02fa\7\30\2\2\u02fa\u02fb"+
		"\7?\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02d3\3\2\2\2\u02fc\u02d6\3\2\2\2\u02fc"+
		"\u02d8\3\2\2\2\u02fc\u02de\3\2\2\2\u02fc\u02e5\3\2\2\2\u02fc\u02e9\3\2"+
		"\2\2\u02fc\u02ea\3\2\2\2\u02fc\u02eb\3\2\2\2\u02fc\u02ec\3\2\2\2\u02fc"+
		"\u02ed\3\2\2\2\u02fc\u02f1\3\2\2\2\u02fc\u02f7\3\2\2\2\u02fd\u031f\3\2"+
		"\2\2\u02fe\u02ff\f\23\2\2\u02ff\u0300\7\30\2\2\u0300\u031e\5`\61\2\u0301"+
		"\u0302\f\21\2\2\u0302\u0303\7\30\2\2\u0303\u031e\7?\2\2\u0304\u0305\f"+
		"\r\2\2\u0305\u031e\7>\2\2\u0306\u0307\f\t\2\2\u0307\u0308\7\f\2\2\u0308"+
		"\u0309\5N(\2\u0309\u030a\7\r\2\2\u030a\u031e\3\2\2\2\u030b\u030c\f\b\2"+
		"\2\u030c\u030d\7\f\2\2\u030d\u030e\5N(\2\u030e\u030f\7\r\2\2\u030f\u0310"+
		"\7>\2\2\u0310\u031e\3\2\2\2\u0311\u0312\f\5\2\2\u0312\u0313\7\30\2\2\u0313"+
		"\u0314\7?\2\2\u0314\u031e\7>\2\2\u0315\u0316\f\4\2\2\u0316\u0317\7\30"+
		"\2\2\u0317\u031e\7\61\2\2\u0318\u0319\f\3\2\2\u0319\u031a\7\30\2\2\u031a"+
		"\u031b\7\61\2\2\u031b\u031c\7\20\2\2\u031c\u031e\7\21\2\2\u031d\u02fe"+
		"\3\2\2\2\u031d\u0301\3\2\2\2\u031d\u0304\3\2\2\2\u031d\u0306\3\2\2\2\u031d"+
		"\u030b\3\2\2\2\u031d\u0311\3\2\2\2\u031d\u0315\3\2\2\2\u031d\u0318\3\2"+
		"\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"W\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0323\b-\1\2\u0323\u0328\5Z.\2\u0324"+
		"\u0325\7\65\2\2\u0325\u0327\5Z.\2\u0326\u0324\3\2\2\2\u0327\u032a\3\2"+
		"\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0332\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032b\u0332\5f\64\2\u032c\u032d\5P)\2\u032d\u032e\t\4\2"+
		"\2\u032e\u032f\5P)\2\u032f\u0332\3\2\2\2\u0330\u0332\5P)\2\u0331\u0322"+
		"\3\2\2\2\u0331\u032b\3\2\2\2\u0331\u032c\3\2\2\2\u0331\u0330\3\2\2\2\u0332"+
		"\u033b\3\2\2\2\u0333\u0334\f\6\2\2\u0334\u0335\t\5\2\2\u0335\u033a\5X"+
		"-\7\u0336\u0337\f\4\2\2\u0337\u0338\7C\2\2\u0338\u033a\5N(\2\u0339\u0333"+
		"\3\2\2\2\u0339\u0336\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033cY\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0343\5\\/\2\u033f"+
		"\u0340\7\66\2\2\u0340\u0342\5\\/\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2"+
		"\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344[\3\2\2\2\u0345\u0343"+
		"\3\2\2\2\u0346\u0347\7=\2\2\u0347\u034a\5X-\2\u0348\u034a\5^\60\2\u0349"+
		"\u0346\3\2\2\2\u0349\u0348\3\2\2\2\u034a]\3\2\2\2\u034b\u0353\5t;\2\u034c"+
		"\u0353\7?\2\2\u034d\u0353\5r:\2\u034e\u034f\7\20\2\2\u034f\u0350\5X-\2"+
		"\u0350\u0351\7\21\2\2\u0351\u0353\3\2\2\2\u0352\u034b\3\2\2\2\u0352\u034c"+
		"\3\2\2\2\u0352\u034d\3\2\2\2\u0352\u034e\3\2\2\2\u0353_\3\2\2\2\u0354"+
		"\u0355\5:\36\2\u0355\u0356\7\20\2\2\u0356\u0357\5v<\2\u0357\u0358\7\21"+
		"\2\2\u0358\u035f\3\2\2\2\u0359\u035a\5D#\2\u035a\u035b\7\20\2\2\u035b"+
		"\u035c\5v<\2\u035c\u035d\7\21\2\2\u035d\u035f\3\2\2\2\u035e\u0354\3\2"+
		"\2\2\u035e\u0359\3\2\2\2\u035fa\3\2\2\2\u0360\u0361\7\4\2\2\u0361\u0362"+
		"\5\64\33\2\u0362\u0363\7\5\2\2\u0363\u0367\3\2\2\2\u0364\u0365\7\4\2\2"+
		"\u0365\u0367\7\5\2\2\u0366\u0360\3\2\2\2\u0366\u0364\3\2\2\2\u0367c\3"+
		"\2\2\2\u0368\u036b\5N(\2\u0369\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036a"+
		"\u0369\3\2\2\2\u036be\3\2\2\2\u036c\u036d\7\37\2\2\u036d\u036e\7\20\2"+
		"\2\u036e\u036f\5N(\2\u036f\u0370\7\21\2\2\u0370\u0371\5N(\2\u0371\u037b"+
		"\3\2\2\2\u0372\u0373\7\37\2\2\u0373\u0374\7\20\2\2\u0374\u0375\5N(\2\u0375"+
		"\u0376\7\21\2\2\u0376\u0377\5N(\2\u0377\u0378\7 \2\2\u0378\u0379\5N(\2"+
		"\u0379\u037b\3\2\2\2\u037a\u036c\3\2\2\2\u037a\u0372\3\2\2\2\u037bg\3"+
		"\2\2\2\u037c\u037d\7!\2\2\u037d\u037e\7\20\2\2\u037e\u037f\5N(\2\u037f"+
		"\u0380\7\16\2\2\u0380\u0381\5N(\2\u0381\u0382\7\16\2\2\u0382\u0383\5N"+
		"(\2\u0383\u0384\7\21\2\2\u0384\u0385\5N(\2\u0385\u03a0\3\2\2\2\u0386\u0387"+
		"\7!\2\2\u0387\u0388\7\20\2\2\u0388\u0389\5> \2\u0389\u038a\5N(\2\u038a"+
		"\u038b\7\16\2\2\u038b\u038c\5N(\2\u038c\u038d\7\21\2\2\u038d\u038e\5N"+
		"(\2\u038e\u03a0\3\2\2\2\u038f\u0390\7!\2\2\u0390\u0391\7\20\2\2\u0391"+
		"\u0392\7?\2\2\u0392\u0393\7\"\2\2\u0393\u0394\5N(\2\u0394\u0395\7\21\2"+
		"\2\u0395\u0396\5N(\2\u0396\u03a0\3\2\2\2\u0397\u0398\7!\2\2\u0398\u0399"+
		"\7\20\2\2\u0399\u039a\5@!\2\u039a\u039b\7\"\2\2\u039b\u039c\5N(\2\u039c"+
		"\u039d\7\21\2\2\u039d\u039e\5N(\2\u039e\u03a0\3\2\2\2\u039f\u037c\3\2"+
		"\2\2\u039f\u0386\3\2\2\2\u039f\u038f\3\2\2\2\u039f\u0397\3\2\2\2\u03a0"+
		"i\3\2\2\2\u03a1\u03a2\7#\2\2\u03a2\u03a3\7\20\2\2\u03a3\u03a4\5N(\2\u03a4"+
		"\u03a5\7\21\2\2\u03a5\u03a6\5N(\2\u03a6k\3\2\2\2\u03a7\u03a8\7$\2\2\u03a8"+
		"\u03a9\5N(\2\u03a9\u03aa\7#\2\2\u03aa\u03ab\7\20\2\2\u03ab\u03ac\5N(\2"+
		"\u03ac\u03ad\7\21\2\2\u03adm\3\2\2\2\u03ae\u03af\7)\2\2\u03af\u03b0\7"+
		"\20\2\2\u03b0\u03b1\5N(\2\u03b1\u03b2\7\21\2\2\u03b2\u03b6\7\4\2\2\u03b3"+
		"\u03b5\5p9\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2"+
		"\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba"+
		"\7\5\2\2\u03bao\3\2\2\2\u03bb\u03bc\7*\2\2\u03bc\u03bf\5t;\2\u03bd\u03bf"+
		"\7+\2\2\u03be\u03bb\3\2\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c1\7\"\2\2\u03c1\u03c2\5\64\33\2\u03c2q\3\2\2\2\u03c3\u03c4\7\62\2"+
		"\2\u03c4s\3\2\2\2\u03c5\u03c6\t\6\2\2\u03c6u\3\2\2\2\u03c7\u03c8\b<\1"+
		"\2\u03c8\u03cb\5N(\2\u03c9\u03cb\3\2\2\2\u03ca\u03c7\3\2\2\2\u03ca\u03c9"+
		"\3\2\2\2\u03cb\u03d1\3\2\2\2\u03cc\u03cd\f\4\2\2\u03cd\u03ce\7\n\2\2\u03ce"+
		"\u03d0\5N(\2\u03cf\u03cc\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2"+
		"\2\u03d1\u03d2\3\2\2\2\u03d2w\3\2\2\2\u03d3\u03d1\3\2\2\2O|\u0083\u0089"+
		"\u008f\u009d\u00ac\u00b8\u00c6\u00d2\u00db\u00ec\u00f5\u0100\u0108\u010d"+
		"\u0113\u011b\u0169\u016e\u0174\u017a\u017c\u0187\u0189\u01d4\u01d9\u01df"+
		"\u01e1\u01e7\u01ed\u01f2\u01fc\u01fe\u0211\u021a\u0225\u0228\u0231\u0239"+
		"\u023b\u0245\u0249\u0250\u0262\u026c\u0272\u027b\u0285\u0287\u028d\u0294"+
		"\u02a7\u02af\u02b3\u02ba\u02c3\u02cb\u02d1\u02fc\u031d\u031f\u0328\u0331"+
		"\u0339\u033b\u0343\u0349\u0352\u035e\u0366\u036a\u037a\u039f\u03b6\u03be"+
		"\u03ca\u03d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}