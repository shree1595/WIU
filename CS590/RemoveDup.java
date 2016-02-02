/*
 *  Course: CS590
 *  NumberPattern.java - sample code for removing duplicated elements
 *  Author: Zheng Li
 */

import java.util.Arrays;

public class RemoveDup {

	public static void main(String[] args)
	{
		int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3,3, 4};
		
		int new_leng = rmThreeDup(arr);
		
		System.out.println("After removing the duplicates, the array is: " + Arrays.toString(arr));
		System.out.println("The new length is: " + new_leng);
		
	}
	
	public static int rmOneDup(int[] input)  // no duplicated element
	{		
		 int leng = input.length;
	     
	     int index = 1;    // the ending index of non-duplicated elements
	     
	     for (int i = 1; i < leng; i++){
	         if (input[index-1] != input[i])
	         {
	           input[index++] = input[i];   //if not duplicated, copy the value to index+1
	         }
	      }	     
	      return index;		
	}	
	
	public static int rmTwoDup(int[] input)  // Allow two duplicated elements
	{
		int leng = input.length;
		
		if(leng < 2) return leng;
		
		int index = 2;
		
		for (int i = 2; i < leng; i++)
		{
			if(input[index-2] != input[i])
			{
				input[index++] = input[i];
			}
		}		
		
		return index;			
	}
	
	
	public static int rmThreeDup(int[] input) // Allow three duplicated elements
	{
		int leng = input.length;
		
		if(leng < 3) return leng;
		
		int index = 3;
		
		for (int i = 3; i < leng; i++)
		{
			if(input[index-3] != input[i])
			{
				input[index++] = input[i];
			}
		}
		
		return index;			
	}
	
}
