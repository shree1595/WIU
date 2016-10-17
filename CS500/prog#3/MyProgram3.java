import java.util.Arrays;

public class MyProgram3 {
	
	//	Q1: Two-char Strings	
	public static String twoCharString(String str1, String str2)
	{
		char[] str1_arr = removeDuplicas(str1).toCharArray(); //remove duplicate characters in str1 and store as a char array
		char[] str2_arr = removeDuplicas(str2).toCharArray();//remove duplicate characters in str2 and store as a char array
		Arrays.sort(str1_arr);
		Arrays.sort(str2_arr);
		
		
		StringBuilder result = new StringBuilder();  // result will be here
		for (int i = 0; i < str1_arr.length; i++)  // get the concatenation
		{
			for (int k = 0; k < str2_arr.length; k++)
			{
				result.append(str1_arr[i] + "" + str2_arr[k] + " ");
			}
		}
		
		return result.toString().trim();		
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
	
	
	//  Q2: Sum-of-Integers
	public static int sumOfIntegers(String str)
	{
		
		String[] temp = str.split("[^0-9]+");            //split by non-digits
		int sum = 0;
		
		for (String element: temp)
		{
			//System.out.println(element);
			int value = Integer.valueOf(element);
			sum += value;                               // add all digits together
		}
		return sum;		
	}	
	
	//  Q3: UpLowSentence
	public static String convertUpLowSentence(String str)
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
	
	// Q4: RevString
	public static String revString(String str)
	{
		StringBuilder ret = new StringBuilder(str);       // mutable object
		
	    int left = 0;                                     // starting index
	    int right = ret.length() - 1;                     // ending index
	    while (left < right)
	    {
	    	if (!checkCharacter(ret.charAt(left)))        // if not a alphabetic character, left ++
	    	{
	    		left ++;
	    		continue;
	    	}
	    	
	    	if (!checkCharacter(ret.charAt(right)))       // if not a alphabetic character, right --
	    	{
	    		right --;
	    		continue;
	    	}
	    	
	    	/*
	    	 *  Swap the elements at positions left and right
	    	 */
	    	char temp = ret.charAt(left);                
	    	ret.setCharAt(left, ret.charAt(right));
	    	ret.setCharAt(right, temp);	
	    	
	    	left ++;	    	
	    	right --;
	    } 
	    
	    return ret.toString();		
	}
	
	public static boolean checkCharacter(char ch)      // check if a alphabetic character or not
	{
		if (((ch <= 'Z') && (ch >= 'A')) || ((ch <= 'z') && (ch >= 'a')))
			return true;
		
		return false;
	}	
	
	// Q5: CheckPangram
	public static boolean checkPangram(String str) 
	{
		String temp = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // replace all the space with empty
		
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
