package day34_MethodWithReturn03;

public class Practice {
	
	
	public void printAllNumbersArray(int [] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
		}
			System.out.println();
	}
	
	
	public void printAllNumbers(int ... numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
		}
			System.out.println();
	}
	
	

}
