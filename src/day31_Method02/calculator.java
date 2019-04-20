package day31_Method02;
import java.util.*; // it is accepting all the types of the classes from java.util
public class calculator {
	
	public static void main(String[] args) {
		
		double n1 = 10; 
		double n2 = 5; 
		
		Add(n1, n2);
		Subtract(n1, n2); 
		Multiply(n1, n2); 
		Divide(n1, n2);
		
		/*
		 * -	Calculator:
		 * Add >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
		 * Subtract >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
		 * Multiply >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
		 * Divide >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
		
		 */
		
		//Add more numbers 
		//Add scanner 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter 2 double numbers: ");
		n1 = scan.nextDouble(); 
		n2 = scan.nextDouble(); 
		
		System.out.println("Choose operations: \n" + 
		"1 - add\n" + 
		"2 - subtract\n"
		+"3 - multiply\n" 
		+"4 - divide");
		
		 int operation = scan.nextInt(); 
		 
		 switch (operation) {
		 
		 case 1: 
			 Add(n1, n2); 
			 break; 
		 case 2: 
			 Subtract(n1, n2); 
			 break; 
		 case 3: 
			 Multiply(n1, n2);
			 break; 
		 case 4: 
			 Divide(n1, n2);
			 break; 
		default: 
			System.out.println("invalid operator");
			 
		 }
		
			
		/*
		 * for add select 1 
		 * for subtract select 2
		 * for multiply select 3
		 * for divide select 4
		 * 
		 */
		
		scan.close();
	}
	
	public static void Add(double num1, double num2) {
		
		double Result = num1 + num2;  
		
		System.out.println("The result is: " + Result);
		
	}
	
	public static void Subtract(double num1, double num2) {
		
		double Result = num1 - num2;  
		System.out.println("The result is: " + Result);
	
	}
	
	public static void Multiply(double num1, double num2) {
		
		double Result = num1 * num2;  
		System.out.println("The result is: " + Result);
	
	}
	
	public static void Divide(double num1, double num2) {
		
		if (num2 == 0) {
			System.out.println("Error: The number can't be divided by 0");
		} else {
		
			double Result = num1 / num2;  
			System.out.println("The result is: " + Result);
			
		}
		
	}

}
