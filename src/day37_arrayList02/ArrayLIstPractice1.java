package day37_arrayList02;

import java.util.ArrayList;

public class ArrayLIstPractice1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		
		System.out.println(cities);
		
		for (String city : cities) {
			System.out.print(city + ", ");
		}
		
		System.out.println("\nusing for loop >>>>>>>>>>>>");
		
		for (int idx = 0; idx < cities.size(); idx++) {
			
			System.out.print(cities.get(idx) + " | ");
		}
		
		System.out.println("\n>>>>>>>>>>End of Loof >>>>>>>>>>>>");
		System.out.println(cities.get(2));
		
		for (int idx = 0; idx < cities.size(); idx++) {
			
			if (cities.get(idx).length() > 6) {
				cities.remove(idx); 
			}
		}
			System.out.println(cities);
			
		 
	 	cities.set(0, "Kabul"); 
	 	System.out.println(cities);
	}

}
