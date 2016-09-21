/*
 *  CS 500: Check  if a given string is a palindrome, considering only alphanumeric characters 
 *  and ignoring cases 
 */
public class CheckPalindrome {		

		public static void main(String[] args) {			
		      
			String str = "10Ab,  ba01";			
			System.out.println(checkPal(str));
		}
		
		/*
		 *  checkPal: if it is return true; otherwise, return false;
		 */
		public static boolean checkPal(String str) 
		{
			//remove all the non-alphanumeric characters and convert to lower case 
			String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
				
			// check if it is a palindrome
			for (int i = 0; i < str1.length()/2; i++)
			{
				if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i))
				{
					return false;   // it is not a palindrome
				}
			}			
			return true;			
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
