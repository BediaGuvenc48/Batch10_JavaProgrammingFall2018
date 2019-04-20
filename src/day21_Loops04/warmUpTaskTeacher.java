package day21_Loops04;

import java.util.Scanner;

public class warmUpTaskTeacher {
	
	public static void main(String[] args) {
		
		
		
		/* 
		 * Accepts a string if it is plandrome, print "Plindrome", if not print "NotPlaindrome"
		 * Read from left to right be same, divide it and same 
		 * 
		 * Step 1: Reverse the string: java --> avaj 
		 * Step 2: Compare reverse version with original 
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
		
		
	
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter a word");
//		String word = scan.nextLine(); 
//		
//		String revers = ""; 
//		
//		for (int idx = word.length()-1; idx >= 0; idx-- ) {
//			
//			revers += word.charAt(idx);
//			
//		}
//		
//		if (word.equalsIgnoreCase(revers)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not Palindrome");
//		}
		
		
		
		
	/*	String word = "level"; 
		
		String reversed = ""; 
		
		for (int idx = word.length()-1; idx >= 0; idx--) {

			
			reversed += word.charAt(idx); 
		}
		
		if (reversed.equals(word)) {
			
			System.out.println("palenderom");
		} else {
			
			System.out.println("not palenderom");
		}*/
		
		
//		String word = "Level";
//		String reversed = ""; 
//		
//		for (int idx = word.length() - 1; idx >= 0; idx--) {
//			
//			reversed += word.charAt(idx);
//			//System.out.println(word.charAt(idx));
//			
//		}
//			System.out.println(reversed);
//			System.out.println(word);
//			
//			if (word.equalsIgnoreCase(reversed)) {
//				System.out.println("Palindoran");
//			}else {
//				System.out.println("Not palindoran");
//			}
		
			
//		String word = "avaj"; 
//		String reversed = ""; 
//		
//		for (int idx = word.length() - 1; idx >= 0; idx--) {
//			
//			reversed += word.charAt(idx);
//			//System.out.println(word.charAt(idx));
//		}
//			System.out.println(reversed);
//			System.out.println(word);
//		
//			if (word.equalsIgnoreCase(reversed)) {
//				System.out.println("Palindrome");
//			} else {
//				System.out.println("Not Palindrome");
//			}
//		

		 
		 /* 
		 * 2. Accept a string and a character. Find out how many times that character 
		 * appears in the string. 
		 * Enter word: 
		 * 
		 * java 
		 * Enter Character: 
		 * a
		 * 2 
		 */
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter a word");
//		String word = scan.nextLine(); 
//		System.out.println("Enter a character");
//		char ch = scan.next().charAt(0); 
//		
//		int counter = 0; 
//		
//		for (int idx = 0; idx < word.length(); idx++) {
//			
//			if (word.charAt(idx) == ch) {
//			
//				counter++; 
//			}
//		}
//		
//		System.out.println(counter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter a word: ");
		String word = scan.nextLine(); 
		
		System.out.println("Enter Character");
		char ch = scan.next().charAt(0); 
		
		int counter = 0; 

		for (int idx = 0; idx < word.length(); idx++) {
			
			if (ch == word.charAt(idx)) {
				
				counter++; 
			}
		}
			System.out.println(counter);*/
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a word");
//		String word = scan.nextLine(); 
//		System.out.println("Enter a character");
//		char ch = scan.next().charAt(0);
//		
//		int counter = 0;
//		for (int idx = 0; idx < word.length(); idx++) {
//			
//			System.out.println(word.charAt(idx));
//			
//			if (word.charAt(idx) == ch) {
//				System.out.println("Letter found _" + idx);
//				counter++;	
//			}
//		}
//				System.out.println(counter);
		
//		String word = "cybertekschool";
//		
//		char ch = 'm'; 
//		int counter = 0; 
//		
//		for (int idx = 0; idx < word.length() - 1; idx++) {
//				
//			System.out.println(word.charAt(idx));
//			
//			if (word.charAt(idx)== ch) {
//				
//				System.out.println("letter found - ");
//				counter++;
//			} 
//		}
		
		
//		
//			String word1 = "cybertekschool"; 
//			char ch = 'c';
//			int counter = 0; 
//			
//			for (int i=0; i <word1.length(); i++) {
//				//System.out.println(word1.charAt(i));
//				
//				if (word1.charAt(i) == ch) {
//					//System.out.println("found c");
//					counter++;
//				}
//				System.out.println(counter);
//					 
//			}

			/*
			 * 3. Accept a String and print only unique characters in the String:
			 * speedlimit
			 * spedlimt
			 * 
			 * aaahhhrrriiiee
			 * ahrie
			 * 
			 * "java"
			 * 
			 * "jav"
			 */
		

//			Scanner scan = new Scanner(System.in); 
//			System.out.println("Enter a word");
//			String word = scan.nextLine(); 
//			
//			String unique = ""; 
//			
//			for (int idx = 0; idx < word.length()-2; idx++) {
//				
//				if (word.charAt(idx) != word.charAt(idx+1) && word.charAt(idx+1) != word.charAt(idx+2) 
//						&& word.charAt(idx+2) != word.charAt(idx+3) && word.charAt(idx+4) != word.charAt(idx+5)
//								&& word.charAt(idx+5) != word.charAt(idx+6) && word.charAt(idx+6) != word.charAt(idx+7)) {
//					
//					unique += word.charAt(idx); 
//				}
//			}
//			
//			System.out.println(unique);
//		
		
		
		
	
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter a String: ");
		String word = scan.nextLine(); 
		
		String unique = ""; 
		
		
		for (int idx = 0; idx < word.length(); idx++) {
			
			String letter = word.substring(idx, idx+1); 
			
			if (!unique.contains(letter)) {
				
				unique += letter; 
			}	
			
		}
			System.out.println(unique);
		
	
		
//		for (int idx = 0; idx < word.length(); idx++) {
//			
//			String letter = word.substring(idx, idx+1);  
//			
//			if (!unique.contains(letter)) {
//			
//				unique += letter; 
//			}
//			
//		}
//			System.out.println(unique);
			
			
				
				
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a word");
//		String word = scan.nextLine();
		
//		String unique = ""; 
//		
//		for (int idx = 0; idx < word.length(); idx++) {
//			
//			String letter = word.substring(idx, idx+1);
//			
//			if (!unique.contains(letter)) {
//				unique = unique + letter;
//			}
//			
//		}
//			System.out.println(unique);	
//				
				
				
				
				
		
		
//		String word = "khalili";
//		String unique = ""; 
//		
//		for (int idx = 0; idx < word.length(); idx++) {
//		
//			 System.out.print(word.substring(idx, idx+1));
//		}
//		
		
		
		
		
//			String word = "khalili";
//			            // 0123 
//			String unique = "";
//			//int i = word.length()-1;
//			//System.out.println(word.substring(i,i+1));
//			
//			for(int i=0;i < word.length(); i++) {
//				//System.out.println( word.substring(i, i+1) );
//				String letter = word.substring(i, i+1);
//				if(!unique.contains(letter)) {
//					unique = unique + letter;
//				}
//			}
//			
//			System.out.println(unique);
//			
//		
//		
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scan.nextLine();
		
		String unique = ""; 
		
		
		
		for (int idx = 0; idx < word.length() - 1; idx++) {
			
			//System.out.println(idx);
			if (!unique.contains(word.substring(idx, idx+1))) {
				unique = unique + word.substring(idx, idx+1);
				
			}
		}
		
			System.out.println(unique);
		*/
		
		
	}

}
