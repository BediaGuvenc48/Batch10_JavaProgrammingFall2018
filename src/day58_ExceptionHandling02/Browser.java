package day58_ExceptionHandling02;

import java.time.LocalDateTime;

public class Browser {
	
	public static void main(String[] args)throws InterruptedException {
	
		/*
		 	Handle or declare Rules: it is applied Whenever we deal with code that throws a checked exception 
		 	
		 	1. Handle it -> try catch finally 
		 	2. Declare it -> throws Exception type 
		 	3. Handle and Declare at same time 
		 	
		 	
		 	Throws Keyword in Java: 
		 	
		 	It is used to declare that a method might throw a certain type of exception, it is placed in method declaration line. 
		 	
		 	
		 */
		
		System.out.println(LocalDateTime.now());
		
		Browser.sleep(5);
		
		
//		try {
//		Browser.sleep(5);
//		}catch(InterruptedException e) {
//			e.getMessage(); 
//		}
		System.out.println(LocalDateTime.now());
	}
	
	
	public static void sleep(int seconds) throws InterruptedException {
		
		Thread.sleep(seconds * 1000);
		
//		try {
//			Thread.sleep(seconds * 1000);
//			
//		}catch (InterruptedException e) {
//			System.out.println(e.getMessage()); 
//		}
	} 

}
