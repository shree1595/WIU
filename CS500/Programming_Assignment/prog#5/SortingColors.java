/*
 * Sorting Colors: integers 2, 3, and 4 to represent the color black, pink, and yellow respectively.
 */


import java.util.Arrays;

public class SortingColors {	
	
// partition by the pivot, all the elements greater then the pivot will be moved to the left most positions
	
	public static void sortByPivot(int[] input, int pivot)  
	{
		int left = 0;
		int right = input.length - 1;
		
		while(left < right)
		{
			if(input[left] > pivot) 
			{
				left ++;
				continue;
			}
			
			if(input[right] <= pivot)
			{
				right --;
				continue;
			}
			
			swap(input, left, right);
			left ++;
			right --;			
		}		
	}
	
// swap the left element and right element within the array input	
	public static void swap(int[] input, int left, int right)
	{
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;		
	}	

	public static void main(String[] args) {		
		int[] input = {2, 4, 2, 3, 3, 3, 4, 3, 2, 2, 4, 4, 2, 2};
		sortByPivot(input, 3);
		sortByPivot(input, 2);
		System.out.println(Arrays.toString(input));
		
		}
	}
