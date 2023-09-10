package week3.Day2Assignments;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("Deposit method from Axis Bank Class");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();


	}

}
