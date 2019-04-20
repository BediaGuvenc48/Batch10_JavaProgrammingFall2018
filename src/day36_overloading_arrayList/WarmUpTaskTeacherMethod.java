package day36_overloading_arrayList;
import java.util.Arrays; 

public class WarmUpTaskTeacherMethod {

	
	public int [] sumMethod(int [] num1, int [] num2) {
	
		int [] temp = new int [num1.length]; 
		
		for (int idx = 0; idx < num1.length; idx++) {
			
			 temp[idx] = num1[idx] + num2[idx]; 
		}
		
		return temp; 
	}
	
	public static void main(String[] args) {
//		int[] arr1 = {4,5,6,7,8, 11, 33};
//		int[] arr2 = {1,2,6,3,6, 55, 66};
//		//            5,7,12,10,14
//		
			
		
//		int[] arr3=addElements(arr1 , arr2 );
//		
//		//print all values in single line
//		System.out.println( Arrays.toString(arr3) );
//		
//		arr3 =addElements(new int[] {4,5,3,1,3} , 
//				          new int[] {1,2,3,4,5});
//		System.out.println( Arrays.toString(arr3) );
//		
		
		int [] b1 = {1, 2, 3, 5, 7};  
		int [] b2 = {100, 300, 500, 600, 900}; 
		
			int [] result = addElem(b1, b2); 
				System.out.println(Arrays.toString(result));
	}
	
	/*
	 * method name: addElements
	 * args: 2 int arrays
	 * return: int array
	 * Adds each element value of arg arrays and returns a new array
	 * each arg array has 5 elements
	 * 1-> 1, 2, 3 ,4, 5
	 * 2-> 11, 22, 33 ,44, 55
	 * 
	 */
	
		public static int [] addElem(int [] a1, int [] a2) {
			
			int [] nums = new int [a1.length]; 
			
			for (int idx = 0; idx < a1.length; idx++) { 
				
				nums[idx] = a1[idx] + a2[idx]; 
			}

			return nums; 
				
		}
	

	public static int[] addElements(int[] ints1, int[] ints2) {
		//create a new array here
		int[] newArray = new int[ints1.length];
		//go to each elem in arrays and add them
		for(int i=0; i<newArray.length;i++) {
			newArray[i] = ints1[i] + ints2[i];	
		}
		
		return newArray;
		
	}
	
	
	
	
	
	
	
	
}