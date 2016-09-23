/*
 *  CS 500: Check if a given string is a pangram
 */
public class Pangram {
	
	public static void main(String[] args)
	{
		String str = "We promptly judged antique ivory buckles for the prize";
		System.out.println(checkPangram(str));		
		
	}
	
	public static boolean checkPangram(String str)
	{
		String temp = str.toLowerCase().replaceAll(" ", ""); // replace all the space with empty
		
		boolean[] mapping = new boolean[26];                 // boolean array to indicate if a character is included:
				
		for (int i = 0; i < temp.length(); i++)
		{
			int index = temp.charAt(i) - 'a';                // map 'a' -> 0, 'b' - > 1 ... into the mapping array
			mapping[index] = true;							 // if existed, set true
		}
		
		for (int i = 0; i < mapping.length; i++)
		{
			if (mapping[i] == false) return false;          // if any character is not included, return false;
		}		
		return true;		
	}
}
