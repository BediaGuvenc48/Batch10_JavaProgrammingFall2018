package day6_operators_boolean;
import java.util.Scanner; 
public class testa1 {
	
	public static void main (String [] args) {
		
		/*
		 * create a program that accepts value 
		 * in miles and converts to kilometers 
		 */
		
		Scanner testa1 = new Scanner(System.in); 
		
		System.out.println("Enter miles now: "); 
		
		double mile = testa1.nextDouble(); 
		
		double  km = 1.609 * mile; 
		
		
		System.out.println("KM Value is: " + km); 
		
		
		testa1.close();
	}

}
