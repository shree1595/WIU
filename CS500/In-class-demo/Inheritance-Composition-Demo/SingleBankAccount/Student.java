
public class Student extends Person {
	 private int id;
     private String standard; 
     
     
    public Student(String fName, String lName)
     {
          super(fName,lName);
                         
     }
 
    public Student(String fName, String lName, int nId, String stnd)
     {
          super(fName,lName);
          id = nId;
          standard = stnd;                
      }
     
    public void setId(int stu_id)
    { 
    	id = stu_id; 
    }    
    
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
    
  
     
    public void Display()
     {
            super.Display();
            System.out.println("ID : " + id);
            System.out.println("Standard : " + standard);            
     }

}
