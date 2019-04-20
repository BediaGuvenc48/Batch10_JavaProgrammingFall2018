package day60_DataStructor_Maps;

import java.util.*; 


public class IteratorExample {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> lst = new ArrayList<>(); 
			lst.add(12) ;
			lst.add(15) ;
			lst.add(20) ;
			
		Iterator<Integer> myIterator = lst.iterator(); 
//		System.out.println(myIterator.next());
		
//		System.out.println(myIterator.next()); 
//		System.out.println(myIterator.next()); 
//		System.out.println(myIterator.next()); 
//		System.out.println(myIterator.next());  
		
		System.out.println (myIterator.hasNext()); //this will return a true or false, if I hav
		
		
		while ( myIterator.hasNext() ) {
			
			int target = myIterator.next(); 
			
			if (target > 16) {
				myIterator.remove(); 	
			}
		}
			System.out.println(lst);
			
			
			
	List<Integer> nList = new ArrayList<>(); 
	nList.add(15); 
	nList.add(25); 
	nList.add(35); 
	nList.add(55); 
			
	Iterator<Integer> it = nList.iterator();
	
	System.out.println(it.hasNext());
	
	while (it.hasNext()) {
		
		int target = it.next(); 
		if (target > 25) {
			it.remove(); 
		}
	}
		System.out.println(nList);
			
			
	}

}
