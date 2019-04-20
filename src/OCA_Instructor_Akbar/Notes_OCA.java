package OCA_Instructor_Akbar;

import static OCA_Instructor_Akbar.House.neibourhoodName;

import java.util.ArrayList;

public class Notes_OCA {

/*
 
 Introdcution to OCA Java: 
 
 - Associate Path: Java SE 8 Programmer 1
 - Associate Path: Java SE 8 Programmer 2 
 
 - 70 questions, 150 minutes 
 - 250 $ cost 
 - 70 questions, 10 questions will not be given score, just 60 questions will be picked randomly. 
 - Passing score %65. 
 - It is only pass or no pass. If you get 66 %, then it is fine and no difference. 
 - You schedule it in an Exam center, you just go and give the certification. 
 - You take an Oracle Certified Association Bage. 
 - As a tester it is a big deal to have OCA certification. It is a big plus in your career. 
 - Everyone claim that he or she knows Java, but OCA proves it, once you pass, then you know Java. 
 - It is manditory, but it is highly recommended 
 - Only suggested to get Associate Level, if you have time, you can take proffessional and it is another plus. 
 - OCA does not mean to lead you to a Job Offer directly, but gives you opportunity to get close to the interview Table. 
 - OCA maybe help you for the interview or maybe not help you in interview. There are interviews that they just 
   put the screen shot of certain questions and if you don't have the skills to answer then you will struggle. 
   
 - OCA give you a liverage, but doesn't gaurantee high salary. 
 
 - As early as possible, start your OCA exam preparation. 
 
 - The OCA test should be taken by end of the OCA preparation class. The class will cover all the topics even more than 
   than the OCA questions. 
   
 - The topics that are in OCA Test: 
 	Java Basics 
 	Using Operators and Decision Constructs 
 	Using Loop Constructs 
 	Working with Inheritance 
 	Assume the following
 	Working With Java Data Types 
 	Creating and Using Arrays 
 	Working with Methods and Encapsulation 
 	Handling Exceptions 
 	
 - It is very important to know the syntax, the logical part is important, but it is not super important, you should 
   be very cleare in syntax. 
   
 - As a programmer, it is imoprtant to practice more, the OCA helps you to pass the exam and get better in programming. 
 
 - Identifier is just a name to identify a variable, class or package. 
 
 Default value for instance variable by type: 
 	- boolean --> false 
 	- char --> '' 
 	- nubmers --> 0 (byte, short, int) 
 	- numbers --> 0.0 (double, float) 
 	- String --> null 
 	
 => Var-Args is only valid at nested parameter, not anywhere else. 
 
 => The instance variable is always outside the method and not static. if it is inside the method, then it is a 
 	local variable. Whe we want to access the instance variable, then we need to create an object to get access.
 	The local variables do not get a default value like; null, 0, 0.0, '' or false. 
 	For the local variable we need to give a value before it is used. Otherwise, it would not compile.  
 	
 	
 => AWS is also recommended, but it will be covered in the coming up week days. 
 
 => underScor _ after java 7, _ was introduced to numbers to make it easy to read. Only _ is used for readiblity. 
 	you can put it anywhere between the zeros. UnderScore make it easy to read. 
 	UnderScore will be iqnored while compiling the Java codes. 
 	
 	Rules of _: 
 	- It can not be in the beninning 
 	- It can not be at the end. 
 	- It can not be before or after . (the full stop or dot) for fractional numbers like; double & float. 
 	
 => Never name your method as a Class name, it is possible ot name it, but not recommended. 
 
 => When we create an ojbect a Constructor is called behind the seens. 
 	
 => if a class does not porvide a constructor, compiler will automatically provide a default constructor. 
 	it is a no agument constructor with empty body. 
 	
 => Once you see the new key word, start looking for your Constructor and it will point to a constructor. 
 	
 => Constructor overloading is using of mutliple constructor, same names and different parameters. 
 
 => Difference between Getters, Setters & Constructors: 
 
 => the key word this.nameOfInstance Variable will identify the instance variable for Jva program 
 
 
 Summary: 
  - OCA introductoin 
  - It is not a rocket science and it is possible to take the OCA 
  
  
 Date: 	13 November 2018 
 
 - String pool is created stored in a memory if you 
 
 - .equal in String only campare the value, but doesn't care about memory location 
 
 - String pool, if you have 100 of "Hellos", String str = "Hello". there will be only 
   1 String "Hello" in the String pool. 
   
 - Whenever you see new, it means that a new objected is created in a different memory space. So, it will not be equal to another object. 
 
 - String Letter, there is a special memory space in memory heap for the Strings that are 
   are inside the double quats like "Hello". 
 
 - If you have only 1 line, there is no need for curly bruses, 1 line will work without curly braces. 
 
 - Immutable, something which can not be changed. Strings are immutable and we can't change it. 
 
 - StringBuilder is mutable 
 
 -   (==) means that the object is pointing to see if they are pointing to the same memory location. 
 
 - substring is getting string inside another string. Start point is included, but ending point is excluded. 
 
 - Concatanate anything with String, it will change to the String. what happens if you do compiling operator? 
 
 - any compound assignment or method calls will push the String object from String pool to the heap. If it is not in the string pool 
   then they are not in the same location and they don't equal. 
 
 ==========================================================================================================================================
 
 Date: 	21 November 2018 
 
 -> VarArgs can be used in themod parameters. We can only have 1 VarArg paramters in one method and if you multiple parameters for the method, 
 	then the VarArgs should come all the way at the end of the method. 
 	
 -> If you have VarArgs, it will be treated like an Array inisde your method and it is acceptable. \
 
 -> You can pass an array object oto a method that take VarArgs. 
 
 -> As long as a method is not static, then it is instance method. If you want to access it, you have to create an object 
 
 
 	int num ; 
	static int staticNum; 
	
	// inside instance method , 
	// you can access any instance variable , instance method
	// 			static variable and static method 
	
	// inside STATIC method , 
		// you can ONLY access static variable and static method 

	public void method1() {
		// can we access instance variable inside instance method 
		System.out.println(num); //this.num
		// can we access static variable inside instance method 
		System.out.println(staticNum);
		// can we access instance method inside another instance method 
		method2(); // this.method2() ; 
		// can we access static method inside instance method 
		method3(); 
		System.out.println("instance method ");
	}

	public void method2() {
		System.out.println("instance method");
	}
	
	public static void method3() {
		// can we access instance variable inside static method 
		//System.out.println( num  ); NO 
		
		// can we access instance METHOD inside static method 
		// method1() ; NO 
		
		// can we access static variable inside STATIC method 
		System.out.println(staticNum);
		
		// can we access static method inside STATIC method 
		method3(); // YES 
		
				
		
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		
		Holiday h1 = new Holiday();
		System.out.println(h1.num);
		
		System.out.println( staticNum );
		System.out.println( Holiday.staticNum );
		System.out.println( h1.staticNum );
		
		h1.method1(); 
		h1.method2();
		
		method3(); 
		Holiday.method3();
		
		
		-> If you want to use an object only one time and through it away, then 

	}


	 	-> It is accessing one static variable by importing static 
		-> do I need an object to access statsic variable of house
		
		public static void main(String[] args) {
		
			System.out.println(House.neibourhoodName); //we don't have any value, just prints null, but you can access it 
			
			ArrayList <String> lst = new ArrayList<>(); // if you don't import it, it will not work 
			
			
			static import --> it will enable you to access static members (variables, method), of a class without starting with ClassName. 
			
			System.out.println(Holiday.staticNum); 
			
			System.out.println(neibourhoodName);//this will not need the name of the class, because you import static already 
			

		int j = 10; 
		
			//reference variable, it doesn't hold the object directly, but it just keep the reference or address of it to the heap. 
		Thanksgiven t = new Thanksgiven(); 
		
		System.out.println(t.number); // if we 
		
		System.out.println(  new Thanksgiven().number   ); // this is just address of the num at the heap not the actual object. 
						//primitive variables hold the object rigth there, but reference object just keep the address of variable 
		



	Date: 		28th November 2018 
	
	-> If we want to access an static variable in a different class, then we need to import the static import like the following: 
	
		name of package, name of the class and name of the static variable. like; 
		
		import static cities.Iphone.company 
		import static cities.Iphone.*; 
		import static only will work for static member which is static variable and static method. 
		
	
		
	int s = 500; 
	
	short s = 12345; 
	
	Test t = new Test(); 
	
	t.prints(s); 
	t.print(true); 



	package 1 file: 
	
	package OCA_preparation;

	import OCA_preparation.*;
	//import OCA_preparation.Iphone;
	//import static OCA_preparation.Iphone.company;
	import static OCA_preparation.Iphone.*;
	
	
	//IMPORT IS USED TO ONLY IMPORT CLASS
	//STATIC IMPORT WILL ONLY IMPORT MEMBERS
	
	public class Computer {
	
		public static void main(String[] args) {
	

	Iphone i = new Iphone();
	i.test();
	
	Iphone i2 = null;
	i2.test();//NullPointerException
	
	System.out.println(Iphone.company);
	System.out.println(company);
	
	sort(12);
}
}
	
	package 2 :
	
	package OCA_preparation;
	
	public class Iphone {

	public int version;
	public static String company ="apple";
	
	public void test() {
		System.out.println("testing");
	}
	
	
	public static void sort(int i) {
		
	}
 }


	-> Java is a passBy language and if you passby a value, it wouldn't effect the orginal copy, the copy of 
		primitive will be effected. You are not passing the original value, only the copy gets passed and 
		the original still hold same value.
		

	Date: 	December 5, 2018 
	
	-> Garbage Collection: 
	
	
 	public class GarbageCollection {
	
	public static void main(String[] args) {
		
		
		String s1 = "hello world"; 
			   s1 = "Hello java"; 
			   
		System.out.println(s1);
	}

}
	
	-> When there is no pointing address or reference for an object, then it points to garbage collection. 
	
	-> After you run the code in line # 331, it will be garbage collected. 
	
	-> when you assign a local variable to null, it means you don't garbage collect it, you just cut the pointing 
	   of the Object. 
	   
	-> if we don't have any construcotr in a class, compiler will automatically add default construcotro if we 
	   we don't get any constructor we don't get one. 
	   
	-> First line of any construcotr is a call to super class's, no arg constructor by default super() condition 
	   is 
 
 
 
 
 
 
 
 
 
 
 
 
 */
	
	
	
	
}
