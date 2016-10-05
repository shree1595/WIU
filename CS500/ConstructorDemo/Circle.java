/*
 * This is a demo Circle Class for CS500 *   
 */
public class Circle {
	
	private double cx;
	private double cy;
	private double rad;	
	
	public static int count = 0;
	
	public Circle()
	{
		cx = 0.0;
		cy = 0.0;
		rad = 1.0;
		count ++;
	}
	
	public Circle(double x, double y)
	{
		cx = x;
		cy = y;
		rad = 10.0;
		count ++;
	}
	
	public Circle(double x, double y, double r)
	{
		cx = x;
		cy = y;
		rad = r;
		count ++;
	}	
	
	public static int getCount()
	{
		return count;
	}
	
	
	public void setCenter(double x, double y)
	{
		cx = x;
		cy = y;		
	}
	
	public void setRadius(double r)
	{
		rad = r;
	}
	
	public String toString()
	{
		String str = "This Circle has center at " + "( " + cx  + ", " + cy +" ) and radius as " + rad; 
		return str;		
	}	
}
