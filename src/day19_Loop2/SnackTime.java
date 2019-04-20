package day19_Loop2;

public class SnackTime {

	public static void main(String[] args) {
		
	/*
	 * create a boolean variable hungry and assign true to it
	 * create int variable apples and assign 1 to it 
	 * Req; as long as your hungry, print "eating an apple" and increase the apple 
	 * once you eat 5 apples, you are no longer hungry 
	 */
	 
		
		boolean hungri = true; 
		
		int apple = 1; 
		
		while (hungri) {
			
			System.out.println("Eating an Apple");
			
			if (apple == 5) {
				System.out.println("No longer hungry !!!");
				break;
			}
			
			apple++; 
		}
			System.out.println("Apple Numbers: " + apple);
		
		
	
//		
//	boolean h = true; 
//	int apple = 1; 
//	
//	while (h) {
//		
//		System.out.println("I am eating apple");
//		
//		
//		if (apple == 10) {
//			System.out.println("I am full");
//			break; 
//		}
//		apple++; 
//	}	
//		
//	boolean hungry1 = true; 
//	
//	int apples1 = 1; 
//	
//	while (hungry1) {
//		
//		System.out.println("Eating an apple");
//		
//		if (apples1 == 5) {
//			System.out.println("I am not hungry");
//			break;
//		}
//		
//		apples1++;
//	}		
//			System.out.println("Number of apples: " + apples1);
//	
//		boolean hungri = true; 
//		int orange = 1; 
//		
//		while (hungri) {
//			System.out.println("I am eating an organe");
//			
//			if (orange == 5) {
//				hungri = false; 
//				System.out.println("I am no longer hungray");
//				 
//			}else {
//				
//				orange++;
//				
//			}
//				
//		}
//				System.out.println("total of oranges: " + orange); 
//		
//		
		
		
		
//		boolean hungry = true; //when we make the loop, we just put hungry, because it is already assigned in boolean as a true. 
//		int apples = 1; 
//		
//		while (hungry) {
//			System.out.println("eating an apple");
//				
//				if (apples == 5 ) {
//				hungry = false; 
//					System.out.println("you are no longer hungry");
//			} else {
//					apples++; 
//		}
//	}
//			System.out.println("Apples total: " + apples);
		
  }
//	
	
}
