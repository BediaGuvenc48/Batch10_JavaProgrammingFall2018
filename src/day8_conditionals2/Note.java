package day8_conditionals2;

public class Note {

    /*


Java Programming Class:

 How:
If (boolean_condintion){

//A
//B
//C

}
//D.
}

The statement D will run no matter what.
1.	Condition is true:
A, B, C, D

2.	Condition is false
D will still run, no matter what.

Main{
//J
	x  > y
if (boolean_condition){

//A
//B
//C
} else {
//D
//E
}
//P
//Q
}

1.	Condition == true;
J, A, B, C, P, Q will run.
2.	Condition == false;
3.	J, D, E, P, Q will run, because they are located in one if else block.

-	The difference between if and if else is:
o	If is always separate block or condition
o	If else just joined the block and merged them. Only 1 function runs, not multiple ones.
-	Always put curly brasses in your Java programming
-	If the condition is true, you have 1 thing to do, then you just don’t use the curly brasses.


int kiwis = 0;

		if (kiwis > 0)
			System.out.println("I have Kiwis");

		else
			System.out.println("Do you have some Kiwis?");
System.out.println("Sure, here you go");(this line is totally separate and independent statement and it will be printed separately).

Escaping Curly Braces:
-	There is an option in java to skip putting {} for if conditions, you can do that only when you have ONE SINGLE statement to execute if conditions true or false.

Try always to use to Curly Braces and they are free to use.

LOGICAL OPERATORS:
-	AND --> &&
-	OR --> ||
-	NOT --> !

Good-Brand and OnSale:
CONDITION1 && CONDITION2

True 		True  	---- True
True		False 	---- False
False		True 	--- False
False 		False 	--- False

True statement are usually both sides are true and the result will be true as well.

Int apples = 10;
Int grapes = 20;
Int oranges = 30;

	True 		False
apples < grapes && apples > oranges ---- false
	False 		True
grapes > apples && orange > grapes ----- true
	False		False
apples > grapes && grapes > oranges --- false

================================================

TRUTH TABLE OF OR (||)
true – true --------- true
true – false -------- true
false – true -------- true
false – false ------- false


Examples:

Int apples = 10;
Int grapes = 20;
Int oranges = 30;

apples < oranges || oranges < grapes --- true

apples == grapes || oranges >= apples +grapes -- true

apples > grapes || grapes > oranges ----false
======================================================

Truth Table Of Not (!) Operator:

-	Not (!) Operator swaps/switches true to false & false to true.

!true -- false
!false -- true

Example:
!apples > oranges --- true


     */
}
