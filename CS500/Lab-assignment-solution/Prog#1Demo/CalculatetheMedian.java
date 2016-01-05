/* compare a and b first, large = a > b? a: b, small will be the other one.
1) Compare c with large, if C > large then median = large.
2) Compare c with small, if C < small then median = small.
if 1) and 2) are not satisfied, which means  c is not greater than large and also 
 not less than small, and hence we have median = C.
*/

public class CalculatetheMedian {

	public static void main(String[] args) {
		
		int a = 50, b = 10, c = 90;
		System.out.println("The median value is: " + getMedian(a, b, c));		
	}	
	
	public static int getMedian(int a, int b, int c)
	{
		int large, small;
		
		if(a > b)  // large =  a > b ? a : b
		{
			large = a;
			small = b;			
		}
		else
		{
			large = b;
			small = a;
		}
		
		if( c > large) return large; // median = large if c >large
		if(c < small) return small;   // median = small if c < small
		return c;		// otherwise, median = c;
	}
}
