package day36_overloading_arrayList;
import java.util.ArrayList;
import java.util.Arrays; 
public class StringOnlyArrayList {
	
	public static void main(String[] args) {
		
//		ArrayList<String> names;
//		names = new ArrayList<>();
		
	ArrayList <Integer> n = new ArrayList<>(); 
	
		n.add(55); 
		n.add(33); 
		n.add(9999); 
		
		System.out.println(n); 
		System.out.println(n.toString());
		
		n.remove(1); 
		System.out.println(n);
		
		n.remove(0); 
		System.out.println(n);
		
		n.get(0); 
		System.out.println(n.get(0));
		
		System.out.println(">>>>>>>>>>Test Ends>>>>>>>>>>>>>");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
			numbers.add(100); 
			numbers.add(200); 
			numbers.add(300);
		
		System.out.println(numbers.get(1));
		System.out.println(numbers.size());
	
			numbers.remove(1); 
		System.out.println(numbers);
		System.out.println(numbers.toString());
		
		System.out.println(numbers.isEmpty());
			
	System.out.println("============Test Example Ends ==============");	
	
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Shapkat");
		names.add("Cam");
		names.add("Khalili");
		names.add("Z");
		names.add("Anastasia");
		names.add("Ali");
		//print all in same line
		System.out.println(names);
		
		names.add("James");
		System.out.println(names);
		
		//get size/number of elements
		int length = names.size();
		System.out.println("Number of Names: " + length);
		
		//read first person name
		String first = names.get(0);
		System.out.println("First name:" + first);
		
		String last = names.get( names.size()-1 );
		System.out.println("Last:" + last);
		
		//remove the element from the list
		names.remove(0);
		System.out.println(names);
		
		names.remove(2);
		//names.remove("Z");
		
		System.out.println(names);
		
	}

}
