package day47_inheritanceIntro;

public class Notes_47_Inheritance {
	
	
	/*

	Inheritance in Java.

	OOP:
		- encapsulation
		- inheritance
		- abstraction
		- polymorhism

	in a single class we can put: 
		- instance variable 
		- methods 
		- constructor(s) 
		- static blocks 
		- init blocks 
		- static methods 
		- static variables 

	=> inner Classes -> will be discussed later, it is class inside another class 
		
	=> import statements 
	=> package statement 

	---------------------------------------------------------------------------------------------------------------------------------

	What makes you to be rich soon? 

	Inheritance: 

	 -> When one class acquires/inherits variables and methods from another class. 
	 
	 We have the following inheritance classes: 
	 
	 1): Parent Class 
	 
	 2): Child Class: inherits methos and variables from parent class and we call this relationship IS-A relationship. 
	 
	 	Example if you have a Parent class Drink: 
	 	
	 	Parent class: 	Drink 
	 	Child class: 	Coffee 
	 	Coffee IS-A drink 
	 	Tea IS-A drink 
	 	Milk IS-A drink 
	 	
	=> Extends: it is another keyword in Java and used to establish the inheritance relation between classes. 

	 	Parent class: 	Drink 
	 	Child class: 	Coffee 
	 	
	 	public class Drink {
	 	
	 		String name; 
	 	}
	 	
	 		Note: in order to establish the relationship between Coffee and Drink class, we need to use extends all lower case to estabslih 
	 			  inheritance relationship  example below. Now, whatever is inside the class Drink will be also availlable for class Cofee. 
	 	
	 	public class Coffee extends Drink {
	 	
	 		 
	 	}
	 	
	 	why we use inheritance? 
	 	
	 		-> providing reusable codes, easier to maintain, good programming design technique and maybe less memory. 
	 		
	 	
	 	=> super class = parent class = base class. 
	 	
	 	Drink: 		parent class, 
	 				super class, 
	 				base class, 
	 			
	 	Coffee: 	child class, 
	 				sub class, 
	 				derived class, 
	 				
	 	Single Inheritance: like; 
	 	
	 	public class Drink {
	 	
	 	} 	
	 	
	 	public class Cofee extneds Drink {
	 	
	 	}	 
	 	
	 	Multi Level Inheritance: you have one super class and multiple sub-classes taht extends from the same super classes. like; 
	 	
	 		public class Animal{
	 		
	 		}
	 		
	 		public class Bird extends Animal{
	 		
	 		}
	 		
	 		public class Mamal extends Animal{
	 		
	 		}
	 		
	 		public class Tiger exends Mamal extends Animal{
	 		
	 		}
	 		
	 		Note: during inheritance classes it only goes forward, not backward, meaning that child inherits from parents, but parents don't ineherits from 
	 			  the children. So, it is one way. 

			
		Variables and method in Drink class is availlable/inherited to Coffee class. 
		
		If Coffee class adds a variable or methods, it will not be availlable for drink class. 

		
		public class Tea extends Drink {
		
		}
			
			      Drink Class: 
		
		Cofee Class			Tea Class 

	Java does not support multiple inheritance:

	Coffee -> Drink
	       -> Beverage

	public class Coffee extends Drink, Beverage{
		
	}

	-> Multiple inheritance: If a class takes multiple super classes or a child class takes 2 or more parent classes, Java is not supporting it, maybe 
								 other languages support. 
								 
	Above code will not work in java,
	In Java, a class can extend only ONE class
	Class can have ONLY ONE parent/super class

Example: 

Super/Parent/Base class: 
	Vehicle: 	makeAndModel 
				year 
				maxSpeed 

Sub/Child class: 
	Car:
	
CarMax => 

So far we saw how classes can inherit from each other and reuse their instance variables and methods. 

How about static variables and methods? Do they inherite the same exact way? 

Object Class: It is the parent class of all the classes including parents, child and any other classes.
 			  Object is a special class in Java that is a super/parent class for All other classes. 
 			  If you have a class and you did not add extends keyword and inherit from another class, then compiler will 
 			  extends Object automatically for you. 
 	Example: 
 	
 	figure 1.1: 
 	public class laptop{
 	
 	}
 	
 	figure 1.2: 
 	public class laptop extends Object{
 	
 	}
 	
 	so the figure 1.1 & figure 1.2 are the same, becasue in figure 1.1 the compiler automatically extends behind the seen 
 	the Ojbect and you can access anything which is in Object class. 

=> By default, if you don't inherite any class, it will inherit from the object direclty. In java everything is object 
   that is why we say Java is an object oriented programming. 

 
 What will be inherited from a super class to sub class? & what will not be inherited from parent class to child class? 
 
 -> To know the above questions 
 

Access modifiers: 

-> There are 4 types of Access Modifiers: 

1): private: Accessable to the SAME class ONLY. It will not be inherited. If your super class has private variables, 

2): <default> (empty) or no modifiers-> we also call it package private: We don't type anything, but it is accessible to the classes 
						 and sub-classes in the same package.  
					     Default members will only be accessable or inherited if both Parent and Child classes are in same 
					     exact package. 

3):	protected: Accessable to the classes in the same packages and only sub-classes or child classes are in different packages.
   			-> All protected members (variables, methods) are inherited from the super class.  

4): public: It is accessable to the world(meaning All classes, sub classes in same package or different package). It also means 
			that all public variables and methods are Always inherited. No matter whaever package you use. 


Non-Access Modifiers are static, final and some others that we study in the future. 

Muradil's notes: 

public class Battery {
	
}

import java.lang.*;

public class Battery extends Object {
	public Battery(){}
}

=============

public class A extends Object{
	
}

public class B extends A{
	
}

public class C extends B {
	
}

Object > A > B > C > D

A a = new A();
a.

Object is a special class in Java, that is a super/parent class for ALL other classes.

If you have a class and you did not add extends keyword and inherit from another class,
Compiler will ADD (extends Object) for you.

public class Laptop extends Object {
	
}

public class Device extends Object{
	
}

public class Laptop extends Device {
	
}

Object > Device > Laptop


Memo: 

	-> If you want to access any class, you can just import it from the jar file and then you can access it. 


Access Modiffiers Summary: 

package a: 
public class One{
	private int num1; 
	protected int num2; 
	int num3; 
	public int num4; 

}

public class Two extends One{

	//num2, num3 and num4 are accessible  
} 

public class Three {

	 main {
	 
	 	//num2, num3 & num4 are accessible 
	 }
} 


package b: 

public class Four extends One {

	//num2, num4 are accessible 
}

public class Five{
	//num4
}

 
Introduction to Inheritance
Access modifiers
What is inherited and not?

-> All public , protected members are always inherited.

-> Default members are inherited only if in same package

-> Private members are Not inherited
==================================













	 */

}
