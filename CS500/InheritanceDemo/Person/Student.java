/*
 *    This file is to define student class 
 */

public class Student extends Person {
  
	protected int id;                           //student id
	protected String level;                     //graduate or undergraduate
	
	/*
	 * Constructor with four parameters
	 */
	public Student (String first, String last, int index, String l) 
	{
		super(first, last);                      // invoke constructor of superclass
		id = index;
		level = l;
	}
	
	public String toString()                     // override toString() of superclass
	{
		return super.toString() + " with id: " + id + " and level: " + level;
	}
	
}
