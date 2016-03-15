/*
 *  Sample code for getting Second Largest Input
 *  Course: CS 500
 */
public class SecondLargest {

		public static void main(String[] args) {
			
			if(args.length < 2)   // not enough input
			{
				System.out.println("Not enough input!");
			}
			
			double max = Double.parseDouble(args[0]);
			double sec_max = max;
			
			for (int i = 1; i < args.length; i++)  // go through all the inputs, find the maximum and minimum
			{
				double current = Double.parseDouble(args[i]);
				
				if(current > max)         // if larger than max, update max and second max
				{
					sec_max = max;
					max = current;
					continue;					
				}
				
				if(current > sec_max)     // if larger than second max but less than max, update second_max
				{
					sec_max = current;
					continue;					
				}
			}			
			
			System.out.println("The second largest value is "+ sec_max);

		}
}
