/* 
 *   Sample code for longest Valid Parentheses problem.
 * 
 * 1) Create an empty stack. 

   2) Initialize result as 0, and use last to indicate the valid starting pint, initialize it to -1 first.

   3) If the character is '(' i.e. str[i] == '('), push index 
      'i' to the stack. 
   
       Else (if the character is ')')
   a) Pop an item from stack (Most of the time an opening bracket)
   b) If stack is not empty, then find length of current valid
      substring by taking difference between current index and
      top of the stack. If current length is more than result,
      then update the result.
   c) If stack is empty, update last = i.

    4) Return result.
 */

import java.util.*;

public class longestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getlongestValidParentheses(String s) {
		Stack<Integer> stk = new Stack<Integer>();
		int max_leng = 0;   //max valid length
		int last = -1;      // index of the valid starting point
    
    
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '(')
			{
				stk.push(i);
			}
			else
			{
				if (s.charAt(i) == ')')
				{
					if (!stk.empty())
					{
						stk.pop();
						if (stk.empty())
						{
							max_leng = Math.max(max_leng, i - last);
						}
						else
						{
							max_leng = Math.max(max_leng, i - stk.peek());
						}
                    
					}
					else
					{
						last = i;                  
					}
				}            
			}
		}  
		return max_leng;
	}
}
