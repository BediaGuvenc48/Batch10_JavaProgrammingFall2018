package day60_DataStructor_list;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		//Vector is synchronized 
		
		Vector <String> vector = new Vector<>(); 
		vector.add("apples"); 
		vector.add("bananna"); 
		vector.add("afaf"); 
		vector.add("bananna"); 
		
		System.out.println(vector);	
		
		for (String v : vector) {
			System.out.print(v + " ");
		}
	}

}
