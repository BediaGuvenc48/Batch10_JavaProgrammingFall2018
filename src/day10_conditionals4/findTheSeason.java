package day10_conditionals4;
import java.util.Scanner; 
public class findTheSeason {

	public static void main (String [] args) {
		
	/*
	 * find a season 
	 * month --> number and find the season of the year for that month number. 
	 * 	
	 * Leap year (February 29 days) 
	 * if an year is 1) multiple of 400 or 
	 * 2) multiple of 4 but not multiple of 100 then its a leap year. 
	 */
		
		//Scanner scan = new Scanner(System.in); 
		
		//System.out.println("Please enter the month: ");
		
		//int month = scan.nextInt(); 
		
		
		//int season = 3; 
		
		//if (month >= 3 && month <= 5) { 
		//	System.out.println("Spring");
		
		//} else if (month >= 6 && month <= 8) {
		//	System.out.println("Summer");
		//} else if (month >= 9 && month <= 11) {
		//	System.out.println("Fall");
	//	} else if  (month == 12 || month == 1 || month == 2) {
			
	//		System.out.println("Winter"); 
	//	} else {
	//		System.out.println("only the months are from 1 - 12");
	//	}
			
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your year:");
		int year = scan.nextInt();  
		
		if  (year%400 == 0) {
			
			System.out.println("It is leap year");
		} else if (year %4 == 0 && year %100!= 0 ){
			System.out.println("It is a leap year again");
			
		}else {
			System.out.println("It is not a leap year");
		}
	
		scan.close(); 
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

