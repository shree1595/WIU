/*
 *  Course: CS590
 *  TwoSum.java - sample code for Jump Game
 *  Author: Zheng Li
 */
public class JumpGame {

	public static void main(String[] args) {
				
		int[] steps = {2,3,1,1,4};
		boolean flag = JumptoEnd(steps);
		
		if(flag == true)
			System.out.println("Can reach the last index!");
		else
			System.out.println("Can not reach the last index!");

	}

	public static boolean JumptoEnd(int[] steps)
	{
		int des = steps.length - 1; // last index
		
		int start = 0;         // current location
		int farthest = 0;      // farthest index can be reached
				
		while(start <= farthest)       // check all the starting locations in between
		{
			farthest = Math.max(farthest, steps[start] + start);
			start ++;
			
			if(farthest >= des)  return true;   			
		}
		
		return false;		
	}
	
}
