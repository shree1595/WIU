/*
 *  Course: CS590
 *  TwoSum.java - sample code to print SpiralMatrix
 *  Author: Zheng Li
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] input ={{1,2,3},{4,5,6},{7,8,9}};		
		printSpiralMatrix(input);
		
	}

	public static void printSpiralMatrix(int[][] input)
	{
		int left = 0;   //left most column index
		int top = 0;    // top most row index
		int right = input[0].length;    // right most column index
		int bottom = input.length;      // bottom most row index
		
		while(left < right && top < bottom)
		{
			
			for (int i = left; i < right; i++)
			{
				System.out.print(input[top][i] + " ");
			}
						
			top ++;  //increase top most row index
			
			if(top >= bottom)
				break;
			
			
			for (int i = top; i < bottom; i++)
			{
				System.out.print(input[i][right-1] + " ");
			}
					
			right --;
			
			if(left >= right) // decrease the right most column index
				break;
			
			for (int i = right-1; i >= left; i--)
			{
				System.out.print(input[bottom-1][i] + " ");
			}
					
			bottom--;
			
			if(top >= bottom) // decrease the bottom most row index
				break;
			
			for (int i = bottom-1; i >= top; i--)
			{
				System.out.print(input[i][left] + " ");
			}
						
			left ++;          // increase the left most column index
		}
	}
	
}
