/*
 *  Course: CS500
 *  ReverseString.java
 *  Idea: using recursion
 *  
 */
public class ReverseString {
	public static void main(String[] args)
	{
		String str = "hello world";		
		printReversedString(str);
	}

	
	public static void printReversedString(String str)  // using recursion
	{
		int length = str.length();
		
		if(length <= 0)  return;                       //  empty string, return
		
		System.out.print(str.charAt(length - 1));		
		
		printReversedString(str.substring(0, length - 1));
		
	}
	
}
