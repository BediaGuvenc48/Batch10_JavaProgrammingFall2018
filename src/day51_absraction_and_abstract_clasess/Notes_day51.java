package day51_absraction_and_abstract_clasess;

public class Notes_day51 {
	
/*
 
 Date: 	11th December 2018 
 
 Abstraction: 
 
 -> It is a process of showing the features and behaviour, but hiding the implementation. When we do abstraction in programming 
 	we create abstract classes, methods that only shows some features and behaviour, but we don't specify that details of the 
 	implementation. 
 	
 	Example: 
 	
 	When we step on gas pedal, it accellerate, but do not know how it is happenning?, It depends on the car type, the same behaviour 
 	or feature might be happening differently. 
 	
 	How does abraction happen in Java? 
 	
 	There are 2 ways of achieving abstraction in Java:
 	
 	1): Creating Abstract classes: It is used in Java to achieve abstraction and we can use abtract keyword when creating the class.  
 	
 	2): Creating Interfaces:  
 	
 		Example: 
 		
 		public abstract class File {
 			
 		}
 		
 		Once it is created an absract class, the following rules come with it: 
 		
 		Rule # 1: 
 		
 		a) -> We can not create an object of the abstract classes. It normally used for high level ideas, classes and templates. 
 			  They are used to describe properties and behaviours that other sub-classes will implement. 
 			  
 		There are other rules, but the general idea is expalined in option a). 
 		
 		We can create some instance variables, we can instantiate it or create some instances in it. 
 		
 		 File file = new File(); >>>> This will not work, we can't create an object of the abstract class. 
 		 
 		 public abstract class File {
	
		public abstract void open(); -> it opens and we don't know how it is openning, we know this behaviour and it is very common, 
										but don't know the details of openning 
	
		}

		File is general/abstract idea and we might have different types of files. So it is a good candidate for abstract class. 
		
		Open() is an abstract method, when you look at it, we know what it does, but at this point we don't know the implementation. it is hidden. 
		
	->  Asbstract Method: Can be added to abstract classes/cannot be added to normal(non-abstract) classes. 
		
		It will not have any method body(implementation). 
		
		Example: 
		
		public abstract void method1(String str); -> you just describe the behaviour, you don't use curly braces {} and you just end it right there. 
		
	-> Abstract classe will not have a method body, 
 		 
 	Examples: 
 	
 		Plane, Bird, Drone, Helicopters => all these objects have some common behaviours and all of them fly. if we give a name 
 		to these objects, we can name it FlyingObject(); 
 		
 		-> FlyingObject here is a good candidate to be abstract class as it is very high level (like a base of something) and can 
 		   be good base for other sub-classes. 
 		
 	Example: 
 		
 		Safari, Chrome, FireFox, IE 
 		
 	
 	Rule # 2: 
  
  	b): Abstract classes can have absract methods and non-abstract methods. 
  	
  		
  		public abstract class File {
  		
  			public abstract void open(); 
  			
  			public void close() {
  			
  				System.out.println("Close the software"); 
  			}
  		}
 	
 	Abstraction is totally related to the inheritance and it is easy to work with it. 
 	
 	File(Abstract) > XLSFile 
 	
 	- File is an abstract parent class 
 	- We can not instantiate (create object) of File 
 	- Serves as a base/foundation class for its sub classes. 
 	- It may include abstract methods(methods without body), non-abstract methods(methods with body that we use always). 
 	
 -> XLSFile: is a sub class for abstract class
 		   : Concreat Class 
 
 -> We have abstract class & Concrete Class. 
 
 -> Concreate Class: is a Non-Abstract child class of an abstract class. 
 
 File > XSFile 
 	  > JGPFile
 	  
 Abstracted Classes: 
 
 	- Used abstract keyword to create 
 	- Can't create an object 
 	- Can contain abstract methods (without body) 
 	- Can have non-abstract method 
 	- Can have instance variables/static variables 
 	- Constructor can be added 
 	- Abstract classes can have abstract sub/child classes 
 	
 	A > B > C > D > E -> So only E will be a concrete class which will not be inherited. 
 	
 	if A is abstract, then B is abstract, C is abstract and D is abstract too. 
 	
 	Example: 
 	
 	Person > Employee > FullTimeEmployee 
 					  > ContractorEmployee 
 			
 	
 	So you can also have a class without any method like this; 
 	
 	public abstract class Person {

    }
    
    The only reason is to make anable people to create an object from 
    
 	
 	Person: String fullName
 		  : int age 
 		  : abstract speak 
 	
 	Employee: String jobTitle 
 			:  Double salary 
 			:  abstractMethod work //it is a behaviour 
 			  
 	FullTimeEmployee: double bonus  
 	
 	ContractorEmployee: hourlyRate 
 						contractPeriod 
 	
 	==============================================================
 	
 	Adding behaviours: 
 	
 	abstract class Person 
 				public abstract void speak(); 
 	
 	abstract class Employee extends Person 
 	
 -> If an abstract class extends another abstract class, it does not have to implement/override abstract 
 	method from parent class. (which is Person class). 
 	
 -> class FullTimeEmployee extends Employee 	
 		  speak(); 
 		  work(); 
 		  
 -> FullTimeEmployee is a first concrete class that is responsible for overriding/proding implementation 
    for all abstract methods from parent abstract classes. 
 		
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 */

}
