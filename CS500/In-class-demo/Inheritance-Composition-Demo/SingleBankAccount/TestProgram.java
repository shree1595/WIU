
public class TestProgram {

	public static void main(String[] args) {
		Student stu = new Student("Hello", "Kitty");
		stu.chkAcc.deposit(10000.0);
		stu.savAcc.deposit(2002.0);
		System.out.println(stu.chkAcc);
		System.out.println(stu.savAcc);
		stu.chkAcc.balance = 0;
		System.out.println(stu.chkAcc);
	}

}
