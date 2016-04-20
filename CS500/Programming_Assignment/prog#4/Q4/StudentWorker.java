
public class StudentWorker extends Worker {        

	protected int hoursWorked;		// hours worked every two weeks
	protected double payRate;       // pay each hour
	
	protected boolean isWorkStudy;  // student having work permit or not
	
	public StudentWorker(String name, String id, String iswork, String hours, String workstudy, String pay) // constructor
	{
		super(name, id, iswork);
		
		hoursWorked = Integer.valueOf(hours);
		payRate = Double.valueOf(pay);
		isWorkStudy = Boolean.valueOf(workstudy);
		
	}
	
	public double getPayRate()      // retrieve the pay rate
	{
		return payRate;
	}
	
	public void setPayRate(double pay)   // update pay rate
	{
		payRate = pay;
	}
	
	public String toString()
	{
		return super.toString() + " | " + " Hours worked: " + hoursWorked + " | WorkStudy Status : " + isWorkStudy + " | payRate: " + payRate;
	}
	
	public static void main(String[] args) {
	
		StudentWorker s = new StudentWorker("Chris Diez", "123456", "true", "25", "false", "11.0");
		System.out.println(s.toString());
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getPayRate());
		s.setPayRate(18.00);
		System.out.println(s.getPayRate());
		System.out.println(s.toString());

	}

}
