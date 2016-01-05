
public class Teacher extends Person {
	 String subject;
     
     String type; // Primary or Secondary School teacher

    Teacher(String fName, String lName, String sub, String sType)
    {
         super(fName,lName);
         subject = sub;       
         type = sType;         
     }
    void Display()
    {
           super.Display();

           System.out.println("Main Subject : " + subject);          
           System.out.println("Type : " + type);
    }

}
