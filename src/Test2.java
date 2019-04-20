import java.util.Arrays;

public class Test2 {
	
	
	
	public static void main(String[] args) {
		
		String k1 = "khalili"; 
		System.out.println(k1.substring(1));
		
		
//		String str = unique("fakjfalkjflakjsdflkasjflakjsflskadfjalksfj"); 
//		System.out.println(str);
//		
//		boolean b = isAnagaram("abc", "bac"); 
//		System.out.println(b);
//		
		String st = countChar("aaaabbcccdda"); 
		System.out.println(st);
//		
//		
		String s = "ahmad"; 
		
		StringBuilder stb = new StringBuilder(); 
		stb.append(s); 
		
		stb.reverse(); 
		
		System.out.println(stb);
		
		String k = "akfhlafhlkahflhfshfhhhhhhhhaaaafdadfa"; 
		
		String unique = ""; 
		
		for (int idx = 0; idx < k.length(); idx++) {
			
			if (!unique.contains(k.charAt(idx) + "" )) {
				unique += k.charAt(idx); 
			}
		}
			System.out.println(unique);
	}

	public static String unique(String str) {
	 
	 char [] ch = str.toCharArray(); 
	
	 String result = ""; 
	
		for (int idx = 0; idx < ch.length-1; idx++) {
			
			if (ch[idx] == ch[idx+1]) {	
				continue; 
			}  
				result += ch[idx]; 
		}
		return result; 
	}
	
	
	public static boolean isAnagaram(String str1, String str2) { 
		
		if (str1.length() != str2.length()) {
			return false; 
		}
		
		char [] ch1 = str1.toCharArray(); 
		char [] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int idx = 0; idx < ch1.length; idx++) {
			
			if (ch1[idx] != ch2[idx]) return false; 
			
		}
		return true; 
	}
	
		/*write a method to get string and return as below:
		aaaabbcccdda==> a4b2c3d2a (edited) 
		*/
	
	
		public static String countChar(String str) {
			
			int count = 0; 
			
			String result = ""; 
			
			char [] ch = str.toCharArray(); 
			
			for (int idx = 0; idx < ch.length-1; idx++) {
				
				for (int j = 0; j < ch.length-1; j++) {
					
					if (ch[idx] == ch[j+1] && idx != j) {
						
						count++; 
						
						
					}
					
				}
				result += ch[idx]; 
			}
			
			
			return result+count; 
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
