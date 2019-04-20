package day58_ExceptionHandling02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		try {
//		FileReader reader = new FileReader("names.txt"); 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace(); 
//		}
		
		
		FileReader reader = new FileReader("names.txt"); 
		
		
		/*Handle-or-Declare Rules: 
		
		-> Whenever a porgrammer uses a line of code that throws a checked exception, then we have 2 ways to handle it. 
		
		1) handle it using try catch 
		2) declare using throws kewyord. 
		
		*/
		
		
	}
	
	
	
	
	
	

}
