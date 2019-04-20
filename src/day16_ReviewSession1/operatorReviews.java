package day16_ReviewSession1;
import java.util.Scanner;

public class operatorReviews {
	public static void main(String[] args) {
		
		/*
		 * arithmetic operators: +, -, /, *, % 
		 * shorthand assignment: +=, -=, /=, *=; 
		 * increment/decrement: --, ++; 
		 * camparison: >, <, =; 
		 */
		
		/*
		 * Example: 
		 * distance, pace 
		 * how many minutes it will take to reach destination 
		 * speed 50 miles to go 
		 * 5 mph --> how many minutes 
		 * how do you add 5 minutes in the result ? // use from increment 
		 */
		
		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter your pace: ");
//		double distanceInMile = scan.nextDouble(); 
//		
//		double distance = 34;
//		double mph = 20; 
//		double remainDistance = distance / mph;  
////		
////		double remainTimeInMinutes = remainDistance * 60; 
//		
//		System.out.println("Your remaining time is: " + remainTimeInMinutes);
//		
//		// you spend 5 minutes in traffic 
//		
//		remainTimeInMinutes += 5.0; 
//		
//		// you spend 1 minute extra because of a wrong turn 
//		
//		remainTimeInMinutes ++; 
		
//		System.out.println("Finally it takes " + remainTimeInMinutes + " minutes");
//		
//		int number = 10; 
//		
//		System.out.println(number / 3); //3, it escape the decimal portion, because of integer type 
//		System.out.println(number % 3); //1, it is the remainder of the divided number 
//		
//		System.out.println(number);
//		++number; // add 1 
//		System.out.println(number);
//		number++; //add 1 
//		System.out.println(number);
//
//		int num2 = ++number; 
//		System.out.println(num2);
//		System.out.println(number);
//		
//		num2 = number++ + ++number; 
//		System.out.println(num2);
//		System.out.println(number);
//		System.out.println(num2);
//		
//		num2 = ++number + number++; //28
//		
//		
//		
//	scan.close(); 	
//		
		
		
	/*
	 * Example: 
	 * distance, pace 
	 * how many minutes it will take to reach destination 
	 * speed 50 miles to go 
	 * 5 mph --> how many minutes 
	 * how do you add 5 minutes in the result ? // use from increment 
	 */
	
	//v = d/t;  
	double speed = 5.0; 
	double distance = 50.0; 
	double time = distance/speed; 
	
	System.out.println("It will take " + time + " hours to get to distanation");
	System.out.println("it will take " +(time * 60) + " minutes");
	
	scan.close(); 	
		
		
	}


}
