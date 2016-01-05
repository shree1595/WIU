
public class Student extends Person {
	 private int id;	// student id number
     private String standard;   // graduate or undergraduate
     
     
    /*
     * Constructor of students  
     */
    public Student(String fName, String lName, CheckingAccount[] chk, SavingAccount[] sav)
     {
          super(fName,lName, chk, sav);
                         
     }
    
    /*
    * Constructor of students  
    */
 
    public Student(String fName, String lName, int nId, String stnd, CheckingAccount[] chk, SavingAccount[] sav)
     {
          super(fName,lName, chk, sav);
          id = nId;
          standard = stnd;                
      }
     
    /* 
     * Set id to stu_id
     */
    public void setId(int stu_id)
    { 
    	id = stu_id; 
    }    
    
    /* 
     * Set standard to stu_id
     */
    
    public void setStandard(String stu_std)
    { 
    	standard = stu_std; 
    }   
    
    public int getId()
    { 
    	return id;
    }    
    
    public String getStandard()
    { 
    	return standard;
    }    
     
    /*
     * Print out the info of student 
     */
    public void Display()
     {
            super.Display();
            System.out.println("ID : " + id);
            System.out.println("Standard : " + standard);            
     }
}
