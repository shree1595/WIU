

public class TestMain {

	public static void main(String[] args) {
		CheckingAccount ck1 = new CheckingAccount();
		ck1.deposit(10000.0);
		
		SavingAccount sa1 = new SavingAccount();
		sa1.deposit(2002.0);
		
		System.out.println(ck1);
		System.out.println(sa1);		
	}
}
