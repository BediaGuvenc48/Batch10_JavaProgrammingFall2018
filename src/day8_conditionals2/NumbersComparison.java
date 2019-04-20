package day8_conditionals2;

public class NumbersComparison {

	public static void main(String[] args) {
		
		
		int num1 = 100; 
		int num2 = 200; 
	
		/* 
		 * if numbers are equal then numbers are equal 
		 * if num1  is greater than num2 --- num1 is greater 
		 * if num2 is greater than num1 --- num2 is greater  
		 */
		
		if (num1 == num2) {
			System.out.println("Numbers are equal");
		}else if(num1 > num2) {
			System.out.println("num1 is greater");
		}else if (num2 > num1) {
			System.out.println("num2 is greater");
		}else {
			System.out.println("invalid operation");
		}
		
	}
}
