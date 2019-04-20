package day40_customclasses;

public class Test {
	
	public static void main(String[] args) {
		
		int [] a = {85, 75, 32, 95}; 
		int [] b = {15, 25, 23, 5}; 
		
		arrayPrint(a, b);
	
		
	}

	
	public static void arrayPrint(int [] num1, int [] num2) {
		
		
		int [] temp = new int [num1.length]; 
		
		for (int idx = 0; idx < num1.length; idx++) {
			
			temp[idx] = num1[idx] + num2[idx]; 
			
			if (temp[idx] == 100) {
				
				System.out.println(num1[idx] + " + " + num2[idx] + " = " + temp[idx]);
			}
		}
		
		
		
	}
	
}
