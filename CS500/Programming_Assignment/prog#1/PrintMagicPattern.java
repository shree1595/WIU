/*
 *  Course: CS500
 *  PrintMagicPattern.java - sample code for PrintMagicPattern
 *  Author: Zheng Li
 */
public class PrintMagicPattern {

	public static void main(String[] args) {
		
		int k = 4; // number of rows
		
		for (int i = 1; i <= k; i++)
		{
			for (int j = i; j >= 1; j--)  // print the number first
			{
				System.out.print(j + " ");
			}
			
			for (int j = i+1; j <= k; j++)  // print the "*" next
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
