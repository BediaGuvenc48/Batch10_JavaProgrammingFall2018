package day63_DataStructor_Akbar_03;

import java.util.*; 
public class WarmUPAkbar {
	

	/*
	
	Given array of Strings names—> 
    Use iterator to iterate over.
    count unique elements 
    find out how many items start with  k-l
    find frequency of each items  : hint create a frequency map 
    
	 */
	
	
	public static void main(String[] args) {
		
		
		String [] names = {"jamal", "jamil", "zabih", "aiaz", "jamal", "jawad"}; 
		
		List<String> list = new ArrayList<>(); 
		
		for (String l : names) {
			
			 list.add(l); 
		}
		
		Iterator<String> it = list.iterator(); 
		int count = 0; 
		
		while (it.hasNext()) {
			
			
			if (it.next() != it.next()+1) {
			
				count++; 
			}
		}
		System.out.println(count);
		
		Set<String> setList = new TreeSet<String>(list); 
		System.out.println(setList.size());
		System.out.println(setList);
	
		String[] arr = {"Darben","Pinkney","Lamburn",
					"Secretan","Kawse","Pinkney","Martynikhin",
					"Oram","Pinkney","Glaze","Martynikhin",
					"John","Adam","Zack"};
		
		List<String> nameLst = new ArrayList<>();
		for (String eachName : arr) {
			nameLst.add(eachName);
		}
		
		System.out.println(nameLst);
		
		Iterator<String> iter = nameLst.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		SortedSet<String> sSet = new TreeSet<>(nameLst);
		System.out.println(sSet);
		System.out.println(sSet.size());
		
		SortedSet<String> kpSet = sSet.subSet("K","Q") ; 
		System.out.println(kpSet);
		
		kpSet.remove("Oram") ;
		System.out.println(sSet);
		System.out.println(kpSet);
		
		
		Map<String,Integer> freqMap = new HashMap<>(); 
		
		System.out.println( freqMap.containsKey( "ABC") );
		
		for (String name : nameLst) {
			
			// add item to the map key and increment item by one 
			// if it appear in the list 
			
			if(!freqMap.containsKey(name) ) {
				
				freqMap.put(name, 1) ; 
				
			} else {
				
				Integer existingCount = freqMap.get(name) ;
				freqMap.put(name, existingCount + 1) ; 
				
			}
		}
		
		System.out.println( freqMap );
		
		
		  
		
	}	

}
