package day58_ExceptionHandling02;

import java.io.IOException;

public class ThrowChecked {

	
	public static void main(String[] args) {
		
		//we need ot handle Checked Exception types 
		
		try {
			System.out.println("About throwing an exception !!!!");
			throw new IOException(); 
			
		} catch (Exception e) {
			System.out.println("Exception was caught and handled");
			e.printStackTrace();
		}
	
	}
}
