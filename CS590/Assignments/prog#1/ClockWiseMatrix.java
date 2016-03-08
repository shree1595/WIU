/*
 *  Sample code to generate clock-wise matrix
 *  Hint: refer to printing the spiral matrix question 
 *  Course: CS 590
 */
import java.util.Arrays;

public class ClockWiseMatrix {

	public static void main(String[] args) {  // test program
		
		 int n = 5;

		 System.out.println(Arrays.deepToString(generateMatrix(n)));

	    }

	public static int[][] generateMatrix(int n) {   // generate clock-wise matrix
	        
	        int[][] record = new int[n][n];	        
	        
	        int begin = 0;
	        int count = 1;
	        
	        while (begin < n-1)
	        {
	            for (int i = begin; i < n-1; i++)
	            {
	                record[begin][i] = count++;
	            }
	            
	            for (int i = begin; i < n-1; i++)
	            {
	                record[i][n-1] = count++;
	            }
	            
	            for (int i = n-1; i > begin; i--)
	            {
	                record[n-1][i] = count++;
	            }
	            
	            for (int i = n-1; i > begin; i--)
	            {
	                record[i][begin] = count++;
	            }
	            begin++;
	            n--;
	        }
	        
	        if (begin  == n-1)  
	        	record[begin][n-1] = count;
	        
	        	return record;
	}
	
	
	public static void printList(ListNode head)  // function to print all the nodes
	{
		while(head !=  null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}
}
