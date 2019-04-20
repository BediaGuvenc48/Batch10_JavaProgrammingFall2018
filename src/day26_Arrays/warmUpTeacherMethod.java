package day26_Arrays;

public class warmUpTeacherMethod {
	
	public static void main(String[] args) {
		
		/*1) Write a program called IncrementArrayValues:

		1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
		2. Print out all values in single line separated by space:
		1 2 3 4 5 6 7 8 9
		3. Using a Loop write some code to do the following:
		       if the value is even - double it and assign back. 
		       If the value is odd - triple it and assign back.
		4. Print out all values in single line separated by space:

		3 4 9 8 15 12 21 16 27*/	
		
		int [] arrNum = {1,2,3,4,5,6,7,8,9}; 
		
		int evenNum = 0; 
		int oddNum = 0; 
		 
		for (int idx = 0; idx < arrNum.length; idx++) {
			
			System.out.print(arrNum[idx] + " ");
			
			if (arrNum[idx] % 2 == 0) {
				arrNum[idx] = arrNum[idx] * 2; 
			} else if (arrNum[idx] % 2 ==1) {
				arrNum[idx] = arrNum[idx] * 3; 
			}
			
		}
		System.out.println("\n");
			 
		for (int arr : arrNum) {
			
			System.out.print(arr + " ");
		}
				

		
//		
//		for (int a : arrNum) {
//			System.out.print(a + " ");
//		}
//		
//		for (int idx = 0; idx < arrNum.length; idx++) {
//					
//					if (arrNum[idx] %2 == 0) {
//						arrNum[idx] = arrNum[idx] * arrNum[idx];
//						System.out.println("Even: " + arrNum[idx]);
//					}   else if (arrNum[idx] %2 ==1) {
//						arrNum[idx] = arrNum[idx] * arrNum[idx] * arrNum[idx];
//						System.out.println("Odd: " + arrNum[idx]);
//					}
//					
//				}
 
		
		
		
		
		
		
		
//		
//		int [] nums = {1,2,3,4,5,6,7,8,9}; 
//		
//		for (int num : nums) {
//			
//			System.out.print(num + " ");
//				
//			}
//		System.out.println();
//	
//		for (int idx = 0; idx <nums.length; idx++) {
//			
//			if (nums[idx] % 2 ==0) {
//				nums[idx] = nums[idx] * nums[idx]; 
//			}
//			
//			if (nums[idx] % 2 == 1) {
//				nums[idx] = nums[idx] * nums[idx] * nums[idx]; 
//			}
//			System.out.print(nums[idx] + ", ");
//		}
//			 
//		System.out.println();
		
	
//		for (int number : nums) {
//			
//			System.out.print(number + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < nums.length; i++) {
//			
//			if (nums[i] % 2 == 0) {
//				nums[i] = nums[i] * 2; 
//			}
//			
//			if (nums[i] % 2 == 1) {
//				
//				nums[i] = nums[i] * 3; 
//			}
//		}

		
//		for (int number : nums) {
//			
//			System.out.print(number + " ");
//		}
		
//		System.out.println();
//		
//		
//		for (int idx = 0; idx < nums.length; idx++) {
//			
//			if (nums[idx] % 2 == 0) {
//				nums[idx] = nums[idx] * 2; 
//	
//			}
//			
//			if (nums[idx] % 2 == 1) {
//				nums[idx] = nums[idx] * 3; 
//				
//			}
//		}
//		
//			for (int number: nums) {
//				System.out.print(number + " ");
//			}
			
		
	
//	int [] nums = {1,2,3,4,5,6,7,8,9}; 
//		
//	//for each loop - enhanced for loop (sometimes it is called enhanced for Loop as well 	
//	//for each loop starts from the begining and goes up to the end 
//		
//	for (int n: nums) {
//		System.out.print(n + " "); 
//	}
//		System.out.println();
//
//		
//	for (int i = 0; i < nums.length; i++) {
////		 
////		if (nums[i] % 2 == 0) {
////			nums[i] = nums[i] * 2; 
////		}
////		
////		if (nums[i] % 2 == 1) {
////			nums[i] = nums[i] * 3; 
////		}
//	
////	
//	   nums[i] = (nums[i] % 2 == 0)? nums[i] * 2 : nums[i] * 3;  
//	}
//		for (int n: nums) {
//			System.out.print(n + " "); 
//		}
//			System.out.println();
//		
//	
	
	
	
	}

}
