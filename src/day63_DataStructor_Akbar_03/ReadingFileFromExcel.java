package day63_DataStructor_Akbar_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFileFromExcel {
	
	public static void main(String[] args) {
		

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
							
							
	
	System.out.println("\n");
	
	
	
	List<Map<String, Integer>> m = new ArrayList<>(); 
	
	Map<String, Integer> a = new HashMap<>(); 
	a.put("Ahmad", 25); 
	a.put("Jawad", 35); 
	a.put("Fawad", 22); 
	
	m.add(a); 
	
	Map<String, Integer> b = new HashMap<>(); 
	b.put("Karim", 29); 
	b.put("Jabar", 21); 
	b.put("Khalid", 39); 
	b.put("Jalil", 51); 
	
	m.add(b); 
	 
	System.out.println(m);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
