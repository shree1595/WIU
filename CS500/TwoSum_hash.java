/*
 * Sample code for TwoSum using HashMap
 * Course: CS590
 * Author: Zheng Li
 */

import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2, 2, 5, 3, 1,1};
		System.out.println(Arrays.toString(findTarget(arr, 10)));
	}	
	
	public static int[] findTarget(int[] arr, int target)
	{
		int[] ret = {-1, -1};
		
		/* Generate value -> index mapping */
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		
		for (int i=0; i < arr.length; i++)
		{			
			if(hs.containsKey(target - arr[i]))
			{
				ret[0] = hs.get(target - arr[i]);
				ret[1] = i + 1;
				break;
			}
			/* put <value, index> to the hashmap */
			hs.put(arr[i], i+1);
		}		
		
		return ret;		
	}
}
