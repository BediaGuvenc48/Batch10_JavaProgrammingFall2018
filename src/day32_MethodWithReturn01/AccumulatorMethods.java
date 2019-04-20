package day32_MethodWithReturn01;

public class AccumulatorMethods {
	
	public static void main(String[] args) {
		
		String s1 = getStar1(14); 
		System.out.println(s1);
		
		int sum = sumToN(20);
		System.out.println(sum);
		
		String st1 = getStars11(20);
		System.out.println(st1);
		
		
		String myStars = getStars11(5);
		System.out.println(myStars);
		
		System.out.println( getStars11(10) );
		
		String myStar1 =  printStar(8); 
		
		System.out.println(myStar1);
		
		int[] nums = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		
		for (int n : nums) {
			System.out.println( getStars11(n) ) ;
		}
	  
		
		int [] number = {1,2,3,4,5,6,7,6,5,4,5,6,7,6,5,4,3,2,1};
		
		String str = "";
		
		for (int num : number) {
			
			System.out.println( getStars11 (num));
		}
		
	}
	
	//method: getStars that accepts an int and returns a string
	//it will return that many * s from method.
	// getStars(5) -> *****
	// getStars(2) -> **
	
	public static String getStars11(int number) {
		
		String temp = ""; 
		
		for (int i = 0; i <+number; i++) {
			
			temp+= "*"; 
		}
		
		return temp; 
	}
	
	
		public static String getStar1(int num) {
			
			String star = ""; 
			
			for (int idx = 0; idx <= num; idx++) {
			
				star += "*"; 
			}
			
			return star; 
		}


		public static String getStar(int num) {
			
			String s = ""; 
			
			for (int idx = 0; idx <=num; idx++) {
				
				s = s + "*"; 
			}
			return s;
		}
	
		public static String getStars1(int number) {
			
			String st = ""; 
			
			for (int idx = 0; idx <= number; idx++) {
				
				st = st + "*";
			}
				return st; 
		}
		
		
		
	public static String getStars(int count) {
		String stars = "";
		
		for(int i=1; i<=count; i++) {
			stars += "*"; // add one more star
		}
		
		return stars;
	}
	
	//String str = printStars(3);
	//System.out.println(str);
	
	public static void printStars(int count) {
		String stars = "";
		
		for(int i=1; i<=count; i++) {
			stars += "*"; // add one more star
		}
		
		System.out.println( stars );
	}
	
		public static String printStar(int count1) {
			
			String star = ""; 
			for (int idx = 1; idx <= count1; idx++) {
				
				star = star + "*"; 
			}
			
				return star; 
		}
		 	
	
	/*
	 * method: sumToN: accepts an int and return sum of ints starting 
	 * from 1 to that int.
	 * sumToN(3) -> 6  (1+2+3)
	 * sumToN(5) -> 15 (1+2+3+4+5)
	 */
	
		public static int sumToN(int number) {
			
			int sum = 0; 
			
			for (int idx = 0; idx <= number; idx++) {
				
				sum += idx; 
			}
				return sum; 
		}
	
		

}
