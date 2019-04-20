package day10_conditionals4;

public class priceChecker {

	public static void main(String[] args) {
		
	/*
	 * item -> 1 - 50 -> "Cheap" 
	 *  -. 50 - 100 -. "Expensive"
	 *  "Not buying"; 	
	 */
	
		//int item = 50; 
		
		//if (item >= 1 && item <= 50) {
		//	System.out.println("Cheap");
		//}else if  (item > 50 && item <= 100) {
		//	System.out.println("Expensive");
		//} else {
		//	System.out.println("Not buying");
		//}
		
		
		int price = 101; 
		String status; 
		
		if (price >= 1 && price <= 50) {
			status = "Cheap"; 
		} else {
			if (price >= 51 && price <= 100) {
				status = "Expensive"; 
			} else {
				status = "Not Buying"; 
			}
		}
		
		System.out.println("Status with If: " + status);
		
		status = (price >= 1 && price <= 50) ? "Cheap": (price >= 51 && price <= 100) ? "Expensive" : "Not Buying"; 
		
		
		 System.out.println("Status with ? " + status);
		 
		
		
		
		
		
		
		
		
	}
	
	
}
