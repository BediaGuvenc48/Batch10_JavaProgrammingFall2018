package day36_overloading_arrayList;

import java.util.Arrays;

public class warmUpTask {

	public static void main(String[] args) {
//		
		int [] arr1 = {4,5,6,7,8}; 
		int [] arr2 = {1,2,5,6,7}; 
		
		//			   5,7,11,13,15
		
		int [] result = addElements(arr1, arr2);
		
			System.out.println(Arrays.toString(result));
			
		int [] a1 = {2,35,66,88,99}; 
		int [] a2 = {3, 5, 6, 7, 88}; 
		
		int [] result1 =		arr(a1, a2); 
		
			for (int num : result1) {
				
				System.out.print(num + ", ");
				
			}
			
	}
	
	/*Method addElements accepts 2 int arrays and adds each element value
	 *  of two arrays and returns a new array.
	 *

	addElements(new int[][10, 40, 50, 3, 1],
	            new int[][11, 0, 500, 44, 1101]);
	--------
	return array after adding values in the arrays:
	             [21, 40, 550, 47, 1102]*/ 

	
	public static int [] arr (int [] nums, int [] nums1) {
		
		int [] result = new int [nums.length]; 
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			result [idx] = nums[idx] + nums1[idx];  

		}
		return result;
	}
	
	
	
	public static int[] addElements(int[] ints1, int[] ints2) {
	    
			int [] newArray = new int [ints1.length];  
			
	     for (int idx = 0; idx <newArray.length; idx++) {
	    	 	 
	    		newArray[idx] = ints1[idx] + ints2[idx];  
	        }
	     	    return newArray; 
	}
}
