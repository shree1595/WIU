/*
 *  Sample code for arithmetic calculator *   
 */
public class Calculator {		

		public static void main(String[] args) {			
		        double    operand1 = Double.parseDouble(args[0]); //parseInt(string s) will return int
		        String operator = args[1];
		        double    operand2 = Double.parseDouble(args[2]);
		        
		        switch (operator)
		        {
		        case "+":
		        	 System.out.println( operand1 + operand2 );
		        	 break;
		        case "-":
		        	 System.out.println( operand1 - operand2 );
		        	 break;
		        case "/":
		        	 System.out.println( operand1 / operand2 );
		        	 break;
		        case "'*'":
		        	 System.out.println( operand1 * operand2 );
		        	 break;
		        }		        
		   
		    } // end main
	}
