package OCA_Instructor_Akbar;

public class Holiday {
	
	int num; 
	
	static int staticNum; 
	
	// inside instance method , 
		// you can access any instance variable , instance method
		// 			static variable and static method 
		
		// inside STATIC method , 
			// you can ONLY access static variable and static method 

		public void method1() {
			// can we access instance variable inside instance method 
			System.out.println(num); //this.num
			// can we access static variable inside instance method 
			System.out.println(staticNum);
			// can we access instance method inside another instance method 
			method2(); // this.method2() ; 
			// can we access static method inside instance method 
			method3(); 
			System.out.println("instance method ");
		}

		public void method2() {
			System.out.println("instance method");
		}
		
		public static void method3() {
			// can we access instance variable inside static method 
			//System.out.println( num  ); NO 
			
			// can we access instance METHOD inside static method 
			// method1() ; NO 
			
			// can we access static variable inside STATIC method 
			System.out.println(staticNum);
			
			// can we access static method inside STATIC method 
			method3(); // YES 
			
					
			
			System.out.println("static method");
		}
		
		public static void main(String[] args) {
			
			Holiday h1 = new Holiday();
			System.out.println(h1.num);
			
			System.out.println( staticNum );
			System.out.println( Holiday.staticNum );
			System.out.println( h1.staticNum );
			
//			h1.method1(); 
//			h1.method2();
//			
//			method3(); 
//			Holiday.method3();

		}
	
}
