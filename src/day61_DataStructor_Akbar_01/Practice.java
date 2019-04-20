package day61_DataStructor_Akbar_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Practice {
	
	
	public static void main(String[] args) {
		
		Elements(); 
		
		System.out.println(">>>>>>>>>>>>SeperateionOfMethods>>>>>>>>>>>>>>>>>");
		myList(); 

	}
	
	public static ArrayList <String> Elements() {
		
		
		Collection<String> temp = new ArrayList<>();
			temp.add("A"); 
			temp.add("B");
			temp.add("C"); 
			temp.add("D");
		 
		for (String t : temp) {
			
			System.out.println(t);
		}
		return (ArrayList<String>) temp;
	
	}
	
 
	
	public static ArrayList<String> myList(){
		
		List<String> list = new ArrayList<>(); 
		list.add("a"); 
		list.add("b"); 
		list.add("c"); 
		list.add("d"); 
		list.add("e"); 
		
		for (String s : list) {
			System.out.println(s);
		}
	
		return (ArrayList<String>) list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
