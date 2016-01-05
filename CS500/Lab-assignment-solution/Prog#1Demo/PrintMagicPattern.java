/*
 *  An implementation for magic pattern 
 */
public class PrintMagicPattern {

	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i ++)
		{
			if (i % 2 == 1)  // if the row index is even, add a space at the begining
			{
				System.out.print(" ");
			}
			
			for (int j = 0; j < 7; j++)  // print 7 "* "
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
