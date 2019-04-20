package day58_ExceptionHandling02;

import java.io.*;

public class Account {
	
	
	public void charge(int ammount) throws IOException {
		
		System.out.println("Charging " + ammount);
	}

	
	public void deposit(int ammount) throws NullPointerException{
		System.out.println("Depositing " + ammount);
	}
	
	
	public void withdraw() {
		
		System.out.println("Withdrawal");
	}
}
