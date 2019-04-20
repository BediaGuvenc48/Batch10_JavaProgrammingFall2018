package day14_StringManipulation;

public class Note {

    /*

        Muradil’s Question:

Here is basic pseudo code for NumberToWords2:
Keep in mind that there are many different solutions to a single problem:
    if number is negative or more than 1000
        show error message
    else continue below steps:
        if 1000 print one thousand

    check if it is more than 100 by trying to divide:
     ex: int hundreds = num/100;
     if hundreds > 0 it means u need to check with one
         if hundreds is 2 then “2 hundred”
         etc
     if needed get rid of all hundreds by using % operator
         num = num % 100; ex: 567 -> will reassign 67

     check if there are any tens”
     int tens = num / 10;
     if tens > 0 then check with number like:
         4 then ” fourty”
         etc etc
     get rid of tens
         num = num % 10;

     now you have only last digit left.
     check if it is 0 then nothing
     if 5 - “five”

     add strings all together you will have whole sentence.
     It might take some time as problem needs to be broken down to pieces. So take your time


//what is your email
	//some@gmail.com
	//oh so you have agmail

	Scanner scan = new Scanner(System.in);

	System.out.println("Please enter your email: ");

	String str = scan.nextLine();

	//donaldtheduck@gmail.com

	//1. find the location of @ sign
	//2. find the location of the .
	//3. substring using those 2 locations



//	System.out.println("oh so you have gmail");
//
//	//donaldtheduck@gmail.com
//	System.out.println(str.substring(14));
	// 2 int

	//System.out.println(str.substring(0, 2));

	//we need 2 numbers in order to write the code for donaldtheduck@gmail.com


     */
}
