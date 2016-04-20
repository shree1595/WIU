/*
 *  Course: CS590
 *  BestCut.java - Determine the maximum value obtainable by cutting up the rod and selling the pieces
 *  Idea: using recursion
 *  
 */
public class BestCut {
	
	public static void main(String[] args)
	{
		int[] price ={1,5,8,9,10,17,17,20};
		System.out.println(getMaxVal(price, 7));
	}
	
	
	public static int getMaxVal(int[] price, int n)
	{
		if(n == 0)
			return price[0];
		
		int max = price[n];
		for (int i = 0; i < n; i++)
		{
			max = Math.max(max, getMaxVal(price, i) + getMaxVal(price, n-i-1));
		}		
		return max;		
	}
}
