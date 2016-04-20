/*
 *  Course: CS590
 *  UniquePathFollowUp.java: Print all the paths from top left to bottom right
 *  Idea: using recursion + ArrayList to store temporary result
 *  
 */

import java.util.ArrayList;
import java.util.Stack;

public class UniquePathFollowUp {

	public static void main(String[] args) {		
		
		int m  = 3;
		int n = 3; 
		
		ArrayList<String> list = new ArrayList< String>(); // path will be stored in this list
		printAllPaths(m,n, list);
	
	}
	
	
	public static void printAllPaths(int m, int n, ArrayList<String> list) 
	{
		if( m < 1 || n < 1) return;		
		
		String temp = "(" + m +" , " + n + ")";		
		list.add(0, temp);		
		if(m == 1 && n == 1)
		{			
			printList(list);
		}		
		
		printAllPaths(m, n-1, list);		
		printAllPaths(m-1, n, list);		
		list.remove(0);		
	}	
	
	public static void printList(ArrayList<String> list)
	{
		for (int i = 0; i < list.size()-1; i++)
		{
			System.out.print(list.get(i) + " -> ");
		}
		
		if(list.size() >= 1)
		System.out.println(list.get(list.size()-1));	       
	}	
}
