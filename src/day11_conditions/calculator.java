package day11_conditions;

public class calculator {
	public static void main(String[] args) {
		
		double num1, num2, result; 
		
		char operator; 
		
		num1 = 5; 
		num2 = 3; 
		operator = '+'; 
		
		switch (operator){
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
		case '%': 
			result = num1 % num2; 
			break; 
			
		default: 
			System.out.println("We don't have such an operator in our calculator");
			return; //don't run the rest of code below. 
					//get out of the main method right here. 
		} 
		
		System.out.println(result);	
		
	}

}
