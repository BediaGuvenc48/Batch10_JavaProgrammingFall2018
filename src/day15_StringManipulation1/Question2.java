package day15_StringManipulation1;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
//		1. Ask user to enter a word. If the word has odd number of characters and has 3 or more characters, 
		//print the character in the middle of the word.
//		Input: eight Output: g
		
		
		
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a word !!!");
		
		String word = scan.nextLine();
		
		int wordMiddle = word.length()/2; 
		
		if (word.length() % 2 == 1 && word.length() >= 3) {
			
			System.out.println(word.charAt(wordMiddle));
		} else {
			System.out.println("Error !!! The word is either even or less than 3 characters");
		}
		
		//Solution: 
		//print the character in the middle of the word 
		//entry.length() --> gives the all number of alphabets 
		//entry.length()/2 --> gives you the middle alphabet 
		//entry.lenght() - 1 --> gives you the first 
		
//		Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Please enter a word: ");
//		String entry = scan.nextLine(); 
//		
//		// check if the word has odd number of characters
//		
//		boolean isOdd = entry.length() % 2 == 1; 
//		System.out.println("isOdd: " + isOdd);
//		
//		boolean has3orMore = entry.length() >=3; 
//		
//		System.out.println("has 3 or more: " + has3orMore); 
//		
//		if (isOdd && has3orMore) {
//			//print the character in the middle of the word 	
//			
//			int length = entry.length(); 
//			System.out.println("Length: " + length);
//			int mid = length / 2; 
//			System.out.println(entry.charAt(mid));
//			
//			//in this condition the odd numbers will be only generated 
//			
//			scan.close(); 
			
	//	}
		
//		1. Ask user to enter a word. If the word has odd number of characters and has 3 or more characters, print the character in the middle of the word.
//		Input: eight Output: g
//		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("TYPE A WORD: ");
//		String word = scan.nextLine(); 
//		
//		int wordCount = word.length(); 
//		boolean has3orMore = wordCount % 2 == 1; 
//		boolean isOddNumber = wordCount >= 3; 
//		
//		int mid = wordCount / 2; 
//		if (has3orMore && isOddNumber) {
//			
//			System.out.println(word.charAt(mid));
//			
//		} else {
//			System.out.println("The word is either even or less than 2");
//		}
//		
//		
//		scan.close(); 
		
		//1. Ask user to enter a word. If the word has odd number of characters and has 3 or more characters, print the character in the middle of the word.
//		Input: eight Output: g
		
//		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("TYPE A WORD: ");
//		String word = scan.nextLine(); 
//		
//		int wordCount = word.length(); 
//		
//		int mid = wordCount / 2; 
//		
//		
//		
//		if (wordCount >= 3 && wordCount % 2 == 1) {
//	
//			System.out.println(word.charAt(mid));
//		} else {
//			
//			System.out.println("not match");
//		}
//		
//		
		
//		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("TYPE A WORD: ");
//		String word = scan.nextLine(); 
//		
//		int wordCount = word.length(); 
//		int mid = wordCount/2; 
//		
//		if (wordCount % 2 == 1 && wordCount >= 3) {
//			System.out.println(word.charAt(mid));
//		} else {
//			System.out.println("Ther number is either even or < 3");
//		}
//		
		scan.close(); 
		
	}

}
