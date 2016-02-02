/*
 *  Course: CS590
 *  StarPattern.java - sample code to print out the star magic pattern
 *  Author: Zheng Li
 */

public class StarPattern {

	public static void main(String[] args) {
		
		int num_rows = 5;                      // number of rows
		
		for (int i = 1; i <= num_rows; i++)
		{
			for (int j = 1; j <= num_rows - i; j++)   // print the space at the beginning
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i - 1; k++)        // print the pending "*"
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
