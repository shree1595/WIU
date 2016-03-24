
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
	protected String bank_name;
	protected double balance;
	 
   /**
      Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
	   bank_name = ""; 
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance     
   */
   public BankAccount(double initialBalance, String name)
   {   
	  bank_name = name;
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   public double getBalance()
   {   
      return balance;
   }  
   
   public String toString()
   {
	   return bank_name + ": " + balance;
   }   
   
}