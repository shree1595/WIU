/*
 *  Sample code for Pascal Array
 *  Course: CS 500
 */

import java.util.Arrays;

public class PascalArray {
	public static void main(String[] args) // test program
	{
		int n = 1;
		System.out.println(Arrays.deepToString(printPascalArray(n))); // print 2D array	
	}
	
	
	/*
	 * The following function is to generate a pascal triangle and store in a ragged array
	 */
	public static int[][] printPascalArray(int n)
	{
		int[][] pasArr = new int[n][];  //declare a 2D array
		
		for (int i = 0; i < n; i++)
		{
			pasArr[i] = new int[i+1];   //create ragged array to save space
		}
		
		pasArr[0][0] = 1; 
		
		if(n == 1)  return pasArr;		
		
		for (int i = 1; i < n; i++)
		{
			pasArr[i][0] =  pasArr[i-1][0];             //fill the first element of each row
			pasArr[i][i] =  pasArr[i-1][i-1];           // fill the last element of each row
			
			for (int j = 1; j <= i-1; j++)
			{				
				pasArr[i][j] = pasArr[i-1][j-1] + pasArr[i-1][j];   // pattern to generate pascal Array
			}
			
		}
		return pasArr;		
	}

}
