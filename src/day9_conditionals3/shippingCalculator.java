package day9_conditionals3;

public class shippingCalculator {
	public static void main(String [] args) {
		
		/*
		 * price,  speed
		 * 
		 * Regular Shipping rates:
		 * purchase price			cost
		 *  1 - 100 				7 
		 * 	101 - 300				10
		 * 300 + 					free shipping 
		 * Express Shipping rates: 
		 *
		 * purchase price			cost
		 *  1 - 100 				35 
		 * 	101 - 300				25
		 * 300 + 					15
		 */
		
		int shippingMode = 1; //1 = regular, 2 = express 
		double purchasePrice = 400.0; 
		double shipingCost = 0.0; 
		
		if (shippingMode == 1) {
			
			System.out.println("Regular Shipping Mode");
		
		} if (purchasePrice >= 1.0 && purchasePrice <=100.0) {
			shipingCost = 7.0; 
			
		}else if (purchasePrice >= 101.0 && purchasePrice <=300.0) {
			shipingCost = 10.0;
		}else if (purchasePrice > 300.0) {
			shipingCost = 0.0;
			
			
		} else if (shippingMode == 2) { 
			System.out.println("Experss Shipping Mode");
			
		} else if (purchasePrice >= 1.0 && purchasePrice <=100.0) {
			shipingCost = 35.0; 
		}else if (purchasePrice >= 101.0 && purchasePrice <=300.0) {
			shipingCost = 25.0; 
		} else if (purchasePrice > 300.0) {
			shipingCost = 15.0; 
		}
		
		System.out.println("Total shipping cost: " + shipingCost); 
			

		
		
		
	}

}
