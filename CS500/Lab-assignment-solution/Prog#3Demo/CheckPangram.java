import java.util.Scanner;

/*
 *  Sample code for checking pangram
 */
public class CheckPangram {
	public static void main(String[] args)
	{
		System.out.println("Enter a string:");			//prompts user to ener a string
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();						//stores the string in c
		sc.close();
		
		if (isPangram(str))		
			System.out.println("This is Pangram!");
		else
			System.out.println("This is not Pangram!");		
	}
	
	public static boolean isPangram(String str) //check if palindrome
	{				
		
		boolean[] mark = new boolean[26];   // check if the character has been visited or not		
		
		for (int i = 0; i < mark.length; i++)  // initially, set as non visited
			mark[i] = false;
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);   // get the char at position i
			
			if(!isCharacter(ch))
			{
				continue;
			}
			
			int index = Character.toUpperCase(ch) - 65; // A -> 0; B -> 1 .... Z - > 26			
			mark[index] = true;	  // mark it as visited	
		}
		
		for (int i = 0; i < mark.length; i++)
		{
			if (mark[i] == false)
				return false;
		}		
		
		return true;		
	}
	
	public static boolean isCharacter(char ch)  //check if it is character...
	{
		if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'))
		{
			return true;
		}
		return false;
	}
	

}
