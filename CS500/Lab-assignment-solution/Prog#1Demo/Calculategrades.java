// Source code for Calculating grade

public class Calculategrades {

	public static void main(String[] args) {
		
		for (double i = 0; i <= 120; i = i + 0.5)
		{
			System.out.print("The grade for " + i + " is ");
			System.out.println(getGrade(i));
		}		
	}

	public static double getGrade(double point)
	{
		
		if(point >= 0 && point <= 49.5)
		{
			return 5.0;
		}
		
		if(point >= 50 && point <= 59.5)
		{
			return 4.7;
		}
		
		if(point >= 60 && point <= 64.5)
		{
			return 4.0;
		}
		
		if(point >= 65 && point <= 69.5)
		{
			return 3.7;
		}
		
		if(point >= 70 && point <= 74.5)
		{
			return 3.3;
		}
	
		if(point >= 75 && point <= 79.5)
		{
			return 3.0;
		}	
		
		if(point >= 80 && point <= 84.5)
		{
			return 2.7;
		}
		
		if(point >= 85 && point <= 89.5)
		{
			return 2.3;
		}
		
		if(point >= 90 && point <= 94.5)
		{
			return 2.0;
		}
		
		if(point >= 95 && point <= 99.5)
		{
			return 1.7;
		}
		
		if(point >= 100 && point <= 104.5)
		{
			return 1.3;
		}
		
		if(point >= 105 && point <= 120)
		{
			return 1.0;
		}
		
		return 0; // invalid input
	}
	
}
