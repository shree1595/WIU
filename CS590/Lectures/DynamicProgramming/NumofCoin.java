/* Course: CS590
 * NumofCoin.java: determine the minimum number of coin to make the change 
 * General idea: dynamic programming
 */
public class NumofCoin {

	public static void main(String[] args) {
		
		int value = 11;
		int[] changes = {5,3,1};
		
		System.out.println(numOfCoin(value, changes));
		
	}

	public static int numOfCoin(int value, int[] changes)
	{
		
		int[] nums = new int[value+1];
		
		for (int i = 0; i <= value; i++)              // Initialization
		{
			nums[i] = Integer.MAX_VALUE;
		}
		
		nums[0] = 0;		                           // base 	case	
		
		for (int i = 1; i <= value; i++)
		{
						
			for (int k = 0; k < changes.length; k++)    // check all the possible coins to make the current change
			{
				
				int temp = i - changes[k];
				
				int temp_change = Integer.MAX_VALUE;
				
				if(temp >= 0)
				{
					temp_change = nums[temp]+1;
				}				
			
				nums[i] = Math.min(nums[i], temp_change); 				
			}		
		}
		
		return nums[value];
				
	}
	
}
