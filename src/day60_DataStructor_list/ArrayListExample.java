package day60_DataStructor_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	
	
	public static void main(String[] args) {
		
		
		List<String> l = new ArrayList<>(); 
		l.add("water"); 
		l.add("coffee"); 
		l.add("bottle"); 
		l.add("cup"); 
		
		System.out.println(l.indexOf("coffee")); 
		
		String [] array = l.toArray(new String [4]); 
		
		Arrays.sort(array);
		
		System.out.println(Arrays.binarySearch(array,  "water"));
		
		//multi dimmensional array 
		int [][] nums = new int [2][3]; //{  {1,2,3}, {5,6,7} }; 
		
		
		//List<List<Integer>> l 
		
		//Any work arround to resize an Array? 
		
		
		int [] numbers = {1,2,3}; 
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.copyOf(numbers, numbers.length + 1); //you are just adding a size at the copied Array. 

			numbers[3] = 33; 
			
			System.out.println(Arrays.toString(numbers));

		 
		
		
	}

}
