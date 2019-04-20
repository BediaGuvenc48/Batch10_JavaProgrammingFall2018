package day28_Arrays05;

import java.util.Arrays;

public class binnarySearchMethod {
	
	public static void main(String[] args) {
	
	/*
	 * Arrays.binarySearch. it will return the index of a specified element in the array
	 * ARRAY MUST BE SORTED FOR BINARYSEARCH TO WORK 
	 * 
	 */
	 
	
		String [] words = {"cake", "tomato", "wooden spoon", "pizza"}; 
		
		
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(words));
		System.out.println( Arrays.binarySearch(words, "wooden spoon") ); 
		
		
		
		System.out.println(Arrays.toString(words));

		
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.binarySearch(words, "tomato"));
		
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(words));
		
		System.out.println(Arrays.binarySearch(words, "pizza"));
		
		// Arrays must be sorted to work in binarySearch method. 
		// It shows the index location which starts from 0
		
		
		int index = -1;

		for(int i=0; i < words.length; i++) {
			if(words[i].equals("tomato")) {
				index = i;
				break;
			}
		}

		System.out.println(index);

		if(index == -1) {
			System.out.println("not found");
		}
		
	}

}
