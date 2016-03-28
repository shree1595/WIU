	/*
	 *  Course: CS590
	 *  kthLargest.java - find the kth largest number in an unsorted array within O(N) time (average)
	 *  Hint: details are already explained in the class
	 */

	public class kthLargest {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] arr = {1, 0, 3, 4, -1, 10, -7, -3};
			
			int k =4 ;
			
			System.out.println(findKthLargest(arr, 0, arr.length - 1, k-1));
			
		}

		public static int findKthLargest(int[] arr, int start, int last, int k)
		{		
		       int index =	-1;	  
			 	
		       while(index != k)   // index is the position of the pivot return by partition
			   {
		    	  	
		    	   if(index > k)   // throw the right part 
		    	   {
		    		   index = partition(arr, start, index-1);
		    	   }
		    	   else            // throw the left part
		    	   {
		    		   index = partition(arr, index+1, last);
		    	   }   
			   
			   }	    
		    return arr[index];
		    
		}			
		
		public static int partition(int[] arr, int left, int right)  // apply the idea of partition procedure in quick sort, time cost O(N)
		{	
			
			int pivot = arr[right];
			
			int index_left = left;
			int index_right = right - 1;
			
			while(index_left <= index_right)
			{
				if(arr[index_left] <= pivot)
				{
					index_left ++;
					continue;
				}
				
				if(arr[index_right] > pivot)
				{
					index_right --;
					continue;
				}			
				swap(arr, index_left++, index_right--);		
			}
			
			   swap(arr, index_left, right);
			   return index_left;		
		}
		
		public static void swap(int[] arr, int left, int right)    // swap the two elements: left and right
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;		
		}
		
	}


