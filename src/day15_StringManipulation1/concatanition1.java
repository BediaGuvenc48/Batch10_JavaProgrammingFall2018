package day15_StringManipulation1;
import java.util.Scanner;
public class concatanition1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String one = scanner.nextLine();
		System.out.println("Please enter another word");
		String two = scanner.nextLine();
		// first get the lenth of the first word
		
		int lenth = one.length();
		System.out.println("length: " + lenth);
		char last = one.charAt(lenth - 1); // last char of the first word
		System.out.println("last: " + last);
		char first = two.charAt(0); // first char of the second word
		System.out.println("first: " + first);
		// compare if the chars are equal
		if (last == first) {
		// print all of the first word + second word without the first letter 
		System.out.println(one + two.substring(1));
				} else {
					System.out.println(one + two);
				}
		
		
		
		
		
		scanner.close(); 
		
		
		
		
		
	}
}
