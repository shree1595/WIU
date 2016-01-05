/*
 * 	 Sample source code for Simplify path Question 
 */

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		
		String str = "/../";   
		
		String result = PathSimplifier(str);
				
		System.out.println(result);

	}
	
	public static String PathSimplifier(String str)
	{
		String[] input = str.split("/");		// split input string by "/" and store them in array input
		
		StringBuilder ret = new StringBuilder();   
		
		Stack<String> stk = new Stack<String>();
		
		for (int i = 0; i < input.length; i++)
		{			
			if(input[i].equals("."))        // if ".", just skip it
			{
				continue;
			}
			
			if(input[i].equals(".."))        // if "..", go one level up, if already on the top, just skip it
			{
				if (!stk.empty())
				{
					stk.pop();
				}
				continue;
			}
			
			if(input[i].length() > 0)        //if not empty string, push into the stack
				stk.push(input[i]);			
		}	
	
		if(stk.empty())                      // add "/" at the beginning of the simplified path
		{
			ret.append("/");
		}
		else
		{		
			while(!stk.empty())
			{				
				ret.append("/" + stk.pop());	
		
			}		
		}

		return ret.toString();	 
	}
}
