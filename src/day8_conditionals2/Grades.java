package day8_conditionals2;

public class Grades {
	public static void main(String[] args) {
		/*
		 * A, B, C, D
		 * use char variable for grade
		 * if grade is A ---> Excellent 
		 *  if grade is B ---> Good
		 *   if grade is C ---> Acceptable
		 *   if grade is D ---> See you next year 
		 */

		char grade = 'E'; 
		
		if (grade == 'A') {
			System.out.println("Excellent");
			System.out.println("Keep it up");
		}else if (grade == 'B') {
			System.out.println("Good");
			System.out.println("Good Job");
		}else if (grade == 'C') {
			System.out.println("Ok");
			System.out.println("Try your best");
		}else if (grade == 'D') {
			System.out.println("See you next year");
			System.out.println("Don't go out at the weekends");
		}else {
			System.out.println("Not a valid grade");
			System.out.println("Pick A - D for valid answers");
		}
		
	}

}
