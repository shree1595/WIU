/*
 *    This file is to define Person class 
 */

public class Person {
	
	protected String firstname;                       //first name of person
	protected String lastname;                        //last name of person
	
	/*
	 * Constructor with two parameters
	 */
	public Person(String first, String last)
	{
		firstname = first;
		lastname = last;		
	}
	
	/*
	 * Override toString function
	 */
	public String toString()
	{
		return "My name is " + firstname + " " + lastname;
	}
	

}
