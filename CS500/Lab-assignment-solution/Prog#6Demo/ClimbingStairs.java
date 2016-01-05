/*
 *   It takes n steps to reach to the top. Each time you can either climb 1 or 2 or 3 steps. Calculate how many distinct paths to the top
 */

public class ClimbingStairs {

	public static void main(String[] args) {
		
		int numSteps = 3;		
		System.out.println("The total number of distinct paths towards the top is: " + calSteps(numSteps));
		
	}
	
	
	public static long calSteps(int n)         // recursive function
	{
		if(n == 0) return 1;
		
		if (n <= 2)    return n;
		
		return calSteps(n-1) + calSteps(n-2) + calSteps(n-3);
	}

}
