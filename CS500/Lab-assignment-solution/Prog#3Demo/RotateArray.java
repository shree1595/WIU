/*
 *  Source code for Rotate array in place
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        reverse(nums, 0, nums.length-1); // reverse all the elements
        reverse(nums, 0, k-1);  // reverse between 0 and k01
        reverse(nums, k, nums.length-1); // reverse the rest
        
    }
    
    public void reverse(int[] arr, int start, int end) // reverse the array within the index between start and end
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        
    }
    
}