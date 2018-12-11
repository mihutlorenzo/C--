import java_cup.runtime.Symbol;
import java.io.*;

public class Program {

	static boolean do_debug_parse = false;
	public static void main(String[] args) {
		/* Start the parser */
		  try {
		      parser p = new parser(new Lexer(new FileReader(new File("E:\\Repositories\\Github\\CalculatorParser\\Tests\\Test1.txt"))));
		      Object result = p.parse().value;
		 

		    } catch (Exception e) {
		      /* do cleanup here -- possibly rethrow e */
		      } finally {
		        /* do close out here */
		    }
		  
	}

}
