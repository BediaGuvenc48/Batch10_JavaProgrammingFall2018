package Practice;

import java.util.*;

public class MyPractice {

	public static void main(String[] args) {
		
		Map<String, List<String>> m = new HashMap<>(); 
		
		 List<String> list = new ArrayList<>(); 
		 list.add("Ahmad"); 
		 list.add("jawad"); 
		 
		 m.put("Names", list); 
		 
		 System.out.println(m);
		 
		 
		 fibo(8); 
		 
		 for (int idx = 2; idx <= 8; idx++) {
			 
			 System.out.print( fibo(idx) + " ");
		 }
		 

			int [] nums = {3,1,5,2,4}; 
			
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
		 
	}
	
	public static int fibo(int num) {
		
		if (num == 1) {
			return 0; 
		} else if (num == 2) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

