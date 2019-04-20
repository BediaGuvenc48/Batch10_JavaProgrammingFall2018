
import java.util.*; 
public class FinraPrep {
	
	public static void main(String[] args) {
		
	int [] numbers = {10, 11, 10, 12, 10, 11, 13, 15, 66};  
			
	List<Integer> listNums = removeDuplicate(numbers); 
	
	System.out.println(listNums);
	
	boolean b = isAnagaram("cara", "arc"); 
	System.out.println(b);
	
	String str = duplicateChar("Khalili"); 
	System.out.println(str);
		
	vowelAndConsCount("khalili"); 
	
	boolean b1 = isPalindron("khalili"); 
	System.out.println(b1);
	
	
	}
		
		// 1): Remove Duplicate from an Array 
		
		
		public static List<Integer> removeDuplicate(int [] nums){
			
			List<Integer> numList = new ArrayList<>(); 
			
			for (int idx = 0; idx < nums.length; idx++) {
				
				for (int j = 0; j < nums.length; j++) {
					
					if (nums[idx] == nums[j] && idx != j) {
						continue; 
					} else if (nums[idx] != nums[j] && !numList.contains( nums[idx] )) {
						numList.add(nums[idx]); 
					}
				}
			}
			
			return numList; 
		}
		
		//2):  	Write a method  to check two strings areAnagrams(String s1, String s2) ?and returns a Boolean
		
        public static boolean isAnagaram(String str1, String str2) {
        	
        	if (str1.length() != str2.length()) {
        		return false; 
        	}
        	
        	char [] ch1 = str1.toCharArray(); 
        	char [] ch2 = str2.toCharArray(); 
        	
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	
        	for (int idx = 0; idx < ch1.length-1; idx++) {
        		
        		if (ch1[idx] != ch2[idx]) return false; 
        	}
        	 
        	return true; 
        }
		
        //3): How to Print duplicate characters from a String? 
        
      public static String duplicateChar(String str) {
          
    	String temp = ""; 
    	
        char [] ch = str.toCharArray(); 
        
          for (int idx = 0; idx < ch.length; idx++) {
        	  
        	  for (int j = 0; j  < ch.length; j++) {
        		  
        		  if (ch[idx] == ch[j] && idx != j) {
        			  temp += ch[idx];
        		  }
        	  }   
          }
    	  
    	  return temp; 
      }
		
     //4): How to count a number of vowels and consonants in a given String? 
      
      public static void vowelAndConsCount(String str) {
    	  
    	  int vowelCount = 0; 
    	  int consCount = 0; 
    	  
    	  char [] ch = str.toCharArray(); 
    	  
    	 for (int idx = 0; idx < ch.length; idx++) {
    		 
    		 if (ch[idx] == 'A' || ch[idx] == 'a' || ch[idx] == 'E' || ch[idx] == 'e' 
    				 || ch[idx] == 'I' || ch[idx] == 'i' || ch[idx] == 'O' || ch[idx] == 'o'
    				 || ch[idx] == 'U' || ch[idx] == 'u') {
    		
    			 vowelCount++; 
    		 } else  
    			 consCount++;  
    		  	  
    	 }

    	 System.out.println("Vowel letters counts are: " + vowelCount);
    	 System.out.println("Vowel letters counts are: " + consCount);
    	  
      }
      
      //5): How to check if given String is Palindrome? 
      
      public static boolean isPalindron(String str) {
    	  
    	  String revers = ""; 
    	  
    	  for (int idx = str.length()-1; idx >= 0; idx--) {
    		  
    		  revers += str.charAt(idx); 
    		  
    		  if (str.equals(revers)) return true;  
    	  }
    	  return false;
      }
      
      //6: Write a program to eliminate duplication in an array. How do you extend it to more generic data types? 
      
      public static List<Integer> eliminateDuplicate(int [] nums) {
    	  
    	  List<Integer> nList = new ArrayList<>(); 
    	  
    	  for (int idx = 0; idx < nums.length-1; idx++) {
    		  for (int j = 0; j < nums.length-1; j++) {
    			  
    			  if (nums[idx] == nums[j] && idx != j) {
    				  
    				  nList.add(nums[idx]); 
    			  } 
    		  }
    	  }
    	  
    	   return nList; 
      }
      
      
//      public static List<String> removDuplicate(String [] names){
//    	  
//    	  List<String> list = new ArrayList<>
//    	  
//    	  
//    	  
//    	  
//    	  return null; 
//      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      	

}
