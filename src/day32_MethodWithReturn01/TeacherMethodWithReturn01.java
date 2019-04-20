package day32_MethodWithReturn01;
import java.util.*;
public class TeacherMethodWithReturn01 {

	//playGuessNumComputerOnly()
	//playGuessNumWithLimit(int limit)
	//playGuessNumComputerVSMe(int secretNum)
	
	public static void main(String[] args) {
		
		//playGuessNumComputerOnly();
		//playGuessNumWithLimit(8); 
		//playGuessNumWithLimit(2);
		
		playNumComputerOnly(); 
		
	}

	public static void playGuessNumComputerOnly() {
		Random random = new Random();
		int secretNumber = random.nextInt(10);
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess the secret number:");
			int guessNumber = random.nextInt(21);
			System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
			//check if secretNumber matches guessNumber
			if(guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
				break;
			}else {
				System.out.println("Wrong! Try again");
			}
			
		}while(true);
	}
	
	public static void playNumComputerOnly() {
		
		Random rn = new Random(); 
		
		int secNum = rn.nextInt(15); 
		
		int count = 0; 
		
		do {
			count++; 
			System.out.println("Guess the secNum");
			int guessNum = rn.nextInt(18); 
			System.out.println("Guesing Number is: " + guessNum + " Count is: " + count);
			
				if (secNum == guessNum) {
					System.out.println("You won, you guessed the right number");
					break; 
				} else {
					
					System.out.println("Wrong Guess! Try again");
				}

		} while (true); 
		
	}

	public static void playGuessNumWithLimit(int limit) {
		
		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess the secret number:");
			int guessNumber = random.nextInt(11);
			System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
			//check if secretNumber matches guessNumber
			if(guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
				break;
			}else {
				System.out.println("Wrong! Try again");
			}
			
			if(counter == limit) {
				System.out.println("You Lost! Game over!");
				break;
			}
			
		}while(true);
	
	}
	
	}
	

