/*
 *  Course: CS590
 *  UniquePath.java: return the total number of different paths from top left to bottom right
 *  Idea: using Dynamic Programming
 *  
 */

public class UniquePath{

	public static void main(String[] args) {		
		
		int m  = 6;
		int n = 6; 
		
		System.out.println(DPgetUniquePath(m,n));
	}
	
	
	public static long DPgetUniquePath(int m, int n) 
	{
		
		long[][] paths = new long[m][n];
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if(i == 0 || j == 0)
				{
					paths[i][j] = 1;
					continue;
				}
				
				paths[i][j] = paths[i-1][j] + paths[i][j-1];				
			}			
		}
		return paths[m-1][n-1];
	}	
}
