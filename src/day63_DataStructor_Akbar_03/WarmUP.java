package day63_DataStructor_Akbar_03;

import java.util.Iterator;
import java.util.*; 

public class WarmUP {
	
	/*
	
	Given array of Strings names—> 
    Use iterator to iterate over.
    count unique elements 
    find out how many items start with  k-l
    find frequency of each items  : hint create a frequency map 
    
	 */
	
	public static void main(String[] args) {
		
	
		 String [] arr= {"Ahmad", "Kemal", "Khalili", "Albert", "Elshad", "Luwam"}; 
		
		 ArrayList<String> arrList =  new ArrayList<>(); 
		 
		 String L = ""; 
		 String K = ""; 
		 int count = 0; 
		 int counter = 0; 
		 
		 for (int idx = 0; idx < arr.length; idx++) {
			 
//			arrList.get(idx) += arr[idx]; 
			 
			 if (arr[idx].startsWith("K")) {
				 count++; 
			 } else if (arr[idx].startsWith("L")) {
				 counter++; 
			 }
			 
		 }
		 
		 System.out.println("\n");
		 
		 System.out.println("Number of elements start with K : " + count);
		 System.out.println("Number of elements start with L : " + counter);
		 
		//Map<Stirng, Integer> freq = Stream.of(arr).collect().groupingBy(Function.identity)
		 
					
		Map<String, Integer> freq = new HashMap<>(); 
		
		for (String a : arr) {
			
			int prev = 0; 
			
			if (freq.containsKey(a) != false) {
			
				freq.put(a, 1); 
			} else {
				
			}	
		}	
		
	}
	
}
