package day7_conditionals;
import java.util.Scanner; 
public class testb1 {
	
	public static void main(String[] args) {
		
		Scanner dollars = new Scanner(System.in); 
		
		System.out.println("Enter USD Ammount: ");
		double usd = dollars.nextDouble(); 
		
		double euro = usd * 0.68; 
		usd = euro * 1.1633399;
		
		System.out.println(" Your result is: " + euro + " Euro");
		
		
		
		dollars.close(); 
		
		
	}

}
