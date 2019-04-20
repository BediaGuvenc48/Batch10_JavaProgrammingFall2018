package day33_MethodWithReturn02;

public class CalculatorV2 {
	
	public static void main(String[] args) {
		
 //Return only gives you back one single value, only one like int, double, String, Array etc 
		
		System.out.println(add(20, 10)); 
		System.out.println(subtract(20,10)); 
		System.out.println(multiply(20,10)); 
		System.out.println(divide(20,2));
		
	}
	
	
	public static double calculation(double num1, double num2, char operator) {
		
		switch (operator) {
		
		case '+':
			return add(num1,num2);
		
		case '-':
			return subtract(num1, num2);
		
		case '*':
			return multiply(num1, num2); 
		
		case '/':
			return divide(num1, num2); 
		
		default:
			
			throw new RuntimeException ("Error: Invalid Operators");
		}
		
			
	}
	public static double add(double num1, double num2) {	
		double result = num1 + num2;  	
		return result; 
	}
	public static double subtract(double num1, double num2) {
		double result = num1 - num2;  
		return result; 
	}
	public static double multiply(double num1, double num2) {	
		double result = num1 * num2;  
		return result; 
	}
	public static double divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("ERROR: Cannot divide by zero");
			return 0; 	
		} else {
			double result = num1 / num2;  
			return result; 
			
		}
	}
}
