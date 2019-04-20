package day11_conditions;
import java.util.Scanner; 
public class warmUpTasks {
	public static void main(String [] args) {
		
		/* write a program called checklist 
		 * we have a day with a number in it and we check what day it is. 
		 * String classAtSchool = "group project"; 
		 * String WeekdayName = "Monday"; 
		 * 
		 */
		
	
	
		String classAtSchool = "" ,weekdayName = ""; 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter number of day in week");
		int day = scan.nextInt(); 
		
		if (day < 0 && day >= 8) {
			
			System.out.println("Invalid Number");
		} else if (day == 1) {
			weekdayName = "Monday"; 
			classAtSchool = "Group Project"; 
		} else if (day == 2) {
			weekdayName = "Tuesday"; 
			classAtSchool = "Java"; 
			
		}else if (day == 3) {
			weekdayName = "Wednesday"; 
			classAtSchool = "Java"; 
		} else if (day == 4) {
			weekdayName = "Thursday"; 
			classAtSchool = "SDLC Classes"; 
		} else if (day == 5) {
			weekdayName = "Friday"; 
			classAtSchool = "No Class";
		} else if (day == 6) {
			weekdayName = "Saturday"; 
			classAtSchool = "Java Programming"; 
		}else if (day == 7) {
			weekdayName = "Sunday"; 
			classAtSchool = "Java Programming"; 
		} else {
			System.out.println("Error: The week days are only 7 Day"); 
		}
		{
		
		System.out.println("Day of Week: " + weekdayName + "\n" + "Class: " + classAtSchool);
	}
	
	scan.close(); 	
		
	}

}
