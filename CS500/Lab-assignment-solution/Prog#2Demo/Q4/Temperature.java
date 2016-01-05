/*
 *  Definition of class Temperature
 * 
 */

public class Temperature {


	private double degree;
	private char scale;
	
	public Temperature()			//constructor
	{
		degree = 0.0;
		scale = 'C';
	}
	
	public double getDegree()		//returns degree
	{
		return degree;
	}
	
	public char getScale()			//returns scale
	{
		return scale;
	}
	
	public void setTemp(double nd,char ns)		//sets degree to 'nd' and scale to 'ns'
	{
		degree = nd;
		scale = ns;
	}
	
	public void convert(char ns)		//converts the temperature from one scale to another if ns is not the current scale
	{
		if(scale != ns)
		{
			scale = ns;                 // change the scale
			
			if(scale=='C')              // change the degree
			{
				degree = (degree*(1.8))+32;
				return;			
			}
			
			if(scale == 'F')
			{
				degree = (degree-32)*(1.8);
				return;
			}		
		}
	}
	
	public void printTemp()				//prints the temperature
	{
		System.out.println("The temperature is "+degree+"\u00ba"+scale);	
	}
	
	public static void main(String[] args)
	{
		// create two objects of the temperature
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature();		
		
		
		t1.setTemp(86.0,'F');  
		t2.setTemp(32.0,'C');
		
		
		t1.printTemp();
		t2.printTemp();
		
		// convert to the same scale and then compare the degree
		t1.convert('C');		
		t2.convert('C');	
		
		
		if(t1.getDegree() == t2.getDegree())					//if both the degrees are equal then prints equivalent
		{
			System.out.println("Equivalent");
			return;
		}		
		System.out.println("Not equivalent");
	}
	
	
	

}
