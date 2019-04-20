package day12_classObject_Strings;

public class Note {

    /*


Teacher: Moradil

Java Programming Class:

What we studied so far:

-	How computer works?
-	How programming works?
-	Data types  primitive
-	Variable
-	Operators (arithmetic, shorthand, increment, decrement, comparison (>,<)
-	Logical (&&, ||, !)
-	Boolean
-	Conditionals statements;
(if, if else, if else if)
-	Ternary: ? Question mark
-	Switch case;
-	Keywords; break, return and etc.

Today’s topic:
-	What is class?
-	What is Object?
-	String class
-	String manipulation methods
-	*** String is the most popular in programming language and the following are also important:
o	Loops
o	Arrays
o	Custom methods

Char ch = ‘a’; //ASCII number - 97

Char ch2 = ‘b’; 98

Boolean b = ch < ch2; //true
	98    97    98
B = ch2 >= ‘a’ && ch2 <= ‘d’; //

If have to memorize the ASCII table.

1.	Primitive Types:
-	Integer (whole numbers);
o	byte
o	short
o	int
o	long
-	Floating point (with Decimals):
o	float
o	double
-	char
-	boolean

2.	Non-Primitive types, Objects, Class types

Note: Primitives come built in to Java and we cannot change or create out customized primitives.

--- Non-Primitives types – some of them come ready in the java, or we can anytime write our own classes.

int n = 20;

Primitives are just peace of values.
In our variables we store only value 20. And there is no behavior or action that n variable can do.

Primitive types are just a single value and there is no action built into it.

Example:
When we say CAR, we just describing in our imaging:
-	Color, model, year, mileage, vin # (these are just data or attribute for any CAR).
-	Actions you can do it with CAR: start on, drive, reverse, accelerate, park, drift, break and etc. This is what any car do in general, no matter what type of car you are talking about.

The description above is a template/blueprint. That is a CLASS

Object: is something that is created from the CALSS:

Color, 	model, 	year, 	mileage, 	vin #
Car1 - White, Audi A6, 	2007, 	1200000, 	VSLJAKFSAJFLKKASJF
	Car1.start();
	Car1.drive();
	Car1.stop();
These are behaviors that  Car1 do.

By looking at the CLASS above, we are describing a Specific CAR in parking lot that belongs to one of the Students in Tyson’s Campus.

  Color, 	model, 	year, 	mileage, 	vin #
Car2 - Black, 	 BMW, 		2015, 	50000, 	WSL050U52035085

Car2.start();
	Car2.start();
Car2.drive();
	Car2.stop();

These are behaviors that Car2 does.
-------------------------------------------------------------------------------------------------------------------------------

Example:

Computer:
-	Attributes/Data: Any information that fits about the computer called attributes or data.

Model, 	Size, 		RAM, 		Year, 		Color, 		CPU, 		OS

Actions or behaviors computer should doing:
-	Start, calculate, display, code and etc.

Computer1 Object:
Model, 	Size, 		RAM, 		Year, 		Color, 		CPU, 		OS
Lenovo, 	15in, 		8Gig, 		2012, 		Sliver, 		Intel i5, 	Windows

Computer1.start();
Compouter1.operate();
Computer1.program();
Compouter1.calculate();

Note: In a computer we can store multiple data in a variable.

CLASS 	- OBJECT
	- OBJECT

COMOPUTER CLASS  	-- LENOVO OBJECT
			-- DEL OBJECT
			-- MAC OBJECT

BLUE PRINT: is like a sketch, idea or imagination that you want to create an application and you just want to put it in paper or computer to describe it for your group members.

PHONE:
	Data: 		Model: 	Screen Size: 		Cameras, 	0S
Behaviors:  Call, Text

PHONE CLASS:
	-Phone1: 	Data: 		Model: 	Screen Size: 		Cameras, 	0S

Samsung galaxy	 6 		        2		Android
-Phone1: 	Data: 		Model: 	Screen Size: 		Cameras, 	0S

Nokia	 	2		        	0



There are 2 things inside the CLASS all the times:
1.	Data
2.	Behaviors


Example:
WATCH:
Attribute (brand, style, color, materials, price, types)
basic behaviors (Tick, show-time, show-Date)
-------------------------------------------------------------------------------------------------------------------------------

Primitive: is a single piece of data in java, example: (byte floor = 3;    char letter = ‘a’;)

Object CLASS TYPE (can have multiple pieces of data (Student student = new Student (); student.age=33; student.course = “java”;

String, Scanner:
	Every time we used them we created object from them.

String str = “Hello”;
String model = new String(“Apple”);

Scanner scan = new Scanner(System.in);

New keyword is used to created objects from a class.

String class 	-- str(String object) -- “Hello”
		- model(String object) - “Apple”

New:
Used to create an object from a class.
String language = new String(“Java”);
Student mark = new Student ();
Account debit = new Account();


String:
-	String firstName = new String (“Mark”);
-	String lastName = “Smith”;
-	Int num = 100; only we store a value in here.
-	String email = firstName + lastName + “@gmail.com”;

	String name = "Khalili";
1. declaring a variable -> String name (name and type of variables are being declared
	 *  	---> variable name is "name" and type is String
	 *  	---> Hey java, I want you to create a variable called name
	 *  	---> that can store String Object
	 *  2. Assign value --> here it is String Object.
	 *  	---> Anything in double quotes is String object with that value

- For String class 2 ways to create object;

1.	Direct assignment just like primitive
	String name = “Mark”;

2.	New keyword:
String middleName = new String(“T”);
String name = new String (“Mark”);

String str = “hello”;
		‘h’	‘e’	‘l’	‘l’	‘o’
		0	1	2	3	4

Whenever we write a String, there are a combination of chars that we put together, in example above shows 5 char symbols and that was coded before by someone in the past.

String city = new String (“Kabul”);

		‘K’	‘a’	‘b’	‘u’	‘l’
		0	1	2	3	4

SPACE:
 (Space is a character by itself in Java and there is ASCII code behind the seen related to space).

String Actions:
String Method:
String Manipulation Methods:

1.	CASE CONVERTION METHODS:
-	toUpperCase();
-	toLowerCase();
2.	length()  counts the characters and give us the result  (it starts counting from 1 to whatever number you have in the characters, it doesn’t start from 0).

Note: Anything in double quotes is a String and we can also use it this way:
System.out.println("java".length()   );

( ) - is used to end the method/actions when you call them using objects.

If the result of a function is a number, then the variable should be created as integer like the example below:

int count = name.length();


3.	Get a character at a certain position:

charAt(index) - return a single char at the position.

String str = “abc”;
System.out.println(str.charAt(0)); /a;
System.out.println(str.charAt(1)); /b;
System.out.println(str.charAt(2)); /c;
System.out.println(str.charAt(3)); / not valid




     */
}
