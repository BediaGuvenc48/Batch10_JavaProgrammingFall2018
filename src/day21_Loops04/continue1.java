package day21_Loops04;

public class continue1 {

	public static void main(String[] args) {
		
//	for (int i = 1; i <=5; i++) {
//		System.out.println(i);
//		if (i > 2) {
//			break;
//		}
//	}	
//		
//	for (int k = 0; k<=10; k++) {
//		if (k == 1 || k == 2) {
//			continue; 
//		}
//		System.out.println("Value of K-" +k);
//		
//	}	
		
		
	/*
	 * loop through 1 = 50 
	 * print each number in same line, seprated by space 
	 * if a number is divisible by 5 then skip it 
	 * if a number is divisible by 2 then exit the loop
	 */
		
		for (int idx = 1; idx <= 50; idx++) {
			
			if (idx % 2 == 0) {
				System.out.print(idx + ", ");
		}
			if (idx % 2 !=0) {
				System.out.println("Ode: " + idx);
			}
		
		}
//		for (int i = 1; i <=50; i++) {
//			if (i % 5 == 0) {
//				continue;
//			}  
//			
//				if (i % 20 == 0) {
//					break;
//			}
//				System.out.print(i + " ");
//		}
	
	}
}
