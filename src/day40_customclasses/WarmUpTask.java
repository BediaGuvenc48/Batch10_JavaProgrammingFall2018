package day40_customclasses;

import java.util.Arrays;

public class WarmUpTask {
	
	public static void main(String[] args) {
		
		
		String [] words = new String[5]; 
		
		words[0] = "coffee"; 
		words[1] = "tea"; 
		words[2] = "water"; 
		words[3] = "juice"; 
		words[4] = "milk"; 
		
		System.out.println(Arrays.toString(words));
		
		//Create StringBuilder Object 
		
		StringBuilder wordsStb = new StringBuilder(); 
		
	//without loop if you have fixed number of values in STring[] 

		wordsStb.append(words[0])
				.append(words[1])
				.append(words[2])
				.append(words[3])
				.append(words[4]); 

		System.out.println(wordsStb);
		
	
	StringBuilder wordsBuilder = new StringBuilder();
		
		for (String drink : words) {
			
			wordsBuilder.append(drink + ", "); 	
		}
			System.out.println(wordsBuilder + " ");

	}
	

	
}
