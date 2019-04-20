package day37_arrayList02;

import java.util.ArrayList;
import java.util.List;

public class WarmUpTask {

	public static void main(String[] args) {
		
		/*
		 * Create an ArrayList cities & Add 10 cities 
		 * 
		 * Print count of citise in the list 
		 * 
		 * Print all cities in one line speperated by space 
		 * 
		 * Create anohter ArrayList longName and loop through and all cities 
		 * from Cities list with more than 6 characters into longNames list 
		 * then print longNames in single line formatted way 
		 */
		
		
		List<String> myList = new ArrayList<>(); 
		
		myList.add("Woodbridge"); 
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		myList.add("Woodbridge");
		
		System.out.println(myList.size());
		
		for (String st : myList) {
			System.out.print(st + ", ");
		}
		

		ArrayList <String> city = new ArrayList<>(); 	
		city.add("Washington"); 
		city.add("Sanfransisco"); 
		city.add("New York "); 
		city.add("Istanbul"); 
		city.add("Kabul"); 
		city.add("Mazar-e Sharif");
		city.add("Herat"); 
		city.add("Qandahar"); 
		city.add("Nangarhar "); 
		city.add("Jalalabad"); 
		city.add("Ghazni"); 
		city.add("Parwan"); 
		city.add("jowzjan"); 
		city.add("Maimana"); 
		city.add("Badakhshan"); 
		
		
		System.out.println(city.size());
		
		for (String cit : city) {
			System.out.print(cit + " ");
		}
		
		System.out.println("\n>>>>End For Each Loop >>>>>");
		
		ArrayList <String> LongName = new ArrayList<>(); 
		
//		for (int idx = 0; idx < city.size(); idx++) { 
//			
//			if (city.get(idx).length() > 9) {
//				
//				LongName.add(city.get(idx)); 
//			}
//					
//		}
//			System.out.print(LongName);
			
			
			System.out.println("\n>>>>End For  Loop >>>>>");
		
		for (String c : city) {
			
			if (c.length() > 10) {
				
				LongName.add(c); 
			}
		}
			System.out.println(LongName);
		
		
//		
//		
//		int countOfCities = city.size(); 
//		System.out.println("Count of cities: " + countOfCities);
//		
//		for (String cities: city) {
//			System.out.print(cities + " || ");
//				
//		}
//		
//		System.out.println("\n=================================");
//		for (int idx = 0; idx < city.size(); idx++) {
//			
//			System.out.print(city.get(idx) + "| ");
//		}
//		
//
//		ArrayList <String>longNames = new ArrayList<>(); 
//		System.out.println(longNames.size());
//		System.out.println("Is the size empty: " + longNames.size());
//		
//		for (String cities : city) {
//		if (cities.length() > 8) {
//			longNames.add(cities); 
//		   }
//			
//		}
//		
//		System.out.println(longNames);
//		
//		longNames.clear(); //clear the arraylist, it will become empty like new 
//		
//		System.out.println(longNames.isEmpty() + " " + (longNames.size() == 0));
//		
//		for (int i = 0; i < city.size(); i++) {
//			
//			if (city.get(i).length() > 8) {
//				longNames.add(city.get(i));
//	 
//			}
//		}
//		
//		System.out.println("Cities count with > 8 chars: " + longNames.size());
//		 
//		System.out.println(longNames.toString());
//		
		
	}
	
}
