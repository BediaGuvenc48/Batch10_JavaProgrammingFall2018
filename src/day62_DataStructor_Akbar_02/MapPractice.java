package day62_DataStructor_Akbar_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	
	
	public static void main(String[] args) {
		
		
		//Type<typeOfItem> ---- 
		
		//Type<KeyType, ValueType> ---- 
		
		//I want to store country and gold medal count as per item 
		
		Map<String, Integer> cityMedalMap = new HashMap<>(); 
		
		
		cityMedalMap.put("USA", 28);
		cityMedalMap.put("UK", 20); 
		cityMedalMap.put("France", 17); 
		cityMedalMap.put("Italy", 10); 
		cityMedalMap.put("Italy", 100); 
 
		
		System.out.println(cityMedalMap);
		
		//CRUD Operating ---> Create, Read/Retrieve, Update, Delete 
		System.out.println( cityMedalMap.get("USA"));
		
		Integer cntOfItaly = cityMedalMap.get("Italy"); 
		System.out.println(cntOfItaly);
		
		//updating the item 
		cityMedalMap.replace("Italy", 50); 
		System.out.println("New Italy count: " + cityMedalMap.get("Italy"));
		
		//how to delete the item 
		
		cityMedalMap.remove("Italy"); 
		
		System.out.println("New Italy count: " + cityMedalMap.get("Italy"));//Italy was remove from the list and it gives us null --> because of Integer type 
		
		//if you add Italy again, then there will not be able to accept the duplicated key, key only takes the unique value 
		
		
		
		Map<Long, String> medMap = new HashMap<>(); 
			medMap.put(15L, "glass"); 
			medMap.put( 12L, "cup");
			medMap.put(135L, "jar"); 
			medMap.put( 15L, "pot");
			medMap.put(255L, "plate"); 
		 
			System.out.println(medMap);
			System.out.println(medMap.get(15L) + " , " + medMap.get(12L)+ " , " +  medMap.get(15L));
			medMap.remove(225L); 
			System.out.println(medMap);
			medMap.replace(135L, "PurGlass"); 
			System.out.println(medMap);
			
			 
		//get all unique key in set 
			
		Set<Long> allKeys = medMap.keySet(); 
		System.out.println(allKeys); //It give us all the keys 
		
		for (int idx = 0; idx < medMap.size(); idx++) {
			 
			 if (medMap.isEmpty()) {
				 System.out.println("The map is empty");
			 } else if(medMap.size() > 0) {
				 System.out.println("MeMap has element as following: >>> " + medMap );
				 break; 
			 }else {
				 System.out.println("Invalid selection");
			 }
		}
	
		
	}

}
