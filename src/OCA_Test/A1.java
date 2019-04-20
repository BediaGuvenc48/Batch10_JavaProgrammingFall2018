package OCA_Test;

import java.util.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

		
		//Question # 1; 
		
		/*class Product {
			double price; 
		}
		public class A1 {
			
			public void updatePrice(Product product, double price) {
				
				price = price * 2; 
				product.price = product.price + price; 
				//if we remove prodcut after = sign it will print 400.0; 100.0 
				
				
			}
			
		
			
			public static void main(String[] args) {
				
				Product product = new Product(); 
				
				product.price = 200; 
				double myPrice = 100; 
				
				A1 t = new A1(); 
				
				t.updatePrice(product, myPrice);
				System.out.println(product.price + " : " + myPrice);
				
				
				
			}
		} */ 
		

		
			//Answere is -> 	400.0 : 100.0 
	 
	
	/*
	 Question # 2: 
	 
	  public class A1 {
		
		public static void main(String[] args) {
			
			// what is the result if the integer aVar is 9? 
			
			int aVar = 9; 
			
			if (aVar++ < 10) {
					System.out.println(aVar + " Hello World!");
			} else {
					System.out.println(aVar + " Hello Universe");
			}
			
		}
			//Answer is -> 10 Hello World! 
		
	}*/
	
	/*
	 	Question # 3: 
	 	
	 	public class A1 {
		
		public static void main(String[] args) {
			
			String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME); 
							System.out.println(date);
		}
		
			//An exception is thrown at runtime 
		
	}*/ 
	
	
	 //  Question # 4: 
	   
	  /* public class A1 {
		
		public static void main(String[] args) {
			
			 Short s1 = 200; 
			 Integer s2 = 400; 
			 Long s3 = (long)s1 + s2; 
			 String s4 = (String)(s3 * s2); 
			 System.out.println("Sum is " + s4);
			
		}
		
			//Anwer: -> Compiler fails in Line2 
	} */
	
	
	//Question # 6: 
	
	/*abstract class Planet {
		
		protected void reslove() {
		
		}
			abstract void rotate(); 
			
		class Earth extends Planet {
			
			void resolve() {
				
			}
			
			protected void rotate() {
				
			}
		}	
			
		public static void main(String[] args) {
			
			 
		}
		
			//Answer: -> C & D 
	}*/ 
	
	//Question # 7: 

	/*public class Vehicle {
		
		String type = "4W"; 
		int maxSpeed = 100; 
		
		Vehicle (String type, int maxSpeed){
			
			this.type = type; 
			this.maxSpeed = maxSpeed; 
		}
	
	}
	
	class Car extends Vehicle {
		
		String trans; 
		
		Car (String trans){ //Line n1 //(compilation error) 
			this.trans = trans; 
		}
		
		Car(String type, int maxSpeed, String trans){
			super(type, maxSpeed); 
			this(trans); //Line n2 //(compillor error); 
		}
	}
		
		/*
		 	Given the code fragment: 
		 	7. Car c1 = new Car("Auto"); 
		 	8. car c2 = new Car ("4W", 150, "Manual"); 
		 	9. System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans); 
		 	10. System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);  
		 */
	
	//Answer: -> Compiler fails at both line n1 & line n2 
	
	// Question # 8: 

	/*class X {
		
		public void printFileContent() {	//line 2
			// code goes here // 
			throw new IOException(); 		//line 4
		}
	}
		public class test {
			
			public static void main(String[] args) {	//line 8
				
				X xobj = new X(); 
					xobj.printFileContent(); 
			}
		}*/
		/*
		 	which 2 modifications should you make so that the code compiles successfully? 
		 	
		 	A) Replace line 8 with public static void main (String [] args) 
		 			throws Exception {
		 	B) Replace 10 with 
		 			try { 
		 					xobj.printFileContent(); 
		 				} 
		 				catch(Exception e){}
		 				catch(IOException e){}
		 	C) Replace line 2 with public void pirntFileContent() throws IOException {
		 	D) Replace line 4 with through IOException ("Exception raised"); 
		 	E) At line 11, insert throw new IOException(); 
		 	
		 	Choose options: 
		 	A. Option A 
		 	B. Opbtion B 
		 	C. Opbtion C
		 	D. Opbtion D
		 	E. Opbtion E
		 	
		 	 	Answer: -> A & C 
		 */

		//Question # 10: 

		/*public class A1 {
			
			public static void main(String[] args) {
				
				  StringBuilder sb = new StringBuilder(5); 
				  String s = ""; 
				  
				  if (sb.equals(s)) {
					  System.out.println(" Match 1");
				  } else if (sb.toString().equals(s.toString())) {
					  System.out.println(" Match 2");
				  } else {
					  System.out.println("No Match");
				  }
				
			}
			
				//Anwer: -> Match 2 
		}*/ 
		
		//Question # 11: 

		/*interface Readable {
			
			public void readBook(); 
			public void setBookMark(); 
			
		}
		
		abstract class book implements Readable {		//line n1 
			
			public void readBook() {}
			//line n2 
		}
		
		class EBook extends Book {						//line n3 
			public void readBook() {
			//line n4 
				
			}
		}

			//Answer: -> 
		*/

	//Question # 12: 

/*public class A {
	
	public static void main(String[] args) {
		
		 String ta = "A"; 
		 ta = ta.concat("B"); 
		 String tb = "C"; 
		 ta = ta.concat(tb); 
		 ta.replace('C', 'D'); 
		 ta = ta.concat(tb); 
		 System.out.println(ta);
	 
		
	}*/
		//Answer: -> ABCC 
