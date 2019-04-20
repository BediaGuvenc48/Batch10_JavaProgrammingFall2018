package day63_DataStructor_Akbar_03;

import java.util.*; 
public class MyPractice {
	
	public static void main(String[] args) {
		
		
		/*
		
		Given array of Strings names—> 
	    Use iterator to iterate over.
	    count unique elements
	     
	    find out how many items start with  k-l
	    find frequency of each items  : hint create a frequency map 
	    
		 */
		
		String[] arr = {"Darben","Pinkney","Lamburn",
				"Secretan","Kawse","Pinkney","Martynikhin",
				"Oram","Pinkney","Glaze","Martynikhin",
				"John","Adam","Zack"};
		
		List<String> list = new ArrayList(); 
		
		for (String l : arr) {

			list.add(l);
			
		}
		
		System.out.println("\n>>>>>>End>>>>>>");
		//System.out.println(list);
		
		Iterator it = list.iterator(); 
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " >> ");
		}
		
		
		System.out.println("\n>>>>>>End>>>>>>");
		
		SortedSet <String> set = new TreeSet<>(list); 
		
		for (String s : list) {
			
			System.out.print(s + "<<");
		}		
		
//		
//		List<String> list = new ArrayList<>(); 
//		
//		for (String eachElement : arr) {
//			
//			list.add(eachElement); 
//		}
//		
//		
//		Iterator it = list.iterator(); 
//		
//		while (it.hasNext()) {
//			
//			System.out.print(it.next() + " ");
//			
//		}
//		
//		System.out.println("\n");
//		SortedSet <String> sSet = new TreeSet<>(list); 
//		
//		for ( String lastSet : sSet) {
//			
//			System.out.print(lastSet + ", ");
//			
//		}
//		
//		System.out.println("Unique Elements: " + sSet.size());
//	 
//		SortedSet pqSet = sSet.subSet("K", "Q"); 
//		System.out.println(pqSet);
//		
//		
//		
		
		
		
		
		
	}

}
