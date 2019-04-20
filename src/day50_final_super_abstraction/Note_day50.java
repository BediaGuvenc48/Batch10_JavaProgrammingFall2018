package day50_final_super_abstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Note_day50 {

	
	/*
	 
	
	OOP concpets in Java: 
	-> All the rules possible - we need while coding, during interview, OCA. 
	
	- Encapsulation 
	- Inheritance 
		1.
	- Abstraction: is used a lot in 
	- Polymorphism 
	
	- OOP > Exceptions > Data Structures 
	
	Selenium + Maven + TestNG 
		- Properties files, files, excell files. 
		
		- SQL programming / DataBases: We will learn how to Automate the databases as well. 
		
		- java JDBC 
		
		- API manual testing 
		
		- API Automation 
			-> Front END: Now we just work with Selenium WebDriver to test whatever we see. We also use Maven + TestNG+Cucumber+JUnit 
	
			-> API level: + Manual API with Postman, Java, Automation with RestAssured 

			-> Database level:  SQL programming > JDVC 
			
			-> Java programming skills at the end will become Full Stack Automation Engineer which will be able to Automate Front End, API Level 
			   and Database level. 
	
	==============================================
	
	FINAL keyword
	super. 
	super()
	
	this.
	this() 
	==============================================
	
	Method and variable Hiding: 
	
	==============================================
	
	
	 FINAL keyword: We can use final keyword with: 
	 	- variables 
	 	- methods 
	 	- classes 
	 	
	 Final Variables: Makes the variable constant and the value cannot be changed/updated: 
	 Noramllay we name our variables all UPPERCASE if it is final; 
	 
	 Example: 
	 
	 final int MAX = 100; 
	 
	 MAX = 110; //will not work since variable MAX is final. 
	 
	 -> so if you want to do camel cas with final, you just use uppercase and add _ between 2 words like; 
	 			private final String SCHOOL_NAME = "Cybertek"; 
	
	 	private final String SCHOOL_NAME = "Cybertek"; //so if you want to do camel cas with final, you just use uppercase and add _ between 2 words 
	
	public static final int MAX_NUMBER_OF_STUDENT = 50; 
	
	-> EVEN IF YOU USE LOWERCASE WITH WORD FINAL, IT WILL WORK, BUT PERFFERRED TO USE UPPERCASE. 
	
	-> The reason for changing the colors, is because we use an instance variable and the eclips is changing the color. 
	   You might be able to changed the color in eclips too. 
	
	-> We can make local, instance and static variables and final. 
	
		- Local variables, we can declare then initialize in the next/below statement. Local means inside your method. 
		
		- final instance variable => initialize in same line or in init block, constructor. 
		
		- static final variable => same line, static block 
		
	-> final is non-access modifier and only public, protected, default and private are access modifiers. 
	
	-> So, basically if we have the keyword final before an instance variable, it will not let you to update the value. 
	
	Final Method: 
	- The only way to do something. It can not overriden. 
	- If a method is final, it cannnot be overriden by the sub-class/child class. 
	
	//if you put the keyword final anywhere before the return type, you make the method final, only the variables are capitalized 
	//the methods are kept same like the camel case. 
	//we can only have 1 public class, any other classes can not be public 
	
	// you can't ovveride the final method. when you make a method final, the purpose is to make sub-classes change anything. 
	   It would not let you to ovveride the method.  
		
   -> Final methods can be overloaded, since it is considered as a new method. 
   
   -> You can also make your final method static like this: 
   		public static final void readSMSMessage(String sender) {
   			
   			System.out.println("Open messages and read for " + sender); 
   		}
	 
   -> FINAL CLASS: 
   		CAN NOT BE EXTENDED AND CANNOT HAVE SUB-CLASSES. 
	 
	//public class SubFinalClass extends FinalClass { this is not working and will give this error message: 
	                                                       The type SubFinalClass cannot subclass the final class FinalClas
     }
	 
	public final class String {
		
	}
	 
	it means String class cannot have sub classes. We can't say like this: 
	
		public class MyString extends String {
		
		}
	 
	When do we need final classses: 
	
		-> Whenever the programmar wants this class to be used as is and prevent any inheritnace. 

	
	When you have a private constructor, then you can not create the object outside that class. For Example: 
	
		private Math(){
		
		}	
	
	The object Math math = new Math(); is not passible to make outside this class. 
	
	-> If a class is final, there is no need to make methods also final. Because, final methods can not be ovverriden by su-classes
	   and when we make our class final, it cannot have sub classes, so automatically cannot be overriden. 
	   
	-> Final variable => value cannot be changed 
	-> Final method => method cannot be overriden by sub classes. 
	-> final class => cannot be extended/ cannot have sub classes. 
	
	-> The final class can be a sub-class. Final, only prevents a class from being extended. 
	
	-> Is finall attribute/instance variables are inheritted? 
		Yes, as long as access modifier is letting it. 
		Attribute: is a data, parameter. Each object has an attribute and a behaviour. 
	
	-> 
		Example: 
		
		final Car car = new Car("Kia"); 
		
		 final int [] WHITE = {255, 255, 255}; 
		 
		 final List <String> DAYS = new ArrayList<>(); 
		 
	
	-> when you create a primitive or String with final, you can't change it or modify the value, but if you use an Array or ArrayList 
	   then it is different. We can change the value, but we can't create a new object. like the example below: 
	   
	  	final int [] NUMS = new int [] {100, 300, 400}; 
	
		NUMS[0] = 500; //-> this works fine, because we jut update the value of the first element of the Array NUMS
	
		System.out.println(Arrays.toString(NUMS)); 
		
		//NUMS = new int [2];  -> this will not work 
	
Same Example with different ways of writting: 

	final int [] WHITE = new int [3]; 
		WHITE [0] = 255; 
		WHITE [1] = 255; 
		WHITE [2] = 255; 
		
		WHITE [0] = 500; //this is fine, just the value is changed, still pointing to the same memory space (heap). 
		
		WHITE = new int[2]; //THIS DOES NOT WORK, BECAUSE WE CREATED A NEW OBJECT THAT OUR ARRAY POINTS TOWARD AND IT IS NOT POSSIBLE 
							  IF WE HAVE A FINAL KEYWORD IN OUR ARRAY. 
							  
 -> Whenver we have an ArrayList, the same rules will apply to it, we can add, remove or change the value of our ArrayList, but we 
 	can not create a new ArrayList, since we have the keyword final in our method. 
 	
 		final List<String> RPODUCTS = new ArrayList<>(); 
	
	Example: 
	
	RPODUCTS.add("water"); 
	RPODUCTS.add("Cookies"); 
	RPODUCTS.add("Coffee"); 
	
	System.out.println(RPODUCTS);
	
	RPODUCTS.remove("Cookies"); 
	System.out.println(RPODUCTS);
	
	//RPODUCTS = new ArrayList<>(); -> This will not work, because again we create a new object that our ArrayList points toward. 
									  //since it is final, then we can not create a new object. 
	Example 2: 
	
	public class Car {
	
	private String model; 
	
	public Car (String model) {
			
			this.model = model; 
	
		}
		
		//generate getters and setters 
		 
	}
	
	final Car car1 = new Car("Audi"); 
		car1.getModel(); => Audi 
		
		car1.getModel("Kia"); //this will work fine, because we just update the model of the car, we didn't create another object 
		
		car1 = new Car("bmw"); //this will not work, because we created a new object 
		
	If you deal with a primitive or String, then you can't change the value: 
	
		final int class = 100; 
		class = 200; //this is not possible, because it is a primitive. 
		
======================================================================================================================
	
	super. vs super() 
	
	public int void calculate (final int num){
	
		n = 200; //this is not possible, if we call from the main method to call it, then it will not be possible if you pass another value like; 
				caluculate (100); //this will not work. 
	} 
	 
	final String CITY = "Miami"; 
	CITY.toUpperCase(); is possible, but once you say CITY = CITY.toUpperCase(); is not possible, because you tell your 
	object city to point to a different object. 
	 

 Note: 
 	When we override a method, and need access to parent version of the method. We can use super.methodname
	
	 
super. => calls parent class variables and methods. 

this. will help us access current class variables and methods. 

super. will help us access super class variables and methods. 

It is useful when we do overriding. 

======================================================================================================================

Can you override static methods? 

	-> We can not override static methods, but we can HIDE them. 
	
Can you override an inherited variable? 
	
	-> Yes, we can hide the variables. 
Example: 
	public class A {
	
		publict String var1; 
		
	}
	
	public class B extends A {
	
		publict String var1; 
		
	}

	static methods and static variables are hidden and not overriden. 


final variables are inheritted as long as access modifiers is not private. 

What is Hiding in inheritance? 

Inherited Static methods and variables are hidden.  

-> When you declare SAME variable in the sub class, it will be variable Hidding and the closest version of the variable will be used. 


	public class ProgrammingLanguage extends Language{
	
	//variable hiding. Hiding of parent class name variable 
	
	public String name = "Programming Language"; 
	
	public void printProgrammingName () {
		
		System.out.println("Language L: " + name);
	}

}

	-> Whenever we use the name variable in the Sub class, it will use Sub Class version. 
       Because we are hiding the super class version.  
	
	-> When you are overriding, if not static, then it will go and find the child class insteand of the parent version 
	   when we hide static methods, java will call the closest static method while executing the code. 
	   
	-> If the code is runnning in the parent's class, it will use parent class version of variable and static method. 
	-> If the code is running in the sub-class, it will use the sub-class version of variable and static methods. 
	-> It will use the closest one, if the variables or static methods are HIDDEN. 
	
	-> If it is not hidden, it will always go to parent version. 
	


	-> When doing method overriding, it will always call overriden version, offcourse if the object is from Sub Class. If the Object is from the 
	super class, it will never goto overriden super class. 
	

	Difference between Method Overloading, Overriding vs Hidding? 
	
	Overloading: -> same name, different parameters, can be inherited and return type is not important
	
	Overriding -> inherited methods with same name, same parameters, Access Modifiers is same or more vissible and return type is same or sub type. 
	
	Hiding -> inherited static methods/variable are hidden, same name, same parameters. 
	
	
	======================================================================================================================
	
	INHERITANCE -> Sub Class gets variables and methods from parent class. 
	
		
		- constructors 
		- methods 
		- access modifiers 
		- overriding 
		- static blocks and init blocks in the parent class/child class. 
		
	Homework: 
		1): Super class; 
			- static block 
			- init block 
			- constructor 
			
		2) Sub class: 
		 	- static block 
		 	- init block 
		 	- constructor 
		

 
	 */
	
	
}
