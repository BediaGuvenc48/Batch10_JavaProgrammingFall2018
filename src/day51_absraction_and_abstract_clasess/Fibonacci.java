package day51_absraction_and_abstract_clasess;

import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
//		
//		
//
//		
//		String str = "kafhajhkjadaaajfajjaaaaa"; 
//		String unique = ""; 
//		
//		for (int idx = 0; idx < str.length(); idx++) {
//			
//			if (!unique.contains(str.charAt(idx) + "")) {
//				
//				unique += str.charAt(idx); 
//			}
//		}
//		
//		System.out.print(unique);
//		
//		
//		int a = 10; 
//		int b = 4; 
//		
//		b = a + b; 
//		a = b - a; 
//		b = b - a; 
//		
//		int temp = 0; 
//		
//		if (a > b) {
//			temp = a; 
//			b = temp; 
//		}
		 
		
		
		String ah = "Hi I am Ahmad"; 
		
		String st = "";  
		

		
		for (int idx = ah.length()-1; idx >= 0; idx--) {
			
			st = st + ah.charAt(idx); 
			
		}
		
		System.out.println(st);
		
//		for(int idx = ah.length()-1; idx >= 0; idx--) {
//			
//			bb += ah.charAt(idx); 
//		}
//		
//		System.out.print(bb);
//		
		
		
	}
//	
////		for (int i = 1; i <= 10; i++) {
////			System.out.print(fibonacci(i) + " ");
////		}
////		
//	 
//
////	}
////   n1  n2
////1  2   3  4    5  6  7 position
////0, 1,  1 ,2,   3, 5, 8
////0 +1 = 1
////	 1 + 1 = 2
//   //	 1 + 2 = 3
//	
//	
//			for (int idx = 1; idx <= 20; idx++) {
//				
//				System.out.print( fibonachi(idx) + ", " );
//			}
//		
//	
//	}	
//	
//	public static int fibonacci(int n) {
//		
//		
//		if (n == 1) {
//			return 0;
//		}
//		if (n == 2 ) {
//			return 1;
//		}
//		int n1 = 0;
//		int n2 = 1;
//		int fib=1;
//		for (int i = 3; i <= n; i++) {
//			
//			fib = n1 + n2;
//			n1 = n2;
//			n2 = fib;
//		}
//		return fib;
//	}
//	
//	
//	
//	
//	
//	public static int fibonachi(int num) {
//		
//		
//		if (num == 1) {
//			return 0; 
//		} else if (num ==2) {
//			return 1; 
//		}
//		 
//			int num1 = 0; 
//			int num2 = 1; 
//			int fib = 1; 
//			
//			for (int idx = 0; idx <= num; idx++) {
//				
//				fib = num1 + num2; 
//				num1 = num2; 
//				num2 = fib; 
//			}
//		
//		return fib; 
//	}
//	
//	
//	
//	
//	//0 + 1 = 1
//	
	
	
	
	public static int myFibon(int x) {
		
		if (x == 1) {
			return 0; 
		}else if (x == 2) {
			return 1; 
		}
		
		int num1 = 0; 
		int num2 = 1; 
		int fib = 1; 
		
		for (int idx = 0; idx <= x; idx++) {
			
			fib = num1 + num2; 
			num1 = num2; 
			num2 = fib; 
		}
		
		return fib; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int fib(int t) {
//
//		if (t == 1) {
//			return 0; 
//		}else if (t == 2) {
//			return 1; 
//		}else {
//			return fib(t - 1) + fib(t + 2);
//		}
//		
//	}
	
	
//	public static void main(String[] args) {
//		
////		
////		for (int idx = 1; idx <= 8; idx++) {
////			
////			System.out.print( myFibon(idx) + ", "  );
////		}
//		
//		System.out.print("Fib: " + fib(8));
//		

}
