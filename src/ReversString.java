import java.util.*;
public class ReversString {
	
	
	public static void main(String[] args) {
		
		String k = "aiaz"; 
		
		String kRev = ""; 
		for (int idx = k.length()-1; idx >= 0; idx--) {
			
			kRev += k.charAt(idx); 
		}
		
		System.out.println(kRev);
		
		StringBuilder stb = new StringBuilder(k);
		
		stb.reverse(); 
		System.out.println(stb);
		
		char [] ch = k.toCharArray(); 
		
		String rk = ""; 
		
		for (int idx = ch.length-1; idx >= 0; idx--) {
			
			rk += ch[idx]; 
		}
		
		System.out.println(rk);
		
		char [] ch1 = k.toCharArray(); 
		
		List<Object> list = new ArrayList<>(); 
		
		for (char c : ch1) {
			
			list.add(c); 
		}
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		
		
//		String a = revers("khalili"); 
//		System.out.println(a);
		
		int num = calculator(33859385, 3453, '+'); 
		System.out.println(num);
		
	}
	
	public static String revers(String str) {
		
		String rev = ""; 
		
		for (int idx = str.length()-1; idx >= 0; idx--) {
			
			rev += str.charAt(idx); 
		}
			
		return rev; 	
		
	}
	
	
	public static int calculator(int num1, int num2, char ch) {
		
		int result = 0; 
		
		switch (ch) {
		
		case '+': 
			result = num1 + num2; 
			break; 
		case '-': 
			result = num1 - num2; 
			break; 
		case '*': 
			result = num1 * num2; 
			break; 
		case '/': 
			result = num1 / num2; 
			break; 
			default: 
					System.out.println("Operation does not exist");
		
		}
		
		return result; 
	}
	
	
	
	
	
	
		/*
		 * Company Xenture --> Bank of America 
		 * 
		 * BDD --> 
		 * 
		 * 	1. BDD Cucumber & Selenium 
		 *  2. Test Cases, Test Cripts, Test Tools, Selenium Experience 
		 *  3. Test Case --> Excel Sheet, 
		 *  4. Rajush --> (414)-716-1349 office 
		 * 
		 */
	
	
	
	
	
	
	
	
	
}
