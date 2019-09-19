package week1.day1;

public class LocalBank extends SBI{
	
	
	public void savingsAccount() {
		System.out.println("10%");
	}

	public static void main(String[] args) {
		LocalBank lb=new LocalBank();
		lb.savingsAccount();

	}

}
