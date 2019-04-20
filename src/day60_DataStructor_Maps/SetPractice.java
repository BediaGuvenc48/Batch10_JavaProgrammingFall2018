package day60_DataStructor_Maps;

import java.util.*; 

public class SetPractice {
	
	
	public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>(); 
			numSet.add(12); 
			numSet.add(13);
			numSet.add(332);
			numSet.add(22);
			numSet.add(55);
			numSet.add(12);
			numSet.add(55);
			numSet.add(13);
			
			System.out.println( numSet );
			System.out.println("\n >>>>>>>>>>>>>>>>>>");
	
	Iterator<Integer> myIterator = numSet.iterator(); 
	
	for (Integer IT : numSet) {
		
		System.out.println(myIterator.next());
		
	}
	
	
System.out.println("\n >>>>>>>>>>>>> Seperating The Sets ");
	
	Set<Integer> treeSet = new TreeSet<>(); 
		treeSet.add(12); 
		treeSet.add(13);
		treeSet.add(332);
		treeSet.add(22);
		treeSet.add(55);
		treeSet.add(12);
		treeSet.add(55);
		treeSet.add(13);
		
		System.out.println( treeSet );
		System.out.println("\n >>>>>>>>>>>>>>>>>>");
	


Iterator<Integer> myIterator1 = treeSet.iterator(); 

for (Integer IT : treeSet) {
	
	System.out.println(myIterator1.next());
	
 }
		

Set <String> sSet = new TreeSet<>(); 

sSet.add("ahmad"); 
sSet.add("ahmad"); 
sSet.add("Jamal"); 
sSet.add("ahmad"); 
sSet.add("ahmad"); 
sSet.add("Kamal"); 
sSet.add("ahmad"); 
sSet.add("ahmad"); 

for (String eSet : sSet) {
	System.out.println(eSet);
}
 
Iterator<String> is = sSet.iterator(); 

System.out.println(is.hasNext());

while (is.hasNext()) {
	
	String target = "ahmad"; 
	
	if (is.next().equals(target)) {
		
		is.remove(); 
	}
}

System.out.println(sSet);

















	
}
	

}
