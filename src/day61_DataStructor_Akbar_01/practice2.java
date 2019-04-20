package day61_DataStructor_Akbar_01;

import java.util.*;



public class practice2 {
	
	public static void main(String[] args) {
		
		
		List<String> mylist= new LinkedList<>();
			mylist.add("AhmadZ"); 
			mylist.add("Zabi");
			mylist.add("Elshad"); 
			
		Iterator<String> it=mylist.iterator();
		
	    while( it.hasNext()) {
	    
	    	String target = it.next(); 
	    	
	            if(target.contains("A") && target.contains("Z"))
	                it.remove();
	    }
	    System.out.println(mylist);
		
		
	}
	
}
