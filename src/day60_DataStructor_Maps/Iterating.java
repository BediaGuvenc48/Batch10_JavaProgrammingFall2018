package day60_DataStructor_Maps;

import java.util.ArrayList;
import java.util.List;

public class Iterating {
	
	public static void main(String[] args) {
		
		
		List<Integer> lst = new ArrayList<>(); 
		
		lst.add(12); 
		lst.add(15); 
		lst.add(20); 
		
		//for loop 
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i) + " ");
		}
		
		//for each loop 
		for (Integer l : lst) {
			System.out.println(l);
		}
		
		//while loop 
		int number = 0; 
		while (number < lst.size()) {
			
			System.out.println(lst.get(number));
			
			number++; 	
		}
		 
		//do while loop 
		int num = 0; 
		do {
		
			System.out.println(lst.get(num));
			
			num++; 
			
		}while (num < lst.size()); 
		
	}

}
