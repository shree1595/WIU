/*
 *   Sample code for search array: Given a sorted integer array (may have duplicated items) in
 *	ascending order, write a function search (int target) so that if the target is in the array, it returns the
 *	smallest index i for which a[i] equals to target; otherwise, return -1. 
 */

public class SearchingArray {

	public static int searchTarget(int[]  input, int target)
	{
		int ret = -1;
		
		int start = 0;   // starting point	
		int end = input.length-1;   // last element of the array
		
		while(start <= end)         // binary search until start > end
		{
			int mid = (start + end)/2;			
			 
			if(input[mid] >= target)   // if equal or greater, throw the right part
			{
				
				if(input[mid] == target)
				{
					ret = mid;
				}
				
				end = mid - 1;				
				continue;
			}
			
			if(input[mid] < target)         // if smaller, throw the left part
			{
				start = mid + 1;
				continue;
			}
		}
		
		return ret;		
	}

	
	public static void main(String[] args) {   // test program
	
		int[] input = {1, 2, 2, 3, 3, 4};
		
		System.out.println(searchTarget(input, 1));
	}
}
