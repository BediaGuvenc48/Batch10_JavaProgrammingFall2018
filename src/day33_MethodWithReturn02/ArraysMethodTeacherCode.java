package day33_MethodWithReturn02;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethodTeacherCode {
	
	/*
	 * Method: getIntArray5
	 * Params/Args: nothing
	 * Return: int array
	 * 
	 * Creates an array with 5 ints and assigns random numbers,
	 * between 0 - 100 then returns that array
	 * 
	 * getIntArray5() -> [43, 23, 54, 1, 89]
	 * 
	 */
	
	
	public static int [] getInt() {
		
		Random rn = new Random(); 
		
		 int [] temp = new int [5]; 
		 
		 for (int idx = 0; idx < temp.length; idx++) {
			 
			 temp[idx] = rn.nextInt(100); 
		 }
	
		 return temp; 
	}	
	
	
	public int [] getIntArray() {
		
		
		Random rn = new Random(); 
		
		int [] temp = new int [5]; 
		
		for (int idx = 0; idx < temp.length; idx++) {
			
			temp[idx] = rn.nextInt(100);		
			
		}

		return temp;
		
	}
	

	
	public static void main(String[] args) {
		
		
	int [] numbers = getIntArr(); 
	
	System.out.println(Arrays.toString(numbers));
		
		
		
		
		
	/*	int[] nums = new int[5];
		Random rdm = new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = rdm.nextInt(101);
		}
		
		System.out.println(Arrays.toString(nums));
		
		int[] nums2 = {rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101),
					   rdm.nextInt(101)};
		
		System.out.println(Arrays.toString(nums2));
	*/
		
		//Call getIntArray5 method and use it?
		
//		int[] myNums=getIntArray5();
//		
//		System.out.println(Arrays.toString(myNums));
//		
//		System.out.println(Arrays.toString( getIntArray5() ));
		
		/*
		 * TODO: Create 2 arrays using getIntArray5 method and
		 * compare SUMS of both and print out which one is larger
		 */
//		int[] nums1 = getIntArray5();
//		int[] nums2 = getIntArray5();
//		
//		int sumOfNums1=0, sumOfNums2=0;
//		
//		for(int num : nums1) {
//			sumOfNums1 += num;
//		}
//		
//		for(int num : nums2) {
//			sumOfNums2 += num;
//		}
//		
//		if(sumOfNums1 > sumOfNums2) {
//			System.out.println("First Array Sum is larger: " + sumOfNums1);
//			System.out.println("Second Array Sum: " + sumOfNums2);
//		}else if(sumOfNums2 > sumOfNums1) {
//			System.out.println("Second Array Sum is larger: " + sumOfNums2);
//			System.out.println("First Array Sum: " + sumOfNums1);
//		}else {
//			System.out.println("Sum of both arrays are equal. First Array: " + sumOfNums1);
//			System.out.println("Second Array Sum: " + sumOfNums2);
//		}
		
		
	}
	
	public static int [] getIntArr() {
		
		int [] nums = new int [5]; 
		
		Random rn = new Random(); 
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			nums[idx] = rn.nextInt(100); 
		}
		
		return nums; 
		 
	}
	
	
	
	public static int[] getIntArray5() {
		int[] nums = new int[5];
		Random rdm = new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = rdm.nextInt(101);
		}
		
		return nums;
	}
		


}
