/*
 * Demo of String
 */
public class StringDemo {
	
	public static void main(String[] args)
	{
		String str1 = "java";
		String str2 = str1;		
		String str3 = new String("java");
		
		String substr = str1.substring(1);
		System.out.println("Substring of str1 is: " + substr); // test substring function
		
		/* The following code shows the differences between "==" and "equals" functions */ 
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));		
		
		System.out.println(str1.equals(str3));
		
	}
	
	
}
