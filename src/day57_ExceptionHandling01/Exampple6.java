package day57_ExceptionHandling01;

import java.io.FileNotFoundException;
import java.util.concurrent.BrokenBarrierException;

public class Exampple6 {
	
	public static void main(String[] args) {
		
		//FileNotFoundException 
		
		System.out.println(" ABC ");
		
		FileNotFoundException e = new FileNotFoundException(); 
		
		//NullPointerException e = new NullPointerException(); 
		
		try {
			
			System.out.println("Doing dangerous action !!!>>>>>>");
			throw e;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			
			System.out.println("Handled the exception !!!");
		
		} finally {
			System.out.println("Finally block run");
		}
		
		
		
		int [] num = {1,23,4}; 
		
		try {
		System.out.println( num[4] );
		
		} catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("ArrayIndexOutOfBoundsException was caught");
		} finally {
			System.out.println("It is good to go now !!!");
		}
		
	}

}
