package polygon;

public class Rectangle {
	private double width;
	private double length;	
	
	public Rectangle()
	{
		width = 3.0;
		length = 5.0;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public String toString()
	{
		
		String str = "This Rectangle has width as " + width + " and length as " + length;
		return str;		
	}	
}
