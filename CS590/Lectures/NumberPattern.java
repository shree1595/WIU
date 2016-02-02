/*
 *  Course: CS500
 *  NumberPattern.java - sample code to print out the number magic pattern
 *  Author: Zheng Li
 */

public class NumberPattern {

	public static void main(String[] args) {
		
		int num_rows = 6;                         // number of rows
		
		for (int i = 1; i <= num_rows; i++)       // print the numbers in nested loop
		{ 
			for (int j = i; j >= 1; j--)   
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}

	}

}
