package CollectionPractice;

import java.util.*;
import java.util.Map.Entry; 
public class Task2 {
	
			//create a HashMap of String and Integer store each name as a key and lenght of each names as a value 
			//get 3 views ouf of your map 
			//iterate over in 3 loops 
			
			/*
			 * create a new class 
			    copy your list that contains all the names from previous task 
			    
			    Create a hashmap of String and Integer 
			    store each names as a key and length of each names as a value 
			    
			    Get 3 views out of your map  --> keySet  , values , entrySet 
			    Iterate over in 3 loops 
			    
			    Optionally 
			    remove key that start with P   --> using keyset view 
			    remove any words that have length of 6  --> using values view 
			    update the value of entry if the value is more than 10 --> using entrySet view
	    
			 */
	
	public static void main(String[] args) {
		
	String [] nams = {"khalili", "aiaz", "moallah", "mitra"}; 
	
	List<String> lists = new ArrayList<>(); 
	
	for (String nam : nams) {
		lists.add(nam);
	}
	
	Map<String, Integer> mp = new HashMap<>(); 

	Set<Entry<String, Integer>> threeviews = mp.entrySet(); 
	
	for (int idx = 0; idx < lists.size(); idx++) {
		 
		mp.put(lists.get(idx), lists.get(idx).length()); 
	}
	
	Iterator it = threeviews.iterator(); 
	
	while (it.hasNext()) {
		
	}
		
		
		String[] arr = {"Darben","Pinkney","Lamburn",
				"Secretan","Kawse","Pinkney","Martynikhin"};
		
		List<String> list = new ArrayList<>(); 
		
		for (String a : arr) {
			list.add(a); 
		}
		
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>(); 
		
		Set<Entry<String, Integer>> threeView = map.entrySet(); 
		
		for (int idx = 0; idx < list.size(); idx++) {
			
			map.put(list.get(idx), list.get(idx).length()); 
			 
		}
		
		System.out.println(threeView);
		System.out.println("Printing 3 view: ");
		 
		Set<String> set = map.keySet(); 
			System.out.println(set);
			
		Iterator Int = set.iterator(); 
		
		while (Int.hasNext()) {
			
			 
		}
			
			
		Collection <Integer> c = map.values(); 
		
			System.out.println(c);
		
		Set<Entry<String, Integer>> allView = map.entrySet(); 
		
 
		
		
		
		
		
	}
		
}
