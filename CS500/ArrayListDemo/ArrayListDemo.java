/*
 *  Source code for simple ArrayList Demo
 */
import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
	
		ArrayList<String> arr = new ArrayList<String>();  // Declare an arraylist		
		
		arr.add("Welcome");   // add the first element
		arr.add("CS500");     // add one more element
		arr.add(1, "to");     // add "to" as the second element, which will move "CS500"  
		
		System.out.println(arr.toString());	
		
		arr.set(2,  "WIU");	 // change the second element to "WIU"
		
		System.out.println(arr.toString());	

	}
	
	

}
