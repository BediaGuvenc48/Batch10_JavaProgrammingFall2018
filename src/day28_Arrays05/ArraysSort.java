package day28_Arrays05;

import java.util.Arrays;

public class ArraysSort {
	
	public static void main(String[] args) {
		
/*
 * Arrays Class: 
 * 
 * It is a utility class for manipulating and working with arrays. 
 * 
 * It has ready methods to sort, search, copy, compare arrays. 
 * 
 * We will learn some of the sort methods 
 * 
 * 		
 */
		
//Sort Method all Arrays class 

	int [] nums = {9,5,3,5,8,4,6,10};
	
	Arrays.sort(nums);
	
	System.out.println(Arrays.toString(nums));
	
	
	int temp = 0; 
	
	for (int idx = 0; idx < nums.length; idx++) {

		System.out.println(nums[nums.length-4] - nums[nums.length-5]);
		break; 
	}
	
	
//	for (int n : nums) {
//		System.out.print(n + " ");
//	}
//		Arrays.sort(nums);
//	
//	System.out.println("\n===========9999=======");
//	
//	for (int number : nums) {
//		System.out.print(number + " ");
//	}
//	
//		
//		
//	System.out.println("\n===========9999=======");
//	
//	
//	for (int number : nums) {
//		System.out.print(number + ", ");
//	}
//		System.out.println("\n=========================");
//			
//		Arrays.sort(nums); //this is very important, it sort your arrays in Ascending order 
//						  // sort is a method inside array, sort changes the array permanently 
//		
//	for (int number : nums) {
//	System.out.print(number + ", ");
//			
//		}
//		
//		System.out.println("\n=========================");
//	
//	String [] names = {"Said", "John", "Asel", "Alisiya", "Khalili", "Ahmad"}; 
//	
//	//ABCDEFGHIJKLMNOPQRSTUVWXYZ
//	
//	Arrays.sort(names); 
//	
//	for (String str : names) {
//		
//		System.out.print(str + ", ");	
//	}
//		
//		System.out.println("\n=========================");
//	
//		char [] charArray = {'c', 'C', 'D', 'A', '2'}; 
//		
//		for (char copChar : charArray) {
//			
//			System.out.print(copChar + ", ");
//		}
//		
	}

}
