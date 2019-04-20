package day63_DataStructor_Akbar_03;

import java.util.*; 
public class Hashing {
	
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>(); 
		
		Person p1 =  new Person(12, "John");  
		
		Person p2 =  new Person(12, "John");
		
		Object obj; 
		
		//System.out.println(p1);
		
		set.add( p1 ); 
		set.add( p2 ); 

		System.out.println( set );
		
		//What is Hash, how java differenciate between 2 persons even they are same name and same age. 
		
		/*
		 	What is Hash? hash() and equal() determine if 2 objects are equal or not, Hashcode generate a set of codes, each object has 
		 	a hashcode, if it is same character and some order. We need to override the method, it is pretty simple you just use the IDE. 
		 	
		 	Hashset works behind the seens, it gives you a hashcode like a table which has hashcode --> value. 
		 	
		 	If you want to have unique person, then the name or age should be different. 
		 */
		
		
		
		
	}
	
}
