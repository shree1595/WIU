/*
 *   Demo "Has a" relation, Circle has a point.
 */
public class Circle {
	private Point center;
	private double radius;	
	public Circle()
	{
		center = new Point(0,0);
		radius = 10.0; 
	}
	
	public void setCenterX(double x)
	{		
		center.setCx(x);
	}
	
	public void setCentery(double y)
	{		
		center.setCy(y);
	}
	
	public void setRadius(double z)
	{		
		radius = z;
	}
	
	public double getCenterX()
	{		
		return center.getCx();
	}
	public double getCentery()
	{		
		return center.getCy();
	}	
	public String toString()
	{
		String str = "The center is ( " + getCenterX() + ", " +  getCentery() + " ) and radius is " + radius;
		return str;
	}
	
	public static void main(String[] args)
	{
		Circle cir1 = new Circle();	
		cir1.setRadius(100);
		System.out.println(cir1);		
	}
}
