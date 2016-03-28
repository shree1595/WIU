/*
 *  Sample code for finding the minimum.
 *  The minimum element will be smaller than its left
 *  Course: CS 590
 */

public class FindMinimum {

	    public int findMin(int[] num) {
	        
	        int left = 0;
	        int right = num.length-1;
	        
	        while(left < right)          // binary search
	        {
	            int mid = left + (right -left)/2;
	            
	            if (right > mid && num[mid] > num[mid+1])  // find minimum
	                return num[mid+1];
	                
	            if (left < mid && num[mid-1] > num[mid])   // find minimum
	                return num[mid];
	            
	            if (num[right] > num[mid])   // throw the right half
	            {
	                right = mid - 1;
	            }
	            else                        // throw the left half
	            {
	                left = mid + 1;
	            }
	        }
	        
	        return num[left];
	        
	    }
}
