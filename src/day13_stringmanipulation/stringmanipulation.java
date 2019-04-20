package day13_stringmanipulation;
import java.util.Scanner; 
public class stringmanipulation {

public static void main(String[] args) {
	
//Write a program StartEndWords:
// you have 2 words that must be 5 characters 
//		and check if last letter of first word and first letter of
//		second word are same.
//		if either one not 5 chars length:
//		print "need to be exactly 5 chars length"
//		if last letter of 1st word and first letter of 2nd word match
//		print "Fizz"
//		if they do not match
//		print "Buzz - did not match"

	
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter 2 words: ");
	
	String first = sc.nextLine(); 
	String second = sc.nextLine(); 
	
	if (first.length() !=  5 || second.length() != 5) {
		System.out.println("Needs to be exactly 5 characters !!!");
	} else if (first.charAt(first.length()-1) == second.charAt(0)) {
		System.out.println("Fizz");
	} else if (first.charAt(first.length()-1) != second.charAt(0)) {
		System.out.println("Buzz");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String word1 = "javva"; 
//	String word2 = "apple"; 
//	
//	if (word1.length() != 5 || word2.length() != 5) {
//		System.out.println("need to be exactly 5 chars");
//		
//	} else if (word1.charAt(4) == word2.charAt(0)) {
//		System.out.println("Fizz");
//	}else {
//		System.out.println("Buzz - did not match");
//		
//	}
//	
//	//Another way of doing it 
//	
//	if (word1.length() == 5 || word2.length() == 5) {
//		if (word1.charAt(4) == word2.charAt(0)) {
//		System.out.println("Fizz");
//	}else {
//		System.out.println("Buzz - did not match");
//	}
//	}else {
//		System.out.println("need to be exactly 5 chars");
//	}
//	
//	
	
	//Write a program StartEndWords:
	// you have 2 words that must be 5 characters 
//			and check if last letter of first word and first letter of
//			second word are same.
//			if either one not 5 chars length:
//			print "need to be exactly 5 chars length"
//			if last letter of 1st word and first letter of 2nd word match
//			print "Fizz"
//			if they do not match
//			print "Buzz - did not match"
	
	
//	Scanner scan = new Scanner(System.in); 
//	System.out.println("Enter 2 words: ");
//	String worda = scan.nextLine(); 
//	String wordb = scan.nextLine(); 
//	
//
//		
//		if (!(worda.length() == 5 && wordb.length() == 5)) {
//			System.out.println("must be 5 chars");
//		} else if (worda.charAt(worda.length()-1) == wordb.charAt(0)) {
//			System.out.println("Fizz");
//		} else {
//			System.out.println("Buzz _ did not match");
//		}
//
//	
//	
//	
//	Scanner scan = new Scanner(System.in); 
//	System.out.println("Enter 2 words:");
//	String word1 = scan.nextLine(); 
//	String word2 = scan.nextLine(); 
//	
//	int wordcount1 = word1.length(); 
//	int wordcount2 = word2.length(); 
//	
//	if (wordcount1 != 5 && wordcount2 != 5) {
//		System.out.println("The words must be exactly 5 chars");
//		
//	} else if (word1.charAt(4) == word2.charAt(0)){
//			System.out.println("Fizz");
//	} else if  (word1.charAt(4) != word2.charAt(0)){
//			System.out.println("Buzz - did not match");
//	}
//	scan.close(); 
}
	
}
