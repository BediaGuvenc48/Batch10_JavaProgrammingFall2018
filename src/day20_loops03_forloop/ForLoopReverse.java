package day20_loops03_forloop;

import java.util.Scanner;

public class ForLoopReverse {
	
	public static void main(String[] args) {
		
		/*
		 * loop and print numbers from 10 to 0 in same line seperated by space
		 */
	
//		for (int i= 10; i >= 0; i-- ) {
//			System.out.print(i + ", ");
//		}
//		
		/*
		 * take  string variable word
		 * and reverse it using for loop 
		 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a word: "); 
	String word = scan.nextLine(); 
	String reversed = ""; 
	
	for (int idx = word.length()-1; idx >=0; idx--) {
		
		reversed = reversed + word.charAt(idx); 
	}
	
		System.out.println(reversed);
	

	//using for loop - loop from lenght of word - 1 until 0. 
	// and use either charAt or substring and add that character 
	//to reversed string 
	
//	for (int i= word.length() - 1; i >= 0 ; i--) {
//		reversed = reversed + word.charAt(i); 
//	}
//		System.out.println(reversed);
//		
		scan.close();
	}

}
