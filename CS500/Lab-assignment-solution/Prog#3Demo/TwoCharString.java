import java.util.Scanner;

public class TwoCharString {

	public static void main(String[] args) {
		
		
		int y = 4;
		int z = 6;
		System.out.println("" + z + y);
		
		
			
		Scanner sc = new Scanner(System.in);			//read two inputs from prompt
		System.out.println("enter the first string:");
		String a = sc.nextLine();
		
		System.out.println("enter second string:");
		String b = sc.nextLine();
	
		System.out.println(twoStrings(a,b));  // print out the results
		sc.close();
	}

	
	public static String twoStrings(String str1, String str2)
	{
		String cur_str1 = removeDuplicas(str1);  
		String cur_str2 = removeDuplicas(str2);
		StringBuilder result = new StringBuilder();  // result will be here
		for (int i = 0; i < cur_str1.length(); i++)  // get the concatenation
		{
			for (int k = 0; k < cur_str1.length(); k++)
			{
				result.append(cur_str1.charAt(i) + "" + cur_str2.charAt(k) + " ");
			}
		}
		
		return result.toString();		
	}
	
	
	public static String removeDuplicas(String str)  // remove duplicated characters in the str
	{
		StringBuffer proc_str = new StringBuffer();	
		boolean[] mark = new boolean[26];   // check if the character has been visited or not
		
		
		for (int i = 0; i < mark.length; i++)  // initially, set as non visited
			mark[i] = false;
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);   // get the char at position i
			int index = Character.toUpperCase(ch) - 65; // A -> 0; B -> 1 .... Z - > 26
			if(mark[index] == true) //if already visited, then skip
			{
				continue;
			}
			
			proc_str.append(ch);  // append to proc_str
			mark[index] = true;	  // mark it as visited	
		}
		
		return proc_str.toString();
		
	}
}
		
		
		
		
