package day65_Lamda;
import java.util.*; 
public class Main {
	
	public static void main(String[] args) { 
		
		
//		List<String> list = new ArrayList<>(); 
//			list.add("Sina"); 
//			list.add("Ayshe"); 
//			list.add("ahmad"); 
//			list.add("javad"); 
//		
//		Map<Integer, String> map = new HashMap<>(); 
//			map.put(25, "Ahakfjds"); 
//			map.put(23, "a"); 
//			map.put(18, "b"); 
//		
//		Map<List<String>, Map<Integer, String>> allMap = new HashMap<>(); 
//		
//			allMap.put(list, map); 
//			
//		System.out.println(allMap);
//		
//		Map<Integer, List<String>> map2 = new HashMap<>();
//		
//		
//	
//
//		List<String> list2 = new ArrayList<>(); 
//			list2.add("Sina"); 
//			list2.add("Ahakfjds"); 		
//
//			List<String> list3 = new ArrayList<>(); 
//				list3.add("Ahmad"); 
//				list3.add("a"); 		
//
//				List<String> list4 = new ArrayList<>(); 
//					list4.add("javad"); 
//					list4.add("b"); 
//		
//		
//		map2.put(25, list2);
//		map2.put(23, list3);
//		map2.put(18, list4);
//		
//		System.out.println(map2);
			
		
		
		
		
		Movable m1 = new Animal(); 
		Movable m2 = new Truck(); 
		Movable m3 = new Motorcycle(); 
		
//		m1.move(32);
//		m2.move(52);
//		m3.move(52);
		
		// it is creating annominous class 
		
//		Movable m4 = new Movable() {
//
//			@Override
//			public void move(int distance) {
//				
//				System.out.println("Animal is moving mile : " + distance);
//				
//			}
//			
//		} ;  
//		
//		Movable m5 = new Movable() {
//
//			@Override
//			public void move(int distance) {
//			 
//				System.out.println("Truck is moving mile : " + distance);
//				
//			} 
//		};
//		
		
		Movable m4 = distance -> System.out.println("Truck is moving mile : " + distance);
		
		
		
		
	}

}
