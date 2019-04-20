package day18_loops1;

public class Note {


    /*

        Programming Day 18:

 Loop introduction:

Task 1:
-Create a string variable SMSmessage, assign following value:
"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"
-Create 3 string variables:
sender, phoneNumber,message
- by using indexOf and substring methods,
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line
Task 2:
Contains method:
-Create a String variable garage and
Assign following string:
"Toyota, Nissan, Honda, BMW, Mazerati, Ford"
-convert whole garage into lowercase letters
-if garage isEmpty print "no cars in garage"
-using contains method check:
-if garage contains "toyota" or "nissan"
print "There is a Japanese car in garage"
if not print "No Japanese cars"
-if garage has "bmw"
print "there is a german car in garage"
if not print "no german cars"
-if garage has "Mazerati"
print "there is an italian car in garage"
if not print "no italian cars"
- if garage has "jaguar"
print "there is an british car in garage"
if not print "no british cars"

======================================================================================

package day18_loops1;

public class warmUpTask {

	public static void main(String[] args) {



//		Create a string variable SMSmessage, assign following value:
//		"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"
//		Create 3 string variables:
//		sender, phoneNumber,message
//		by using indexOf and substring methods,
//		retrieve related information from SMSmessage string and assign to those 3 variables.
//
//		print each variable in separate line



		//We have to create a flexible code which doesn't change, even if the name is
		//change we still can find it.


		 String SMSmessage = new String("Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}");
		 String sender, phoneNumber, message;

		 //it is very important in programming when you have long statement and take a
		 // small part of the statement out.

		 sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">"));
		 	System.out.println(sender);

		  phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]"));
			 	System.out.println(phoneNumber);

			message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
				 	System.out.println(message);

}
}
======================================================================================

package day18_loops1;

public class warmUpTask1Cars {

	public static void main(String[] args) {

//		Task 2:
//			Contains method:
//			-Create a String variable garage and
//			Assign following string:
//			"Toyota, Nissan, Honda, BMW, Mazerati, Ford"
//			-convert whole garage into lowercase letters
//			-if garage isEmpty print "no cars in garage"
//			-using contains method check:
//
//			-if garage contains "toyota" or "nissan"
//			print "There is a Japanese car in garage"
//			if not print "No Japanese cars"
//			-if garage has "bmw"
//			print "there is a german car in garage"
//			if not print "no german cars"
//			-if garage has "Mazerati"
//			print "there is an italian car in garage"
//			if not print "no italian cars"
//			- if garage has "jaguar"
//			print "there is an british car in garage"
//			if not print "no british cars"


	//Common interview question, how do you find 1 String into another string.
	//The message must be printed inside the System.out.print in order to show the chagnes.

	String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford"; // if we remove this line, the first condition will run


	//how dod you find one String within anohter String
		//1. CONTAINS method
		//2. INEXOF > - 1
	//garage.toLowerCase(); //this will not work, because we didn't assign anything in garage variable

	garage = garage.toLowerCase(); //this is the way how we assign the variable and now if you print out garage, then it will be lowercase.

	if (garage.isEmpty()) {
		System.out.println("There is no Japanese car in garage");

	}

	if (garage.contains("toyota") || garage.contains("nissan")) {
		System.out.println("There is a Japanese car in garage");
	} else {
		System.out.println("No Japanese cars");
	}

	if (garage.indexOf("bmw") > -1 ) {
		System.out.println("There is a german car in garage");
	}else {
		System.out.println("There is no german car");

	}

	if (garage.contains("jaguar")) {
		System.out.println("There is a British car in garage");
	}else {
		System.out.println("there is no Brithis car");
	}
	//String str = "Java is fun";
	//System.out.println(str.indexOf("this"));//whenever indexOf find a String, it gives you 0 or a positive number (0 or > 0);
											//whenever indexOf doesn't find a number, then it gives you -1.
=====================================================================================
Loop: is just repeating in circle whatever you command the computer. It avoids repeating of writing multiple same functions.

Loop Types:
1.	While Loop
2.	Do While Loop
3.	For Loop
4.	While Each Loop

Loop Body or Loop Block: It is whatever statement or condition you have inside the curly braces {}, it is Loop Body or Loop Block. Each time it repeats we call it iteration or Loop Iteration.
Loops are very similar to if conditions.
Example:
Int num = 0;
If (num < 10){
System.out.println(“Java is fun”);
}

Whenever you see a loop, first of all you have to check the boolean part and see if it applies to run the loop code. Meaning, if boolean is true to run the loop function, then computer will go to your command or printout message. It keeps checking as long as the condition is true, Loop will keep running. boolean will go inside the parentheses () like if statement.


     */
}
