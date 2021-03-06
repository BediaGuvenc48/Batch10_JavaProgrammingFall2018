package TestClass;

public class LibraryInstruction {
	
	/*Personal Library
	In this project, you will create a simple Library tool to help analyze completed books in a small, 
	personal library. The tool will print out the books that a user has fully read. 
	We will store the books and their completion status in a HashMap.

	Upon completion, feel free to explore and add additional functionality to the Library.

	If you get stuck during this project, check out the project walkthrough video which can be f
	ound at the bottom of the page after the final step of the project.

	Tasks

	1.
	Note: Java provides built-in classes, but that does not mean they are readily available in all Java programs. 
	Some classes are stored in Java packages. The correct Java package has to be imported into a Java program 
	before a certain class can be used.

	The HashMap class is part of a Java package. On line 1, import the correct package by typing:

	import java.util.HashMap;

	2.
	Next, create a class called Library.

	3.
	Now create a Library constructor. You can leave the contents of the constructor empty.

	4.
	Let's create a method that will print all of a user's completed books. 
	Create a method called getFinishedBooks. It should not return any value.

	5.
	The getFinishedBooks method should accept a HashMap parameter that holds strings and Boolean values. 
	Name the parameter library.

	Hint: the parameter is written as: HashMap<String, Boolean> library.

	6.
	The first thing the method should do is check to see that the HashMap it's analyzing is not empty. 
	Create an if statement that checks if the size of library is less than 1.

	7.
	Inside of the if block, print out a friendly error message to the user indicating that the HashMap is empty.

	8.
	Otherwise, in an else block, print out all finished books. 
	First, create a for each loop that iterates through each book in the key set of library.

	9.
	Inside of the for each block, first check the completion status of each book. 
	Create an if statement that checks to see if the value associated with each book in library is equal to true.

	10.
	Inside of the if statement, print out the book. This completes the getFinishedBooks method.

	11.
	Let's test out the functionality we just built. First, create a main method.

	12.
	Next, create a HashMap object that stores strings and Boolean values. Call the HashMap object myBooks.

	13.
	Add the following books and their completion status:

	Road Down The Funnel, true
	Rat: A Biology, false
	TimeIn, true
	3D Food Printing, false
	14.
	Now create a Library object called myLibrary.

	15.
	On the next line, call the getFinishedBooks method on myLibrary and specify myBooks as the argument (parameter).

	16.
	If you completed this project correctly, the output should only print out the books that have a completion status of true.

	Optional: Write an additional method that prints out the incomplete books.

	17.
	Add comments near the top of the program that describe what the Library program does.*/
	
	

}
