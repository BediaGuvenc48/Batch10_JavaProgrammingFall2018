package day5_Operators;
import java.util.Scanner; 
public class test6 {
	
	public static void main(String [] args) {
		
		// 999 pennes, how much dollars, quarters, dims, cent 
		
		Scanner money = new Scanner(System.in); 
		
		System.out.println("please enter amount of money: ");
		
		//int coins = money.nextInt(); 
		
		System.out.println("here is the result: "); 
		
		int pennies = 999; 
		int dollar = pennies / 100; 
		int quarter = pennies / 25;
		int dims = pennies / 10; 
		int nickles = pennies / 5; 
		int cent = pennies / 1; 
		
		System.out.println("Number of dollars: " + dollar);
		System.out.println("Number of quarters: " + quarter);
		System.out.println("Number of dims: " + dims); 
		System.out.println("Number of nickles: " + nickles);
		System.out.println("Number of cents: " + cent);
		
		
		
		money.close(); 
		
		
		
	}

}
