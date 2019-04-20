package Practice;

import java.util.*;
public class WordCountMap {

	public static void main(String[] args) {
		
		WordCountMap count = new WordCountMap(); 
		
		String [] names = {"khalili", "aiaz", "zabih", "aiaz", "khalili", "aiaz"}; 
		
		 Map<String, Integer> map = count.wordCount(names); 
		 System.out.println(map);
	}
	
	
	public Map<String, Integer> wordCount(String[] strings) {
		  
		  Map<String, Integer> map = new HashMap<>(); 
		   
		   for (String s : strings){
		     
		     if (!map.containsKey(s) ){
		        map.put(s, 1); 
		     }else {
		       map.put(s, map.get(s)+1); 
		     }
		   }
		  return map; 
		}
	
	public Map<String, String> firstChar(String[] strings) {
		  
		  Map<String, String> map = new HashMap<>(); 
		   
		  String key = ""; 
		  String value = ""; 
		  
		  for (String s : strings){
		    
		    key = s.substring(0,1); 
		    
		    if (!map.containsKey(key) ){
		      map.put(key, s); 
		    } else {
		      value = map.get(key)+s; 
		      map.put(key, value); 
		    }
		  }
		 
		  return map; 
		}
	
	public boolean endOther(String a, String b) {
		  int al = a.length(); 
		  int bl = b.length(); 
		  
		  if (a.substring(al-1, al).equalsIgnoreCase(b.substring(bl-1, bl))){
			  return true; 
		  }
		  return false; 
		}

	
	
  }
