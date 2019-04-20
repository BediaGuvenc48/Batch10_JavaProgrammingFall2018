package day6_operators_boolean;
import java.util.Scanner; 
public class testa6 {
	
	public static void main(String[] args) {
		
		//if you have 5009 pennies, count how many?
		// dollars, quarters, dimes, nickles, cents you have
		
		//int pennies = 5099; 
		//int dollar = pennies / 100; 
		//int quarter = pennies / 25; 
		//int dimes = pennies / 10; 
		//int nickels = pennies / 5; 
		//int cents = pennies / 1; 
		
		//System.out.println("Dollars: " + dollar);
		//System.out.println("Quarter: " + quarter);
		//System.out.println("Dimes: " + dimes);
		//System.out.println("Nickels: " + nickels);
		//System.out.println("Cents: " + cents);
		
		Scanner money = new Scanner(System.in); 
		
		System.out.println("Enter your pennies ammount: ");
		int pennies = money.nextInt();
		
		int dollars, quarters, dimes, nickels, cents; 
		

		dollars = pennies / 100; 
		pennies %= 100; 
		
		quarters = pennies/25; 
		
		pennies %= 25; 
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		
		dimes = pennies/10; 
		nickels = pennies/5; 
		pennies %= 5; 
		
		cents = pennies; 
		
		System.out.println("Dimes: " + dimes);
		System.out.println(" Nickels: " + nickels);
		System.out.println("Remaining Cents: " + cents);
		
		
		
		  
		
		money.close(); 
		
		
	}

}
