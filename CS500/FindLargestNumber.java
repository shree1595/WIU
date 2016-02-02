// sampe code to find the largest element in the array in CS 500 class

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int[] input ={1,2,3,4,10, 9};
		
		System.out.println("The largest value of input array is " + calLargest(input));	
	}
	
	public static int calLargest(int[] arr)
	{
		int largest = arr[0];   // variable to store the largest element
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}			
		}		
		return largest;		
	}
}
