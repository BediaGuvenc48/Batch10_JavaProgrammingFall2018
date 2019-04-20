package day46_this_isa;

public class Notes_day46 {

/*
 
 THIS keyword in Java: 
 
 	this (followed by dot)=> to refer to instance variable or method. 
 
 1) => First way of using this. 
 
 	public class Student{
 	
 	private int id; 
 	private String 
 	public Student (int id, String name){
 	
 		this.id = id; 
 		this.setName(name); >>>> homeworke 
 	
 	}
 	
 	public void setName(String name){
 		this.name = name; 
 	}
 	
 
 	2) => this() (followed by parenthesis): It is used to call a Constructor from another Constructor.  
 	
 	3) => this (by itself). return this; 
 	
 	-> Refactor, means change something to make it better. 
 	
 	>>> You can not have another constructors with same signature. 
 	
 	=> Whenver overloaded constructors do similar steps, we can call a constructor from another constructor using this(). 
 	
 	=> this() only can be used inside constructoer and it can not be used inside the method. 
 	
 	=> this() must always be the first statement in the contrucoter, if you use it. If you use this() at the bottom, it wouldn't work. 
 		
 	=> toString();  is a special method that is normally used to discribe object in String format. 
 	
 	=> you can only have 1 this() in a constructor. 
 	
 	=> return this; means return the SAME/THIS object from where it was called. When we return SAME object, we retain all the DATA
 	   for that CURRENT OBJECT. 
 	   Example: 
 	   Calc c1 = new Calc(); result = 0; 
 	   c1.plus(100); result = 100; ===> becuase it is 0+100 and = 100; 
 	   
 	   when it is like;		c1.plus(50).plus(20) => 170; //in fact it is 100+50+20 = 170; 
 	   
 	=> IN GENERAL: 	
 	 	keyword THIS means THIS INSTANCE. 
 	this => this instance/object. 
 	
 	public class Pen{
 		String type; 
 	}
 	
 	Pen pen1 = new Pen(); //instantiation/Creating 
 		instance/	creating object 
 		pen1.type = "ink"; 
 		
 	Pen pen2 = new Pen(); 
 	
 	>> Super
 	
 	Java Memory: 
 	-> It has 2 different memories like follow: 
 		1)- Stack:  - All local variables go to the Stack. Local primitives go to the Stack Memory. 
 		   			- Reference variables (variables of Class type). 
 				   go to the Stack Memory. 
 		Example: 
 			Message msg = new Message("Hello"); //
 		 
 		2)- Heap:  Heap is larger than Stack, the Message object goes to the heap and the body which is "Hello"
 					- All objects are in Heap. 
 					
 		Message msg = new Message(); 
 		
 		Message msg is in stack memory. 
 		
 		new Message () objeect is created in the Heap. 
 		
 		if we have msg1 == msg3; then msg3 will point to the same memory heaps as well. 
 		
 
 => So far we created a custom class and added many components/concepts to it. 
 
 	Class/object/template: once we create a class or object there are 2 things created with it. 
 		1)-> Data; 
 		2)-> Behaviour 
 		 
 
 => If we have Class A & Class B in Java, then there are some relationn with them that are called: 
 	1-> Has- Relation
 	
 	2-> Has-A Relation => inheritance 
 	
 	public class Car {
	
	 String model; 
	 
	 Engine engine; //we are declaring inside class Car instance variable called Enginge

  }
  
  => 	System.out.println(); 
  
  		System is a Class name, it is not an object, out is a static object which has some static block inside and 
  		System has a PrintStream object and inside PrintStream there is a method called (public void println(object x) which 
  		prints the object for us. 
  		
  	-> System is a Class, it HAS-A PrintStream static variable called out. 
  	-> System.out => System is a class, out is a static variable. 
  	
  	-> println() is a method that belongs to out variable and prints to console. 
  	
  	-> System HAS-A PrintStream 
  	
  	in summary: 
  	-> System is a class 
  	-> out is astatic variable of type printStream 
  	-> println() method is called from out variable. 
  	
  	
  	public class School {
  		
  		Student [] students; 
  		List <Student> studentList; 
  		Building schoolBuilding; 
  		
  	}
  	
  	public class Student {
  		
  	}
  	
  	public class Builder{
  	
  	}
  	
  	public class Computer{
  	
  	}
 	
 	
 	There are 3 this keywords: 
 	
 	this() -> used to call constructors. 
 	this. -> used to identify the private instance variables. 
 	return this -> used to return the value of same object. 
 	
 	
 	
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
