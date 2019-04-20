package day60_DataStructor_Maps;

import java.util.*; 
public class MapTest {
	
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> myMap = new HashMap(); 
		
		myMap.put("GulJanet", 25); 
		myMap.put("Kosim", 18); 
		myMap.put("Mukhta", 52); 
		
Map<String, Integer> myMap1 = new HashMap(); 
		
		myMap.put("GulJanet1", 251); 
		myMap.put("Kosim1", 181); 
		myMap.put("Mukhta1", 521); 
		
Map<String, Integer> myMap2 = new HashMap(); 
		
		myMap.put("GulJanet2", 2); 
		myMap.put("Kosim2", 1); 
		myMap.put("Mukhta2", 3); 
		
		
		
//		System.out.println(myMap);
//		
//		 
//		myMap.remove("Mukhta"); 
//		System.out.println(myMap);
//		
//	for (int idx = 0; idx < myMap.size(); idx++) {
//		
//		System.out.println(myMap.get(18));
//		break;
//	}
		
	
	List<Map<String, Integer>> myList = new ArrayList<>(); 
	
	myList.add(myMap); 
	myList.add(myMap1); 
	myList.add(myMap2); 
	
	System.out.println(myList);
		
		
		
 
}


}