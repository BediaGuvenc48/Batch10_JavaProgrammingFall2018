package day15_StringManipulation1;

import java.util.Scanner;

public class MiddleThree {
	
	public static void main(String[] args) {
		

//Middle three
//1. Ask user to enter a word. If the word has odd number of characters and has 5 or more characters, 
// print the middle three characters of the word.
//Input: fifteen Output: fte
// print the middle three characters of the word.
	// Example: 
	//1. cyber
	//2. batch10 
	//3. character
		
		
	Scanner input = new Scanner(System.in); 
	
	System.out.println("Enter a word: "); 
	
	String word = input.nextLine(); 
	
	int wordCount = word.length(); 
	
	int bigIndex = (wordCount - 3) / 2; 
	int endIndex = (wordCount + 3) / 2;  

	
	if (word.length() %2 == 1 && word.length() >= 5) {
		
		System.out.println(word.substring(bigIndex, endIndex));
	} else {
		System.out.println("Error !!! ");
	}
	
//		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter a word: ");
//		String word = scan.nextLine(); 
//		
//		if (word.length() % 2 == 1 && word.length() >= 5) {
//			
//			int start = (word.length() - 3) / 2; 
//			int end = (word.length() + 3) / 2; 
//			
//			System.out.println(word.substring(start, end));
//		} else {
//			System.out.println("invalid");
//		}
//		
		
//		
//		Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Please type word: ");
//		String word = scan.nextLine(); 
//		int wordCount = word.length(); 
//	 
//		
//		boolean isOdd = word.length() % 2 == 1; 
//		 
//		boolean has5orMore = word.length() >=5; 
//		
//		
//		if (has5orMore && isOdd) {
//			
//			int startIndex = (wordCount - 5) / 2; 
//			int endIndex = (wordCount + 5) / 2; 
//			
//			String substring = word.substring(startIndex, endIndex);
//					
//						System.out.println(substring);
//			
//		} else {
//			System.out.println("Invalid Selection");
//			
//	
//		} 
	 
		//1. Ask user to enter a word. If the word has odd number of characters and has 5 or more characters, print the middle three characters of the word.
		//Input: fifteen Output: fte
		// print the middle three characters of the word.
			// Example: 
			//1. cyber
			//2. batch10 
			//3. character
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter a word: ");
//		String word = scan.nextLine(); 
//		int wordCount = word.length(); 
//	
//		int start = (wordCount - 3) / 2;
//		int end = (wordCount + 3) / 2; 
//		
//		if (wordCount % 2 == 1 && wordCount >= 5) {
//			System.out.println(word.substring(start, end)); 
//		}else {
//			System.out.println("it is even number");
//		}
//		
//		scan.close(); 
	
	}

}
