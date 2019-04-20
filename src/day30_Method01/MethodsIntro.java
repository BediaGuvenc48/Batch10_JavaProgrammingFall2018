package day30_Method01;

public class MethodsIntro {

		
	
	/*
	 * Tasking: 
	 * 
	 * Write 4 costum methods, doesnt accept any paramenter and doesn't return anything 
	 * call them from a main method
	 * the methods will print these statements: 
	 * 
	 * method 1: 	Hello, Good morning 
	 * method 2: 	hi, good morning and Happy New Year 
	 * method 3: 	Did you get some time off? 
	 * method 4: 	No, I was working all day
	 */
	
	
	public void method1() {
		
		System.out.println("Hello, Good morning ");
	}
	
	public void method2() {
		
		System.out.println("hi, good morning and Happy New Year ");
	}
	
	public void method3() {
		
		System.out.println("Did you get some time off? ");
	}
	
	public void method4() {
		
		System.out.println("No, I was working all day ");
	}
	
	public static void main(String[] args) {
		
		MethodsIntro a = new MethodsIntro(); 
	
		a.method1(); 
		a.method2(); 
		a.method3(); 
		a.method4(); 
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//		public static void main(String[] args) {
//			
//			MethodsIntro.sayHello();
//			askHowRU();
//			sayHello();
//			reply();
//			
//			String str = "java";
//
//			//int l = str.length();
//			str.charAt(1);
//			
//			System.out.println("I am doing great! thanks");
//			
//			sayBye();
//			sayBye();
//			sayHelloTo("Khalili");
//		
//		}
//		
//		
//		
//		public static void sayHelloTo(String name) {
//			
//			System.out.println("Hello " + name);
//			
//		}
//		
//		public static void sayHello() {
//			System.out.println("Hello");
//		}
//		
//		
//		/*
//		 * Write a method askHowRU that asks "how are you doing?"
//		 * 
//		 */
//		public static void askHowRU() {
//			System.out.println("How are you doing?");
//		}
//		
//		
//		/*
//		 * write a method reply. that prints "I am doing well, how about you?"
//		 */
//		
//		public static void reply() {
//			System.out.println("I am doing well, how about you?");
//		}
//		
//		/*
//		 * Write a method sayBye. that says "Bye! Have a good day!"
//		 */
//		public static void sayBye() {
//			System.out.println("Bye! Have a good day!");
//			
//		}
//		
//	}
//
