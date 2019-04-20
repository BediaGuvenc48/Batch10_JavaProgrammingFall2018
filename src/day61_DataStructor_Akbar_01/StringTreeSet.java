package day61_DataStructor_Akbar_01;

import java.util.*; 

public class StringTreeSet {
	
	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>(); 
			treeSet.add("apple"); 
			treeSet.add("mango");
			treeSet.add("apple");
			treeSet.add("mango");
			treeSet.add("kiwi");

		
		System.out.println( treeSet );
		System.out.println("\n >>>>>>>>>>>>>>>>>>");
		
		SortedSet<String> tail = ((TreeSet<String>) treeSet).tailSet("mango"); 
		System.out.println(tail);
	
Iterator<String> myIterator = treeSet.iterator(); 

for (String str : treeSet) {
	
	System.out.println(myIterator.next());
	
   }

//tailSet --> It gives you a view one specific element to the rest of the Set. 


  }
}
