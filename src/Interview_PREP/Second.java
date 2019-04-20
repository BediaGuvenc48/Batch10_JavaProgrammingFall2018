package Interview_PREP;

import java.util.Arrays;

public class Second {
	
	public static void main(String[] args) {
		
	int a = 10; 
	int b = 4; 
	a = a + b; 
	b = a - b; 
	a = a - b; 
	
	System.out.println("a: " + a +  " b: " + b);
		
	
	int [] nu = {3,2,1,5,2,115,1,45}; 

	int result = getLargest(nu, 10); 
	System.out.println();
		
		
		
	String str = "aaaabbccc";
	
	int lenght = str.length(); 
	char ch = 0; 
	int count = 0; 
	int max = 0; 
	
	for (int idx = 0; idx < str.length(); idx++) {
		
		count = 0; 
		
		for (int j = 0; j < str.length(); j++) {
			
			if (str.charAt(idx) == str.charAt(j)) {
				count++; 
			} 
			
			if (count > max) {
				max = count; 
				ch = str.charAt(idx); 
			}
		}
	}
		
		System.out.println("Character is: " + ch + " and Count is: " + count );
		
		String str1 = "listen"; 
		String reverse = "silent";
		
		char [] st = str1.toCharArray(); 
		char [] rev = reverse.toCharArray(); 
		
		Arrays.sort(st);
		Arrays.sort(rev);
		
		for (int idx = 0; idx < st.length; idx++) {
			
			if (st[idx] != rev[idx]) {
				System.out.println("It is not anagaram");
				break;
			} else if (st[idx] == rev[idx]) {
				System.out.println("It is anagaram");
				break;
			}
		} 
		
		int [] numbers = {90, 60, 40, 50, 70, 30, 50}; 
		
		//ArrayCalculator(numbers); 
		
		
		int [] nums = {12,3,4,6,8,9,1,78};
		
		
		for (int num : nums) {

			if (num % 2 == 0) {
					System.out.println("Odd Number :" + num );
		    }
		
		}
		
			 
	}
	
	public static void ArrayCalculator(int [] nums) {
		
		int sum = 0; 
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				sum = nums[idx] + nums[j]; 
				
				if (sum == 100) {
					
					System.out.println(nums[idx] + " + " + nums[j] + " = " + sum);
				}
			}
		}
	
		
	}

	public static int getLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i< total; i++) {  
		for (int j = i + 1; j < total; j++) {  
		if (a[i] > a[j]) {  
		          temp = a[i];  
		          a[i] = a[j];  
		          a[j] = temp;  
		          }
		       }
		    }  
		      return a[total-1]; 
	}

	

}
