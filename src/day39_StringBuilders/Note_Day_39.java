package day39_StringBuilders;

public class Note_Day_39 {

/*

 	StringBuilder: 
 	
 	- It is very similar to String, but there are some differences that will be covered. 
 	
 	- String are immutable, meaning it can not be changed or modified. 
 	
 	- When we say Strings are immutable, it means that we can't change it. 
 	
 	- Whenever you create a String like this: 
 		String str = "wooden"; //String object is created in the memory with value of "wooden". 
 		if we say: 
 		str = str+"spoon"; 
 		str => "wooden spoon"; // in fact wooden is not changed in the memory, if we concatenate, then another object is added 
 								  and it is a different object from "wooden". 
 								  
 	- whenever we change a String if we add, concatenate or upperCase, lowerCase, it will always create a new String in memory. 
 	
 	Example: 
 	String word = "java"; 
 	word = word.toUpperCase(); //there are 2 objects now, "java" & "JAVA". 
 	
 	Since the Strings are immutable that is why 2 objects are created. 1st object "java", 2nd object "JAVA". 
 	
 	If we say 
 	word = word+"programming"; //the initial object with lowerCase is thrown away in garbage collection, so we will have the following objects: 
 	
 	1)	"java" 
 	2)	"JAVA"
 	3) 	"programming"
 	4)	"JAVA programming" 
 	
 	How are Strings are immutable? 
 	//it happens in background like this: 
 	 - char[] value = {'j', 'a', 'v', 'a'}; 
 	 - whenever we create a String, then it will be stored as a final char [] that are fixed size and not changeable, so we don't have 
 	  	Another direct way to modify the Array after it created. 
 	  	
 	 - Since String are used a lot and we have to modify them a lot, it might cost huge space in the memory. 
 	 
 	 - To address this issue in Java we have 2 classes, that make String mutable: 
 	 
 	 1. StringBuffer: is thread safe, so it is slower. //it can  
 	
 	 2. StringBuilder: is not thread safe & StringBuilder is faster.  
 	 
 	 The above 2 methods or functions make the String mutable and we can bring changes into the String. These are both classes that 
 	 already exist in Java, we don't need to import them from java.util class, we just create object by using them and use them. 
 	 
 	 Arrays are also fixed size, not dynamic, but we have ArrayList is more dynamic which makes the Array to add or modify the elements 
 	 inside an ArrayList. 
 	 
 	 Thread Safe: means that multiple users can use the application simultaneously. 
 	 
 	 Example: 
 	 StringBuilder stb = new StringBuilder("apples"); //there multiple ways of creating StringBuilder. 
 	 stb.append(",grapes");	//append means add or attach it. 
 	 
 	 what happens in example above, there is only 1 StringBuilder object in the memory. The first value was apples and then 
 	 it was changed to apples,grapes. 
 	 
 	 - if you want to do a lot of manipulation, then use the StringBuilder, it is the whole purpose, but if you just 
 	 	don't do much manipulation then you can use from String. (no need for StringBuilder in that case). 
 	
 	- StringBuilder will work with char, integers, Strings, doubles anything and it is overloading method. 
		
	
	Difference between Strings & StringBuilders: 
	
	1) Strings are immutable (immutable means once you create the object then you can't change it). 
	
	2)StringBuilders are mutable (so once you created the object StringBuilder and you can modify it). 
	
	StringBuilder methods: 
	
	- append => add more string to value 
	- delete(start, end) => delete from start index to end index. 
		strB = 'abcd"; 
		strB.delet(0,2)
		result will be strB => "cd". 
		
	- reverse() => reverse the STringBuilder value. 
		reverse will be strB => "dc". 
		 
	- deleteCharAt(index) => deletes a character at a specific index position. 
		if we strB => "dc". 
		strB.deleteCharAt(1); 
		strB => "d". 
		
	- insert (index, String) +> inserts the value at the specified index position. 
	
		stb => "keyboard"; 
		stb.insert(3, "-"); 
		stb => "key-board". 
	
		
	- replace(start, end, String) => it replace starting and ending index positions with given string. 
	StringBuidler stb = new StrinbBuilder("keyboard"); 
	stb.replace(0,3,"cutting "); // the value will be "cutting board" after printing. 
	
	- StringBuilder is a mutable version for the STring objects. 
	
	- ArrayList is a data structure/collection, where we can hold multiple sets of data. 
	
	ArrayList<StringBuilder> list = new ArrayList<>(); 
	
	
	StringBuilder builder1 = new StringBuilder("java"); 
	StringBuilder builder2 = new StringBuilder("java"); 
	
	System.out.println(builder1 == builder2);//false. Since both objects are different locations 

	System.out.println(builder1.equals(builder2));//false again. equals method in STringBuilder also checks if both of them are same memory location 
	
	/* How should we compare the StringBuilders? 
	  	- We need to convert it to String, then call String's equal method. 
	  	
	  	- builder1.toString().equals(builder2.toSTring()); 
	 */
	

	
	public static void main(String[] args) {
		
		StringBuilder test = new StringBuilder(); 
		
			test.append("Automation Test"); 
			test.append("Junit Test"); 
			test.append("Mechnical Test"); 
			
		System.out.println(test);
		
			test.replace(0, 9, "Dynamic"); 
		System.out.println(test);
			
			test.reverse(); 
		System.out.println(test);
			
			test.reverse(); 
			test.delete(5, 7); 
		System.out.println(test);
		
			test.deleteCharAt(10); 
		System.out.println(test);
			test.delete(30, 39); 
		System.out.println(test);
		
			test.replace(0, 6, "Automation"); 
		System.out.println(test);
			test.reverse(); 
		System.out.println(test);
			test.reverse(); 
		
			test.insert(11, "@");
		System.out.println(test);
			test.replace(10, 11, ""); 
		System.out.println(test);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
