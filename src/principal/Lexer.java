/* The following code was generated by JFlex 1.4.3 on 20/10/20 18:37 */

package principal;
import static principal.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 20/10/20 18:37 from the specification file
 * <tt>C:/Users/elmer/Desktop/Proyecto-Compiladores/src/principal/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\2\0\1\3\22\0\1\54\1\52\1\0\1\55"+
    "\1\55\1\43\1\55\1\0\1\45\1\46\1\41\1\37\1\3\1\40"+
    "\1\53\1\42\12\2\1\55\1\51\1\47\1\36\1\50\1\55\1\0"+
    "\1\31\1\34\2\1\1\32\14\1\1\33\10\1\3\0\1\44\1\1"+
    "\1\0\1\13\1\16\1\12\1\14\1\5\1\22\1\27\1\24\1\20"+
    "\2\1\1\15\1\23\1\6\1\11\1\25\1\1\1\10\1\17\1\7"+
    "\1\26\1\21\1\1\1\30\1\1\1\35\1\55\1\0\1\55\43\0"+
    "\1\55\22\0\1\55\12\0\1\55\41\0\1\55\7\0\1\55\3\0"+
    "\1\55\5\0\1\55\6\0\1\55\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\5\20\3\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\22\1\24\7\3"+
    "\1\25\11\3\1\26\10\3\1\27\1\30\1\31\1\22"+
    "\1\32\1\33\14\3\1\34\22\3\1\0\1\22\1\32"+
    "\7\3\1\24\1\35\10\3\1\36\2\3\1\37\1\40"+
    "\15\3\1\0\1\41\12\3\1\42\2\3\1\43\7\3"+
    "\1\44\2\3\1\45\5\3\1\41\1\46\7\3\1\47"+
    "\1\50\34\3\1\51\1\3\1\52\2\3\1\53\4\3"+
    "\1\54\1\3\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\6\3\1\63\4\3\1\64\3\3\1\65\6\3\1\66"+
    "\2\3\1\67\1\70\1\3\1\71\5\3\1\72\1\3"+
    "\1\73\1\3\1\74\1\3\1\75\1\3\1\76\1\77"+
    "\1\100\2\3\1\101\1\3\1\102";

  private static int [] zzUnpackAction() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\56\0\346\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u0422\0\u0450\0\u047e\0\u0450\0\56\0\u0450\0\u0450\0\u0450"+
    "\0\u0450\0\u0450\0\u04ac\0\u04da\0\u0450\0\u04da\0\u0508\0\u0536"+
    "\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\134\0\u064a\0\u0678"+
    "\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958"+
    "\0\56\0\u0450\0\u0450\0\u0986\0\u09b4\0\56\0\u09e2\0\u0a10"+
    "\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80"+
    "\0\u0bae\0\u0bdc\0\134\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2"+
    "\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32"+
    "\0\u0e60\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2"+
    "\0\u0fd0\0\u0ffe\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4\0\134"+
    "\0\134\0\u1112\0\u1140\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226"+
    "\0\u1254\0\134\0\u1282\0\u12b0\0\134\0\134\0\u12de\0\u130c"+
    "\0\u133a\0\u1368\0\u1396\0\u13c4\0\u13f2\0\u1420\0\u144e\0\u147c"+
    "\0\u14aa\0\u14d8\0\u1506\0\u1534\0\u0450\0\u1562\0\u1590\0\u15be"+
    "\0\u15ec\0\u161a\0\u1648\0\u1676\0\u16a4\0\u16d2\0\u1700\0\134"+
    "\0\u172e\0\u175c\0\134\0\u178a\0\u17b8\0\u17e6\0\u1814\0\u1842"+
    "\0\u1870\0\u189e\0\134\0\u18cc\0\u18fa\0\134\0\u1928\0\u1956"+
    "\0\u1984\0\u19b2\0\u19e0\0\56\0\134\0\u1a0e\0\u1a3c\0\u1a6a"+
    "\0\u1a98\0\u1ac6\0\u1af4\0\u1b22\0\134\0\u1b50\0\u1b7e\0\u1bac"+
    "\0\u1bda\0\u1c08\0\u1c36\0\u1c64\0\u1c92\0\u1cc0\0\u1cee\0\u1d1c"+
    "\0\u1d4a\0\u1d78\0\u1da6\0\u1dd4\0\u1e02\0\u1e30\0\u1e5e\0\u1e8c"+
    "\0\u1eba\0\u1ee8\0\u1f16\0\u1f44\0\u1f72\0\u1fa0\0\u1fce\0\u1ffc"+
    "\0\u202a\0\u2058\0\134\0\u2086\0\134\0\u20b4\0\u20e2\0\134"+
    "\0\u2110\0\u213e\0\u216c\0\u219a\0\134\0\u21c8\0\134\0\134"+
    "\0\134\0\134\0\134\0\134\0\u21f6\0\u2224\0\u2252\0\u2280"+
    "\0\u22ae\0\u22dc\0\134\0\u230a\0\u2338\0\u2366\0\u2394\0\134"+
    "\0\u23c2\0\u23f0\0\u241e\0\134\0\u244c\0\u247a\0\u24a8\0\u24d6"+
    "\0\u2504\0\u2532\0\134\0\u2560\0\u258e\0\134\0\134\0\u25bc"+
    "\0\134\0\u25ea\0\u2618\0\u2646\0\u2674\0\u26a2\0\134\0\u26d0"+
    "\0\134\0\u26fe\0\134\0\u272c\0\134\0\u275a\0\134\0\134"+
    "\0\134\0\u2788\0\u27b6\0\134\0\u27e4\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\10\3\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\5\1\45\57\0"+
    "\2\3\2\0\31\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\1\45\1\4\2\0\31\45\1\0\5\45"+
    "\1\0\6\45\1\46\1\0\1\45\3\0\1\5\50\0"+
    "\1\5\2\0\2\3\2\0\1\3\1\47\6\3\1\50"+
    "\1\3\1\51\10\3\1\52\5\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\6\3\1\53"+
    "\22\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\54\5\3\1\55\22\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\3\3"+
    "\1\56\25\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\4\3\1\57\1\3\1\60\1\3"+
    "\1\61\20\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\3\1\62\27\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\63"+
    "\30\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\64\3\3\1\65\24\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\4\3"+
    "\1\66\24\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\67\12\3\1\70\15\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\1\3\1\71\27\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\72\30\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\6\3"+
    "\1\73\22\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\74\12\3\1\75\15\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\6\3\1\76\22\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\3\3\1\77\15\3\1\100"+
    "\7\3\1\0\5\45\1\0\7\45\1\0\1\45\36\0"+
    "\1\101\20\0\2\45\2\0\31\45\1\0\1\102\4\45"+
    "\1\0\7\45\1\0\1\45\1\0\1\45\1\4\2\0"+
    "\31\45\1\0\1\45\1\103\3\45\1\0\6\45\1\46"+
    "\1\0\1\45\1\0\2\45\2\0\31\45\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\45\2\0\31\45"+
    "\1\0\2\45\1\104\1\105\1\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\45\2\0\31\45\1\106\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\1\45\1\46\2\0\31\45"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\2\3\1\107\26\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\13\3\1\110\15\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\2\3\1\111\2\3\1\112\23\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\2\3"+
    "\1\113\26\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\3\1\114\27\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\6\3"+
    "\1\115\22\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\13\3\1\116\15\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\3"+
    "\1\117\10\3\1\120\16\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\7\3\1\121\21\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\6\3\1\122\22\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\7\3\1\123\21\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\5\3\1\124\4\3\1\125\1\3\1\126\14\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\1\127\30\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\22\3\1\130\6\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\10\3\1\131\20\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\3\1\132\27\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\1\3\1\133\27\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\5\3\1\134\4\3\1\135"+
    "\16\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\3\3\1\136\25\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\10\3\1\137"+
    "\20\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\2\3\1\140\26\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\1\141\30\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\5\3\1\142\23\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\4\3\1\143\6\3"+
    "\1\144\15\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\11\3\1\145\17\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\104\1\0\1\146"+
    "\31\104\1\0\2\45\1\147\2\45\1\0\7\45\1\146"+
    "\1\45\1\0\2\105\2\0\31\105\1\0\5\45\1\0"+
    "\7\45\1\150\1\45\1\0\2\3\2\0\1\151\3\3"+
    "\1\152\24\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\16\3\1\153\12\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\6\3"+
    "\1\154\22\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\3\3\1\155\25\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\13\3"+
    "\1\156\15\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\22\3\1\157\6\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\10\3"+
    "\1\160\20\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\30\3\1\161\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\12\3\1\162"+
    "\16\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\163\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\1\164\30\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\12\3\1\165\16\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\3\3\1\166\25\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\2\3\1\167\4\3\1\170\21\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\4\3\1\171"+
    "\24\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\3\3\1\172\25\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\6\3\1\173"+
    "\22\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\174\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\4\3\1\175\24\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\4\3\1\176\24\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\3\3\1\177\4\3"+
    "\1\200\20\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\2\3\1\201\26\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\7\3"+
    "\1\202\21\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\12\3\1\203\16\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\4\3"+
    "\1\204\24\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\3\1\205\27\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\206"+
    "\30\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\2\3\1\207\15\3\1\210\10\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\1\3\1\211\12\3\1\212\14\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\10\3\1\213"+
    "\20\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\146\1\0\32\146\3\0\1\214\12\0\1\146\2\0"+
    "\2\45\2\0\31\45\1\0\3\45\1\215\1\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\150\2\0\31\150\16\0"+
    "\1\150\2\0\2\3\2\0\3\3\1\216\25\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\1\3\1\217\27\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\13\3\1\220\15\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\2\3\1\221\26\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\13\3\1\222\15\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\1\223\30\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\224\30\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\2\3\1\225"+
    "\26\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\3\1\226\27\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\1\3\1\227"+
    "\27\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\230\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\1\231\30\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\3\3\1\232\25\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\233\30\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\10\3"+
    "\1\234\20\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\3\3\1\235\25\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\6\3"+
    "\1\236\22\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\237\30\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\21\3\1\240"+
    "\7\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\6\3\1\241\22\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\6\3\1\242"+
    "\22\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\4\3\1\243\24\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\7\3\1\244"+
    "\21\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\2\3\1\245\26\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\3\3\1\246"+
    "\25\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\247\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\13\3\1\250\15\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\5\3\1\251\23\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\6\3\1\252\22\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\13\3\1\253\15\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\42\0\1\254\14\0\2\3\2\0\4\3"+
    "\1\255\24\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\5\3\1\256\23\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\3"+
    "\1\257\27\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\13\3\1\260\15\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\11\3"+
    "\1\261\17\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\3\1\262\27\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\3"+
    "\1\263\27\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\3\3\1\264\25\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\4\3"+
    "\1\265\24\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\6\3\1\266\22\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\16\3"+
    "\1\267\12\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\21\3\1\270\7\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\14\3"+
    "\1\271\14\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\13\3\1\272\15\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\3"+
    "\1\273\27\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\16\3\1\274\12\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\13\3"+
    "\1\275\15\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\3\1\276\27\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\7\3"+
    "\1\277\21\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\4\3\1\300\24\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\3\3"+
    "\1\301\25\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\22\3\1\302\6\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\303"+
    "\30\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\13\3\1\304\15\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\7\3\1\305"+
    "\21\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\5\3\1\306\23\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\1\307\30\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\6\3\1\310\22\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\5\3\1\311\23\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\13\3\1\312\15\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\7\3\1\313\21\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\2\3\1\314\26\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\21\3\1\315\7\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\24\3\1\316\4\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\1\317\30\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\5\3\1\320\23\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\321\30\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\2\3"+
    "\1\322\26\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\4\3\1\323\24\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\1\324"+
    "\30\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\3\3\1\325\25\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\5\3\1\326"+
    "\23\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\327\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\12\3\1\330\16\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\6\3\1\331\22\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\13\3\1\332\15\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\7\3\1\333\21\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\20\3\1\334\10\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\4\3\1\335\24\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\6\3\1\336\22\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\12\3\1\337\16\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\3\3\1\340\25\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\4\3\1\341\24\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\3\3\1\342\25\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\1\343\30\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\344\30\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\5\3"+
    "\1\345\23\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\25\3\1\346\1\347\1\350\1\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\1\3\1\351\27\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\2\3\1\352\26\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\3\3\1\353\25\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\16\3\1\354\12\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\1\3\1\355\27\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\13\3\1\356\15\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\3\3\1\357\25\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\12\3\1\360\16\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\7\3\1\361\21\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\6\3\1\362\22\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\6\3\1\363\22\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\12\3\1\364\16\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\2\3\1\365\26\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\1\3\1\366\27\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\1\367\30\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\4\3\1\370\24\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\2\3\1\371\26\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\4\3\1\372\24\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\4\3\1\373\24\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\2\3\1\374\26\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\6\3\1\375\22\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\4\3\1\376\24\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\4\3\1\377\24\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\7\3\1\u0100\21\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\10\3\1\u0101\20\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\4\3\1\u0102\24\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\2\3\1\u0103\26\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\6\3\1\u0104\22\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\10\3\1\u0105\20\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\6\3\1\u0106\22\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\3\3\1\u0107\25\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\6\3\1\u0108\22\3\1\0"+
    "\5\45\1\0\7\45\1\0\1\45\1\0\2\3\2\0"+
    "\3\3\1\u0109\25\3\1\0\5\45\1\0\7\45\1\0"+
    "\1\45\1\0\2\3\2\0\1\u010a\30\3\1\0\5\45"+
    "\1\0\7\45\1\0\1\45\1\0\2\3\2\0\3\3"+
    "\1\u010b\25\3\1\0\5\45\1\0\7\45\1\0\1\45"+
    "\1\0\2\3\2\0\1\u010c\30\3\1\0\5\45\1\0"+
    "\7\45\1\0\1\45\1\0\2\3\2\0\10\3\1\u010d"+
    "\20\3\1\0\5\45\1\0\7\45\1\0\1\45\1\0"+
    "\2\3\2\0\1\u010e\30\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\3\3\1\u010f\25\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\3\3\1\u0110\25\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\12\3\1\u0111\16\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\3\3\1\u0112\25\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\6\3\1\u0113\22\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\4\3\1\u0114\24\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45\1\0\2\3\2\0\1\3\1\u0115\27\3"+
    "\1\0\5\45\1\0\7\45\1\0\1\45\1\0\2\3"+
    "\2\0\4\3\1\u0116\24\3\1\0\5\45\1\0\7\45"+
    "\1\0\1\45";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10258];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\3\1\1\11\26\1\1\11\43\1\1\11"+
    "\4\1\1\11\37\1\1\0\45\1\1\0\37\1\1\11"+
    "\152\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { lexeme=yytext(); return Identificador;
          }
        case 67: break;
        case 11: 
          { lexeme=yytext(); return Modulo;
          }
        case 68: break;
        case 14: 
          { lexeme=yytext(); return Pcerrar;
          }
        case 69: break;
        case 52: 
          { lexeme=yytext(); return Mientras;
          }
        case 70: break;
        case 39: 
          { lexeme=yytext(); return Coseno;
          }
        case 71: break;
        case 59: 
          { lexeme=yytext(); return Instanciar;
          }
        case 72: break;
        case 46: 
          { lexeme=yytext(); return Eliminar;
          }
        case 73: break;
        case 53: 
          { lexeme=yytext(); return Publicas;
          }
        case 74: break;
        case 60: 
          { lexeme=yytext(); return Constructor;
          }
        case 75: break;
        case 47: 
          { lexeme=yytext(); return Estatico;
          }
        case 76: break;
        case 27: 
          { lexeme=yytext(); return Distintoque;
          }
        case 77: break;
        case 51: 
          { lexeme=yytext(); return Devolver;
          }
        case 78: break;
        case 37: 
          { lexeme=yytext(); return Hacer;
          }
        case 79: break;
        case 5: 
          { return Linea;
          }
        case 80: break;
        case 36: 
          { lexeme=yytext(); return Falso;
          }
        case 81: break;
        case 54: 
          { lexeme=yytext(); return Logaritmo;
          }
        case 82: break;
        case 21: 
          { lexeme=yytext(); return Or;
          }
        case 83: break;
        case 18: 
          { lexeme=yytext(); return ErrorVariable;
          }
        case 84: break;
        case 10: 
          { lexeme=yytext(); return Division;
          }
        case 85: break;
        case 29: 
          { lexeme=yytext(); return Raiz;
          }
        case 86: break;
        case 48: 
          { lexeme=yytext(); return Escribir;
          }
        case 87: break;
        case 32: 
          { lexeme=yytext(); return Sino;
          }
        case 88: break;
        case 1: 
          { lexeme=yytext(); return Numero;
          }
        case 89: break;
        case 26: 
          { lexeme=yytext(); return Comentario;
          }
        case 90: break;
        case 24: 
          { lexeme=yytext(); return Masmas;
          }
        case 91: break;
        case 56: 
          { lexeme=yytext(); return Protegido;
          }
        case 92: break;
        case 34: 
          { lexeme=yytext(); return Clase;
          }
        case 93: break;
        case 63: 
          { lexeme=yytext(); return Incrementar;
          }
        case 94: break;
        case 16: 
          { lexeme=yytext(); return Mayorque;
          }
        case 95: break;
        case 42: 
          { lexeme=yytext(); return Incluir;
          }
        case 96: break;
        case 13: 
          { lexeme=yytext(); return Pabrir;
          }
        case 97: break;
        case 20: 
          { lexeme=yytext(); return Real;
          }
        case 98: break;
        case 57: 
          { lexeme=yytext(); return Principal;
          }
        case 99: break;
        case 64: 
          { lexeme=yytext(); return Propiedades;
          }
        case 100: break;
        case 40: 
          { lexeme=yytext(); return Cadena;
          }
        case 101: break;
        case 25: 
          { lexeme=yytext(); return Menosmenos;
          }
        case 102: break;
        case 23: 
          { lexeme=yytext(); return Igualque;
          }
        case 103: break;
        case 58: 
          { lexeme=yytext(); return Destructor;
          }
        case 104: break;
        case 19: 
          { lexeme=yytext(); return Punto;
          }
        case 105: break;
        case 33: 
          { lexeme=yytext(); return ComentarioG;
          }
        case 106: break;
        case 8: 
          { lexeme=yytext(); return Resta;
          }
        case 107: break;
        case 45: 
          { lexeme=yytext(); return Entonces;
          }
        case 108: break;
        case 41: 
          { lexeme=yytext(); return Boleano;
          }
        case 109: break;
        case 50: 
          { lexeme=yytext(); return Tangente;
          }
        case 110: break;
        case 43: 
          { lexeme=yytext(); return Metodos;
          }
        case 111: break;
        case 30: 
          { lexeme=yytext(); return Leer;
          }
        case 112: break;
        case 61: 
          { lexeme=yytext(); return CadenaAReal;
          }
        case 113: break;
        case 44: 
          { lexeme=yytext(); return Privado;
          }
        case 114: break;
        case 15: 
          { lexeme=yytext(); return Menorque;
          }
        case 115: break;
        case 31: 
          { lexeme=yytext(); return Seno;
          }
        case 116: break;
        case 66: 
          { lexeme=yytext(); return CadenaABoleano;
          }
        case 117: break;
        case 2: 
          { lexeme=yytext(); return ERROR;
          }
        case 118: break;
        case 62: 
          { lexeme=yytext(); return Decrementar;
          }
        case 119: break;
        case 22: 
          { lexeme=yytext(); return Si;
          }
        case 120: break;
        case 55: 
          { lexeme=yytext(); return Verdadero;
          }
        case 121: break;
        case 9: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 122: break;
        case 12: 
          { lexeme=yytext(); return Exponencial;
          }
        case 123: break;
        case 38: 
          { lexeme=yytext(); return Entero;
          }
        case 124: break;
        case 28: 
          { lexeme=yytext(); return And;
          }
        case 125: break;
        case 17: 
          { lexeme=yytext(); return Puntocoma;
          }
        case 126: break;
        case 6: 
          { lexeme=yytext(); return Igual;
          }
        case 127: break;
        case 4: 
          { /*Ignore*/
          }
        case 128: break;
        case 65: 
          { lexeme=yytext(); return CadenaAEntero;
          }
        case 129: break;
        case 35: 
          { lexeme=yytext(); return Desde;
          }
        case 130: break;
        case 7: 
          { lexeme=yytext(); return Suma;
          }
        case 131: break;
        case 49: 
          { lexeme=yytext(); return Extiende;
          }
        case 132: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