//}//
	//Question # 14: 

	/*public class A1 {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5}; 
		
		for (int e = 0; e < 5; e+=2) {
				System.out.println(a[e]);
		}
	}
		//Answer: -> B (int e = 0; e < 5; e+=2); 
}*/ 

//Question # 18: 

/*public class A1 {

public static void main(String[] args) {
	
	String [][] shirts = new String [2][2]; 
				shirts[0][0] = "red"; 
				shirts[0][1] = "blue"; 
				shirts[1][0] = "small"; 
				shirts[1][1] = "red"; 
	
	for (int index = 0; index < 2;) {
		
		for (int idx = 0; idx < 2;) {
			
			System.out.println(shirts[index][idx]);
			idx++;
		}
			index++; 
	}		
	
	
}
	//Answer: -> B (int e = 0; e < 5; e+=2); 
} */

 //Question 19: 

 /*public class Test {
	 
	 void readCard(int cardNo) throws Exception {  
		 System.out.println("Reading card");
	 }
	 
	 void checkCard(int cardNo) throws RunTimeException {  //line n1 
		 System.out.println("Checking card");
	 }
	 
	 public static void main(String[] args) {
		
		 Test ex = new Test(); 
		 int cardno = 12344; 
		 ex.checkCard(cardNo); // line n2 
		 ex.readCard(cardNo); //line n3 
	}
 }

 	//Answer: -> D:  (Compilation fails only at line n2 and line n3). 
	*/

	//Question # 20; 

	/*public class Test {
	 
	  public static void main(String[] args) {
		
	 int x = 5; 
	 
	 while (isAvailable(x)) {
		 System.out.println(x); // 6
		 x--; 					// 7 
	 }	  
	}
	  
	  public static boolean isAvailable(int x) {
		  return x-- > 0 ? true : false;    // 12
	  }
  }	
		//Answer: -> B (insert x-- ). 

	*/ 

	//Question # 21: 
/*
	public class Test {
	 
	  public static void main(String[] args) {
		
	 boolean opt = true; 	// 5 
	 
	 switch (opt) {
	 
	 case true; 	// 7
	 	System.out.println("True");
	 	break; 	   // 9
	 default: 
		 System.out.println("***");
	 
	 }
	  	
	 	System.out.println("Done");
   }	
}
	//Answer: -> A (Replace line 5 with String opt = "true"; & replace line 7 with case "true": 

*/

	//Question # 22: 

/*	public class Test {
	 
	  public static void main(String[] args) {
		
	 int num = 5; 
	 
	 do {
		 
		 System.out.println(num-- + " ");
		 
		 
	 } while (num == 0);

	}
	 
}	
	//Answer: -> 5 

*/
	
//Question # 23: 

/*public class Test {
	 
	  public static void main(String[] args) {
		
		  //Given the code fragment 
		  
	 int x = 100; 
	 int a = x++; 
	 int b = ++x; 
	 int c = x++; 
	 
	 int d = (a < b) ? (a < c) ? a: (b < c) ? b : c; //compilation fails in this line 
	 	System.out.println(d);
	 
	  
	  }
    }	
    	//Answer: -> E (compilation fails). 
	*/

	//Question # 24: 

	/*public class Test {
	 
	  public static void main(String[] args) {
		
		   String [][] chs = new String [2][]; 
		   chs[0] = new String [2]; 
		   chs[1] = new String [5]; 
		   int i = 97; 
		   
		   for (int a = 0; a < chs.length; a++) {
			  
			  for (int b = 0; b < chs.length; b++) {
				 chs[a][b] = " " + i; 
				 i++; 
		   }
	     } 
		   for (String [] ca : chs) {
			   for (String c : ca) {
				   System.out.println(c + " ");
			   }
			   	System.out.println();
		   }
       }	
     }
		//Answer: -> 97,98,99,100,null,null,null

	*/
		//Question 25: 

	/*public class Employee {
		
		String name; 
		boolean contract; 
		double salary; 
		Employee (){ //I added the parentheses, because it didn't compile 
			
			//line n1
			
			this.name = new String ("Joe"); 
			this.contract = true; 
			this.salary = 100; 
		}
		
		public String toString() {
			return name + " : " + contract + " : " + salary; 
		}
		
		public static void main(String[] args) {
			
			Employee e = new Employee(); 
				//line n2
				
				e.name = "Joe"; 
				e.contract = true; 
				e.salary = 100; 
				
				System.out.println(e);
		}
	}
		
		//Asnwer: -> A & C
	*/ 

	//Question # 26: 

	/*public class Test {
	 
	  public static void main(String[] args) {
		 
		 List <String> names = new ArrayList<>(); 
		 
		 names.add("Rob"); 
		 names.add("Bran"); 
		 names.add("Rick"); 
		 names.add("Bran"); 
		 
		 if (names.remove("Bran")) {
			 names.remove("Jon"); 
		 }
		 	System.out.println(names);
	  }
  }	
	//Anser: -> [Rob, Rick, Bran] 

 */

	//Question # 27: 

/*	class A {
		
		public A() {
			System.out.println("A");
		}
		
	}

	class B extends A {
		
		public B() {				// line n1
			System.out.println("B ");
		}
	}
	
	class c extends B {
		
		public C() {	//line n2 
			System.out.println("C");
		}
		
		public static void main(String[] args) {
			
			C c = new C(); 
		}
	}
		//Ansewr: -> Not sure about the answer, but possibly does not compile in line n1 & line n2
	*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

