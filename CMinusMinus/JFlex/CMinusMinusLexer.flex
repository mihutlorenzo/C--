import java_cup.runtime.*;
import java.io.*;

%%

%public
%class CMinusMinusLexer
%implements sym

%unicode

%line
%column


%cup 

%type Symbol
 
%{
	  StringBuffer string = new StringBuffer();
	  
	  private Symbol symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn+1);
	  }

	  private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn+1, value);
	  }
	  
%} 

LineEnd = \n|\r|\r\n
InputChar = [^\r\n]
WhiteSpace 	= {LineEnd} | [ \t\v\f]
 
LineComment = "//" {InputChar}* {LineEnd}
LineCommentHash = "#" {InputChar}* {LineEnd}
CStyleComment = "/*" [^*] ~"*/" 
Comment = {LineComment} | {LineCommentHash} | {CStyleComment}

Identifier = [a-zA-z_][a-zA-z0-9_]*

Zero = 0
DecInt = [1-9][0-9]*
 
Integer = {Zero} | {DecInt}
StringCharacter = [^\n\r\"\\]

%state STRING
 
%%
<YYINITIAL> {

{LineEnd}						{   }

{WhiteSpace}	 				{  }
 
{Comment}                      	{   }
   
   "-" { return symbol(O_SUB);}
   "+" { return symbol(O_ADD); }
   "*" { return symbol(O_MULT); }
   "/" { return symbol(O_DIV); }
 

  "!" { return symbol(O_NOT); }
   "&&" { return symbol(O_AND); }
   "||" { return symbol(O_OR); }
    "==" { return symbol(O_DEQL); }
	"!=" { return symbol(O_NOTEQL); }
   "<" { return symbol(O_LT); }
   ">" { return symbol(O_GT); }
   ">=" { return symbol(O_GE); }
   "=<" { return symbol(O_LE); }
   ">>" { return symbol(O_RSHIFT); }
   "<<" { return symbol(O_LSHIFT); }
  
   "=" { return symbol(O_EQL); }
   ";" { return symbol(O_SEMICOLON); }
   "," { return symbol(O_COMA); }
   
   "int"     { return symbol(K_INT); }
   "bool" { return symbol(K_BOOL); }
   "true"    { return symbol(K_TRUE); }
    "false"  { return symbol(K_FALSE); }
   "void"    { return symbol(K_VOID); }
   "if" { return symbol(K_IF); }
   "else"    { return symbol(K_ELSE); }
   "while"   { return symbol(K_WHILE); }
   "return"  { return symbol(K_RETURN); }
   "cin"	{ return symbol (K_CIN); }
   "cout"   { return symbol (K_COUT); }
 
   "(" { return symbol(K_LPAREN); }
   ")" { return symbol(K_RPAREN); }
   "[" { return symbol(K_LSQBKT); }
   "]" { return symbol(K_RSQBKT); }
   "{" { return symbol(K_LBRKT); }
   "}" { return symbol(K_RBRKT); }

   \"			{  string.setLength(0); yybegin(STRING); } 
   
   {Identifier} { return symbol(IDENTIFIER, yytext());}
   {Integer} 	{ return symbol(INTEGER_LITERAL, new Integer(Integer.parseInt(yytext()))); }
 <<EOF>>     	{ return symbol(EOF); }  
	.			{ return symbol( error ); }	
 }
 
 <STRING> {
	\" 								{ yybegin(YYINITIAL);return symbol(STRING_LITERAL,string.toString());}
	{StringCharacter}+             	{ string.append( yytext() ); }
	
  "\\'"                          	{ string.append( '\'' ); }
  "\\\""                         	{ string.append( '\"' ); }
  "\\\\"                         	{ string.append( '\\' ); }
  "\\0"                          	{ string.append( '\0' ); }
  "\\a"                          	{ string.append( '\u0007' ); } /* Alert */
  "\\b"                          	{ string.append( '\b' ); }
  "\\f"                          	{ string.append( '\f' ); }
  "\\n"                          	{ string.append( '\n' ); }
  "\\r"                          	{ string.append( '\r' ); }
  "\\t"                          	{ string.append( '\t' ); }
  "\\v"                          	{ string.append( '\u000b' ); } /* Vertical tab */
	\\.                            	{ throw new RuntimeException("Illegal escape sequence \"" + yytext() + "\""); } 
  {LineEnd}               			{ throw new RuntimeException("Unterminated string at end of line"); }
 }
 






