package day15_StringManipulation1;

import java.util.Scanner;

public class RandomQuestions {

	public static void main(String[] args) {
		
	
		//print vs println 
		//when we use Ssytem.out.print, 
		//next thing that I print will be in the same line 
		//when we use System.out.println, 
		//next thing that I print will be in the next line 
		
		System.out.print("one");
		System.out.println("two");
		System.out.println("three");
		System.out.println("Four");
		
		/////////////////////////////////////
		
		//next() vs nextLine() 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("please enter a value nextLine: ");
		String next = scan.nextLine(); 
		
		System.out.println(next);
		//(next) always gets the letters until the space, nextLine, gets the entire lane. 
		
		
		scan.close(); 
	}
	
}
