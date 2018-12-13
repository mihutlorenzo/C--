import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;

import java_cup.Lexer;
import java_cup.runtime.Symbol;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException  {
		try {
			parser p = new parser(new CMinusMinusLexer(new FileReader(new File("E:\\Repositories\\Github\\ProiectareaTranslatoarelor\\CMinusMinus\\CMinusMinus_JavaProject\\test1.txt"))));
			// Object result = p.parse().value;
			p.debug_parse();
			//CMinusMinusLexer lexer = new CMinusMinusLexer(new FileReader(new File("E:\\Repositories\\Github\\ProiectareaTranslatoarelor\\CMinusMinus\\CMinusMinus_JavaProject\\test1.txt")));
			//Symbol current;
			//do {
				//current = lexer.next_token();
				//System.out.println("Symbol value: " + current.value);
				//System.out.println("Symbol token: " + current.sym);
			//}while(current.sym != lexer.EOF); 
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			/* do close out here */
		}
	}

	
}
