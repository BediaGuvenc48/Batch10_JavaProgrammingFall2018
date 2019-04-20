package day5_Operators;

import java.util.Scanner;

public class test5 {
	
	int num1; 
	int num2; 
 
	
		public static int Add(int num1, int num2 ) {
			
			return num1 + num2;
			
		}
		
		public static int Subtract(int num1, int num2 ) {
			
			int result = num1 - num2; 
			return result; 
		
			
		}
		
		public static int Multiply(int num1, int num2 ) {
			
			return num1 * num2;
			
		}
		
		public static int Divid(int num1, int num2 ) {
			
			return num1 / num2;
		
			
		}
		
		
	
	
	
	static public void main(String [] args) { 
		
		/*
		 * write a program that users can sum 2 numbers and then show result 
		 * write a program that users can subtract 2 numbers and then show result 
		 * write a program that users can multiply 2 numbers and then show result 
		 *  write a program that users can divide 2 numbers and then show result 
		 */
	
		
		int num1 = 500; 
		int num2 = 2; 
		 
		int result1 = Add(num1, num2); 
		System.out.println(result1);
		
		int result2 = Subtract(num1, num2); 
		System.out.println(result2);
		
		int result3 = Multiply(num1, num2); 
		System.out.println(result3);
		
		int result4 = Divid(num1, num2); 
		System.out.println(result4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner a = new Scanner(System.in); 
		
		//System.out.println("please enter 2 numbers: ");
		
		//int a1 = a.nextInt();
		//int a2 = a.nextInt(); 
		
		//int sum = a1 + a2; 
		
		//System.out.println("Your Summation Result is: " + sum); 
		
//		 Scanner b = new Scanner(System.in);
//		 
//		 System.out.println("Enter Your Desired Number Below: "); 
//		 
//		 int b1 = b.nextInt(); 
//		 int b2 = b.nextInt(); 
//		 
//		 int Div = b1 / b2; 
//		 
//		 System.out.println("The result for your divided number is: "); 
//		 
//		 System.out.println(Div); 
//		 
//		 b.close();
		 
		 
		 
		 
		 
		 
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}
