/*
 *  Course: CS590
 *  TwoSum.java - sample code for TwoSum problem, two approaches provided: naive-solution and optimal-solution;
 *  Author: Zheng Li
 */

import java.util.*;
public class TwoSum {
	
	public static void main(String[] args)
	{		
		int[] input = {2, 7, 11, 15};
		int[] indexes = {-1, -1};
		
		optimalSolution(input, indexes, 29);
		
		System.out.println(Arrays.toString(indexes));
	}
	
	
	
	/*
	 *  Native solution, will search all the pairs, time complexity is O(N^2)
	 */
	public static void naiveSolution(int[] input, int[] indexes, int target)
	{
		
		for (int i = 0; i < input.length; i++)
		{
			for (int j = i+1; j < input.length; j++)
			{
				if (input[i] + input[j] == target)
				{
					indexes[0] = i;
					indexes[1] = j;
					return;
				}
			}
		}		
	}
	
	/*
	 * Optimal Solution, time complexity O(N)
	 */
	
	public static void optimalSolution(int[] input, int[] indexes, int target)
	{
		int left= 0;
		int right = input.length-1;
		
		while(left < right)
		{
			if(input[left] + input[right] == target) // hit the target, return;
			{
				indexes[0] = left;
				indexes[1] = right;
				return;
			}
			
			if(input[left] + input[right] > target) // greater than target, decrease right index
			{
				right --;
				continue;
			}
			
			if(input[left] + input[right] < target) // smaller than target, increase left index
			{
				left ++;
				continue;
			}			
		}
	}
}



