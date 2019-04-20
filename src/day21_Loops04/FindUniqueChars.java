package day21_Loops04;

public class FindUniqueChars {
	
	public static void main(String[] args) {
		
		/*
		 * 3. Accept a String and print only unique characters in the String:
		 * speedlimit
		 * spedlimt
		 * 
		 * aaahhhrrrriiieee
		 * ahrie
		 */	
		
		String word = "Ahmadullah"; 
		
		String unique = ""; 
		
		for (int idx = 0; idx <word.length()-1; idx++) {
			
			String letter = word.substring(idx, idx+1); 
			
			if (!unique.contains(letter)) {
				
				unique = unique + letter; 
			}
		}
			System.out.println(unique);	
	/*		
		String word = "Mohammad";
        // 0123 
		String unique = "";
		//int i = word.length()-1;
		//System.out.println(word.substring(i,i+1));

		for(int i=0;i < word.length(); i++) {
			//System.out.println( word.substring(i, i+1) );
			String letter = word.substring(i, i+1);
			if(!unique.contains(letter)) {
				unique = unique + letter;
			}
		}

			System.out.println(unique);*/

		
	
		
	}

}
