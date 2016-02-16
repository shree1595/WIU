// Sample Code for Evaluator
// Assuem all the operands are integers: 0 - 9 and possible operators are +, -, *

import java.util.*;
public class Evaluator{

	 public static void main(String args[])
	    {
	        String expr = "4+3*2-1";
	        System.out.println(expr + " = " + evaluate(expr));
	    }
	    
	    private static int evaluate(String expr) {
	        Stack<Character> opStack = new Stack<Character>();
	        Stack<Integer> valueStack = new Stack<Integer>();
	        
	        char[] tokens = expr.toCharArray();
	        
	        for(Character c : tokens) {
	            if(c >= '0' && c <= '9') {
	                // digit
	                valueStack.push(Integer.parseInt(c.toString()));
	            } else {
	                // operator
	                if(!opStack.isEmpty() && hasprecedence(c, opStack.peek())) {
	                    valueStack.push(getValue(valueStack.pop(), valueStack.pop(), opStack.pop()));
	                }
	                
	                opStack.push(c);
	            }
	            
	            //System.out.println(valueStack);
	        }
	        
	        while(valueStack.size() >= 2 && !valueStack.isEmpty()) {
	            valueStack.push(getValue(valueStack.pop(), valueStack.pop(), opStack.pop()));
	            //System.out.println("ok: " + valueStack);
	        } 
	        
	        if(!valueStack.isEmpty())
	            return valueStack.pop();
	        return 0;
	    }
	    
	    // using hashmap will be a better choice
	    private static boolean hasprecedence(char op2, char op1) {
	        if(op1 == '*' && op2 == '+') {
	            return true;
	        } else if(op1 == '*' && op2 == '-') {
	            return true;
	        } else if(op1 == '+' && op2 == '-') {
	            return true;
	        } else if(op1 == '/' && op2 == '+') {
	            return true;
	        } else if(op1 == '/' && op2 == '-') {
	            return true;
	        } else {
	            return false;
	        }
	    }
	                   
	    private static int getValue(int val1, int val2, char op) {
	        int result = 0;
	        
	        switch(op) {
	            case '+':
	                result = val1 + val2;
	                break;
	            case '-':
	                result = val2 - val1;
	                break;
	            case '*':
	                result = val1 * val2;
	                break;
	        }
	        
	        return result;
	    }

}
