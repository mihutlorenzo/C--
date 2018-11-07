import CMinusMinus.*;
import java_cup.sym;
import java_cup.runtime.Symbol;

import java.io.*;
public class Main {
	public static void main( String[] argv ) throws IOException {
		Reader reader;
		try {
			reader = new FileReader(new File("E:\\Repositories\\Github\\ProiectareaTranslatoarelor\\C--\\CMinusMinusTranslator\\tests\\C--_Program.txt"));
			/*CMinus2Lexer lexer = new CMinus2Lexer(reader);
			lexer.yylex();*/
			CMinusMinusLexer lexer = new CMinusMinusLexer(reader);
			Symbol current;
			
			File logFile = new File("E:\\Repositories\\Github\\ProiectareaTranslatoarelor\\C--\\CMinusMinusTranslator\\tests\\Output.txt");
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
			
			
			do {
				String rowText ="";
				current= lexer.next_token();
				if(current.sym != sym.EOF)
				{	
					rowText += lexer.yytext(); 
					System.out.println("Symbol value: " + lexer.yytext());
					System.out.println("Symbol token: " + current.sym);
					if(current.sym == lexer.STRING_LITERAL)
					{
						rowText += (String) current.value;
					}
					
				}
				writer.write(rowText);
			}
			while(current.sym != lexer.EOF); 
			writer.close();
			reader.close();
			System.out.println("EOF");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}