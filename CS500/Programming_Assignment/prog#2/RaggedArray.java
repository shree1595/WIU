/*
 *  Sample code to test if the given array is ragged
 *  Course: CS 500
 */

public class RaggedArray {

	public static void main(String[] args) // test program
	{
		int[][] arr1 = {{1},{1,2}};
		System.out.println(checkRaggedArray(arr1));
		
		int[][] arr2 = {{1,2},{1,2}};
		System.out.println(checkRaggedArray(arr2));
	}
	

	
	public static boolean checkRaggedArray(int[][] arr)
	{
		if(arr.length <= 1) return false;    // if less than 1 rows, not ragged
		 
		for (int i = 1; i < arr.length; i++)
		{
			if(arr[i].length != arr[i-1].length)  // if # of elements in rows are not equal, ragged array
			{
				return true;
			}			
		}		
		return false;		
	}
	
}
