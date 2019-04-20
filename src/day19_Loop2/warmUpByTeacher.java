package day19_Loop2;

//import java.util.Scanner;

public class warmUpByTeacher {

	public static void main(String[] args) {
		
		//*	1.  Write a program that takes string word and converts first letter to uppercase and the rest to lowercase. Print it after conversion.
//		2.  Write a program to print numbers from 1 to 10.
//		in same line, separated by space
//		3.  Write a program to print numbers from 10 to 1.
//		in same line, separated by space	
		
		//Task 1: 
		
//		Scanner input = new Scanner(System.in); 
//		System.out.println("Enter a word: ");
//		String word = input.nextLine(); 
//		int countword = word.length(); 
//		
//		//subtring to take first letter of the word 
//		//method changing is very important in Java, you have to change just 1 letter 
////			System.out.println(word.substring(0,1).toUpperCase());
////			System.out.println(word.substring(1).toLowerCase());
//			
//			System.out.println(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
//			word = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase(); 
//			System.out.println(word);
		
		//you can change the first letter of a word to capital letter and the rest remains lowercase 
		// you just use from substring method. 
		//word = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase(); 
		 
			//2.  Write a program to print numbers from 1 to 10.	
//		
//			int num = 1; 
//			
//			while (num <=10) {
//				
//				System.out.print(num + " ");
//				num++; 
//			}
//				System.out.println("the value is: " + num);
				// the answer is 11, because we assigned the num 
				// outside the loop, whatever changes we bring it will effect the num value. 
				// even the while loop is false, the num value will be printed out. in this case 1 will print if while is false.
//			3.  Write a program to print numbers from 10 to 1.
//			in same line, separated by space	
			
//			int num1 = 10; 
//			
//			while (num1 > 0) {
//				System.out.print(num1 + " ");
//				
//				num1--; 
//			}
//			
			
				/*1.  Write a program that takes string word and converts first
				 *    letter to uppercase and the rest to lowercase.
				 *    Print it after conversion.
				 */
//				Scanner input = new Scanner(System.in);
//				System.out.println("Type a word to convert:");
//				String word = input.next();
//				//substring to take first letter of the word
//			   //System.out.println( word.substring(0, 1).toUpperCase() );
//			   //System.out.println( word.substring(1).toLowerCase());
//				word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
//				System.out.println(word);
//				
				/*
				 * 2. Write a program to print numbers from 1 to 10.
					   in same line, separated by space
				 */
//				 int num = 1;
//				 
//				 while(num <= 10) {
//					 System.out.print(num + " ");   //print num with space
//					 num++;  //add one to num
//				 }
//				 
//				 System.out.println("Num value:" + num);
	
				
//				3.  Write a program to print numbers from 10 to 1.
//				in same line, separated by space	
				
		int number = 10; 
		
		while (number >= 1) {
			System.out.print(number + " ");
			number--; 
		}
			System.out.println("The number value is: " + number); 
			//we have to look at the boolean situation in while loop case, it will tell us when it will become 
			//false, whenever it is false then it is the value of number. 
				
				
				
	}
	
}
