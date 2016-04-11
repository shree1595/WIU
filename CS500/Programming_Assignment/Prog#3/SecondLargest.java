public class SecondLargest {

		public static void main(String[] args) {
			
			if(args.length < 2)   // not enough input
			{
				System.out.println("Not enough input!");
			}
			
			double max = Double.MIN_VALUE;
			double sec_max = Double.MIN_VALUE;
			
			for (int i = 0; i < args.length; i++)  // go through all the inputs, find the maximum and minimum
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