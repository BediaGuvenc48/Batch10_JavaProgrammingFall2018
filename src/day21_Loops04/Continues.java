package day21_Loops04;

public class Continues {
	
	public static void main(String[] args) {
		
//
//		 for(int i = 1; i <=5; i++){
//			   
//				System.out.println(i);
//				if(i > 2) {
//					break;
//				}
//			}
		
//	for (int k = 0; k <= 10 ; k++) {
//		if (k == 1 || k == 2) {			//if k = 1 or k=2, then don't print the value 
//										//continue is basically escaping a part of the code
//			continue; 
//		}
//		System.out.println("Value of K " + k);
		
		/*
		 * loop through numbers from 1 to 50 
		 * print each number in same line, speperated by space 
		 * if a number is divisible by 5 then skip it 
		 * if a number is divisble by 20 then exit the loop 
		 *  
		 */
		
		
		 
		
		for (int idx = 1; idx <= 50; idx++) {
			
			if (idx %5 == 0) {
				continue; 
			} else if (idx %20 == 0) {
				break; 
			}
			System.out.print(idx + ", ");
		}

		
		for (int idx = 1; idx <= 50; idx++) {
			
			if (idx % 5 == 0) {
				continue; 
			} 
			
			if (idx % 20 == 0) {
				break;
			}
			
			System.out.print(idx+ ", ");
		}
		
		System.out.println();
	
		
		for (int num= 1 ; num<= 50; num++) {
			
			if (num %5 == 0) {
				continue; 
			} else if (num %10 == 0) {
				continue; 
			} else if (num %20 == 0) {
				break;
			}
			
			System.out.print(num + ", ");
		}
		
		
		
		
		
	
		
		
	}

}
