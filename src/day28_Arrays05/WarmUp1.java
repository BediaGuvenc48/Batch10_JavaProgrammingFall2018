package day28_Arrays05;

import java.util.Arrays;

public class WarmUp1 {
	
	public static void main(String[] args) {
		
		 int [] temp = {1,23,5,6,4376,7,8,4,2,5634}; 
		 
		  int x = nums1(temp); 
		  
		  System.out.println(x);
		  
		  
		  String [] names = {"khalili", "wood", "jamal"}; 
		  
		  Arrays.sort(names); 
		  System.out.println(Arrays.toString(names));
		  
		 int woodIndex = Arrays.binarySearch(names, "wood"); 
		  
		  System.out.println(woodIndex);
	
//		int [] number = {1,2,3,4,5,6,7,8}; 
//		
//		int counter = 0; 
//		int sum = 0; 
//		
//		for (int idx = 0; idx < number.length; idx++) {
//			
//			
//			if (number[idx] % 2 == 0) {
//				counter++; 
//				sum += number[idx]; 
//				
//			}
//		}
//			System.out.println("Number of even numbers: " + counter );
//			System.out.println("Sum of number are: " + sum);
	
			////////////////
			
//			
//			int [] nums = {2,1,2,3,4}; 
//			
//			int temp = 0; 
//			
//			for (int idx = 0; idx < nums.length; idx++) {
//				
//				if (nums[idx] %2 == 0) {
//					
//					temp++; 
//				}
//				
//			}
//			 
//			System.out.println(temp);
			
			
			
			/*Given a String array words, iterate through each word and print first and last 
				letter of each element in separate lines
				
				words → ["hello", "why", "by", "apple" , "note"]
				String result = ""; 
				*
				*	hello --> words.substring(0, 1)
				*/
		
		
			
//			String [] words = {"hello", "why", "by", "apple" , "note"}; 
//			
//			for (int i = 0; i < words.length; i++) {
//				
//				System.out.println(words[i].substring(0,1).concat(words[i].substring(words[i].length()-1)) ); 
//			}
			
			
			
		/*Given an array nums, calculate count of even numbers in nums and print out 
		 * to console.

		nums → [2, 1, 2, 3, 4]) → 3
		nums → [2, 2, 0, 3, 5]) → 3
		nums → [1, 3, 5, 7, 9]) → 0	
		
		
		
		int [] nums = {2, 1, 2, 3, 4}; 
		
		int count = 0; 
		
		for (int number : nums) {
			
			if (number % 2 == 0) {
				count++;
			}
		}
			System.out.println(count);*/
		
		
	
		/*Given a String array words, iterate through each word and print first and last 
		 * letter of each element in separate lines.

		Example:

		words → ["hello", "why", "by", "apple" , "note"]
		String result = ""; 
		
		for (int idx = 0; idx < words.length; idx++){
		
			result = words[idx].charAt(0)+words[idx].charAt(words[idx].length-1); 
		}
			
		print: 
		       ho
		       wy
		       by
		       ae
		       ne*/
//		
//		String[] word = {"hello", "why", "by", "apple" , "note"};
//		
//		for (int idx = 0; idx < word.length; idx++) {
//			
//			System.out.println(""+word[idx].charAt(0) + word[idx].charAt(word[idx].length()-1));
//		}
				
//		for (int idx = 0; idx < word.length; idx++) {
//			
//			System.out.println(""+word[idx].charAt(0) + word[idx].charAt(word[idx].length()-1));
//		}
//		
		/*String [] words = {"hello", "why", "by", "apple" , "note"};
		
		for (int idx = 0; idx < words.length; idx++) {
			
		System.out.println(""+words[idx].charAt(0) + words[idx].charAt(words[idx].length()-1));
		}*/
		
//		String [] words = {"hello", "why", "by", "apple" , "note"};
//		
//		for (String word1 : words) {
//			
//			System.out.println(""+ word1.charAt(0)+word1.charAt(word1.length()-1));
//		}
		
//		for (String word2 : words) {
//			
//			System.out.println(word2.substring(0, 1) + word2.substring(word2.length()-1));
//		}
//		
		
		
	/*	Given an array of ints, print true if the array contains a 5 next to a 5 
	 * anywhere in the array. If no consecutive 5s or no 5s are detected in your code 
	 * then print false.

		nums → [1, 5, 5, 1, 1] → true
		nums → [1, 8, 5, 5, 0] → true
		nums → [1, 5, 4, 1, 5] → false
		nums → [1, 4, 4, 1, 99] → false
		
		
		int [] nums = {45, 15, 52, 65, 5}; 
		
		boolean five = false; 
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			
			if (nums[idx] == 5 && nums[idx + 1] == 5) {
				
				 five = true; 
				 break;
			}
		}
			System.out.println(five);*/
		
			
		//nums[idx+1] -> if idx is 1, we are making it 2 and reading index 2 
		// nums[idx]+1 
		
		
		/*Given a String array words, iterate through each word and print first and last letter
		 *  of each element in the format below.
		 

		Example:

		words → ["hello", "why", "by", "apple" , "note"]
		print → [ho, wy, by, ae, ne]*/

		 
		 
//		String[] words = {"hello", "why", "by", "apple" , "note"}; 
//		
//		//String [] newArray = new String [words.length]; 
//		
//		for (int idx = 0; idx < words.length; idx++) {
//			
//			words[idx] = ("" + words[idx].charAt(0) + words[idx].charAt(words[idx].length()-1));
//		}
//			System.out.println(Arrays.toString(words));
//	
	}

	public static int nums1(int [] numbers) {
		
		int count = 0; 
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] % 2 == 0) {
				
				count++; 
			}
		}
		
		return count;  
	}
	
	
	
}
