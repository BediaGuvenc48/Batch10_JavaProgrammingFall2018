package day13_stringmanipulation;

public class Note {

    /*

        Java Programming Class:


COMPARING OF STRINGS: is

String str1 = “abc”;
String str2 = “abc”;

//true
This is the only situation we can run the strings to be equal.

String str3 = new String(“abc”);
String str4 = “abc”;
//false

String str5 = new String(“abc”);
String str6 = new String(“abc”);

//false

== operator for comparing objects:
When comparing objects example; Strings
== does not compare the value within the strings/ objects.

== will only compare if 2 variables are pointing to same objects in memory.
	Will only check if both object memory locations are same.

For that reason, when we do:
	Str1 == str2; it is only checking if both strings are same in memory.

Don not use == to compare strings or any other objects. Unless you want to test if they are same in memory.

.equals()
.equalsIgnoreCase() // abc vs ABC – same

Any time when you want to use String, then use from the following method: String.equals(String Name);

String str1 = “hello”;
String str2 = “hello”;
Str1 == str2; //true

String s = “hello”;
String s2 = “Hello”;

Comparing Strings:
== -- it will check for if both string object are same in memory (we should not use to compare Strings); Note: This will not compare String value withing objects.
Sometimes it works, it only works when we create strings using direct assignment (str == “abc”; ), because it will take the value from String Pool.
equals method: this Str.equals(another), it compares each character within both strings and return true or false.
It does not matter how you created String object.
String str = “mac”;
Str.equals(“mac”); -- true
Str.equals(“Mac”); ---false, the case doesn’t match

equalsIqnoreCase method:
thisStr.equalsIqnoreCase(another)
It compares each character and does not care if lowercase or uppercase as long as same letter.

Example:
String phone = “htc”;
boolean b = phone.equalsIqnoreCase(“htc”); // the result will be true
boolean b1 = phone.equalsIqnoreCase(“HTC”); // the result will be true, because we programmed to iqnore the case type, so it ignores the case sensitivity.

Note: The equals answers always give you either true or false answer. That is why we should store them in boolean variable.

Find the position

String lan = “Java”;
Lan.indexOf(“v”);

How to check if a string contains another string.
String one = “today is picnic”;

one.conatains(“picnic”); //true

Contains Method:

How to check if a string contains another string. It searches in whole string and returns true if it finds


String one = “today is picnic”;
Boolean b = one.contains(“picnic”); // true


day13_stringmanipulation
Write a program CheckWords:
Program accepts 3 words and :
- if they are same length:
    print "All words are same length"
- if some same length and others not:
    print "Not Same nor Different lengths"
- if all different length
    print "All different length"
Write a program StartEndWords:
    you have 2 words that must be 5 characters
    and check if last letter of first word and first letter of
    second work are same.
    if either one not 5 chars legth:
        print "need to be exactly 5 chars legth"
    if last letter of 1st word and first letter of 2nd word match
        print "Fizz"
    if they do not match
        print "Buzz - did not match"
=================================================
COMPARING STRINGS:
== is a operator to check if 2 values are same.
But == works as expected with primitives only.
100 == 100 //true
int n1 = 20;
int n2 = 30
n1 == n2 //false
1.
String str1 = "abc";
String str2 = "abc";
str1 == str2; //true
2.
String str1 = new String("abc");
String str2 = "abc";
str1 == str2; //false
3.
String str1 = new String("abc");
String str2 = new String("abc");
str1 == str2; //false
===================
equals method.
1.
String str1 = "abc";
String str2 = "abc";
str1.equals(str2); //true
2.
String str1 = new String("abc");
String str2 = "abc";
str1.equals(str2); //true
3.
String str1 = new String("abc");
String str2 = new String("abc");
str1.equals(str2); //true
=========================
== operator for comparing objects.
When comparing objects ex: Strings
== does not compare the value within the strings/objects.
== will only compare if 2 variables are pointing to same object in memory.
    will only check if both object memory locations are same.
For that reason, when we do:
    str1 == str2 ; it is only checking if both strings are same in memory.
=============
Do not use == to compare strings or any other objects. Unless you want to test if they are same in memory location.
.equals()
.equalsIgnoreCase() // abc vs ABC -- same
=============
int num1 = 200;
int num2 = 300;
if(num1 != num2) {
    print not equal
}
if(num1 == num2){
    print equal
}
=====================
String str1 = new String("java");
String str2 = new String("java");
if(str1.equals(str2)){
    print equals
}
if(!str1.equals(str2)){
    print not equal
}
=============================
Comparing strings:
    1. == -> it will check for if both string object are same in memory. It will not compare string value within objects. Will not compare characters.
    That is a problem.
    WE SHOULD NOT USE THIS METHOD TO COMPARE STRINGS.
    When it might work? :
        It works only when we create strings using
        direct assigment (str = "abc").
        Because it will take value from String pool.
    2.equals method: thisStr.equals(another)
    It compares each character within both strings anb return true or false.
    It does not matter how you created String objects.
    String str = "mac";
    str.equals("mac") --> true
    str.equals("Mac") -> false
    3. equalsIgnoreCase method:
        thisStr.equalsIgnoreCase(another)
        It compares each character and does not care if lowercase or uppercase as long as same letter.
        String phone = "htc";
        boolean b = phone.equalsIgnoreCase("htc");//true

        phone.equalsIgnoreCase("HTC");//true
        String phone2 = "HTC";
        boolean b2 =phone.equalsIgnoreCase(phone2);//true
=========================================
FIND THE POSITION OF A STRING WITHIN ANOTHER STRING.
INDEXOF indexOf(String)
String lan = "Java";
lan.indexOf("v") -> 2
1-24 of over 50,000 results for Electronics :
"speakers"
=========================
CONTAINS method.
How to check if a string contains another string.
It searches in whole string and returns true if it finds and returns false if it cannot find.
String one = "today is picnic";
boolean b = one.contains("picnic");//true
STARTSWITH ENDSWITH methods.
Takes a string and returns boolean.
===========================
SUMMARY:
    Practice questions
    Warmup tasks
    String equality comparison
    String manipulation
====================================

     */
}
