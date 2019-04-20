package day4_operator;

	import java.util.Scanner; 
	
	
	
		
	
	
	

	//bring Scanner class code so that I can use in my program
	//Program to calculate age for a given birth year
	//currentYear, yearOfBirth, age 
	//ask user to enter currentYear value as well
	//calculate the age and print out the result
		
public class AgeCalculatorWithScanner {
	public static void main (String [] args) {
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter year of birth"); 
//		//let user to enter an int number during execution
//		int yearOfBirth = scan.nextInt();
//		//Systemm.out.println("Year of birth is " + yearOfBirth); 
//		//ask for current year or year of the death
//		System.out.println("Eter current year:"); 
//		int currentYear = scan.nextInt(); 
//		
//		int age = currentYear - yearOfBirth; 
//		System.out.println("If you are born on " + yearOfBirth + " and current year is " + currentYear + " then you are " +  age + " years old.");
//		
//		 
//		
		

		
		//bring Scanner class code so that I can use in my program
		//Program to calculate age for a given birth year
		//currentYear, yearOfBirth, age 
		//ask user to enter currentYear value as well
		//calculate the age and print out the result
	
		Scanner sc = new Scanner(System.in); 
		
		
		
		System.out.println("Enter the current year");
		int currentYear = sc.nextInt(); 
		System.out.println("Enter the year of birth");
		int yearOfBirth = sc.nextInt(); 
		
		int age = currentYear - yearOfBirth; 
		
		System.out.println("Your age will be: " + age); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
