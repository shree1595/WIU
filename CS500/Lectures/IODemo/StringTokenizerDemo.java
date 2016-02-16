/*
 *  Simple example to demonstrate StringTokenizer
 */
import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokenizerDemo {

	public static void main(String[] args) {		
	
		     System.out.println("Please type the message: ");
		     Scanner s=new Scanner(System.in);  
		
		     String msg = s.nextLine(); // read msg from terminal
		     
		     String delimiters = " .?,"; // set the delimiters
		     StringTokenizer words = new StringTokenizer(msg, delimiters); 	// use delimiters to split msg
		     while( words.hasMoreElements() ) {
			      String word = words.nextToken();
			      System.out.println( word );
		      } // end while
		     s.close();


	}

}
