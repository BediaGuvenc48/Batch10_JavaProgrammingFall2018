package day8_conditionals2;
import java.util.Scanner; 
public class testb11 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a variable called age of type int. 
		 * check if value of age is 18 or more, 
		 * true -- you are eligible to vote 
		 * false -- you are not yet eligible to vote 
		 */
	
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your age below: ");
		
		int age = scan.nextInt(); 
		
		if (age >= 18) {
			
			System.out.println("You are good to vote");
		}else {
			System.out.println("You are not adult yet");
		}
		scan.close();
	}

}
