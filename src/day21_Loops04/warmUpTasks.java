package day21_Loops04;

import java.util.Scanner;

public class warmUpTasks {
	
	public static void main(String[] args) {
		
		/* 
		 * Accepts a string if it is plandrome, print "Plindrome", if not print "NotPlaindrome"
		 * Read from left to right be same, divide it and same 
		 * 
		 * Ex: 
		 * Enter word: 
		 * java 
		 * Not Palindrome 
		 * 
		 * civic 
		 * 
		 * palindrome 
		 */
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your word:");
		String word = scan.nextLine(); 
		
		
		String reve = ""; 
		
		for (int idx = word.length()-1; idx >= 0; idx--) {
			
			reve += word.charAt(idx); 
			
		}	
		
		if (reve.equals(word)) {
			System.out.println("Palindorom");
			return; 
		}else {
			System.out.println("Not Polidorom");
		}
//		
//		
//		
//		
//		
//		
//		String rev = ""; 
//		for (int idx = word.length()-1; idx >= 0; idx--) {
//			
//			rev += word.charAt(idx); 
//			
//			if (rev.equals(word)) {
//				System.out.println("Palindrome");
//		
//			} else {
//				System.out.println("Not Palindrom");
//			}
//				
//		}
//
//		
//		int count = word.length(); 
//		String reversed = ""; 
//		
//		for (int i = count-1; i >= 0; i--) {
//			
//			reversed = reversed + word.charAt(i);
//			 
//			if (reversed.equals(word)) {
//				System.out.println("The word is Palindrome");
//			}else {
//				System.out.println("Not Palindrome");
//			}
//		}	
//					
//				
		

		 
		 /* 
		 * 2. Accept a string and a character. Find out how many times that character appears in the string. 
		 * Enter word: 
		 * 
		 * java 
		 * Enter Character: 
		 * a
		 * 2 
		 */
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter your word:");
//		String word1 = scan.nextLine();
//
//		int wordcount1 = word1.length(); 
//		for (int i = wordcount1 ; i >= 0; i--) {
//			System.out.println(word1.charAt(i));
//		}
//		
	
		 /* 3. Accept a String and print only unique characters in the string 
		 * Ex: 
		 * Enter word: 
		 * java
		 * jav
		 */
		

		//3.  Accept a String and print only unique characters in the String:
			//
//					String word = "mama";
//					String unique = "";
			//
//					charAt , contains
//					substring, contains
			//
//					if(!unique.contains("m") ){
//						unique+="m";
//						unique = unique + "m";
		
		
//		String word = "mama";
//		String unique = ""; 
//		
//		if (!unique.contains("m")) {
//			unique+="m";
//			System.out.println(unique);
//		} else {
//			System.out.println(unique);
//		}
		
		
		/* 
		 * Accepts a string if it is plandrome, print "Plindrome", if not print "NotPlaindrome"
		 * Read from left to right be same, divide it and same 
		 * 
		 * Ex: 
		 * Enter word: 
		 * java 
		 * Not Palindrome 
		 * 
		 * civic 
		 * 
		 * palindrome 
		 */
		
		
//		Scanner input = new Scanner(System.in); 
//		System.out.println("Enter a word: ");
//		String word = input.next();
//		
//		String reversed = ""; 
//		
//		for (int idx = word.length() - 1; idx >= 0; idx--) {
//			
//			reversed = reversed + word.charAt(idx);
//			
//			if (reversed.equalsIgnoreCase(word)) {
//				System.out.println("The word is palindoran");
//			} else {
//				System.out.println("The word is not palindoran");
//			}
//			 
//		} 

		
	}

}
