package day37_arrayList02;

import java.util.ArrayList;

public class ArrayListPractice {
	
	
	public static void main(String[] args) {
		
		
		ArrayList <String> names = new ArrayList<>(); 
		
			names.add("Albert"); 
			names.add("Khalili"); 
			names.add("Ahmad"); 
			
		//2. remove 
			
			names.remove(1); 
			
			System.out.println(names);
		
		//3. get method 
			
			System.out.println(names.get(0));
		
		//4. replace, we just use the set method 
		
			names.set(0, "Keven"); 
			
		System.out.println(names);
		
		//5. find the size 
		
		System.out.println(names.size());
		
		//6. isEmpty 
		
		System.out.println(names.isEmpty()); 
		
		
		//7. 
		
		
		ArrayList<String> l = new ArrayList<>(); 
		
		l.add("A"); 
		l.add("B"); 
		l.add("V"); 
		l.add("C"); 
		l.add("E"); 
		
		System.out.println(l.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
