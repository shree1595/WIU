/* Course: CS590
 * DecodeWays: Given an encoded message containing digits, determine the total number of ways to decode it.
 * Example: Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * The number of ways decoding "12" is 2.
 */
public class DecodeWays {

	public static void main(String[] args) {
		
		System.out.println("1234");
	}	
	
	public static int numDecodings(String s) {
	    if(s==null||s.length()==0||s.equals("0"))  // invalid message, return 0
	        return 0;
	 
	 
	    int[] t = new int[s.length()+1];
	    t[0] = 1;
	 
	    if(isValid(s.substring(0,1)))    //base case
	        t[1]=1;
	    else
	        t[1]=0;
	 
	    for(int i=2; i<=s.length(); i++){       //fill the table from left to right
	        if(isValid(s.substring(i-1,i))){
	            t[i]+=t[i-1];
	        }
	 
	        if(isValid(s.substring(i-2,i))){
	            t[i]+=t[i-2];
	        }
	    }
	 
	    return t[s.length()];
	}
	 
	public static boolean isValid(String s){
	    if(s.charAt(0)=='0')
	        return false;
	    int value = Integer.parseInt(s);
	    return value>=1&&value<=26;
	}

}
