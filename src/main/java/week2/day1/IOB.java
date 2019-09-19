package week2.day1;

public class IOB implements BankLocation{

	public static void main(String[] args) {
		IOB iob=new IOB();
		iob.savingsAccount();
		iob.currentAccount();
		iob.fixedDeposit();
	}

	public void savingsAccount() {
		System.out.println("6%");
		
	}

	public void currentAccount() {
		System.out.println("7%");
		
		
	}

	public void fixedDeposit() {
		System.out.println("8%");
		
	}

	public void location() {
		System.out.println("chennai");
		
	}

}
