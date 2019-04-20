package day59_ExceptionHandling03_AkbarClass;

public class CheckingAcount extends BankAccount {

	private int balance; 
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public CheckingAcount(long cardNum, String cardName, int balance) {
		super(cardNum, cardName);
		this.balance = balance; 
		
	}
	
	@Override
	public String toString() {
	 
		return "[ my checking acount ]"; 
	}

	@Override
	public int deposit(int num1) {
		System.out.println("Depositing in Checking account " );
		
		return 0; 
		
	}

	@Override
	public int withdra(int num2) {
		 
		System.out.println("Withdrawing from checking account");
		
		return 0; 
	}
	

}
