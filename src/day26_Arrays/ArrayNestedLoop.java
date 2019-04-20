package day26_Arrays;

import java.util.Arrays;
import java.util.*;

public class ArrayNestedLoop {

	public static void main(String[] args) {
		
	int [] n = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4}; 
		
		for (int idx = 0; idx < n.length; idx++) {
			
			int counter = n[idx]; 
			boolean isDuplicate = false; 
			
			for (int j = 0; j < n.length; j++) {
				
				if (n[idx] == n[j] && idx != j) {
					isDuplicate = true;
					break; 
				}
			}
				if (! isDuplicate) {
					
					System.out.println("Unique: " + counter); 
				}
		}
		
		
		List<Integer> litNum = new ArrayList<>(); 
		
		for (int idx = 0; idx < n.length; idx++) {
			
			for (int j = 0; j < n.length; j++) {
				
				if (n[idx] == n[j] && idx != j) {
					continue; 
				}
				else if (n[idx] != j && ! litNum.contains(n[idx])) {
					litNum.add(n[idx]); 
				}
			}
		}
		
		System.out.println(litNum);
		
		
		
		
		
		/*Given an array of ints nums

		[1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4]

		Using a nested loop print only values that appear once(true meaning of unique):

		1 44 12 20 33 

		Do not use any strings!*/	
		
//		int [] arrNum = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4}; 
//		
//		Arrays.sort(arrNum); 
//		
//		
//		int [] temp = new int [arrNum.length]; 
//		
//		for (int idx = 0; idx < arrNum.length-1; idx++) {
//			
//			if (arrNum[idx] != arrNum[idx+1]) {
//				
//				temp[idx] = arrNum[idx]; 
//			}	
//		}
//		
//		Arrays.sort(temp);
//		
//		for (int j = 0; j < temp.length; j++) {
//			if (temp[j] > 0) {
//				System.out.print(arrNum[j] + " ");
//			}
//		}
	
		/*Solution: 
		 * 
		 * take a number from array 
		 * compare with the rest of numbers in the array. if no matches found 
		 * it is unique and print it out 
		 * take a number from array 
		 * create a variable counter and assign 0 to it. int counter = 0; 
		 * compare the number with all other numbers(don't compare the numbers with itself).
		 * if a match found counter++, if not don't touch counter 
		 * check if counter is still 0, if yes, print that number because it is unique
		 */
		
//
		int [] nums =  {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
//		
//		for (int idx = 0; idx < nums.length; idx++) {
//				int count = nums[idx]; 
//				boolean isDup = false; 
//			
//			for (int j = 0; j < nums.length; j++) {
//				
//				if (nums[idx] == nums[j] && idx != j) {
//					isDup = true; 
//					break; 
//				}
//			}
//				if (isDup == false) {
//					System.out.println("Unique numbers are: " + count);
//				} 
//					
//				
//		}
	
		for (int idx = 0; idx < nums.length; idx++) {
			
			int counter =  nums[idx]; 
			
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[idx] == nums[j] && idx != j) {
				
					break;
				}
			}
				if (true) {
					//System.out.println("Unique numbers are: " + counter);
				}
		}
		
		
//		for (int idx = 0; idx < nums.length; idx++) {
//			
//			boolean duplicate = false; 
//			int curNum = nums[idx]; 
//			
//			for (int j = 0; j < nums.length; j++) {
//				
//				if (nums[idx] == nums[j] && idx !=j) {
//					duplicate = true; 
//					break; 
//				}
//				
//			}
//				if (duplicate == false) {
//					System.out.println("unique numbers: " + curNum);
//				}  		
//		}


		
//		
//		for (int outer = 0; outer < nums.length; outer++) {
//			
//			int currNum = nums[outer]; 
//			boolean duplicate = false; 
//			
//			for (int inner = 0; inner < nums.length; inner++) {
//				
//				if (nums[outer] == nums[inner] && outer != inner) {
//					duplicate = true; 
//					break; 
//				}
//			}
//				if (duplicate == false) {
//					System.out.println("UniQue Num: " + currNum);
//				}
//		}
//		
//		//int [] nums = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4}; 
//		
//		
//		for (int outer = 0; outer <nums.length; outer++) {
//			int currentNum = nums[outer]; 
//			boolean duplicate = false; 
//			
//			
//			for (int inner = 0; inner < nums.length; inner++) {
//				
//				if (nums[outer] == nums[inner] && outer != inner) {
//					duplicate = true;
//					break; 
//					
//				}
//			}
//			
//				if (duplicate == false) {
//					System.out.println("unique " + currentNum);
//				}
//			
//		}
//		 
//		//int [] nums = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
//		
//		for (int outer = 0; outer < nums.length; outer++) {
//			int currentNum = nums[outer]; 
//			boolean duplicate = false; 
//			
//			
//			for (int inner = 0; inner < nums.length; inner++) {
//				
//				if (nums[outer] == nums[inner] && outer != inner ) {
//					
//					duplicate = true; 
//					break;
//				}
//			}
//			
//			if (duplicate == false) {
//				System.out.println("unique " + currentNum);
//			}
//		}
		
		for (int idx = 0; idx < n.length; idx++) {
			
			int count = n[idx]; 
			boolean isDuplicate = false; 
			for (int j = 0; j < n.length; j++) {
				if (n[idx] == n[j] && idx != j) {
					isDuplicate = true; 
				}
			}
				if (!isDuplicate) {
					System.out.println("Unique: " + count);
				}
		}

		fibonochi(8); 
		
		for (int idx = 2; idx <= 8; idx++) {
			System.out.print( fibonochi(idx) + " ");
		}
		
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
		
		for (int idx = 2; idx <= num; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
		}
		return fib; 
	}

}
