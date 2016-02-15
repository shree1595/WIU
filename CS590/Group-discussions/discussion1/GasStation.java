/*
 *  Course: CS590
 *  TwoSum.java - sample code for gas station
 *  Author: Zheng Li
 */

public class GasStation {
	
	public static void main(String[] args)
	{
		int[] gas = {3, 2, 1, 1};
		int[] cost = {2, 1, 2, 1};
		
		int ret = calSatrtingIndex(gas, cost);
		
		if(ret == -1) 
			System.out.println("Can not travel around the circuit once!");
		else			
			System.out.println("Can start the trip from gas station " + ret + " to travel the circuit once!");
	}
	
	
	public static int calSatrtingIndex(int[] gas, int[] cost)
	{
		int start_index = 0;  // the station index to begin the trip
		int total = 0;      // indicate whether travel around the circuit once
		int local_sum = 0;  // indicate whether can begin the trip from start_index 
		
		
		for (int i = 0; i < gas.length; i++)
		{
			total += gas[i] - cost[i];
			
			local_sum += gas[i] - cost[i];
			
			if (local_sum < 0)
			{
				start_index = i + 1;
				local_sum = 0;
			}
		}
		
		if(total >= 0) return start_index;
		
		return -1;
		
		
		
		
	}
	
	

}
