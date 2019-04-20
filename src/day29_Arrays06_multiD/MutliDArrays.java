package day29_Arrays06_multiD;

public class MutliDArrays {
	
	public static void main(String[] args) {
		
	int [][] nums = new int [2][3]; 	
	
	nums [0][0] = 10; // go to the 0 array and finds the first number 
	nums [0][1] = 20; // go to the 0 array and finds the second number  
	nums [0][2] = 30; 
	
	nums [1][0] = 40; 
 	nums [1][1] = 50; 
 	nums [1][2] = 60; 
	
 	//int [][] nums2 = {{10,20,30}, {40,50,60}, {70, 80}};//outer Array, inside that Array we have another array. 
											   //internal arrays can be different size, doesn't need to be same size. 
 	System.out.println(nums[0][0]);
 	System.out.println(nums[0][2]);
 	
 	//basic reading by passing indexes and printing the value 
 	
 	/*
 	 * reading length from 2D (2 dimension) array: 
 	 * find out how many 1D arrays are in 2D array: 
 	 * 
 	 */
 	
 		System.out.println("Number of Array: " + nums.length);
 		System.out.println("Number of values in first array: " + nums[0].length);
 		
 				  //	  [0][0]	   [0][1]     [0][2]
 		int [][] nums2 = {{10,20,30}, {40,50,60}, {70, 80}};
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		
	}

}
