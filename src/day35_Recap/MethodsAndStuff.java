package day35_Recap;

public class MethodsAndStuff {
	
	public static void main(String[] args) {
		
		/*
		 
		Utility: class that contains methods which do operations on same 
		thing like string or array
		 */
		
//		String str = "mathod"; 
//		
//		str = delete(str, "h"); 
//		System.out.println(str);
		
		int number = countLetter("holloweenn", "enn"); 
		System.out.println(number);
		
		
		
	}
		
		/*
		 * delete utility a given character from the given string 
		 */
		
//		public static String delete(String str1, String str2) {
//			
//			String result = str1.replace("a", "");
//			return result; 
//			
//	}
		
		/*
		 * give a String, write a method which returns 
		 * how many times a certain character appears on a String 
		 */
	
		public static int str(String n, String a) {
			
			int counter = 0; 
			
			for (int idx = 0; idx < n.length(); idx++) {
				
				if (n.substring(idx, idx+1).contains(a)) {
					
					counter++; 
				}
			}
			
			
			return counter; 
		}
	
		public static int countLetter(String word, String letter) {
			
			int counter = 0; 
			
			for (int idx = 0; idx < word.length() - letter.length()+1; idx++) {
				
				String current = word.substring(idx, idx+letter.length()); 
				
				if (current.equals(letter)) {
					counter++;
				}
			}
				return counter;
		}
		
}
