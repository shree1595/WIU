/* 
 *  Sample code for Largest Rectangle Problem. The explanation is as follows: 
 * 
 * We traverse all bars from left to right, maintain a stack of bars. Every bar is pushed to stack once. 
 * A bar is popped from stack when a bar of smaller height is seen. When a bar is popped,
 *  we calculate the area with the popped bar as smallest bar. 
 *  How do we get left and right indexes of the popped bar – 
 *  the current index tells us the ‘right index’ and index of previous item in stack is the ‘left index’. 
 *  Following is the complete algorithm.

1) Create an empty stack.

2) Start from first bar, and do following for every bar ‘height[i]’ where ‘i’ varies from 0 to n-1.
……a) If stack is empty or height[i] is higher than the bar at top of stack, then push ‘i’ to stack.
……b) If this bar is smaller than the top of stack, then keep removing the top of stack while top of the stack is greater. 
Let the removed bar be height[top]. Calculate area of rectangle with height[top] as smallest bar. 
For height[top], the ‘left index’ is previous (previous to top) item in stack and ‘right index’ is ‘i’ (current index).

3) If the stack is not empty, then one by one remove all bars from stack and do step 2.b for every removed bar
 */
import java.util.*;

public class largestRectangleArea{
	
	public static void main(String[] args)
	{
		int[] arr = {2,1,5,6,2,3};
		System.out.println("fadf");
		System.out.println(getlargestRecArea(arr));
	}
	

    public static int getlargestRecArea(int[] height) {
        
        Stack<Integer> store = new Stack<Integer>();
         int value = 0;
        int max_area = 0;
        
        for (int i = 0; i <= height.length;)
        {
            if (i < height.length)
            {
                value = height[i];
            }
            else
            {
                value = 0;
            }
            
            if ( store.empty() || value >= height[store.peek()])
            {
                store.push(i);
                i++;
                continue;
            }
            
           int index = store.pop();
           int hd = height[index];
           
           max_area = Math.max(max_area, hd * (store.empty() ? i:i - store.peek() - 1));
        }
        return max_area;
    }
}