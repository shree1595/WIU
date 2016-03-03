/*
 *  Sample code for TwoSum using nested for loop
 *  Course: CS 500
 */

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) { // test program
		
		int[] arr = {2, 11, 7, 15};
		
		System.out.println(Arrays.toString(findTwoSum(arr, 9)));

	}
	
	/*
	 *  The following function is to return two indexes of elements which sum equals target
	 */
	
	public static int[] findTwoSum(int[] arr, int target)
	{
		int[] ret = {-1, -1};
		
		for (int i = 0; i < arr.length - 1; i++) // nest for loop to find the indexes
		{
			for (int j = i + 1; j < arr.length; j++ )
			{
				if(arr[i] + arr[j] == target)     // if found, return the indexes
				{
					ret[0] = i + 1;
					ret[1] = j + 1;
					return ret;
				}
			}
		}		
		return ret;		
	}

}
