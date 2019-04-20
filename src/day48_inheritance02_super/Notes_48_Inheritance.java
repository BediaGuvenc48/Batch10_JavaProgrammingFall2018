package day48_inheritance02_super;

public class Notes_48_Inheritance {

	
/*
 
 -> If you want to import something, just put the name of Package.NameOfTheMethod 
 
 
 Proteted Access Modiffiers: The sub-classes can be accessed if you use interitance and you create an object of the same class 

Java Programming Day 48.

Module: OOP
	- Encapsulatiom
	- Inheritance
	- Abstraction
	- Polymorphism
=====================


Inheritance: => 
	super class => sub class
	A class(Sub class) inherits variables and methods from another class(Super class).

	Sub class IS-A super class

public class Super{
	protected int numberOfPpl;
	public void printNum() {
		print "number of ppl is " + numberOfPpl;
	}
}

public class Sub1 extends Super {
	 
}

public class Sub2 extends Super {
	 
}

public class SubSub1 extends Sub1 {
	 
}
===============================

Super > Sub1 > SubSub1
			 > SubSub2
      > Sub2
===============================

Access modifiers:
	1. private - same class only
	2. <default> - visible in same package only, no matter if in sub class or not in sub class
	3. protected - visible to everyone in same package, and only subclasses in different packages.
	Protected variables are visible to sub classes in other packages, when we use them in inherited way.
	4. public - visible to world(all packages in same project)

package furnituretests:

	default var1,
	protected var2;

package bednbath;
	avaiable here: var2
==========================
 
 
 => super keyword in Java: 
 
 	-> super can be used in 2 ways 
 	
 	1): super() -> super with parenthesis calls parent class construtor 
 		this() => calls constructor in same class 
 		
 		super() can be used only within constructor to call parent class constructor. If we use super() then we don't 
 		need to set the value in from setters. 
 		
 		super() should be on the top like this() keyword which was calling the constructor. 
 		
 		super() can be only one time 
 		
 		super() & this() can't work together, we should use one of them and each of them do a different job. 
 	
 	
 	2): super. //super with dot 

 	public class A {
 	
 		public A (){
 		
 			this(name, age); 
 		
 		}
 		
 		public A (String name){
 		
 		}
 		
 		public A (String name, int age){
 		
 			this.name = name; 
 			this.age = age; 
 		}
 	}
 
 
 
 
 
 
 
 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
