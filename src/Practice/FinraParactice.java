package Practice;

import java.util.*;
public class FinraParactice {

	public static void main(String [] arg) {
		
		int [] nums = {3,1,3,5,3,6,7,6,2,1}; 
		
		List<Integer> listNums = removeDuplicateOfArray(nums); 
		System.out.println(listNums);
		
		boolean b = isAnagaram("car", "arc"); 
		System.out.println(b);
		
		duplicatedChar("akdfjlkdsjflksajdflkasjflksjdflksjfd");
		 
		
	}
	
	//1): remove duplicate from an Array 
	
	public static List<Integer> removeDuplicateOfArray(int [] nums){
		
		List<Integer> tempList = new ArrayList<>(); 
		
		for (int idx = 0; idx < nums.length; idx++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[idx] == nums[j] && idx != j) {
					continue; 
				}else if (nums[idx] != nums[j] && !tempList.contains( nums[idx] )) {
					tempList.add( nums[idx] ); 
				}
			}
		}
		
		return tempList; 
	
	}
	
	public static boolean isAnagaram(String str1, String str2 ) {
		
		if (str1.length() != str2.length()) {
			return false; 
		}
		
		char [] ch1 = str1.toCharArray(); 
		char [] ch2 = str2.toCharArray(); 
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int idx = 0; idx < ch1.length; idx++) {
			
			if (ch1[idx] != ch2[idx]) return false; 
		}
	
		return true; 	
	}
	
	
	//How to Print duplicate characters from a String?
	
	
	public static void duplicatedChar(String str) {
		
		String result = ""; 
		
		if (str.length() < 2) {
			System.out.println("Input should be more than 1 character");
		}
		
		for (int idx = 0; idx < str.length()-1; idx++) {
			for (int j = idx+1; j < str.length(); j++) {
				if (str.charAt(idx) == str.charAt(j)) {
					System.out.print( str.charAt(j) );
				}
			}
		}
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
