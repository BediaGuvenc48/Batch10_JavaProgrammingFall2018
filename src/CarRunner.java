
import java.util.*; 
public class CarRunner {
	
	public static void main(String[] args) {
		
		int [] num = {1,1,2,3,1, 2, 7, 1}; 
		
			boolean b =	has271(num); 
			System.out.println(b);
		
		
		Car car = new Autdi(); 
		
		car.run();
		
		Map<String, Integer> map = wordCount("ABABCADS"); 
		System.out.println(map);
		
		List<String> list = new ArrayList<>(); 
			list.add("A"); 
			list.add("B");
			list.add("C"); 
		
		Map<Integer, String> mp = new HashMap<>(); 
			mp.put(25, "Ahmad"); 
			mp.put(22, "kkkk"); 
			mp.put(23, "jjj"); 
			
		Map<List<String>, Map<Integer, String>> mapAll = new HashMap<>(); 
		
		mapAll.put(list, mp); 
		
		System.out.println(mapAll);
		
		
	}
	
	
	public static Map<String, Integer> wordCount(String str){

		Map<String, Integer> map = new HashMap<>();  
		
		char [] ch = str.toCharArray(); 
		Arrays.sort(ch); 
		
		for (char c : ch) {

			String result = c+""; 
			
			if (!map.containsKey(result)) {
				map.put(result, 1); 
			} else {
				map.put(result,result.length()+1 ); 
			}
		}
		
		return map; 
		
	}
	
	public static boolean has271(int[] nums) {
		  
		  for (int idx = 0; idx < nums.length-2; idx++){
		   
		    if (nums[idx] == 2 && nums[idx+1] == 7 && nums[idx+2] == 1) return true;  
		  }
		  
		    return false; 
		}

	
}
