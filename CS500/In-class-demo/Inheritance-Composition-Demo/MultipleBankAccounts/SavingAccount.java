

public class SavingAccount extends BankAccount{
	 private double annualInterestRate = 0.0; //		
		/*
		    Constructs a Checking account with 0 balance    
		 */	 
		public SavingAccount()
		{
			super();
		}
		
		/*
	    Constructs a Checking account with a given balance    
	   */
		 public SavingAccount(double initialBalance, String name)
		 {   
		      super(initialBalance, name);
		 }
		 
		 /*
		  * Return the monthly interest rate
		  */
		 public double getMonthlyInterest()
		 {
			 return balance * annualInterestRate;
		 }	
}
