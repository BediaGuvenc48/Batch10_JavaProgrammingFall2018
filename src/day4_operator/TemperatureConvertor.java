package day4_operator;

import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String [] args) {
		
		
		/*
		  Please change 55 C to Faranhite
		  use the scanner 
		  formula is 		: 		f = 9/5(c+32); 
		  
		    						(5.0/9) * (fahrenheit - 32); 
		 
		 */
			
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a value in Fahrentheit");
	int fahrenheit = scan.nextInt(); 
	double celcius = (5.0/9) * (fahrenheit - 32); 
	
	System.out.println("Temperature is Celcius:" + celcius); 
	
		
	}
	
	
	
}
