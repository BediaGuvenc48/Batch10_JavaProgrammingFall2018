package day22_Loops05;

public class nestedLoopsTeacherExample {

	public static void main(String[] args) {
		
		/*
		 * 	Loop inside the loop.
	        Outer loop, inner/nested loop
		 */
		
		//write a program that prints numbers from 1 to 10 in same line 
		//separated by space. FOR LOOP
		//Add one more for loop and put everything from 14-17. needs to loop 5 times
	
//		
//		for (int idx = 1; idx <= 10; idx++) {
//			
//			System.out.print(idx + " ");
//		}
//		
//		for (int j = 14; j <= 17; j++) {
//			System.out.print(j + " ");
//		}

		for(int j = 1; j <= 12; j++) {//j = 1,2,3--> 12 
			
			for(int i = 1; i <= 10; i++) {//i=1,2,3,4,5,6,7,8,9,10
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	
		
//		System.out.println("Outside the loop");
//		/*
//		 * 12345678910
//		 * 12345678910
//		 * 12345678910
//		 * ...
//		 */
//		
//		//modify nested loops above so that it print this pattern:
//		/*
//		 * 1
//		 * 12
//		 * 123
//		 * 1234
//		 * 12345
//		 * 123456
//		 * 1234567
//		 * 12345678
//		 * 123456789
//		 * 12345678910
//		 */
//		
//		for(int j = 1; j <= 10; j++) {//j = 1,2,3
//			for(int i = 1; i <= j; i++) {//i=
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Outside the loop");
//		
//		/*
//		 * 12345678910
//		 * 123456789
//		 * 12345678
//		 * 1234567
//		 * 123456
//		 * 12345
//		 * 1234
//		 * 123
//		 * 12
//		 * 1
//		 */
//		for(int j = 10; j >= 1; j--) {
//			for(int i = 1; i <= j; i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		
//		/*
//		 *  1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 5 6 
//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 7 8 
//			1 2 3 4 5 6 7 8 9 
//			1 2 3 4 5 6 7 8 9 10 
//			1 2 3 4 5 6 7 8 9 10 
//			1 2 3 4 5 6 7 8 9 
//			1 2 3 4 5 6 7 8 
//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 5 6 
//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 7 8 
//			1 2 3 4 5 6 7 8 9 
//			1 2 3 4 5 6 7 8 9 10 
//			1 2 3 4 5 6 7 8 9 10 
//			1 2 3 4 5 6 7 8 9 
//			1 2 3 4 5 6 7 8 
//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1  

//		 * 
//		 */
//		
//		for (int outer = 1; outer <= 10; outer++) {
//			for (int idx = 1; idx <= outer; idx++) {
//				System.out.print(idx + " ");
//			}
//				System.out.println();
//	 }
//	 	
//	   for(int outer1 = 10; outer1 >= 1; outer1--) {
//			for(int idx = 1; idx <= outer1; idx++) {
//				System.out.print(idx+" ");
//			}
//				System.out.println();
//		}
//		for (int outer2 = 1; outer2 <= 10; outer2++) {
//			for (int idx = 1; idx <= outer2; idx++) {
//				System.out.print(idx + " ");
//			}
//				System.out.println();
//	 }
//	 	
//	   for(int outer3 = 10; outer3 >= 1; outer3--) {
//			for(int idx = 1; idx <= outer3; idx++) {
//				System.out.print(idx+" ");
//			}
//				System.out.println();
//		}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	 
}


