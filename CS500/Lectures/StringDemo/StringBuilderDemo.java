/*
* Demo of StringBuilder
*/
public class StringBuilderDemo {
	
	public static void main(String[] args)
	{
	StringBuilder str1 = new StringBuilder("CS500");
	
	/*Insert at the beginning */
	str1.insert(0, "Welcome to ");
	System.out.println(str1);	
	
	/*Append at the end */
	str1.append(" in class room 322!");
	System.out.println(str1);
	}

}
