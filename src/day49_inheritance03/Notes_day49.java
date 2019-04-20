package day49_inheritance03;

public class Notes_day49 {
	
/*
 OOP: 
 
 - Inheritance 
 - Abstraction 
 	-> Abstract Classes 
 	-> Interface 
 	
 super(): -> It calls a super/parent class constructor 

 -> When you create an object from a sub class. It will always call parent classe's constructor first. 
 
 Example: 
 
 public class Animal {
 
 	public Animal () {
 		System.out.println("Animal Object is created "); 
 	}
 
 
 	public class Cat extends Animal () {
 		System.out.println("Cat is a nice Animal"); 
 	}
 
 
 	public class Test {
 	
 		public static void main (String ... args){
 		
 		
 		Animal animal = new Animal (); 
 		
 		Cat cat = new Cat(); 
 		
 		
 		}
 	}

 }
 
  so if we run the Cat class, it will call the Animal class first and then Cat class. 
 
 		
	public Cat () {
		super(); //if you don't put the super() class, constructor will put it for you. and it is always there 
		System.out.println("CAT Object is Running");
	}	
	

Public class A {
	public A() {
		print "A"; 
	}
}

public class B extends A {


}

if there is nothing inside the result will be: 	
	
	B b = new B(); //prints "A" 

even we don't add acontructor by default this will be added to the class

public class B extends A {

	public B () {
		
		super(); 
	
	}
} 


First statement of the constructor is always call to parent class constructor. 
Unless sub class have multiple constructors and using this() statement.

If a parent class has ONLY constructor(1) that accept an argument/parameter: 
If a parent class does NOT have a no-args Constructor:
  then Sub class constructor:
        must use super() keyword with matching arguments.


>> When we create Object Anmial, at first it will call Animal constructor, then Create ojbect of Cat, so it will call
   Cat's constructor. 
   
   So, overall we have one Cat ojbect, the object of Animal is there and the child classes is inside it and whenver 
   we call another method, it will call the parent's class first, then the other method. 
   
>> If a parent class has ONLY constructor (1) that accepts an argument/parameter. 

-> super() vs this(); 

	- super(): -> is used to call parent class constructor. 
	- this(): -> is used to call same class contructor. 
	
Example: 

our verison: 

public class A {

}

public class B extends A {

}

After compiling the following happens. 
1st  thing happens: -> it imports java.lang.*; 
2nd  thing happens: -> public class A extends Object; 

public class B extends A {

	public B() {
	
	super(); 
	
	}
}

Note: If you write any primitive or objects like int, double, string, StrinbBuilder and etc, why the compiler doesn't complain, because 
	  by default the following is imported;  ->	import java.lang.*; 
 ======================================================================================================================================== 
  

Method Overriding: 
 
Example: 
	public class Student {
	
		public void attendAclass() {
			
			System.out.println("Student attending a class"); 
		}
	
	}
	

When inherited Method is re-created in Sub class with same method name, same parameters, same return type, this process 
is called method overriding. 

When do we need Method overriding? 
	-> whenever a Method is inheritted and the sub-class is not happy about its implementation, then sub class, can override 
	   it to customize for sub-class. 

Only inherited Methods from super class are Overriden. We can not 

Once you put @Override, then it will differenciate from the other methods, if you type different name, then it will cause 
problems. 

@Override: -> Is called annotation, is used to put on top of methods and it will check if you actually did overriding or not. 
			  if a method was not overrided, then it will check and give you error. 
			  
		   -> A Method in Sub-Class is overrides a method in Super Class. 
		   
		   -> If you don't put @Override on the top of your overriden method, it still works, but it is better to put in order ot 
		   	  let other people know that you ovrride your method and it is proffessional. 

Method overriding is when 2 methods have same name and same parameters, same return type. only inheritted methods can be overriden. 

Method overloading: when 2 methods have same name, but different parameters and the return type is not important. 

Rules of Overriding: 

1): Method must be inherited from the super class. 

2): Overriding Method must have same signature (same name, same parameters) 

3): return type must be the same or covariant type(Sub class type). 

4): Access modifier must be same or more visible (it will be good with public and protect modifiers, but not with private and default).

5): throwing exceptions rule: will be discussed in the future classes. 

Overloading rules: 

1): 2 or more methods with same name and different parameters. return type, acess modifiers or any other components can be same or 
 	differen. Does not matter. Java Treats Overloaded Methods as Independent and separate methods. 
 	
 
 Methods from Object super class that are normally overriden: 
 
	 => toString 
	 => equals 
	 => hashCode 
 


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
	
	
	
	
	
	

}
