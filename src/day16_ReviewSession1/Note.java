package day16_ReviewSession1;

public class Note {

    /*


 Computational Thinking:

Problem: - Solve it in your head first -
- come up with stop by step instructions to solve the problem without any programming.
-- Algorithm
- Write down the steps in your languages (English)
- Pseudo Code: Is the English representative of doing step by step.
- Break it down to smaller pieces

-	We put main method to be able to run the Java Program.
-	[] can be replaced by 3 dots … as well.
-	You can print the numbers without the double quotes. You can print the numbers inside the double quotes, but it will be printed as a String or Object.
-	Java runs left to right if you have print messages for the quote.

-	\ is called escape character which is ignoring the java functionality and threat the statement as is.

Variables: are data containers,

//Variable are data container
		/*
		 * Important things about using variables in java
* when we use variables then we have to pay attention to the following points:
		 * 1. Type/datatype 2. name 3. Value
		 * Java is a strongly typed language
		 * it means before using any variable, we need to declare first
		 * when you declare, we need to put type and name,
		 * for Example: int steps; //it means a variable called steps that can hold integers.
		 * each variable will be declared once, the system will not allow you.
		 * double steps;// will not allowed, because already declared as integer
		 * Variable names - sometimes can be called as Identifiers
		 *
		 * double price;
* System.out.println("price"); // it will not be printed, you must assign a value to it.
		 *
		 * initialize -> means assigning a value for the first time.
		 *
* how do we initialize? we just put a price like; double price = 10.0;
		 *
		 * Variable naming rules:
* 1): The variable can be any length. maybe thousands of characters or words.
		 * Example: String absklgjlkdsjfglkdsfjglkdsfjglskdjfg;
		 *
		 * 2): Variables can contain letters, -, $, numbers
		 * Example: int today_is_review_$session = 1;
		 *
* 3): Variables can not start with numbers, but can contain numbers in the middle or end.
		 * Example: int 1stDay// it is not allowed and will not work
		 *
* 4): Variables can not accept keywords or reserved words like; public, double, class and etc.
		 *
* 5): Meaningful words are preferred, and start with lower-case, and then the next word starts with upper case. We call the style camelCase.
		 *
* 6): The variables can be named with upper case even using the keywords, but it is not recommended.
		 */

    // DATA TYPES: there are 2 different types in Java:
    /* 1): primitives
     * 2): objects/class type/non-primitive
     *
     * Primitives:
     * whole Numbers / Integers;
     *
     * Floating point numbers/Numbers with Decimals:
     * 		float > double // float is taking 4 bits of memory and double is taking 8 bits of the memory
     * 						  that is why double called double.
     *
     * Character type:
     * 		1. char
     * 		2. boolean; true/false;
     *
     * Examples:
     * byte chairs = 70;
     */

//		byte chairs = 70;
//		byte secondRoomChairs = 50;
//		System.out.println(chairs);
//
//		//first room has --- and second room has  --- chairs
//		//there are --- chairs in the first room
//		System.out.println("firs room has " + chairs + " & second room has " +
//							secondRoomChairs + " Chairs");
//		System.out.println("thee are 20 chairs in first room");
//
//		System.out.println("first room has " + chairs + " and second room has " +
//							secondRoomChairs + " Chairs\n" +
//							"there are " + (chairs - secondRoomChairs) + " more in first room");
/*
    short shortValue = 32000;
		System.out.println("short value: " + shortValue);

    int intValue = shortValue; //small can fit into large type. Implicit/Automatic casting
		System.out.println(intValue);
    intValue = intValue * 100;  // 3200000
    shortValue = (short)intValue; // explicit casting/converting
		System.out.println("short after casting: " + shortValue); // the computer change it to Binary manipulation, we get an expected result

    int cityPopulation = 200_000_000; //java will ignore the underScores and the compiler will run.
			System.out.println(cityPopulation); // The number should not start or end with _ underscore.

         < 80 -> cannot buy anything
		 * > 435 -> u can buy everything
		 * if budget >= phone+watch
		 * 	you can buy phone+watch
		 * 	or phone+bag
		 * 	or watch + bag
		 * if budget >= phone+bag
		 * 	you can buy phone+bag
		 *  or watch + bag
		 * if budget >= watch+bag
		 * 	you can buy watch+bag
		 *
                 * if budget >= phone
		 * 		you can buy phone
		 * 	   or watch+bag
		 * if budget >= watch
		 * 		you can buy watch
		 * 		or bag
		 * else
                 * 	just a watch


     */
}
