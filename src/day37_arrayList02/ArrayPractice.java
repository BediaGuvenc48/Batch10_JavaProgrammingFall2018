package day37_arrayList02;
import java.util.*; 
public class ArrayPractice {
	
public static void main(String[] args) {
	
	ArrayList <String> lst = new ArrayList<>(); 
	//List<String> lst1 = new ArrayList<>(); 
		
		lst.add("apple"); 
		lst.add("Kiwi"); 
		lst.add("banana"); 
		lst.add("orange"); 
		
		System.out.println(lst);
		System.out.println(lst.toString());
		
		for (String a : lst) {
			
			System.out.print(a + ", ");
		}
		

		System.out.println("First index of ArrayList: " + lst.get(0));
		
		System.out.println(lst.contains("apple"));
		
		
		
		
		
		
		
		
	
   }
		
	
}
