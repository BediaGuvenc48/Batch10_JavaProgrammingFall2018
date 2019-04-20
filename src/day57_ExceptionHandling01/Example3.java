package day57_ExceptionHandling01;

public class Example3 {
	
	public static void main(String[] args) {
		
				boolean b = isPrimeNumber(53); 
				System.out.println(b);
				
				System.out.println( getSum(555) ); 
		 
		
		
		
		
//		String name = Revers("Ahmad");
//		System.out.println(name);
//		System.out.println( " program started ");
		
//		String a = null; 
//		
//		System.out.println( a.length() );//it will be ok until it gets to this point, then it will throw exception and the programm will start 
		
	//	throw new NullPointerException(); 
		
		//return;
		
		//System.out.println(" program ended "); //unreachable code, something that you can not reach 
											  //this is a death code, which is unreachable code and it is useless write it. 
		
//		try { //this block just try to catch an exception and we will run up to the las line of the code 
//			
//			// ....
//			// dangerous action in here 
//			
//			String a = null; 		
//			System.out.println( a.length() );
//			
//		} catch (NullPointerException e) {
//			 
//			System.out.println("An exception happened ");
//			
//			
//		}
//		
//		System.out.println("Program Ended !!!");
//		
	}
	
	
	public static String Revers(String str) {
		
		String rev = ""; 
		
		for (int idx = str.length()-1; idx >= 0; idx--) {
			
			 rev += str.charAt(idx); 
		}
		
		
		
		return rev; 
	}
	
	public static boolean isPrimeNumber(int num) {
	
		boolean flag = true; 
		
		if (num <= 1) {
			flag = false; 
		}
		
		for (int idx = 2; idx < num; idx++) { 
			
			if (num % idx == 0) {
				flag = false; 
			}
		}
		return flag;
		}
	
	public static boolean isPrime(int num) {
        boolean prime = true;
        if(num <= 1) {
            prime = false;
        }
        for(int i = 2 ; i < num ; i ++) {
            if(num%i==0) {
                prime = false;
            }
        }
        
        return prime;
    }
	
	
	public static int getSum(int number) {
		
		int sum = 0; 
		
		while (number > 0) {
			
			sum = sum + number % 10; 
			number = number / 10; 
			
		}
		
		return sum; 
	}
	
//	public static int alphabitCounts(String letter) {
//		
//		int vowelCount = 0; 
//		int consonantCount = 0; 
//		
//		if (letter.to == "a" || letter == "e" || letter == "i" || letet )
//		
//		
//		
//		return 0; 
//	}


	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
