import java.util.Arrays;
public class RandomArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) 
		{
			arr[i] = (int)(Math.random() * 90) + 10;  // generate the random value between 10 ~ 99 
		}		
		
		System.out.println("Before reversion:" + Arrays.toString(arr));  // convert array to string and then print it out
		
		for (int i = 0, j = arr.length-1; i < j; i++,j--) // reverse all the elements in the array
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
		
		System.out.println("After reversion:" + Arrays.toString(arr));
	}
}
