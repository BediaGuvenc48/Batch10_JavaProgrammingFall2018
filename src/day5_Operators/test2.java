package day5_Operators;
import java.util.Scanner; 
public class test2 {
	
	public static void main(String [] args) {
		
		/*
		 * Write a program that asks clients to enter 4 numbers from keyboard
		 * and calculate the multiplication of those numbers then show result 
		 */
		
		Scanner test2 = new Scanner(System.in);
		System.out.println("please enter 4 numbers");
		
		int y1 = test2.nextInt(); 
		int y2 = test2.nextInt(); 
		int y3 = test2.nextInt(); 
		int y4 = test2.nextInt(); 
		
		int mul = y1 * y2 * y3 * y4; 
		
		System.out.println("hey guys here is the result as below");
		
		System.out.println(mul);
		
		
		test2.close(); 
	}

}
