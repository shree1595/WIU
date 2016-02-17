/*
 *  Course: CS500
 *  WelcomeGame.java - sample code for Welcome CS500 Game
 *  Author: Zheng Li
 */
public class WelcomeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 100; i ++)
		{
			if (i % 5 == 0)                 // multiples of 5
			{
				if (i % 7 == 0)              // multiples of 5 and 7
				{
					System.out.println("Welcome CS500");
				}
				System.out.println("Welcome");
				continue;
			}
			
			if (i % 7 == 0)                  // multiples of 7 only
			{
				System.out.println("CS500");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
