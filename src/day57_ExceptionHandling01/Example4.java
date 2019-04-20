package day57_ExceptionHandling01;

public class Example4 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Task 2: 
		 * 
		 * try to create a code that might throw ArrayOutOfBoundException 
		 * and try to end your program gracefully without seeing error codes in console. 
		 * 
		 * try to fix the program and see what you see 
		 */
		
		
		
 		try {
			
			int [] nums = {5, 20, 30, 60}; 
			
			System.out.println(nums[6]); 
			
			//System.out.println(nums[2]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException(); --> behind the seens it happens like this 
			
			System.out.println(" This was to check if ArrayOutOfBoundException or not !!!! ");
			//e.getMessage(); 
			
			e.printStackTrace(); //--> this is just reporting the the exception 
		}
		
		System.out.println("Check the end of program");
		
		
		
		
	}

}
