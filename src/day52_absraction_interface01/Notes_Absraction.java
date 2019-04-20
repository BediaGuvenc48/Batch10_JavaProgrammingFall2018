package day52_absraction_interface01;

public class Notes_Absraction {
	
	
	/*
	 
	Abstruction: 
	
	Example: 
		Student: 
	
	-> The whole idea is that you do not create an actual object of the class. The abstract class is used to create abstract class. 
	   It can be instantiate it or create an object out of it.  
	
		- Final classes are not inherited or abstracted. 
		
		- Abstract class does not have body. It is just like this; 	
														public abstract void attendClass(); -> No body in the method. 
		
	    Non-Abstract Class: 
	    	1. Can create an object. 
	    	2. You can have instance /static variable 
	    	3. Constructor 
	    	4. No abstract method !!! -> If you don't have an abstract class, how you make abstract methods, not way 
	    	5. Non-Abstract method 
	   
	   Abstract Class: 
	 
	 		1. Can not create an object.
	 		2. You can have instance /static variable  
	 		3. Constructor 
	 		4.  0 OR MORE Abstract method are possible  
	 		5.  Non-Abstract method 
	 		
	 	 
	 	-> Concrete Method
	 	
	 	Rules: 
	 	
	 	1 -> Abstracted classes can not be instantiated directly. We only create an object out of the Concrete class 
	 	
	 	2 -> 
	 	
	 	3 -> Abstracted classes may not be marked as private or final 
	 	
	 	4 -> Final and Abstract can not come together 
	 	
	 	-> When you have a curly braces {} then you have a body, even it is empty, you still have body, so it will not be abstract method. 
	 	
	 				public LocalStudent Student(){} -> It is not abstracted method. 
	 	
	 	-> 
	 	
	 =======================================================================================================================
	 
	 Interface: 
	 	- It is same idea of a class, it is a contract between a class and outside world. It provides a set of abstract 
	 	  methods.
	 	  
	 	- A class implements an interface 
	 	
	 	- The class provides the behaviors included in the interface. 
	 	
	 
	 Exmaples: 
	 
	 	Methods: 
	 		-> Tehse for the objects interface with the outside wolrd. Keys on a keyboard are an interface with the computer. 
	 		
	 		-> Press the powerbutton to turn on the computer, we don't how the it is turned on or off, but it is a method. 
	 		
	 Creating an interface: 
	 
	 public interface Teachable {
	 
	 public static final boolean STUDY_HARD = true; 
	 
	 public abstract void canLean(); -> This is an abstract method, which doesn't have body or {} curly braces
	 
	 public abstract void doHomework(); 

	 }
	
	 
	 Example: 
	 
	 public interface Flyable {
	
	   public abstract void fly(); //this is a simple interface simple 

	  }
	 
	
	Interface Rules: 
	
	-> You can not create an object of interface 
	-> IT can only have CONSTANT variable -> public static final 
	-> Constructor ----> Nooooo !!!! 
	-> Abstract methods --> Yes, As of JDK 7 (Java 7), it can only have abstract method. 
	-> 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	

}
