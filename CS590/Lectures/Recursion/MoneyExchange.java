/*
 *  Course: CS590
 *  MoneyExchange.java - please return all the possible numbers to make the change of N cent with available coins
 *  Specificed in arr
 *  General idea: using recursion
 */

public class MoneyExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr ={5, 3, 2};
		System.out.println(numChanges(5,  arr, 0));
	}
		
	
	public static int numChanges(int change, int[] arr, int start) 
	{
		if(change == 0) return 1;
		
		if(change < 0 || start >= arr.length) return 0;		
		
		// total num = select coin arr[start] or not select it
	    return numChanges(change - arr[start], arr, start) + numChanges(change, arr, start+1);
		
	}
}
