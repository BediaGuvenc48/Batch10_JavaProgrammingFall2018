package day33_MethodWithReturn02;

public class StringMethod02 {
	
	public static void main(String[] args) {
		
//		int count = countTimes("khalili", "i"); 
//		System.out.println(count);
		
		int countCharacter = countTimes1("Break time is over!", "e");
		System.out.println(countCharacter);
	
	}
	
	/*
	 * Method name: countTimes 
	 * Params: 2 String 
	 * Return Type : int 
	 * counts number of occurences of first String within second string 
	 * and return that count 
	 * 
	 * Ex: 
	 * 
	 * countTimes("java", "a") ->
	 * countTimes("Break time is over!", "e") -> 3 
	 * countTimes ("google") -> 0
	 */

		public static int countTimes1(String word1, String word2) {
			
			int counter = 0; 
			
			for (int idx = 0; idx < word1.length(); idx++ ) {
				
				if (word1.substring(idx, idx+1).equals(word2)) {
				//if (word1.charAt(idx) == word2.charAt(0)) {
					
					counter++;
				}
			}
			return counter; 
		}
	
		public static int countTimes (String str1, String str2) {
		
		int counter = 0; 
		
		for (int idx = 0; idx < str1.length(); idx++) {
			
			//if (str1.charAt(idx) == str2.charAt(0)) 
			
			if (str1.substring(idx, idx+1).equals(str2)) {
				counter++; 
			}
		}	
				return counter;
		}
			
		public static int countTimesV1 (String str1, String str2) { 
			
			int count1 = str1.length(); 
			
			str1 = str2.replace(str2, "");
			
			int count2 = str2.length(); 
			
			return count1 - count2; 
		}
		
		
		 
	}
 
