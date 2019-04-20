package day5_Operators;
import java.util.Scanner;
public class Test {

	public static void main(String [] args) {
		
		/*
		 * Write a program that asks user to enter 3 numbers from keyboard
		 * and calculate the sum of those numbers then show result 
		 */
		
		
		Scanner scan = new Scanner(System.in); 

		
		System.out.println("Enter first number:  ");
		int num1 = scan.nextInt(); 
		
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();   
		
		System.out.println("Enter third number: ");
		int num3 = scan.nextInt();  
		
		System.out.println("Result is: " + (num1 + num2 + num3) );
		
		
		
		
		
		
		
//		
//		
//		Scanner test = new Scanner(System.in); 
//		
//		System.out.println("Please Enter 3 Numbers");
//		
//		int x1 = test.nextInt(); 
//		int x2 = test.nextInt(); 
//		int x3 = test.nextInt(); 
//		
//		int sum = x1 + x2 + x3; 
//		
//		System.out.println("The result is " + sum);
//		
//		test.close(); 
		
		
		
		
		
	}
}
