/*
* Example of Scanner class with delimiter. The \s represents whitespace.
*/
import java.util.Scanner;

public class ScannerWithDelimiter {

	public static void main(String[] args) {		
		
		     System.out.println("Please type the message: ");     
		  
		     Scanner s = new Scanner(System.in).useDelimiter("\\s|,"); // set delimiter as space or ,  \s indicates space 
		     System.out.println(s.nextInt());  
		     System.out.println(s.next());  
		     System.out.println(s.nextInt());  
		     System.out.println(s.next());  
		     s.close();   
	}
}
