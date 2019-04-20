package day12_classObject_Strings;
import java.util.Scanner; 
public class GetBeverage {
	
	public static void main(String[] args) {
		
	/* tea -> $3 
	 * coffee -> $4 
	 * water -> $2 
	 * juice -> $5 
	 * 
	 * String drink; 
	 * double price
	 */
	//switch statement. Your total price is: 
		

	
//	Scanner scan = new Scanner(System.in); 
//	System.out.println("Chose your drink: ");
//	String drink = scan.next(); 
//	
//	double price = 0.0; 
//	
//	
//	
//	switch (drink) {
//	case "tea": 
//		drink = "tea"; 
//		price = 3.0;
//		break; 
//	case "coffee": 
//		drink = "coffee"; 
//		price = 4.0;  
//		break; 
//	case "water": 
//		drink = "water"; 
//		price = 2.0; 
//		break; 
//	case "juice": 
//		drink = "juice"; 
//		price = 5.0; 
//		break; 
//	default: 
//		System.out.println("invalid drink choice");
//	
//	}
//	
//	 System.out.println("Your total is: $" + price);
//		
//
//	scan.close();	
//		
		
		/* tea -> $3 
		 * coffee -> $4 
		 * water -> $2 
		 * juice -> $5 
		 * 
		 * String drink; 
		 * double price
		 */
		//switch statement. Your total price is: 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your drink selection: ");
		String drink = scan.next().toLowerCase(); 
		
		double price = 0.0; 
		
		switch (drink) {
		
		case "tea": 
			drink = "tea"; 
			price = 3; 
			break; 
		case "coffee":
			drink = "coffee"; 
			price = 4; 
			break;
		case "water": 
			drink = "water"; 
			price = 2; 
			break; 
		case "juice": 
			drink = "juice"; 
			price = 4.99;
		default: 
			System.out.println("invalid drink selection");
			
		}
			System.out.println("Your drink is " + drink + " your total is: " + price + "$");
		
		
		
		scan.close(); 
		
	}

}
