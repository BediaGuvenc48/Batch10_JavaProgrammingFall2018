package day7_conditionals;
import java.util.Scanner; 
public class multiBranchIfStatement {
	
	public static void main(String [] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt(); 
		
		if (number >=0 && number <=100) {
			System.out.println("Number is between 0 - 100");
		}else if (number > 100 && number <=50000) {
			System.out.println("Number is between 101 - 50000");
		}else if (number > 50000 && number <=1000000) {
			System.out.println("Number is between 50001 - 1000000");
		}else {
			
			System.out.println("Number is either - or more than 1000000"); ;
			
		}
		
		input.close(); 
		
	}

}
