/*
 *  This source code is to quadratic equation  x2 + bx + c = 0. 
 */
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the value of b: ");
	    double b = sc.nextDouble();    
	    System.out.println("Please type the value of c: ");
	    double c = sc.nextDouble();

            sc.close();	    
	
	    double discriminant = Math.pow(b,2) - 4.0*c;
	    double d = Math.sqrt(discriminant);
	    double root1 = (-b + d) / 2.0;
	    double root2 = (-b - d) / 2.0;
	      // print them out
	   System.out.println(root1);
	   System.out.println(root2);
	   }
}
