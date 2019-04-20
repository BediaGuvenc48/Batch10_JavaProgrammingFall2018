package day30_Method01;

public class Note {

    /*


-	Benefit of writing methods, in some language’s methods are called funtions;
o	Reusable code
o	Organize code
o	Maintainable code // Flexible that you can change your code if needed
o	Readable code/simple to read

public static void sayHello() {

		System.out.println("Hello");
		System.out.println("Hi");

1.	We can define out custom methods within a class.
All methods must be written within a class, it cannot be written outside the class.

2.	We can put any number of statement that we want to reuse within the methods. Once we write the methods, they do not run unless you call/use them.

3.	When you are calling, you type method name and it will go and execute the code within that custom method.

Pubic class Main {
Public static void main (String) [] args){
sayHellow();
sayBye();

}

Public static void sayBye(); {

}

-	Part by part analysis of the method definition:
-	Methods can be different, the below method is void and does  not accept parameters.

Public static void main (String [] args ){

-	Public ---> is access modifier that means this method is visible to the world. Can be called from any class in the same project.
Public, protected, <default>, private

-	Static ---> is a modifier that mean it belongs directly to the class and not dependent on object.
-	Void >>> means that it doesn’t return a value. It means when we call this method, it performs an action and does not return a value back to use.
Ex:

Arrays.sort(arr); >>>> sort is a static method

This was a created class that can be called in any class.
}

public static void sayHello() {

-	sayHello is the name of the method.

}

public static void sayHelloTo(String name) {

			System.out.println("Hello " + name);

		}
sayHelloTo(String name)  it means whenever we call sayHelloTo methods, we need to give String value to it.
String name ---> is a method input /arguments/parameter

sayHellowTo(); / will not work, since we defined this method to accept a string value.

sayHelloTo (“Nazim”); // this will work since we are passing String input to the method.


10/16/2018
----------

Java Day 30.
-----------

Repl.it assignments

Mentoring sessions

Group studies

monday: 9-11

sundays:
----------------
operators
primitive variables
String
Conditional statements
Loops
Arrays
================

str.toUpperCase();
	in the above statement: toUpperCase is a method of String class.

input.nextInt()
	 .next();
	 .nextDouble();

System.out.println(message);
println is a method/action. When you use it, it performs some actions.

main method -> JDK starts execution of your code from main method.
======================

Writing custom/our own methods:
=================

Benefit of writing methods, in some languages methods are called functions:
	- reusable code
	- organize code
	- maintainable code
	- readable code/simple to read
===================================

Anytime you write a method in Java, it is associated to a class.
You write methods within classes.

Class is template:
	can have 2 things:
		- data/attributes
		- behaviour/methods


================


public static void main(String[] args) {
		sayHello(); // calling sayHello method
		sayHello();
	}

	public static void sayHello() {
		System.out.println("Hello");
		System.out.println("Hi!");
	}


We can define our custom methods within a class.
All methods must be written within a class, it cannot be written outside the class.

We can put any number of statements that we want to reuse within the methods.
Once we write the methods, they do not run unless you call/use them.

When you are calling , you type method name and
it will go and execute the code within that custom method.


public class Main{
	public static void main(String[] args) {
		sayHello();
		sayBye();
		sayBye();
		sayBye();
		sayBye();
		System.out.println("Bye! Have a good day!");
	}


	public static void sayBye() {
		System.out.println("Adios! Tenga buen dia! ");
	}

	public static void sayHello() {
		System.out.println("Hello");
		System.out.println("Hi!");
	}

}

==================

Part by part analysis of the method definition:
Methods can be different, the below method is
void and does not accept parameters.


public static void sayHello() {
	System.out.println("Hello");
}

public -> access modifier that means this method is visible to the world. Can be called from any class in the same project.
	public, protected, <default>, private

static -> is a modifier that means it belongs directly to the class and not dependent on object. Method can be called by classname.
	Ex:
		Arrays.sort(arr) -> sort is a static method and called by using classname
		Scanner input = new Scanner(System.in);
		input.nextInt();

void -> means that this method does not return a value.
	 -> it means when we call this method, it performs some actions
	 but does not return a value back to us.

	 sayHello();

public static void sayHello() {
	System.out.println("Hello");
}

String str = "java";

int l = str.length();

print l

System.out.println(str.length());

In the example of length() -> the method return a int value.

When method is void, it does not return anything.

VOID == NO RETURN VALUE

We cannot say:
String message = sayHello();
System.out.println ( sayHello() );

-----
public static void sayHello() {
	System.out.println("Hello");
}
sayHello -> is a method name. normally we start with lowercase letter then rest is camelCase. it should be meaningful name, and
it follows same rules of variable naming.

sayHello () -> we need to always put paranthesis, and in this example it is empty but anytime we can pass inputs/arguments/parameters . By declaring variable in it.
==========================


Summary:

-	introduction to methods
-	purpose and benefits of writing methods
-	few keywords overview
-	syntax of how to create:
1.	VOID methods that does not accept any parameters
2.	VOID methods that accepts one or more parameters
3.

     */
}
