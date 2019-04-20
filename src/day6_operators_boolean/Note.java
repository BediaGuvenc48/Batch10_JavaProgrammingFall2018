package day6_operators_boolean;

public class Note {

    /*

    Java Programming Class:

Eclipse IDE – Integrated Development Environment
IDE

Purpose of IDE:
-	More organized code into projects
-	Immediate feedback if code has any compile issues
-	Support for different tools using plugs
-	Automatic compile and run with a click of a button
-	Keyboard short cuts that can be used

CodeLab  it helps you with practicing simple and focused piece of code.

-	We will unlock more questions as the classes continue from CodeLab.

Eclipse:
-	Everything is organized into separate Java projects, in one project we store the codes only related it or to support it.
Example:
o	HelloWorld Project - java class1
  Java class2
  Java class3
  Java class4
-	If you type project explorer in quick access to run
-	If javaproject is disappeared from the file menue, then go to project … and then look for the javaproject.
-	JRE System Library – means that we use Java in this project
-	Workspace  Java

package day4_operator;

public class WarmUpTask {

}

Within Java project, we organize our code into packages just like shelves in your kitchen.  You can simply look at your packages as a folder and in that folder we store java programs.
If you put // in java program then it is a comment.

If you want to print something in one line, then you use System.out.print and if you want to print in separate lines, then you use System.out.println.

Arithmetic Operators:
+, -, *, /, %

Scanner; when you use the scanner then you need to import it from the java.util. The scanner is already created by someone else and we need to import it. It is a code which has been already written and we just use it. You can bring java.util manually if you know how to type it, otherwise you can import it by pointing the mouse to the scanner word.

Scan.nextInt(); means it will wait for you to put or enter the Integer.

How to ask to enter int value during runtime?

Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int n = scan.nextInt();

% is a remainder operator in Java.
It will return remainder between 2 numbers.
If there is no remainder then it will return 0.

10 % 5 - 5 + 5

10 % 3  3 + 3 + 3 + 1

Find out if a number is even or odd

Int num = 12;
num % 2  0  even number

num = 11;
num % 2  1  odd number

Arithmetic Operators Precedence’:

If you multiply integer with integer then the result will be integer not double.

If you divide whole numbers then you receive the whole number. If you use double, integer, then it will be double and integer and it will not be mixed.

Integer division problems:
-	5/2 results an integer 2.
-	5.0/2
==============================================================================

Import java.util.Scanner;
Scanner Scan

Interactive programs with Scanner class:

Imports and Scanner class

-	Java classes are organized into packages and need to be imported to your class to be used. Import packageName.className; Scanner is in package java.util

-	Import java.util.Scanner;

-	Scanner input = new Scanner(System.in);

-	System.out.println

***Scanner is a library for java which comes with Java and you just need to import it by taking the cursor to the scanner word. You have to put some input for scanner to get the result.

String firstName = input.next();
Int age = input.nextInt();

Type Casting (Casting Primitives):

-	Casting is used to convert one type of primitives to other.
Example: 	int i 	= 100;
		byte b = i; (this doesn’t work, already a variable is in the same name).
		byte b = (byte)i;

Note: if you have a variable which is smaller like byte<integer and you really want to put it in the same variable then you have to use from casting converter.

byte < short < int < long
float < double
char
boolean



whenever we need to assign a larger type value into smaller one, we need to cast it/ convert it.

Example:
double price = 12.5;
int price2 = (int)price;

Types of casting:
1.	implicit casting: happens automatically, without us telling java to do so.
Ex: 		int 		count 	= 345;
		Double 	d 	= count; //-345.0
Whenever we try to assign smaller type value into larger, then there is no need to convert it, Java will automatically do it for us.

2.	explicit casting : Whenever we try to assign larger into smaller, then we have to convert by explicit casting.
Example:
int students = 70;
byte byteStudents = (byte) students;

*** in programming, sometime. You might need to assign a larger type of data into smaller type of variable.
Int those cases, casting can be used. Every programming language provides a way to convert from tone type to another.

Casting primitives:
	 implicit
	Example: 	int n = 100;
			Double d = n; //100.0

	 Explicit

Int count = 100;

Count = count + 1; //101

Count = count + 10; //111 (it puts the last price of count which was 101 + 10 = 111).

inti i = 10;
i = i + 1; //11
i + = 10;

     */
}
