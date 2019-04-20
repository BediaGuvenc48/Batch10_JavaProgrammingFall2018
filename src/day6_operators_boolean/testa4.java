package day6_operators_boolean;
import java.util.Scanner; 
public class testa4 {
	
	public static void main (String [] args) {
		
		//Program to calculate age for a given birth year
		//currentYear, yearOfBirth, age 
		//ask user to enter currentYear value as well
		//calculate the age and print out the result
			
		Scanner zipra = new Scanner(System.in); 
		
		System.out.println("Enter Current Year: "); 
		int currentYear = zipra.nextInt(); 
		System.out.println("Enter year of birth: "); 
		int yearOfBirth = zipra.nextInt(); 
		
		int age = currentYear - yearOfBirth; 
		System.out.println("Your Age wil be: " + age);  
		
		
		zipra.close(); 
		
		
		
		
		
	}

}
