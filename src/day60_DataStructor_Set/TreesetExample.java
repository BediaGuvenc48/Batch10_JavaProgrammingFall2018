package day60_DataStructor_Set;

import java.util.*; 
public class TreesetExample {
	
	public static void main(String[] args) {
		
		
		Set<String> set =        new TreeSet<>(); 
		set.add("bc"); 
		set.add("aa"); 
		set.add("cc"); 
		
		SortedSet<String> sortedSet = new TreeSet<>(); 
		
		sortedSet.add("bc"); 
		sortedSet.add("aa"); 
		sortedSet.add("cc"); 
		
		System.out.println(set);
		System.out.println(sortedSet);
	}

}
