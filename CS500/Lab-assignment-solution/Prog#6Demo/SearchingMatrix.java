/*
 *  Sample code for SearchingMatrix
 */

public class SearchingMatrix {
	
// test program
		public static void main(String[] args)
		{
			int[][] input = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}};
			System.out.println(search(input, 11));
		}
	
		
// Each step throw away a row or a column: if the matrix[row_id][col_id] > target, throw away a column; the matrix[row_id][col_id] < target
// throw away a row
		 
	    public static boolean search(int[][] matrix, int target) {
	    
	    	 int num_rows = matrix.length;
	    	 
	         if (num_rows <= 0) return false;
	         
	         int num_cols = matrix[0].length;
	         
	         int row_id = 0;
	         int col_id = num_cols - 1;
	         
	         while(row_id <= num_rows-1 && col_id >= 0)
	         {
	             if (matrix[row_id][col_id] == target)    // find the target
	             return true;
	             
	             if (matrix[row_id][col_id] > target)     // throw array a column
	             {
	                 col_id --;
	             }
	             else						 	          // throw away a row
	             {
	                 row_id ++;
	             }
	         }
	         
	         return false;
	         
	    }
}
