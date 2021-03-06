/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;
import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>CMinusMinusLexer.flex</tt>
 */
public class CMinusMinusLexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\55\1\56\1\2\22\0\1\3\1\17\1\13"+
    "\1\5\2\0\1\20\1\57\1\47\1\50\1\6\1\16\1\26\1\15"+
    "\1\0\1\4\1\12\11\11\1\0\1\25\1\23\1\22\1\24\2\0"+
    "\32\7\1\51\1\14\1\52\3\7\1\41\1\32\1\46\1\43\1\37"+
    "\1\40\1\7\1\45\1\27\2\7\1\34\1\7\1\30\1\33\2\7"+
    "\1\35\1\42\1\31\1\36\1\10\1\44\3\7\1\53\1\21\1\54"+
    "\7\0\1\55\u1fa2\0\1\55\1\55\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\1\1\4\1\5\1\2"+
    "\2\6\1\7\1\10\1\11\1\12\2\1\1\13\1\14"+
    "\1\15\1\16\1\17\10\5\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\2\27\1\30\3\0\1\5\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\5"+
    "\1\41\10\5\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\0\1\5"+
    "\1\56\6\5\1\57\1\5\1\0\1\60\1\61\1\62"+
    "\1\5\1\63\2\5\1\64\1\5\1\65\1\66\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[99];
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
    "\0\0\0\60\0\140\0\140\0\220\0\300\0\360\0\140"+
    "\0\u0120\0\u0150\0\u0180\0\140\0\140\0\140\0\140\0\u01b0"+
    "\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\140\0\140\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\140"+
    "\0\140\0\u0120\0\u0120\0\140\0\140\0\u0450\0\140\0\u0480"+
    "\0\140\0\u04b0\0\360\0\u04e0\0\u0510\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\u0540\0\u0120\0\u0570"+
    "\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\u06f0\0\u0720\0\u0120\0\u0750\0\u0780"+
    "\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0120\0\u0870\0\u08a0\0\u0120"+
    "\0\u0120\0\u0120\0\u08d0\0\u0120\0\u0900\0\u0930\0\u0120\0\u0960"+
    "\0\u0120\0\u0120\0\u0120";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[99];
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
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\11\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\11\1\31\1\32\2\11\1\33\1\11\1\34\1\35"+
    "\3\11\1\36\1\11\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\0\1\4\1\3\1\46\1\47\1\50"+
    "\10\46\1\51\1\52\43\46\61\0\1\4\62\0\1\53"+
    "\1\0\1\54\51\0\1\53\1\4\1\5\55\53\7\0"+
    "\4\11\1\0\1\11\12\0\20\11\2\0\2\11\14\0"+
    "\4\11\1\0\1\11\12\0\4\11\1\55\13\11\2\0"+
    "\2\11\16\0\2\13\67\0\1\56\55\0\1\57\60\0"+
    "\1\60\60\0\1\61\1\62\57\0\1\63\56\0\1\64"+
    "\1\0\1\65\42\0\4\11\1\0\1\11\12\0\1\11"+
    "\1\66\7\11\1\67\6\11\2\0\2\11\14\0\4\11"+
    "\1\0\1\11\12\0\6\11\1\70\11\11\2\0\2\11"+
    "\14\0\4\11\1\0\1\11\12\0\4\11\1\71\13\11"+
    "\2\0\2\11\14\0\4\11\1\0\1\11\12\0\10\11"+
    "\1\72\7\11\2\0\2\11\14\0\4\11\1\0\1\11"+
    "\12\0\5\11\1\73\12\11\2\0\2\11\14\0\4\11"+
    "\1\0\1\11\12\0\12\11\1\74\5\11\2\0\2\11"+
    "\14\0\4\11\1\0\1\11\12\0\16\11\1\75\1\11"+
    "\2\0\2\11\14\0\4\11\1\0\1\11\12\0\1\76"+
    "\3\11\1\77\13\11\2\0\2\11\5\0\1\46\2\0"+
    "\10\46\2\0\43\46\1\0\1\47\56\0\1\100\2\0"+
    "\5\100\1\101\1\100\1\102\1\103\1\104\13\100\1\105"+
    "\1\106\1\107\2\100\1\110\2\100\1\111\1\112\13\100"+
    "\2\0\1\113\6\114\1\0\51\114\7\0\4\11\1\0"+
    "\1\11\12\0\1\115\17\11\2\0\2\11\14\0\4\11"+
    "\1\0\1\11\12\0\2\11\1\116\15\11\2\0\2\11"+
    "\14\0\4\11\1\0\1\11\12\0\7\11\1\117\10\11"+
    "\2\0\2\11\14\0\4\11\1\0\1\11\12\0\4\11"+
    "\1\120\13\11\2\0\2\11\14\0\4\11\1\0\1\11"+
    "\12\0\2\11\1\121\15\11\2\0\2\11\14\0\4\11"+
    "\1\0\1\11\12\0\13\11\1\122\4\11\2\0\2\11"+
    "\14\0\4\11\1\0\1\11\12\0\5\11\1\123\12\11"+
    "\2\0\2\11\14\0\4\11\1\0\1\11\12\0\1\124"+
    "\17\11\2\0\2\11\14\0\4\11\1\0\1\11\12\0"+
    "\1\11\1\125\16\11\2\0\2\11\14\0\4\11\1\0"+
    "\1\11\12\0\7\11\1\126\10\11\2\0\2\11\5\0"+
    "\6\114\1\127\51\114\7\0\4\11\1\0\1\11\12\0"+
    "\14\11\1\130\3\11\2\0\2\11\14\0\4\11\1\0"+
    "\1\11\12\0\10\11\1\131\7\11\2\0\2\11\14\0"+
    "\4\11\1\0\1\11\12\0\5\11\1\132\12\11\2\0"+
    "\2\11\14\0\4\11\1\0\1\11\12\0\7\11\1\133"+
    "\10\11\2\0\2\11\14\0\4\11\1\0\1\11\12\0"+
    "\10\11\1\134\7\11\2\0\2\11\14\0\4\11\1\0"+
    "\1\11\12\0\13\11\1\135\4\11\2\0\2\11\14\0"+
    "\4\11\1\0\1\11\12\0\5\11\1\136\12\11\2\0"+
    "\2\11\14\0\4\11\1\0\1\11\12\0\2\11\1\137"+
    "\15\11\2\0\2\11\5\0\4\114\1\4\1\114\1\127"+
    "\51\114\7\0\4\11\1\0\1\11\12\0\6\11\1\140"+
    "\11\11\2\0\2\11\14\0\4\11\1\0\1\11\12\0"+
    "\10\11\1\141\7\11\2\0\2\11\14\0\4\11\1\0"+
    "\1\11\12\0\10\11\1\142\7\11\2\0\2\11\14\0"+
    "\4\11\1\0\1\11\12\0\1\11\1\143\16\11\2\0"+
    "\2\11\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2448];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\3\1\1\11\3\1\4\11\6\1\2\11"+
    "\10\1\2\11\2\1\2\11\1\1\1\11\1\1\1\11"+
    "\3\0\1\1\10\11\12\1\14\11\1\0\12\1\1\0"+
    "\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[99];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	  StringBuffer string = new StringBuffer();
	  
	  private Symbol symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn+1);
	  }

	  private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn+1, value);
	  }
	  


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CMinusMinusLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(EOF);
            }  // fall though
            case 100: break;
            default:
          { return new java_cup.runtime.Symbol(sym.EOF); }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return symbol( error );
            } 
            // fall through
          case 56: break;
          case 2: 
            { 
            } 
            // fall through
          case 57: break;
          case 3: 
            { return symbol(O_DIV);
            } 
            // fall through
          case 58: break;
          case 4: 
            { return symbol(O_MULT);
            } 
            // fall through
          case 59: break;
          case 5: 
            { return symbol(IDENTIFIER, yytext());
            } 
            // fall through
          case 60: break;
          case 6: 
            { return symbol(INTEGER_LITERAL, new Integer(Integer.parseInt(yytext())));
            } 
            // fall through
          case 61: break;
          case 7: 
            { string.setLength(0); yybegin(STRING);
            } 
            // fall through
          case 62: break;
          case 8: 
            { return symbol(O_SUB);
            } 
            // fall through
          case 63: break;
          case 9: 
            { return symbol(O_ADD);
            } 
            // fall through
          case 64: break;
          case 10: 
            { return symbol(O_NOT);
            } 
            // fall through
          case 65: break;
          case 11: 
            { return symbol(O_EQL);
            } 
            // fall through
          case 66: break;
          case 12: 
            { return symbol(O_LT);
            } 
            // fall through
          case 67: break;
          case 13: 
            { return symbol(O_GT);
            } 
            // fall through
          case 68: break;
          case 14: 
            { return symbol(O_SEMICOLON);
            } 
            // fall through
          case 69: break;
          case 15: 
            { return symbol(O_COMA);
            } 
            // fall through
          case 70: break;
          case 16: 
            { return symbol(K_LPAREN);
            } 
            // fall through
          case 71: break;
          case 17: 
            { return symbol(K_RPAREN);
            } 
            // fall through
          case 72: break;
          case 18: 
            { return symbol(K_LSQBKT);
            } 
            // fall through
          case 73: break;
          case 19: 
            { return symbol(K_RSQBKT);
            } 
            // fall through
          case 74: break;
          case 20: 
            { return symbol(K_LBRKT);
            } 
            // fall through
          case 75: break;
          case 21: 
            { return symbol(K_RBRKT);
            } 
            // fall through
          case 76: break;
          case 22: 
            { string.append( yytext() );
            } 
            // fall through
          case 77: break;
          case 23: 
            { throw new RuntimeException("Unterminated string at end of line");
            } 
            // fall through
          case 78: break;
          case 24: 
            { yybegin(YYINITIAL);return symbol(STRING_LITERAL,string.toString());
            } 
            // fall through
          case 79: break;
          case 25: 
            { return symbol(O_NOTEQL);
            } 
            // fall through
          case 80: break;
          case 26: 
            { return symbol(O_AND);
            } 
            // fall through
          case 81: break;
          case 27: 
            { return symbol(O_OR);
            } 
            // fall through
          case 82: break;
          case 28: 
            { return symbol(O_DEQL);
            } 
            // fall through
          case 83: break;
          case 29: 
            { return symbol(O_LE);
            } 
            // fall through
          case 84: break;
          case 30: 
            { return symbol(O_LSHIFT);
            } 
            // fall through
          case 85: break;
          case 31: 
            { return symbol(O_GE);
            } 
            // fall through
          case 86: break;
          case 32: 
            { return symbol(O_RSHIFT);
            } 
            // fall through
          case 87: break;
          case 33: 
            { return symbol(K_IF);
            } 
            // fall through
          case 88: break;
          case 34: 
            { throw new RuntimeException("Illegal escape sequence \"" + yytext() + "\"");
            } 
            // fall through
          case 89: break;
          case 35: 
            { string.append( '\u000b' );
            } 
            // fall through
          case 90: break;
          case 36: 
            { string.append( '\0' );
            } 
            // fall through
          case 91: break;
          case 37: 
            { string.append( '\"' );
            } 
            // fall through
          case 92: break;
          case 38: 
            { string.append( '\\' );
            } 
            // fall through
          case 93: break;
          case 39: 
            { string.append( '\n' );
            } 
            // fall through
          case 94: break;
          case 40: 
            { string.append( '\t' );
            } 
            // fall through
          case 95: break;
          case 41: 
            { string.append( '\b' );
            } 
            // fall through
          case 96: break;
          case 42: 
            { string.append( '\r' );
            } 
            // fall through
          case 97: break;
          case 43: 
            { string.append( '\f' );
            } 
            // fall through
          case 98: break;
          case 44: 
            { string.append( '\u0007' );
            } 
            // fall through
          case 99: break;
          case 45: 
            { string.append( '\'' );
            } 
            // fall through
          case 100: break;
          case 46: 
            { return symbol(K_INT);
            } 
            // fall through
          case 101: break;
          case 47: 
            { return symbol (K_CIN);
            } 
            // fall through
          case 102: break;
          case 48: 
            { return symbol(K_VOID);
            } 
            // fall through
          case 103: break;
          case 49: 
            { return symbol(K_TRUE);
            } 
            // fall through
          case 104: break;
          case 50: 
            { return symbol(K_BOOL);
            } 
            // fall through
          case 105: break;
          case 51: 
            { return symbol(K_ELSE);
            } 
            // fall through
          case 106: break;
          case 52: 
            { return symbol (K_COUT);
            } 
            // fall through
          case 107: break;
          case 53: 
            { return symbol(K_FALSE);
            } 
            // fall through
          case 108: break;
          case 54: 
            { return symbol(K_WHILE);
            } 
            // fall through
          case 109: break;
          case 55: 
            { return symbol(K_RETURN);
            } 
            // fall through
          case 110: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
