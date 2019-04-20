package day19_Loop2;

public class doWhileLoop {

	public static void main(String[] args) {
		
	/*
	 * Introducing While Loop: The difference between While Loop and and Do-While-Loop
	 * the condition is on the top in while loop, but the statement is on the top in do While loop and 
	 * the condition is inside the loop body. 
	 * do while loop ensures that the code runs at least once before checking the condition 
	 * 
	 * do {
	 * Loop body;
	 * statement (s); 
	 * } while (loop-continue-condition); 
	 */
		
		int num = 1; 
		
		do {
			
			System.out.println("Welcome to Cybertek");
			num ++; 
			
		} while (num < 7); 
		
		
		int number = 1; 
		
		while (number <7) {
			
			System.out.println("Hello World");
			
			number++;
		}
		
		
	}
	
}
