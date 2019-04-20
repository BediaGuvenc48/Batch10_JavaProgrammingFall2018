package day43_classes_static_constructor02;

public class Calculation {
	
	public static void main(String[] args) {
	
//this is static and we can call from the main class without creating an object 	
		
		System.out.println(Calculator.add(5, 9)); 
		System.out.println(Calculator.minus(50, 30));
		
// when it is not static, then you have to create the object and then call the method 
		
		Calculator myCalculator = new Calculator();  
		System.out.println(myCalculator.multiply(3, 5));
		System.out.println(myCalculator.add(2, 3));
		System.out.println(myCalculator.minus(300, 200));
		
		
		//Calculator.operator = "add"; will not work, because it is not static 
		

				//Calculator.operation = "add"; will not work
				myCalculator.operation = "math calculations";
				testStatic();
			}
			
			public static void testStatic() {
				System.out.println("This is static method");
			}

}
