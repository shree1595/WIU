/*
 *  CS 500: Demo for Pascal Triangle using ArrayList
 */
import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		
		display(generatePasTri(6));
		
	}
	
	public static ArrayList<ArrayList<Integer>> generatePasTri(int n)
	{
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();		
		
		for (int i = 0; i < n; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();     //item of ArrayList<Integer>
			
			temp.add(0, 1);	                                        // the first 1
			
						
			for (int index = 1; index < i-1; index ++)              // the elements between the first and last 1
			{
				int value = ret.get(i-1).get(index-1) + ret.get(i-1).get(index);
				temp.add(index, value);
			}
			
			if ( i > 0)                                             // the last 1
				temp.add(i-1, 1);
			
			ret.add(temp);
			
		}
		
		return ret;
		
	}
	/*
	 *  print out ArrayList of ArrayList
	 */
	public static void display(ArrayList<ArrayList<Integer>> input)
	{
		for (int i = 0; i < input.size(); i++)
		{
			System.out.println(input.get(i).toString());
		}
		
	}

}
