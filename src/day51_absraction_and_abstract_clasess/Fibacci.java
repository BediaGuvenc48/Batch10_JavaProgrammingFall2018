package day51_absraction_and_abstract_clasess;

public class Fibacci{
	
	
	public static void main(String[] args) {
		
		System.out.println( fibacci(5) ); 
		
		//System.out.println(Sequence(3,3) ); 
		
	}
	
	
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34 
	
	public static int fibacci(int n) {
		
		if (n == 1) {
			return 0; 
		} else if (n == 2) {
			return 1; 
		}
		
		int firstNumber = 1; 
		int beforeFirstNumber = 0; 
		int fibacci = 0; 
		
		for (int idx = 0; idx <= n; idx++ ) {
			
			fibacci = firstNumber + beforeFirstNumber; 
			beforeFirstNumber = fibacci - beforeFirstNumber; 
		    firstNumber = fibacci; 
			
		    System.out.print(fibacci + " ");
		}
		return 0;
	  }
	
	
	
	public static String Sequence(int num1, int num2) {
		
		StringBuilder stb = new StringBuilder(); 
	
		
		for (int idx = 1; idx <=num2; idx++) {
			
			num1 = num1 * 2; 
			
			stb.append(num1 + " "); 
			
		  }
		
		return stb.toString();  
		
	  }

    }
