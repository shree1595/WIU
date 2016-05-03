	/*
	 *  Course: CS500
	 *  FindPosition.java 
	 *  Key point: Binary Search
	 */

public class FindPosition {

	public static void main(String[] args) {  // test program
		
		int[] input = {1,3,5,6};
		System.out.println(searchInsert(input, 2));
	}	
	
	public static int searchInsert(int[] A, int target) {	        
			int ret = -1;
	        if (A.length < 1) return 0;
	        int left = 0;
	        int right = A.length - 1;
	        
	        while (left <= right)
	        {
	            int mid = left + (right - left + 1)/2;
	            if (A[mid] == target)        // if the value is existed, return the found position
	            {
	                ret = mid;
	                break;
	            }
	            else
	            {
	                if (A[mid] > target)    // throw the right half
	                {
	                    right = mid - 1;
	                }
	                else                    // throw the left half
	                {
	                    left = mid + 1;
	                }
	            }
	        }
	        
	        if (ret == -1) ret = left;     // the element is missing
	        return ret;	    
	}
}
