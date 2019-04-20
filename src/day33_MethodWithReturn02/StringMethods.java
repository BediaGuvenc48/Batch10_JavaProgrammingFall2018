package day33_MethodWithReturn02;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String word = reverse("java computer");
		System.out.println(word);
		
		boolean b = isPalindrome("java");
		System.out.println(b);
	
		
		boolean word1 = isPalindromeV2("ahmad");
		System.out.println(word1);
		
		String ahmad = word("Ahmadullah");
		System.out.println(ahmad);
		
		boolean paral = isPal("civ");
		System.out.println(paral);
		
	}
	
	/*
	 * Method: reverse 
	 * Params: 1 String 
	 * Return type: String 
	 * it reverses the param string and returns the result 
	 */
	
		public static String word(String word1) {
			
			String rev = ""; 
			
			for (int idx = word1.length()-1; idx >= 0; idx--) {
				
				rev += word1.substring(idx, idx+1);
				
				//rev += word1.charAt(idx);
			}
				return rev;
		}


		public static String reverse(String str) {
			
			String result = ""; 
			
			for (int idx = str.length()-1; idx >= 0; idx--) {
				
				//result = result + str.charAt(idx); 
				result = result + str.substring(idx, idx+1);
			
			}
			
			return result;
		}
		
		/*
		 * Method: isPalindrome 
		 * Params : 1. String 
		 * Return type: boolean 
		 * 
		 * if parameter String is Palindrome returns true, otherwise false 
		 * 
		 * isPalindrome ("civic") -> true 
		 * isPalindrome ("cyberteck") -> false 
		 */
		
		
		
		public static boolean isPal(String name) {
			
			String rev = ""; 
			
			for (int idx = name.length()-1; idx >= 0; idx--) {
				
				rev += name.charAt(idx); 
				
				if (rev.equals(name)) {
					return true; 
				}
			
			}
			return false;
		}
		
		
			public static boolean isPalindrome1(String str) {
				
				String para = ""; 
				
				for (int idx = str.length()-1; idx >= 0; idx--) {
					
						para += str.substring(idx, idx+1); 
				}
						if (str.equalsIgnoreCase(para)) {
							
							return true;
						}else {
							return false; 
						}
			} 
		
		public static boolean isPalindrome (String palindrome) { 
			
		
			String revWord = ""; 
			
			for (int idx = palindrome.length()-1; idx >= 0; idx--) {
				
				revWord = revWord + palindrome.charAt(idx);  
			}
			
			if (palindrome.equalsIgnoreCase(revWord)) {
				
				return true; 
				
			} else {
				
				return false; 
			}
			
		}
		
		public static boolean isPalindromeV2(String word) {
			
			//return reverse(word).equalsIgnoreCase(word); 
			
			if (reverse(word).equalsIgnoreCase(word)) {
				
				return true;
				
			} else {
				
				return false;
			}	
			 
			
		}
			 
			
		
		
		
}
