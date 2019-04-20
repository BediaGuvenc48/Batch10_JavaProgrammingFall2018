package day33_MethodWithReturn02;

public class StringMethodsTeacherMethod {
		
		public static void main(String[] args) {
			
			String s = rev("khalili"); 
			System.out.print(s + ", ");
			
			boolean b = isPal("Level"); 
			System.out.println(b);
			
			
			
			String original = "google";
			String reversed = reverse(original);
			System.out.println(reversed);
			
			System.out.println( reverse("computer network") );
			
			boolean isPal = isPalindrome("level");
			System.out.println(isPal);
			
			String word = "java";
			
			if( isPalindrome(word) ) {
				System.out.println("Word is palindrome");
			}else {
				System.out.println("Word is not palindrome");
			}
			
			
		}

		/*
		 * Method: reverse
		 * Params: 1 String
		 * Return type: String
		 * It reverses the Param string and returns the result
		 * 
		 * reverse("water");
		 * reverse("wood");
		 */
		
		
		
		public static String rev(String str) {
			
			String revers = ""; 
			
			for (int idx = str.length()-1; idx >= 0; idx--) {
				
				revers += str.charAt(idx); 
			}
			
			return revers; 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public String erversString(String name) {
			
			String rev = ""; 
			
			for (int idx = name.length()-1; idx >= 0; idx++) {
				
				rev += name.charAt(idx); 
			}
			
			
			return rev; 
		}
		
		
		public static String Revers(String str) {
			
			String revStr = ""; 
			
			for (int idx = str.length()-1; idx >= 0; idx--) {
				
				revStr += str.charAt(idx); 
				revStr += str.substring(idx, idx+1); 
				
			}
			
			return revStr; 
		}
		
		
		public static String reverse(String original) {
			String reversed = "";
			
			for(int i=original.length()-1; i >= 0; i--) {
				//reversed += original.charAt(i);
				reversed += original.substring(i, i+1);
			}
			
			return reversed;
		}
		
		/*
		 * Method: isPalindrome
		 * Params : 1. String
		 * Return type: boolean
		 * If param String is palindrome returns true otherwise returns false
		 * 
		 * isPalindrome("civic") -> true
		 * isPalindrome("racecar") -> true
		 * isPalindrome("something") -> false
		 */
		
		
			public static boolean isPal(String str1) {
				
				String Rev = ""; 
				
				for (int idx = str1.length()-1; idx >= 0; idx--) {
					
					Rev += str1.charAt(idx); 
				}
				
					if (Rev.equalsIgnoreCase(str1)) {
						return true; 
					}
				
						return false; 
			}
			
		public static boolean isPalindrome(String str) {
			//Reverse the string str first
			String reversed = "";
			for(int i=str.length()-1; i>= 0; i--) {
				reversed+=str.charAt(i);
			}
			
			//Compare if str and reversed are same
			if(str.equalsIgnoreCase(reversed)) {
				return true;
			}
			
			return false;
			
			//return str.equalsIgnoreCase(reversed);
			
		}
		
		//VERSION 2 OF ISPALINDROME that will call reverse method
		
		public static boolean isPalindromeV2(String str) {
			//return reverse(str).equalsIgnoreCase(str);
			if(reverse(str).equalsIgnoreCase(str)) {
				return true;
			}
			
			return false;
		}

}
