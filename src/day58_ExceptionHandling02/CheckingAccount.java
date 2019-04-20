package day58_ExceptionHandling02;

import java.io.IOException;

public class CheckingAccount extends Account {
	
@Override
public void charge(int ammount) {
		
		System.out.println("Charging from checking account:  " + ammount);
	}

   @Override
	public void deposit(int ammount) throws NullPointerException {
		 System.out.println("Checking deposit: " + ammount);
	}
   

}
