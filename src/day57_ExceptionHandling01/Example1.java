package day57_ExceptionHandling01;

public class Example1 {
	
	
	public static void main(String[] args) {
		
		/*
		 
		 1): NullPointed 
		 
		 2): ArithmaticException 
		 
		 3): IndexOutOfBoundException 
		 
		 
		 */
		
		//1): NullPointed  
		
		//String s = null; 
		
		//System.out.println(s.length()); // a paper is created, but not pointing to any address, this is the scenario happens here 
			//-->  java.lang.NullPointerException 
		
		
		//2: ArithmaticException  
		
		System.out.println(" The program started "); //before it gets to the point that is throwing exception, 
														//it works, after it is interupted, then the rest of code doesn't run 
		
		//System.out.println( 3/0 );
			//--> java.lang.ArithmeticException: 
		System.out.println(" The program ended ");
		
		
		//3): IndexOutOfBoundException:  
		
		//int [] nums = {1,2,3}; 
		
		//	System.out.println( nums[3] ); 
					// --> java.lang.ArrayIndexOutOfBoundsException: 3 
			
//		String str = "abc"; 
//		System.out.println(str.charAt(3)); 
			//java.lang.StringIndexOutOfBoundsException: 
		
		// If things like this hapen, then you will do one of the following: 
		
		
		NullPointerException npe = new NullPointerException (); //so it is an object and you can create an object of it. 
		
		throw npe; //even you don't have any issue with the code, you use the throw keyword and throw manually some exception to the console 
		
		
		
	}

}
