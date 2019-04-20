package day40_customclasses;
import java.util.ArrayList;
import java.util.Arrays; 
public class WarmUpTaskTeacher {

		
		public static void main(String[] args) {
			
			String[] words = new String[5];
			words[0] = "coffee";
			words[1] = "tea";
			words[2] = "water";
			words[3] = "juice";
			words[4] = "milk";
			
			System.out.println(Arrays.toString(words));
			
			//create StringBuilder object
			
			StringBuilder wordsStb = new StringBuilder();
			
			//without loop if you have fixed number of values in String[]
			
			wordsStb.append(words[0])
					.append(words[1])
					.append(words[2])
					.append(words[3])
					.append(words[4]);
			
			System.out.println(wordsStb);
			
			//add everything into stringBuilder using a loop
			StringBuilder wordsBuilder = new StringBuilder();
			ArrayList<String> wl = new ArrayList<>();
			
			
			
			int count =0;
			for(String drinks:words ) {
				wl.add(drinks);
				
			}
			
			
			for(String drink : words) {
				wordsBuilder.append(drink);
			}
			
			System.out.println(wordsBuilder + " ");
			
			System.out.println(wl.toString());
			
			wl.remove(2); 
			System.out.println(wl);
			
		}		

}
