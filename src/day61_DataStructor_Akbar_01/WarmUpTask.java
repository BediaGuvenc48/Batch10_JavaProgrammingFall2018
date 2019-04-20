package day61_DataStructor_Akbar_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WarmUpTask {
	
	public static void main(String[] args) {
		
		
		Collection<String> fruits= Arrays.asList("Apple", "Orange","Banana");
		
		fruits.forEach(System.out::println);
		
	 /*
	  * Create an arraylist of String 
	  * add 5 items, iterate over it 
	  * 
	  * use Collection interface as a referance 
	  */
		
		//ONLY REFERENCE TYPE DECIDE WHAT WE CAN ACCESS 
		
		Collection <String> lists = new ArrayList <>(); 
		
		lists.add("apple"); 
		lists.add("banana"); 
		lists.add("orange"); 
		lists.add("carrot"); 
		lists.add("Kiwi"); 
		
		
		for (String list : lists) {
			System.out.println(list);
		}
		
//		for (int idx = 0; idx < lists.size()-4; idx++) {
//			
//			System.out.println(lists);
//			
		}
			

}
