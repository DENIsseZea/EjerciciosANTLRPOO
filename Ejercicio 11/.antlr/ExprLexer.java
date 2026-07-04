// Generated from c:/Users/denis/Tecnologico/Automatas 2/EjerciciosANTLRPOO/Ejercicio 11/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, INT=5, STRING=6, NUM=7, CADENA=8, 
		ID=9, IGUAL=10, MAS=11, PUNTO=12, PUNTO_COMA=13, PAR_IZQ=14, PAR_DER=15, 
		LLAVE_IZQ=16, LLAVE_DER=17, COR_IZQ=18, COR_DER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "INT", "STRING", "NUM", "CADENA", 
			"ID", "IGUAL", "MAS", "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "COR_IZQ", "COR_DER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'int'", "'String'", 
			null, null, null, "'='", "'+'", "'.'", "';'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "INT", "STRING", "NUM", "CADENA", 
			"ID", "IGUAL", "MAS", "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "COR_IZQ", "COR_DER", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0014}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006O\b"+
		"\u0006\u000b\u0006\f\u0006P\u0001\u0007\u0001\u0007\u0005\u0007U\b\u0007"+
		"\n\u0007\f\u0007X\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\b^\b\b\n\b\f\ba\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013x\b\u0013\u000b\u0013\f\u0013y\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\u0005\u0001\u000009\u0003\u0000\n\n\r\r\""+
		"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0080\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u00030\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007="+
		"\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000"+
		"\u0011[\u0001\u0000\u0000\u0000\u0013b\u0001\u0000\u0000\u0000\u0015d"+
		"\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019h\u0001\u0000"+
		"\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dl\u0001\u0000\u0000\u0000"+
		"\u001fn\u0001\u0000\u0000\u0000!p\u0001\u0000\u0000\u0000#r\u0001\u0000"+
		"\u0000\u0000%t\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000\u0000)*\u0005"+
		"p\u0000\u0000*+\u0005u\u0000\u0000+,\u0005b\u0000\u0000,-\u0005l\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005c\u0000\u0000/\u0002\u0001\u0000\u0000"+
		"\u000001\u0005c\u0000\u000012\u0005l\u0000\u000023\u0005a\u0000\u0000"+
		"34\u0005s\u0000\u000045\u0005s\u0000\u00005\u0004\u0001\u0000\u0000\u0000"+
		"67\u0005s\u0000\u000078\u0005t\u0000\u000089\u0005a\u0000\u00009:\u0005"+
		"t\u0000\u0000:;\u0005i\u0000\u0000;<\u0005c\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005v\u0000\u0000>?\u0005o\u0000\u0000?@\u0005i\u0000"+
		"\u0000@A\u0005d\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005i\u0000"+
		"\u0000CD\u0005n\u0000\u0000DE\u0005t\u0000\u0000E\n\u0001\u0000\u0000"+
		"\u0000FG\u0005S\u0000\u0000GH\u0005t\u0000\u0000HI\u0005r\u0000\u0000"+
		"IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000KL\u0005g\u0000\u0000L\f\u0001"+
		"\u0000\u0000\u0000MO\u0007\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u000e\u0001\u0000\u0000\u0000RV\u0005\"\u0000\u0000SU\b\u0001"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\"\u0000\u0000Z\u0010\u0001\u0000\u0000"+
		"\u0000[_\u0007\u0002\u0000\u0000\\^\u0007\u0003\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\u0012\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005=\u0000\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005+\u0000"+
		"\u0000e\u0016\u0001\u0000\u0000\u0000fg\u0005.\u0000\u0000g\u0018\u0001"+
		"\u0000\u0000\u0000hi\u0005;\u0000\u0000i\u001a\u0001\u0000\u0000\u0000"+
		"jk\u0005(\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005)\u0000\u0000"+
		"m\u001e\u0001\u0000\u0000\u0000no\u0005{\u0000\u0000o \u0001\u0000\u0000"+
		"\u0000pq\u0005}\u0000\u0000q\"\u0001\u0000\u0000\u0000rs\u0005[\u0000"+
		"\u0000s$\u0001\u0000\u0000\u0000tu\u0005]\u0000\u0000u&\u0001\u0000\u0000"+
		"\u0000vx\u0007\u0004\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0006\u0013\u0000\u0000|(\u0001\u0000\u0000\u0000"+
		"\u0005\u0000PV_y\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}