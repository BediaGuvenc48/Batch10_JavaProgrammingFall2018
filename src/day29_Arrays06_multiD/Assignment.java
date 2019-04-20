
package day29_Arrays06_multiD;


public class Assignment {
	
	public static void main(String[] args) {
		
		/*
		 * Create a 2D called cars 
		 * it should have 3 groups of cars 
		 * 1. Japaness 
		 * 2. German 
		 * 3. American 
		 * 4.Italian 
		 
		 */
		
	String [][]	motors = {{"Hilux", "Corolla", "Camry"}, {"Mercdez", "BMW"}, {"Doge", "Shevi"}, 
			{"Farari", "Italian Super"} }; 
	
		
		for (int idx = 0; idx <motors.length; idx++) {
			
			if (idx == 0) {
				System.out.println("\n ******************");
				System.out.println("Japanes Cars");
				
				
			} else if (idx == 1) {
				System.out.println("\n ******************");
				System.out.println("Geramn Cars");
				
				
			} else if ( idx == 2) {
				System.out.println("\n ******************");
				System.out.println("American Cars");
			
				
			} else if (idx == 3) {
				System.out.println("\n ******************");
				System.out.println("Italian cars");
				
			}
			
			for (int j = 0; j < motors[idx].length; j++) {
				
				System.out.println(motors[idx][j]);
			}
			
			
				
		}
		
			String [][] cars = new String [][] {
	{"Toyota", "Honda", "Nissan"}, {"Mercedez", "BMW", "Audi"},{"Dodge", "Jeep", "Sheve", "Chryslor"},{"Farari", "Tesli"},}; 
			
			//1. Using for loop 
			// outer loop -> we loop from 0 - cars.length 
			//inner loop -> we loop 0 to cars [index].length. and acces cars 
			
			
			
			for (int i = 0; i < cars.length; i++) {
				
				if (i == 0) {
					System.out.print("Japanes Cars");
					
					System.out.println("\n===================");
					
				}else if (i == 1) {
					
					System.out.println("German Cars");
					
					System.out.println("\n===================");
					
				} else if (i == 2) {
					System.out.println("American Cars");
					System.out.println("\n===================");
				} else if (i == 3) {
					System.out.println("Italiyan Cars");
					System.out.println("\n===================");
				}
				
				for (int j = 0; j <cars[i].length; j++) {
					
					System.out.println(cars[i][j]);
				}
			}
		
		System.out.println("======================================");
		
		for (int i = 0; i < cars.length; i++) {
			
			switch (i) {
			
			case 0: 
				System.out.println("Japanes Cars");
				break; 
			case 1: 
				System.out.print("German cars");
				break; 
			case 2: 
				System.out.print("American cars");
				break; 
			case 3: 
				System.out.print("Italyian cars");
				break; 
			default: 
				System.out.print("invalid car type");
			
			}
			
			for (int j = 0; j <cars[i].length; j++) {
				
				System.out.println(cars[i][j]);
			}
		}
		
	}

}
