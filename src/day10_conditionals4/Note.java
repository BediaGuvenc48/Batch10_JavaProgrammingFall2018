package day10_conditionals4;

public class Note {

    /*


Teacher: Moradil

Java Programming Class:



-	Switch only can check the equal logic, it is limitation.
int floor = 1;
	switch (floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
		default:
			System.out.println("No such floor exist");

Case means that in each function like number 1, 2, 3 or 4 and see if it is on and it will work.

Return: means don’t run the rest of code below or get out of main method right here.

package day11_conditions;

public class calculator {
	public static void main(String[] args) {

		double num1, num2, result;

		char operator;

		num1 = 5;
		num2 = 3;
		operator = '%';

		switch (operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		default:
			System.out.println("We don't have such an operator in our calculator");
			return; //don't run the rest of code below.
					//get out of the main method right here.
		}

		System.out.println(result);

Whenever we check if a certain variable is equal to one of several options, we can use switch statements instead of if – else if statements.

int apples = 3;
if (apples == 3) {
	System.out.println(“I have 3 apples”);
}else if (apples == 5){
	System.out.println(“I have 5 apples”);
}

Switch:

switch (apples){

}
==========================

break; keyword in switch statement:

break; will make code to exit switch block

case keyword: is used with switch statement to put an option.

Return keyword: don't run the rest of code below or get out of the main method right here.

In SWITCH statement, we are limited to types;
Byte, short, int, char, String, enum type and we can’t use double or other options.

Switch has a lot of limitations and doesn’t like the following variables:

-	double
-	boolean
-

Switch allows the following variables:
-	int
-	char
-	short
-	String


     */

}
