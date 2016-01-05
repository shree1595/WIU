/*
 * Source code for Super Class Worker
 */
public class Worker {

	protected String workerName;      // Worker name
	protected int WorkerId;			  // Worker ID
	
	protected boolean isWorking;		// currently employed or not
	
	public Worker(String name, String id, String isWork)   // Constructor of Worker 
	{
		workerName = name;		
		WorkerId = Integer.valueOf(id);		
		isWorking = Boolean.valueOf(isWork);
	}
		
	public String getName()					// return worker name
	{
		return workerName;
	}
	
	public void setName(String name)       // update worker name
	{
		workerName = name;
	}
	
	public int getId()						// return worker ID
	{
		return WorkerId;
	}
	
	public void setId(int id)				// set Worker ID
	{
		WorkerId = id;
	}
	
	public boolean getIsWorking()			// return is working status
	{
		return isWorking;
	}
	
	public void setIsWorking(boolean isWork)	// update is working status
	{
		isWorking = isWork;
	}
	
	public String toString()
	{
		
		return " Name: " + workerName + " | WorkerId: " + WorkerId + " | isWorking Status: " + isWorking;
	}	
}
