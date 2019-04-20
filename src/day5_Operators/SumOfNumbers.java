package day5_Operators;
import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main (String [] args) {
		
	/*
	 * Write a program that asks user to enter 3 numbers from keyboard
	 * and calculate the sum of those numbers then show result 
	 */
		
	//Create a scanner 
		
	Scanner scan = new Scanner(System.in); 
	
	//ask user enter 3 nums
	System.out.println("Enter 3 numbers");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt(); 
	int num3 = scan.nextInt(); 
	
	int sum = num1 + num2 + num3; 
	
	System.out.println("Sum is  " + sum); 
	
	
	scan.close();	
		
		
	}

}
