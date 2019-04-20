package day33_MethodWithReturn02;
import java.util.*;
public class ArraysMethods {
	
	public static void main(String[] args) {
		
		//int [] arr1 = getIntArray();
		//System.out.println(Arrays.toString(arr1));
		 
			int [] result = getNumber(); 
			System.out.println(Arrays.toString(result));
		
			int [] arrNum =	 getIntArray();
			System.out.println(Arrays.toString(arrNum));
			
			int [] arrNum1 = getIntArray(); 
			System.out.println(Arrays.toString(arrNum1));
		
		
		int [] arr2 = new int [5]; 
		int [] arr3 = new int [5]; 
		
		int sum1 = 0;  
		int sum2 = 0; 
		
		for (int copArr2 : arr2) {
			sum1 += copArr2; 
		}
		
		for (int copArr3 : arr3) {
			sum2 += copArr3; 
		}
		
		if (sum1 > sum2) {
			
			System.out.println("First Array numbers sum is larger " + sum1 );
			System.out.println("Second Array numbers sum is: " + sum2);
			
		} else if (sum2 > sum1) {
			System.out.println("Second Array number sum is larger " + sum2);
			System.out.println("First Array nymbers sum is: " + sum1);
			
		}else {
			
			System.out.println("Sum of both arrays are equal. First Array: " + sum1);
			System.out.println("Second Array Sum: " + sum2);
		}
		
	}
	
	/*
	 * Method: getIntArray
	 * Params/Args: nothing 
	 * return: int array
	 * 
	 * Create an array with 5 ints and assigns random numbers, 
	 * between 0 - 100 then reutrns that array 
	 * 
	 * getIntArrays5() -> [43, 23, 54, 1, 89]
	 */
	
	public static int [] getNumber() {
		
		int [] numbers = {1,23,36,778,88}; 
				
		Random rn = new Random(); 
		
		
		for (int idx = 0; idx < numbers.length; idx++) {
			
			numbers[idx] = rn.nextInt(100); 
		}
		return numbers; 
	}
	
		public static int [] getIntArray() {
			
			int [] arr = new int [5];
			
			Random random = new Random(); 
			
			for (int idx = 0; idx < arr.length; idx++) {
				
				arr[idx] = random.nextInt(100); 
			}
			
			return arr;
		}
		
			
		/*
		 * Create 2 Arrays using getIntArrays5 methods, 
		 * and compare SUMS of both and print out which one is larger 
		 */
		
	
		
		
}
