package day31_Method02;

import java.util.Scanner;

public class methodsWithConditions {
	
	public static void main(String[] args) {
		
		getMax(); 
		getLargest(); 
		steps(5);
		steps(0); 
		Step(0); 
		Step(10);
		steps(-5); 	
		
		
	}
	/* 
	 * create a method getMax - that accepts 2 int numbers and prints largest one
	 * if they are equal it prints "Numbers are equal": number 
	 * if 
	 */

	
	public static void getMax() {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter 2 numbers: ");
		int number1 = scan.nextInt(); 
		int number2 = scan.nextInt(); 
		 
		
		if (number1 > number2) {
			System.out.println("Max number is : " +number1 );
		} else if (number2 > number1) {
			System.out.println("Max number is : " + number2);
		}else {
			System.out.println("Numbers are equal");
		}
		
		scan.close();
			
	}
	/*
	 * create a method getMax - that accepts an int array and prints largest number in the array 
	 * if the array is empty, print "Error: Array is empty". 
	 */
	
		public static void getLargest() {
			
			int [] arr = {10, 30, 500, 10000000, 50000}; 
			
			if (arr.length == 0) {
				System.out.println("Error: Array is empty");
				return; 
			}
			
			int getMax = 0; 
			
			for (int idx = 0; idx < arr.length; idx++) {
				
				if (arr[idx] > getMax) {
					getMax = arr[idx]; 
				}
			}
				System.out.println("The largest number is: " + getMax);
		}
	/*
	 * create a method called steps, it accepts an int parameter. 
	 * if the parameter is negative then we print "jump " that many times 
	 * -2
	 * jump 1 
	 * jump 2 
	 * 
	 * if it is 0 then we sit 
	 * 
	 * if it is positive we take steps 
	 * Step 1 
	 * Step 2 
	 */
		
		public static void Step(int num) {
			
			if (num > 0) {
				
				for (int idx = 1; idx <= num; idx++) {
					System.out.println("Step " + idx);
				}
			}
			
			if (num == 0) {
				System.out.println("SIT");
			}
			
			if (num < 0) {
				
				for (int idx = 1; idx <= num * (-1); idx++) {
					
					System.out.println("Jump " + idx);
				}
			}
		}
	

	public static void steps(int times) {
		
		if (times == 0) {
			System.out.println("we sit");
		} else if (times > 0) {
			
			for (int idx = 1; idx <= times; idx++) {
				System.out.println("Step " + idx);
			}
		} else if (times < 0) {
			
			for (int idx = 1; idx <= times * (-1); idx++) {
				
				System.out.println("Jump " + idx);
			}
		}
		
	}
	
}
