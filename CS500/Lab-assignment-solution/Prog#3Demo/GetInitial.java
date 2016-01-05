
/*
 *  source code for getInitial
 */

import java.util.Scanner;
public class GetInitial {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your firstname and lastname, seperate by space :");			//prompt the user to enter user's firstname and lastname
		Scanner sc = new Scanner(System.in);
		
		String firstname = sc.next();  //get the firstname
		String lastname = sc.next();  // get the lastname
		
		System.out.println(Character.toUpperCase(firstname.charAt(0)) + "" + Character.toUpperCase(lastname.charAt(0)) + "");  // print out the initial		
		
		sc.close();

	}

}
