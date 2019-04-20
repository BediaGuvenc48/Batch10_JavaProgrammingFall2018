package Practice;

import java.util.Arrays;

public class MyTestPractice {
	
	
	public static void main(String[] args) {
		
		for (int idx = 1; idx <= 21; idx++) {
			
			System.out.print( kfib(idx) + ", ");
		}
			
//		
//		
//		for (int idx = 2; idx <= 8; idx++) {
//			
//			System.out.print(fibonochi(idx) + ", " );
//		}
//		
		System.out.println("\n");
		
		int [] nums = {5,2,67,3,77,88,44,11,677}; 
		
		int temp; 
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			
			for (int j = 0; j < nums.length-1; j++) {
				
				if (nums[j] < nums[j+1]) {
					temp = nums[j+1]; 
					nums[j+1] = nums[j]; 
					nums[j] = temp; 
				}
			}
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		int [] numbers = new int [nums.length]; 
		
		for (int idx = nums.length-1; idx >= 0; idx--) {
			
			System.out.print(nums[idx] + ", ");
			 
		}
		
		String str = "job"; 
		
		String rev = ""; 
		
		for (int idx = str.length()-1; idx >= 0; idx--) {
			
			rev += str.charAt(idx); 
		}
		
		System.out.print(rev);
		
		
		StringBuilder stb = new StringBuilder(); 
		
		stb.append(str); 
		
		stb.reverse(); 
		
		System.out.println(stb);
		
		char [] ch = str.toCharArray(); 
		
		for (int idx = ch.length-1; idx >= 0; idx--) {
			
			System.out.print(ch[idx] + "");
		}
		
		System.out.println("\n");
		
		
		
		boolean b = isAnagaram("ahmad", "Jawad"); 
		System.out.println(b);
		
		
	}
	
	public static boolean isAnagaram(String str1, String str2) {
		
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
	
	public static int kfib(int num) {
		
		if (num == 1) {
			return 0; 
		}else if (num == 2) {
			return 1; 
		}
		
		int num1 = 0; 
		int num2 = 1; 
		int fib = 0; 
		
		for (int idx = 2; idx <= num; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
		}
		
		return fib; 
	}
	
	
	public static int fibonochi(int num) {
		
		if (num == 1) {
			return 0; 
		} else if (num == 2) {
			return 1; 
		}
		
		int num1 = 0; 
		int num2 = 1; 
		int fib = 0; 
		
		for (int idx = 0; idx <= num; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
		}

		return fib; 
	}

}
