package day5_Operators;
import java.util.Scanner;
public class coinsCalculator {
	
	public static void main(String [] args) {
		
		//int pennies = 250; 
		
		// please change 250 pennies to dollars, quarters, 
		// dims, nickles
		
		
//		double dollar, quarters, dims, nickles; 
//		
//		int pennies = 250; 
//		
//		dollar = pennies / 100; 
//		
//		dollar %= 100; 
//		
//		quarters = pennies / 25; 
//		
//		quarters %= 25; 
//		
//		dims = pennies / 10;
//		
//		dims %= 10; 
//		
//		nickles = pennies / 5; 
//		nickles %= 5; 
//		
//		
//		
//		
//		System.out.println(dollar); 
//		System.out.println(quarters); 
//		System.out.println(dims); 
//		System.out.println(nickles); 
//		System.out.println(pennies);
//		
	
		//int dollar = pennies/100; 
		//System.out.println(dollar);
		//pennies %= 100; 
		
		//System.out.println(pennies);

//		
//		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter count of pennies you have:");
		
		int pennies = sc.nextInt(); 
		
		int dollars, quarters, dimes, nickels, cents, remainder; 
		
		dollars = pennies / 100; 
		pennies %= 100; 
		
		remainder = pennies %= 100; 
		
		quarters = remainder / 25; 
		
		remainder = pennies %= 25; 
		
		dimes = remainder / 10; 
		
		remainder = pennies %= 10; 
		
		nickels = remainder / 5; 
		
		nickels = pennies %= 5; 
		
		remainder = pennies / pennies; 
		
		cents = pennies / 1; 
	
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes : " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Cents: " + cents);
		
		
		
		
	
		
		
		
		
		
		
	}

}
