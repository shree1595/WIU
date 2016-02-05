/*
 *  Course: CS590
 *  GetLargers.java - sample code to return all the elements in a given array grater than a target value
 *  Author: Zheng Li
 */

import java.util.*;

public class GetLargers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-4, -5, 1 , 3, 4, 10, -2};	
		
		ArrayList<Integer> result = findLargers(input, 0);
		
		System.out.println(result.toString());
	}
	
	public static ArrayList<Integer> findLargers(int[] input, int target) // Use ArrayList to store the elements greater than target
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();   // ArrayList will grow dynamically
		
		for (int i = 0; i < input.length; i ++)
		{
			if(input[i] > 0)
			{
				ret.add(input[i]);
			}			
		}
		return ret;
	}
}
