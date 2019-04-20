package day40_customclasses;

public class Notes_Day40 {
	
	
/*
 
 What is the difference between primitives and objects? 

 - Primitives are built into Java and foundation of all other types. 
 
 - have a single value and no behavior 
 	int j = 25;
 	j = j + 10; 
 	print j; 
 	j> 5 etc. 
 	char ch = 'q'; //these are just primitives which don't have objects. 
 
 What are objects? 
 	- Objects is created from a class and can have multiple values/properties and behaviors. It also can have 
 	  behavior(methods). 
 	  Example: 
 	  	String str = new String("November"); //this can do some action with itself like following 
 	  	str = str.trim(); 
 	  	System.out.println(str.toUpperCase()); //the changes are behaviors. 
 	  	
 Memo: 
 
Java Memory: Java Memories have 2 places to store 
	1. Stack, the primitives are stored in Stack Memory
	2. Heap, the objects are stored in the Heap. 
	
 Class vs object? 
 
 	- Class: 
 		- Class is a template/blueprint. 
 		- We can define properties & methods in it. 
 		- Some people believes that classes are just ideas 
 		
 	- Object: 
 		- Object is created from a class 
 		- Objects can not exist without a class 
 		- When we use an Object, then we use the class through the object. 
 		
 	  CellPhone class/templates:  
 		Properties/data: 
 			- brand 
 			- color 
 			- price 
 		
 		Behavior:
 		 	- call 
 		 	- text 
 		 	- alarm 
 		 	- navigation 
 	
 	 Dog class/templates:  
 		Properties/data/Information: 
 			- breed 
 			- color 
 			- size 
 		
 		Behavior:
 		 	- bark 
 		 	- eat 
 		 	- run 
 
  	 Car class/templates:  
 		Properties/data/Information: 
 			- make 
 			- model 
 			- year
 			- color
 			- price 
 		
 		Behavior/Method:
 		 	- start 
 		 	- drive
 		 	- park
 	
 	Meat Template/class: 
 		properties/data: 
 		- type 
 		- weight 
 		- price 
 		
 	Student class/Template: 
 		properties/data: 
 		- name 
 		- gender 
 		- age 
 		- email 
 	Behavior: 
 		- study 
 		- attendSchool 
 		- do homework 
 		- review 
 		
 	Employee class/template: 
 		Information/data: 
 			- name
 			- email 
 			- job position 
 			- salary 
 			- employee id
 		Behavior: 
 			- work 
 			- take a vacation 
 			- get paid 
 			- quit 
 	
 
 Note: From our class we create objects, those objects can also be called "instance" of a class. 
 
 Example: 
 CellPhone p1 = new CellPhone(); 
 
 p1 is an instance of a CellPhone class // same meaning 
 p1 is an object of a CellPhone class // same meaning 
 	
 	public class CellPhone{
 	
 		String make: 
 		String color: 
 		double price: 
 	}
 	
 	make, color, price can also be called: 
 		- Attributes of the class 
 		- Object variables 
 		- instance variables 
 		
 	public void calls(){
 		print "Calling someone"; 
 		
 	}
 	public void text(){
 		print "Texting someone"; 
 	
 	}
 	
 	call and text are: 
 		- Behavior of the class 
 		- instance/object methods 
 		
 	why we call the "call & text" are instance methods? The only way to use/call these methods is through 
 	creating an object and calling after object name. 
 	
 	Memo: 
 	
 	If you create a static method, then there is no instance method in it. 
 	CellPhone.call(); //will not work, since call is an instance method and it is not static. 
 	
 	If we want to call method, we first need to create an object and then through the object we can use our variables. 
 	
 	Example: 
 	
 	When you create a class what 2 things? 
 	
 		- Properties/behavior; 
 		
 	*** A is just a template class, in order to use it, we need to create objects of A/instances of Class. 
 
	- The purpose of creating a Movie class is to use by creating objects from it. It does not run by itself, it is just 
		a variable and a template. 

 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
