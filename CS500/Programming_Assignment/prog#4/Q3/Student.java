/*
 *  Sample code for Student Class
 *  Course: CS 500
 */
public class Student {
	
	private Job job;
	
	public Student(String role, double salary)
	{
		job = new Job();
		job.setRole(role);
		job.setSalary(salary);
	}
	
	public void changeSalary(double salary)
	{
		job.setSalary(salary);
	}
	
	public String toString()
	{
		return "This student works as " + job.getRole() + " with salary at " + job.getSalary();
	}
	
	public static void main(String[] args)
	{
		Student stu = new Student("Grad Assist", 10.0); System.out.println(stu); 
	}
	

}
