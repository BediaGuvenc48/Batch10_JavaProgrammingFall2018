package day36_overloading_arrayList;

import java.util.*;
 

public class ArrayListPractice {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<>(); 
		
		a.add("apple"); 
		a.add("orange"); 
		a.add("Banana"); 
		
		System.out.println(a);
		System.out.println(a.toString());
	 
		a.remove(0); 
		System.out.println(a);
		
		System.out.println( a.isEmpty() );
		
		a.remove("orange"); 
		System.out.println(a);
		
		a.add(0, "Kiwi");
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.get(1));
		
		a.clear();
		System.out.println(a.isEmpty());
		
		
		
		
		
		
		
		
		
	}

}
