package day35_Recap;

public class Note {

    /*


Java Programming:
Agenda for next 2 days:
-	Warm up task with arrays
-	Method overloading
-	ArrayList
-	StringBuilder

What is overloading?
-	In one class we can define multiple version of methods with different method signatures.
-	In same class, we can’t have 2 methods with same name and parameters.

Method overloading:
-	When we have 2 or more classes same name, but different parameters, it is called overloading.

What is method signature?
-	The name is a part of method signature, the number of parameter and type of each parameters are a part of signature. (The method signature is consisting of method name, number of parameters and their types), same explained in first statement.

Example:
	Public static void mi1(int n, String str){}
-	Above method signature:
-	M1
-	2 parameters  1 int, 1 String
Return types, or other modifiers are not part of method signature.

Method overloading:
-	If we have same method name, same number of parameters, but if the types of parameters doesn’t much, then it is not Method overloading.
Example:
1.	public static void mi1(int n, int num){}
2.	public static void mi1(int n, String str){}

The example above has same method name, same parameter number which is 2, but the method type in # 1 it is int n & int num, the # 2 it is int n & String str. They are not overloading.


The reason for writing the different codes with same name, same types or parameters gives us more flexibility and our codes look good at the end. This is the power of Java Program, even in Java Script, it doesn’t work like this. So if you have multiple methods, same name, but different parameter number or types, then it will be compiled and processed by Java Program.

-	Remember, always the overloading methods should be in the same class.
-	Method overloading: - in same class, 2 or more methods with same name and different signature.
-	Methods must have same name, must have different parameters.
-	The purpose of overloading is to be able to keep same method name and able to pass the different types of parameter & method body can be different. It provides convenience when writing methods that do similar actions.

Ways to overload methods:

-	There are different ways to overload the methods, when we overload methods, Java looks each method as an independent one and sperate one that have nothing to do with each other, other than sharing the same name.

Question!:
1)	public static void m1(int n){}
public static double m1(int n){return 10.4;}

Both methods above have same signature:
-	Same name
-	Same number of parameters – 1
-	Same type – int

Above mentioned example will not compile, it is not overloading method, for overloading method we need same name, same type and same parameters count.

2)	public static void m1(String n){}
public static double m1(int n) {return 10.4;}

-	Same method name, and same parameter count, different types.
1.	Method name – m1
Parameters – 1 String
2.	Method name – m1
Parameter – 1 int
The example above is not overloading



3)	public class A{
public static void m1 (int n, String str){}
public static boolean m1(String str1, int num){true}


Yes, it is overloading, when we have 2 methods with same name, and same count of parameters with same types, but if their order of types is different it is still overloading.

Ex:
public static void study(String topic, int hours){}
public static boolean study(int hours, String topic){}

ArrayList:
-	is a collection type in Java.
-	Another data structure like array.
-	Unlike Array, ArrayList is dynamic, we can add, update, update & remove elements at any time. ArrayLists are not fixed size.

-	Arrays are great to work with multiple set of data, but if your data count is changing frequently, then since arrays are fix size, it might not be a good fit.

-	Whenever we work with dynamic collection of data, then ArrayList is a better option.

-	ArrayLis is the most popular data structure in Java that is used in development.

How to create an ArrayList:
1.	General Arraylist that can accept any type:
Example:
ArrayList list = new ArrayList();
list.add(“java”);
list.add(“selenium”);
list.add(1234);
list.add(432.4);
list.add(true);

2.	Create Restricted type. For example ArrayList that only can store String Objects or only integers.

ArrayList<String> names = new ArrayList<String>();

-	The Araylist is a class and should be imported like Scanner & Random Classes.



How to add a value to an arraylist?
-	Add method:
List.add(“value”);

How to get count of elements in ArrayList?
-	Size() method.
-	Int n = list.size();

How to read a value at a particular index?
-	get (index) method:
-	list.get(5);
-	println(list.get(0) );

How to get rid of an element in arraylist?
-	Remove (index);
-	Remove(object);

How to print in a formatted way in a single line?
-	System.out.println(list);
-	System.out.println(list.toString() );
Both of the above will do the same thing

isEmpty() -> boolean, if list has no element then it is true.

How to use ArrayList with primitives?
I want to create an arraylist that accepts only int values.

ArrayList<int> nums = new ArrayList<>(); //this code will not compile

Disadvantage of ArrayList: cannot accept primitives. It can only accept objects.
Byte > short > int > long
float > double
char > boolean

to handle this sort of situation, in Java we have wrapper classes on top of primitives and they are no long primitive and they changed to object.

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean - > Boolean

ArrayList<int> nums = new ArrayList<>(); // this will not work and we use instead the following method:
ArrayList<Integer> nums = new ArrayList<>(); //this will work













-------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------

Mr. Moradil’s Notes:

Overloading vs Overriding?
--------------------------
public class Birthday {

	public static void happyBirthday(){
		System.out.println("Happy Birthday! Anastasia!");
	}

	public static void happyBirthday(String wishes){
		System.out.println("Happy Birthday! Anastasia!");
		System.out.println(wishes);
	}

	public static void happyBirthday(String wishes, String gift){
		System.out.println("Happy Birthday! Anastasia!");
		System.out.println(wishes);
		System.out.println("Please accept this gift:" + gift);
	}

	public static boolean happyBirthday(int times){
		for(int i = 1; i <= times; i++){
		     System.out.println("Happy Birthday! Anastasia!");

		}
		if (times > 0) {
			return true;
		}
		return false;
	}
}

- In same class, we cannot have 2 methods with same name and parameters.

- Method overloading:
	when we have 2 or more methods with SAME NAME and
	DIFFERENT PARAMETERS.

- Method signature:
		consists of: method name, number of paramters and their types:
			public static void m1(int n, String str) {}

			Above method signature:
				m1
				2 parameters -> 1 int, 1 string
	Return type, or other modifiers are not part of method signature.

- Method overloading:
	When we have 2 or more methods with same name but different method signatures.
========================================

When we overload methods, java looks at each method as an independent one and separate one that have noting to do with each other, other than sharing the same name.

Purpose of overloading is to be able to keep same method name and able to pass different types of paramters and method body can be different. It provides convenience when writing methods that do similar actions.

!- Method overloading : -In same class, 2 or more methods with same name and different parameters.
						- In same class, 2 or more methods with same name but different signatures.

						- MUST have same name, MUST have different parameters

Ways to overload methods:
	Question 1!:
	public class A{
		public static void   m1(int n) {}
		public static double m1(int n1) { return 10.4;}
	}

	Both same signature:
		- same name
		- same number of paramters - 1
		- same type - int

	Above code will not COMPILE. its not Overloading. Return has nothing to do in overloading.

	For overloading we need same name and different parameters.
-----------------------
	Question 2:
	public class A{
		public static void  m1(String n) {}
		public static double m1(int n1) { return 10.4;}
	}

	- Same method name, and same paramter count, different types.

	1- method name - m1
	   parameters - 1 String
	2- method name- m1
		parameter - 1 int
------------------------

	Question 3:
	public class A{
		public static void  m1(int n) {}
		public static boolean  m1(int n, int nn) { return true;}
	}

	Same name , different count of parameters
	1 is 1 int
	2 is 2 ints
================

	Question 4:
	public class A{
		public static void     m1(int n, String str)    {}
		public static boolean  m1(String str, int nn) { return true;}
	}

	Yes it is overloading!
	When we have 2 methods with same name, and same count of parameters with same types, but if their order of types is different it is still overloading.

	Ex:
		public static void study(String topic, int hours) {}
		public static void study(int hours, String topic) {}


	When the order of parameters changes, signature is also different. Now we need to look for order of parameter types as well.

	public static void study(String topic, int hours) {}
	public static void study(String t, int h, int day) {}









     */
}
