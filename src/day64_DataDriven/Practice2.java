package day64_DataDriven;

import java.util.Arrays;

public class Practice2 {
	
	public static void main(String[] args) {
		
		String str = "fatah"; 
		String rev = ""; 
		for (int idx = str.length()-1; idx >= 0; idx--) {
			
			rev += str.charAt(idx); 
		}
		
		System.out.println(rev);
		
		
		StringBuilder stb = new StringBuilder("Ahamd"); 
		
		stb = stb.reverse(); 
		
		System.out.println(stb);
		
		
		String s = "Ahmad is a good boy"; 
		String s1 = ""; 
		
		for (int x = s.length()-1; x >= 0; x--) {
			
			s1 += s.charAt(x); 
		}
		
		System.out.print(s1 + ", ");
		
		
		int [] nums = {74, 8, 12, 25, 56}; 
		
		int max = 0; 
		int min = 0;
		int Sum = 0; 
		
		for (int idx = 0; idx < nums.length; idx++) {
//			
//			if (nums[idx] > max) {
//				max = nums[idx]; 
//			} 
			 
			if (nums[idx] < min) {
				
				nums[idx] = min; 
			}
			
			 
		}
		
		System.out.println("Min is: " + min);
	 
		
		int [] num1 = {74, 8, 12, 25, 56}; 
		int [] num2 = {3, 8, 12, 25, 63}; 
		
		int [] temp = new int [num1.length]; 
		
		for (int idx = 0; idx < num1.length; idx++) {
			
			
			temp[idx] = num1[idx] + num2[idx]; 
		}
		
		
		System.out.println(Arrays.toString(temp));
		
		
		int [] array = {1,2,67,35,65,99,22,78};
		
  
		
		for (int idx = 0; idx < array.length; idx++) {
			
			for (int j = 0; j < array.length; j++) {
				
				int sum = array[idx] + array[j]; 
				
				if (sum == 100) {
					System.out.println(array[idx] + " + " + array[j]+ " = " + sum);
				}
				 
			}
		}
		
		
		
		String t = "listen"; 
		String t1 = "silent"; 
		
		char [] c1 = t.toCharArray(); 
		char [] c2 = t1.toCharArray(); 
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		for (int idx = 0; idx < c1.length; idx++) {
		 
			if (c1[idx] != c2[idx]) {
				
				System.out.println("Not Anagaram");
				break; 
			}  
				System.out.println("Anagaram");
				break;
				
			}
				
			
		}
		
		
		
		
	}

	
	 
	
	
	
	

