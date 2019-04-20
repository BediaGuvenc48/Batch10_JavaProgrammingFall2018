package day60_DataStructor_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	
	public static void main(String[] args) {
		
		//K, V (Key & Value), it can be any combination and you will like it 
		//It does not allow the primitives 
		
			//Key,  Value 
		Map<String, Double> menu = new HashMap<>(); 
		menu.put("Coffee", 2.99); 
		menu.put("Cappucino", 3.99); 
		menu.put("Hot Chocolate", 3.49); 
		menu.put("Hot Chocolate", 55.99); 
	 
		//how to find out how many elements 
		
		System.out.println(menu.size());
		System.out.println(menu);
		
		//how much is the coffee? 
		System.out.println(menu.get("Coffee"));
		
		menu.keySet(); 
		System.out.println(menu.keySet());
		System.out.println(menu.values());
		
		menu.remove("coffee"); 
		System.out.println(menu);
		
		menu.replace("Coffee", 2.99, 99.99);
		System.out.println(menu);
		
		if (menu.containsKey("Coffee")){
			System.out.println("Coffee is there");
		}
		
		//How to find key by value 
		
		//menu.put("Coffee", 299); 
		menu.put("reg Coffee", menu.get("Coffee")); 
		System.out.println(menu);
		
	}

}
