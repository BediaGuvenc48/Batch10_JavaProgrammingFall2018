import java.util.*;

public class ExceptionPractice {
	
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>(); 
			list1.add("Elias"); 
			list1.add("Albert"); 
			list1.add("Rasa"); 
			list1.add("Zarina"); 
		
		List<String> list2 = new ArrayList<>(); 
			list2.addAll(list1); 
		
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list2);
		
		for (int idx = 0; idx < list1.size(); idx++) {
			
			try {
				
				if (list1.get(idx) != list2.get(idx)) {
					throw new IllegalArgumentException("This list is not in sorted order !!!"); 
				}	
				
			} catch(Exception e) {
				System.out.println("The exception is handled inside the try/catch block !!!");
			}finally {
				
				System.out.println("This is the final step of finally block !!! ");
				break;
			}
			
		}
	}

}
