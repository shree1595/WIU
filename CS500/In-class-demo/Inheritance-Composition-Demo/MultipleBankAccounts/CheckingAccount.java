

public class CheckingAccount extends BankAccount{	
	
	 private double montlyInterestRate = 0.0; //
	
	/*
	    Constructs a Checking account with 0 balance    
	 */	 
	public CheckingAccount()
	{
		super(); // call constructor of BankAccount
	}
	
	/*
    Constructs a Checking account with a given balance    
   */
	 public CheckingAccount(double initialBalance, String name)
	 {   
	      super(initialBalance, name);
	 }
	 
	 /*
	  * Return the annual interest rate
	  */
	 public double getAnnualInterest()
	 {
		 return balance * montlyInterestRate;
	 }	 
}
