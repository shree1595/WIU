
public class TestProgram {

	public static void main(String[] args) {
		
		CheckingAccount[] chk = new CheckingAccount[2];
		chk[0] = new CheckingAccount(100, "CITI Checking");
		chk[1] = new CheckingAccount(200, "Chase Checking");
		
		SavingAccount[] sav = new SavingAccount[2];
		sav[0] = new SavingAccount(500, "CITI Saving");
		sav[1] = new SavingAccount(500, "Chase Saving");
		
		
		
		Student stu = new Student("Jason", "Li", 101, "Graduate", chk, sav);
		stu.chkAcc[0].deposit(10000.0);
		stu.chkAcc[1].deposit(2002.0);
		stu.Display();
		stu.printAccounts();	
	}

}
