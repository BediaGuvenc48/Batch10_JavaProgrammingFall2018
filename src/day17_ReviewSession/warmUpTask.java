package day17_ReviewSession;

import java.util.Scanner;

public class warmUpTask {
	
	public static void main(String[] args) {
		
	/* 
	 * write a program check age and status by number of months: 
	 *  1 month - Neonate 
	 *  1 - 6 months = infant 
	 *  12 - 36 months = pre-School 
	 *  37 - 60 months = Toddler
	 *  61 - 144 months = school age child 
	 *  145 - 216 months = Adolescent 
	 *  217 - 480 months = Young Adult 
	 *  481 - 780 months = Middle age Adult 
	 *  > 780 months = senior Adult 
	 *  	
	 */
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter age month: ");
		double age = scan.nextDouble(); 
		
		if (age > 0 && age<= 1) {
			System.out.println("Neonate");
			System.out.println("The age in year is" + age/12.0 + " Years Old");
		} else if (age > 1 && age <=12) {
			
			System.out.println("infant");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		} else if (age > 12 && age <= 36) {
			System.out.println("Pre-School");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		} else if (age > 36 && age <=60) {
			System.out.println("Toddler");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		}else if (age > 60 && age <144) {
			System.out.println("School Age");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		}else if (age > 144 && age <=216) {
			System.out.println("Adolescent");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		} else if (age > 216 && age <=480) {
			System.out.println("Young Adult");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		}else if (age > 480 && age <=780) {
			System.out.println("Middle Age Adult");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		} else if (age > 780) {
			System.out.println("Senior Adult");
			System.out.println("The age in year is " + age/12.0 + " Years Old");
		} else {
			System.out.println("Not born yet");
		}
		
		
		scan.close();
		
		
		
		
	}	

}
