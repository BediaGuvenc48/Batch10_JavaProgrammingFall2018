package day21_Loops04;

import java.util.Scanner;

public class FindHowManyTimes {
	
	public static void main(String[] args) {
		
		 /* 
		 * 2. Accept a string and a character. Find out how many times that character appears in the string. 
		 * Enter word: 
		 * 
		 * java 
		 * Enter Character: 
		 * a
		 * 2 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		
		String word = scan.nextLine().toLowerCase();
		
		System.out.println("Enter Character: ");
		char ch = scan.next().charAt(0); 
		
		int count = 0; 
		
		for (int idx = 0; idx < word.length()-1; idx++) {
			
			if (ch == word.charAt(idx)) {
				
				count++;
			}
		}
		
		System.out.println(count);
		
			
		/*System.out.println("enter your character: ");
		
		char ch = scan.next().toLowerCase().charAt(0); 
		
		
		int counter = 0; 
		
		for (int i = 0; i < word.length() ; i++) {
			//System.out.println(word.charAt(i));
			
			if (word.charAt(i) == ch) {
				//System.out.println("found c");
				counter++;
			}
		} 
				System.out.println(counter);*/
		
		
		
		scan.close();
	}

}
