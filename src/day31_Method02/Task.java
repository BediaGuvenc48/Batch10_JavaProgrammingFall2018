package day31_Method02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		double d = calculatorCustom(50, 0, '/'); 
		System.out.println(d);
		
		System.out.println("Test >>>>>>>");
		Task x = new Task(); 
		  
		x.getLarger(11, 3);	
		
		Task x1 = new Task(); 
		
		int [] numbers = {2,55, 22, 10000, 33, 44}; 
		
		x1.getMax(numbers);
		
		
	int number = 0; 
	
		x1.steps(number);
	
	double num1 = 100; 
	double num2 = 50; 
	
		x1.Add(num1, num2); 
		x1.Subtract(num1, num2);
		x1.mltiply(num1, num2);
		x1.divission(num1, num2);
		
		
		String n = "khalili"; 
		System.out.println( x1.erversString(n) ); 
		
		System.out.println( x1.countTimes1("khalili", "i") ); 
		
		//int [] temp = {1,23,46,7,7}; 
		
		
		int [] temp =	x1.getIntArray(); 
		
		System.out.println(Arrays.toString(temp));
	
		

		/*
		 * Create 2 Arrays using getIntArrays5 methods, 
		 * and compare SUMS of both and print out which one is larger 
		 */
		
		
		int [] y = x1.getIntArray(); 
		System.out.println("Sum of y: " + Arrays.toString(y));
		
		int [] z = x1.getIntArray(); 
		System.out.println("Sum of Z: " + Arrays.toString(z));
		
		int sum1 = 0; 
		int sum2 = 0; 
		int max = 0; 
		
		for (int idx = 0; idx < y.length; idx++) {
			
			sum1 += y[idx]; 
		}
		
		System.out.println("Sum1: " + sum1 );
		
		for (int j = 0; j < z.length; j++) {
			
			sum2 += z[j]; 
		}
		
		System.out.println("Sum2: " + sum2);
		
		if (sum1 > sum2) {
			max = sum1; 
		} else if (sum2 > sum1) {
			max = sum2; 
		}
		
		System.out.println("Max is: " + max);
	}
	
	/*
	 * create a method getLarger - that accepts 2 numbers and prints larger one.
	 * if they are equal it prints "Numbers are equal: number"
	 */
	
	public void getLarger(int num1, int num2) {
		
		int max = 0; 
		
		 if (num1 > num2){
			max = num1; 
		} else if (num2 > num1) {
			max = num2;  
		}
		 
		 System.out.println(max);
		
	}
	
	/*
	 * create a method getMax - that accepts an int array and prints largest number
	 * in the array. If array is empty, print "ERROR: Array is empty"
	 */
	
	
	public void getMax(int [] nums) {
		
		int largest = 0; 
		
		if (nums.length < 1) {
			System.out.println("Error!!! The Array is empty ");
		} else  {
			
			for (int idx = 0; idx < nums.length-1; idx++) {
				
				if (nums[idx] > nums[idx+1]) {
					largest = nums[idx]; 
				}
			}
			
			System.out.println(largest);
		}
		
	}
		
	/*
	 * create a method called steps, it accepts an int parameter. 
	 * if the parameter is negative then we print "jump " that many times 
	 * -2
	 * jump 1 
	 * jump 2 
	 * 
	 * if it is 0 then we sit 
	 * 
	 * if it is positive we take steps 
	 * Step 1 
	 * Step 2 
	 */
	
	
	public void steps(int n) {
			
			if (n == 0) {
				System.out.println("Sit");
			} else if (n > 0) {
				for (int j = 1; j <= n; j++) {
					
					System.out.println("Step " + j);
				} 
				
			}else if (n < 0) {
				
				for (int x = 1; x <= n * (-1); x++) {
					
					System.out.println("Jump " + x);
				}
			   }
			
			}
	
	

	/*
	 * -	Calculator:
	 * Add >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
	 * Subtract >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
	 * Multiply >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
	 * Divide >>> 2 double arguments/parameters/inputs adds numbers and prints the result. 
	
	 */
	
	
	  public void Add(double num1, double num2) {
		  
		  double result = num1 + num2; 
		  
		  System.out.println(result);
		  
	  }
	  
		
	  public void Subtract(double num1, double num2) {
		  
		  double result = num1 - num2; 
		  
		  System.out.println(result);
		  
	  }
	
	
	  public void mltiply(double num1, double num2) {
		  
		  double result = num1 * num2; 
		  
		  System.out.println(result);
		  
	  }

	  public void divission(double num1, double num2) {
		  
		  double result = num1 / num2; 
		  
		  System.out.println(result);
		  
	  }
	
	  

		/*
		 * Method: reverse
		 * Params: 1 String
		 * Return type: String
		 * It reverses the Param string and returns the result
		 * 
		 * reverse("water");
		 * reverse("wood");
		 */
		
		
		
		public String erversString(String name) {
			
			String rev = ""; 
			
			for (int idx = name.length()-1; idx >= 0; idx--) {
				
				rev += name.charAt(idx); 
			}
			
			
			return rev; 
		}
		
		/*Method name: countTimes
		 * Params: 2 Strings
		 * Return type: int
		 * Counts number of second string within first string 
		 * and return that count
		 * 
		 * Ex:
		 * countTimes("jav","a") -> 2
		 * countTimes("Break time is over!", "e" ) -> 3
		 * countTimes("google", "a" ) -> 0
		 */
		
		 public int countTimes(String name, String alphabit) {
			 
			 int count = 0; 
			 
			 for (int idx = 0; idx < name.length(); idx++) {
				 
				 	if (name.substring(idx, idx+1).equals(alphabit)) {
				 		count++; 
				 	}
				 }
			 return count; 
			 	
		 }
		
		
		 
	      public int countTimes1(String name, String alphabit) {
				 
				 int count = 0; 
				 
				 for (int idx = 0; idx < name.length(); idx++) {
					 
					 	if (name.charAt(idx) == alphabit.charAt(0)) {
					 		count++; 
					 	}
					 }
				 return count; 
				 	
			 }
			

	  	public int [] getIntArray() {
			
			
			Random rn = new Random(); 
			
			int num = rn.nextInt(100); 
			
			int [] temp = new int [5]; 
			
			for (int idx = 0; idx < temp.length; idx++) {
				
				temp[idx] = rn.nextInt(num);		
				
			}

			return temp;
			
		}
		
		
		public static double calculatorCustom(int x, int y, char operator) { 
			 
			switch(operator) {
			
			case'+': 
				return x + y; 
				
			case '-': 
				return x - y; 
				
			case '*': 
				return x * y; 
				
			case'/': 
				if (x == 0) {
					return 0; 
				}else {
					return x / y; 
				}
			
			}
			return 0; 
			
		}
		
	  	
	  	 
	  	
	
	
		
		
		
		
		
		
	  
	
		
}
	

	
	

