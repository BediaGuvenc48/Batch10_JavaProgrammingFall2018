package day43_classes_static_constructor02;

public class Calculator {
	
	public String operation ; 
	
	public static double add(double num1, double num2) {
		
		//operation = "add"; --> will not work 
		return num1 + num2; 
	}

	public static double minus(double num1, double num2) {
		
		return num1 - num2; 
	}

	public double multiply(double num1, double num2) {
		
		operation = "multiply"; 
		return num1 * num2; 
	}

	public static void multiply2(double num1, double num2) {
		
		//System.out.println( multiply(num1, num2) );=> will not work //because the non static method is trying to talk with static method 
		//static can not call the non-static one, if you go to main method, it is static and you can call the name of class direclty and it will work 
		
	
	}						
	
	
}
