/*
 * Example : Program that illustrates inheritance in java using person class
 */

public class Person {
	protected String FirstName;
    protected String LastName;
    protected CheckingAccount chkAcc;
    protected SavingAccount savAcc;

    /*
     * Constructor of Person 
     */
    Person(String fName, String lName)
    {
             FirstName = fName;
             LastName = lName;
             chkAcc = new CheckingAccount();
             savAcc = new SavingAccount();             
     }
    
     void Display()
     {
           System.out.println("First Name : " + FirstName);
           System.out.println("Last Name : " + LastName);
      }
}
