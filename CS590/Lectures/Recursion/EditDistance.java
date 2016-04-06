/*
 *  Course: CS590
 *  EditDistance.java - return the minimum number of operations to convert from str1 to str2 
 *  General idea: Recursion (details are discussed in class)
 */

public class EditDistance {

	public static void main(String[] args)
	{
		System.out.println(getDistance("SEA", "ATE", 3, 3));
	
	}	
	
	
	public static int getDistance(String str1, String str2, int m,  int n)
	{
		if (m == 0) return n;
		if(n == 0)  return m;
		
		int del_num = getDistance(str1, str2, m-1, n) + 1;   // deletion
		int ins_num = getDistance(str1, str2, m, n-1) + 1;   // insertion
		
		int rep = getDistance(str1, str2, m-1, n-1) + (str1.charAt(m-1) == str2.charAt(n-1) ? 0:1);  // replacement
		
		return Math.min(Math.min(del_num, ins_num), rep);   //choose the minimum		
		
	}
	
}