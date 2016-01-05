/*
 * This source file is to demonstrate the static method mean. 
 */
public class ArrayStuff {	
	   public static double mean(double[] arr)   {  // return the average of an input array
		      double total = 0.0;
		      for (int k=0; k!=arr.length; k++)   {
		         total = total + arr[k];
		      }
		      return  total / arr.length;
		   }	   
	   public static void main(String[] args)
	   {
		   double[] myArray = {1.1, 2.2, 3.0};		   
		   double average = ArrayStuff.mean(myArray); 
		   System.out.println("The average of the array is " + average);
	   }
}
