package day19_Loop2;

import java.util.Scanner;

public class warmUpTasks {

	public static void main(String[] args) {
		
	  /*1.  Write a program that takes string word and converts first letter to 
		uppercase and the rest to lowercase. Print it after conversion.
		2.  Write a program to print numbers from 1 to 10.
		in same line, separated by space
		3.  Write a program to print numbers from 10 to 1.
		in same line, separated by space */
		
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Enter a word: ");
		
		String word = scan.nextLine(); 
		
		System.out.println(word.substring(0, 1).toUpperCase().concat(word.substring(1))); 
		
		/////////////////////
		
		int number = 1; 
		
		while (number <=10) {
			
			System.out.print(number + " ");
			number++; 
		}
		
		System.out.println();
		////////////////////////
		
		int num = 10; 
		
		while (num >= 1) {
			
			System.out.print(num + " ");
			
			num--; 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//Task 1: 
//	Scanner scan = new Scanner(System.in); 
//	System.out.println("Enter a word: ");
//	String word = scan.nextLine(); 
//	
//	
//	String result = String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1);
//		System.out.println(result);
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter a word: ");
//		String word = scan.nextLine(); 
//		
//		String result = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
//		
//		System.out.println(result);
//		
//		int number = 1; 
//		
//		while (number <=10) {
//			
//			System.out.print(number + " ");
//			
//			number++;
//		}
//		
//		int number1 = 10; 
//		
//		while (number1 > 0) {
//			
//			System.out.print(number1 + " ");
//			
//			number1--;
//		}
//		System.out.println("\n=======================");
//		
////	
//	//Task 2: Write a program to print numbers from 1 to 10.
//	
//		int counter = 1; 
//		
//		while (counter <= 10) {
//			
//			System.out.print(counter + ", ");
//			
//				
//			counter++; 
//		}
//		
//	
//	//3.  Write a program to print numbers from 10 to 1.
//	//	in same line, separated by space
//	
//		
//		int counter1 = 10; 
//		
//		while (counter1 > 0) {
//			
//			System.out.print(counter1 + ", ");
//			
//			
//			counter1--; 
//		}
//		
//		scan.close(); 
		
	}
	
}
