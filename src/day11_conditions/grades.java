package day11_conditions;
import java.util.Scanner; 
public class grades {
	
	public static void main(String[] args) {
		
		
		/*Task: 
		 * write a program which accepts char and use the 
		 * switch statemnt like follow: 
		 * 
		 * A - Excellent 
		 * B - Good 
		 * C - Acceptable 
		 * D - Poor 
		 * Anything else --- ERROR: invalid grade
		 */
	
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your grade type: ");
		
		char grade = scan.next().charAt(0); // get a Char from a Scanner  
		
		switch (grade) {
		
		case 'A': 
			System.out.println("Excellent");
			break; 
		case 'B': 
			System.out.println("Good");
			break; 
		case 'C': 
			System.out.println("Acceptable");
			break; 
		case 'D': 
			System.out.println("Poor");
			break; 
		default: 
			System.out.println("ERROR: Invalid grade");
		}
		
		
		
		
		
		
		
		
		
		scan.close(); 
		
		
		
		
		
	}

}
