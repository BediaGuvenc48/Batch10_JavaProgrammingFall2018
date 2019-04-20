package day52_absraction_interface01;

public class Fibo {
	
	
	public static int fib(int n) {
		 
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
			
		int num1 = 0; 
		int num2 = 1; 
		int fib1 = 0; 
		
		for (int idx = 2; idx <= n; idx++) {
			
			fib1 = num1 + num2; 
			num1 = num2; 
			num2 = fib1; 
		}
		
		return fib1; 
		}
	public static void main(String[] args) {
		
		fib(8); 
		
		for (int idx = 1; idx <=8; idx++) {
			
			System.out.print(fib(idx) + ", ");
		}
		
		
	}
	}


