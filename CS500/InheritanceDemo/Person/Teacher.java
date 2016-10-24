/*
 *    This file is to define Teacher class 
 */

public class Teacher extends Person{
	
	protected String subject;                 // subject teacher teaches
	protected String type;                    // type of teacher, full time or part-time
	
	/* 
	 *  Constructor with four parameters
	 */
	public Teacher(String first, String last, String sub, String t)
	{
		super(first, last);                  // constructor of super class
		subject = sub;
		type = t;
	}
	
	public String toString()                // override toString()
	{
		return super.toString() + " with subject: " + subject + " and type: " + type; 
	}
	
}
