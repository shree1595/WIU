/*
 *  Course: CS500
 *  RandomArray.java - sample code for RandomArray
 *  Author: Zheng Li
 */

import java.util.Arrays;
public class RandomArray {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++)              // randomly generate an array within 100~ 1000
		{
			arr[i] = (int) (Math.random() * 901) + 100;
		}
		
		System.out.println("Before reversing: " + Arrays.toString(arr));
		reverseArray(arr);
		System.out.println("After reversing: " + Arrays.toString(arr));
		
	}
	
	public static void reverseArray(int[] arr)   // reverse all the elements in the array
	{
		int right = arr.length-1;
		int left = 0;
		
		while(left < right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}		
	}

}
