package day23_Loops06;
import java.util.Scanner;
public class AreaCode {
	
	public static void main(String[] args) {
		
		/*1. 

		Program AreaCode to accepts phone number in one of two formats: (202)3334444 or 2023334444.

		Extract area code using substring and 
		use switch case to find out what state it is and assign city name to state variable.
		(no loop needed).Print state name.

		ZipCode				State
		202					Washington DC
		703					Virginia
		209					California
		312					Illinois
		347					New York
		Others	Not in database*/
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your phone number: ");
		
		String phoneNumber = scan.next();
		
		String areaCode = ""; 
		//(202)3334444 or 2023334444 
		if (phoneNumber.startsWith("(")) {
			
			areaCode = phoneNumber.substring(1, 4); 
		}else {
			
			areaCode = phoneNumber.substring(0, 3);
		}
		
			System.out.println(areaCode);
			String state;
			switch (areaCode) {
			
			case "202": 
				state = "Washington DC"; 
				break; 
			case "703":
				state = "Virginia"; 
				break; 
			case "209":
				state = "California"; 
				break;
			case "312":
				state = "Illinois"; 
				break;
			case "347":
				state = "New York"; 
				break;
			default: 
				state = "The state doesn't exist";
			}	 

				System.out.println(state);
		
		
	
	scan.close();
	}

}
