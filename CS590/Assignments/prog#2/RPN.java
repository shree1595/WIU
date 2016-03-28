/*
 *  Sample code for RPN evaluator 
 *  Course: CS 590
 */

import java.util.Stack;

public class RPN {
		
		public static void main(String[] args) // test program
		{
			String[] input = {"2", "1", "+", "3", "*"};
			System.out.println(evalRPN(input));			
		}		
		
		/*
		 *  Key point: use stack, happen to operator, pop two elements from stack and push the result in;
		 */
		
	    public static int evalRPN(String[] tokens) {
	    	
	        Stack<String> stk = new Stack<String>();
	        
	        for (int i = 0; i < tokens.length; i++)
	        {
	            String str = tokens[i];
	            if (str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*"))
	            {
	                int y = Integer.parseInt(stk.pop());
	                int x = Integer.parseInt(stk.pop());
	                int z = 0;
	                switch(str)
	                {
	                    case "+":
	                        z = x + y; 
	                        break;
	                    case "-":
	                        z = x - y;
	                        break;
	                    case "/":
	                        z = x / y;
	                        break;
	                    case "*":
	                        z = x * y;
	                        break;
	                    default:
	                        break;
	                }
	                stk.push(Integer.toString(z));
	            }
	            else
	            {
	                stk.push(tokens[i]);
	            }
	        }
	        return Integer.parseInt(stk.pop()); // should return integer
	    }
	}

