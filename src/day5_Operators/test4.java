package day5_Operators;
import java.util.Scanner;
public class test4 {
	
	public static void main(String [] args){
		
		/*
		 * write a program that users can enter 5 numbers and calculate the multiplication and the result 
		 */
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter your numbers");
		
		int x1 = scan.nextInt(); 
		int x2 = scan.nextInt();
		int x3 = scan.nextInt(); 
		int x4 = scan.nextInt(); 
		int x5 = scan.nextInt(); 
		
		
		
		int mul = x1 * x2 * x3 * x4 * x5;
		
		
		System.out.println("Your multiplication result is: " + mul);
		
		scan.close();
		
	}

}
