/*
 *  Define a class Dog extends from Mammal and test the "instanceof" operator 
 */
public class Dog extends Mammal {
	
	public static void main(String[] args)
	{
		Animal an = new Animal();
		Mammal ma = new Mammal();
		Dog dog = new Dog();
		
		System.out.println(ma instanceof Animal); //true, ma is an animal
		System.out.println(ma instanceof Dog);  // false, ma is NOT a Dog
		System.out.println(dog instanceof Animal); // true, dog is an animal
	}
	
}
