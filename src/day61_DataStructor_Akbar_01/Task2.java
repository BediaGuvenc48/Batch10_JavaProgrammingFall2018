package day61_DataStructor_Akbar_01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
	
	
	/*
	 *Create a linkedList of STring 
	 *add 4 elements 
	 *iterate over using Iterator 
	 *remove the element if the elements contains letter A and Z
	 */

	
	
	public static void main(String[] args) {
		
		List<String> linkedL = new LinkedList<>(); 
			linkedL.add("Albert"); 
			linkedL.add("Victor"); 
			linkedL.add("Ennes"); 
			linkedL.add("AhmadZaki"); 
	
		Iterator<String> myIterator = linkedL.iterator(); 
			
			
			while ( myIterator.hasNext() ) {
				
				String target = myIterator.next(); 
				
				if (target.contains("A") && target.contains("Z")) {
					myIterator.remove(); 	
				}
			}
				 System.out.println(linkedL);
			
//			while (linkedL.size()))
//			
//			
//			
//			for (int idx = 0; idx < linkedL.size()-1; idx++) {
//				
//				if (linkedL.get(idx).contains("A") && linkedL.get(idx).contains("Z")){
//					myIterator.remove().get(idx);
//				}
//				
//			}
//			
//			System.out.println(linkedL);
	}
}
