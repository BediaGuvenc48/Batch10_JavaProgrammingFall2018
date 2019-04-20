import java.util.HashMap;
import java.util.Map;

public class ReverseSentence {
	
	
	public static void main(String[] args) {
		
		String [] names = {"aiaz", "khalili", "mitra", "aiaz"}; 
		
	
//		 String s= "Hello";
//         HashMap<String, Integer> counter = new HashMap();
//         for(char c : s.toCharArray()){
//             String str = c+"";
//             if(!counter.containsKey(str)){
//                 counter.put(str, 1);
//             }else{
//                 counter.put(str, counter.get(str)+1);
//             }
//         }
//         System.out.println(counter);
		
		
         
//         
//         
//		Map<String, Integer> myMap = letterCount("Khalili"); 
//		System.out.println(myMap);
//		
//		Map<String, Integer> m = wordLetterCount("malikajan"); 
//		System.out.println(m);
//		
		
		

		
	}
	
	String str = "khalili"; 
	
	public static Map<String, Integer> myWord(String word){
		Map<String, Integer> mymap= new HashMap<>();
		for(int i=0;i<word.length();i++) {
			if(!mymap.containsKey(word.charAt(i))) {
				mymap.put(""+word.charAt(i), 1);  
			}else {
				
				int value = mymap.get(word.charAt(i));
						mymap.put(""+word.charAt(i), value+1);
			}
		}
		return mymap;
		
	}
	
	
	public static Map<String, Integer> letterCount(String str){
		
		Map<String, Integer> myMap = new HashMap<>(); 
		
		char [] ch = str.toCharArray(); 
		
		for (char c : ch) {
			
			String result = c+""; 
			
			if (!myMap.containsKey(result)) {
				myMap.put(result, 1); 
			} else {
				myMap.put(result,  myMap.get(result)+1); 
			}	
			
		}
		
		return myMap; 
	}
	
	
	public static Map<String, Integer> alphabetCount(String word){
		
		Map<String, Integer> map = new HashMap<>(); 
		
		char [] ch = word.toCharArray(); 
		
		for (char myChar : ch) {
			
			String result = myChar+""; 
			
			if (!map.containsKey(result)) {
				
				map.put(result, 1); 
			} else {
				
				map.put(result, map.get(result)+1); 
			}	
		}
		
		return map; 
	}
	
	public static Map<String, Integer> wordLetterCount(String str){
		
		Map<String, Integer> map = new HashMap<>(); 
		
		char [] ch = str.toCharArray(); 
		
		for (char c : ch) {
			
			String result = c+""; 
			
			if (!map.containsKey(result)) {
				map.put(result, 1); 
			} else {
				map.put(result, map.get(result)+1); 
			}
		}
		
		return map; 
		
	}
	
	
	
	public static Map<String, Integer> worCount(String str){
		
		Map<String, Integer> map = new HashMap<>();  
		
		char [] ch = str.toCharArray(); 
		
		for (char c : ch) {
			
			String result = c+""; 
			
			if (!map.containsKey(result)) {
				map.put(result, 1); 
			} else {
				map.put(result, result.length()+1); 
			}
		}
		
		return map;
	}
	
}
