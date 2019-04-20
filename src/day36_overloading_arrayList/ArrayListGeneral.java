package day36_overloading_arrayList;
import java.util.ArrayList; 
public class ArrayListGeneral {
	
	public static void main(String[] args) {
	
	/*
	 * create a general (row type) arraylist. 
	 * we can add any type of data to this list, int, double String etc ...
	 */
		
		
		ArrayList myList = new ArrayList<>(); 
		
		myList.add("A"); 
		myList.add(3); 
		
		System.out.println(myList);
		
	ArrayList job = new ArrayList(); 
		job.add(50,00); 
		job.add("Scrum Master"); 
		job.add(true); 
		job.add('A'); 
		
	ArrayList list = new ArrayList(); 	
	list.add("Java"); 
	list.add("Eclipse"); 
	list.add("Slack"); 
	list.add(456); 
	list.add(true); 
	
	System.out.println(list);
	
	list.add(345.2); 
	list.add('_'); 
	System.out.println(list);
	
	//when you wanted to print an element then we just use from array.get(indxe position)
	
	System.out.println(list.size());
	
	list.add("water"); 
	list.add("Bless you"); 
	
	System.out.println(list.size()); 
	
	
		
	}

}
