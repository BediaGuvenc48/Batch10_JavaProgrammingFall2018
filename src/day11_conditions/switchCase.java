package day11_conditions;

import java.util.Scanner;

public class switchCase {
	
	public static void main(String[] args) {
		
		/*
		 *  cybertekBuilding; 
		 * int floor; 
		 * 
		 * if 1  -> Lobby
		 */
		// 1 - Lobby, 2 - Google, 3 - Cybertek, 4 - Apple 
		
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Enter the floor number: ");
		
		int floorNumber = scan.nextInt(); 
		
		if (floorNumber == 1) {
			System.out.println("Lobby");
		} else if (floorNumber == 2) {
			System.out.println("Google");
		} else if (floorNumber == 3) {
			System.out.println("Cybertek");
		} else {
			System.out.println("Apple");
		}
		
		
		switch (floorNumber) {
		
		case 1: 
			System.out.println("Lobby");
			break; 
		case 2: 
			System.out.println("Google");
			break; 
		case 3: 
			System.out.println("Cybertek");
			break; 
		case 4: 
			System.out.println("Apple");
			break; 
		default: 
			System.out.println("This floor does not exist");
			
			
		}	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int floor = 3; 
	
		if (floor == 1) {
			System.out.println("Lobby");
		} else if (floor == 2) {
			System.out.println("Google");
		}else if (floor == 3) {
			System.out.println("Cybertek"); 
		}else if (floor == 4) {
			System.out.println("Apple");
		}else {
			System.out.println("No such floor");
		}
		
		switch (floor) {
		case 1: 
			System.out.println("Lobby");
			break; 
		case 2: 
			System.out.println("Google");
			break; 
		case 3: 
			System.out.println("Cybertek");
			break; 
		case 4: 
			System.out.println("Apple");
		default: 
			System.out.println("No such floor exist");
			
		} 
	
		
		
		
		
		
		
		
		
	}

}
