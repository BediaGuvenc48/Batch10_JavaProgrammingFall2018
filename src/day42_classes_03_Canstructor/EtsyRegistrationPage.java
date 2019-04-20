package day42_classes_03_Canstructor;

public class EtsyRegistrationPage {


	public static void main(String[] args) {
		
		EtsyAccount account1 = new EtsyAccount();
		
			account1.setEmail("account1@gmail.com");
			account1.setFirstName("Adam");
			account1.setPassword("adem123");
		
		System.out.println("Account1 email:" + account1.getEmail());
		
		EtsyAccount account2 = new EtsyAccount();
		
			account2.setEmail("account2@mail.com");
			account2.setFirstName("Joshua");
			account2.setPassword("josh432");
		
		EtsyAccount account3 = new EtsyAccount();
		
			account3.setEmail("account3@etsy.com");
			account3.setFirstName("_");
			account3.setPassword("123");
		
		//use getters to read data
		System.out.println("First name of account1: " + account1.getFirstName());
		
		EtsyAccount myAccount = new EtsyAccount();
		myAccount.setAccountInfo("myemail@yahoo.com", "Bill", "abc123");
		
		System.out.println(myAccount.getEmail() +" | " + myAccount.getFirstName() +" | " + myAccount.getPassword());
		
		//myAccount.setEmail("myemail@gmail.com");
		myAccount.setEmail( myAccount.getEmail().replace("yahoo", "gmail") );
		
		System.out.println(myAccount.getEmail() +" | " + myAccount.getFirstName() +" | " + myAccount.getPassword());
		
		/*
		 * create a method getAccountInfo() that returns email, first name, password values 
		 * in this format: myemail@gmail.com | Bill | abc123
		 */
		System.out.println( myAccount.getAccountInfo() );
		
		EtsyAccount yourAccount = new EtsyAccount();
		
			yourAccount.setAccountInfo("yourEmail23@gmail.com", "Apple", "moacbook34");
			
		String accountInfo = yourAccount.getAccountInfo();
		
		System.out.println(accountInfo);
		

	}
	
	
	
	

}