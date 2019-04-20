package day9_conditionals3;
import java.util.Scanner; 
public class testCredit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your credit score:");
		int creditScore = scan.nextInt(); 
		String CreditStatus = "Unknown"; 
		int precentage = 0; 
		
		if (creditScore >=300 && creditScore <=579) {
			
			CreditStatus = "very poor"; 
			precentage = 16; 
			
		}else if (creditScore >=580 && creditScore <=669) {
			
			CreditStatus = "Fair"; 
			precentage = 18; 
			  
		}else if (creditScore >=670 && creditScore <=739) {
			
			CreditStatus = "Good"; 
			precentage = 21; 
			
		}else if (creditScore >=740 && creditScore <=799) {
			CreditStatus = "Very Good"; 
			precentage = 25; 
			
			
		}else if (creditScore >=800 && creditScore <=850) {
			CreditStatus = "Very Good"; 
			precentage = 20; 
			
			
		}else {
			
			System.out.println("you are not enrolled");
		}
			
			System.out.println("Your credit score is: " + creditScore + " It is " + CreditStatus +" and the percentage is "  + precentage);
			
			
			
			scan.close(); 
		}
		
		
		
		
		
		
		
		
	}


