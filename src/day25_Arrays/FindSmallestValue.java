package day25_Arrays;

import java.util.Arrays;

import day28_Arrays05.arraysCopyOf;

public class FindSmallestValue {
	
	public static void main(String[] args) {
		
	/*
	 * create array nums and assign several values 
	 * print the smallest value in array 	
	 */
		
//		int [] numbers = {13,46,7,788,99,1000}; 
//		
//		int smallNum = 0;   
//		
//		Arrays.sort(numbers);
//		
//		for (int idx = 0; idx < numbers.length; idx++) {
//			
//			if (numbers[idx] <smallNum) {
//				smallNum = numbers[idx]; 
//			}
//			 
//		}
//		
//		
//		int [] number = {100, 200, 300, 50, 20, 10}; 
//
//			Arrays.sort(number); 
//		
//		for (int idx = 0; idx < number.length; idx++) {
//			
//			System.out.println(number[0]);
//			break; 
//			
//		}
		
	
//		
//		
//		
		int [] nomber = {100, 200, 300, 50, 20, 10}; 
		
		int min = nomber[0]; 
		
		for (int idx = 0; idx < nomber.length; idx++) {
			
			if (nomber[idx] < min) {
				min = nomber[idx]; 
			}
				 
		}
			System.out.println("Smallest is: " + min);
		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		int smallest = nomber[0];  
//		
//		for (int idx = 0; idx < nomber.length; idx++) {
//			
//			if (nomber[idx] < smallest) {
//				smallest = nomber[idx]; 
//			} 
//		}
//			System.out.println("smallest is " + smallest);
	
		
//		int smallest = nomber[0]; 
//	
//		for (int num : nomber) {
//			
//			if (num < smallest) {
//				
//				smallest = num; 
//			} else {
//				
//				smallest = smallest; 
//			}
//		}
//			System.out.println(smallest);
		
			/*
				 * create array nums and assign several values
				 * print the smallest value in array
				 */
				/*int nums[] = {100, 230, 0, 234, 345, 123}; 
				
				int smallest = nums[0];
				
				for(int n : nums) {
//					if( n < smallest) {
//						smallest = n;
//					}else{
//					    smallest = smallest;
//					}
					smallest = n < smallest ? n : smallest;
				}
				
				System.out.println(smallest);*/
				
				
			/*int [] number = {10, 30, 50, 60}; 
			
			int smallest1 = number[0]; 
			
			for (int num1 : number) {
				
				if (num1 < smallest1) {
					smallest1 = num1; 
				}
			}
				System.out.println(smallest1);
			
				
				
				
				int [] num1 = {10, 30, 50, 60};			
				
				int small = num1[0]; 
				
				for (int num2 : num1) {
					
					if (num2 < small) {
						small = num2;
					}
				}
					System.out.println(small);*/
				
				
		
			}
		}

