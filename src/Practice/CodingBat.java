package Practice;

import java.util.*;
public class CodingBat {

	public static void main(String[] args) {
		
		CodingBat c = new CodingBat(); 
		
		String x = c.extraEnd("ab"); 
		System.out.println(x);
		
		String str = makeOutWord("<<>>", "khalili"); 
		System.out.println(str);
		
		String s = "<<>>"; 
		System.out.println(s.substring(0,2));
		System.out.println(s.substring(2,4));
		
		Map<String, String> mp = new HashMap<>(); 
			mp.put("a", "Khalili"); 
			mp.put("b", "Nemat"); 
			
		Map<String, String> map = mapAB(mp); 
		
		System.out.println(map);
		
		int num = countXX("Hexxo thxxe"); 
		System.out.println(num);
	}
	
	public static int countXX(String str) {
		  
		  int count = 0; 
		  
		  char [] ch = str.toCharArray(); 
		  
		  for (int idx = 0; idx < ch.length-1; idx++){
		    
		      if (ch[idx] == 'x' || ch[idx] == 'X'){
		        count++; 
		      }
		  }
		  
		    return count; 
		}

	
	public static Map<String, String> mapAB(Map<String, String> map) {
		  
		   if (map.size() <= 1){
		     return map; 
		   }
		   
		   if (map.containsKey("a") && (map.containsKey("b") ))  {
		        map.put("ab", map.get("a").concat(map.get("b"))); 
		   }
		   	return map;
		}

	public static String makeOutWord(String out, String word) {
		  
		  
		  return out.substring(0,2)+word+out.substring(2,4); 
		  
		}
 
	public String extraEnd(String str) {

		 String temp = "";  
		 
		  if (str.length() < 2){
		    return str; 
		  } else if ( str.length() >= 2 )  
		  
		temp = str.substring(str.length()-2, str.length());  
			  
		return temp+temp+temp;
		  
		 
		}

	public Map<String, String> mapAB4(Map<String, String> map) {
		  
		  if (map.get("a").equals(map.get("b") )){
		    
			  map.put("a", ""); 
			  map.put("b", ""); 
			  
		  }else if (map.get("a").length() > map.get("b").length()){
			  
			  map.put("c", map.get("a")); 
			  
		  }else if (map.get("b").length() > map.get("a").length()) {
			  map.put("c", map.get("b")); 
		  }
		  
		  return map; 
		}

	
	
}
