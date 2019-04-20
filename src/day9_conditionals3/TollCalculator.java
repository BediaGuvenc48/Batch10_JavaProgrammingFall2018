package day9_conditionals3;
import java.util.Scanner; 
public class TollCalculator {
	
	public static void main(String[] args) {
		
		/* Task: 
		 * if you driver between 0 to 100, the toll will be 5 dollars 
		 * 
		 * 0 - 100 --> $5 
		 * 101 - 500 --> $8 if you driver between 101 to 500, the toll will be 8 dollars 
		 * 501 - 1000 --> $10 if you driver between  to 500, the toll will be 100 dollars  10 dollars 
		 * more than 1000 --> $12 if you driver more than 1000, the toll will be 12 dollars 
		 */
		
		
		
		Scanner toll = new Scanner(System.in); 
		
		System.out.println("Enter your driving millage: ");
		int mile = toll.nextInt(); 
		
		if (mile >= 0 && mile <=100) {
			System.out.println("Toll is $5");
		} else if (mile > 100 && mile <= 500) {
			System.out.println("Toll is $8");
		}else if (mile > 500 && mile <= 1000) {
			System.out.println("Toll is $10");
		} else {
			System.out.println("Toll is $12");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("------- TOLL COST CALCULATOR APPLICATION -------");
		System.out.println("Enter your number of miles: ");
		
		int miles = scan.nextInt(); 
		
	
		double tollCost = 0;  
		
		if (miles >=0 && miles <=100) {
			
			tollCost = 5; 
		}else if (miles >=101 && miles <=500) {
			tollCost = 8; 
		}else if (miles >=501 && miles <=1000) {
			tollCost = 10; 
		}else if  (miles >1000) {
			tollCost = 12; 
	}else {
		System.out.println("Can't driver negative distance"); 
	}
		
	
		if (miles >0)
		System.out.println("Your total cost is: " + tollCost + "$"); 
		
		scan.close(); 
		
}
		
	}


