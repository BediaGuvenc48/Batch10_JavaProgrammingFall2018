package day13_stringmanipulation;
import java.util.Scanner; 
public class stringmunipulation {

	public static void main(String[] args) {

		//Write a program CheckWords:
		//Program accepts 3 words and :
		//- if they are same length:
		//print "All words are same length"
		//- if some same length and others not:
		//print "Not Same nor Different lengths"
		//- if all different length 
		//print "All different length"
		
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Enter 3 words: "); 
		
		String first = scan.nextLine(); 
		String second = scan.nextLine(); 
		String third = scan.nextLine(); 
		
		if (first.length() == second.length() && second.length() == third.length()) {
			System.out.println("All same lenght !!!!");
		} else if (first.length() == second.length() || second.length() == third.length() || first.length() == third.length()) {
			System.out.println("Not Same nor Different lengths");
		} else {
			System.out.println("All different lenght");
		}
		

//
//		Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Enter 3 words");
//		
//		String word1 = scan.next(); 
//		String word2 = scan.next(); 
//		String word3 = scan.next(); 
//		
//		if (word1.length() == word2.length() && word2.length() == word3.length()) {
//			System.out.println("All words are same lenght");
//		}else if (word1.length() == word2.length()
//				|| word1.length() == word3.length()
//				|| word2.length() == word3.length()) {
//			
//			System.out.println("Not Some nor Different lenght");
//		}else {
//			System.out.println("All different lenght");
//		}
				
		//Write a program CheckWords:
		//Program accepts 3 words and :
		//- if they are same length:
		//print "All words are same length"
		//- if some same length and others not:
		//print "Not Same nor Different lengths"
		//- if all different length 
		//print "All different length"
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter 3 words");
//		
//		String word1 = scan.next(); 
//		String word2 = scan.next(); 
//		String word3 = scan.next(); 
//		
//		int wordcount1 = word1.length(); 
//		int wordcount2 = word2.length(); 
//		int wordcount3 = word3.length(); 
//		
//		if (wordcount1 == wordcount2 && wordcount1 == wordcount3) {
//			System.out.println("All words are same length");
//		} else if ((wordcount1 == wordcount2 && wordcount1 != wordcount3)) {
//			System.out.println("Not Same nor Different lengths");
//		} else if (!(wordcount1 == wordcount2 && wordcount1 == wordcount3)) {
//			System.out.println("All different length");
//		}
		
		scan.close(); 
		
		
		
		
	}
	
	
	
	
}
