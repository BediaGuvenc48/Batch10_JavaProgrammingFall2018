package day24_LoopsAndArrays;

import java.util.Arrays;

public class ArraysCreation {
	
	public static void main(String[] args) {
		
	// declare array that can hold 5 items 
		
		int [] array1 =  new int [10]; 
		
		int [] numbers = new int [5];
		System.out.println(numbers.length);
	
	//assign values. We go by the index that starts from 0 
		
		numbers[0] = 100; 
		numbers[1] = 200; 
		numbers[2] = 300; 
		numbers[3] = 400; 
		numbers[4] = 500;
	
		int [] nums = new int [8]; 
	 
		
		System.out.println(Arrays.toString(numbers));
		
		for (int num : nums) {
			
			System.out.print(num + ", ");
		}
		
		System.out.println();
		
	//read from array 
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		numbers[0] = 1000; 
		System.out.println(numbers[0]);
		
	//numbers[10] = 354567; index of out bound exception 
		
		numbers[1] = numbers[2] + numbers[3]; 
		System.out.println(numbers[1]);
		
		/*
		 * declare a char array grades and assign A, B, C D, E to it. 
		 */
		
		char [] grades = new char [5];
		
			grades[0] = 'A';
			grades[1] = 'B'; 
			grades[2] = 'C'; 
			grades[3] = 'D'; 
			grades[4] = 'E'; 
		
		char [] grades1 = {'A', 'B', 'C', 'D', 'E'}; 
		
		//print first item 
		
		System.out.println(grades[0]);
		
		char myGrade = grades[1]; 
		System.out.println(myGrade);
		
		//String[] cities = new String[3];
		
		String cities[]; 
		cities = new String[3];

		cities[0] = "Washington";
		cities[1] = "Los Angeles";
		cities[2] = "New York";

		String[] cities2 =  {"Chicago", "McLean", "Miami"};
		///cities2 = {"Chicago", "McLean", "Miami"};
		
		
		
		
		
	}
	


	
}
