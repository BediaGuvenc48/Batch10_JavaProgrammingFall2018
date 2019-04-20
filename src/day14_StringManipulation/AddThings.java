package day14_StringManipulation;

import java.util.Scanner;

public class AddThings {

	public static void main(String[] args) {
		
		//contact -----> adds two strings together 
		
		String domain = "cybertekschool.edu"; 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter your userName: ");
		String entry = scan.nextLine(); 
		
		System.out.println("This is your new school email ");
		
		//entry.concat(domain) ===== entry + domain 
		//entry.contact(domain) ==== "A" + "B" 
		System.out.println(entry.concat(domain)); 
		// it is like System.out.println(entry + domain);
		
		System.out.println("a".concat("b").concat("c").concat("d")); // you can concat as much as you want
		
		
		scan.close();
		
	}
}
