package day9_conditionals3;
import java.util.Scanner; 
public class CreditScoreTeacherExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your credit score: ");
		int credit = scan.nextInt(); 
		int creditScore = 800; 
		String status = "Unknown"; 
		int percentage = 0; 
		
		if (creditScore <0 || creditScore > 850) {
			status = "Invalid Credit Score. Can not be negative or more than 850"; 
		
		}else if (creditScore >=1 && creditScore <=299) {
			
			status = "Bad Credit"; 
			
		} else if (creditScore == 0) {
			status = "No creditStatus"; 
		}else if (creditScore >=300 && creditScore <= 579) {
			
			status = "Very Poor Credit";
			percentage = 16; 
			
		} else if (creditScore >=580 && creditScore <= 669) {
			
			status = "Fair Credit"; 
			percentage = 18; 
		}else if (creditScore >=670 && creditScore <= 739) {
			
			status = "Good credit"; 
			percentage = 21; 
		
		}else if (creditScore >=740 && creditScore <= 799) {
			
			status = "Ver good credit"; 
			percentage = 25; 
			
		}else if (creditScore >=800 && creditScore <= 850) {
			
			status = "Good credit"; 
			percentage = 20; 
		} else {
			System.out.println("invalid credite range");
		}
		
		System.out.println(status); 
		System.out.println("Percentage in USA: " + percentage); 
		System.out.println(credit);
		scan.close();
		
	}

}
