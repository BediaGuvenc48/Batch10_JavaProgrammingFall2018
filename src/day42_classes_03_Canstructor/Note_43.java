package day42_classes_03_Canstructor;

public class Note_43 {
	
	
/*
 Custom Classes: 
 	public class  Classname{
 		- var
 		- methods
 	
 	}
 
 Encapsulatoin: 
 	Data hiding. 
 		private access access modifier 
 		Make your instance variables private. 
 		
 		Provide public way to work with enscapsulated fields/members using Getter & Setter methods. 
 		
 		GETTER ==> ALSO KNOWN AS accessor methods 
 		SETTER ==> ALSO KNOWN AS muttator methods
 		
 	
 	Warm up task: 
 		- Create a class called EtsyAccount
 			instence variables will be 
 				- email 
 				- firstName 
 				- password 
 		
 		encapsulate the above fields and provide the getters and setters. 
 		
 		Class - Etsy Registration Method 
 				main method 
 				
 ======================================================================
 
 THIS keyword in Java: 
 
  	There are 2  versions of THIS Keyword in Java: 
  		- this. (with dot) 
  		- this() (with parenthesis or without dot) 
  		
  	1) - this. -> this with dot is used to access instance variables from within the class. Useful 
 
 
 >> Whenever we create a Car object, we want to have "unknown" as a value to be assigned to make, model, type 
  	
  >>> Constructor: 
  		- When we call our new car object, the contructor is working behind the seen and we can't see it 
  		
  	Example: 
  		
  		public class Car{

			public Car(){
			
			}
 	      }  
  	
  	What is Constructor: 
  	
  	- It is a speical method that runs authomatically when object from a Class is created. 
  	- It is nomrally public, no return type, and name is exact same as class name. 
  	- We can have multiple constructors in same class. 
  	
  	How to create object in java? 
  	
  	>>> by using a new keyword following our class name that is how we create a new object. 
  	
  	String str = new String(); 
  	String str1 = new String("abc"); 
  	
  	StringBuilder stb = new StringBuilder(); 
  	StringBuilder st = new StringBuilder("value"); 
  	
  	
  	
  	
  	Whenever we do like this with empty method, we create a constructor and it Automatically run that we don't see it 
  	
  	if we put some codes and it will run as much as many objects we have. 
  	
  	Constructor is a special method that runs each time we create an object. 
  	
  	Rules of Constructors: 
  	- Constructors names and Class name must be same. 
  	- Constructo must have no explicit return type 
  	- Constructor can be one or more 
  	- if no constructor is defined compile adds a no-args default constructor. 
  	
  	- We call constructor, because it constructs methods. 
  	
  		public Car () {
 		
 		type = "unknown"; 
 		make = "unknown"; 
 		model = "unknown"; 
 	
 		}
 	
  	-> The above constructor is providing default values to type, make, model and preventing it to be 'null' values. 
  	
  	-> It is intializing object variable with some default values. 
  	
  	-> If programmer does not add a contructor into a class, Compiler will add one default no-aarg construction 
  	
 
 
 Mr. Moradil's Notes: 
 
Custom Classes:
    public class Classname{
        //var
        //methods
    }
Encapsulation
    Data hiding.
        private access access modifier
        Make your instance variables private.
        Provide public way to work with encapsulated fields/members using GETTER and SETTER methods.
        GETTER -> accessor methods
        SETTER -> mutator methods
        accessor and mutators
====================================
Warm up task:
    
    Create a class called EtsyAccount
        instance variables:
            email
            firstName
            password
        Encapsulate the about fields
        and provide getters and setters
    Class:
        EtsyRegistrationPage
         main method:
            Create 2 Etsy Accounts 
===========================================
day42_encapsulation02_constructors          
============================================
THIS keyword in Java.
2 versions:
    this. (with dot)
    this() (with paranthesis)
    1) this. -> this with dot is used to access 
    instance variables from within the class.
    Useful when you have 2 variables with same name 
    and you want to differenciate which one is instance variable
    2) this() -> is used to call another constructor from a constructor.
==========================
EtsyAccount account1 = new EtsyAccount();
account1.setEmail("account1@gmail.com");
account1.setFirstName("Adam");
account1.setPassword("adem123");
        
Assign values to 3 private variables using single method:
account.setAccountInfo("account1@gmail.com", "Adam", "adem123");
===========================
Class: Car
    Encapsulated Instance variables:
        String type
        String make;
        String model;
        int speed;
    Add GETTER and SETTER methods.
    Method:
        void accellerate(int mph)
            increases, current speed value by mph value
            prints make type is accellerating
    accellerate(10); => speed += 10
=======================================
Car carTwo = new Car();
Car car3 = new Car();
Whenever We create a Car object, we want to have "unknown" as a value to be assigned to make, model, type.
sayHello();
CONSTRUCTOR METHOD:
public class Car {
    
    public Car() {
        //some code
    }
}
What is a Constructor:
    It is a special method that runs automatically when object from a class is created. 
    It is normally public, no return type, and name is exact same as class name.
    We can have multiple constructors in same class.
How to create object in java?
using new keyword:
String str = new String();
String str2=  new String("abc");
StringBuilder stb = new StringBuilder();
StringBuilder st = new StringBuilder("value");
    public Car() { 
        System.out.println("Car class constructor");
        type = "unknown";
        make = "unknown";
        model = "unknown";
    }
The above constructor is providing default values to type, make, model
, and preventing it to be 'null' values.
It is initializing object variable with some default values.
=============
If programmer does not add a constructor into a class,
Compiler will add one defaul no-args constructor.
Once programmer adds any type of constructor(with or without args),
compiler will not add any additional constructors.
 

 
 */
		

}
