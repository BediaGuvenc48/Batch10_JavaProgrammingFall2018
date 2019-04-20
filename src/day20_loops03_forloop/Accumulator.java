package day20_loops03_forloop;

public class Accumulator {
	
	public static void main(String[] args) {
		
		/*Accumulation means summation of all 
		 * write a program which finds the sum of all from 1 to 5 
		 * meaning 1 + 2 + 3 + 4 + 5 = 15; 
		 */
		
		
//		int sum = 0;   
//		
//		for (int number = 1; number <= 5; number++) {
//			
//			sum = sum + number;
//			
//		}
//		
//		System.out.println(sum);
		
		int sum = 0; 
		
		int num = 0; 
		
		while (num <= 5) {
			
			sum += num; 
			
			num++; 
		}
		
		System.out.println(sum);
		
		
		
		
		
//		
//		
//		
//		
//		int sum = 0; 
//		for (int i = 1; i <= 5 ; i++) {
//			sum = sum+i;
//		}
//			System.out.println("Sum is " + sum);
//		
//			
////			int sum = 0; 
////			for (int i = 1; i <= 5 ; i++) {
////				sum = sum+i;
////			}
////				System.out.println("Sum is " + sum);	
//	/*
//	 * program to culculate the sum of all odd and even numbers between 0 and 100; 
//	 * sumOfOdd ---> will have all sum of odd numbers 
//	 * sumOfEven ---> will have all sum of even numbers 
//	 * 	
//	 */
//		
//		int sOdd = 0; 
//		int sEv = 0; 
//		
//		for (int idx = 0; idx <= 100; idx++) {
//			
//			if (idx % 2 == 0) {
//				
//				sOdd = sOdd + idx; 
//			}
//			
//			if (idx % 2 == 1) {
//				
//				sEv = sEv + idx; 
//			}
//		}
//		
//			System.out.println("odd " + sOdd );
//			System.out.println("Even " + sEv);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
//		int sumOfOdds = 0;
//		
//		int sumOfEvens = 0;
//		
//		for(int n = 0; n <= 100; n++ ) {
//			
//			if(n % 2 == 0) {
//				
//				//sumOfEvens = sumOfEvens + n;
//				sumOfEvens += n;
//				
//			}else {
//				
//				sumOfOdds = sumOfOdds + n;
//			}
//		}
//		System.out.println("sumOfOdds " + sumOfOdds);
//		System.out.println("sumOfEvens " + sumOfEvens);
//		
//
//		for (int idx = 0; idx <= 20; idx+=2) {
//			System.out.print(idx + ", ");
//		}
				
	}

}
