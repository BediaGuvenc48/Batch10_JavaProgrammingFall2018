package day37_arrayList02;
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Arrays;

public class ArrayListPracticeYoutube {
	
	
	public static void main(String[] args) {
		
		
		ArrayList arrayListOne; 
		
		arrayListOne = new ArrayList(); 
		
		ArrayList arrayListTwo = new ArrayList(); 
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("John Smith"); 
		names.add("Ahmad"); 
		names.add("Mohammad Alam"); 
	 
		
		names.add(0, "Kyle"); 
		
//		for (int idx = 0; idx < names.size(); idx++) {
//			
//			System.out.println(names.get(idx));
//		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		String ahmad = "Ahmadullah"; 
		
		names.add(ahmad); 
		System.out.println(names);
		
		names.add(0, "Ted"); 
		System.out.println(names);
		
		names.set(0, "Bob"); 
		System.out.println(names);
		
		for (int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(3); 
		System.out.println(names);
		
		//names.removeRange(0,1); 
		
		Iterator items = names.iterator(); 
		
		while (items.hasNext()) {
			
			System.out.println(items.next());
		}
		
		ArrayList nameCopy = new ArrayList(); 
		ArrayList nameBackup = new ArrayList(); 
		
		nameCopy.addAll(names); 
		
		System.out.println();
		System.out.println(nameCopy);
		
		String aiaz = "Aiaz Khalili"; 
		
		names.add(aiaz); 
		System.out.println(names);
		
		if (names.contains(aiaz)) {
			System.out.println("TRUE");
		}
		
		if (names.containsAll(nameCopy)) {
			
			System.out.println("Everything in nameCopy is also in ArrayList name");
		}
		
		names.clear();
		System.out.println(names.isEmpty()); 
		
		Object [] moreNames = new Object [4]; 
		
		moreNames = nameCopy.toArray(); 
		
		System.out.println(Arrays.toString(moreNames));
		
 
		
		
		
		
		
		
		
		
		
		
		
	}

}
