package day45_classes_static_block_inheritance;

public class Notes {
	
/* 
 
 OOP Dsicussion: 
 4 Concepts: 
 	- Encapsulation: Making data private and provide public access through getter/setters method.  
 	- Inheritance 
 	- Absraction 
 	- Polymorphism 
 	
 Custom class / Custom type: 
 	Car car1 = new Car(): --> It explains a class and a data type, so when we create a custom class, we create a custom data as well 
 	
 	Custom class componenets so far: 
 	
 	public class Car { //if you save it as Car.java and it will work, it can be empty, no property and behaviour. But it is legal in Java 
 					  
 	 }
 	 
 	 1) -> class can be empty and it will work, without error. Ex: look at figure 1.1
 	 2) -> Instance variables/Fields/Attributes/Properteries/Object variable/Data. Ex: look at figure 1.2
 	 3) -> Instance Methods we can add inside the class. Ex; look at figure 1.3 
 	 4) -> Constructor: is called automatically whenever object of the class is created. Same name as class name, no return type defined. 
 	 	  If you don't add a contructor, the compiler will add a default constructor which will be no-Args constructor. 
 	 	  Constructor will create an object and return the refrence to it. 
 	 	  
 	 	  Example: 
 	 	  	Car car1 = new Car(); 
 	 	  	
 	 	  	new Car() part will create object of the car and return it. (return the reference to it) and assign to car1. 
 	 	  
 	 5) -> Static Variables: It is a class variables/belongs to class itself and not in object. 
 	 	   Always one copy of this variable. And it is shared by all objects. Instance variable will have a seperate copy for each object. 
 	 	   Static Variable can be called/accessed through the classname. 
 	 	   Ex: Car.count or etc. 
 	 	   Ex: 
 	 	   public Class Car {
 	 	   
 	 	   	public satic count; 
 	 	   
 	 	   } 
 	 	   
 	 	>>> The count will be shared for all other variables inside the class and it has 1 copy. 
 	 	
 	 	If we have 
 	 	Car car1 = new Car(); 
 	 	Car car2 = new Car(); 	
 	 	
 	 	Car1.count = 2;
 	 	Car2.count = 2; 
 	 	
 	 	if we say Car2.count = 200; then automatically the value of Car1 changed to 200 as well. Because, it is a static method. 
 	 	
 	 
 	 6) -> Static Methods: A method that can be called by using ClassName. 
 	 					   No need to create an object. 
 	 					   If a method is instance method, then only way to call it by creating object. 
 	 					   Static methods can only use other static variables/mehtods. 
 	 					   Non-Static methods  can always use static variables. 
 	 	
 	  Example: 
 	  		
 	  		public static void print printCount(){
 	  			
 	  			System.out.println("Total number of cars: " + cars); 	
 	  		}				   
 	 					   
 	 	Car.drive (); >>> it is not possible, because drive is not static, we need object first. 
 	  	   
 	  	Car car1 = new Car(); 
 	  	
 	  	car.drive(); 
 	  	new Car().driver(); >>> this will create a car object in the fly or air, only one time it drives and it is gone. You can't access it
 	  							because you didn't create an object variable by saying Car car1 = new Car(); to access it in the future. 
 	  							
 	  	new Car("Toyota", "Red").drive(); >>> same as above, it is one time drive, but has some specification now. Toyota Red drives one time. 						
 	  	
 	
 	 Figure 1.2 
 	 
 	 public class Car {
 	 
 	 public String model; //Access modifiers can be public, private or default which you don't put any public or private in front 
 	 private int year; 
 	 String color; 
 	 
 	 }
 	 
 	 Figure 1.3 
 	 
 	 public void drive() {
 	 
		System.out.println(model + " is driving"); 
 	 
 	 }
 	
 	 Creating a constructor: 
 	 
 	 public Car () {
 	 
 	 model = "some modle"; 
 	 System.out.println("Car is driving"); 
 	 
 	 }
 	 
 	  public Car () {
 	 
 	 model = "some modle"; 
 	 System.out.println("Car is driving"); 
 	 
 	 }
	
	>>> Can a local variable be static? 
		- Local variable is a variable that is Delcared within/inside method/main,  method/cutom, method/static, method/constructor or method/custom. 
		- Local variables can not be static or private, because it is already stack in the method that you can access or call it by using a 
		  an object. 
		  
 7) -> Default Value: 
 	   - Local variables when declared DO NOT get any default values. 
 	   Example: 
 	   public static ovid main (String [] args) {
 	   	
 	   	int n; 
 	   	System.out.println(n); >>> this will not compile, because it s local variable, does not take any default value. You have to intitilize or assign as value to it. 
 	   
 	   	int num = 200; 
 	   			System.out.println(num); >>> now it will work and print 200. 
 	   		
 	   }
	
	>>> Any object if it is a String or any Wrapper Class objects will take the default value as "null". 
	
	>>> Whenever a variable is null, it means that it is not pointing or has any object. Basically empty object. 
	
	>>> java.lang.NullPointerException (it is very popular exception which you will see in the future. 
	
	
8) -> STATIC BLOCK: 
	  - It is a block that can be inserted into a class and code within that block runs only ONCE (ONE TIME). Whenever that class 
	  	is first used. 
	  
	  - It runs before anything else, but ONLY ONCE. 
	  
	 
Purpose of using Static Block: 

	  - If you have static variables, lists etc. that need to be intialized one time. We can use static block to do that. 
	  
	  - Muradil recently used this block to connect to database before any other code execution. 
	  
	  - You can just say static and curly braces to create a static block inside a cutom method. 
	  
	  static {
	  
	  		System.out.prinln("This is static block running only one time"); 
	  }
	  
Syntax: 
	 static {
	 	code that runs once in the beginning before anything else. 
	 }
Note: if you have mutlitple static blocks, then it runs from top to buttom. 

9) -> INTIALIZER BLOCK: It is also called Init Block. 
 	 - It runs everytime you create object of the class. Before the constructor. It is similar idea
 	   like the constructor. 

Purpose: 
	-> Any code that you don't want in your constructor or any code that you want to run befroe the 
	   constructor. => you can use INITIALIZER Block or Init Block for this reason. 
	   
	-> You can have multiple constructors, some codes should run before anything else run. 
	
	-> It runs when you careat an object of the class. 


10) -> more on 'this' keyword 
	   this. 
	   this() 
	   return this; 
	   


11) -> What is inheritance? 
	

Static Members Important Rule: 
- Static variables need to be declared first 

The order how the code runs: 
Static Block >>> Initializer Block >>> Constructor 


SUMMARY | ORDER OF INITIALIZATION:

public class MyClass{
	static int num1 = 100;
	int num2 = 200;

	static{
		num1 = num1 + 5;
	}

	{
		num2 = num2 + 10;
	}

	public MyClass() {
		num1 += 10;
		num2 += 10;
	}
}
STATIC MEMBERS IMPORTANT RULE:
	- static variables, and blocks 
	EXECUTE ONCE IN THE beginning before anything else.

	static variable needs to be declared first then we
	can use it in static block.


STATIC BLOCK > 

	Create object:
	>INITIALIZER BLOCK > CONSTRUCTOR

	Create object:
	>INITIALIZER BLOCK > CONSTRUCTOR
	
	Create object:
	>INITIALIZER BLOCK > CONSTRUCTOR
=====================================

MyClass myClass = new MyClass();
System.out.println(myClass.num1);
System.out.println(myClass.num2);

1) static variable declaration
2) static block execution
3) instance variables declaration
4) initializer block execution
5) constructor execution

MyClass myClass2 = new MyClass();

3) instance variables declaration
4) initializer block execution
5) constructor execution

MyClass myClass3 = new MyClass();

3) instance variables declaration
4) initializer block execution
5) constructor execution
====================================

*/
	
static int num = 100; 	

	public Notes() {
		System.out.println("No arg contractor");
	}
	
	public Notes(String model, int year) {
		
		System.out.println("2 Args constractor");
	}

public static void main(String[] args) {
	
	Notes a = new Notes(); 
	
	System.out.println(a.num);
	
	Notes a1 = new Notes(); 
	
	Notes a2 = new Notes(); 
	
	System.out.println(a2.num);
	
	
	num = 200; 
	
	System.out.println(a.num);
	
	
	 
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
