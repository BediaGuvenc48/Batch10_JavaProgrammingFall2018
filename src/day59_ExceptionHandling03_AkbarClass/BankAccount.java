package day59_ExceptionHandling03_AkbarClass;

public abstract class BankAccount {

	
	/*
	 
Create abstarct class called BankAccount 
    private instance fields 
        cardNum : long 
        cardName : String 
        
    create 2 args constructor to set the field value 
    creare getters and setters 
    override toString method of Object 
            to return something useful 
            
    abstact methods : 
        deposit -- take one int and return nothing; 
        withdraw -- take one int and return nothing 
            might throw RuntimeException  
            
Create 2 subclasses called  CheckingAccount , SavingAccount
     CheckingAccount : 
            private instance fields : 
                balance : int 
            a constructor to set all fields value 
            getters and setters 
            implements the abstract methods 
            override toString method you impelemted 
            
class with Main method : 
        Create List of bank account 
        create 4 different objects of Checking and Saving 
        withdraw 100$ from all of them .  
	 
	 */
	
	
	
	private long cardNum; 
	private String cardName;
	
	public BankAccount(long cardNum, String cardName) {
		
		this.cardNum = cardNum; 
		this.cardName = cardName; 
	}
	
	public long getCardNum() {
		return cardNum;
	}
	
	public String getCardName() {
		return cardName;
	}
 
	
	public abstract int deposit(int num1); 
	
	public abstract int withdra(int num2);  
	
	
	
	
}
