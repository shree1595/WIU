/*
 *  Sample code for MinMax 
 */
public class MinMax {

	public static void main(String[] args) {
		
		if(args.length < 1)   // no input
		{
			System.out.println("No input!");
		}
		
		double min = Double.parseDouble(args[0]);
		double max = min;
		
		for (int i = 0; i < args.length; i++)  // go through all the inputs, find the maximum and minimum
		{
			double current = Double.parseDouble(args[i]);			
			min = (min > current) ?  current : min;
			max = (max < current) ? current : max; 
		}
		
		System.out.println("Maximum value is "+ max);
		System.out.println("Minimum value is "+ min);

	}

}
