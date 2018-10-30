package CMinus2Lexer

import java_cup.runtime.Symbol;
import java.io.*;
%%

%unicode
%public
%class CMinus2Lexer
%cup
%implements sym 

%line
%column
 
%{
private Symbol token(int sym) {
    return new Symbol(sym, yyline+1, yycolumn+1);
}
  
private Symbol token(int sym, Object val) {
   return new Symbol(sym, yyline+1, yycolumn+1, val);
}

private void error(String message) {
   System.out.println("Error at line "+ (yyline+1) + ", column " + (yycolumn+ 1)+ " : "+message);
}
%} 

LineEnd = [\r\n]|\r\n
InputChar = [^\r\n]
WhiteSpace = {LineEnd} | [ \t\f]
 
LineComment = "//" {InputChar}* {LineEnd}
LineCommentHash = "#" {InputChar}* {LineEnd}
CStyleComment = "/*" ~"*/" 
Comment = {LineComment} | {LineCommentHash} | {CStyleComment}

String = "\""{WhiteSpace}~"\""
 
Identifier = [a-zA-z_][a-zA-z0-9_]*

Zero = 0
DecInt = [1-9][0-9]*
 
Integer = {Zero} | {DecInt}
 
%%
<YYINITIAL> {
   
   "." { return token(DOT); } 
 
   /* Arithmetic Operations */
   "-" { return token(SUB);}
   "+" { return token(ADD); }
   "*" { return token(MULT); }
   "/" { return token(DIV); }
 

  "!" { return token(BANG); }
   "&&" { return token(AND); }
   "||" { return token(OR); }
    "==" { return token(DEQL); }
	"!=" { return token(NOTEQL); }
   "<" { return token(LT); }
   ">" { return token(GT); }
   ">=" { return token(GE); }
   "=<" { return token(LE); }
   ">>" { return token(RSHIFT); }
   "<<" { return token(LSHIFT); }
  
   "=" { return token(EQL); }
   ";" { return token(SEMI); }
   "," { return token(COMMA); }
   
   /* Keywords */
   "int"     { return token(INT); }
   "bool" { return token(BOOL); }
   "true"    { return token(TRUE); }
    "false"  { return token(FALSE); }
   "void"    { return token(VOID); }
   "if" { return token(IF); }
   "else"    { return token(ELSE); }
   "while"   { return token(WHILE); }
   "return"  { return token(RETURN); }
   "cin"	{ return token (CIN); }
   "cout"   { return token (COUT); }
 
   "(" { return token(LPAREN); }
   ")" { return token(RPAREN); }
   "[" { return token(LSQBKT); }
   "]" { return token(RSQBKT); }
   "{" { return token(LBRKT); }
   "}" { return token(RBRKT); }
   
   {Comment} {}
   {String}  { System.out.println("STRING"); }
   {Identifier} { return token(ID, yytext());}
   {Integer} { return token(NUMERIC_CONSTANT, new Integer(Integer.parseInt(yytext()))); }
   {WhiteSpace} { /* Ignore */ }
 
 }
 <<EOF>> { return token(EOF); }
. { System.out.println("ERROR");error(yytext());}

