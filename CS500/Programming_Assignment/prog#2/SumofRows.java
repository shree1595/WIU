/*
 *  Sample code to print the sum of each row in the array
 *  Course: CS 500
 */
public class SumofRows {

	public static void main(String[] args) {  // test program
		int[][] arr = {{1,2},{3,5}};
		printSumRows(arr);

	}
	
	public static void printSumRows(int[][]arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			long sum = 0;
			for (int k = 0; k < arr[i].length; k++)  //get the sum of each row
			{
				sum += arr[i][k];				
			}
			System.out.println("row " + i + " -> " + sum);  // print the sum  in required format
		}
		
	}

}
