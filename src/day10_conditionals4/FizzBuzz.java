package day10_conditionals4;
import java.util.Scanner; 
public class FizzBuzz {
	
	public static void main(String [] args) {
		
		/*
		 * for each multiple of 3, print "Fizz" instead of the number. 
		 * for each multiple of 5, print "Buzz" instead of the number. 
		 * for numbers which are multiple of both 3 and 5, print "fizzBuzz"
		 * instead of the number. 
		 * else print number itself. 
		 */
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		
		int number = scan.nextInt(); 
		
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("fizzBuzz");
		} else if (number % 5 == 0 ) {
			System.out.println("Buzz");
		} else if  (number % 3 == 0){
			System.out.println("Fizz");
		} else {
			System.out.println(number);
		}
		
//		
//		
//		
//		
//		
//		
//		Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Enter your number: ");
//		
//		int num = scan.nextInt(); 
//		 
//		
//		if ( num % 3 == 0 && num % 5 == 0) {
//			System.out.println("FizzBuzz"); 
//				
//				} else if (num % 3 == 0 ) {
//					System.out.println("Fizz");
//				} else if (num % 5 == 0) {
//					System.out.println("Buzz");
//				}else {
//					System.out.println("Number");
//				}
//		
//		
//		
//		
//		scan.close(); 
//		
//		
//			}
//			
//	
//		
//		
//		
//		
		
		scan.close(); 
	}
		
		
		
	}


