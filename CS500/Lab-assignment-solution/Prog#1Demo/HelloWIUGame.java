/*
 *  An implementation of Exercise1: Hello WIU Game.
 */
public class HelloWIUGame {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++ )
		{
			if(i%15 == 0) // multiple of 3 and 5
			{
				System.out.println("Hello WIU!");
				continue;  // goto next iteration
			}
			
			if(i%5 == 0) // multiples of 5
			{
				System.out.println("WIU!");
				continue;
			}
			 
			if(i%3 == 0) // multiples of 3
			{
				System.out.println("Hello!");
				continue;
			}			
			System.out.println(i);			
		}

	}

}
