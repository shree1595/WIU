/*
 *  Course: CS500
 *  ZigZagPrintArray.java - sample code to print the array’s zig-zag elements
 *  
 */
public class ZigZagPrintArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};  // square matrix
				
		for (int i = 0; i < arr[0].length; i++)   // print the first row
			System.out.print(arr[0][i] + " ");		
		
		
		int col_index = arr[0].length -2;                // print the elements on the diagonal
		for (int i = 1; i < arr.length -1; i++)
		{				
			System.out.print(arr[i][col_index--] + " ");
		}		
				
		for (int i = 0; i < arr[arr.length-1].length; i++)   // print the last row
			System.out.print(arr[arr.length-1][i] + " ");
	}
}
