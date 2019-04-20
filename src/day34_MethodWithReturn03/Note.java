package day34_MethodWithReturn03;

public class Note {

    /*

        Java Methods:

Main method Variations:

COMMAND LINE ARGUMENT:

How to pass values to main method:
How to pass inputs/arguments to main method:

1)	Write java code and save with .java extension
2)	Compile the code:
javac ClassName.java
3)	Run the code and pass values;
java ClassName computer car wallet bicycle “race car”
	Above string values/objects will be input or will be assigned to main method Array.

public class Virginia{

	public static void main (String [] args){
	System.out.println(args.length);
	for (String str : args){
		System.out.println(str.toUpperCase());
	}
  }
}

==============================================================================

… ==> Var – Args in Java (Var stands for Vary which you can pass different values to it).

What is Var-Args?

Whenever we want to create a method that is able to accept any number of parameters of same type, then we can use VarArgs in Java.

How we create Var-Args:

public static void myMethod (double … values){

}
In example above myMethod can accept zero or more double inputs.

How to call?

We can say myMethod(); // ArrayIndexOutOfBoundException
myMethod(12.4); //12.4
myMethod(16.4, 15.99, 23, 55); //16.4

Important: Var-Args can only be used in method signature/method definition as argument. (You can’t create a variable by using … outside method).

How to handle it or work with it?

When you have Var-Args parameter in your method. Then you can treat that parameter as an Array, whatever an Array can do, your parameter will do same functions.

If you want to add more parameters to your method Var-Args needs to be always the last one:

Note: you can add additional arguments, but you have to push Var-Args at the end like example below:

public static int sum(String name, int … numbers){

}

public static int sumAll(boolean ok, String name,  int … numbers){

int sum = 0;

System.out.println(name)

for (int n : numbers){

System.out.println(n);
}

}

When we call method with VarArgs: it is very flexible so:
-	We can pass Zero inputs
-	We can put any number of inputs
-	We can pass array of same type, even if you give an array to Var-Args, it will accept it


Public static int addAll(int … nums){
}

1.	addAll();
2.	addAll(23,34,45,46,56);
3.	int[] arr

Java Day 34
-----------

Java Methods:

Java Code > Compile > Run
Source code >  ByteCode > Execute

Main method Variations:
	1. public static void main(String[] args){}
	2. static public void main(String[] params){}
	3. public static void main(String... args){}

Windows -> powershell
Mac -> terminal

How to pass values to main method:
How to pass inputs/arguments to main method:

COMMAND LINE ARGUMENTS

1) write java code and save with .java extension
2) compile the code:
	javac ClassName.java

3) Run the code and pass values:
	java ClassName computer car wallet bicycle "race car"

String[] args = {"computer", "car", "wallet", "bicycle", "race car"};

	Above string values/objects will be an input /
	will be assigned to main method's array.

	public static void main(String[] args) {
		System.out.println(args.length );

		for(String str : args) {
			System.out.println(str.toUpperCase());
		}
	}

=============================

...  ==> Var-Args in Java

What:
 Whenever we want to create a method that is able to accept any number of parameters(same type), then we can use VarArgs in Java.

How:
  public static void myMethod(double... values) {

  }

IMPORTANT: VarArgs can ONLY be used in method signature/Method definition as argument.


In Above example myMethod can accept 0 or more double
inputs.

How to call:
	myMethod();
	myMethod(12.4, 14.5);
	myMethod(162.4, 14.5, 43.3, 23, 453);

How to work with it:
	When you have VarArgs parameter in your method.
	then you can treat that parameter as an ARRAY.

	-
    myMethod();//ArrayIndexOutOfBounds Exception
	myMethod(12.4, 14.5); // 12.4
	myMethod(162.4, 14.5, 43.3, 23, 453); // 162.4


-----
If you want to add more parameters to your method,
VarArgs needs to be always the last one:

public static int addAll(String name, int... nums) {
	int sum = 0;
	System.out.println(name);
	for(int n : nums) {
		sum+=n;
	}
	return sum;
}

public static int addAll(boolean ok, String name, int... nums) {

}
addAll(23,43,35,45)
public static int addAll( int start, int... nums) {

}
-------------

When we call method with VarArgs:
it is very flexible so:
	- we can pass Zero inputs
	- we can pass any number of inputs
	- we can pass an array of same type

public static int addAll(int... nums) {
   //
}

1) addAll();
2) addAll(23,34,45,46,56);
3) int[] arr = {43,5454,23,34,23};
   addAll(arr);
=======================================

Summary:
	- main method.
		- different ways of writing main method
		- how to pass command line arguments to main method
		- varargs ... and how to use them
-----------------------------------


     */
}
