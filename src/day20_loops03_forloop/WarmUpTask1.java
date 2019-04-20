package day20_loops03_forloop;

import java.util.Scanner;

public class WarmUpTask1 {
	
	public static void main(String[] args) {
		
		 /* 
		 * 2. Write a program that accepts the String word that using while loop 
		 * and charAt print each character in seperate line
		 * 
		 * Example; 
		 * 
		 * Enter word: 
		 * pen 
		 * p 
		 * e 
		 * n
		 * 
		 */
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a word: ");
		
		String word = input.nextLine(); 
		
		int counter = 0; 
		
		while (counter < word.length()) {
		
				System.out.println( word.charAt(counter) ); 
				
			counter++; 	 
		}	
		
		
		do {
			System.out.println(word.charAt(counter));
			
			counter++; 
			
		}while (counter < word.length()); 
		
		
		for (int idx = 0; idx < word.length(); idx++) {
			
			System.out.println(word.charAt(idx));
		}
		

//		
//		Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Enter your word: ");
//		String word = scan.nextLine(); 
		
//		for (int idx = 0; idx < word.length(); idx++) {
//			
//			System.out.println(word.charAt(idx));
//		}
		
//		int idx = 0; 
//		while (idx < word.length()) {
//			
//			System.out.println(word.charAt(idx));
//			
//			idx++;
//		}
		
		
		//Scanner scan = new Scanner(System.in); 
//		System.out.println("Please enter a word: ");
//		
//		String word = scan.nextLine(); 
//		
//		int wordcount = word.length(); 
//		int i = 0; 
//		while (i < wordcount) {
//			System.out.println(word.charAt(i));
//			i++; 
//		}
//		
//		
		
//		for (int idx = 1; idx <= 10; idx++) {
//			if (idx == 10) {
//				System.out.println(idx);
//				break;
//			}
//			System.out.print(idx + " + ");
//		}
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Please enter a word: ");
//		String word = scan.nextLine();
//		int wordcount= word.length();
//		int i = 0; 
//		
//		while (i < wordcount) {
//			System.out.println(word.charAt(i));	
//			
//			i++;
//		}
//			
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Please enter a word: ");
//		String word1 = scan.nextLine(); 
//		int wordcount = word1.length(); 
//		
//		int n = 0; 
//		
//		while (n < wordcount) {
//			System.out.println(word1.charAt(n));
//			
//			n++; 
//		}
		
//		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Please enter a word: ");
//		String word1 = scan.nextLine(); 
//		 
//		int i = 0; 
//		
//		while (i < word1.length()) {
//			System.out.println(word1.substring(i, i+1)); 
//			i++;
//		}
//		
		
//		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//
//		char ch = 'y';
//		int countPositive = 0;
//		int countNegative = 0; 
//		int countZero = 0; 
//
//		do {
//			System.out.println("Enter the number");
//			int number = scan.nextInt();
//			
//			if (number == 0 ) {
//				 
//				countZero++;
//			}
//			if (number > 0) {
//				countPositive++;
//				
//			}
//			if (number < 0) {
//				countNegative++;
//			}
//
//			System.out.println("do you want to contiune y/n");
//			ch = scan.next().charAt(0);
//
//		}
//		while (ch == 'y');
//
//			System.out.println("Positive numbers:" + countPositive);
//			System.out.println("Negative numbers: " + countNegative);
//			System.out.println("Zero numbers: " + countZero);
//		
		
	Scanner scan = new Scanner(System.in);
		
int positive = 0; 
int negative = 0; 
int zero = 0; 

char ch = 'y'; 

do {
	
	System.out.println("Enter your number: ");
	int number = scan.nextInt(); 
	
	if (number == 0) {
		
		zero++;
	}
	
	if (number > 0) {
		
		positive++;
	}
	
	if (number < 0) {
		
		negative++;
	}
	
	System.out.println("Do you want to continue y/n? ");
	ch = scan.next().charAt(0);
	
} while (ch == 'y');

	System.out.println("Total of positive numbers: " + positive);
	System.out.println("Total of negative numbers: " + negative);	
	System.out.println("Total of zero numbers: " + zero);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
