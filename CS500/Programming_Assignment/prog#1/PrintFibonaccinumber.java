/*
 *  Course: CS500
 *  PrintFibonaccinumber.java - sample code for PrintFibonaccinumber F(n) = F(n-1) + F(n-2)
 *  Author: Zheng Li
 */

import java.util.Arrays;

public class PrintFibonaccinumber {

	public static void main(String[] args) {
	
		int n = 5;
		int[] F = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			if (i < 2)
			{
				F[i] = 1;
				continue;
			}
			
			F[i] = F[i-1] + F[i-2];
		}
		
		System.out.println(Arrays.toString(F));
		
	}

}
