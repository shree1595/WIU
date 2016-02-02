/*
 *  Course: CS590
 *  TwoSum.java - sample code for maximum profit II
 *  Author: Zheng Li
 */

public class MaximumProfit {

	public static void main(String[] args) { // test program
		
		int[] prices = {1, 4, 0, 5};
		System.out.println("The maximum profit should be " + calMaxProfit(prices));
		
	}
	
	public static int calMaxProfit(int[] prices)
	{
		int profit = 0;  // total profit
		for (int i = 1; i < prices.length; i++)
		{
			int gain = Math.max(0, prices[i] - prices[i-1]); 
			profit += gain;   // add all the transactions with positive profit
		}
		return profit;
		
	}

}
