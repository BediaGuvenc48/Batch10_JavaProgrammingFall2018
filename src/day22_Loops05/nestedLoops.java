package day22_Loops05;

public class nestedLoops {
	
	public static void main(String[] args) {
		
	/*
	 * Loop insdie the loop 
	 * Outer loop, inner loop 	
	 */
		
		//write a program that prints numbers from 1 to 10 in same line 
		//speperated by space. for looop 
		//add 1 more for loop and put everything from line 14 until 17 
		//needs to loop 5 times 
		//it basically says that whatever is inside the loop, repeat it 5 times 
//		
		for (int n = 1; n <= 3; n++) {
			for (int idx = 1; idx <=10; idx++) {
				
				System.out.print(idx + ", ");
			}
				System.out.println();
		
		}
		
	//	System.out.println("Outside the loop");
		
		//modify nested loop above so that it prints this pattern. 
		
		
		for (int n = 1; n <= 10; n++) {
			for (int idx = 1; idx <= n; idx++) {
				
				System.out.print(idx + ", ");
			}
				System.out.println();
		
		}

		System.out.println("Outside the loop");
		
		 System.out.println("Outside the loop");
		
//======================================================
	
	for (int i = 1; i <= 5; i++) {	 
		for (int idx = 1; idx <= i; idx++) {
			
			System.out.print(idx + " ");
		}
		System.out.println();
	}	
		
	for (int i = 5; i >= 1; i--) {	 
		for (int idx = 1; idx <= i ; idx++) {
			
			System.out.print(idx + " ");
		}
		System.out.println();
	}	
//			
	
	
	
	
	
	
	
	}

}
