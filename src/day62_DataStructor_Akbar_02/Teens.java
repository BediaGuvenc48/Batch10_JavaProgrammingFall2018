package day62_DataStructor_Akbar_02;


public class Teens {
	/*
	 * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- 
	 * in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. 
	 * Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value 
	 * fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). 
	 * Define the helper below and at the same indent level as the main noTeenSum().


		noTeenSum(1, 2, 3) → 6
		noTeenSum(2, 13, 1) → 3
		noTeenSum(2, 1, 14) → 3*/
	
	
		public static void main(String[] args) {
			
			int temp =  sumAll(2,13,1); 
			System.out.println(temp);
			
		}
	
	
		public static int fixTeen(int n) { 
			
			if (n > 12 && n < 20) {
				if (n == 15 && n== 16) {
					return n;  
				}
				return 0; 
			}
			
			return n; 
		}
	
	
	public static int sumAll(int num1, int num2, int num3) {
		
		 
		int sum = 0; 
			
		sum = fixTeen(num1) + fixTeen(num2) + fixTeen(num3); 
				
		return sum; 
	 
	
	}

	// 1, 2, 3 ->6
	//2, 13, 1 -> 2, 0, 1 -> 3
	//2, 1, 14 -> 2, 1, 0 -> 3
	
	public static int teenNum(int n) {
		if(n>=13&&n<15 || n>16&&n<=19) {
			n=0;
		}
		return n;
	}
	
	public static int sumOfTeens(int n1, int n2, int n3) {
		int sum;
		sum = teenNum(n1) + teenNum(n2) + teenNum(n3);
		return sum;
	}

}