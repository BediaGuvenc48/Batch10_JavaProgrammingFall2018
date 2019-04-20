package day4_operator;

import java.util.Scanner;

public class AgeCalculator {
	public static void main(String [] args) {
	
	//Program to calculate age for a given birth year
	//currentYear, yearOfBirth, age 
	//ask user to enter currentYear value as well
	//calculate the age and print out the result

		
	int currentYear = 2018; 
	int yearOfBirth = 1985; 
	int age = currentYear - yearOfBirth; 
	
	//System.out.println("If you were born in " +yearOfBirth +  " then you are "   + age +  " years old");
	
	String output = "If you were born in " +yearOfBirth +  " then you are "   + age +  " years old"; 
	
	System.out.println(output);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Current Year");
	int n = scan.nextInt();
	System.out.println(n);
	

	scan.close(); 
		
	}

}
