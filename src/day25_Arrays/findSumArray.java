package day25_Arrays;

public class findSumArray {
	
	public static void main(String[] args) {
		
		/*
		 * create Array nums - assign several values 
		 * using a loop calculate the sum and print it 
		 * ADDITIONAL steps:
		 * 		- calculate sum of even numbers 
		 * 		- calcualte sum of odd numbers 
		 */	
		
		int [] number = {2,3,5,6,767,7,43,634}; 
		
		int sum = 0; 
		int sumEv = 0; 
		int sumOdd = 0; 
		
		for (int idx = 0; idx < number.length; idx++) {
			
			sum += number[idx]; 
			
			if (number[idx] % 2 == 0) {
				sumEv += number[idx]; 
			}else {
				sumOdd += number[idx]; 
			}
		}
		
		System.out.println("Sum of Even: " + sumEv);
		System.out.println("Sum of Odd: " + sumOdd);
		System.out.println("Sum is: " + sum);
		
		
	/*	
		int [] arrNumb = {1, 3, 6, 10, 55, 100, 65}; 
		
		int sum = 0;
		int evenNumber = 0; 
		int oddNumber = 0; 
		
		for (int idx = 0; idx < arrNumb.length; idx++) {
			
			sum += arrNumb[idx]; 
			
			if (arrNumb[idx] %2 == 0) {
				evenNumber+= arrNumb[idx]; 
			} else if (arrNumb[idx] %2 == 1) {
				oddNumber+= arrNumb[idx]; 
			}	
		}
			System.out.println("Sum of All: " + sum);
			System.out.println("Sum of Even: " + evenNumber);
			System.out.println("Sum of Odd: " + oddNumber);
	 
		
		
		int [] number = new int [] {1, 10, 101, 102}; 
		
		int sum1 = 0; 
		int sumEv = 0; 
		int sumOdd = 0; 
		
		for (int idx = 0; idx < number.length; idx++) {
			
			sum1+= number[idx]; 
			
			if ( idx % 2 == 0 ) {
				sumEv += number[idx]; 
			} 
			
			if (idx % 2 == 1) {
				sumOdd += number[idx]; 
			}
		}
			System.out.println(sum1);
			System.out.println(sumEv);
			System.out.println(sumOdd);
		
		
		for (int idx = 0; idx < number.length; idx++) {
			
			sum1 += number[idx]; 
			
			if (idx % 2 == 0) {
				
				sumEv += number[idx]; 
			}
			
			if (idx % 2 == 1) {
				
				sumOdd += number[idx]; 
			}
		}
		System.out.println("The sum of all is: " + sum1);
		System.out.println(sumEv);
		System.out.println(sumOdd);*/
		
	
		
//		int sum = 0; 
//		
//		int sumEv = 0; 
//		int sumOdd = 0; 
//		
//		for (int idx = 0; idx < number.length; idx++) {
//			
//			sum += number[idx];
//			
//			if (idx % 2 == 0) {
//				
//				sumEv += number[idx]; 
//			}
//			
//			if (idx % 2 != 0) {
//				
//				sumOdd += number[idx];
//			}
//			
//		}
//		
//			System.out.println(sum);
//			System.out.println(sumEv);
//			System.out.println(sumOdd);
		
		/*int [] nums =  {10, 30, 35, 80, 75, 11, 111, 33, 58}; 
		
		int sum = 0; 
		int oddSum = 0; 
		int evenSum = 0; 
		
		for (int idx : nums) {
			
			sum = sum + idx; 
			
			if (idx % 2 == 0) {
				evenSum = evenSum + idx; 
			} else if (idx % 2 != 0) {
				oddSum = oddSum + idx; 
			}
		}
			
			System.out.println("Sum is: " + sum);
			System.out.println("Sum of even number is: " + evenSum);
			System.out.println("Sum of odd number is: " + oddSum);*/
			
	/*	int sum = 0; 
		int even = 0; 
		int odd = 0; 
		
		int [] zaki = {10, 20, 22, 24, 11, 13, 15, 16}; 
		
		for (int aiaz : zaki) {
			
			sum = sum + aiaz; 
			
			if (aiaz % 2 == 0) {
				even = even + aiaz; 
			} else if (aiaz % 2 == 1) {
				odd = odd + aiaz; 
			}
		}
			System.out.println("Sum is: " + sum);
			System.out.println("Odd is: " + odd);
			System.out.println("Even is: " + even);*/
	
		/*int[] nums = {100, 234, 311, 5433, 11353,566, 3333, 333};
		
		int sum = 0; 
		int sumOfEven = 0; 
		int sumOfOdd = 0; 
		
		
		for (int n : nums) {
			sum = sum + n; 
			
			if (n % 2 == 0) {
				sumOfEven = sumOfEven + n; 
			}else {
				sumOfOdd = sumOfOdd + n;  
			}

		}	
			System.out.println("Sum is: " + sum);
			System.out.println("Sum of Even numbers: " + sumOfEven); 
			System.out.println("Sum of Odd numbers: " + sumOfOdd);
		*/
		 
		
		
		
	}
	

}

