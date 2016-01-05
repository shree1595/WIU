/*
 *   Multiple instances share the same static variables
 * 
 */
public class StaticStuff {
	
	public static double staticDouble; 
	public static String staticString;

	public static void main(String[] args) {
		StaticStuff s1, s2;
		s1 = new StaticStuff();
		s2 = new StaticStuff();  // static variables will not be increased, i.e. sharing static variables
		s1.staticDouble = 3.7;
		System.out.println(s1.staticDouble );
		System.out.println( s2.staticDouble );
		s1.staticString = "abc";
		s2.staticString = "xyz";
		System.out.println( s1.staticString );
		System.out.println( s2.staticString );
	}
}
