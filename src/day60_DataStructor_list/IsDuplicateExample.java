package day60_DataStructor_list;

import java.util.*; 

public class IsDuplicateExample {
	
	
	// write a method that atkes an array of ints and hen check there return boolean 
	
	public static void main(String[] args) {
	
//		int [] nums = {1,2,3,5,6}; 
//		
//		System.out.println(isDuplicate(nums)); 
//		
//		boolean res = isDuplicate(new int [] {5,3,6,10}); 
//		System.out.println(res);
//		
		
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(5); 
		numbers.add(8); 
		numbers.add(99); 
		numbers.add(5); 
		numbers.add(2);
		
		
		boolean b = isDuplic(numbers); 
		System.out.println(b);
		
		
	}
	
	
	
	public static boolean isDupli(int [] nums) {
		
		boolean b = false; 
		
		if (nums.length <= 1) {
			b = false; 
		}
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			
			for (int j = idx+1; j < nums.length-1; j++) {
				
				if (nums[idx] == nums[j]) {
					b = true; 
				}
			}
		}
		
		return b; 
		
	}
	
	public static boolean isDupArrayList(List<Integer> nums) {
		
		boolean boo = false; 
		
		if (nums.size() <= 1) {
			boo = false; 
		}
		
		for (int idx = 0; idx < nums.size(); idx++) {
			
			for (int j = idx+1; j < nums.size(); j++) {
			
					if (nums.get(idx) == nums.get(j)) {
						
						boo = true; 
					}
			}
		}
		
		return boo; 
	
	}

	public static boolean isDuplicate(int [] nums){
	
		if (nums.length<= 1) return false; 
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			 for (int j = idx+1; j < nums.length; j++) {
				 System.out.println(nums[idx] + " -> " + nums[j]);
				 if (nums[idx] == nums[j]) {
					 return true; 
				 }
			 }
		}	
			return false; 
    }
	
	
	public static boolean hasDuplicate(List<Integer> numList) {
		
		if (numList.size() <=1) return false; 
		
		for (int idx = 0; idx < numList.size(); idx++) {
			
			for (int j = idx+1; j < numList.size(); j++) {
				
				if (numList.get(idx) == numList.get(j) ) {
					return true; 
				}
			}
		}
		
		return false; 
	}
	
		public static boolean isDup(int [] nums) {
			
			if (nums.length <= 1) {
				return false; 
			}
			
			for (int idx = 0; idx < nums.length-1; idx++) {
				
				for (int j = idx+1; j < nums.length; j++) {
					
					if (nums[idx] == nums[j]) {
						return true; 
					}
				}
			}
			return false; 
		}
	
	
		public static boolean isDuplic(List<Integer> numbers) {
			
			if (numbers.size() <= 1) {
				return false;
			}
			
			for (int idx = 0; idx < numbers.size(); idx++) {
				for (int j = idx+1; j<numbers.size(); j++) {
					if (numbers.get(idx) == numbers.get(j)) {
						return true;
					}
				}
			}
			
			
			return false;
		}	
	
    }
