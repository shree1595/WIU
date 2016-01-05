/*
 *  Sample code for "+" and "-" arithmetic calculator *   
 */
public class Calculator {

	public static void main(String[] args) {			
	        double    operand1 = Double.parseDouble(args[0]); //parseInt(string s) will return int
	        char operator = args[1].charAt(0);
	        double    operand2 = Double.parseDouble(args[2]);
	        
	        if ( operator == '+')  {
	           System.out.println( operand1 + operand2 );
	        } else if ( operator == '+')  {
	           System.out.println( operand1 - operand2 );
	        } else {
	           System.out.println("Invalid operator: " + operator);
	 	     } // end if
	    } // end main
}
