

public class CheckingAccount extends BankAccount{	
	
	 private double annualInterestRate = 0.0; //
	
	/*
	    Constructs a Checking account with 0 balance    
	 */	 
	public CheckingAccount()
	{
		super();
	}
	
	/*
    Constructs a Checking account with a given balance    
   */
	 public CheckingAccount(double initialBalance)
	 {   
	      super(initialBalance);
	 }
	 
	 /*
	  * Return the annual interest rate
	  */
	 public double getAnnualInterest()
	 {
		 return balance * annualInterestRate;
	 }
	 
	 /*
	 * Overwrite toString() function
	 */
	 public String toString()
	 {
		 return "The current balance of this Checking Account is " + balance;
	 }
	 
}
