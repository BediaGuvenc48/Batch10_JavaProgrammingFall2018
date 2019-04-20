package day59_ExceptionHandling03_AkbarClass;

public class SavingAccount extends BankAccount {

	
	/*
	
	SavingAccount : 
	 		private instance fields : 
	 			balance : int
	 			penaltyPercentage : double 
	 		a constructor to set all fields value 
	 		getters and setters 

	 		implements the abstract methods 
	 			 if you withdraw from saving account 10% 
	 			 penalty 
	 		override toString method you impelemted
	 */
	
	private int balance; 
	private double penaltyPercentage; 
	


	
	public SavingAccount(long cardNum, String cardName, int balance, double penaltyPercentage ) {
		super(cardNum, cardName);
		this.balance = balance; 
		this.penaltyPercentage = penaltyPercentage; 
	 
	}

	@Override
	public int deposit(int number1) {
		
		return number1; 
	}

	@Override
	public int withdra(int number2) {
		
		return number2; 
		 
	}

}
