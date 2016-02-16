/*
 *  Course: CS500
 *  MatrixMul.java - sample code to calculate the multiplication of two matrices
 *  
 */
public class MatrixMul {

	public static void main(String[] args) {
		
		int[][] A = {{1,2},{3,4}};
		int[][] B = {{2,2},{2,2}};
		
		int[][] C = new int[A.length][B[0].length];  // C =  A * B
		
		
		for (int i = 0; i < C.length; i++)
			for (int j = 0; j < C[0].length; j++)
				for (int k = 0; k< A[0].length; k++)
				{				
					C[i][j] += A[i][k] * B[k][j];   // calculate value of C[i][j]						
				}			
		
		for (int i = 0; i < C.length; i ++)         // pint out all elements in the C
		{
			for (int j = 0; j < C[0].length; j++)
			{
				System.out.print(C[i][j] + " ");				
			}
			System.out.println();
		}
	}

}
