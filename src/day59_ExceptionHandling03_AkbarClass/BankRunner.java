package day59_ExceptionHandling03_AkbarClass;

import java.util.ArrayList;
import java.util.List;

public class BankRunner {
	
	public static void main(String[] args) {
		
		
		/*class with Main method : 
	        Create List of bank account 
	        create 4 different objects of Checking and Saving 
	        withdraw 100$ from all of them . */
		
		
		List<BankAccount> accounts = new ArrayList<>(); 
		
		CheckingAcount myAccount = new CheckingAcount(5757575755757L, "Khalili", 258000); 
		
		System.out.println(myAccount);
		
		BankAccount b1 = new CheckingAcount(5757575755757L, "Khalili", 258000);
		
		
		
		
		
		
		 
	}

}
