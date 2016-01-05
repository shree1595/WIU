
public class Teacher extends Person {
	private String subject;
     
    private  String type; // Primary or Secondary School teacher

    public Teacher(String fName, String lName)
    {
    	super(fName,lName);
    }
    
    public Teacher(String fName, String lName, String sub, String sType)
    {
         super(fName,lName);
         subject = sub;       
         type = sType;         
     }
    
    public void setType(String ty)
    { 
    	type = ty; 
    }    
    
    public void setSubject(String sub)
    { 
    	subject = sub; 
    }  
    
    public String getType()
    { 
    	return type;
    }    
    
    public String getSubject()
    { 
    	return subject;
    }    
        
    public void Display()
    {
           super.Display();

           System.out.println("Main Subject : " + subject);          
           System.out.println("Type : " + type);
    }

}
