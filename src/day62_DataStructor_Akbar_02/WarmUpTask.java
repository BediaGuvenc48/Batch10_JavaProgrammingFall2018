package day62_DataStructor_Akbar_02;

import java.util.*; 

public class WarmUpTask {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); 
		list.add("9"); 
		list.add(" "); 
		list.add("Albert"); 
		list.add("AhmadZaki"); 
		list.add("Viki"); 
		list.add("Viki");
		 
		Set<String> set = new HashSet<>( list ); 
		System.out.println(set);
		
		System.out.println(">>>>>>>Seperation>>>>>>");
		SortedSet<String> numSet = new TreeSet<>( list ); 
		System.out.println(numSet);
		
		System.out.println( list.subList(2, 5));
	}

}
