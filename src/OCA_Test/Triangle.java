package OCA_Test;

import java.util.*; 

/*public class CCMask {
	
	public static String maskCC(String creditCard) {
		
		String x = "XXXX-XXXX-XXXX"; 
		//line1 
		
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19); 
//		return sb.toString(); 
		
		return x + creditCard.substring(15, 19); 
		 
	}
	
		public static void main(String[] args) {
			
			System.out.println(maskCC("1234-5678-9101-1121"));
		}
    }*/ 

//Question # 45: 

	 /*public class Acc {
		 
		 public static void main(String[] args) {
			 
			 ArrayList myList = new ArrayList(); 
			 String [] myArray; 
			 
			 try {
				 while (true) {
					 myList.add("My String"); 
				 }
			 }
			 
			 	catch (RuntimeException re) {
			 		System.out.println("Caught an Exception");
			 	}
			 	System.out.println("Ready to use"); 
		     }
		 	
	       }*/ 

	//Question 46: 

	
/*public class Acc {
	 
	 public static void main(String[] args) {
		 
		  System.out.println(" 5 + 2 = " + 3 + 4 );
		  System.out.println(" 5 + 2 = " + (3 + 4) );
	  }
    }*/
	 
	//Question # 48: 
/*public class Acc {
	 
	 public static void main(String[] args) {
		 
	 String [][] arr = { { "A", "B", "C" }, {"D", "E"} }; 
	 
	  		for (int i = 0; i < arr.length; i++) {
	  			for (int j = 0; j <arr[i].length; j++) {
	  				
	  				System.out.println(arr[i][j] + " ");
	  				
	  				if (arr[i][j].equals("B")) {
	  					break; 
	  				}
	  			}
	  				continue; 
	  		}
	  }
   }
	
		//Answer: -> ABDE */

	
	/*Question # 49: 
	public class Acc {
	 
	 public static void main(String[] args) {
		 
		 String str = " "; 
		 str.trim(); 
		 System.out.println(str.equals("") + " " + str.isEmpty());
	  }
	}*/ 

	/*Question # 51: 
		
	public class App {
		 
		
		public static void doSum (Integer x, Integer y) {
			System.out.println("Integer sum is: " + (x+y));
		}
		
		public static void doSum (double x, double y) {
			System.out.println("double sum is: " + (x+y));
		}
		
		public static void doSum (float x, float y) {
			System.out.println("float sum is: " + (x+y));
		}
		
		public static void doSum (int x, int y) {
			System.out.println("int sum is: " + (x+y));
		}
		
		 public static void main(String[] args) {
			 
			 doSum(10, 20); 
			 doSum(10.0, 20.0); 
			 
	  }
   }*/ 

	//Question # 52: 
