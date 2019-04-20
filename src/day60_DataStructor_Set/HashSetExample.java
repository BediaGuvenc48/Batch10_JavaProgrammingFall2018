package day60_DataStructor_Set;

import java.util.*; 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		
		//Set only allows unique elemetns 
		//does not keep ordering 
		
		Set<Integer> uniqueNums = new HashSet<>(); 
		
		uniqueNums.add(123); 
		uniqueNums.add(234); 
		uniqueNums.add(654); 
		uniqueNums.add(123); 
		
		System.out.println(uniqueNums);
		
		//there is no index in Set collection, you can't get the first or last elements or there is no get method 
		
		List<String> list = Arrays.asList("one", "one", "two", "three", "three","four", "ten", "ten" ); 
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list); 
		//System.out.println(set);
		
		for (String set1 : set) {
			System.out.print(set1 + " || ");
		}
		System.out.println("\n");
		
		Set<String> a = new TreeSet<>(set); 
		System.out.println(a);
		
		
	}

}
