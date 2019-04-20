package day30_Method01;

import day31_Method02.calculator;

public class Cooking {
	
	public static void main(String[] args) {
		
		cook("Steak");
		youWillNeed("Meat, Oil, Salt & Tomato");
		cookFor(10, "Grilling"); // order is very important, if it is int first and then String, then follow the order first int and then String  
		ready(); 		
		waitress(); 
		
		calculator.Multiply(30, 500); 
		
		
	}
	
	/*
	 * method cook accepts String food name, and prints 
	 * "Today we are cooking foodName" 
	 */

	/*
	 * method youWillNeed, accepts a String with things we need 
	 * print "We need following items; items
	 */
	
	/*
	 * method cookFor accepts minutes and way of cooking and prints:  
	 * "You need to cook for that many minutes by means of wayOfCooking 
	 */
	
	/*
	 * method ready, does not accepts any parameters, 
	 * print: Meal is ready! Enjoy. 
	 */
	
	public static void cook(String foodName) {
		
		 System.out.println("Today we are cooking " + foodName + "." );
	}
	
	public static void youWillNeed (String items){
		
		 System.out.println("We need following items " + items + "."  );
		 
	}
	
	public static void cookFor(int minutes, String wayOfCooking) {
		
		System.out.println("You need to cook for " + minutes + " minutes by " + wayOfCooking );
	}
	
	public static void ready() {
		
		System.out.println("Meal is ready! Enjoy");
		
	}
	
	public static void waitress() {
		System.out.println("Your meal will be delivered soon by waitress");
	}
	
	
	
}
