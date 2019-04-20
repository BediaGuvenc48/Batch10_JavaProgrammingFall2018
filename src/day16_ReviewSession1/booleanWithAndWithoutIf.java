package day16_ReviewSession1;

import java.util.Scanner;

public class booleanWithAndWithoutIf {

	public static void main(String[] args) {
	
		
		/*
		 * aritmathic operators: <, <=, >=, !=, == 
		 * logical operators: &&, ||, !, ^ 
		 * &  && (short circuit) 
		 * & will test both conditions all the time 
		 * && will not test both conditions if first one is false 
		 * 5 > 6 & 4 > 5 -> false 
		 * 5 > 6 && 4 > 5 -> false, and will not test second condition 
		 * 6 > 3 && 4 > 5 -> false, will test both, Because the first is true and the second one needs to be tested as well. 
		 */
		
//		boolean b = 12 > 10; 
//		System.out.println(b);
//		b = 12 > 10 && 10 < 15; 
//		
//		System.out.println(!!b); // Exclamation (!) always makes true to false and false to true. 
//		
//		int zipcode = 22102; 
//		
//		if (zipcode >= 22102 && zipcode++ <= 22200) {
//			System.out.println("Mclean");
//		}else {
//			System.out.println("Not Mclean");
//		} 
//		System.out.println(zipcode);
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your money in USD: ");
		double budget = scan.nextDouble(); 
		
		double phone = 250.0; 
		double watch = 105.5; 
		double bag = 80.0; 
		
//		double numberOfPhone = budget / 250.0; 
//		double numberOfWatch = budget / 105.5; 
//		double numberOfBag = budget / 80.0; 
		
//		*  budget< 80 -> cannot buy anything
//		 * > 435 -> u can buy everything
//		 * if budget >= phone+watch
//		 * 	you can buy phone+watch
//		 * 	or phone+bag
//		 * 	or watch + bag
//		 * if budget >= phone+bag
//		 * 	you can buy phone+bag
//		 *  or watch + bag
//		 * if budget >= watch+bag
//		 * 	you can buy watch+bag
//		 * 	
//		 * if budget >= phone
//		 * 		you can buy phone
//		 * 	   or watch+bag
//		 * if budget >= watch
//		 * 		you can buy watch
//		 * 		or bag
//		 * else
//		 * 	just a watch
		
		
		if(budget < 80.0) {
			System.out.println("Cannot buy anything");
		}else if(budget >= 435.5) {
			System.out.println("You can buy all items");
		}else if(budget >= phone+watch) {
			System.out.println("You can buy Phone+Watch OR Phone+Bag OR watch+Bag");
		}else if(budget >= phone+bag) {
			System.out.println("you can buy phone+bag OR watch + bag");
		}else if(budget >= phone) {
			System.out.println("You can buy phone OR watch+bag");
		}else if(budget >= watch+bag) {
			System.out.println("You can buy watch+bag");
		}else if(budget >= watch) {
			System.out.println("You can buy a watch or a bag");
		}else {
			System.out.println("You can buy a bag");
		} 
		
			
		
	scan.close();	 
		
		
		
	}
	
	
	
	
}
