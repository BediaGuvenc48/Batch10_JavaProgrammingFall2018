package day51_absraction_and_abstract_clasess;

import java.util.*; 
public class ContractorEmployee{
	
	public static void main(String[] args) {
		
		
		List<Integer> one = new ArrayList<>(); 
		one.add(3); 
		one.add(2); 
		one.add(35); 
		one.add(3); 
		one.add(36); 
		
		Set<Integer> too = new TreeSet<>(one); 
		
		System.out.println(too);
		
		if (one.size() > too.size()) {
			System.out.println("List conttains duplicate");
		} else {
			System.out.println("No duplicate !!!");
		}
		
		System.out.println(">>Test>>>>>>>");
		
		List<Integer> list = new ArrayList<>(); 
		list.add(3); 
		list.add(5); 
		list.add(3); 
		list.add(10); 
		
		Set<Integer> setList = new TreeSet<>(list); 
		
		for (Integer s : setList) {
			System.out.println(s);
		}
  
		if (setList.size() < list.size()) {
			
			System.out.println("List has duplicate elemetns" );
		}
		
		
		int count = 0; 
		 
		for (int idx = 0; idx < list.size()-1; idx++) {
			
			for (int j = 0; j < list.size()-1; j++) {
				
				if (list.get(j) == list.get(j+1) && idx != j) {
					count++; 
				}
			}
		}
		System.out.println("Count: " + count);
		
		
		String str = "khalili"; 
		
		String revers = ""; 
		
		for (int idx = str.length()-1; idx >= 0; idx--) {
		
			revers += str.charAt(idx); 
		}
			
		System.out.print(revers);
		
		
		
		StringBuilder stb = new StringBuilder("Khalili"); 
		
		 stb = stb.reverse(); 
		 
		 System.out.println(">>>>>>>>>>>>");
		 
		 System.out.println(stb);
		 
	 
		
	}

		
		
	
}
