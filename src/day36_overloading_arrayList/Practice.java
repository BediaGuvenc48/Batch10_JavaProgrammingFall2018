package day36_overloading_arrayList;

import java.util.*; 

public class Practice {
	
	
	
			/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
			 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

			bigDiff([10, 3, 5, 6]) → 7
			bigDiff([7, 2, 10, 9]) → 8
			bigDiff([2, 10, 7, 2]) → 8

			...Save, Compile, Run (ctrl-enter)*/
	
	
		public int bigDiff(int [] bigDiff1 ) {
			
			int tempNum = 0; 
			 
			Arrays.sort(bigDiff1);
			
			
			for (int idx = 0; idx < bigDiff1.length; idx++ ) {
			
				 
				tempNum =  bigDiff1[bigDiff1.length-1] - bigDiff1[0]; 
				
			}
			return tempNum;
			 
		}
		
		public static void main(String[] args) {
			
			
			Practice p = new Practice(); 
				
			int [] Array = {2, 10, 7, 2};  
			
			int num = p.bigDiff(Array); 
			
			System.out.println(num);
			
		}

    }