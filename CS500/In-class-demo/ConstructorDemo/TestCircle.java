
public class TestCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle[] cirarr = new Circle[10]; // create an array of Circle
		
		for (int i = 0; i < 10; i++)
		{
			cirarr[i] = new Circle();
		}
		
		
		System.out.println("Totally " + Circle.getCount() + " Circles are created!");
	}

}
