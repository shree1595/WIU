
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 4, 6, 10, 11, 12};
		int[] ret = twosum(numbers, 18);
		System.out.println("Two elements with indexes as " + ret[0] + " and " + ret[1] +" has sum 18");		
	}
	
	public static int[] twosum(int[] numbers, int target)
	{
		int[] result = new int[2];
		
		int left = 0;
		int right = numbers.length - 1;
		while(left < right)
		{
			int sum = numbers[left] + numbers[right];
			
			if (sum == target)
			{
				result[0] = left+1;
				result[1] = right+1;
				return result;
			}
			
			if(sum < target)
			{
				left ++;
			}
			else
			{
				right --;
			}			
		}		
		return result;		
	}

}
