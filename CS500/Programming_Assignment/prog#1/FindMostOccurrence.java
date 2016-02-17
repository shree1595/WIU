/*
 *  Course: CS500
 *  FindMostOccurrence.java - sample code for FindMostOccurrence in sorted array
 */

public class FindMostOccurrence {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,3,3};
		
		System.out.println(findMostOccurrence(arr));

	}

	public static int findMostOccurrence(int[] arr)
	{
		int most_occurence_value = arr[0];  // assume to be the first element 
		
		int max_count = 1;                  // assume only one occurrence
		
		int temp = 1;                       // indicate the occurrence of current number
		
		for (int i = 0; i < arr.length-1; i++)  
		{
			if(arr[i] == arr[i+1])         // increase the occurrence of current number
			{
				temp ++;
				
				if(max_count < temp)
				{
					most_occurence_value = arr[i];
					max_count = temp;
				}
				
				continue;
			}			
			temp = 1;	           //reset temp when checking different values		
		}
		
		return most_occurence_value;		
	}
	
}
