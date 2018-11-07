import CMinus2Lexer.*;
import java.io.*;
public class Main {
	public static void main( String[] argv ) {
		try{
		System.out.println("Enter dirpath:"); 
        String dirpath=br.readLine(); 
        System.out.println("Enter the dirname"); 
        String dname=br.readLine(); 
		FileInputStream fileInputStream = new FileInputStream(new File( dirName, dname ) );
		CMinus2Lexer lexer = new CMinus2Lexer( fileInputStream );
		lexer.yylex();
		}
		catch ( Exception exception ) {
			System.err.println( "Exception in Main " + exception.toString() );
			exception.printStackTrace();
		}
	}
}