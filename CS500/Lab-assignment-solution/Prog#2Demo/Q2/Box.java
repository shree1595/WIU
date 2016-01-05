// adding comments here ....
public class Box {
	
	private double width;
	private double height;
	private double length;
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getVolume()
	{
		return length * height * width;
	}
	
	public String toString()
	{
		String str = "This Box has width as " + width + " length as " + length + "and height as " + height;
		return str;
	}		

	public static void main(String[] args) {
		
		Box box1 = new Box();
		box1.setHeight(5.0);
		box1.setLength(9.0);
		box1.setWidth(10.0);
		System.out.println(box1);
		System.out.println("The volumen of this box is " + box1.getVolume());
		
	}

}
