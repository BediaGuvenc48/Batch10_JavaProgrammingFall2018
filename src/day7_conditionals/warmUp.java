package day7_conditionals;
import java.util.Scanner; 
public class warmUp {
	
	public static void main(String[] args) {
		
		Scanner coins = new Scanner(System.in); 
		
		System.out.println("Enter your dollar ammount");
		double usd = coins.nextDouble(); 
		
		double afg= 73 * usd;  
		
		System.out.println("Your Afghani ammount will be: " + afg);
		
		
		
		coins.close(); 
		
	}

}
