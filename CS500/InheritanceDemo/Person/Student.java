
public class Student extends Person {
	 int id;
     String standard;    
 
     Student(String fName, String lName, int nId, String stnd)
     {
          super(fName,lName);
          id = nId;
          standard = stnd;                
      }
     void Display()
     {
            super.Display();
            System.out.println("ID : " + id);
            System.out.println("Standard : " + standard);            
     }

}
