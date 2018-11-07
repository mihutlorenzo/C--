/* User code section */
package CMinusMinus;

/* import packages section */

import java_cup.runtime.*;
import java.io.*;

%%

/* Options and declarations section */ 

/* Makes the generated class public with the name "CMinuMinusLexer" and also the generated file's name will be "CMinuMinusLexer" */  

%public
%class CMinusMinusLexer

/* Make the generated class to implements the "CMinusMinusToken" interface where are declared the symbol's  */
%implements CMinusMinusToken

/* The %unicode directive makes the lexical analyser use full UNICODE characters */
%unicode

/* Turns line and column counting on */
%line
%column


/* Enable the CUP compatibility mode to interface with a CUP generated class */
%cup 

/* Cause the scanning method to be declared as returning values of the specified type */
%type Symbol
 
%{
	  StringBuffer string = new StringBuffer();
	  
	  private Symbol token(int type) {
		return new Symbol(type, yyline+1, yycolumn+1);
	  }

	  private Symbol token(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn+1, value);
	  }
	  
%} 

LineEnd = \n|\r|\r\n 
InputChar = [^\r\n]
// WhiteSpace = {LineEnd} | [ \t\f]
WhiteSpace = [ \t\f]*
 
LineComment = "//" {InputChar}* {LineEnd}
LineCommentHash = "#" {InputChar}* {LineEnd}
CStyleComment = "/*" [^*] ~"*/" 
Comment = {LineComment} | {LineCommentHash} | {CStyleComment}

//String = "\""{WhiteSpace}~"\""
 
Identifier = [a-zA-z_][a-zA-z0-9_]*

Zero = 0
DecInt = [1-9][0-9]*
 
Integer = {Zero} | {DecInt}

%state STRING
 
%%
<YYINITIAL> {
   /* LineTerminator */
  {LineEnd}								{ return token(ENDLINE, new Character(yytext().charAt(0))); }
  
  /* Whitespace */
  {WhiteSpace}	 									{ return token(WHITESPACE, new Character(yytext().charAt(0))); }
  
   /* Comments */
  {Comment}                      	{ /* ignore */ }
   
   /* Operators */
   "." { return token(O_DOT); } 
 
   /* Arithmetic Operations */
   "-" { return token(O_SUB);}
   "+" { return token(O_ADD); }
   "*" { return token(O_MULT); }
   "/" { return token(O_DIV); }
 

  "!" { return token(O_BANG); }
   "&&" { return token(O_AND); }
   "||" { return token(O_OR); }
    "==" { return token(O_DEQL); }
	"!=" { return token(O_NOTEQL); }
   "<" { return token(O_LT); }
   ">" { return token(O_GT); }
   ">=" { return token(O_GE); }
   "=<" { return token(O_LE); }
   ">>" { return token(O_RSHIFT); }
   "<<" { return token(O_LSHIFT); }
  
   "=" { return token(O_EQL); }
   ";" { return token(O_SEMICOLON); }
   "," { return token(O_COMMA); }
   
   /* Keywords */
   "int"     { return token(K_INT); }
   "bool" { return token(K_BOOL); }
   "true"    { return token(K_TRUE); }
    "false"  { return token(K_FALSE); }
   "void"    { return token(K_VOID); }
   "if" { return token(K_IF); }
   "else"    { return token(K_ELSE); }
   "while"   { return token(K_WHILE); }
   "return"  { return token(K_RETURN); }
   "cin"	{ return token (K_CIN); }
   "cout"   { return token (K_COUT); }
 
   "(" { return token(K_LPAREN); }
   ")" { return token(K_RPAREN); }
   "[" { return token(K_LSQBKT); }
   "]" { return token(K_RSQBKT); }
   "{" { return token(K_LBRKT); }
   "}" { return token(K_RBRKT); }

   \"	{  string.setLength(0); yybegin(STRING); }
   {Identifier} { return token(IDENTIFIER, yytext());}
   {Integer} { return token(INTEGER_LITERAL, new Integer(Integer.parseInt(yytext()))); }
   
 }
 
 <STRING> {
	\" 			{ yybegin(YYINITIAL);
					 return token(STRING_LITERAL,string.toString());
				}
	[^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }

 }
 . 				{ return token(OTHER); }
 <<EOF>>     { return token(EOF); }




