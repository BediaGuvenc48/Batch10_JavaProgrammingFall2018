package day20_loops03_forloop;
import java.util.Random;
import java.util.Scanner;
public class GuessANumberV2 {

	public static void main(String[] args) {
		
	/*
	 * Random is a class name, 
	 * The purpose of this class is to generate random numbers 
	 * 	
	 */
		
		/*
		 * Random is a class name,
		 * The purpose of this class is to generate random numbers
		 * we have 2 objects in this, Scanner and Random that are already written by someone and ready to use
		 * When you start Java, there are more than 5000 classes that are ready to use which comes with it 
		 * 
		 */
	
		/*
		 * Random is a class name,
		 * The purpose of this class is to generate random numbers
		 */
		
		
		Scanner input = new Scanner(System.in); 
		
		Random ran = new Random(); 
		
		int secNum = ran.nextInt(100); 
		
		int iTry = 0; 
		int guesNum = 0; 
		
		do {
			
			System.out.println("Gues a number between 1 - 100");
				guesNum = input.nextInt(); 
				iTry++;
				
				if (guesNum == secNum) {
					System.out.println("you won");
					break; 
				} else if (guesNum > secNum) {
					System.out.println("too large");
					break;
				} else {
					System.out.println("too small");
					
				} 
				
				if (iTry == 5) {
					System.out.println("You lost");
					System.out.println("Secrete Number is: " + secNum);
					break;
				}
			
		} while (guesNum != secNum && iTry <= 5);
		
		
		
	/*	Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		int secretNumber = random.nextInt(100);
		
		int guessedNumber;
		
		// only 5 chances to guess 
		
		int iTries=0;
		
		do {
		
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			iTries++;

			if(guessedNumber == secretNumber) {
				System.out.println("Congratulations! You won!");
				break;
				
			}else if(guessedNumber > secretNumber) {
				System.out.println("Too large");
			}else {
				System.out.println("Too small");
			}
			
			if(iTries == 5) {
				System.out.println("You lost!");
				System.out.println("Secret number is : " + secretNumber);
				break;
			}
			
		}while(secretNumber != guessedNumber && iTries <= 5 );
		
		//the difference between Return and Break, break only takes you from your loop, 
		//but Return, takes you out from the main method. 
		
		System.out.println("GAME OVER!!!");*/
		
		input.close();
	  
	}
} 



 		
		
		
