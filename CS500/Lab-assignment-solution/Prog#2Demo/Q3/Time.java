/*
 * Define the class Time
 */
public class Time {

	private int hour;
	private int minute;
	
	public int getHour()			//return hour
	{
		return hour;
	}
	
	public int getMinute()			//return minute 
	{
		return minute;
	}
	
	public void setHour(int h)		// sets hour value as h
	{
		hour = h;
	}
	
	public void setMinutes(int m)	//sets minute value to m
	{
		minute = m;
	}

	public void printTime()			//print the time
	{
		
		System.out.printf("%02d:%02d", hour, minute);
		System.out.println();
	}

	public void advance()			//advances the given time by a minute
	{

		// //when the minute is xx:59 then advance the hour by 1 but reset minute to 0; if the time is 23:59, set to 00:00
		minute++;
		
		if(minute == 60)
		{
			hour ++;
			minute = 0;
		}
		
		if(hour == 24)
		{
			hour = 0;
		}	
	}
	
	public static void main(String[] args)
	{

		Time tm = new Time();		// creates an object tm in class Time
		tm.setHour(23);				
		tm.setMinutes(59);			
		
		tm.printTime();				//prints the time before advance()		
		
		tm.advance();				//advance time by one minute
		tm.printTime();				//prints time after advance()

	}	
	
}
