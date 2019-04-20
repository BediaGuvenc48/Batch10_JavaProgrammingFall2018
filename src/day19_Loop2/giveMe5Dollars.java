package day19_Loop2;
import java.util.Scanner; 
public class giveMe5Dollars {
	
	public static void main(String[] args) {
		
		 /* Req: As for 5 dollars 
		 * and keep asking for 5 dollars until you get it. 
		 * or User enters it. 
		 */
		
		
		Scanner scan = new Scanner (System.in); 
		int money = 0; 

		do {
			
			System.out.println("Give me 5 dollars");
			
		    int input = scan.nextInt(); 
			
			if (input == 5) {
				System.out.println("Thank you !!!");
				break; 
			}
		
			
			
		} while (money != 5); 
		
//		
//		
//		
//	Scanner scan = new Scanner(System.in); 
//	
//	int money = 0; 
//	
//	do {
//		
//		System.out.println("Give me $100");
//		money = scan.nextInt(); 
//		
//	} while (money != 100); 
//			System.out.println("Thanks for 100 dollars");
//		
//			scan.close(); 
//		
//		Scanner input = new Scanner(System.in);
//		int amount = 0; 
//		//it should give chance to user to give $5 only max 3 attempts.
//					  // Home Work
//		
//		do {
//			
//		System.out.println("give me 5 dollars");
//			amount = input.nextInt();
//			
//		} while (amount !=5); 
//			System.out.println("Thank you for $5");
			 
			 scan.close(); 
	}

}
