package day63_DataStructor_Akbar_03;

import java.util.*; 
public class MapOfMultipleValue {
	
	
	public static void main(String[] args) {
		
		//Store students group with members in the map 
		
		Map<String, List<String> > groupMap = new HashMap<>(); //this has String as a key and List<String> as a value 
		
		
		List<String> lst1 = Arrays.asList("Aiaz", "Moallah", "Mitra"); 
		List<String> lst2 = Arrays.asList("Yosuf", "Khorshid"); 
		List<String> lst3 = Arrays.asList("Alber", "John", "Sam", "Ali"); 
		
		groupMap.put("List 1", lst1); 
		groupMap.put("List 2", lst2); 
		groupMap.put("List 3", lst3); 
		
		System.out.println(groupMap.get("List 3"));
		System.out.println(groupMap.get("List 3").get(1));
		
		//KEY TYPE CAN NOT BE MUTABLE: It means that if we set the key, as some items and you go to the next step, your originally object is lost and when you get it, you will not get it 
		
		//We want to create a map that contain city as key and coordinates as value 
		
		Map<String, Map<Double, Double>> cityGrids = new HashMap<>();  
		
		Map<Double, Double> grid1 = new HashMap<>(); 
					grid1.put(11.00, 23.11); 
					cityGrids.put("Vienna", grid1); 
			System.out.println(cityGrids);
				
		
			
			Map<String, Map<Double, Double>> mpa = new HashMap<>(); 
			
			String name = "khalili"; 
			
			Map<Double, Double> nums = new HashMap<>(); 
			nums.put(1355.5, 1552.3); 
			
			mpa.put(name, nums); 
			System.out.println(mpa);
	
			
			
		
			//Stimulate the excel reading by row and by column 
			//We need to be able to go to Row ---> Index List 
			//We need to be able to go to Column --> so we can get value 
			
			//Always think everything in excell as a String, then if needed then parse it into Integer or Double 
			
			List <Map<String, String> > excelSheet = new ArrayList<>(); 
			
			Map<String, String> cellMap1 = new HashMap<>();
								cellMap1.put("A", "Adam"); 
								cellMap1.put("B", "23"); 
								cellMap1.put("C", "male"); 
								
								excelSheet.add(cellMap1); //for each row, you need a map 
								
	
		     Map<String, String> cellMap2 = new HashMap<>();
								cellMap2.put("A", "John"); 
								cellMap2.put("B", "25"); 
								cellMap2.put("C", "male");  
								
								excelSheet.add(cellMap2); //for each row, you need a map 
								
		    Map<String, String> cellMap3 = new HashMap<>();
									cellMap3.put("A", "Viki"); 
									cellMap3.put("B", "28"); 
									cellMap3.put("C", "female"); 
								
									excelSheet.add(cellMap3); //for each row, you need a map 			
								
		System.out.println(excelSheet);			
		
		System.out.println( excelSheet.get(2).get("A")); //this one gets the object which is basically column name and return a single name which is coordinate. 
								
								
								
								
								
								
	}
	

}
