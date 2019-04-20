package day29_Arrays06_multiD;
import java.util.Arrays;
public class teachersMethod {
	
	public static void main(String[] args) {
		
		/*
		 * Create a 2D array cars
		 * it should have 4 groups of cars
		 * 1. Japanese
		 * 2. German
		 * 3. American
		 * 4. Italian
		 */
		
	
		//int [] x = new int [5]; 
		
		int [][] xy = new int [1][4]; 
	 
		
		
		//String [] [] xy = { {}, {}, {}, {} }; 
		
		
		String [][] car = new String [4][7]; 
		
		
		String[][] cars = {
				           {"Honda", "Lexus" , "Toyota", "Acura", "Mazda" , "Nissan", "Subaru"},
				           {"Audi", "BMW" , "Porsche" , "VW" , "Mercedes benz"},
				           {"Dodge" , "Ford", "Tesla", "Jeep" , "Chevrolet", "Lincoln"},
				           {"Ferrari" , "Fiat", "Maserati", "Lamborghini", "Alfa romeo","Lacia"}

						  };
		
		for (int idx = 0; idx < cars.length; idx++) {
			
			for (int j = 0; j < cars[idx].length; j++) {
				
				System.out.println(cars[idx][j]);
			}
		
			System.out.println("\n ==========");
		}
		

		//1. Using for loop
		//outer loop -> we loop from 0 - cars.length
		//inner loop -> we loop 0 to cars[index].length. and access cars
		
	
		
//		for(int i = 0; i < cars.length; i++) {
//			
//			for(int j =0; j < cars[i].length; j++) {
//				
//				System.out.println(cars[i][j]);
//			}	
//		}
		
//		for(int i = 0; i < cars.length; i++) {
//			for(int j =0; j < cars[i].length; j++) {
//				System.out.print(cars[i][j] +" ");
//			}	
//			System.out.println();
//		}
//
//		//2. Using for each loop : enhanced for loop
//		
//		for(String[] carGroup : cars) {	
//			for(String car : carGroup) {
//				System.out.println(car);
//			}
//		}
//		
//		for(String[] carGroup : cars) {	
//			for(String car : carGroup) {
//				System.out.print(car +" ");
//			}
//			System.out.println();
//		}
//		
//		for(String[] carGroup : cars) {	
//			
//			System.out.println(Arrays.toString(carGroup));
//		}
//		
//		System.out.println(Arrays.deepToString(cars));
//		
//		
//		for(int i = 0; i < cars.length; i++) {
//			switch(i) {
//			case 0:
//				System.out.println("Japanese: ");
//				break;
//			case 1:
//				System.out.println("German: ");
//				break;
//			case 2:
//				System.out.println("American: ");
//				break;
//			case 3:
//				System.out.println("Italian: ");
//				break;
//			default:
//				System.out.print("Unknown group");
//			}
//			for(int j =0; j < cars[i].length; j++) {
//				System.out.print(cars[i][j] +" ");
//			}	
//			System.out.println();
//		}
		
		
	}

}
