package day32_MethodWithReturn01;

public class SumToNumAssignment {
	
	public static void main(String[] args) {
	
		
		int sumAll = sumToN(9); 
		System.out.println(sumAll);
		
		System.out.println( sumToNum(9) ); 
		
		System.out.println( sumToNumber(10) ); 
		 
		System.out.println(">>>>>>>>>>>>>>>>");
		
		sumtToNumber(8); 
	}
	
	
	/*
	 * method: sumToN: accepts an int and return sum of ints starting from 1 to that int.
	 * sumToN(3) -> 6  (1+2+3)
	 * sumToN(5) -> 15 (1+2+3+4+5)
	 */
	
	
	public static void sumtToNumber(int num) {
		int number = 0; 
		
		for (int idx = 0; idx <= num; idx++) {
			
			number+= idx;   
		}
		
		System.out.println(number);
		
	}
	
	public static int sumToNumber(int num) {
		
		int sum = 0; 
		
		for (int idx = 0; idx <= num; idx++) {
			
			sum += idx; 
		}
		
		return sum; 
	}
	
	public static int sumToNum(int Num) {
		
		int sum = 0; 
		
		for (int idx = 0; idx <= Num; idx++) {
			
			sum += idx; 
		}
		
		return sum; 
	}
	
	public static int sumToN(int num) {
		
		int sumNum = 0; 
		
		for (int idx = 0; idx <= num; idx++) {
			
			sumNum = sumNum + idx; 
		}
			return sumNum;
	}
	
	 

}
