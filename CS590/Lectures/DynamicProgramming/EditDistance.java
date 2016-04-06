/*
 *  Course: CS590
 *  EditDistance.java - return the minimum number of operations to convert from str1 to str2 
 *  General idea: Dynamic Programming (details are discussed in class)
 */

public class EditDistance {

	public static void main(String[] args)
	{
		System.out.println(dpGetDistance("SEA", "ATE"));
	
	}

	public static int dpGetDistance(String str1, String str2)
	{
		int[][] dp =new int[str1.length()+1][str2.length()+1];
		
		dp[0][0] = 0;
		
		for (int i = 0; i <= str2.length(); i++)   // base case
		{
			dp[0][i] = i;
		}
		
		for (int i = 0; i <= str1.length(); i++)  // base case
		{
			dp[i][0] = i;
		}
		
		for (int i = 1; i <= str1.length(); i++)
		{
			for (int j = 1; j <= str2.length(); j++)
			{
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;  //minimum of insertion and deletion
				
				if(str1.charAt(i-1) == str2.charAt(j-1))          // minimum with replacement
				{
					dp[i][j] = Math.min(dp[i-1][j-1], dp[i][j]);
				}
				else
				{
					dp[i][j] = Math.min(dp[i-1][j-1] + 1, dp[i][j]);
				}
				
			}
		}
		
		return dp[str1.length()][str2.length()];	
		
	}	
}