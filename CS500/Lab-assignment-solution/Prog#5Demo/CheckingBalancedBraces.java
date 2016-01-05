/*
 * 	 Sample source code for Checking Balanced Braces
 */

import java.util.Stack;
public class CheckingBalancedBraces {

	public static void main(String[] args) {
		
	String str = "([)]{}";
	
	if (checkBalance(str))
		System.out.println("Balanced Braces !");
	else
		System.out.println("Unbalanced Balanced Braces !");
	
	}
	
	public static boolean checkBalance(String str)
	{
		if(str.length() < 1) return true;          			// empty str, return true
		
		Stack<Character> stk = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			switch(ch)
			{
			
			case ')':  											// right ')': if there is a paired '(', pop it up; otherwise, unbalanced !
				   
				  if (!stk.empty() && stk.peek() == '(')
				  {
					  stk.pop();
					  continue;
				  }				 
				  return false;																			
				  
			case '(':											// left '(': push to the stack
				stk.push(ch);
				break;
				
			case '}':											// right '}': if there is a paired '{', pop it up; otherwise, unbalanced !
				   
				  if (!stk.empty() && stk.peek() == '{')
				  {
					  stk.pop();
					  continue;
				  }				 
				  return false;
				  
			case '{':											// left '{': push to the stack
				stk.push(ch);
				break;
				
			case ']':											// right ']': if there is a paired '[', pop it up; otherwise, unbalanced !
				   
				  if (!stk.empty() && stk.peek() == '[')
				  {
					  stk.pop();
					  continue;
				  }				 
				  return false;
				  
			case '[':											// left ']': push to the stack
				stk.push(ch);
				break;
			
			}
		}		
		
		return stk.empty();	
	}

}
