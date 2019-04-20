package day25_Arrays;

public class CountMatches {
	
	public static void main(String[] args) {
		
	/*
	 * create a double array called prices 
	 * assign 10 or more different prices 
	 * using a loop count how many items that is more than $20 
	 * print the count 
	 * if no price was found that is more than $20 then print 
	 * "No items that costs more than $20 	
	 */
	
		double [] priceNum = {5.99, 9.99, 20.99, 15.99, 10.99, 25.99, 300.99, 400.99};
		
		double targetNumber = 20; 
		
		for (int i = 0; i < priceNum.length; i++) {
			
			if (priceNum[i] > targetNumber) {
				
				System.out.print(priceNum[i] + " ");
			}
		 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		for (int idx = 0; idx < priceNum.length; idx++) {
//			
//			if (priceNum[idx] >= targetNumber) {
//			
//				System.out.print(priceNum[idx] + " ");
//		}	
//     }
	
		
//		double [] prices = {5.99, 9.99, 20.99, 15.99, 10.99, 25.99, 300.99, 400.99, 600.99, 369.99};  
//			
//		int targetN = 20; 
//		int counter = 0; 
//		
//		for (int i = 0; i < prices.length; i++) {
//			
//			if (prices[i] > targetN) {
//				counter++; 
//				
//			} else {
//				
//				System.out.println("No items that costs more than $20 ");
//			} 
//		}	    
//			System.out.println("Items more than 20 usd: " + counter);
		
			
//		double targetPrice = 20; 
//		
//		int count = 0; 
//		
//		for (int idx = 0; idx < prices.length; idx++) {
//			
//			if (prices[idx] > targetPrice) {
//				System.out.println(count + " prices were found more than " + targetPrice);
//				count++; 
//			
//			} else {
//				System.out.println("no price was found");
//			}
//		}
	
		
//		int count = 0; 
//		for (double price : prices) {
//			if (price > 20.0) {
//				count++; 
//		}
//		
//	}
//		if (count == 0) {
//			System.out.println("No items for more than $20");
//		} else {
//			System.out.println(count + " items are more than $20");
		}
		
		
	 
		
	}


