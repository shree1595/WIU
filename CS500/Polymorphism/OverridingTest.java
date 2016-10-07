
public class OverridingTest {
	public static void main(String[] args) {
		System.out.println("We created an animal!!!");
		Animal ani = new Animal();
		
		System.out.println("We created a bird!!! ");
		Bird brd = new Bird();
		
		System.out.println("We created a dog!!! ");
		Dog  dg = new Dog();
		
		ani.Sleep();
		brd.Sleep();
		dg.Sleep();
		}
}
