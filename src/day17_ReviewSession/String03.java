package day17_ReviewSession;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
	/* 
	 * Take a String countryName and obbreviate it by taking first 2 letters 
	 * Example: countryName: Bangladesh --> BA, toUpperCase Methode will be used  	
	 */
		
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter a country name: ");
	String abbreviated = scan.nextLine(); 
	
	
	System.out.println(abbreviated.substring(0, 2).toUpperCase());  // Method chaining 
	/*
	 * Ternary Conditions using question marks and columns ? :
	 * check if abbreviation is 2 char
	 * if true --> "2 chars detected 
	 * else say "2 chars were not found 
	 */
	
	 	// there are 2 ways to do it, 1- straight put your conditions 
		// 2- you can create variables and do it through them. 
	
		System.out.println(abbreviated.length() == 2 ? "2 chars detected" : "2 chars were not detected");
		//System.out.println(abbreviated.length() == 2 ? "2 chars detected" : "2 chars were not found"); // first method
		
		String msg1 = "2 chars were detected"; 
		String msg2 = "2 chars were not found"; 
		String result = abbreviated.length() == 2 ? msg1 : msg2; 
		System.out.println(abbreviated);
		
		System.out.println(result);
		/*
		 * if 2 chars 
		 * 		if first char is U 
		 * 		say "Maybe USA"	
		 * 
		 */
	
		
		
		
		String result2 = abbreviated.length() == 2 ? abbreviated.charAt(0) == 'U' ? "Maybe USA" : "Maybe Not USA":"";
				
			String str = abbreviated.length() == 3 ? abbreviated.charAt(0) == 'A'? "It is Afghanistan" : "It is not Afghanistan for sure":""; 
				System.out.println(str);
			System.out.println(result2);
	
		scan.close(); 
		
	}
}
