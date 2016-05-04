/*
 *  Course: CS590
 *  ClimbingStairs.java
 *  Idea: using Dynamic Programming
 *  
 */

public class ClimbStairs {

	public static void main(String[] args) {
		
		int steps = 6;
		
		System.out.println(DPgetSteps(steps));

	}
	
	public static long DPgetSteps(int n)
	{
		int m = Math.max(5,  n+1);
		
		long[] step = new long[m];
		
		step[0] = 1;
		step[1] = 1;
		step[2] = 2;
		step[3] = 4;
		
		
		for (int k = 4; k <= n; k++)
		{
			step[k] = step[k-1] + step[k-2] + step[k-3] + step[k-4];
		}
		
		return step[n];	
	}	

}
