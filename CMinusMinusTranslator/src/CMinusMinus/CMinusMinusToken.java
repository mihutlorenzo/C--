package CMinusMinus;

public interface CMinusMinusToken {
	  /* terminals */
	  public static final int ENDLINE = 0;
	  public static final int WHITESPACE = 1;
	  public static final int O_DOT = 2;
	  public static final int O_SUB = 3;
	  public static final int O_ADD = 4;
	  public static final int O_MULT = 5;
	  public static final int O_DIV = 6;
	  public static final int O_BANG = 7;
	  public static final int O_AND = 8;
	  public static final int O_OR = 9;
	  public static final int O_DEQL = 10;
	  public static final int O_NOTEQL = 11;
	  public static final int O_LT = 12;
	  public static final int O_GT = 13;
	  public static final int O_GE = 14;
	  public static final int O_LE = 15;
	  public static final int O_RSHIFT = 16;
	  public static final int O_LSHIFT = 17;
	  public static final int O_EQL = 18;
	  public static final int O_SEMICOLON = 19;
	  public static final int O_COMMA = 20;
	  public static final int K_INT = 21;
	  public static final int K_BOOL = 22;
	  public static final int K_TRUE = 23;
	  public static final int K_FALSE = 24;
	  public static final int K_VOID = 25;
	  public static final int K_IF = 26;
	  public static final int K_ELSE = 27;
	  public static final int K_WHILE = 28;
	  public static final int K_RETURN = 29;
	  public static final int K_CIN = 30;
	  public static final int K_COUT = 31;
	  public static final int K_LPAREN = 32;
	  public static final int K_RPAREN = 33;
	  public static final int K_LSQBKT = 34;
	  public static final int K_RSQBKT = 35;
	  public static final int K_LBRKT = 36;
	  public static final int K_RBRKT = 37;
	  public static final int STRING_LITERAL = 38;
	  public static final int IDENTIFIER = 39;
	  public static final int INTEGER_LITERAL = 40;
	  public static final int EOF = 41;
	  public static final int OTHER = 42;
	}