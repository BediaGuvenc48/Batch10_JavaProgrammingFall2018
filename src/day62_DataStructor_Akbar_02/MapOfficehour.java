package day62_DataStructor_Akbar_02;

import java.util.*;
import java.util.stream.Collectors; 

public class MapOfficehour {
	
	
	public static void main(String[] args) {
		
		
		Map<String,Integer> records = new HashMap<>();
		records.put("apple", 1);
		
		List<Map<String ,Integer>> listOfMaps = new ArrayList<Map<String,Integer>>();
		
		listOfMaps.add(records);
		System.out.println(listOfMaps);
		
		for(Map<String, Integer> record: listOfMaps) {
			System.out.println(record.get("apple"));
		}
		
		
		
		Map<String,Integer> record1 = new HashMap<>();
		
		record1.put("apple", 1);
		
		for(Map.Entry<String, Integer> map: record1.entrySet()) {
			System.out.println(map.getKey()+" :: "+map.getValue());
		}
 
		System.out.println(">>>>>>>>>>>>Seperation>>>>>>>>>>>>");
		
		List<String> ls = new ArrayList<>(); 
		ls.add("orange"); 
		ls.add("apple"); 
		ls.add("lemon"); 
		System.out.println(ls);

		
		ls = ls.stream().filter(p -> p.equals("orange")).collect(Collectors.toList());
		System.out.println(ls);
		
		//without looping through we can identify an element of the list 
		
		System.out.println(">>>>>>>>>>Seperation>>>>>>>>>>");
		
		List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");

		// Using Stream map(Function mapper) to 
		// convert the Strings in stream to 
		// UpperCase form 
		List<String> answer = list.stream().map(p -> p.toLowerCase()).collect(Collectors.toList());
		System.out.println(answer);
		
		answer.sort(Collections.reverseOrder());
		System.out.println(answer);
		
		// displaying the new stream of UpperCase Strings 
		answer = answer.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		System.out.println(answer);
		
		answer.removeIf(p -> p.startsWith("G"));
		System.out.println(answer);
		
		answer = answer.stream().filter(p -> p.equals("K")).collect(Collectors.toList());
		System.out.println(answer);
	
	}
 }


