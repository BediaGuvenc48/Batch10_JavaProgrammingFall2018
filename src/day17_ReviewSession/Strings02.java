package day17_ReviewSession;

import java.util.Scanner;

public class Strings02 {
	
	public static void main(String[] args) {
		
	//Create 1 String variables
	// if first and last chars are same, print "same"; 
	// if the second from the last are same - print "second same"; 
		
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Type a word: ");
//		String word = scan.nextLine(); 
//		
//		int wordCount = word.length(); 
//		
//		
//		if (word.charAt(0) == word.charAt(word.length()-1)) {
//			System.out.println("same");
//		} else if (word.charAt(0) == word.charAt(word.length()-2)){
//			System.out.println("second same");
//		}else {
//			System.out.println("Not same at all !!!");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	Scanner scan = new Scanner(System.in); 
	System.out.println("Type a word: ");
	String word = scan.nextLine(); 
	
	int wordCount = word.length(); 
	

	if (wordCount >= 4) {
		
		
		char w1 = word.charAt(0); 
		char w2 = word.charAt(wordCount -1); 
		
		char w3 = word.charAt(1); 
		char w4 = word.charAt(wordCount -2); 
		
	if (w1 == w2 && w3 != w4) { 
		
		System.out.println("Same");
	}else if (w1 == w2 && w3 == w4) {
		System.out.println("Second Same");
	} else {
		System.out.println("the characters don't match");
	}
	}else {
		System.out.println("ERROR: at least 4 chars required");
	}
		
	
	scan.close(); 
	}

}
