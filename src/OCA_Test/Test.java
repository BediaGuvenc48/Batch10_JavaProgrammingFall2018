package OCA_Test;

import java.util.*;


//public class X {
	
	//Question # 28 
		
	/*	static int i; 
		int j; 
		
		public static void main(String[] args) {
			
			X x1 = new X(); 
			X x2 = new X(); 
			x1.i = 3; 
			x1.j = 4; 
			x2.i = 5; 
			x2.j = 6; 
			System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
		
		}*/
	
			//Answer: -> 5456
	
	//}

//Question # 29: 

	/*public class Test {
		
		public static void main(String[] args) {
			
			
			int [] array = new int [2];  
			array[0]= 10; 
			array[1]= 20; 
			
			System.out.println(array[0] + " " + array[1]);
		}
		
		
	}*/

//Question # 30: 


/*public class Test {
	
	public static void main(String[] args) {
		
		
		String [] arr = {"A", "B", "C", "D"}; 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i].equals("C")) {
				continue; 
			}
			System.out.println("Work done");
		}
			
	}
	
	
}*/
		/*Answer: -> Ir run in Eclipse and it shows like this: 
			A 
			Work done
			B 
			Work done
			C 
			D 
			Work done*/


	//Question # 32: 

	/*public class Greeting {
		
		public static void main(String[] args) {
			
				System.out.println("Hello " + args[0]);
			
		}
	}
	
		//Answer: -> javac Greeting.java 
						java Greeting Duke*/
	

	//Question # 32: 

	/*class Alpha {
		
		int ns; 
		static int s; 
		Alpha (int ns){
			if (s < ns) {
				s = ns; 
				this.ns = ns; 
			}
		}
		void doPrint() {
			System.out.println("ns = " + ns + " s= " + s);
		}
		
	}
		public class Test {
			
			public static void main(String[] args) {
				
				Alpha ref1 = new Alpha(50); 
				Alpha ref2 = new Alpha(125); 
				Alpha ref3 = new Alpha(100); 
				ref1.doPrint();
				ref2.doPrint();
				ref3.doPrint();
			}
		}

		Answer: -> 
		
		ns = 50 s= 125
		ns = 125 s= 125
		ns = 0 s= 125*/

	//Question # 34: 

	/*public class Test {
	
	public static void main(String[] args) {
		
		int ii = 0; 
		int jj = 7; 
		
		for (ii = 0; ii<jj-1; ii= ii +2) {
			System.out.println(ii + " ");
		}
	}
}
//	Anwer: -> 0 2 4*/

//Question # 36:

/*public class Test {
	
	StringBuilder sb1 = new StringBuilder("Duke"); 
	String str1 = sb1.toString(); 
	//insert code here 		//line 9 
	String str2 = str1; 
	
	System.out.println(str2 == str1);
	
}
	//Answer: -> String str2 = str1; */


	//Question # 37: 

  
//	public class Test {
//		
//		static int count = 0; 
//		int i = 0; 
//		
//		public void changeCount() {
//			while (i < 5) {
//				i++; 
//				count++; 
//			}
//		}
//		
//		public static void main(String[] args) {
//			
//			Test check1 = new Test(); 	
//			Test check2 = new Test(); 
//			check1.changeCount();
//			check2.changeCount();
//			System.out.println(check1.count + " : " + check2.count );
//		}
//	}
		//Answer: -> 5 : 5 */

	//Question 39: 

	/*public class Test {
		
		public static void main(String[] args) {
			
			if (args[0].equals("Hello") ? false : true) {
					System.out.println("Success");
			} else {
				System.out.println("Failure");
			}
		}
	} 		Did not compile*/

	//Question 42: 

	/*class CCMask {
		
		public static String maskCC(String creditCard) {
			
			String x = "XXXX-XXXX-XXXX"; 
			//line1 
			
			StringBuilder sb = new StringBuilder(creditCard); 
			sb.substring(15, 19); 
			return x+sb; 
		}
		
			public static void main(String[] args) {
				
				System.out.println(maskCC("1234-5678-9101-1121"));
			}
	    }*/
	
















	
