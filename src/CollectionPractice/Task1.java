package CollectionPractice;

import java.util.*; 
public class Task1 {
 
	

	/*
	
	Given array of Strings names—> 
    Use iterator to iterate over.
    count unique elements 
    find out how many items start with  k-l
    find frequency of each items  : hint create a frequency map 
    
	 */
	
	
	public static void main(String[] args) {
		
	
		String [] arr = new String [7]; 
			arr[0] = "Ahmad"; 
			arr[1] = "Kamel"; 
			arr[2] = "Luwam"; 
			arr[3] = "Zulfukar"; 
			arr[4] = "Jamal"; 
			arr[5] = "Ahmad"; 
			arr[6] = "Kamel"; 
			
			List<String> naser = new ArrayList<>(); 
			
			for (String asad : arr) {
				
				
				naser.add(asad); 
				
			}
			
			
			System.out.println(naser);
	System.out.println("Naser Array: ");
		List<String> myList = new ArrayList<>(); 
		
		for (String eachElement : arr) {
			
			myList.add(eachElement); 
		}
		
		Iterator it = myList.iterator(); 
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n");
		
		Set <String> set = new HashSet<>(myList); 
		
		System.out.println(set);
		
		SortedSet <String> sSet = new TreeSet<>(myList); //this give me a list of sorted order and it is good to be used in the job field 
		
		System.out.println(sSet);
		
		SortedSet<String> KLset = sSet.subSet("K", "M"); 
		System.out.println(KLset);
		
		Map<String, Integer> freq = new HashMap<>(); 
		
		System.out.println(freq.containsKey("Khalili")); //this gives me a boolean, if we have something like this or not 
		
		for (String name : myList) {
			
			if (!freq.containsKey(name)) {
				freq.put(name, 1); 
			}else {
				
				Integer existingCount = freq.get(name); 
				freq.put(name, existingCount + 1); 
				
			}
			
		}
			System.out.println(freq);
		
		
	}
	
	
}
