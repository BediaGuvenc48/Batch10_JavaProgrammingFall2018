package day62_DataStructor_Akbar_02;

import java.util.*; 

public class DuplicateCheck {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();  
			list.add("A"); 
			list.add("A"); 
			list.add("B"); 
			list.add("A"); 
			list.add("D"); 
			list.add("A");
		 
		Set<String> setList = new HashSet( list ); 
		int counter = 0; 
		boolean duplicate = false; 
		for (int idx = 0; idx < setList.size(); idx++) {
			if (setList.size() < list.size()) {
				counter++; 
				duplicate = true; 
			}else {
				duplicate = false; 
			}
		}
		System.out.println(duplicate);
		System.out.println(counter);
		
	}

}
