package day62_DataStructor_Akbar_02;

public class NumbersUtil {
	
	/*You need to check if given Integer is palindrome or not. An integer is called palindrome if its equal to its reverse e.g. 1001 is a palindrome 
	 * but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. 
	 * This trick is used to solve this problem. 
	 * While solving this assignment please don't convert the integer to string.

	Examples:

	   boolean b = NumbersUtil.isPalindrome(1331);
	   System.out.println(b); //true
	    
	    boolean b2 = NumbersUtil.isPalindrome(1234);
	    System.out.println(b2); //false*/ 

		  public static void main(String[] args) {
//		    boolean b = NumbersUtil.isPalindrome(1331);
//		    System.out.println(b); //true
//		    
//		    boolean b2 = NumbersUtil.isPalindrome(1234);
//		    System.out.println(b2); //false
		    
//		    
//		    boolean myTest = NumbersUtil.isPalindrome(123); 
//		    System.out.println(myTest);
		    
//		    
//		   Integer temp = NumbersUtil.reverse1(556); 
//		   System.out.println(temp);
			  
			  
		    boolean b = isPalindrom(1221); 
		    System.out.println(b);
		    
		    boolean x = isPal(122121); 
		    System.out.println(x);
		    
		    boolean z = isPael(1221); 
		    System.out.println(z);
		    
		  }

//		  public static boolean isPalindrome(int num) {
//		    
//		
//			  return (num == reverse(num));  
//		  }
		  
//		  public static boolean isPalindrom(int num) {
//			  
//			  int Reverse = 0; 
//			  
//			 while (num > 0) {
//				  
//				  int Reminder = num % 10; 
//					 
//					 Reverse = Reverse * 10 * Reminder; 
//					 
//					 num = num / 10; 
//				  
//				  if (num == Reverse) {
//					  return true; 
//				  }  
//					  return false;    
//			  }
//			  
//		  }
//			  
//			  while (num > 0) {
//				  
//				 int Reminder = num % 10; 
//				 
//				 Reverse = Reverse * 10 * Reminder; 
//				 
//				 num = num / 10; 
//			  }
//			  
//			  if (num == Reverse) {
//				  return true; 
//			  }
//			  
//			  return false; 
//		  }
//		  
//		  
//		  
//		  public static int reverse1 (int num) {
//			  
//			  StringBuffer stb = new StringBuffer(num + " "); 
//			  
//			  return Integer.parseInt(stb.reverse().toString()); 
//		  }
		  
		  public static boolean isPalindrom(int number) {
		 
			 int reverse = 0; 
			 int rem = 0; 
			 int result = number; 
			 
			 while (number > 0) {
			  
			  rem = number % 10; 
			  number = number/10;  
			  reverse = reverse * 10 + rem;  
		    }
		  
		   if (result == reverse) {
			   return true;  
		   }
		   	   return false; 
		  	 
		  } 
		  
		  
		  
		  public static boolean isPal(int num) {
			  
			  int reverse = 0; 
			  int rem = 0; 
			  int result = num; 
			  
			  while (num > 0) {
				  
				  rem = num % 10; 
				  num = num / 10; 
				  reverse = reverse * 10 + rem; 
			  }
			  
			  if (reverse == result) {
				  return true;
			  }
			  
			  return false;
		  }
		  
		  
		  
		 public static boolean isPalind(int number) {
			 
			 int reverse = 0; 
			 int rem = 0; 
			 int result = number; 
			 
			 while (number > 0) {
				 
				 rem = number % 10; 
				 number = number / 10; 
				 reverse = number * 10 + rem; 
			 }
			 
			 if (reverse == number) {
				 
				return true;
			 }
			 
			 return false;
		 }
	
		 public static boolean isPael(int num) {
			 
			 int rev = 0; 
			 int rem = 0; 
			 int result = num; 
			 
			 while (num > 0) {
				 
				 rem = num % 10; 
				 num = num / 10; 
				 rev = num * 10 + rem;  
			 }

			 if (rev == result) {
				return true; 
			 }
			 	return false; 
		 } 
		 
        }
