// Generated from Logo.g4 by ANTLR 4.13.1
package fr.utc.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FLOAT=5, WS=6, COMMENT1=7, COMMENT2=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "FLOAT", "WS", "COMMENT1", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'av'", "'td'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FLOAT", "WS", "COMMENT1", "COMMENT2"
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

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
		"\u0004\u0000\bO\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u001e\b\u0004\n\u0004\f\u0004!\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004%\b\u0004\u000b\u0004\f\u0004&\u0003\u0004"+
		")\b\u0004\u0001\u0005\u0004\u0005,\b\u0005\u000b\u0005\f\u0005-\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u00066\b\u0006\n\u0006\f\u00069\t\u0006\u0001\u0006\u0004\u0006<\b\u0006"+
		"\u000b\u0006\f\u0006=\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007F\b\u0007\n\u0007\f\u0007I\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u00027G\u0000"+
		"\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0001\u0000\u0003\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0002\u0000\n\n\r\rU\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u0014\u0001\u0000"+
		"\u0000\u0000\u0005\u0017\u0001\u0000\u0000\u0000\u0007\u0019\u0001\u0000"+
		"\u0000\u0000\t\u001b\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000"+
		"\u0000\r1\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005a\u0000\u0000\u0012\u0013\u0005v\u0000\u0000\u0013\u0002\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005t\u0000\u0000\u0015\u0016\u0005d\u0000"+
		"\u0000\u0016\u0004\u0001\u0000\u0000\u0000\u0017\u0018\u0005(\u0000\u0000"+
		"\u0018\u0006\u0001\u0000\u0000\u0000\u0019\u001a\u0005)\u0000\u0000\u001a"+
		"\b\u0001\u0000\u0000\u0000\u001b\u001f\u0007\u0000\u0000\u0000\u001c\u001e"+
		"\u0007\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 (\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"$\u0005.\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\n\u0001\u0000\u0000\u0000*,\u0007\u0001\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0005\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000012\u0005/\u0000\u000023\u0005/\u0000"+
		"\u000037\u0001\u0000\u0000\u000046\t\u0000\u0000\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0007"+
		"\u0002\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0006\u0006\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005"+
		"/\u0000\u0000BC\u0005*\u0000\u0000CG\u0001\u0000\u0000\u0000DF\t\u0000"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000KL\u0005/\u0000\u0000L"+
		"M\u0001\u0000\u0000\u0000MN\u0006\u0007\u0000\u0000N\u0010\u0001\u0000"+
		"\u0000\u0000\b\u0000\u001f&(-7=G\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}