/*
 *  Course: CS590
 *  PascalTriangle.java - sample code to print PascalTriangle
 *  Author: Zheng Li
 */

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
				
		ArrayList<ArrayList<Integer>> result = getPascalTri(5);		
		
		for (int i = 0; i < result.size(); i++)
		{		
			System.out.println(result.get(i).toString());
		}
	}

	public static ArrayList<ArrayList<Integer>> getPascalTri(int nrows)  // function to generate the Pascal Triangle
	{
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		
		if (nrows < 1) return ret;
		
		for (int i = 1; i <= nrows; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if(i == 1)
			{
				temp.add(i);
				ret.add(temp);
				continue;
			}
			
			ArrayList<Integer> cur = ret.get(i-2);
			
			temp.add(cur.get(0));    
			
			for (int k = 1; k < cur.size(); k++)
			{
				temp.add(cur.get(k-1) + cur.get(k));
			}			
			temp.add(cur.get(cur.size()-1));
			
			ret.add(temp);
		}
		return ret;
	}	
}
