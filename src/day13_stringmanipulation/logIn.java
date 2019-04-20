package day13_stringmanipulation;

import java.util.Scanner;

public class logIn {
	
	public static void main(String[] args) {
//		
//		String secretUserName = "admin"; 
//		String secretPassword = "abc123"; 
//	
//	//create 2 variables, userName, password 
//	//make sure they match with secret ones and allow login successfully 
//		
////	Scanner scan = new Scanner(System.in);
////	System.out.println("Enter your User Name");
////	String usreName = scan.next(); 
////	System.out.println("Enter your password");
////	String password = scan.next(); 
////	
////	if (secretUserName == "admin") {
////		if (secretPassword == "abc123") {
////			System.out.println("Access granted, Welcome to Secrete Server");
////		}else {
////		System.out.println("Access Denied, try different passowrd");
//	//}
//	//}
//
//String userName = "ADMIN"; 
//String password = "abc123"; 
//
//	if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
//		System.out.println("Login Successful, Welcome Back");
//	}else {
////		System.out.println("ERROR: Invalid User Name or Password");
//	if (! userName.equalsIgnoreCase(secretUserName) && ! password.equals(secretPassword)) {
//		
//		System.out.println("ERROR: Both User Name and Password are not valid");
//	}else if (!userName.equalsIgnoreCase(secretUserName)){
//		System.out.println("User Name is not valid");
//	} else {
//		System.out.println("Password is not valid");
//	}
//		
//	}
		
		
		
		
		
		
//		if (userName != "ADMIN") {
//			System.out.println("User Name is not Valid");
//	
//		}else if (password != "abc123") {
//			System.out.println("Password is not valid");
//			
//			}else if (userName != "ADMIN" && password != "abc123"){
//		System.out.println("Invalid User Name & Password");
//		}
		//System.out.println("ERROR: INVALID USERNAME OR PASSWORD");
//	} 
		
		
	//create 2 variables, userName, password 
	//make sure they match with secret ones and allow login successfully 
	
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter user name: ");
	String usernName = scan.next(); 
	System.out.println("Enter your password");
	String password = scan.next(); 
	
	String secretUserName = "ahmad"; 
	String secretPasword = "ahmad448"; 
	
	if (usernName.equals(secretUserName) && password.equals(secretPasword)) {
		
		System.out.println("Welcome to the computer");
	} else {
		System.out.println("Invalid UserName or Password");
	}
	
	scan.close(); 
	
	
		
		
		
		
		
		
		
	}

}
