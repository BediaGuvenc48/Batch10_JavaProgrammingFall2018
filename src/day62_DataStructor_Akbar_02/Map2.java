package day62_DataStructor_Akbar_02;

import java.util.*; 

public class Map2 {

	public static void main(String[] args) {

		Map<Long, String> product = new HashMap<>();
		product.put(123L, "book");
		product.put(23L, "table");
		product.put(300L, "pen");
		product.put(12L, "bed");
		product.put(50L, "pan");
		
		//System.out.println( product.size() );

		System.out.println(product);
		
		Set<Long> allkeys = product.keySet();
		System.out.println( allkeys );
		
		Collection<String> values = product.values();
		System.out.println( values );
		

	}

}
