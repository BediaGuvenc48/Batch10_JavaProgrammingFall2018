package Interview_PREP;

import java.util.*; 

public class First {
	
	public static void main(String[] args) {
		
		
//		String str = "aghghahaaaahhhhhhhhh"; 
//		
//		String unique = ""; 
//		
//		for (int idx = 0; idx < str.length(); idx++) {
//			
//			if (!unique.contains(str.charAt(idx) + "")) {
//				
//				unique += str.charAt(idx); 
//			}
//			
//		}
//		System.out.println(unique);
//		
//		
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Test End >>>>>>>>>>>>>>>>>>>");
//		
//		
//		String ab = "Ahmahadullahaaaaaaaaaaaaaaa"; 
//		String unq = ""; 
//		
//		for (int i = 0; i < ab.length(); i++) {
//
//			if (!unq.contains(ab.charAt(i) + "")) {
//				unq += ab.charAt(i); 
//			}
//		}
//		System.out.println(unq);
//		
//		
//		
//		List<String> names = new ArrayList<>(); 
//		
//		names.add("zaki"); 
//		names.add("zabih"); 
//		names.add("zaki"); 
//		names.add("zabih"); 
//		names.add("ahmad"); 
//	
//		
//		Set <String> setList = new HashSet(names); 
//		
//		for (String set : setList) {
//			System.out.println(set);
//		}
//		
//		
//		
//		if (setList.size() < names.size()) {
//			System.out.println("True");
//		} else {
//		
//			System.out.println("False"); 
//		
//		}
//		
//		int counter = 0; 
//		String str1 = "";  
//		
//		for (int idx = 0; idx < names.size(); idx++) {
//			
//			for (int j = 0; j < names.size(); j++) {
//				
//				if (names.get(idx) == names.get(j) && idx != j){
//					
//					counter++;
//					//System.out.println(names.get(idx));
//					str += names.get(idx); 
//			 
//					
//				}
//
//			}
//			
//			
//		}
//		
////			System.out.println(counter);
//			System.out.println(str + ", ");
//		
//		
//			
//	String l = "China"; 
//	
//	StringBuilder stL = new StringBuilder(); 
//	stL.append(l); 
//	System.out.println(stL);
//	
//	stL.reverse(); 
//	
//	System.out.println(stL);
//	
//	for (int idx = l.length(); idx >= 0; idx--) {
//		
//		System.out.print(l.charAt(idx));
// 
//	}
//			
//			
//	int a = 10; 
//	int b = 4; 
//	
//	 
	
		
		String a = "ahmad"; 
		String reverse = ""; 
		
		for (int idx = a.length()-1; idx >= 0; idx--) {
			
			reverse += a.charAt(idx); 
		}
			System.out.println(reverse);
			
			
		
		String ab = "hey my name is ahmad"; 
		String rev = ""; 
		String [] abs = ab.split(" "); 
		
		for (int idx = abs.length-1; idx >= 0; idx--) {
			
			rev += abs[idx]; 
		}
		
		System.out.print(rev + " ");
		
		
		int [] nums = {100,300,200,111,33}; 
		
		nums = Arrays.copyOf(nums, 7); 
		
		nums[5] = 1000; 
		nums[6] = 6666; 
		
		
		Arrays.sort(nums);
		
		System.out.println("Min: " + nums[0]);
		System.out.println("Max: " + nums[nums.length-1]);
		
//		for (int idx = 0; idx < nums.length; idx++) {
//			
//			System.out.println("Min: " + nums[0]);
//			System.out.println("Max: " + nums[nums.length-1]);
//			break;
//		}
		
		
		List<Integer> list = Arrays.asList(100,300,200,111,33); 
		
		Collections.sort(list); 
		
		System.out.println("Mine: " + list.get(0));
		System.out.println("Max-List: " + list.get(list.size()-1));
		
		
		
	}

}
