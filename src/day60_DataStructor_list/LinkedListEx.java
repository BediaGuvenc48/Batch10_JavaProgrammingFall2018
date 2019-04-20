package day60_DataStructor_list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
	List<String> linkedL = new LinkedList<>(); 
		linkedL.add("John"); 
		linkedL.add("Victor"); 
		linkedL.add("Bob"); 
		linkedL.add("Mark"); 
	
	System.out.println(linkedL.size() + ":" +linkedL);
	
	System.out.println(linkedL.indexOf("Bob"));
		
	LinkedList<String> linkedLL = (LinkedList) linkedL; 
	linkedLL.addFirst("Espan"); 
	
	System.out.println(linkedLL);
	
	linkedLL.addLast("Aiaz");
	System.out.println(linkedLL);
	
	linkedLL.add(1, "Aiaz"); 
	System.out.println( linkedLL.getFirst() ); 
	
	System.out.println(linkedLL); 
	
	linkedLL.removeFirst(); //if list is empty, it will trhow exception 
	System.out.println(linkedLL);
	
	linkedLL.poll(); // will not throw exception 
	
	System.out.println("Peek: " + linkedLL.peekFirst()); 
	System.out.println(linkedLL); 
	
	System.out.println(linkedLL.pollFirst());
	System.out.println(linkedLL);
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	}

}
