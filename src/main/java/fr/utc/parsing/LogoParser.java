// Generated from Logo.g4 by ANTLR 4.3
package fr.utc.parsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class LogoParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__3 = 1, T__2 = 2, T__1 = 3, T__0 = 4, FLOAT = 5, WS = 6, COMMENT1 = 7, COMMENT2 = 8;
	public static final String[] tokenNames = {
			"<INVALID>", "'av'", "'('", "')'", "'td'", "FLOAT", "WS", "COMMENT1",
			"COMMENT2"
	};
	public static final int RULE_programme = 0, RULE_liste_instructions = 1, RULE_instruction = 2,
			RULE_expr = 3;
	public static final String[] ruleNames = {
			"programme", "liste_instructions", "instruction", "expr"
	};

	@Override
	public String getGrammarFileName() {
		return "Logo.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class, 0);
		}

		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_programme;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterProgramme(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitProgramme(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitProgramme(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(8);
				liste_instructions();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Liste_instructionsContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class, i);
		}

		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}

		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_liste_instructions;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterListe_instructions(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitListe_instructions(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitListe_instructions(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liste_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(10);
							instruction();
						}
					}
					setState(13);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == T__3 || _la == T__0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_instruction;
		}

		public InstructionContext() {
		}

		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class TdContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TdContext(InstructionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterTd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitTd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitTd(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class AvContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public AvContext(InstructionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterAv(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitAv(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitAv(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(19);
			switch (_input.LA(1)) {
				case T__3:
					_localctx = new AvContext(_localctx);
					enterOuterAlt(_localctx, 1); {
					setState(15);
					match(T__3);
					setState(16);
					expr();
				}
					break;
				case T__0:
					_localctx = new TdContext(_localctx);
					enterOuterAlt(_localctx, 2); {
					setState(17);
					match(T__0);
					setState(18);
					expr();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ParentheseContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ParentheseContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterParenthese(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitParenthese(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitParenthese(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() {
			return getToken(LogoParser.FLOAT, 0);
		}

		public FloatContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).enterFloat(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LogoListener)
				((LogoListener) listener).exitFloat(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof LogoVisitor)
				return ((LogoVisitor<? extends T>) visitor).visitFloat(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(26);
			switch (_input.LA(1)) {
				case FLOAT:
					_localctx = new FloatContext(_localctx);
					enterOuterAlt(_localctx, 1); {
					setState(21);
					match(FLOAT);
				}
					break;
				case T__2:
					_localctx = new ParentheseContext(_localctx);
					enterOuterAlt(_localctx, 2); {
					setState(22);
					match(T__2);
					setState(23);
					expr();
					setState(24);
					match(T__1);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\37\4\2\t\2\4\3"
			+
			"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\6\3\16\n\3\r\3\16\3\17\3\4\3\4\3\4\3" +
			"\4\5\4\26\n\4\3\5\3\5\3\5\3\5\3\5\5\5\35\n\5\3\5\2\2\6\2\4\6\b\2\2\35" +
			"\2\n\3\2\2\2\4\r\3\2\2\2\6\25\3\2\2\2\b\34\3\2\2\2\n\13\5\4\3\2\13\3\3" +
			"\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2" +
			"\2\20\5\3\2\2\2\21\22\7\3\2\2\22\26\5\b\5\2\23\24\7\6\2\2\24\26\5\b\5" +
			"\2\25\21\3\2\2\2\25\23\3\2\2\2\26\7\3\2\2\2\27\35\7\7\2\2\30\31\7\4\2" +
			"\2\31\32\5\b\5\2\32\33\7\5\2\2\33\35\3\2\2\2\34\27\3\2\2\2\34\30\3\2\2" +
			"\2\35\t\3\2\2\2\5\17\25\34";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}