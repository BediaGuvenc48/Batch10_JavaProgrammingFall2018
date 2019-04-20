package day41_classes_02_encapsulation;

public class Notes_41 {
	
/*
 
 Foundation of Programming: 
 
 There were 4 principles that make a language OOP (Object Oriented Programming Language): 
 
 - Encapsulation 
 - Inheritance 
 - Abstraction 
 - Polymorphism 
 
 
 Class: 	House 
 	
 	Instance variable: 
 		String Type; 
 		
 		 
 		- Address: 
 		- Bedrooms 
 		- Year
 	
 	We can also call those 4 variables => fields of House class. House class with 4 fields. 
 	field 
 		
 	
 -  Before creating custom classes all the variables that we use are local variables. 
 	Local Variable: is a variable that is declared inside the method body. The scope is limited to 
 	that method and we can't use it outside that method, loop, if statements and etc. 
 
 	
 	Example: 
 	public static void main(String ... args){
 	
 	String type; 
 	String Address; //these variables are local variables which are declared inside the main method
 	 				  you can not use these variables to other methods. 
 	
 	}
 
 	
 	Memo: The following variables are called Instance/Object that can be used outside the main method
 		  and it serves as properties of the class/objects. The example is below: 
 	
 	public class House {
	
	
	String type; 
	String address; 
	int bedrooms; 
	int year; 
	
	}
 	
 - Object should be created inside a class, object with itself doesn't mean anything 
 
 - if we put Class name in front of data type, then it becomes an object 

House house1 = new House();
		house1.bedrooms = 3;
		house1.type = "Townhouse";
		house1.address = "123 Main st, Sterling VA 22222";
		house1.year = 2010;
		
- House is a class 
- House is a data type of house1 variable 
- house1 is a variable of type House 
- house1 is a variable that is holding a House object
 --> house1 is a reference variable
================================================================

String name = "John";

(String is a class) 
(name is a variable of type String)
(name is a String object)
("John" is a value of name object)

================================================================
 
 ENCAPSULATION: Hiding class data by making variables private. When an instance variable is private, it can't be accessed from 
 				other classes. We can only provide access to private variables by providing public GETTER & SETTER methods in 
 				to our class. 
 
 - Encapsulation is the technique of making the variable in a class private 
 - Private variables can not be accessed outside the class 
 - Therefore it is also known as Data hiding 
 - Provide access to private fields via public method.
 
  ==> 	when you do encapsulation, you basically hide your information from other poeple's access. 
  
  ==> 	Once a method or information is encapsulated, then the public don't have access on your information, 
  		unless they break your code. Once it is private, then there is no direct access on it. The private means that it is 
  		only accessible at the same class.  
 
 => Getters & Setters: 
 	- 
 
 	Example: 
 	
 	public class Time{
 		int hours; 
 		int minutes; 
 		int seconds; 
 	}
 	
 	Time time = new Time(); 
 	time.hours = 3; 
 	time.minutes = 56; 
 	time.seconds = 36; 
 
 	==> Now we can access from the public, in order to protect my information that someone doens't change the hours to 1000 is
 		I just change it to private like follow: 
 	
 		public class Time{
	 		private int hours; 
	 		private int minutes; 
	 		private int seconds; 
 	}
 
 	Now, the above line will not be accessible, because it is private and encapsulated.  
 	
 	public class Book {
	 	private String title; 
		private String author; 
		private int pages; 
	}
 	=> title, author pages are private now and is not visible to any other classes. Other classes cannot change or read 
 		it's value. 
 		
 		Private => 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
