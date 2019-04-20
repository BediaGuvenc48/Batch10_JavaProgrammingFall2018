import java.util.Arrays;

public class ReverseInteger {
	
	public static void main(String[] args) {
		

		int co = countChar("ahmad"); 
		System.out.println(co);
		
		
		int [] nums = {4, 3, 2, 44, 1, 100, 55}; 
		int [] temp = new int [nums.length]; 
		int counter = 0; 
		
		for (int idx = nums.length-1; idx >= 0; idx--) {
			
			temp[counter] += nums[idx]; 
			counter++; 
		}
		
		 System.out.println(Arrays.toString(temp));
		 
		 
		 /*
		  Given a String variable sentence, write code to type each word in separate lines in a reverse order.
		  Example:
		  sentence -> "Java is fun"
		  Print
		  fun
		  is
		  Java

		*/

		 
		 String s = "Java is fun"; 
		 
		 String [] str = s.split(" "); 
		
		 String j = ""; 
		 
		 for (int idx = str.length-1; idx >= 0; idx--) {
			 
			j += str[idx] + " "; 
		 }
		 
		System.out.println(j);
		  
	}
	
	public static int countChar(String str) {
		
		char [] ch = str.toCharArray(); 
		
		Arrays.sort(ch);
		
		int counter = 0; 
		
		for (int idx = 0; idx < ch.length; idx++) {
			
			if (ch[idx] != 0) {
				
				counter++; 
			}
		}
		return counter; 
	}
	
	
	
	

}
