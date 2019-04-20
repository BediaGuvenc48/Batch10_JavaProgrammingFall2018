import java.util.Arrays;

public class DecendingOrderLoop {
	
	public static void main(String[] args) {
		
		int [] nums = {3,5,8,1,6,2,99,2}; 
		
	int max = 0; 
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			if (nums[idx] > max) {
				max = nums[idx]; 
				
			} 
			
		}
		
		System.out.println("Max: " + max);
		
		
//		System.out.println( Arrays.toString(nums) ); 
//		
//		int temp; 
//		
//		for (int idx = 0; idx < nums.length-1; idx++) {
//
//			for (int j = 0; j < nums.length-1; j++) {
//				
//				if (nums[j] < nums[j+1]) {
//					
//					temp = nums[j+1]; 
//					nums[j+1] = nums[j];  
//					nums[j] = temp; 
//				}
//			}
//		}
//		System.out.println( Arrays.toString(nums) ); 
		
		Fibo(8); 
		
		for (int idx = 1; idx <= 8; idx++) {
			
				System.out.print( Fibo(idx) + ", ");
		}
		
	}
	
	public static int Fibo(int num) {
		
		int num1 = 0; 
		int num2 = 1; 
		int fib = 0; 
		
		if (num == 0) {
			return 0; 
		} else if (num == 1) {
			return 1; 
		}
		
		for (int idx = 1; idx < num; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
			
		}
		
		return fib; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
