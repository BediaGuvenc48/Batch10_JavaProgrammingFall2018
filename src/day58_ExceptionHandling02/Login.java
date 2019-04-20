package day58_ExceptionHandling02;

import java.util.Scanner;

public class Login {
	
	public static final String USERID = "GoogleUser"; 
	
	public static final String PASSWORD = "java123"; 
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); 
		System.out.println("Enter your UserID: ");
		String userID = scan.nextLine(); 
		
		System.out.println("Enter your Password: ");
		String password = scan.nextLine(); 
		
		
		if (! userID.equalsIgnoreCase(USERID)) {
			throw new RuntimeException("User ID not found " + userID); 
		}
		

		if (! password.equals(PASSWORD)) {
			throw new RuntimeException("Password did not found " + password);
		
	}
		
		System.out.println("Welcome " + userID); 
		

  }
}