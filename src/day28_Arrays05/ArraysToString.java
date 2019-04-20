package day28_Arrays05;

import java.util.Arrays;

public class ArraysToString {
	
	public static void main(String[] args) {
		
		/*toString: 
		 * 
		 * Arrays.toString(arr): 
		 * it is a special method in java, that all object have. 
		 * When you use/call toString, normally it returns a description of your object.
		 * 
		 *  toString is used for quickly printing out all arrays in same line without
		 *  using the for loop. 	
		 */
			
		//SORT method of Arrays class
		int[] nums = {9,4,3,0,-4,5,3,10};
		
		for(int n : nums) {
			System.out.print(n +" ");
		}
		System.out.println();
		
		
		Arrays.sort(nums);
		
		for(int n : nums) {
			System.out.print(n +" ");
		}
		System.out.println();
		
		String[] names = {"Said", "John","Asel","Alisiya","Mijat","Tariq","Z","Khalili"};
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		Arrays.sort(names);
		
		for(String name :  names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		char[] charArray = {'c','C','D', 'A','2'};
		
		Arrays.sort(charArray, 0, 3);//partial sort if needed
		
		for(char ch :  charArray) {
			System.out.print(ch + " ");
		}
		
		
			 
	}

}
