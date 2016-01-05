/*
 * Example : Program that illustrates inheritance in java using person class
 */

public class Person {
	protected String FirstName;  // first name
    protected String LastName;   // last name 
    protected CheckingAccount[] chkAcc; //checking accounts
    protected SavingAccount[] savAcc;  // saving accounts

    /*
     * Constructor of Person 
     */
   public Person(String fName, String lName, CheckingAccount[] chk, SavingAccount[] sav )
    {
             FirstName = fName;
             LastName = lName;
             chkAcc = chk;
             savAcc = sav;             
     }
    
    /*
     *  Print out the first and last name
     */
    public void Display()
     {
           System.out.println("First Name : " + FirstName);
           System.out.println("Last Name : " + LastName);
     }
     
    
    /*
     *  Print all the checking and saving accounts
     */
    public void printAccounts()
    {
    	System.out.println("The checking accounts are as follows: ");
    	for (int i = 0; i < chkAcc.length; i++)
    	{
    		System.out.println(chkAcc[i]);
    	}
    	
    	System.out.println("The Saving accounts are as follows: ");
    	for (int i = 0; i < chkAcc.length; i++)
    	{
    		System.out.println(savAcc[i]);
    	}    	
    }     
}
