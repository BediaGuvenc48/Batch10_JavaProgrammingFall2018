package day24_LoopsAndArrays;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
/*	for (int outer = 1; outer <= 10; outer++) {
		System.out.println("-----------------");
		for (int inner = 1; inner <= 10; inner++) {
			int result = inner * outer; 
			System.out.println("| "+"outer: " + outer + "inner: " + inner+ " = " + result + "\t|");
		}
		
		System.out.println("-----------------");
	}
		*/
		
		
		for (int idx = 1; idx <= 10; idx++) {
			
			for (int j = 1; j <= 10; j++) {
				
				System.out.println(j + " x " + idx + " = " + j*idx );
			}
		}
		
//		for (int idx = 1; idx <= 10; idx++) {
//			
//			for (int j = 1; j <= 10; j++) {
//				
//				System.out.print(" | " + j + " x " + idx +  " = " + j*idx + " | ");
//			}
//			System.out.println();
//		}
//	  }
		
		
		
		
		
		
	}
	

}
