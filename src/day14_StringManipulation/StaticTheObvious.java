package day14_StringManipulation;

import java.util.Scanner;

public class StaticTheObvious {

	public static void main(String[] args) {
		
		//what is your email 
		//some@gmail.com 
		//oh so you have a gmail 
		
		//donaldtheduck@gmail.com 

		//1. find the location of @ sign 
		//2. find the location of the . 
		//3. substring using those 2 locations 

		//it is getting the location of the @ sign and adding one 
		// if we don't add 1, it will include @sign in the substring 
		//we need 2 numbers in order to write the code for donaldtheduck@gmail.com 
		
//	Scanner scan = new Scanner(System.in); 
//	
//	System.out.println("Please enter your email: ");	
//
//	String entry = scan.nextLine(); 
//	
//	int start = entry.indexOf("@")+1; 
//		
//	System.out.println(start);
//	System.out.println(entry.substring(start));
//	
//	int end = entry.indexOf(".", 8); 
//	System.out.println("Oh so you have a " + entry.substring(start, end));
		
//	System.out.println("Please enter your email: ");
//	String entery = scan.nextLine(); 
//	int start1 = entry.indexOf("@");

	
//	System.out.println("Please enter your email: ");	
//	String email = scan.nextLine(); 
//	
//	int start = email.indexOf("@") + 1;
//	int end = email.indexOf(".", 8);
//	System.out.println(start);
//	System.out.println(email.substring(start));
//	System.out.println(end);
//	System.out.println("Oh so you have a " + email.substring(start, end));

		//what is your email 
		//some@gmail.com 
		//oh so you have a gmail 
		
		//donaldtheduck@gmail.com 

		//1. find the location of @ sign 
		//2. find the location of the . 
		//3. substring using those 2 locations 
		
//	Scanner input = new Scanner(System.in); 
//	System.out.println("Etner your email: ");
//	String email = input.nextLine(); 
//	
//	
//	int start = email.indexOf("@") + 1; 
//	int end = email.indexOf("."); 
//	
//	System.out.println("oh so you have " + email.subSequence(start, end));
	
	//what is your email 
	//some@gmail.com 
	//oh so you have a gmail 
	
	//donaldtheduck@gmail.com 
	
	
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("What is your email: ");
	
	String email1 = sc.nextLine(); 
			
	email1 = email1.substring(5, 10); 
	
	System.out.println("Oh you have " + email1);
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
