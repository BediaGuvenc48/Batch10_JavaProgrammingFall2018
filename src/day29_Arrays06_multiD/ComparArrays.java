package day29_Arrays06_multiD;

import java.util.Arrays;

public class ComparArrays {
	
	public static void main(String[] args) {
		
	//Scenario # 1: 
		int [] arr1 = {56,23,656,67}; 
		
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2 = arr1; 
		System.out.println(Arrays.toString(arr2));
		
		int [] x = arr1; 
		
		System.out.println(Arrays.toString(x));
		
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(arr1 == x);
		
		System.out.println("\nTEST");
		
	//Scenario # 2: 	
	
	int [] arr3 = {56,23,656,67};
	
	System.out.println(arr1 == arr3);//check if arr1 and arr3 are looking at the same memory location
	System.out.println(arr1.equals(arr3)); //false
	//when you create a new Array, it is a new memory space and doesn't point to the same memory location 
	
	//test values in 2 arrays 
	System.out.println(Arrays.equals(arr1,  arr3));//true, this just check the length of array 
	
	String str1 = new String ("hello"); 
	String str2 = new String ("hello");
	
	System.out.println("\n TEST *****");
	System.out.println(str1.equals(str2));
	
	System.out.println(str1 == str2);//false, because once you created new string or array, it doesn't 
									//look the same memory location 
	
	System.out.println(str1.equals(str2));//this one only check the contains of String, not the memory locations 
		
	}

}
