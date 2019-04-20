package day20_loops03_forloop;
import java.util.Random;
import java.util.Scanner;
public class GuessANumber {

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
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//give me random number between 0 and 9
		//System.out.println(random.nextInt(10));
		
		int secretNumber = random.nextInt(10);
		int guessedNumber;
		
		do {
			System.out.println("Guess the number:");
			guessedNumber = input.nextInt();
			
			if(guessedNumber == secretNumber) {
				System.out.println("Congratulations! You won!");
				
			}else {
				System.out.println("Incorrect guess. Try again");
			}
			
		}while(secretNumber != guessedNumber);
			
		input.close();
		
	}	
	
}
