/*
 * CS500: Sample solution for Programming Assignment 1
 */

public class MyProgram{
	
	/* Question 1: Coca Cola Game */
	public static void cocaColaGame(int n)
	{
		if (n % 63 == 0)
		{
			System.out.println("Coca    Cola!");
			return;
		}
		
		if (n % 7 == 0)
		{
			System.out.println("Coca");
			return;
		}
		
		if (n % 9 == 0)
		{
			System.out.println("Cola");
			return;
		}

		System.out.print(n);		
	}
	
	/*Question 2: Divide Integer */	
	public static int[] divInteger(int value)
	{
		int length = (int) Math.log10(value) + 1;  // get number of the digits
		
		int[] ret = new int[length];               // store the digits
		
		int i = 0;  // index
		
		while (value != 0)	{			        
			ret[i] = value % 10;                   // get the reminder
			value = value/10;
		}
		
		return ret;		
	}
		
	/* Question 3: add numbers */
	
	public static int addNumbers(int n)
	{
		int temp = n;                   // copy of input		 
		
		while( Math.abs(temp) >= 10 )
		{
			int sumOfDigits = 0;        // sum of all the digits
			while(temp != 0)
			{
				sumOfDigits += temp % 10;   //get the digit
				temp = temp /10;		    // get the quotient		
			}
			
			temp = sumOfDigits;             // sum of the digits
		}
		
		return temp;		
	}
	
	/* Question 4: Random numbers */	
	public static int[] getRandom(int n)
	{		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			arr[i] = -10 + (int)(Math.random() * (20 + 1));
		}
					
		return arr;
	}
	
	/* Question 5: Reverse Random Array */	
	public static int[] reverseArray(int[] arr)
	{
		int left = 0;                    // first index of array
		int right = arr.length-1;        // last index of array
		
		while(left < right)              // swap arr[left] with arr[right]
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left ++;
			right --;
		}		
		return arr;		
	}
	
	/* Question 6: matrix multiplication */
	public static long[][] matrixMul(int[][] mat1, int[][] mat2) 
	{
		long[][] ret = new long[mat1.length][mat2[0].length];  // C =  A * B
		
		
		for (int i = 0; i < ret.length; i++)
		{
			for (int j = 0; j < ret[0].length; j++)
				for (int k = 0; k< mat1[0].length; k++)
				{				
					ret[i][j] += mat1[i][k] * mat2[k][j];   // calculate value of C[i][j]						
				}
		}
		
		return ret;			
	}
		
}
