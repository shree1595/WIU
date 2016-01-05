

public class SavingAccount extends BankAccount{
	 private double monthlyInterestRate = 0.0; //
		
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
		 public SavingAccount(double initialBalance)
		 {   
		      super(initialBalance);
		 }
		 
		 /*
		  * Return the monthly interest rate
		  */
		 public double getMonthlyInterest()
		 {
			 return balance * monthlyInterestRate;
		 }
		 
		 /*
		  * Overwrite toString() function
		  * 
		  */
		 public String toString()
		 {
			 return "The current balance of this Saving Account is " + balance;
		 }
		 
	
}
