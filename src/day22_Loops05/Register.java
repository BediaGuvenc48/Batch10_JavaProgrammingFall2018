package day22_Loops05;

import java.util.Scanner;

public class Register {
	
	public static void main(String[] args) {
		
		/*
		* Create a program called Register
		It will ask user how many items he purchased.
		Then based on that number it will ask item name and price that many times.
		You need to gather all items in one String variable items separated by comma
		And calculate sum of each item price into variable totalPrice.
		Then print out items and total price.

		Example:
		How many items are you purchasing?

		2
		What is item 1?
		Gloves

		How much is Gloves?
		10.44

		What is item 2?
		Hat

		How much is Hat?
		13
		----------
		Your items: Gloves, Hat
		Your total Price: $23.44
		* 
		* 
		* for MAC: COMMAND + SHIFT + O is used for Automatic import 
		* for Windows: CR + Shift+O is used for Automatic import 	
		* INDENTATION: select the lines of code and then press TAB
		* If you want to remove tab 
		*/
		
		
		/*String AllItems = ""; 
		double totalPrice = 0.0; 
		boolean b = true;
		int counter = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		int numOfItem = scan.nextInt(); 
		
		
		do {
			System.out.println("What is item " + counter);
			String item = scan.next();
			
			AllItems += item + ", ";
			
			System.out.println("What is item " + counter + " price: ");
			double price = scan.nextDouble(); 
			
			totalPrice += price;
			
			counter++;
			
			if (counter == numOfItem) {
				b = false;
			}
			
		}while (b);
		
		
		System.out.println("Your items are: " + AllItems);
		System.out.println("Your total price is: " + totalPrice);*/
		
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("-----WELCOME TO OUR STORE? :) \n");
		
		System.out.println("How many items you have?");
		int itemsCount = scan.nextInt(); 
	
			//Declare variables for all items and price for them 
		String allItems = ""; 
		double totalPrice = 0.0; 
		
		for (int idx = 1; idx <= itemsCount; idx++) {
			
			System.out.println("What is item name " + idx);
			String item = scan.next(); 
		
			System.out.println("How much is " + item );
			double itemPrice = scan.nextDouble(); 
			
			if (idx == itemsCount) {
				
				allItems = allItems + item;
				
			} else {
				
				allItems = allItems + item + ", ";
			}
		
			totalPrice = totalPrice + itemPrice;
		
		}
		
		System.out.println("Your items is " + allItems);
		System.out.println("Your total price is $" + totalPrice); 
	 
		
		//if we try to print out the item, it will not work, because it is outside the scope of loop 
		//System.out.println(item);
		//System.out.println(ItemPrice);
		scan.close(); 
		 
		 
		 
		
		
	}

}
