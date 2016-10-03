public class MyProgram2{
	
	/* Question 1: Calculate Maximum */
	public static int calMax(int[] input){
		
		int max = Integer.MIN_VALUE;       // store the maximum among all input[i] - i;
		int min = Integer.MAX_VALUE;       // store the minimum among all input[i] - i;
		
		for (int i = 0; i < input.length; i++)
		{
			int temp = input[i] - i;
			
			if (max < temp)       // update max;
				max = temp;
			
			if (min > temp)	      // update min;
				min = temp;
		}
		return max - min;	
	}
	
	/* Question 2: Check Armstrong Number */
	public static boolean chkArmNumber(int n)
	{
		int temp = n; 			// copy of n
		int sumOfCubes = 0;     // get sum of cubes of each digits
		
		while (temp != 0)
		{
			sumOfCubes += Math.pow(temp%10, 3);  
			temp = temp/10;
		}
		
		return sumOfCubes == n;			
		
	}
	
	/* Question 3: Reverse Sub Array*/
	public static int[] revSubArr(int[] temp, int k)
	{
			
		for (int i = 0; i * k < temp.length; i++)
		{
			int start = i * k; 											//starting point of the group
			int end = Math.min((i+1) * k - 1, temp.length - 1);         //ending point of the group
			
			while(start < end)                    						// reverse all the elements with index between start and end
			{
				int var = temp[start];
				temp[start] = temp[end];
				temp[end] = var;
				start ++;
				end --;
			}
			
		}					
		return temp;			
	}
	
	/* Question 4: Check Toeplitz Matrix  */
	public static boolean chkToepMat(int[][] arr)
	{
		for (int i = 0; i < arr[0].length; i++)
		{
			if (!checkDiag(arr, 0, i)) // check the diagonal starting from 	arr[0][i];		
				return false;
		}
		
		for (int i = 1; i < arr.length; i++)
		{
			if (!checkDiag(arr, i, 0)) // check the diagonal starting from 	arr[0][i];		
				return false;
		}
		
		return true;
		
	}
	
	public static boolean checkDiag(int[][] arr, int i, int j)  // check if the diagonal starting from (i, j) is constant
	{
		int value = arr[i][j];
		
		while(++i < arr.length && ++j < arr[0].length)
		{				
			if (arr[i][j] != value) return false;
		}
		
		return true;
		
	}
	
	
	/* find the 3rd largest number */
	public static int get3rdLargest(int[] arr)
	{
		int max = Integer.MIN_VALUE;                         // indicate maximum value
		int second_max = Integer.MIN_VALUE;                  // indicate second largest value
		int third_max = Integer.MIN_VALUE;                   // indicate third largest value
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] >= max)  
			{
				third_max = second_max;
				second_max = max;
				max = arr[i];
				continue;
			}
			
			if(arr[i] >= second_max)  
			{
				third_max = second_max;
				second_max = arr[i];				
				continue;
			}
			
			if(arr[i] >= third_max)  
			{
				third_max = arr[i];	
				continue;
			}			
		}
		return third_max;
	}	
}
