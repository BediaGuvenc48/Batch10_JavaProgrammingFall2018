package day7_conditionals;

public class IfElseStatements {
	
	public static void main(String[] args) {
		
		double coffeePrice = 8.50; 
		if (coffeePrice < 6.0) {
			System.out.println("I will get coffee");
			
		}else { 
			System.out.println("I will not get coffee, Too expensive");
		}
		
		double accountBalance = 450.50; 
		double price = 800; 
		
		//if you have enough money, you buy the item 
		//otherwise you say not enough balance 
		
		if (accountBalance >= price) {
			System.out.println("I buy the item");
		} else { 
			
			System.out.println("I don't have neough balance, not buying");
			System.out.println("Let's wait for next paycheck");
		}  
			
		/*
		 * create 2 variables, speedLimit & currentSpeed
		 * if currentSpeed is more than 20 mph compared to speedLimit 
		 * then you are getting a speeding ticket. 
		 * otherwise keep driving 	
		 */
		
		int speedLimit, currentSpeed; 
		
		speedLimit = 55; 
		currentSpeed = 65; 
		
		if (currentSpeed > speedLimit + 20) { 
			
			System.out.println("Hey, Slow Down");	
			System.out.println("Your are going to get a ticket");
		}else { 
			
			System.out.println(" Good job");
			System.out.println("Keep driving");
		}
		
		System.out.println("=======================");
		
		/*
		 * create a boolean variable isPrime 
		 * if isPrime is true then shipping is 0.0 
		 * if not then shipping is 7.99
		 */
		boolean isPrime = false; 
		
		if (isPrime) { 
			
			System.out.println("Shipping cost will be O.0");
		}else {
			
			System.out.println("Shipping cost will be 7.99");
		}
		
		
		
		}
	
	
		
		
	}


