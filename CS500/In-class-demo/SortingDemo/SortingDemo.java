/*
 * Given an array nums, write a function to move all 0's to the end of it.
 * maintaining the relative order of the non-zero elements is NOT required.
 *	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
import java.util.Arrays;

public class SortingDemo {
	
// 	moving all the zeros to the right most using the quicksort partition algorithm 
// time complexity O(n)
	public static void movingZeros(int[] input)  
	{
		int left = 0;
		int right = input.length-1;
		
		while(left < right)
		{
			while(left < right && input[left] != 0)
				left ++;
			
			while(left < right && input[right] == 0)
				right --;
			
			swap(input, left, right);			
		}		
	}

	// swap the element inyput[left] with input[right]
	public static void swap(int[] input, int left, int right)
	{
		int temp = input[right];
		input[right] = input[left];
		input[left] = temp;
	}

	// test program
	public static void main(String[] args)
	{
		int[] input = {0, 1, 4, 0, 6, 8, 0, 0, 0, 9, 10};
		
		System.out.println(Arrays.toString(input));
		
		movingZeros(input);
		
		System.out.println(Arrays.toString(input));		
	}	
}
