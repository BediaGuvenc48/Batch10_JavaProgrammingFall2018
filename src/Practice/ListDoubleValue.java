package Practice;

import java.util.*;
public class ListDoubleValue {
	
	
	public static void main(String[] args) {
	
		
		
		
		List<Integer> list = new ArrayList<>(); 
			list.add(2); 
			list.add(5); 
			list.add(8); 
	
		
		List<Integer> l = doubling(list); 
		System.out.println(l);
		
		List<String> ml = new ArrayList<>(); 
			ml.add("x"); 
			ml.add("abaxab"); 
			ml.add("xx"); 
			ml.add("xabaxab"); 
			
			for (int idx = 0; idx < ml.size(); idx++) {
				
				if (ml.get(idx).endsWith("y")) {
					ml.get(idx).substring(0, ml.get(idx).length()-1);
				}
			}
			
			if (ml.get(1).contains("x")) {
				ml.remove("x"); 
			}
		
			System.out.println(ml);
			
		List<String> kl = noX(ml); 
		System.out.println(kl);
			
		
	}
	
	public static List<Integer> doubling(List<Integer> nums) {
		  
		  List<Integer> list = new ArrayList<>(); 
		  
		  for (int idx = 0; idx < nums.size(); idx++){
		    
		   list.add( nums.get(idx) * 2);  
		   
		  }
		  
		  return list; 
		  
		}

	public static List<String> noX(List<String> strings) {
		  
		  List<String> list = new ArrayList<>(); 
		  
		  int len = strings.size(); 
		  
		  for (int idx = 0; idx < strings.size(); idx++){
		    
		    if (len < 1){
		      return null; 
		    } else if (len >= 1 && strings.get(idx).contains("x")){
		        strings.remove("x"); 
		    }
		    
		      list.add( strings.get(idx) ); 
		  }
		    
		    return list;
		    
		}
	
	public List<Integer> noNeg(List<Integer> nums) {
		  
		  List<Integer> n = new ArrayList<>(); 
		  
		   
		   
		    
		  return n; 
		}

	 

}
