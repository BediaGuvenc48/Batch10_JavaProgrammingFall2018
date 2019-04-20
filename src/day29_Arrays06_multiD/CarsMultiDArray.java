package day29_Arrays06_multiD;

import java.util.Arrays;

public class CarsMultiDArray {
	
	public static void main(String[] args) {
		
	/*
	 * Create a 2D called cars 
	 * it should have 3 groups of cars 
	 * 1. Japaness 
	 * 2. German 
	 * 3. American 
	 * 4.Italian 
	 
	 */
	
		String [][] cars = new String [][] {{"Toyota", "Honda", "Nissan"}, 
							{"Mercedez", "BMW", "Audi"}, 
							{"Dodge", "Jeep", "Sheve", "Chryslor"}, 
							{"Farari", "Tesli"},}; 
							
		System.out.println(cars[1][2]);
		System.out.println(Arrays.deepToString(cars));
		
		//1. Using for loop 
		// outer loop -> we loop from 0 - cars.length 
		//inner loop -> we loop 0 to cars [index].length. and acces cars 
		
		
		
		for (int i = 0; i < cars.length; i++) {
			
			if (i == 0) {
				System.out.print("Japanes Cars");
				
			}else if (i == 1) {
				System.out.println("German Cars");
				
			} else if (i == 2) {
				System.out.println("American Cars");
			} else if (i == 3) {
				System.out.println("Italiyan Cars");
			}
			
			for (int j = 0; j < cars[i].length; j++) {
				
				System.out.println(cars[i][j]);
			}
		}
		
		System.out.println();

		for (int i = 0; i < cars.length; i++) {
			
			for (int j = 0; j < cars[i].length; j++) {
				
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	//2. Using for each loop : enhanced for loop, 
	// we say go to the Array and pick up each individual Array inside the car groups 
	
		for (String [] carGroup : cars) {
			
			for (String car : carGroup) {
				System.out.println(car);
				
			
			}
		}
		
		System.out.println();
		
		for (String [] carGroup : cars) {
			
			for (String car : carGroup) {
				System.out.print(car + ", ");
			}
		}
		
		System.out.println();
		
	for (String [] carGroup : cars) {
			
			System.out.println(Arrays.toString(carGroup));
		}
	

	}

}
