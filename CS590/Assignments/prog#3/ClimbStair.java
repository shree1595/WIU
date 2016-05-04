/*
 *  Course: CS590
 *  ClimbingStairs.java
 *  Idea: using recursion: F(n) = F(n-1) +F(n-2) + F(n-3) + F(n-4)
 *  
 */

public class ClimbStair {

	public static void main(String[] args) {
		
		int steps = 10;
		
		System.out.println(getSteps(steps));

	}
	
	public static long getSteps(int n)
	{
		if(n < 0) return 0;
		
		if(n == 0 ) return 1;
		
		if(n <= 2) return n;
		
		return getSteps(n-1) + getSteps(n-2) + getSteps(n-3) + getSteps(n-4);		
	}

}
