//Hint: test program 

public class TestPoint {
   public static void main(String[] args) {
			   
	Point p1 = new Point(3, 0); 
	Point p2 = new Point(0, 4); 
			
	// Testing the overloaded method distance()  
	System.out.println(p1.distance(p2));      
	System.out.println(p1.distance(5, 6));
	
   }
}

