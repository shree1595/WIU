/*
 *  This source code is for Class Rectangle
 */
public class Rectangle {

	protected double width;       
	protected double length;
	
	public Rectangle()                         //default constructor
	{		
		width = 0;
		length = 0;
	}
	
	public Rectangle(double wd, double len)   // constructor with two parameters
	{
		width = wd;
		length = len;
	}
	

	public void setWidth(double wd)         // set the width to wd
	{
		width = wd;
	}	
	public void setLength(double len)       // set the length to len
	{
		this.length = len;
	}	
	
	public double getArea()                // return the area of the rectangle
	{			
		return this.width * this.length;
	}
	
	public String toString()                      // overwrite the toString function
	{
		return "The Rectangle has width, height " + width +", " +  length +", respectively!";
	}
}