/*public class Acc {
	 
	 public static void main(String[] args) {
		 
		 String [] strs = new String [2]; 
		 int idx = 0; 
		 for (String s : strs) {
		 
			 strs[idx].concat(" element " + idx); 
			 idx++; 
		 }
		 
		 for (idx = 0; idx < strs.length; idx++) {
			 System.out.println(strs[idx]);
		 }
	  }
   } */
	
	//Question # 53: 
	/*class Vehicle {
		
		int x; 		//line n1 
		
			Vehicle(){
			 
				 
			}
			Vehicle (int x){
				this.x = x; 
			}
	}
	
	
	class Car extends Vehicle {
		
		int y; 
		Car(){
//			super(); 
				this(20); 	//line n2 
		}
		
		Car(int y){
			this.y = y; 
		}
		
		public String toString() {
			
			return super.x + ":" + this.y; 
		}
		
		public static void main(String[] args) {
			
			Vehicle y = new Car(); 
			System.out.println(y);
		}
	}*/

	//Question 57: 
	/*public class Acc {
		 
		 public static void main(String[] args) {
			 
		 int [][] num = new int [1][3];  
		 
		  		for (int i = 0; i < num.length; i++) {
		  			for (int j = 0; j <num[i].length; j++) {
		  				
		  				 num[i][j] = 10; 
		  				}
		  			}
		  			 
		  		}
		  } */

	
	/*Question # 58: 
	public class Person {
		
		String name; 
		int age = 25; 
		
		public Person (String name) {
			this(); 		//line n1 
			this.name = name; 
		}
		
		public Person (String name, int age) {
			Person(name);	//line n2  
			setAge(age); 
		}
		
		public String getName () {
			return name; 
		}
		
		public void setName (String name) {
			this.name = name; 
		}
		
		public int getAge() {
			return age; 
		}
		
		public void setAge(int age) {
			this.age = age; 
		}
		
		//setter and getter methods go here 
		
		public String show() {
			
			return name + " " + age + " " + number; 
		}
		
		public static void main(String[] args) {
			
			Person p1 = new Person("JESSE"); 
			Person p2 = new Person ("Walter", 53); 
				System.out.println(p1.show());
				System.out.println(p2.show());
		}
	}*/ 

	//Question # 59: 

	/*public class Planet {
		
		public String name; 
		public int moons; 
		
	public Planet (String name, int moons) {
		
		this.name = name; 
		this.moons = moons; 
	}
	
	public static void main(String[] args) {
		
		Planet [] planets = {
			new Planet("Mercury", 0), 
			new Planet("Venus", 0),  
			new Planet("Earth", 1),
			new Planet("Mars", 2) }; 
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
			 		
		}
	}*/
	
	//Question # 61: 
	/*public class Acc {
	
	public static void main(String[] args) {
		
		 int [] intArr = {15,30,45,60,75}; 
		 intArr[2] = intArr[4]; 
		 intArr[4] = 90; 
		 
		 for (int arr : intArr) {
			 System.out.print(arr + " ");
		 }
			 		
		}
	}*/		//Answer: -> 15 30 75 60 90 
	
	//Question # 69: 

	/*public class Triangle{
		
		static double area; 
		int b = 2, h = 3; 
		
		public static void main(String[] args) {
			
			double p,b,h; 
			if (area == 0) {
				b = 3; 
				h = 4; 
				p = 0.5;
			}
				area = p * h * b; //line n2 
				System.out.println("Area is: " + area);
		}
			 
	}*/

	//Question # 71
	/*public class Triangle{
		
		public static void main(String[] args) {
			
			Boolean [] bool = new Boolean [2]; 
			
			bool[0] = new Boolean(Boolean.parseBoolean("true")); 
			bool[1] = new Boolean(null); 
			
			System.out.println(bool[0] + " " + bool[1]);
			 
		}
			 
	}*/
		//Answer: -> true false 
	
	//Question # 75: 

	public class Triangle{
		
		public static void main(String[] args) {
			
			 int [] nums1 = new int [3]; 
			 int [] nums2 = {1,2,3,4,5}; 
			 
			 int [] nums3 = {500, 1000, 50060, 10585, 3049853}; 
			 
			 nums1[0] = 1; 
			 nums1[1] = 2; 
			 nums1[2] = 10000; 
			 
			 for (int x : nums1) {
				 System.out.print(x + ":");
			 }
			
			 
			 System.out.println();
			 for (int x : nums1) {
				 System.out.print(x + ":");
			 }
			 
			 System.out.println();
			 
			 nums1 = nums2; 
			 
			 for (int x : nums1) {
				 System.out.print(x + ":");
			 }
			 
			 System.out.println();
			 
			 nums1 = nums3; 
			 
			 for (int x : nums1) {
				 System.out.print(x + ":");
			 }
	}
			 
	} 	//Answer: -> 1:2:3:4:5:
	
	//Question # 79: 

	/*public class Triangle{
		
		public static void main(String[] args) {
			
			  int [][] n = { {1,3}, {2,3}};  
			  
			  for (int idx = n.length-1; idx >= 0; idx--) {
				  
				  for (int y : n[idx]) {
					  
					  System.out.print(y);
				  }
			  }
		}
			 
	} */ 

	//Question # 80: 

	/*class Caller {
		
		private void init () {
			System.out.println("Initilized"); 
		}
		
		private void start () {
			
			init(); 
			System.out.println("Started");
		}
		
		public class TestCall {
		public void main(String[] args) {
			
			Caller c = new Caller(); 
			c.start();
			c.init();
		}
		
	}
}

	/*public class Acc {
		
		public static void main(String[] args) {
			
			try {
				
				int num = 10; 
				int div = 0; 
				int ans = num / div; 
				
			} catch (ArithmeticException ae) {
				ans = 0; 		//line n1 
			} catch (Exception e) {
				System.out.println("Invalid calculation");
			}
				System.out.println("Anser = " + ans); 	//line n2
		}
		
	}*/
	
	//Question # 82: 

	/*public class Acc {
		
		int x; 
		int y; 
		
		public void doStuff(int x, int y) {
			this.x = x; 
			y = this.y;  //this becomes 0 while calling the method do Stuff. 
			
		} 
		
		public void display () {
			
			System.out.println(x + " " + y + ":");
		}
		
		public static void main(String[] args) {
			
			Acc m1 = new Acc(); 
			m1.x = 100; 
			m1.y = 200; 
			
			Acc m2 = new Acc(); 
			m2.doStuff(100, 200);
			m1.display();
			m2.display();
			
			
		}
	}*/ 

	//Question # 83: 

	/*public class Vowel {
		
		private char var; 
		
		public static void main(String[] args) {
			
			char var1 = 'a'; 
			char var2 = var1; 
			var2 = 'e'; 
			
			Vowel obj1 = new Vowel(); 
			Vowel obj2 = obj1; 
			obj1.var = 'i'; 
			obj2.var = 'o'; 
			
			System.out.println(var1 + ", " + var2);
			System.out.println(obj1.var + ", " + obj2.var);
		}
	}*/
		//Answer: -> a,e 	o, o

	/*public class Vowel {
		
		private char var; 
		
		public static void main(String[] args) {
		
			int aVar = 9; 
			
			if (aVar++ < 10) {
				System.out.println(aVar + "Hello World!");
			} else {
				System.out.println(aVar + "Hello Universe!");
			}
		}
	}*/

//	public class Vowel {
//	
//		
//		public static void main(String[] args) {
//		
//				boolean a = new Boolean(Boolean.valueOf(args[0])); 
//				boolean b = new Boolean(args[1]); 	//null - became false 
//				System.out.println(a + " " + b);
//		}
//	}
//		
		

	//Question 93: 

	/*public class Vowel {
	
		public static void main(String[] args) {
			
			String [] names = {"Thomas", "Peter", "Joseph"}; 
			String [] pws = new String [3]; 
			int idx = 0; 
			
			try {
				
				for (String n : names) {
					
					pws[idx] = n.substring(2, 6); 
					idx++; 
				} 
				
			}	catch(Exception e) {
				System.out.println("Invalid Name");
			}
			
			for (String p : pws) {
				
				System.out.println(p);
			}
				
		}
		
	}*/

	//Question 94: 

	
	/*class A {
		
		public void test() {
			System.out.println("A");
		}
	
	}
	
	class B extends A {
		
		public void test() {
			System.out.println("B");
	}
		
  }

	class C extends A {
			
			public void test() {
				System.out.println("C");
		}
		
		public static void main(String[] args) {
			
			A b1 = new A(); 
			A b2 = new C(); 
			b1 = (A)b2; 
			A b3 = (B)b2; 	//line n1
			A b4 = (B)b2;	//line n2
			b1.test();
			b3.test();
			
		}	
			
	  }*/
























