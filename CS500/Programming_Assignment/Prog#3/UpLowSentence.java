/*
 *  Sample code for generating UpLowSentence
 *  Course: CS 500
 */
public class UpLowSentence {

	public static void main(String[] args) {
		String input = "This is a dancing sentence!";
		System.out.println(ConvertUpLowSentence(input));

	}
	
	public static String ConvertUpLowSentence(String str)
	{
		boolean flag = true;                         // true -> Up; false -> lower
		StringBuilder ret = new StringBuilder();     // mutable 
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(!checkCharacter(ch))                 // if not a character, continue
			{
				ret.append(ch);
				continue;
			}			
			
			if(flag)                               // if true, capitalize
			{
				ret.append(Character.toUpperCase(ch));
				flag = false;
			}
			else
			{
				ret.append(Character.toLowerCase(ch)); // if false, un-capitalize
				flag = true;
			}			
		}		
		return ret.toString();		
	}
	
	public static boolean checkCharacter(char ch)      // check if a character or not
	{
		if (((ch <= 'Z') && (ch >= 'A')) || ((ch <= 'z') && (ch >= 'a')))
			return true;
		
		return false;
	}
	
}


