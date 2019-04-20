package day64_DataDriven;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
		
		
		int [] nums = {5,2,3,100,102,99,55}; 
		
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
		
		
		int max = 0; 
		
		for (int i = 0; i < nums.length-1; i++) {
			
			for (int j = 0; j < nums.length-1; j++) {
				
				if (nums[j] > max) {
					max = nums[j]; 
				}
			}
		}
		
		System.out.println(max);
		
		
		for (int i = 1; i <= 8; i++) {
			
			System.out.print( Fibo(i) + ", ");
		}
		
		
		String str = "fatah"; 
		String rev = ""; 
		for (int idx = str.length()-1; idx >= 0; idx++) {
			
			rev += str.charAt(idx); 
		}
		
		System.out.println(rev);
		
		
	}
	
	public static int Fibo(int x) {
		
		if (x == 1) {
			return 0; 
		} else if (x == 2) {
			return 1; 
		}
		
		int num1 = 0; 
		int num2 = 1; 
		int fib = 0; 
		
		for (int idx = 2; idx <= x; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
		}
		
		return fib; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
