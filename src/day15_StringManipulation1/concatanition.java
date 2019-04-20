package day15_StringManipulation1;
import java.util.Scanner; 
public class concatanition {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in); 	
	System.out.println("please enter a word: ");
	String word1 = scan.nextLine(); 
	System.out.println("please enter another word: ");
	String word2 = scan.nextLine(); 
	
	System.out.println(word1+word2);
	int lenth = word1.length(); 
	System.out.println("Lenght: " + lenth);
	
	char first = word2.charAt(0); 
	System.out.println("first: " + first); // first char of the second word
	char last = word1.charAt(lenth - 1); 
	System.out.println("last: " + last); // last char of the fist word
	
	// compare if the chars are equal
	if (last == first) {
	// print all of the first word + second word without the first letter 
	System.out.println(word1 + word2.substring(1));
			} else {
				System.out.println(word1 + word2);
			}
	
	
	//charAT --> gives us a letter in a certain position, if I want to cut an alphabet 
	//then I use from this method. 
	//length --> gives us the length of a string 
	//if we write system.length, then the result will be 6 which means the length is 6 alphabets
	//it always starts from 0 to count 
	//system.length ---> 6 
	//Syste.charAt(6-1) ---
	
	scan.close();
	
	String asad = "Asadullah is a great guy"; 
	System.out.println(asad);
	
	
	}
	
}
