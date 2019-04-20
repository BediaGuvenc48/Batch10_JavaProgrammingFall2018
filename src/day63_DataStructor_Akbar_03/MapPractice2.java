package day63_DataStructor_Akbar_03;
import java.util.*;
import java.util.Map.Entry; 

public class MapPractice2 {
	
	
	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<>(); 
		
		map.put("1", "A"); 
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");
		map.put("6", "F");
		map.put("7", null );
		
		System.out.println(map.get("1"));
		System.out.println(map.get("5"));
		
		map.put("5", "Z"); //this one just update the item 
		
		map.putIfAbsent("6", "Khalili"); //this method come from Java 8 and it is very useful 
		
		System.out.println(map); 
		
		map.replace("4", "K"); 
		System.out.println(map);
		
		//
		map.replace("3", "C", "CCC"); //java 8 give us an overloaded method that takes a key, previous value and replace it to the new value 
		System.out.println(map);
		
		System.out.println(map.get("ABS")); //give us null if it is does not exist  
		
		String abcVal = map.getOrDefault("abac", "Default Value"); //this is another method came from Java 8 which give us a default costum value instead of null or 0 or false 
																   //it will make our work easy to give a default value which we make it ourself 
		System.out.println(abcVal);
		
		map.putIfAbsent("8", "Khalili"); 
		System.out.println(map);
	
		// view !!! 
		
		/*
		 *  How do I get all the keys of a Map? --> keySet(); 
		 *  How do I get all values of a Map? --> value(); 
		 *  How do I get both keys & values together? --> entrySet(); 
		 */
		
		//keySet(),  values(), entrySet(); 
		
		Set<String> keys = map.keySet(); //there is a strike relationship with the first copy 
		keys.remove("1"); 
		Collection<String> values = map.values(); 
		values.remove("B"); 
			
		Set<Entry<String, String> > entrySetView = map.entrySet(); 
		
		for (Entry<String, String> entry : entrySetView) {
			
			System.out.println(  entry.getKey() + " -- >" + entry.getValue()   ); //you can iterate over and you can also change the value like below 

			if (entry.getValue() == null) {
				entry.setValue("SOMETHING ELSE"); 
			}
		}
			System.out.println(map);
		
	}
	
	

}
