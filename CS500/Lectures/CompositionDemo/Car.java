/*
 *  Demo for "has - a" relation, Car has a Engine. 
 */
public class Car {
	   private String make;
	   private String model;
	   private Engine eng;
	   public Car ()
	   {
	      this.eng = new Engine("2.4L V4");
	      this.model = "Accord";
	      this.make = "Honda";
	   }
	   	   
	   public void setMake (String mk) 
	   {
		   this.make = mk; 
	   }
	   
	   public void setModel (String md)
	   { 
		   this.model = md; 
	   }
	   
	   public void setEngine (Engine eg)
	   { 
		   this.eng = eg; 
	   }
	 
	   public String toString()
	   {
		   String str = "This car is " + make + " " + model + " with engine " + eng.getType();
		   return str;
	   }
	   
	   public static void main(String[] args)
	   {
		   Car mycar = new Car();
		   mycar.setModel("ACCORD");
		   mycar.setMake("Honda");
		   System.out.println(mycar);
	   }
	   
}
