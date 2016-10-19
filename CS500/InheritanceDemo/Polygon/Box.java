
/*
 * The source code is for Box Class
 */
public class Box extends Rectangle {                // inherited from Rectangle
 
	protected double height;               
	
	public Box()                                   // default constructor
	{
		super();                                   // default constructor of super class
		height = 0;
	}
	
	public Box(double wd, double len, double hg)
	{
		super(wd, len);                             // Constructor of super class with two parameters 
		height = hg;
	}

	public void setHeight(double h)                 // set height to h
	{  
		height = h; 		
	}

	public double getHeight( )                     // return height
	{ 
		return height; 		
	}

	public double volume()                         // get the volume of Box
	{  
		return width * length * height;
	}
	
	public String toString()                      // overwrite the toString function
	{
		return "The box has width, height and length as " + width +", " + height + ", " + length +", respectively!";
	}
}


