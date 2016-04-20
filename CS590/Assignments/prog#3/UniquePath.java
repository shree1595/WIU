/*
 *  Course: CS590
 *  UniquePath.java: return the total number of different paths from top left to bottom right
 *  Idea: using recursion
 *  
 */

public class UniquePath{

	public static void main(String[] args) {		
		
		int m  = 3;
		int n = 3; 
		
		System.out.println(getUniquePath(m,n));
	}
	
	
	public static int getUniquePath(int m, int n) 
	{
		
		if(m == 1 || n == 1)                                // base case
		{			
			return 1;
		}		
		
		return 	getUniquePath(m, n-1) + getUniquePath(m-1, n);  // recursion formula
	}	
}
