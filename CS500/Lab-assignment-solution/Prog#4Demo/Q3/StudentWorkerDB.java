
import java.util.*;

public class StudentWorkerDB { 

	private ArrayList<StudentWorker> stuworkers;                            // store all the studentworker instance
	public StudentWorkerDB()
	{
		stuworkers = new ArrayList<StudentWorker>();
	}
	
	public void addStudentWorker(StudentWorker stu)                         // add instance to the ArrayList
	{
		stuworkers.add(stu);
	}
	
	public ArrayList<StudentWorker> workPermitted()                         // return all the StudentWorker with isWorkStudy as true
	{
		ArrayList<StudentWorker> ret = new ArrayList<StudentWorker>();      // the result is stored in an arrayList
		
		for (int i = 0; i < stuworkers.size(); i++)
		{
			if(stuworkers.get(i).isWorkStudy)
			{
				ret.add(stuworkers.get(i));
			}
		}
		
		return ret;		
	}
	
	public StudentWorker search(int id)                                      // return the StudentWorker with a specific ID 
	{
		StudentWorker stu = null;
		for (int i = 0; i < stuworkers.size(); i++)
		{
			if (stuworkers.get(i).getId() == id)
			{
				stu = stuworkers.get(i);
			}
		}
		
		return stu;
	}
	
	public static void main(String[] args) {    // test program
		
		StudentWorkerDB stuDB = new StudentWorkerDB();
		
		stuDB.addStudentWorker(new StudentWorker("Chris Diez", "123456", "true", "25", "true", "11.0"));
		stuDB.addStudentWorker(new StudentWorker("Jack Diez", "22459", "false", "25", "false", "11.0"));
		stuDB.addStudentWorker(new StudentWorker("Jack Uas", "156", "true", "25", "true", "11.0"));
		stuDB.addStudentWorker(new StudentWorker("Grace Das", "16", "false", "25", "true", "11.0"));
		
		ArrayList<StudentWorker> ret = stuDB.workPermitted();
		
		for (StudentWorker stu: ret)
		{
			System.out.println(stu);
		}
		
		System.out.println("The following student has the ID as 156");
		System.out.println(stuDB.search(16));
		

	}

}
