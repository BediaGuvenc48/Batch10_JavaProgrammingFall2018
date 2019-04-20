package day27_Arrays04;

public class ArrayTask {

	public static void main(String[] args) {
		
	/*
	 * Example: 
	 * arr -> ["apple", "banana"]
	 * prints app
	 * 		  ban	
	 */

		
		String [] arr = {"apple", "banana"}; 
		
		for (int idx = 0; idx < arr.length; idx++) {
			
			System.out.println( arr[idx].substring(0, 3) );
		}
		
		

		
//		String [] a2 = {"apple", "banana"}; 
//		
//		for (String a1 : a2) {
//			
//			System.out.println(a1.substring(0, 3));
//		}
//	
//	System.out.println("\n ----Test Ends---- ");
//		
//	
//	String [] arr = new String [] {"apples", "banana", "kiwi", "cherries"}; 
//	
//	for (String fruit : arr) {
//		System.out.println(fruit.substring(0, 3));
//	}
//	
//	System.out.println("\n---------- For Loop Starts -----------");
//	
//	for (int idx = 0; idx <arr.length; idx++) {
//		
//		System.out.println(arr[idx].substring(0, 4));
//		
//		
//		
//		
//	}	
	
		}
		
	
}
