/*
 *  Sample code for Job Class
 *  Course: CS 500
 */

public class Job {
	private String role;
	private double salary;
	
	public void setSalary(double val)
	{
		salary = val;
	}
	
	public void setRole(String str)
	{
		role = str;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getRole()
	{
		return role;
	}

}
