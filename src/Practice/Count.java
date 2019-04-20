package Practice;

import java.util.*;
public class Count {
	
		public static void main(String[] args) {
			
			String str = "se+se=2se"; 	
			String temp = ""; 
			
			for (int idx = 0; idx < str.length(); idx++) {
				
				if (str.charAt(idx) == 's' || str.charAt(idx) == 'e') {
					temp += str.charAt(idx); 
				}
			}
			
			System.out.println(temp);
			
			String [] array = temp.split(""); 
			
			System.out.println(Arrays.toString(array));
			int counter = 0; 
			
		 for (int idx = 0; idx < array.length-1; idx++) {
			 
			 for (int j = idx+1; j < array.length; j++) {
				 if (array[idx] == array[j] && idx != j) {
					 counter++; 
				 }
			 }
		 }
			
			System.out.println(counter);
				
		}

    }
