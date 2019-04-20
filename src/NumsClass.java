import java.util.Arrays;

public class NumsClass {
		
		public static void main(String[] args) {
			
			
			Fibanachi(8); 
			
			for (int idx = 1; idx <=8; idx++) {
				
				System.out.print( Fibanachi(idx) + ", ");
			}
			 
		}
		
		public static int Fibanachi(int num) {
			
			if (num == 0) {
				return 0; 
			} else if (num == 1) {
				return 0; 
			}
			
			 int num1 = 0; 
			 int num2 = 1; 
			 int fib = 1; 
			  
			 for (int idx = 2; idx <=num; idx++) {
				 
				 fib = num1 + num2; 
				 num1 = num2; 
				 num2 = fib; 
			
		   }
			return fib;
			 
		}
		
		
		
		
      }
	
//	public static void main(String[] args) {
//		
//		
//		String [] names = {"Ahmad", "Sina", "Java"}; 
//		String[] reverseNames = new String[names.length];
//		
//		for(int i = names.length -1; i >= 0; i--){ 
//		reverseNames[names.length-1-i] = names[i];
//		}
//		
//		System.out.println(Arrays.toString(reverseNames));
//		
//		
//
//	}}

//It shows you misunderstood
//
//I think:)
  

