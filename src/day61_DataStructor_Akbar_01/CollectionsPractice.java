package day61_DataStructor_Akbar_01;

import java.util.*; 

public class CollectionsPractice {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<>(); 
			list.add(12); 
			list.add(13);
			list.add(332);
			list.add(22);
			list.add(55);
			list.add(12);
			list.add(55);
			list.add(13);
		
		System.out.println( list );
		
		System.out.println("\n >>>>>>>>>> Comparing Sorted and UnSorted >>>>>>>>>>>");
		
		Collections.sort(list); 
		
		System.out.println( list );
		
		int numberOf2 = Collections.frequency(list, 12); 
		System.out.println(numberOf2);
		
		int n = Collections.frequency(list, 13); 
		System.out.println(n);
		
	}

}
