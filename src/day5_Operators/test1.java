package day5_Operators;
import java.util.Scanner;
public class test1 {
	
	public static void main(String [] args) {
		
		
		/*
		 * Write a program that asks clients to enter 5 numbers from keyboard
		 * and calculate the multiplication of those numbers then show result 
		 */
		
		Scanner test1 = new Scanner(System.in); 
		
		System.out.println("Please Enter 5 Numbers:");
		
		int Z1 = test1.nextInt(); 
		int Z2 = test1.nextInt(); 
		int Z3 = test1.nextInt(); 
		int Z4 = test1.nextInt();
		int Z5 = test1.nextInt();
		
		int mul = Z1 * Z2 * Z3 * Z4 * Z5;
		
		System.out.println("The result will be as following");
		
		System.out.println(mul);
		
		
		test1.close(); 
	}

}
