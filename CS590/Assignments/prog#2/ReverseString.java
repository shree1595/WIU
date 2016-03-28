/*
 *  Sample code for reverseString 
 *  Course: CS 590
 */

public class ReverseString {

	public static void main(String[] args) {   // test program
		
		String str = " the dog is white";
		System.out.println(reverseString(str));

	}
	
	/*
	 * Here is the method to use StringBuilder to speed up the program
	 */
	public  static String reverseString(String s) {        
            
        StringBuilder str = new StringBuilder("");  // use Stringbuilder instead of string, which is immutable
        
        int start = -1;                             // indicates the starting point of a word
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')                // use space to separate the words
            {
                if (start != -1)
                {
                    str.insert(0, s.substring(start, i) + " ");
                    start = -1;
                }
            }
            else
            {
                if(start == -1)
                {
                    start = i;
                }
            }
        }
        
        if (start > - 1 && start <= s.length()-1)  str.insert(0, s.substring(start, s.length()) + " "); // append the last word 
        
        String result = str.toString();                 //Convert StringBuilder to String
       
       return result.length() <= 1? result: result.substring(0, result.length()-1);
    }

}
