package day65_Lamda;

import java.util.function.Predicate;
import java.util.*; 

public class PredicateExample {
	
	
	public static void main(String[] args) {
		
		// Predicate,  Consumer, Supplier, Function 
		
		List<Integer> list = new ArrayList<>(); 
		
			list.add(3); 
			list.add(13); 
			list.add(33); 
			list.add(4); 
			list.add(5); 
			list.add(63); 
			list.add(53); 
			
		Predicate<Integer> numMoreThan10 = num -> num > 10; 
		
			for (Integer num : list) {
				
				if (numMoreThan10.test(num)) {
					System.out.print(num + ", ");
				}
			}	
		
		System.out.println("\n");
		
		list.removeIf(numMoreThan10); 
		System.out.println(list);
		
		List lst2 = new ArrayList<>();  // this can accept anything, by default, Object is coming which accept anything 
		
		Predicate strPred = new Predicate() {

			@Override
			public boolean test(Object t) {
			 
				String str = (String) t ; 
				return str.contains("C"); 	 
			} 
	}; 
	
		boolean hasC = strPred.test("ABCD");
		System.out.println(hasC);
		
		
		Predicate<String> letterAFinder = str ->   str.contains("A"); 
//		Predicate<Integer> numMoreThan10 = num -> num > 10; 
		 
		
	}

}
