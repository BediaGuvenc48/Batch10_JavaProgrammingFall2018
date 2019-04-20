package TestClass;
import java.util.*; 
public class MentoringMira {
	
 public static void main(String[] args) {
	 
			
			/*
			 * When gears merge and work together, one teeth from each one goes in order.
				Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
				
				s1 ==> "12345"
				s2 ==> "abcde"
				mergeStrings(s1,s2) ==> "1a2b3c4d5e"
				
				mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
				
				mergeStrings("java", "selenium") ==> "jsaevlaenium"
			 */
	 	
	 			System.out.println(	Merged("java", "java") ); 
			
		}
		
		public static String Merged (String word1, String word2) {
			String merged = "";
			
			if (word1.length()>word2.length()) {
				
				for (int i = 0; i<word1.length(); i++) { // wooden spoon
					merged += word1.charAt(i); //wsopoodoenn
					
					if (i<word2.length()) {
						merged += word2.charAt(i);
					}
				}
			} else {
				for (int i = 0; i<word2.length(); i++) { 
					merged += word2.charAt(i); 
					
					if (i<word1.length()) {
						merged += word1.charAt(i);
					}
				}
			}
			
			return merged;
		}
		
		public static String mergeStrings(String one, String two) {
		    String merged = "";
		     if (one.length()>two.length()) {
		            for (int i = 0; i< one.length(); i++) {
		                merged = merged + one.charAt(i);
		                if (i<two.length()) {
		                    merged = merged + two.charAt(i);
		                }
		            }
		            } else {
		                for (int i = 0; i< two.length(); i++) {
		                    if (i<one.length()) {
		                        merged = merged + one.charAt(i);
		                    }
		                    merged = merged + two.charAt(i);
		                }
		            }
		            return merged;
		          }
		
		
		public static int refuel_times (ArrayList<Integer> deliveries,int max_fuel) {
			int count = 0;
			int sum = 0;
			
			for (int i =0; i<deliveries.size(); i++) {
				sum+=deliveries.get(i); //10
			}
			
			if (sum%max_fuel == 0) {
				count = sum/max_fuel;
			}else {
				count = sum/max_fuel +1;
			}
			
			return count; 	
	}
		
		public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
			
			
			//[1,1,2,3,1, 1,4] , 1
			// 0 1 2 3 4 5
			// i = 0 1 2 3
			//[1,2,3,1,4]
			// 0 1 2 3 4
			//[2,3,1,4]
			// 0 1 2 3
			//[2,3,4]
			// 0 1 2 
			//[1,2,3,4]
			// 0 1 2 3 
			
			
			
			for (int i = 0; i< r.size(); i++) {
				if (r.get(i) == n) {
					r.remove(i);
					i--;
				}
			}
			
			return r;
		}	
}	
	

