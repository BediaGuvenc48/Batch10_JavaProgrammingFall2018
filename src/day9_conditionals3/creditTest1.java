package day9_conditionals3;
import java.util.Scanner; 
public class creditTest1 {
	public static void main(String[] args) {
		
		/*
		 * Credit Check: 
		 * 300 - 500, Ok Credit score and 25 % of Americans have this credit 
		 * 501 - 650, fair Credit score and 18 % of Americans have this credit  
		 * 651 - 740, Good Credit score and 20 % of Americans have this credit 
		 * 741 - 800, Very Good Credit score and 22 % of Americans have this credit 
		 * 801 - 850, Excellent Credit score and 15 % of Americans have this credit 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score: ");
		
		int creditScore = scan.nextInt(); 
		
		
		int percentage = 0; 
		String creditStatus = "unknown"; 
		
		if (creditScore >= 300 && creditScore <=500) {
			
			percentage = 25; 
			creditStatus = "Ok";
		 
		} else if (creditScore >= 501 && creditScore <= 650) {
			
			percentage = 18; 
			creditStatus = "Fair";
			 
		}else if (creditScore >= 651 && creditScore <= 740) {
			
			percentage = 20; 
			creditStatus = "Good"; 
			 
		} else if (creditScore >= 741 && creditScore <=800) {
			
			percentage = 22; 
			creditStatus = "Very Good"; 
			 
		}else if (creditScore <= 801 && creditScore >= 850) {
			
			percentage = 15; 
			creditStatus = "Excellent";
			 
		}else {
			System.out.println(" Ghost Credit");
		}
		
		
		System.out.println(creditStatus);
		System.out.println("Your credit score is: " + creditScore + " & percentage is: " + creditStatus);
		
		System.out.println(percentage);
		
		scan.close(); 
	}

}
