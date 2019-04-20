package day57_ExceptionHandling01;

public class Example5 {
	
public static void main(String[] args) {
		
		/*
		 * 
		 *  TASK 2 
		 *	try to create a code that might 
		 *  throw ArrayOutOfBoundException
		 *  and try to end your program gracefully
		 *  without seeing error codes in consule
		 *  
		 *  try to fix the code to make sure
		 *  it does not throw an exception 
		 *  and run the program again and see
		 *  what you get, 
		 *
		 */

	
		System.out.println( "prgram started" );
		
		/*try {
			// dangerous action in here
			System.out.println("inside try");
			String a = null; 
			System.out.println( a.length()  );
			
		}catch(NullPointerException e) {
			System.out.println("caught Exception FISH ") ; 	
		
		}catch(ArrayIndexOutOfBoundsException e1) {			
			 			
			System.out.println("caught Exception FISH ") ; 	
		}catch (StringIndexOutOfBoundsException e2) {
			System.out.println("caught Exception FISH ") ; 	
		}*/
		
	
		//both code are exactly same and after java 7, the following code was generated that can take care of the codes 
		
		try {
			// dangerous action in here
			System.out.println("inside try");
			String a = "khalili"; 
			
			//System.out.println( a.length()  );
			
			System.out.println( a.charAt(4) );
			
		}catch(NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e4 ) {
			System.out.println( e4.getClass() ); //this will give the name of the calss for that specific object. 
		  	
		}finally {
			System.out.println(" program came to finally block !!!");
		}
		
		
		//FINALLY KEWORD: It is just like default part of switch statement and it will run no matter if you have exception or not 
		
		//It will run no matter if you have exception or not, it will run always, only if you use System.exit(0);  
		
		//System.exit(0);  --> this just kill the block 
			
		System.out.println("program ended");
	 
		
		
		
		
		
		
		

	}
	
	

}
