// Generated from Logo.g4 by ANTLR 4.3
package fr.utc.parsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class LogoLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__3 = 1, T__2 = 2, T__1 = 3, T__0 = 4, FLOAT = 5, WS = 6, COMMENT1 = 7, COMMENT2 = 8;
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
			"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
			"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
			"T__3", "T__2", "T__1", "T__0", "FLOAT", "WS", "COMMENT1", "COMMENT2"
	};

	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

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
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nQ\b\1\4\2\t\2\4"
			+
			"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3" +
			"\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6 \n\6\f\6\16\6#\13\6\3\6\3\6\6\6\'" +
			"\n\6\r\6\16\6(\5\6+\n\6\3\7\6\7.\n\7\r\7\16\7/\3\7\3\7\3\b\3\b\3\b\3\b" +
			"\7\b8\n\b\f\b\16\b;\13\b\3\b\6\b>\n\b\r\b\16\b?\3\b\3\b\3\t\3\t\3\t\3" +
			"\t\7\tH\n\t\f\t\16\tK\13\t\3\t\3\t\3\t\3\t\3\t\49I\2\n\3\3\5\4\7\5\t\6" +
			"\13\7\r\b\17\t\21\n\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17W\2" +
			"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2" +
			"\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7\30\3\2\2\2\t" +
			"\32\3\2\2\2\13\35\3\2\2\2\r-\3\2\2\2\17\63\3\2\2\2\21C\3\2\2\2\23\24\7" +
			"c\2\2\24\25\7x\2\2\25\4\3\2\2\2\26\27\7*\2\2\27\6\3\2\2\2\30\31\7+\2\2" +
			"\31\b\3\2\2\2\32\33\7v\2\2\33\34\7f\2\2\34\n\3\2\2\2\35!\t\2\2\2\36 \t" +
			"\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"*\3\2\2\2#!\3\2" +
			"\2\2$&\7\60\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)+" +
			"\3\2\2\2*$\3\2\2\2*+\3\2\2\2+\f\3\2\2\2,.\t\3\2\2-,\3\2\2\2./\3\2\2\2" +
			"/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\b\7\2\2\62\16\3\2\2\2\63\64" +
			"\7\61\2\2\64\65\7\61\2\2\659\3\2\2\2\668\13\2\2\2\67\66\3\2\2\28;\3\2" +
			"\2\29:\3\2\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\t\4\2\2=<\3\2\2\2>?\3" +
			"\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\b\2\2B\20\3\2\2\2CD\7\61\2\2" +
			"DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2" +
			"JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MN\7\61\2\2NO\3\2\2\2OP\b\t\2\2P\22\3\2\2" +
			"\2\n\2!(*/9?I\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}