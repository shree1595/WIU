/*
 *  Source code for Checking Balanced Braces
 *  Solution: using stack, 
 */

import java.util.Stack;

public class StackDemo {
	
	public static boolean balanceTest(String str)
	{
		if(str.length() < 1) return true;    // empty string, return true;
		
		Stack<Character> st = new Stack<Character>();   // create a stack
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch == '{')                     // if left bracket, push to the stack
			{
				st.push(ch);
			}
			else
			{
				if (ch == '}')	             //if right bracket: 
				{
					if (!st.isEmpty())      // if left bracket exists, pop it up
					{
						st.pop();
					}
					else	               // if no left bracket, already unblanced
						return false;					
				}
			}	
		}		
		return st.empty() ? true:false;		
	}
	
	public static void main(String[] args)  // test program
	{
		String str = "{{a{bc{}}}cde}}";
		
		if(balanceTest(str) == true)
			System.out.println("Balanced bracket!");
		else
			System.out.println("Unbalanced bracket!");		
		
	}	
	
}
