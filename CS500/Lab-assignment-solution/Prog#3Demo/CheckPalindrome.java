/*
 *    Sample code for checking palindrome
 */
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter a string:");			//prompts user to ener a string
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();						//stores the string in c
		sc.close();
		
		if (isPalindrome(str))		
			System.out.println("This is Palindrome!");
		else
			System.out.println("This is not Palindrome!");
			
		
	}
	
	public static boolean isPalindrome(String str) //check if palindrome
	{
		int left = 0, right = str.length()-1;
		
		
		while(left < right)
		{
			if(!isCharacter(str.charAt(left)))  // not character, skip
			{
				left ++;
				continue;
			}
			
			if(!isCharacter(str.charAt(right))) // not character, skip
			{
				right --;
				continue;
			}
			
			if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) //check if character equals or not
			{
				return false;
			}
			
			left ++;
			right --;
				
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
	
	
