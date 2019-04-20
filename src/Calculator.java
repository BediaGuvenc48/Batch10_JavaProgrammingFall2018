
public class Calculator {
	
	public static void main(String[] args) {
		
		double result = calculator(999.99, 81.3, '/'); 
		System.out.println(result);
	}

	public static double calculator(double num1, double num2, char operator) {
		
		double result = 0; 
		
		switch(operator) {
		
		case '+': 
			result = num1 + num2; 
			break; 
		case '-': 
			result = num1 - num2; 
			break; 
		case '*': 
			result = num1 * num2; 
			break; 
		case '/': 
			result = num1 / num2; 
			break; 
			default: 
				System.out.println("The number is not valid"); 	
		}
			
		return result; 
	}

}
