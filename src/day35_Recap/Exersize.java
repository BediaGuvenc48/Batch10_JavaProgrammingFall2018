package day35_Recap;

import java.util.Arrays;

public class Exersize {
	
	
	
	/*
	 * method name: addElements
	 * args: 2 int arrays
	 * return: int array
	 * Adds each element value of arg arrays and returns a new array
	 * each arg array has 5 elements
	 * 1-> 			1, 2, 3 ,4, 5
	 * 2-> 			11, 22, 33 ,44, 55
	 * 
	 * result :		12, 24, 36, 48, 60  
	 * 
	 */
	
	
	public static int [] elem(int [] n1, int [] n2) {
		
		int [] temp = new int [n1.length]; 
		
		for (int idx = 0; idx < temp.length; idx++) {
			
			temp[idx] = n1[idx] + n2[idx]; 
		}
		
		return temp;
	}
	
	public static int [] addElements(int [] array1, int [] array2){
		
		int [] result = new int [array1.length]; 
		
		for (int idx = 0; idx < array1.length; idx++ ) {
			
			result[idx] = array1[idx] + array2[idx]; 
		}
			
			return result; 
		
	  }
	
	public static void main(String[] args) {
		
		int [] nums1 = {1, 2, 3 ,4, 5}; 
		
		int [] nums2 = {11, 22, 33 ,44, 55}; 
		
		
		int [] result = addElements(nums1, nums2);
		
		System.out.println(Arrays.toString(result));
		
		
	}
		 

}
