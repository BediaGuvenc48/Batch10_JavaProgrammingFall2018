package day21_Loops04;

public class Neighbors1 {

	public static void main(String[] args) {
		
	/*
	 * String word and you need to check for same character side by side 
	 * if found say "baap _ " character 
	 * Example: abccddefg
	 * cc "beep _ " print "c"; 
	 * dd "beep _ "print "d"; 	
	 *
	 */
	
	String word = "aaaabbbbcccc"; 

	
	for (int idx = 0; idx < word.length()-1; idx++) {
		
		if (word.charAt(idx) == word.charAt(idx+1)) {
			
			System.out.println("beep _ " + word.charAt(idx));
		}
	}
		
		
	String word1 = "complimentbbbbcccc";
	
//	for (int i = 0; i < word1.length() - 1; i++) {
//		
//		if (word1.charAt(i) == word1.charAt(i + 1)) {
//			System.out.println("Beep _");
//		}
//		
//	}
		
		
		for (int n = 0; n < word1.length() - 1; n++) {
			
			if (word1.substring(n, n+1).equals(word1.substring(n+1, n+2))) {
				System.out.println("BeepBeep");
			}
		}

//	String word = "heello"; 
//	
//	
//	
//		for (int idx = 0; idx < word.length() - 1; idx++) {
//			
//			if (word.charAt(idx) == word.charAt(idx+1)) {
//				System.out.println("Beep - " + word.charAt(idx));
//			}
//		
//			 
//		}
//		
//			for (int idx = 0; idx < word.length() - 1; idx++) {
//				
//				if (word.substring(idx, idx+1).equals(word.substring(idx+1, idx+2))){
//					System.out.println("Beep - " + word.subSequence(idx+1, idx+2));
//				}
//			}
//		
	}
}
